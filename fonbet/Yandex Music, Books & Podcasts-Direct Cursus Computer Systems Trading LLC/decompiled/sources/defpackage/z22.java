package defpackage;

import defpackage.hmm;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z22 implements c72 {
    public static final hmm.a f = new hmm.a("auto_cache_enabled");
    public static final hmm.a g = new hmm.a("auto_cache_size");
    public static final hmm.a h = new hmm.a("auto_cache_to_permanent");
    public final cc7 a;
    public final frt b;
    public final ska c;
    public final boolean d;
    public final x0q e = y0q.b(0, 0, null, 7);

    public z22(cc7 cc7Var, frt frtVar, ska skaVar, boolean z) {
        this.a = cc7Var;
        this.b = frtVar;
        this.c = skaVar;
        this.d = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r6 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r6 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        l22 l22Var;
        int i;
        if (cg6Var instanceof l22) {
            l22Var = (l22) cg6Var;
            int i2 = l22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l22Var.l = i2 - Integer.MIN_VALUE;
                Object obj = l22Var.j;
                Object obj2 = nm6.a;
                i = l22Var.l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return ((k22) obj).a();
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    if (((k22) obj).a() != null) {
                        return new Long((long) (r6.longValue() * 0.6f));
                    }
                    return null;
                }
                qgg.h0(obj);
                boolean z = this.d;
                if (z) {
                    l22Var.l = 1;
                    obj = f(l22Var);
                } else {
                    if (z) {
                        b6e.s();
                        return null;
                    }
                    l22Var.l = 2;
                    obj = f(l22Var);
                }
                return obj2;
            }
        }
        l22Var = new l22(this, cg6Var);
        Object obj3 = l22Var.j;
        Object obj22 = nm6.a;
        i = l22Var.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        m22 m22Var;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof m22) {
            m22Var = (m22) cg6Var;
            int i2 = m22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m22Var.l = i2 - Integer.MIN_VALUE;
                Object obj = m22Var.j;
                nm6 nm6Var = nm6.a;
                i = m22Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (((Boolean) this.c.invoke()).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    pjc data = c().getData();
                    m22Var.l = 1;
                    obj = zsd.i0(data, m22Var);
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
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return Boolean.TRUE;
                }
                Boolean bool = (Boolean) hmmVar.a(f);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            }
        }
        m22Var = new m22(this, cg6Var);
        Object obj2 = m22Var.j;
        nm6 nm6Var2 = nm6.a;
        i = m22Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    public final wb7 c() {
        return ((dc7) this.a).c(this.b.c().a, "auto_cache_flags");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum d(k22 k22Var, cg6 cg6Var) {
        o22 o22Var;
        int i;
        if (cg6Var instanceof o22) {
            o22Var = (o22) cg6Var;
            int i2 = o22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o22Var.l = i2 - Integer.MIN_VALUE;
                Object obj = o22Var.j;
                nm6 nm6Var = nm6.a;
                i = o22Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (k22Var != k22.c || !this.d) {
                        return k22Var;
                    }
                    wb7 c = c();
                    p22 p22Var = new p22(2, null);
                    o22Var.l = 1;
                    if (lmm.a(c, p22Var, o22Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return k22.d;
            }
        }
        o22Var = new o22(this, cg6Var);
        Object obj2 = o22Var.j;
        nm6 nm6Var2 = nm6.a;
        i = o22Var.l;
        if (i != 0) {
        }
        return k22.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r6.e.emit(r8, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (defpackage.lmm.a(r8, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(boolean z, cg6 cg6Var) {
        q22 q22Var;
        int i;
        if (cg6Var instanceof q22) {
            q22Var = (q22) cg6Var;
            int i2 = q22Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q22Var.m = i2 - Integer.MIN_VALUE;
                Object obj = q22Var.k;
                nm6 nm6Var = nm6.a;
                i = q22Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (((Boolean) this.c.invoke()).booleanValue()) {
                        return Unit.a;
                    }
                    wb7 c = c();
                    r22 r22Var = new r22(z, null);
                    q22Var.j = z;
                    q22Var.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = q22Var.j;
                    qgg.h0(obj);
                }
                Unit unit = Unit.a;
                q22Var.j = z;
                q22Var.m = 2;
            }
        }
        q22Var = new q22(this, cg6Var);
        Object obj2 = q22Var.k;
        nm6 nm6Var2 = nm6.a;
        i = q22Var.m;
        if (i != 0) {
        }
        Unit unit2 = Unit.a;
        q22Var.j = z;
        q22Var.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0046, code lost:
    
        if (r8 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        s22 s22Var;
        int i;
        hmm hmmVar;
        k22 k22Var;
        k22 k22Var2;
        Object obj;
        if (cg6Var instanceof s22) {
            s22Var = (s22) cg6Var;
            int i2 = s22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s22Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = s22Var.j;
                Enum r1 = nm6.a;
                i = s22Var.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    pjc data = c().getData();
                    s22Var.l = 1;
                    obj2 = zsd.i0(data, s22Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return obj2;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                hmmVar = (hmm) obj2;
                boolean z = this.d;
                if (hmmVar != null) {
                    return z ? k22.e : k22.d;
                }
                String str = (String) hmmVar.a(g);
                if (str != null) {
                    Iterator it = k22.k.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.d(((k22) obj).name(), str)) {
                            break;
                        }
                    }
                    k22Var2 = (k22) obj;
                    if (k22Var2 == null) {
                        k22Var = z ? k22.e : k22.d;
                    }
                    s22Var.l = 2;
                    Enum d = d(k22Var2, s22Var);
                    return d != r1 ? r1 : d;
                }
                k22Var = z ? k22.e : k22.d;
                k22Var2 = k22Var;
                s22Var.l = 2;
                Enum d2 = d(k22Var2, s22Var);
                if (d2 != r1) {
                }
            }
        }
        s22Var = new s22(this, cg6Var);
        Object obj22 = s22Var.j;
        Enum r12 = nm6.a;
        i = s22Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj22;
        boolean z2 = this.d;
        if (hmmVar != null) {
        }
    }

    public final boolean g() {
        return this.d && !((Boolean) this.c.invoke()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cg6 cg6Var) {
        t22 t22Var;
        int i;
        long j;
        if (cg6Var instanceof t22) {
            t22Var = (t22) cg6Var;
            int i2 = t22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t22Var.l = i2 - Integer.MIN_VALUE;
                Object obj = t22Var.j;
                Object obj2 = nm6.a;
                i = t22Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = this.d;
                    if (!z) {
                        if (z) {
                            b6e.s();
                            return null;
                        }
                        j = 0;
                        return new Long(j);
                    }
                    t22Var.l = 1;
                    obj = f(t22Var);
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
                j = ((k22) obj).a() == null ? (long) (r5.longValue() * 0.4f) : 4294967296L;
                return new Long(j);
            }
        }
        t22Var = new t22(this, cg6Var);
        Object obj3 = t22Var.j;
        Object obj22 = nm6.a;
        i = t22Var.l;
        if (i != 0) {
        }
        if (((k22) obj3).a() == null) {
        }
        return new Long(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r6.e.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (defpackage.lmm.a(r8, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(boolean z, cg6 cg6Var) {
        u22 u22Var;
        int i;
        if (cg6Var instanceof u22) {
            u22Var = (u22) cg6Var;
            int i2 = u22Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u22Var.m = i2 - Integer.MIN_VALUE;
                Object obj = u22Var.k;
                nm6 nm6Var = nm6.a;
                i = u22Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 c = c();
                    v22 v22Var = new v22(z, null);
                    u22Var.j = z;
                    u22Var.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = u22Var.j;
                    qgg.h0(obj);
                }
                Unit unit = Unit.a;
                u22Var.j = z;
                u22Var.m = 2;
            }
        }
        u22Var = new u22(this, cg6Var);
        Object obj2 = u22Var.k;
        nm6 nm6Var2 = nm6.a;
        i = u22Var.m;
        if (i != 0) {
        }
        Unit unit2 = Unit.a;
        u22Var.j = z;
        u22Var.m = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(cg6 cg6Var) {
        w22 w22Var;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof w22) {
            w22Var = (w22) cg6Var;
            int i2 = w22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w22Var.l = i2 - Integer.MIN_VALUE;
                Object obj = w22Var.j;
                nm6 nm6Var = nm6.a;
                i = w22Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = c().getData();
                    w22Var.l = 1;
                    obj = zsd.i0(data, w22Var);
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
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return Boolean.FALSE;
                }
                Boolean bool = (Boolean) hmmVar.a(h);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        }
        w22Var = new w22(this, cg6Var);
        Object obj2 = w22Var.j;
        nm6 nm6Var2 = nm6.a;
        i = w22Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r6.e.emit(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (defpackage.lmm.a(r8, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(k22 k22Var, cg6 cg6Var) {
        x22 x22Var;
        int i;
        if (cg6Var instanceof x22) {
            x22Var = (x22) cg6Var;
            int i2 = x22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x22Var.l = i2 - Integer.MIN_VALUE;
                Object obj = x22Var.j;
                nm6 nm6Var = nm6.a;
                i = x22Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 c = c();
                    y22 y22Var = new y22(k22Var, null);
                    x22Var.l = 1;
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
                Unit unit = Unit.a;
                x22Var.l = 2;
            }
        }
        x22Var = new x22(this, cg6Var);
        Object obj2 = x22Var.j;
        nm6 nm6Var2 = nm6.a;
        i = x22Var.l;
        if (i != 0) {
        }
        Unit unit2 = Unit.a;
        x22Var.l = 2;
    }

    public final clc l() {
        return new clc(this.e, new z21(2, 2, null));
    }
}
