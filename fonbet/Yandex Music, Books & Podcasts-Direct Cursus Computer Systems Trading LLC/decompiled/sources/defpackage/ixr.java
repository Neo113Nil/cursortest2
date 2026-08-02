package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ixr implements dho {
    public final eps a;

    public ixr(eps epsVar) {
        this.a = epsVar;
    }

    @Override // defpackage.dho
    public final Object a(Continuation continuation) {
        return b((cg6) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r14 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        hxr hxrVar;
        int i;
        xqn xqnVar;
        xqn xqnVar2;
        boolean z;
        boolean z2;
        if (cg6Var instanceof hxr) {
            hxrVar = (hxr) cg6Var;
            int i2 = hxrVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hxrVar.o = i2 - Integer.MIN_VALUE;
                Object obj = hxrVar.m;
                nm6 nm6Var = nm6.a;
                i = hxrVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    xqn i3 = hrg.i(obj);
                    xqn xqnVar3 = new xqn();
                    v24 v24Var = new v24(i3, xqnVar3, this, continuation, 16);
                    hxrVar.j = i3;
                    hxrVar.k = xqnVar3;
                    hxrVar.o = 1;
                    if (gld.Q(v24Var, hxrVar) != nm6Var) {
                        xqnVar = i3;
                        xqnVar2 = xqnVar3;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = hxrVar.l;
                        qgg.h0(obj);
                        z2 = !z && ((Boolean) obj).booleanValue();
                        if (z2) {
                            neg.A(dyr.a, null);
                            qxr.a();
                        }
                        return Boolean.valueOf(z2);
                    }
                    xqnVar2 = hxrVar.k;
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    mu7 mu7Var = (mu7) xqnVar2.a;
                    hxrVar.j = null;
                    hxrVar.k = null;
                    hxrVar.l = booleanValue;
                    hxrVar.o = 3;
                    Object H = mu7Var.H(hxrVar);
                    if (H != nm6Var) {
                        z = booleanValue;
                        obj = H;
                        if (z) {
                        }
                        if (z2) {
                        }
                        return Boolean.valueOf(z2);
                    }
                    return nm6Var;
                }
                xqnVar2 = hxrVar.k;
                xqnVar = hxrVar.j;
                qgg.h0(obj);
                mu7 mu7Var2 = (mu7) xqnVar.a;
                hxrVar.j = null;
                hxrVar.k = xqnVar2;
                hxrVar.o = 2;
                obj = mu7Var2.H(hxrVar);
            }
        }
        hxrVar = new hxr(this, cg6Var);
        Object obj2 = hxrVar.m;
        nm6 nm6Var2 = nm6.a;
        i = hxrVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        mu7 mu7Var22 = (mu7) xqnVar.a;
        hxrVar.j = null;
        hxrVar.k = xqnVar2;
        hxrVar.o = 2;
        obj2 = mu7Var22.H(hxrVar);
    }
}
