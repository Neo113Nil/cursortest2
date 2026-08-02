package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v00 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e10 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v00(e10 e10Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = e10Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new v00(this.l, continuation, 0);
            case 1:
                return new v00(this.l, continuation, 1);
            case 2:
                return new v00(this.l, continuation, 2);
            case 3:
                return new v00(this.l, continuation, 3);
            case 4:
                return new v00(this.l, continuation, 4);
            case 5:
                return new v00(this.l, continuation, 5);
            case 6:
                return new v00(this.l, continuation, 6);
            case 7:
                return new v00(this.l, continuation, 7);
            default:
                return new v00(this.l, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((v00) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (e10.a(this.l, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    e10 e10Var = this.l;
                    String str = e10Var.n;
                    this.k = 1;
                    if (e10.G(e10Var, str, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    e10 e10Var2 = this.l;
                    String str2 = e10Var2.n;
                    this.k = 1;
                    if (e10.K(e10Var2, str2, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = this.l.X;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (j0qVar.emit(unit, this) == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar2 = this.l.Y;
                    Unit unit2 = Unit.a;
                    this.k = 1;
                    if (j0qVar2.emit(unit2, this) == nm6Var5) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                e10 e10Var3 = this.l;
                xdr xdrVar = e10Var3.L;
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    e10Var3.B0.clear();
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    vxr vxrVar = e10Var3.r;
                    this.k = 1;
                    obj = vxrVar.a(this);
                    if (obj == nm6Var6) {
                    }
                } else if (i6 == 1) {
                    qgg.h0(obj);
                } else if (i6 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    Boolean bool2 = Boolean.FALSE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool2);
                    break;
                }
                txr txrVar = (txr) obj;
                if (!Intrinsics.d(txrVar, sxr.a)) {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        break;
                    } else {
                        e10Var3.M();
                    }
                } else {
                    this.k = 2;
                    if (e10.a(e10Var3, this) == nm6Var6) {
                    }
                }
                Boolean bool22 = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool22);
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (e10.a(this.l, this) == nm6Var7) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar3 = this.l.X;
                    Unit unit3 = Unit.a;
                    this.k = 1;
                    if (j0qVar3.emit(unit3, this) == nm6Var8) {
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar4 = this.l.D0;
                    String j0 = j66.j0();
                    this.k = 1;
                    if (j0qVar4.emit(j0, this) == nm6Var9) {
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
