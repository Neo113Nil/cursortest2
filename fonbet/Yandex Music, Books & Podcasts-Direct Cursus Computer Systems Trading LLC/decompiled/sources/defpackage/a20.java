package defpackage;

import com.yandex.music.databases.user.UserDatabase;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class a20 {
    public final dst a;

    public a20(dst dstVar) {
        this.a = dstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        w10 w10Var;
        int i;
        if (cg6Var instanceof w10) {
            w10Var = (w10) cg6Var;
            int i2 = w10Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w10Var.l = i2 - Integer.MIN_VALUE;
                Object obj = w10Var.j;
                nm6 nm6Var = nm6.a;
                i = w10Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    w10Var.l = 1;
                    obj = this.a.b(str, w10Var);
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
                return ((UserDatabase) obj).v();
            }
        }
        w10Var = new w10(this, cg6Var);
        Object obj2 = w10Var.j;
        nm6 nm6Var2 = nm6.a;
        i = w10Var.l;
        if (i != 0) {
        }
        return ((UserDatabase) obj2).v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, cg6 cg6Var) {
        x10 x10Var;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof x10) {
            x10Var = (x10) cg6Var;
            int i2 = x10Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x10Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = x10Var.k;
                obj = nm6.a;
                i = x10Var.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    x10Var.j = str2;
                    x10Var.m = 1;
                    obj2 = a(str, x10Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = x10Var.j;
                    qgg.h0(obj2);
                }
                x10Var.j = null;
                x10Var.m = 2;
                G = up6.G(((s10) obj2).a, false, true, new wq(str2, 2), x10Var);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        x10Var = new x10(this, cg6Var);
        Object obj22 = x10Var.k;
        obj = nm6.a;
        i = x10Var.m;
        if (i != 0) {
        }
        x10Var.j = null;
        x10Var.m = 2;
        G = up6.G(((s10) obj22).a, false, true, new wq(str2, 2), x10Var);
        if (G != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, cg6 cg6Var) {
        y10 y10Var;
        int i;
        if (cg6Var instanceof y10) {
            y10Var = (y10) cg6Var;
            int i2 = y10Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y10Var.m = i2 - Integer.MIN_VALUE;
                Object obj = y10Var.k;
                Object obj2 = nm6.a;
                i = y10Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    y10Var.j = str2;
                    y10Var.m = 1;
                    obj = a(str, y10Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = y10Var.j;
                    qgg.h0(obj);
                }
                y10Var.j = null;
                y10Var.m = 2;
                Object G = up6.G(((s10) obj).a, true, false, new wq(str2, 1), y10Var);
                return G != obj2 ? obj2 : G;
            }
        }
        y10Var = new y10(this, cg6Var);
        Object obj3 = y10Var.k;
        Object obj22 = nm6.a;
        i = y10Var.m;
        if (i != 0) {
        }
        y10Var.j = null;
        y10Var.m = 2;
        Object G2 = up6.G(((s10) obj3).a, true, false, new wq(str2, 1), y10Var);
        if (G2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, r10 r10Var, cg6 cg6Var) {
        z10 z10Var;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof z10) {
            z10Var = (z10) cg6Var;
            int i2 = z10Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z10Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = z10Var.l;
                obj = nm6.a;
                i = z10Var.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    z10Var.j = str2;
                    z10Var.k = r10Var;
                    z10Var.n = 1;
                    obj2 = a(str, z10Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r10Var = z10Var.k;
                    str2 = z10Var.j;
                    qgg.h0(obj2);
                }
                s10 s10Var = (s10) obj2;
                t10 t10Var = new t10(str2, r10Var);
                z10Var.j = null;
                z10Var.k = null;
                z10Var.n = 2;
                G = up6.G(s10Var.a, false, true, new kc(7, s10Var, t10Var), z10Var);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        z10Var = new z10(this, cg6Var);
        Object obj22 = z10Var.l;
        obj = nm6.a;
        i = z10Var.n;
        if (i != 0) {
        }
        s10 s10Var2 = (s10) obj22;
        t10 t10Var2 = new t10(str2, r10Var);
        z10Var.j = null;
        z10Var.k = null;
        z10Var.n = 2;
        G = up6.G(s10Var2.a, false, true, new kc(7, s10Var2, t10Var2), z10Var);
        if (G != obj) {
        }
    }
}
