package androidx.emoji2.text;

import C2.N;
import D.RunnableC0282a;
import D.y;
import L3.F;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: A, reason: collision with root package name */
    public t8.g f4787A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f4788n;

    /* renamed from: u, reason: collision with root package name */
    public final N f4789u;

    /* renamed from: v, reason: collision with root package name */
    public final a4.e f4790v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f4791w;

    /* renamed from: x, reason: collision with root package name */
    public Handler f4792x;

    /* renamed from: y, reason: collision with root package name */
    public ThreadPoolExecutor f4793y;

    /* renamed from: z, reason: collision with root package name */
    public ThreadPoolExecutor f4794z;

    public p(Context context, N n9) {
        a4.e eVar = q.f4795d;
        this.f4791w = new Object();
        F.f(context, "Context cannot be null");
        this.f4788n = context.getApplicationContext();
        this.f4789u = n9;
        this.f4790v = eVar;
    }

    @Override // androidx.emoji2.text.i
    public final void a(t8.g gVar) {
        synchronized (this.f4791w) {
            this.f4787A = gVar;
        }
        synchronized (this.f4791w) {
            try {
                if (this.f4787A == null) {
                    return;
                }
                if (this.f4793y == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4794z = threadPoolExecutor;
                    this.f4793y = threadPoolExecutor;
                }
                this.f4793y.execute(new RunnableC0282a(12, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f4791w) {
            try {
                this.f4787A = null;
                Handler handler = this.f4792x;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4792x = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4794z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4793y = null;
                this.f4794z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final L.h c() {
        try {
            a4.e eVar = this.f4790v;
            Context context = this.f4788n;
            N n9 = this.f4789u;
            eVar.getClass();
            G1.a a9 = L.c.a(context, n9);
            int i = a9.f1050u;
            if (i != 0) {
                throw new RuntimeException(y.k(i, "fetchFonts failed (", ")"));
            }
            L.h[] hVarArr = (L.h[]) a9.f1051v;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e9) {
            throw new RuntimeException("provider not found", e9);
        }
    }
}
