package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class iyv implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ lyv b;

    public /* synthetic */ iyv(lyv lyvVar, int i) {
        this.a = i;
        this.b = lyvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r0.b(1.0f, r8, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if (r0.b(2.2f, r8, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(long j, Continuation continuation) {
        hyv hyvVar;
        int i;
        lyv lyvVar = this.b;
        uyv uyvVar = lyvVar.b;
        rxv rxvVar = lyvVar.a;
        if (continuation instanceof hyv) {
            hyvVar = (hyv) continuation;
            int i2 = hyvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hyvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hyvVar.j;
                nm6 nm6Var = nm6.a;
                i = hyvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bzv bzvVar = (bzv) uyvVar.a.a.getValue();
                    if (bzvVar instanceof zyv) {
                        if (rxvVar.h.e() > 1.1f) {
                            ((j1w) ((cyv) uyvVar.b.b).c.a).a.i0(hag.J(j), czv.a);
                        } else {
                            act actVar = myv.b;
                            hyvVar.l = 1;
                        }
                    } else {
                        if (!(bzvVar instanceof azv)) {
                            b6e.s();
                            return null;
                        }
                        if (rxvVar.h.e() < 1.8f) {
                            ((j1w) ((cyv) uyvVar.b.b).c.a).a.i0(hag.J(j), czv.b);
                        } else {
                            act S = weo.S(300, 0, lya.c, 2);
                            hyvVar.l = 2;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    rxvVar.z.setValue(Boolean.TRUE);
                    rxvVar.o(true);
                }
                return Unit.a;
            }
        }
        hyvVar = new hyv(this, continuation);
        Object obj2 = hyvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hyvVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        switch (this.a) {
            case 0:
                return b(((wpe) obj).a, continuation);
            case 1:
                v3w.n(!((Boolean) obj).booleanValue(), this.b.b.f, null);
                return Unit.a;
            case 2:
                long j = ((wpe) obj).a;
                uyv uyvVar = this.b.b;
                jtv J = hag.J(j);
                uyvVar.getClass();
                ((j1w) ((cyv) uyvVar.b.b).c.a).a.W(J);
                xdr xdrVar = uyvVar.e;
                xdrVar.getClass();
                xdrVar.m(null, J);
                return Unit.a;
            case 3:
                Pair pair = (Pair) obj;
                bzv bzvVar = (bzv) pair.a;
                bzv bzvVar2 = (bzv) pair.b;
                if (bzvVar.getClass().equals(bzvVar2.getClass())) {
                    return Unit.a;
                }
                lyv lyvVar = this.b;
                mm6 mm6Var = lyvVar.c;
                rxv rxvVar = lyvVar.a;
                Continuation continuation2 = null;
                if (!(bzvVar2 instanceof zyv)) {
                    if (bzvVar2 instanceof azv) {
                        if (bzvVar instanceof zyv) {
                            rxvVar.r(true);
                            x97.y(mm6Var, null, null, new l1p(lyvVar, bzvVar2, continuation2, 9), 3).R(new q0v(11, lyvVar));
                        } else if (!(bzvVar instanceof azv)) {
                            b6e.s();
                        }
                        return Unit.a;
                    }
                    b6e.s();
                    return null;
                }
                if (!(bzvVar instanceof zyv)) {
                    if (!(bzvVar instanceof azv)) {
                        b6e.s();
                        return null;
                    }
                    rxvVar.r(true);
                    eyv eyvVar = new eyv(lyvVar, 2);
                    rxvVar.d.setValue(heh.a);
                    x97.y(mm6Var, null, null, new fyv(lyvVar, (Continuation) null), 3).R(new q0v(12, eyvVar));
                }
                return Unit.a;
            default:
                bzv bzvVar3 = (bzv) obj;
                if (bzvVar3 instanceof azv) {
                    z = true;
                } else {
                    if (!(bzvVar3 instanceof zyv)) {
                        b6e.s();
                        return null;
                    }
                    z = ((zyv) bzvVar3).f;
                }
                this.b.a.B.setValue(Boolean.valueOf(!z));
                return Unit.a;
        }
    }
}
