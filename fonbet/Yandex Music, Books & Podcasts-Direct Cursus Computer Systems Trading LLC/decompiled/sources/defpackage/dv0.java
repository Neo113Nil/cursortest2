package defpackage;

import com.yandex.passport.common.analytics.b;
import com.yandex.passport.common.analytics.e;
import com.yandex.passport.common.analytics.f;
import com.yandex.passport.common.analytics.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class dv0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(rjc rjcVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = 9;
        this.m = rjcVar;
        this.l = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new dv0((iv0) this.m, this.l, continuation, 0);
            case 1:
                return new dv0((bk1) this.m, this.l, continuation, 1);
            case 2:
                return new dv0((l06) this.m, this.l, continuation, 2);
            case 3:
                return new dv0((lwc) this.m, this.l, continuation, 3);
            case 4:
                return new dv0((puf) this.m, this.l, continuation, 4);
            case 5:
                return new dv0((l0g) this.m, this.l, continuation, 5);
            case 6:
                return new dv0((rxo) this.m, this.l, continuation, 6);
            case 7:
                return new dv0(this.l, (fk0) this.m, continuation);
            case 8:
                return new dv0((f) this.m, continuation);
            default:
                return new dv0((rjc) this.m, continuation, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((dv0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
    
        if (defpackage.y2x.o(r4, r9) == r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009d -> B:18:0x005e). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i;
        b bVar;
        b bVar2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    iv0 iv0Var = (iv0) this.m;
                    cv0 cv0Var = new cv0(this.l, 0);
                    this.k = 1;
                    Object h = iv0Var.h(cv0Var, true, this);
                    if (h == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = ((bk1) this.m).n;
                    Integer num = new Integer(this.l);
                    this.k = 1;
                    if (j0qVar.emit(num, this) == nm6Var2) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar2 = ((l06) this.m).n;
                    Integer num2 = new Integer(this.l);
                    this.k = 1;
                    if (j0qVar2.emit(num2, this) == nm6Var3) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                lwc lwcVar = (lwc) this.m;
                x0q x0qVar = lwcVar.d;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    if (!lwcVar.g.get() || ((cjl) lwcVar.a.a.getValue()).b.getValue() == aal.b) {
                        xdr xdrVar = lwcVar.h;
                        do {
                            value = xdrVar.getValue();
                            ((Number) value).intValue();
                        } while (!xdrVar.k(value, new Integer(0)));
                        Unit unit = Unit.a;
                        this.k = 1;
                        if (x0qVar.emit(unit, this) == nm6Var4) {
                        }
                    } else if (this.l % 4 == 0) {
                        Unit unit2 = Unit.a;
                        this.k = 2;
                        if (x0qVar.emit(unit2, this) == nm6Var4) {
                        }
                    } else {
                        x0q x0qVar2 = lwcVar.e;
                        Unit unit3 = Unit.a;
                        this.k = 3;
                        if (x0qVar2.emit(unit3, this) == nm6Var4) {
                        }
                    }
                } else if (i5 != 1 && i5 != 2 && i5 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    luf lufVar = ((puf) this.m).p;
                    int i7 = this.l;
                    this.k = 1;
                    if (lufVar.f(i7, this) == nm6Var5) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    wb7 wb7Var = (wb7) ((l0g) this.m).d.getValue();
                    cv0 cv0Var2 = new cv0(this.l, 2);
                    this.k = 1;
                    if (ec7.c(wb7Var, cv0Var2, this) == nm6Var6) {
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                Object obj2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    two twoVar = ((rxo) this.m).a;
                    int i10 = this.l;
                    act actVar = vxo.b;
                    this.k = 1;
                    Object g = neg.g(twoVar, i10 - twoVar.a.h(), actVar, this);
                    if (g != obj2) {
                        g = Unit.a;
                    }
                    if (g == obj2) {
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 7:
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    long j = (this.l + 1) * 100;
                    this.k = 1;
                    break;
                } else if (i11 == 1) {
                    qgg.h0(obj);
                    fk0 fk0Var = (fk0) this.m;
                    Float f = new Float(1.0f);
                    act S = weo.S(500, 0, nya.a, 2);
                    this.k = 2;
                    if (fk0.c(fk0Var, f, S, null, this, 12) == nm6Var7) {
                    }
                } else if (i11 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    nm6Var7 = null;
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                f fVar = (f) this.m;
                gm5 gm5Var = fVar.c;
                nm6 nm6Var8 = nm6.a;
                int i12 = this.l;
                Continuation continuation = null;
                if (i12 == 0) {
                    qgg.h0(obj);
                    i = 5;
                } else if (i12 == 1) {
                    i = this.k;
                    qgg.h0(obj);
                    bVar = (b) obj;
                    if (bVar != null || bVar.a == null || bVar.b == null) {
                        obj = null;
                    }
                    bVar2 = (b) obj;
                    if (bVar2 == null) {
                        gm5Var.U(bVar2);
                        break;
                    } else {
                        i--;
                        long j2 = g.a;
                        this.k = i;
                        this.l = 2;
                        if (y2x.o(j2, this) == nm6Var8) {
                        }
                    }
                } else if (i12 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i = this.k;
                    qgg.h0(obj);
                }
                if (i <= 0) {
                    gm5Var.U(fVar.c());
                    break;
                } else {
                    this.k = i;
                    this.l = 1;
                    obj = x97.V(((com.yandex.passport.common.coroutine.b) fVar.b).c, new e(fVar, continuation, 1), this);
                    if (obj == nm6Var8) {
                    }
                    bVar = (b) obj;
                    if (bVar != null) {
                    }
                    obj = null;
                    bVar2 = (b) obj;
                    if (bVar2 == null) {
                    }
                }
                break;
            default:
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.m;
                    Integer num3 = new Integer(this.l);
                    this.k = 1;
                    if (rjcVar.emit(num3, this) == nm6Var9) {
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(int i, fk0 fk0Var, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.l = i;
        this.m = fk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(f fVar, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.m = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv0(Object obj, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = obj;
        this.l = i;
    }
}
