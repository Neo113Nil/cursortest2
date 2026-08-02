package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0m extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ n0m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0m(n0m n0mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = n0mVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d0m(this.l, continuation, 0);
            case 1:
                return new d0m(this.l, continuation, 1);
            case 2:
                return new d0m(this.l, continuation, 2);
            case 3:
                return new d0m(this.l, continuation, 3);
            case 4:
                return new d0m(this.l, continuation, 4);
            case 5:
                return new d0m(this.l, continuation, 5);
            case 6:
                return new d0m(this.l, continuation, 6);
            case 7:
                return new d0m(this.l, continuation, 7);
            case 8:
                return new d0m(this.l, continuation, 8);
            default:
                return new d0m(this.l, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((d0m) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0198, code lost:
    
        if (r10.emit(r3, r9) == r0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0168, code lost:
    
        if (r10 == r0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if (defpackage.n0m.a(r3, true, r9) == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a2, code lost:
    
        if (r10 == r2) goto L48;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 0;
        n0m n0mVar = this.l;
        Object obj2 = null;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = n0mVar.K;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (j0qVar.emit(unit, this) == nm6Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    yc4 a = n0mVar.r.a();
                    xdr xdrVar = n0mVar.I;
                    v42 v42Var = new v42(n0mVar, z2 ? 1 : 0, 12);
                    this.k = 1;
                    pjc[] pjcVarArr = {a, xdrVar};
                    Object y = tt0.y(qej.a, new l1((Object) v42Var, (Continuation) (z ? 1 : 0), 25), this, wg.s, pjcVarArr);
                    Object obj3 = y;
                    if (y != nm6Var2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 != nm6Var2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == nm6Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    h0m h0mVar = new h0m(n0mVar.E0, i2);
                    this.k = 1;
                    obj = zsd.g0(h0mVar, this);
                    break;
                } else if (i5 == 1) {
                    qgg.h0(obj);
                } else if (i5 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                Iterator it = ((ldc) obj).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((hcc) next).d) {
                            obj2 = next;
                        }
                    }
                }
                hcc hccVar = (hcc) obj2;
                if (hccVar != null) {
                    j0q j0qVar2 = n0mVar.F0;
                    Integer num = new Integer(hccVar.c);
                    this.k = 2;
                    break;
                }
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = n0mVar.X;
                    c0m c0mVar = new c0m(n0mVar, 6);
                    this.k = 1;
                    xdrVar2.collect(new pja(c0mVar, 26), this);
                    break;
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (n0m.a(n0mVar, false, this) == nm6Var5) {
                        break;
                    }
                } else if (i7 != 1) {
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
                    j0q j0qVar3 = n0mVar.G;
                    Unit unit2 = Unit.a;
                    this.k = 1;
                    if (j0qVar3.emit(unit2, this) == nm6Var6) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                xdr xdrVar3 = n0mVar.F;
                nm6 nm6Var7 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    Boolean bool = Boolean.TRUE;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool);
                    vxr vxrVar = n0mVar.q;
                    this.k = 1;
                    obj = vxrVar.a(this);
                    break;
                } else if (i9 == 1) {
                    qgg.h0(obj);
                } else if (i9 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    Boolean bool2 = Boolean.FALSE;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool2);
                    break;
                }
                txr txrVar = (txr) obj;
                if (!Intrinsics.d(txrVar, sxr.a)) {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        break;
                    } else {
                        n0mVar.J();
                    }
                } else {
                    this.k = 2;
                    break;
                }
                Boolean bool22 = Boolean.FALSE;
                xdrVar3.getClass();
                xdrVar3.m(null, bool22);
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar4 = n0mVar.G;
                    Unit unit3 = Unit.a;
                    this.k = 1;
                    if (j0qVar4.emit(unit3, this) == nm6Var8) {
                        break;
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (n0m.a(n0mVar, false, this) == nm6Var9) {
                        break;
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var10 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar5 = n0mVar.J0;
                    String j0 = j66.j0();
                    this.k = 1;
                    if (j0qVar5.emit(j0, this) == nm6Var10) {
                        break;
                    }
                } else if (i12 != 1) {
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
