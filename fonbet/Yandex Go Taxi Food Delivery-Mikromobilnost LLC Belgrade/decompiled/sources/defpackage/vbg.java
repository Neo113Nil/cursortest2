package defpackage;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.data.a;
import com.yandex.messaging.data.e;

/* loaded from: classes15.dex */
public final class vbg implements j9b {
    public final o1b0 a;
    public final ccg b;

    public vbg(ccg ccgVar, o1b0 o1b0Var) {
        this.b = ccgVar;
        this.a = o1b0Var;
    }

    @Override // defpackage.j9b
    public final du10 a() {
        naz0 i = i();
        vcz0 b = b();
        naz0 i2 = i();
        vbb vbbVar = this.b.a;
        at2 w = vbbVar.w();
        q5z.h(w);
        oy80 oy80Var = new oy80(15, i2, w);
        k020 L = vbbVar.L();
        q5z.h(L);
        MessengerEnvironment M = vbbVar.M();
        q5z.h(M);
        p220 G = vbbVar.G();
        q5z.h(G);
        q220 H = vbbVar.H();
        q5z.h(H);
        MessengerEnvironment M2 = vbbVar.M();
        q5z.h(M2);
        r1s r1sVar = new r1s(18, G, H, M2);
        lqo C = vbbVar.C();
        v0b e = e();
        a aVar = (a) ((p8g) vbbVar.b).Q1.get();
        q5z.h(aVar);
        izy0 izy0Var = new izy0((com.yandex.messaging.internal.backendconfig.a) ((p8g) vbbVar.b).t0.get());
        e eVar = (e) ((z8g) vbbVar.a).f0.get();
        q5z.h(eVar);
        tyf0 tyf0Var = (tyf0) ((z8g) vbbVar.a).y0.get();
        q5z.h(tyf0Var);
        return new du10(i, b, oy80Var, L, M, r1sVar, C, e, aVar, izy0Var, eVar, tyf0Var);
    }

    @Override // defpackage.j9b
    public final vcz0 b() {
        vbb vbbVar = this.b.a;
        at2 w = vbbVar.w();
        q5z.h(w);
        k020 L = vbbVar.L();
        q5z.h(L);
        Moshi N = vbbVar.N();
        q5z.h(N);
        return new vcz0(this.a, w, L, N);
    }

    @Override // defpackage.j9b
    public final p150 c() {
        ccg ccgVar = this.b;
        vbb vbbVar = ccgVar.a;
        Context A = vbbVar.A();
        at2 w = vbbVar.w();
        q5z.h(w);
        at2 w2 = vbbVar.w();
        q5z.h(w2);
        return new p150(A, this.a, w, new oeb(w2), ((p8g) vbbVar.b).h(), ((p8g) vbbVar.b).l(), i5m.a(ccgVar.V));
    }

    @Override // defpackage.j9b
    public final ebb d() {
        vbb vbbVar = this.b.a;
        k020 L = vbbVar.L();
        q5z.h(L);
        at2 w = vbbVar.w();
        q5z.h(w);
        ui20 ui20Var = new ui20();
        fbb fbbVar = (fbb) ((z8g) vbbVar.a).h0.get();
        q5z.h(fbbVar);
        return new ebb(L, w, this.a, ui20Var, fbbVar);
    }

    @Override // defpackage.j9b
    public final v0b e() {
        wf4 wf4Var = (wf4) ((p8g) this.b.a.b).s0.get();
        q5z.h(wf4Var);
        return new v0b(this.a, wf4Var);
    }

    @Override // defpackage.j9b
    public final r1s f() {
        at2 w = this.b.a.w();
        q5z.h(w);
        return new r1s(17, w, c(), i());
    }

    @Override // defpackage.j9b
    public final ymu g() {
        naz0 i = i();
        k020 L = this.b.a.L();
        q5z.h(L);
        return new ymu(7, i, L);
    }

    @Override // defpackage.j9b
    public final o1b0 h() {
        return this.a;
    }

    public final naz0 i() {
        vbb vbbVar = this.b.a;
        at2 w = vbbVar.w();
        q5z.h(w);
        k020 L = vbbVar.L();
        q5z.h(L);
        return new naz0(this.a, w, L, vbbVar.C());
    }
}
