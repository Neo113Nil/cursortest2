package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class z91 {
    public final go1 a;
    public final ab1 b;

    public z91(go1 go1Var, ab1 ab1Var) {
        this.a = go1Var;
        this.b = ab1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, wh1 wh1Var, boolean z, cg6 cg6Var) {
        y91 y91Var;
        int i;
        dnk dnkVar;
        s91 s91Var;
        if (cg6Var instanceof y91) {
            y91Var = (y91) cg6Var;
            int i2 = y91Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y91Var.l = i2 - Integer.MIN_VALUE;
                Object obj = y91Var.j;
                nm6 nm6Var = nm6.a;
                i = y91Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = wh1Var.ordinal();
                    if (ordinal == 0) {
                        y91Var.l = 1;
                        Object a = this.a.a(str, z, y91Var);
                        if (a != nm6Var) {
                            return a;
                        }
                    } else {
                        if (ordinal != 1 && ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        y91Var.l = 2;
                        obj = this.b.a(str, false, y91Var);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dnkVar = (dnk) obj;
                if (dnkVar == null) {
                    c01 c01Var = dnkVar.a;
                    u51 P = ghh.P(c01Var);
                    String uri = c01Var.k.getUri();
                    if (uri == null) {
                        uri = "";
                    }
                    List c = t75.c(new u9b(uri, null, null));
                    b01 b01Var = c01Var.f;
                    s91Var = new s91(P, null, null, 0, null, false, c, b01Var != null ? b01Var.a : null, null);
                } else {
                    s91Var = null;
                }
                return s91Var == null ? new qj6(s91Var) : new nj6(null);
            }
        }
        y91Var = new y91(this, cg6Var);
        Object obj2 = y91Var.j;
        nm6 nm6Var2 = nm6.a;
        i = y91Var.l;
        if (i != 0) {
        }
        dnkVar = (dnk) obj2;
        if (dnkVar == null) {
        }
        if (s91Var == null) {
        }
    }
}
