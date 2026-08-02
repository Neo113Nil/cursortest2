package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i57 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ y57 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i57(y57 y57Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = y57Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new i57(this.l, continuation, 0);
            case 1:
                return new i57(this.l, continuation, 1);
            case 2:
                return new i57(this.l, continuation, 2);
            case 3:
                return new i57(this.l, continuation, 3);
            case 4:
                return new i57(this.l, continuation, 4);
            case 5:
                return new i57(this.l, continuation, 5);
            case 6:
                return new i57(this.l, continuation, 6);
            case 7:
                return new i57(this.l, continuation, 7);
            case 8:
                return new i57(this.l, continuation, 8);
            case 9:
                return new i57(this.l, continuation, 9);
            case 10:
                return new i57(this.l, continuation, 10);
            case 11:
                return new i57(this.l, continuation, 11);
            case 12:
                return new i57(this.l, continuation, 12);
            case 13:
                return new i57(this.l, continuation, 13);
            default:
                return new i57(this.l, continuation, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 4:
                ((i57) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((i57) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        y57 y57Var;
        Object b;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = this.l.B;
                    ncp ncpVar = new ncp();
                    this.k = 1;
                    if (x0qVar.emit(ncpVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    y57 y57Var2 = this.l;
                    pjc pjcVar = y57Var2.x;
                    k57 k57Var = new k57(y57Var2, 0);
                    this.k = 1;
                    if (pjcVar.collect(k57Var, this) == nm6Var2) {
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
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    y57 y57Var3 = this.l;
                    g8c g8cVar = y57Var3.l;
                    g8cVar.getClass();
                    ss3 I = zsd.I(new fzb(g8cVar, (Continuation) null, 3));
                    k57 k57Var2 = new k57(y57Var3, 1);
                    this.k = 1;
                    if (I.collect(k57Var2, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                y57 y57Var4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ljj ljjVar = y57Var4.t;
                    this.k = 1;
                    a = ljjVar.a(this);
                    if (a == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                k57 k57Var3 = new k57(y57Var4, 2);
                this.k = 2;
                if (((pjc) a).collect(k57Var3, this) == nm6Var4) {
                    return nm6Var4;
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                y57 y57Var5 = this.l;
                x0q x0qVar2 = y57Var5.L;
                k57 k57Var4 = new k57(y57Var5, 3);
                this.k = 1;
                x0qVar2.collect(k57Var4, this);
                return nm6Var5;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y57.J(this.l, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                y57 y57Var6 = this.l;
                if (i7 == 0) {
                    qgg.h0(obj);
                    y57Var = y57Var6;
                    xgd xgdVar = new xgd(y57Var6.B0, y57Var6.Y, y57Var6.A0, new mt4(1, y57Var6, y57.class, "setMethods", "setMethods(Ljava/util/List;)V", 0, 29), new o57(1, y57Var6, y57.class, "selectPaymentMethod", "selectPaymentMethod(I)V", 0, 0), new ej6(0, y57Var6, y57.class, "getSelectedIndex", "getSelectedIndex()Ljava/lang/Integer;", 0, 15), new p57(y57Var6, 0), new p57(y57Var6, 1));
                    rjj rjjVar = y57Var.u;
                    ot0.F(y57Var);
                    x0q x0qVar3 = y57Var.L;
                    this.k = 1;
                    b = rjjVar.b(x0qVar3, xgdVar, this);
                    if (b == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                    y57Var = y57Var6;
                }
                k57 k57Var5 = new k57(y57Var, 4);
                this.k = 2;
                if (((pjc) b).collect(k57Var5, this) == nm6Var7) {
                    return nm6Var7;
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = this.l.A;
                    this.k = 1;
                    if (zi3Var.m(yhe.a, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var2 = this.l.A;
                    this.k = 1;
                    if (zi3Var2.m(yhe.a, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                zi3 zi3Var3 = this.l.A;
                nm6 nm6Var10 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (zi3Var3.m(zhe.a, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.k = 2;
                if (zi3Var3.m(yhe.a, this) == nm6Var10) {
                    return nm6Var10;
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar4 = this.l.B;
                    ncp ncpVar2 = new ncp();
                    this.k = 1;
                    if (x0qVar4.emit(ncpVar2, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    jst jstVar = new jst();
                    this.k = 1;
                    if (this.l.C(jstVar, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar5 = this.l.B;
                    ocp ocpVar = new ocp(zqo.a, false);
                    this.k = 1;
                    if (x0qVar5.emit(ocpVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar6 = this.l.B;
                    ocp ocpVar2 = new ocp(yqo.a, false);
                    this.k = 1;
                    if (x0qVar6.emit(ocpVar2, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var15 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    y57 y57Var7 = this.l;
                    le3 le3Var = y57Var7.w;
                    le3Var.getClass();
                    ss3 I2 = zsd.I(new vv4(le3Var, (Continuation) null, 27));
                    k57 k57Var6 = new k57(y57Var7, 6);
                    this.k = 1;
                    Object collect = I2.collect(new a56(k57Var6, 4), this);
                    if (collect != nm6.a) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
