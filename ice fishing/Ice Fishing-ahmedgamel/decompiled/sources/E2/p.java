package E2;

import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2556Ef;
import com.google.android.gms.internal.ads.C2681Ll;
import com.google.android.gms.internal.ads.C2747Pj;
import com.google.android.gms.internal.ads.C3266gN;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.InterfaceC3320hN;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.Ju;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.T8;
import i1.C4585b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final C3266gN f856a;

    /* renamed from: b, reason: collision with root package name */
    public final D2.e f857b;

    /* renamed from: c, reason: collision with root package name */
    public final C2747Pj f858c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f859d;

    public p(C3266gN c3266gN, D2.e eVar, C2747Pj c2747Pj, C3266gN c3266gN2) {
        this.f856a = c3266gN;
        this.f857b = eVar;
        this.f858c = c2747Pj;
        this.f859d = c3266gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        Lu lu = (Lu) this.f856a.f();
        D2.e eVar = this.f857b;
        eVar.getClass();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        r rVar = new r(0, c3383ig, ((C2556Ef) eVar.f604b).a());
        G3.j a9 = this.f858c.a();
        C2681Ll c2681Ll = (C2681Ll) this.f859d.f();
        T8 j6 = lu.a(a9.d(), Ju.GENERATE_SIGNALS).j(rVar);
        long intValue = ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32756A6)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Iu s9 = j6.r(intValue).s();
        s9.a(new LD(0, s9, new C4585b(6, c2681Ll)), c3383ig);
        return s9;
    }
}
