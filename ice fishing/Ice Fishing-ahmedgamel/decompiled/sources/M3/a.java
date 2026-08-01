package M3;

import com.google.android.gms.internal.ads.C2925aa;
import com.google.android.gms.internal.ads.InterfaceC3014c9;
import com.google.android.gms.internal.ads.O9;
import com.google.android.gms.internal.ads.P9;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2572Gh;
import com.google.android.gms.internal.ads.Z9;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3014c9 {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1866n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1867u;

    public /* synthetic */ a(int i, boolean z3) {
        this.f1866n = z3;
        this.f1867u = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014c9
    public void b(Z9 z9) {
        int i = ViewTreeObserverOnGlobalLayoutListenerC2572Gh.f25049I0;
        O9 B9 = P9.B();
        boolean A9 = ((P9) B9.f27721u).A();
        boolean z3 = this.f1866n;
        if (A9 != z3) {
            B9.h();
            ((P9) B9.f27721u).C(z3);
        }
        B9.h();
        ((P9) B9.f27721u).D(this.f1867u);
        P9 p9 = (P9) B9.j();
        z9.h();
        ((C2925aa) z9.f27721u).J(p9);
    }

    public /* synthetic */ a(boolean z3, F.d dVar) {
        this.f1866n = z3;
        this.f1867u = dVar.f854b;
    }
}
