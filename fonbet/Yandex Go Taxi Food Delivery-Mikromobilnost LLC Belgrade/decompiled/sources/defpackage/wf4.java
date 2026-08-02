package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.adjust.sdk.Constants;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class wf4 implements vff0 {
    public final SharedPreferences A;
    public final Handler B;
    public BackendConfig C;
    public x08 D;
    public final x22 a;
    public final h3y b;
    public final Looper c;
    public final Executor w;
    public final w3c x;
    public final wff0 y;
    public final zq60 z = new zq60();

    /* JADX WARN: Multi-variable type inference failed */
    public wf4(h3y h3yVar, Context context, x22 x22Var, h3y h3yVar2, Looper looper, Executor executor, w3c w3cVar, wff0 wff0Var, rz10 rz10Var, gsu gsuVar) {
        this.a = x22Var;
        this.b = h3yVar2;
        this.c = looper;
        this.w = executor;
        this.x = w3cVar;
        this.y = wff0Var;
        boolean z = false;
        Object[] objArr = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("messenger", 0);
        this.A = sharedPreferences;
        this.B = new Handler(looper);
        BackendConfig.INSTANCE.getClass();
        this.C = BackendConfig.Companion.a();
        this.D = wfz.z;
        rz10Var.a.getClass();
        File file = new File(context.getFilesDir(), "messenger_files");
        if (!file.exists()) {
            z83.h(null, file.mkdirs());
        }
        File file2 = new File(file, "config.json");
        if (file2.exists()) {
            executor.execute(new uf4((Object) this, (Object) file2, z, (int) (objArr == true ? 1 : 0)));
        }
        if ((System.currentTimeMillis() - sharedPreferences.getLong("last_config_request_time", 0L)) / 3600000 >= 6) {
            z83.g(null, looper, Looper.myLooper());
            wff0Var.a(this);
            jwu jwuVar = new jwu();
            jwuVar.o(Constants.SCHEME);
            jwuVar.h(gsuVar.a());
            jwuVar.c("config.json", false);
            j0p j0pVar = (j0p) h3yVar.get();
            this.D = new h7b(jwuVar.e().i, j0pVar.a, new m6(11, this), file2);
        }
    }

    public final synchronized BackendConfig a() {
        return this.C;
    }

    @Override // defpackage.vff0
    public final void b() {
        z83.g(null, this.c, Looper.myLooper());
        this.D.cancel();
        this.D = wfz.z;
        this.B.removeCallbacksAndMessages(null);
        this.y.c(this);
    }
}
