package C2;

import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2536Ef;
import com.google.android.gms.internal.ads.C2644Kl;
import com.google.android.gms.internal.ads.C2727Pj;
import com.google.android.gms.internal.ads.C3243gN;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.InterfaceC3297hN;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.Ju;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.T8;
import g1.C4523c;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final C3243gN f397a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.e f398b;

    /* renamed from: c, reason: collision with root package name */
    public final C2727Pj f399c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f400d;

    public q(C3243gN c3243gN, B2.e eVar, C2727Pj c2727Pj, C3243gN c3243gN2) {
        this.f397a = c3243gN;
        this.f398b = eVar;
        this.f399c = c2727Pj;
        this.f400d = c3243gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        Lu lu = (Lu) this.f397a.f();
        B2.e eVar = this.f398b;
        eVar.getClass();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        s sVar = new s(0, c3360ig, ((C2536Ef) eVar.f185b).a());
        E3.j a9 = this.f399c.a();
        C2644Kl c2644Kl = (C2644Kl) this.f400d.f();
        T8 j6 = lu.a(a9.d(), Ju.GENERATE_SIGNALS).j(sVar);
        long intValue = ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.f31975A6)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Iu s9 = j6.r(intValue).s();
        s9.a(new LD(0, s9, new C4523c(3, c2644Kl)), c3360ig);
        return s9;
    }
}
