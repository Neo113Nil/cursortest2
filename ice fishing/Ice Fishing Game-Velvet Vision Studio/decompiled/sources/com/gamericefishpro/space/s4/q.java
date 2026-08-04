package com.gamericefishpro.space.s4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.pi.x1;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements j {
    public final Context a;
    public final com.gamericefishpro.space.z3.c b;
    public final a0 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public d5 h;

    public q(Context context, com.gamericefishpro.space.z3.c cVar) {
        a4.p(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = cVar;
        this.c = r.d;
    }

    public final void a() {
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

    @Override // com.gamericefishpro.space.s4.j
    public final void b(d5 d5Var) {
        synchronized (this.d) {
            this.h = d5Var;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new x1("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new com.appsflyer.a(18, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.gamericefishpro.space.z3.h c() {
        try {
            a0 a0Var = this.c;
            Context context = this.a;
            com.gamericefishpro.space.z3.c cVar = this.b;
            a0Var.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            com.gamericefishpro.space.g0.r rVarA = com.gamericefishpro.space.z3.b.a(context, Collections.unmodifiableList(arrayList));
            int i = rVarA.a;
            if (i != 0) {
                throw new RuntimeException(y0.f(i, "fetchFonts failed (", ")"));
            }
            com.gamericefishpro.space.z3.h[] hVarArr = (com.gamericefishpro.space.z3.h[]) rVarA.b.get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
