package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qa3 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ oq c;

    public qa3(rjc rjcVar, dn9 dn9Var, oq oqVar) {
        this.a = 0;
        this.b = rjcVar;
        this.c = oqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        pa3 pa3Var;
        int i;
        mri mriVar;
        int i2;
        nri nriVar;
        int i3;
        switch (this.a) {
            case 0:
                if (continuation instanceof pa3) {
                    pa3Var = (pa3) continuation;
                    int i4 = pa3Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pa3Var.k = i4 - Integer.MIN_VALUE;
                        Object obj2 = pa3Var.j;
                        nm6 nm6Var = nm6.a;
                        i = pa3Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            n7q n7qVar = (n7q) obj;
                            mqs mqsVar = null;
                            if (n7qVar != null) {
                                a0q C = rvf.C(n7qVar.b());
                                if (C == null) {
                                    C = n7qVar.g().getId();
                                }
                                if (up6.A(C, this.c.a)) {
                                    mqsVar = n7qVar.b().a();
                                }
                            }
                            pa3Var.k = 1;
                            if (this.b.emit(mqsVar, pa3Var) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                pa3Var = new pa3(this, continuation);
                Object obj22 = pa3Var.j;
                nm6 nm6Var2 = nm6.a;
                i = pa3Var.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof mri) {
                    mriVar = (mri) continuation;
                    int i5 = mriVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mriVar.k = i5 - Integer.MIN_VALUE;
                        Object obj3 = mriVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = mriVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            d6l x = p6g.x((e6l) obj);
                            lri lriVar = x == null ? lri.a : up6.B(x.a, this.c.a) ? p6g.C(x) ? lri.b : lri.c : lri.a;
                            mriVar.k = 1;
                            if (this.b.emit(lriVar, mriVar) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                mriVar = new mri(this, continuation);
                Object obj32 = mriVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = mriVar.k;
                if (i2 != 0) {
                }
                break;
            default:
                if (continuation instanceof nri) {
                    nriVar = (nri) continuation;
                    int i6 = nriVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        nriVar.k = i6 - Integer.MIN_VALUE;
                        Object obj4 = nriVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = nriVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            d6l d6lVar = (d6l) obj;
                            a0q C2 = rvf.C(d6lVar.a.b());
                            if (C2 == null) {
                                C2 = d6lVar.a.g().getId();
                            }
                            if (up6.A(C2, this.c.a)) {
                                nriVar.k = 1;
                                if (this.b.emit(obj, nriVar) == nm6Var4) {
                                }
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                nriVar = new nri(this, continuation);
                Object obj42 = nriVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = nriVar.k;
                if (i3 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qa3(rjc rjcVar, oq oqVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = oqVar;
    }
}
