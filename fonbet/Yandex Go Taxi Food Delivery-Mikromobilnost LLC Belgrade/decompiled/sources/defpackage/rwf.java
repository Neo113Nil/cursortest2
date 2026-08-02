package defpackage;

import com.yandex.payment.sdk.flex.api.models.FlexAction;

/* loaded from: classes2.dex */
public final class rwf {
    public final pwf a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final c0j f;
    public final xvf0 g;
    public final t160 h;
    public final oto0 i;
    public final wun0 j;
    public final m7q0 k;
    public final njp l;
    public final ei00 m;
    public final s90 n;
    public final ubq0 o;

    public rwf(pwf pwfVar, kzu0 kzu0Var, pkr pkrVar) {
        this.a = pwfVar;
        this.b = i5m.b(new b55(19, pkrVar));
        this.c = i5m.b(new k0n(pkrVar, pwfVar.i, pwfVar.b));
        this.d = i5m.b(new b55(18, pkrVar));
        xvf0 b = i5m.b(new rs0(pkrVar, pwfVar.b, pwfVar.i, pwfVar.B, pwfVar.m, pwfVar.l, 26));
        this.e = b;
        this.f = new c0j(this.c, this.d, i5m.b(new njp(pkrVar, b, 12)), pwfVar.i, 5);
        xvf0 b2 = i5m.b(new fhm0(1, kzu0Var));
        this.g = b2;
        int i = 11;
        this.h = new t160(b2, i);
        xvf0 xvf0Var = pwfVar.i;
        this.i = new oto0(b2, xvf0Var, 27);
        this.j = new wun0(pwfVar.D, pwfVar.E, pwfVar.f, 21);
        this.k = new m7q0(xvf0Var, 4);
        this.l = new njp(b2, 8);
        int i2 = ei00.b;
        di00 di00Var = new di00(11);
        di00Var.Eg(FlexAction.FT_REQUEST_ACTION, this.f);
        di00Var.Eg(FlexAction.OPEN_WEB, this.h);
        di00Var.Eg(FlexAction.SHOW_NATIVE_SCREEN, this.i);
        di00Var.Eg(FlexAction.SEND_EXTERNAL_EVENT, this.j);
        di00Var.Eg(FlexAction.SEND_ANALYTICS_EVENT, this.k);
        di00Var.Eg(FlexAction.DELAY, xph.a);
        di00Var.Eg(FlexAction.TRANSPORT_READ_CARD, pwfVar.H);
        di00Var.Eg(FlexAction.TRANSPORT_FINISH_NFC, pwfVar.I);
        di00Var.Eg(FlexAction.TRANSPORT_READ_BLOCKS, pwfVar.J);
        di00Var.Eg(FlexAction.TRANSPORT_WRITE_BLOCKS, pwfVar.K);
        di00Var.Eg(FlexAction.FINISH_FLOW, this.l);
        this.m = di00Var.Hg();
        this.n = new s90(pwfVar.i, pwfVar.o, pwfVar.b, 21);
        this.o = new ubq0(this.b, this.m, pwfVar.i, this.n, pwfVar.F, i5m.b(new gc(pkrVar, pwfVar.m, pwfVar.r, pwfVar.B, pwfVar.i, pwfVar.d, this.e, pwfVar.b, i5m.b(jzy.a), 16)), new njp(pkrVar, pwfVar.b, i), 7, false);
    }
}
