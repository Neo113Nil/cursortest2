package B2;

import C2.s;
import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C2536Ef;
import com.google.android.gms.internal.ads.C2987bi;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.InterfaceC3297hN;
import u2.w;

/* loaded from: classes.dex */
public final class e implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3297hN f185b;

    public /* synthetic */ e(InterfaceC3297hN interfaceC3297hN, int i) {
        this.f184a = i;
        this.f185b = interfaceC3297hN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f184a) {
            case 0:
                return new d(((C2987bi) this.f185b).a());
            case 1:
                return new w(((C2987bi) this.f185b).a());
            default:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new s(0, c3360ig, ((C2536Ef) this.f185b).a());
        }
    }
}
