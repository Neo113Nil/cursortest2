package T0;

import O2.B;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.LD;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final String f3055z = J0.s.f("WorkForegroundRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final U0.k f3056n = new U0.k();

    /* renamed from: u, reason: collision with root package name */
    public final Context f3057u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.p f3058v;

    /* renamed from: w, reason: collision with root package name */
    public final J0.r f3059w;

    /* renamed from: x, reason: collision with root package name */
    public final q f3060x;

    /* renamed from: y, reason: collision with root package name */
    public final Z2.e f3061y;

    public p(Context context, S0.p pVar, J0.r rVar, q qVar, Z2.e eVar) {
        this.f3057u = context;
        this.f3058v = pVar;
        this.f3059w = rVar;
        this.f3060x = qVar;
        this.f3061y = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3058v.f2823q || Build.VERSION.SDK_INT >= 31) {
            this.f3056n.j(null);
            return;
        }
        U0.k kVar = new U0.k();
        Z2.e eVar = this.f3061y;
        ((B) eVar.f4172w).execute(new F.n(10, this, kVar));
        kVar.a(new LD(this, kVar, 25, false), (B) eVar.f4172w);
    }
}
