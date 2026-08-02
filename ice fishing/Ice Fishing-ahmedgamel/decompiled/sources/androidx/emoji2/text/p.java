package androidx.emoji2.text;

import E2.M;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: A, reason: collision with root package name */
    public A8.b f4755A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f4756n;

    /* renamed from: u, reason: collision with root package name */
    public final M f4757u;

    /* renamed from: v, reason: collision with root package name */
    public final G3.e f4758v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f4759w;

    /* renamed from: x, reason: collision with root package name */
    public Handler f4760x;

    /* renamed from: y, reason: collision with root package name */
    public ThreadPoolExecutor f4761y;

    /* renamed from: z, reason: collision with root package name */
    public ThreadPoolExecutor f4762z;

    public p(Context context, M m9) {
        G3.e eVar = q.f4763d;
        this.f4759w = new Object();
        A8.b.e(context, "Context cannot be null");
        this.f4756n = context.getApplicationContext();
        this.f4757u = m9;
        this.f4758v = eVar;
    }

    public final void a() {
        synchronized (this.f4759w) {
            try {
                this.f4755A = null;
                Handler handler = this.f4760x;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4760x = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4762z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4761y = null;
                this.f4762z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final L.h b() {
        try {
            G3.e eVar = this.f4758v;
            Context context = this.f4756n;
            M m9 = this.f4757u;
            eVar.getClass();
            I1.a a9 = L.c.a(context, m9);
            int i = a9.f1303u;
            if (i != 0) {
                throw new RuntimeException(D.x.j(i, "fetchFonts failed (", ")"));
            }
            L.h[] hVarArr = (L.h[]) a9.f1304v;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e9) {
            throw new RuntimeException("provider not found", e9);
        }
    }

    @Override // androidx.emoji2.text.i
    public final void c(A8.b bVar) {
        synchronized (this.f4759w) {
            this.f4755A = bVar;
        }
        synchronized (this.f4759w) {
            try {
                if (this.f4755A == null) {
                    return;
                }
                if (this.f4761y == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4762z = threadPoolExecutor;
                    this.f4761y = threadPoolExecutor;
                }
                this.f4761y.execute(new A3.p(13, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
