package C2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2783So;
import com.google.android.gms.internal.ads.C2987bi;
import com.google.android.gms.internal.ads.C3100dp;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.InterfaceC3297hN;
import v2.C5110a;

/* loaded from: classes.dex */
public final class r implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f401a;

    /* renamed from: b, reason: collision with root package name */
    public final C2987bi f402b;

    /* renamed from: c, reason: collision with root package name */
    public final C2987bi f403c;

    public /* synthetic */ r(C2987bi c2987bi, C2987bi c2987bi2, int i) {
        this.f401a = i;
        this.f402b = c2987bi;
        this.f403c = c2987bi2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        C2987bi c2987bi = this.f403c;
        C2987bi c2987bi2 = this.f402b;
        switch (this.f401a) {
            case 0:
                Context a9 = c2987bi2.a();
                C3301ha c3301ha = AbstractC3569ma.f32192a;
                return new C0269b(a9, q2.r.f40207e.f40208a.B(), c2987bi.b());
            case 1:
                return new C2783So(c2987bi2.a(), c2987bi.b());
            default:
                Context a10 = c2987bi2.a();
                C5110a b9 = c2987bi.b();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3100dp(a10, b9, c3360ig);
        }
    }
}
