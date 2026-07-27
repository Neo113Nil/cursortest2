package T0;

import B2.RunnableC0272f;
import N2.A;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final String f3065z = J0.s.f("WorkForegroundRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final U0.k f3066n = new U0.k();

    /* renamed from: u, reason: collision with root package name */
    public final Context f3067u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.p f3068v;

    /* renamed from: w, reason: collision with root package name */
    public final J0.r f3069w;

    /* renamed from: x, reason: collision with root package name */
    public final r f3070x;

    /* renamed from: y, reason: collision with root package name */
    public final Y2.e f3071y;

    public p(Context context, S0.p pVar, J0.r rVar, r rVar2, Y2.e eVar) {
        this.f3067u = context;
        this.f3068v = pVar;
        this.f3069w = rVar;
        this.f3070x = rVar2;
        this.f3071y = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3068v.f2935q || Build.VERSION.SDK_INT >= 31) {
            this.f3066n.j(null);
            return;
        }
        U0.k kVar = new U0.k();
        Y2.e eVar = this.f3071y;
        ((A) eVar.f3965w).execute(new D5.b(10, this, kVar));
        kVar.c(new RunnableC0272f(this, kVar, 21, false), (A) eVar.f3965w);
    }
}
