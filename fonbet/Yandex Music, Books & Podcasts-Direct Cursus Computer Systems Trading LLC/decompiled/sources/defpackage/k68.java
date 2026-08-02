package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class k68 {
    public final znk a;
    public final le3 b;
    public final tf6 c = gld.e(dm6.b);
    public final qqi d = rqi.a();

    public k68(znk znkVar, le3 le3Var) {
        this.a = znkVar;
        this.b = le3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hs5 hs5Var, cg6 cg6Var) {
        f68 f68Var;
        Object obj;
        int i;
        if (cg6Var instanceof f68) {
            f68Var = (f68) cg6Var;
            int i2 = f68Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f68Var.l = i2 - Integer.MIN_VALUE;
                obj = f68Var.j;
                nm6 nm6Var = nm6.a;
                i = f68Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = hs5Var.b;
                    String str2 = hs5Var.a.a;
                    f68Var.l = 1;
                    obj = x97.V(dm6.a, new b68(continuation, this.a, str, str2, 1), f68Var);
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
                if (((a58) obj) == null) {
                    x97.y(this.c, null, null, new g68(this, continuation, 0), 3);
                }
                return obj;
            }
        }
        f68Var = new f68(this, cg6Var);
        obj = f68Var.j;
        nm6 nm6Var2 = nm6.a;
        i = f68Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((a58) obj) == null) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (c(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hs5 hs5Var, cg6 cg6Var) {
        h68 h68Var;
        int i;
        if (cg6Var instanceof h68) {
            h68Var = (h68) cg6Var;
            int i2 = h68Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h68Var.m = i2 - Integer.MIN_VALUE;
                Object obj = h68Var.k;
                Object obj2 = nm6.a;
                i = h68Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    h68Var.j = hs5Var;
                    h68Var.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hs5Var = h68Var.j;
                    qgg.h0(obj);
                }
                String str = hs5Var.b;
                String str2 = hs5Var.a.a;
                h68Var.j = null;
                h68Var.m = 2;
                Object V = x97.V(dm6.a, new b68(null, this.a, str, str2, 1), h68Var);
                return V != obj2 ? obj2 : V;
            }
        }
        h68Var = new h68(this, cg6Var);
        Object obj3 = h68Var.k;
        Object obj22 = nm6.a;
        i = h68Var.m;
        if (i != 0) {
        }
        String str3 = hs5Var.b;
        String str22 = hs5Var.a.a;
        h68Var.j = null;
        h68Var.m = 2;
        Object V2 = x97.V(dm6.a, new b68(null, this.a, str3, str22, 1), h68Var);
        if (V2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r4.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (d(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        i68 i68Var;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof i68) {
                i68Var = (i68) cg6Var;
                int i2 = i68Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    i68Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = i68Var.k;
                    Object obj2 = nm6.a;
                    i = i68Var.m;
                    qqiVar = this.d;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (qqiVar.g()) {
                            i68Var.m = 2;
                        } else {
                            i68Var.j = qqiVar;
                            i68Var.m = 1;
                        }
                        return obj2;
                    }
                    if (i == 1) {
                        qqiVar = i68Var.j;
                        qgg.h0(obj);
                        qqiVar.b(null);
                        return Unit.a;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            if (i != 0) {
            }
        } finally {
            qqiVar.b(null);
        }
        i68Var = new i68(this, cg6Var);
        Object obj3 = i68Var.k;
        Object obj22 = nm6.a;
        i = i68Var.m;
        qqiVar = this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        j68 j68Var;
        int i;
        List list;
        if (cg6Var instanceof j68) {
            j68Var = (j68) cg6Var;
            int i2 = j68Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j68Var.l = i2 - Integer.MIN_VALUE;
                Object obj = j68Var.j;
                nm6 nm6Var = nm6.a;
                i = j68Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    j68Var.l = 1;
                    obj = x97.V(dm6.b, new ja4(this.b, continuation, 29), j68Var);
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
                }
                list = (List) jf0.F((rj6) obj);
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        j68Var.l = 2;
                        Object V = x97.V(dm6.a, new nz5(continuation, this.a, list, 7), j68Var);
                        if (V != nm6Var) {
                            V = Unit.a;
                        }
                    }
                }
                return Unit.a;
            }
        }
        j68Var = new j68(this, cg6Var);
        Object obj2 = j68Var.j;
        nm6 nm6Var2 = nm6.a;
        i = j68Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        list = (List) jf0.F((rj6) obj2);
        if (list != null) {
        }
        return Unit.a;
    }
}
