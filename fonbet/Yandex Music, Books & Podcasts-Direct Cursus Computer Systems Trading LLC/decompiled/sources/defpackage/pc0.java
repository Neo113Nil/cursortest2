package defpackage;

import java.io.Serializable;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class pc0 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public pc0() {
        bdt I = hag.I(nsl.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(ms.class), true);
        this.c = l18Var.b(hag.I(hh1.class), true);
        this.d = l18Var.b(hag.I(o21.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xc5 xc5Var, cg6 cg6Var) {
        mc0 mc0Var;
        int i;
        Pair pair;
        if (cg6Var instanceof mc0) {
            mc0Var = (mc0) cg6Var;
            int i2 = mc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mc0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = mc0Var.j;
                Object obj2 = nm6.a;
                i = mc0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ms msVar = (ms) this.b.getValue();
                    String str = xc5Var.a;
                    mc0Var.l = 1;
                    obj = msVar.e(str, mc0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pair = (Pair) obj;
                if (pair == null) {
                    return (mt) pair.a;
                }
                return null;
            }
        }
        mc0Var = new mc0(this, cg6Var);
        Object obj3 = mc0Var.j;
        Object obj22 = nm6.a;
        i = mc0Var.l;
        if (i != 0) {
        }
        pair = (Pair) obj3;
        if (pair == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(yc5 yc5Var, cg6 cg6Var) {
        nc0 nc0Var;
        int i;
        Pair pair;
        if (cg6Var instanceof nc0) {
            nc0Var = (nc0) cg6Var;
            int i2 = nc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nc0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = nc0Var.j;
                Object obj2 = nm6.a;
                i = nc0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    o21 o21Var = (o21) this.d.getValue();
                    String str = yc5Var.a;
                    nc0Var.l = 1;
                    obj = o21Var.a(str, nc0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pair = (Pair) obj;
                if (pair == null) {
                    return (na1) pair.a;
                }
                return null;
            }
        }
        nc0Var = new nc0(this, cg6Var);
        Object obj3 = nc0Var.j;
        Object obj22 = nm6.a;
        i = nc0Var.l;
        if (i != 0) {
        }
        pair = (Pair) obj3;
        if (pair == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(zc5 zc5Var, cg6 cg6Var) {
        oc0 oc0Var;
        int i;
        Pair pair;
        if (cg6Var instanceof oc0) {
            oc0Var = (oc0) cg6Var;
            int i2 = oc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oc0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = oc0Var.j;
                nm6 nm6Var = nm6.a;
                i = oc0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    nsl nslVar = (nsl) this.a.getValue();
                    String str = zc5Var.a;
                    String str2 = zc5Var.b;
                    oc0Var.l = 1;
                    obj = nslVar.c(str, str2, oc0Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pair = (Pair) obj;
                if (pair == null) {
                    return (rrl) pair.a;
                }
                return null;
            }
        }
        oc0Var = new oc0(this, cg6Var);
        Object obj2 = oc0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = oc0Var.l;
        if (i != 0) {
        }
        pair = (Pair) obj2;
        if (pair == null) {
        }
    }
}
