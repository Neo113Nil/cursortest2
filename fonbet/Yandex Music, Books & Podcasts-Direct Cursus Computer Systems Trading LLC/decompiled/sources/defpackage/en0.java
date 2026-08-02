package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class en0 extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public float l;
    public final /* synthetic */ Object m;
    public Object n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(um0 um0Var, fk0 fk0Var, float f, act actVar, Continuation continuation) {
        super(2, continuation);
        this.n = um0Var;
        this.o = fk0Var;
        this.l = f;
        this.m = actVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new en0((um0) this.n, (fk0) this.o, this.l, (act) this.m, continuation);
            case 1:
                en0 en0Var = new en0(this.l, (act) this.m, (uqn) this.o, continuation);
                en0Var.n = obj;
                return en0Var;
            case 2:
                en0 en0Var2 = new en0((ja0) this.o, (mm6) this.m, continuation);
                en0Var2.n = obj;
                return en0Var2;
            case 3:
                en0 en0Var3 = new en0(this.l, (tm0) this.o, (uqn) this.m, continuation);
                en0Var3.n = obj;
                return en0Var3;
            case 4:
                en0 en0Var4 = new en0((nvr) this.o, this.l, (tm0) this.m, continuation);
                en0Var4.n = obj;
                return en0Var4;
            default:
                en0 en0Var5 = new en0((lyv) this.m, continuation);
                en0Var5.o = obj;
                return en0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((en0) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((en0) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((en0) create((pjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((en0) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((en0) create((fa0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((en0) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fk0 fk0Var;
        Float f;
        act actVar;
        float f2;
        float f3;
        yyv yyvVar;
        switch (this.j) {
            case 0:
                float f4 = this.l;
                fk0 fk0Var2 = (fk0) this.o;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            fk0Var = (fk0) this.o;
                            f = new Float(f4);
                            actVar = (act) this.m;
                            this.k = 4;
                            if (fk0.c(fk0Var, f, actVar, null, this, 12) == nm6Var) {
                                return nm6Var;
                            }
                            return Unit.a;
                        }
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                qgg.h0(obj);
                int ordinal = ((um0) this.n).ordinal();
                if (ordinal == 0) {
                    Float f5 = new Float(f4);
                    this.k = 1;
                    if (fk0Var2.f(f5, this) == nm6Var) {
                        return nm6Var;
                    }
                } else if (ordinal == 1) {
                    Float f6 = new Float(0.0f);
                    this.k = 3;
                    if (fk0Var2.f(f6, this) == nm6Var) {
                        return nm6Var;
                    }
                    fk0Var = (fk0) this.o;
                    f = new Float(f4);
                    actVar = (act) this.m;
                    this.k = 4;
                    if (fk0.c(fk0Var, f, actVar, null, this, 12) == nm6Var) {
                    }
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    Float f7 = new Float(0.0f);
                    this.k = 2;
                    if (fk0Var2.f(f7, this) == nm6Var) {
                        return nm6Var;
                    }
                }
                return Unit.a;
            case 1:
                rwo rwoVar = (rwo) this.n;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    float f8 = this.l;
                    act actVar2 = (act) this.m;
                    tk0 tk0Var = new tk0(1, (uqn) this.o, rwoVar);
                    this.n = null;
                    this.k = 1;
                    if (v5g.p(0.0f, f8, actVar2, tk0Var, this, 4) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                ja0 ja0Var = (ja0) this.o;
                pjc pjcVar = (pjc) this.n;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                Continuation continuation = null;
                try {
                    if (i3 == 0) {
                        qgg.h0(obj);
                        float d = ja0Var.c().d(lf3.a);
                        djl djlVar = new djl(ja0Var, d, 0);
                        this.n = null;
                        this.l = d;
                        this.k = 1;
                        if (pjcVar.collect(djlVar, this) == nm6Var3) {
                            return nm6Var3;
                        }
                        f2 = d;
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f2 = this.l;
                        qgg.h0(obj);
                    }
                    lf3 lf3Var = lf3.a;
                    this.n = null;
                    this.l = f2;
                    this.k = 2;
                    if (a.i(ja0Var, lf3Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                    return Unit.a;
                } catch (CancellationException e) {
                    x97.y((mm6) this.m, null, null, new ejl(ja0Var, continuation, 0), 3);
                    throw e;
                }
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    rwo rwoVar2 = (rwo) this.n;
                    float f9 = this.l;
                    tm0 tm0Var = (tm0) this.o;
                    qtf qtfVar = new qtf(12, (uqn) this.m, rwoVar2);
                    this.k = 1;
                    if (v5g.p(0.0f, f9, tm0Var, qtfVar, this, 4) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                float f10 = this.l;
                nvr nvrVar = (nvr) this.o;
                x6k x6kVar = nvrVar.d;
                x6k x6kVar2 = nvrVar.h;
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        qgg.h0(obj);
                        fa0 fa0Var = (fa0) this.n;
                        uqn uqnVar = new uqn();
                        uqnVar.a = nvrVar.g.e();
                        x6kVar2.setValue(new Float(f10));
                        x6kVar.setValue(Boolean.TRUE);
                        fk0 a = vq2.a(uqnVar.a);
                        Float f11 = new Float(f10);
                        tm0 tm0Var2 = (tm0) this.m;
                        gcp gcpVar = new gcp(11, fa0Var, uqnVar);
                        this.k = 1;
                        if (fk0.c(a, f11, tm0Var2, gcpVar, this, 4) == nm6Var5) {
                            return nm6Var5;
                        }
                    } else {
                        if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    x6kVar2.setValue(null);
                    x6kVar.setValue(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th) {
                    x6kVar2.setValue(null);
                    x6kVar.setValue(Boolean.FALSE);
                    throw th;
                }
            default:
                lyv lyvVar = (lyv) this.m;
                rxv rxvVar = lyvVar.a;
                Pair pair = (Pair) this.o;
                Object obj2 = nm6.a;
                int i6 = this.k;
                Continuation continuation2 = null;
                if (i6 == 0) {
                    qgg.h0(obj);
                    yyv yyvVar2 = (yyv) pair.a;
                    yyv yyvVar3 = (yyv) pair.b;
                    if (Intrinsics.d(yyvVar3.b, yyvVar2.b)) {
                        return yyvVar3;
                    }
                    rxvVar.D.setValue(Boolean.TRUE);
                    float e2 = 300 * rxvVar.i.e();
                    act S = weo.S((int) e2, 0, lya.b, 2);
                    this.o = null;
                    this.n = yyvVar3;
                    this.l = e2;
                    this.k = 1;
                    Object l = rxv.l(rxvVar, rxvVar.u, null, new meh(rxvVar, 0.0f, S, continuation2, 0), this, 3);
                    if (l != obj2) {
                        l = Unit.a;
                    }
                    if (l == obj2) {
                        return obj2;
                    }
                    f3 = e2;
                    yyvVar = yyvVar3;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yyv yyvVar4 = (yyv) this.n;
                        qgg.h0(obj);
                        return yyvVar4;
                    }
                    f3 = this.l;
                    yyvVar = (yyv) this.n;
                    qgg.h0(obj);
                }
                syv O = ((j1w) ((cyv) lyvVar.b.b.b).c.a).a.O();
                if (!O.j) {
                    ((lhs) O.c.getValue()).d();
                }
                this.o = null;
                this.n = yyvVar;
                this.l = f3;
                this.k = 2;
                return rxv.c(rxvVar, this) == obj2 ? obj2 : yyvVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(float f, act actVar, uqn uqnVar, Continuation continuation) {
        super(2, continuation);
        this.l = f;
        this.m = actVar;
        this.o = uqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(ja0 ja0Var, mm6 mm6Var, Continuation continuation) {
        super(2, continuation);
        this.o = ja0Var;
        this.m = mm6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(float f, tm0 tm0Var, uqn uqnVar, Continuation continuation) {
        super(2, continuation);
        this.l = f;
        this.o = tm0Var;
        this.m = uqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(nvr nvrVar, float f, tm0 tm0Var, Continuation continuation) {
        super(2, continuation);
        this.o = nvrVar;
        this.l = f;
        this.m = tm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(lyv lyvVar, Continuation continuation) {
        super(2, continuation);
        this.m = lyvVar;
    }
}
