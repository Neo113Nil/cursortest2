package A2;

import B2.t;
import com.google.android.gms.internal.ads.AbstractC3137eE;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.C2484Bf;
import com.google.android.gms.internal.ads.C2860Xh;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.InterfaceC4063vN;
import t2.z;

/* loaded from: classes.dex */
public final class e implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4063vN f34b;

    public /* synthetic */ e(InterfaceC4063vN interfaceC4063vN, int i) {
        this.f33a = i;
        this.f34b = interfaceC4063vN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f33a) {
            case 0:
                return new d(((C2860Xh) this.f34b).a());
            case 1:
                return new z(((C2860Xh) this.f34b).a());
            default:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new t(c3157eg, ((C2484Bf) this.f34b).a());
        }
    }
}
