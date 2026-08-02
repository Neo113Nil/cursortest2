package E2;

import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.C2528Cl;
import com.google.android.gms.internal.ads.C3266gN;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.InterfaceC3320hN;

/* loaded from: classes.dex */
public final class o implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f854a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f855b;

    public /* synthetic */ o(C3266gN c3266gN, int i) {
        this.f854a = i;
        this.f855b = c3266gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f854a) {
            case 0:
                K k9 = (K) this.f855b.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2528Cl(k9, c3383ig);
            default:
                return new J((C3391io) this.f855b.f());
        }
    }
}
