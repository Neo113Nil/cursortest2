package C2;

import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C2491Bl;
import com.google.android.gms.internal.ads.C3243gN;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.InterfaceC3297hN;

/* loaded from: classes.dex */
public final class p implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f396b;

    public /* synthetic */ p(C3243gN c3243gN, int i) {
        this.f395a = i;
        this.f396b = c3243gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f395a) {
            case 0:
                L l9 = (L) this.f396b.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2491Bl(l9, c3360ig);
            default:
                return new K((C3315ho) this.f396b.f());
        }
    }
}
