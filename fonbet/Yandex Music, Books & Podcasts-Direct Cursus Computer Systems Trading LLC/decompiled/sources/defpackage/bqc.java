package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class bqc implements q3b {
    public final Context a;
    public final aqc b;
    public final e88 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public men h;

    public bqc(Context context, aqc aqcVar) {
        o5g.w(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = aqcVar;
        this.c = cqc.d;
    }

    @Override // defpackage.q3b
    public final void a(men menVar) {
        synchronized (this.d) {
            this.h = menVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new y36("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new sr7(15, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final vqc c() {
        try {
            e88 e88Var = this.c;
            Context context = this.a;
            aqc aqcVar = this.b;
            e88Var.getClass();
            Object[] objArr = {aqcVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            et7 a = zpc.a(context, Collections.unmodifiableList(arrayList));
            int i = a.a;
            if (i != 0) {
                wvs.p(dfi.c(i, "fetchFonts failed (", ")"));
                return null;
            }
            vqc[] vqcVarArr = (vqc[]) a.b.get(0);
            if (vqcVarArr != null && vqcVarArr.length != 0) {
                return vqcVarArr[0];
            }
            wvs.p("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            kac.k("provider not found", e);
            return null;
        }
    }
}
