package defpackage;

import androidx.compose.material3.internal.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c90 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c90(Object obj, float f, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c90((ka0) this.m, this.l, continuation, 0);
            case 1:
                return new c90((fvf) this.m, this.l, continuation, 1);
            case 2:
                return new c90((zcq) this.m, this.l, continuation, 2);
            case 3:
                return new c90((d1n) this.m, this.l, continuation, 3);
            case 4:
                return new c90((nvr) this.m, this.l, continuation, 4);
            case 5:
                return new c90((rxv) this.m, this.l, continuation, 5);
            default:
                return new c90((fuw) this.m, this.l, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c90) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object b;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ka0 ka0Var = (ka0) this.m;
                    this.k = 1;
                    if (ka0Var.j(this.l, this) == nm6Var) {
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
                    fvf fvfVar = (fvf) this.m;
                    this.k = 1;
                    if (neg.B(fvfVar, this.l, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    zcq zcqVar = (zcq) this.m;
                    this.k = 1;
                    ia0 ia0Var = zcqVar.b;
                    Object value = ((x6k) ia0Var.g).getValue();
                    float k = ia0Var.k();
                    float f = this.l;
                    Object e = ia0Var.e(k, f, value);
                    if (((Boolean) ((Function1) ia0Var.d).invoke(e)).booleanValue()) {
                        b = a.b(ia0Var, e, f, this);
                        if (b != obj2) {
                            b = Unit.a;
                        }
                    } else {
                        b = a.b(ia0Var, value, f, this);
                        if (b != obj2) {
                            b = Unit.a;
                        }
                    }
                    if (b != obj2) {
                        b = Unit.a;
                    }
                    if (b == obj2) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    d1n d1nVar = (d1n) this.m;
                    mqi mqiVar = d1nVar.i;
                    c1n c1nVar = new c1n(d1nVar, this.l, null);
                    this.k = 1;
                    if (mqiVar.b(hqi.a, c1nVar, this) == nm6Var3) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    nvr nvrVar = (nvr) this.m;
                    this.k = 1;
                    Object collect = nvrVar.j.collect(new djl(nvrVar, this.l, 1), this);
                    if (collect != nm6Var4) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var4) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                rxv rxvVar = (rxv) this.m;
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    long h = enj.h(rxvVar.g(), swf.i(0.0f, this.l / 2));
                    act S = weo.S(0, 0, lya.c, 3);
                    this.k = 1;
                    Object b2 = rxvVar.s.b(hqi.c, new neh(rxvVar, h, S, null, 0), this);
                    if (b2 != nm6Var5) {
                        b2 = Unit.a;
                    }
                    if (b2 == nm6Var5) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = ((fuw) this.m).d;
                    Float f2 = new Float(this.l);
                    this.k = 1;
                    if (fk0Var.f(f2, this) == nm6Var6) {
                    }
                } else if (i7 != 1) {
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
