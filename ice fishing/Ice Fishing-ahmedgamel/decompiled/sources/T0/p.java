package T0;

import Q2.A;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.LD;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final String f3138z = J0.r.f("WorkForegroundRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final U0.k f3139n = new U0.k();

    /* renamed from: u, reason: collision with root package name */
    public final Context f3140u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.p f3141v;

    /* renamed from: w, reason: collision with root package name */
    public final J0.q f3142w;

    /* renamed from: x, reason: collision with root package name */
    public final q f3143x;

    /* renamed from: y, reason: collision with root package name */
    public final b3.e f3144y;

    public p(Context context, S0.p pVar, J0.q qVar, q qVar2, b3.e eVar) {
        this.f3140u = context;
        this.f3141v = pVar;
        this.f3142w = qVar;
        this.f3143x = qVar2;
        this.f3144y = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3141v.f2952q || Build.VERSION.SDK_INT >= 31) {
            this.f3139n.j(null);
            return;
        }
        U0.k kVar = new U0.k();
        b3.e eVar = this.f3144y;
        ((A) eVar.f5559w).execute(new F.n(6, this, kVar));
        kVar.a(new LD(this, kVar, 24, false), (A) eVar.f5559w);
    }
}
