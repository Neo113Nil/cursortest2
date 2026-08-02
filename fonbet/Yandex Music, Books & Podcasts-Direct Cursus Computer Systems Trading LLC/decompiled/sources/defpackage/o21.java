package defpackage;

import java.io.Serializable;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class o21 {
    public final hh1 a;
    public final z66 b;

    public o21(hh1 hh1Var, z66 z66Var) {
        this.a = hh1Var;
        this.b = z66Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, cg6 cg6Var) {
        n21 n21Var;
        int i;
        hh1 hh1Var;
        int i2;
        if (cg6Var instanceof n21) {
            n21Var = (n21) cg6Var;
            int i3 = n21Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n21Var.o = i3 - Integer.MIN_VALUE;
                Object obj = n21Var.m;
                nm6 nm6Var = nm6.a;
                i = n21Var.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean C = xv7.C(str);
                    hh1Var = this.a;
                    i2 = 0;
                    if (C && this.b.g()) {
                        n21Var.j = str;
                        n21Var.k = hh1Var;
                        n21Var.l = 0;
                        n21Var.o = 2;
                        obj = gld.Q(new k3(hh1Var, str, continuation, 16), n21Var);
                    } else {
                        n21Var.j = null;
                        n21Var.k = null;
                        n21Var.l = 0;
                        n21Var.o = 1;
                        obj = x97.V(dm6.a, new fh1(continuation, hh1Var, str, 1), n21Var);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    na1 na1Var = (na1) obj;
                    if (na1Var != null) {
                        return new Pair(na1Var, m21.a);
                    }
                    return null;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    na1 na1Var2 = (na1) obj;
                    if (na1Var2 != null) {
                        return new Pair(na1Var2, m21.a);
                    }
                    return null;
                }
                int i4 = n21Var.l;
                hh1Var = n21Var.k;
                String str2 = n21Var.j;
                qgg.h0(obj);
                i2 = i4;
                str = str2;
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    return new Pair(((qj6) rj6Var).a, m21.b);
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                n21Var.j = null;
                n21Var.k = null;
                n21Var.l = i2;
                n21Var.o = 3;
                hh1Var.getClass();
                obj = x97.V(dm6.a, new fh1(continuation, hh1Var, str, 1), n21Var);
            }
        }
        n21Var = new n21(this, cg6Var);
        Object obj2 = n21Var.m;
        nm6 nm6Var2 = nm6.a;
        i = n21Var.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }
}
