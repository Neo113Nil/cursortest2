package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class yr7 {
    public final Context a;
    public final OkHttpClient b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final cr e;
    public List f;
    public String g;
    public Map h;
    public imp i;
    public g06 j;

    public yr7(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, cr crVar, List list) {
        context.getClass();
        okHttpClient.getClass();
        executor.getClass();
        scheduledExecutorService.getClass();
        crVar.getClass();
        list.getClass();
        this.a = context;
        this.b = okHttpClient;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = crVar;
        this.f = list;
    }

    public final zr7 a() {
        List list = this.f;
        String str = this.g;
        Map map = this.h;
        imp impVar = this.i;
        if (impVar == null) {
            impVar = new imp();
        }
        imp impVar2 = impVar;
        g06 g06Var = this.j;
        if (g06Var == null) {
            Object obj = null;
            g06Var = new g06(obj, new ksa(), obj, "AndroidPlayer");
        }
        return new zr7(this.a, this.b, this.c, this.d, this.e, list, str, map, impVar2, g06Var);
    }
}
