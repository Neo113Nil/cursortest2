package B2;

import com.google.android.gms.internal.ads.AbstractC3137eE;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.C2473Al;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.C4009uN;
import com.google.android.gms.internal.ads.InterfaceC4063vN;

/* loaded from: classes.dex */
public final class q implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f293b;

    public /* synthetic */ q(C4009uN c4009uN, int i) {
        this.f292a = i;
        this.f293b = c4009uN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f292a) {
            case 0:
                L l9 = (L) this.f293b.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2473Al(l9, c3157eg);
            default:
                return new K((C3381io) this.f293b.d());
        }
    }
}
