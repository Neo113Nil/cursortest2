package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vz4 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ yz4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz4(yz4 yz4Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = yz4Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vz4(this.l, continuation, 0);
            case 1:
                return new vz4(this.l, continuation, 1);
            case 2:
                return new vz4(this.l, continuation, 2);
            case 3:
                return new vz4(this.l, continuation, 3);
            case 4:
                return new vz4(this.l, continuation, 4);
            case 5:
                return new vz4(this.l, continuation, 5);
            case 6:
                return new vz4(this.l, continuation, 6);
            default:
                return new vz4(this.l, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((vz4) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x020f, code lost:
    
        if (r10.emit(r4, r9) == r7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ec, code lost:
    
        if (r10 == r7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (defpackage.yz4.a(r0, r10, true, r9) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c9, code lost:
    
        if (r10.emit(r1, r9) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        if (r10 == r3) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = 0;
        Object[] objArr = 0;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    xiu xiuVar = this.l.k.a;
                    this.k = 1;
                    Object b = ((cjf) xiuVar.b).b(false, this);
                    if (b != nm6Var) {
                        b = Unit.a;
                    }
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                yz4 yz4Var = this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    yz4.G();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(y18.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    b9s[] b9sVarArr = d9s.a;
                    if (d9s.a(b9s.g)) {
                        jp1 jp1Var = (jp1) yz4Var.n.getValue();
                        this.k = 1;
                        obj = jp1Var.a(this);
                        break;
                    }
                    return Unit.a;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    jp1 jp1Var2 = (jp1) yz4Var.n.getValue();
                    x97.y(jp1Var2.b, null, null, new fp1(jp1Var2, objArr == true ? 1 : 0, i), 3);
                    return Unit.a;
                }
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue() && ((z66) yz4Var.l.getValue()).f()) {
                    j0q j0qVar = yz4Var.A;
                    Unit unit = Unit.a;
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    yz4 yz4Var2 = this.l;
                    wpq wpqVar = wpq.b;
                    this.k = 1;
                    if (yz4Var2.H(this, wpqVar, false) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    yz4 yz4Var3 = this.l;
                    wpq wpqVar2 = wpq.a;
                    this.k = 1;
                    if (yz4Var3.H(this, wpqVar2, false) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                yz4 yz4Var4 = this.l;
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    List list = (List) ((xdr) yz4Var4.s.f).getValue();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (i < 0) {
                                    u75.n();
                                    throw null;
                                }
                                String str = ((rnq) next).a().a().b;
                                mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                                if (!Intrinsics.d(str, "COLLECTION_FAVOURITE_ARTISTS")) {
                                    i++;
                                }
                            } else {
                                i = -1;
                            }
                        }
                        Integer num = new Integer(i);
                        Integer num2 = num.intValue() != -1 ? num : null;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            j0q j0qVar2 = yz4Var4.v;
                            Integer num3 = new Integer(intValue);
                            this.k = 1;
                            if (j0qVar2.emit(num3, this) == nm6Var5) {
                                return nm6Var5;
                            }
                        }
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                yz4 yz4Var5 = this.l;
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = yz4Var5.x;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    vxr vxrVar = (vxr) yz4Var5.m.getValue();
                    this.k = 1;
                    obj = vxrVar.a(this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2 && i7 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xdr xdrVar2 = yz4Var5.x;
                        Boolean bool2 = Boolean.FALSE;
                        xdrVar2.getClass();
                        xdrVar2.m(null, bool2);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                txr txrVar = (txr) obj;
                if (Intrinsics.d(txrVar, sxr.a)) {
                    wpq wpqVar3 = wpq.a;
                    this.k = 2;
                    break;
                } else {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar3 = yz4Var5.y;
                    String j0 = j66.j0();
                    this.k = 3;
                    break;
                }
            case 6:
                yz4 yz4Var6 = this.l;
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    if (((z66) yz4Var6.l.getValue()).f()) {
                        wpq wpqVar4 = wpq.a;
                        this.k = 1;
                        if (yz4.a(yz4Var6, wpqVar4, true, this) == nm6Var7) {
                            return nm6Var7;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar4 = this.l.v;
                    Integer num4 = new Integer(0);
                    this.k = 1;
                    if (j0qVar4.emit(num4, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
