package D2;

import E2.r;
import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.C2556Ef;
import com.google.android.gms.internal.ads.C3010bi;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.InterfaceC3320hN;
import w2.w;

/* loaded from: classes.dex */
public final class e implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f603a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3320hN f604b;

    public /* synthetic */ e(InterfaceC3320hN interfaceC3320hN, int i) {
        this.f603a = i;
        this.f604b = interfaceC3320hN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f603a) {
            case 0:
                return new d(((C3010bi) this.f604b).a());
            case 1:
                return new w(((C3010bi) this.f604b).a());
            default:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new r(0, c3383ig, ((C2556Ef) this.f604b).a());
        }
    }
}
