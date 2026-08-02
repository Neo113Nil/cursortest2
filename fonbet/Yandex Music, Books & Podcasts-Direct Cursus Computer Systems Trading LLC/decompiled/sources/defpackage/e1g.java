package defpackage;

import android.os.Parcelable;
import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class e1g {
    public final i5h a;

    public e1g(i5h i5hVar) {
        this.a = i5hVar;
    }

    public static int m(q0g q0gVar) {
        int ordinal = q0gVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        b6e.s();
        return 0;
    }

    public static q0g n(int i) {
        if (i == 0) {
            return q0g.a;
        }
        if (i == 1) {
            return q0g.b;
        }
        if (i != 2) {
            return null;
        }
        return q0g.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, ArrayList arrayList) {
        r0g r0gVar;
        int i;
        if (cg6Var instanceof r0g) {
            r0gVar = (r0g) cg6Var;
            int i2 = r0gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = r0gVar.k;
                nm6 nm6Var = nm6.a;
                i = r0gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    r0gVar.j = arrayList;
                    r0gVar.m = 1;
                    obj = this.a.b(str, r0gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = r0gVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                s0g s0gVar = new s0g(ueoVar, null, arrayList, this, 0);
                r0gVar.j = null;
                r0gVar.m = 2;
            }
        }
        r0gVar = new r0g(this, cg6Var);
        Object obj2 = r0gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = r0gVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        s0g s0gVar2 = new s0g(ueoVar2, null, arrayList, this, 0);
        r0gVar.j = null;
        r0gVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, String str, ArrayList arrayList) {
        t0g t0gVar;
        int i;
        if (cg6Var instanceof t0g) {
            t0gVar = (t0g) cg6Var;
            int i2 = t0gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = t0gVar.k;
                nm6 nm6Var = nm6.a;
                i = t0gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t0gVar.j = arrayList;
                    t0gVar.m = 1;
                    obj = this.a.b(str, t0gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = t0gVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                s0g s0gVar = new s0g(ueoVar, null, arrayList, this, 1);
                t0gVar.j = null;
                t0gVar.m = 2;
            }
        }
        t0gVar = new t0g(this, cg6Var);
        Object obj2 = t0gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = t0gVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        s0g s0gVar2 = new s0g(ueoVar2, null, arrayList, this, 1);
        t0gVar.j = null;
        t0gVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var, String str, ArrayList arrayList) {
        u0g u0gVar;
        int i;
        if (cg6Var instanceof u0g) {
            u0gVar = (u0g) cg6Var;
            int i2 = u0gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = u0gVar.k;
                nm6 nm6Var = nm6.a;
                i = u0gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    u0gVar.j = arrayList;
                    u0gVar.m = 1;
                    obj = this.a.b(str, u0gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = u0gVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                s0g s0gVar = new s0g(ueoVar, null, arrayList, this, 2);
                u0gVar.j = null;
                u0gVar.m = 2;
            }
        }
        u0gVar = new u0g(this, cg6Var);
        Object obj2 = u0gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = u0gVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        s0g s0gVar2 = new s0g(ueoVar2, null, arrayList, this, 2);
        u0gVar.j = null;
        u0gVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var, String str, ArrayList arrayList) {
        v0g v0gVar;
        int i;
        if (cg6Var instanceof v0g) {
            v0gVar = (v0g) cg6Var;
            int i2 = v0gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = v0gVar.k;
                nm6 nm6Var = nm6.a;
                i = v0gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    v0gVar.j = arrayList;
                    v0gVar.m = 1;
                    obj = this.a.b(str, v0gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = v0gVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                s0g s0gVar = new s0g(ueoVar, null, arrayList, this, 3);
                v0gVar.j = null;
                v0gVar.m = 2;
            }
        }
        v0gVar = new v0g(this, cg6Var);
        Object obj2 = v0gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = v0gVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        s0g s0gVar2 = new s0g(ueoVar2, null, arrayList, this, 3);
        v0gVar.j = null;
        v0gVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, cg6 cg6Var) {
        w0g w0gVar;
        int i;
        q0g n;
        if (cg6Var instanceof w0g) {
            w0gVar = (w0g) cg6Var;
            int i2 = w0gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = w0gVar.j;
                nm6 nm6Var = nm6.a;
                i = w0gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    w0gVar.l = 1;
                    obj = this.a.b(str, w0gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ArrayList arrayList = new ArrayList();
                        for (ew ewVar : (Iterable) obj) {
                            Integer num = ewVar.b;
                            m0g m0gVar = (num == null || (n = n(num.intValue())) == null) ? null : new m0g(n, ewVar.a);
                            if (m0gVar != null) {
                                arrayList.add(m0gVar);
                            }
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                w0gVar.l = 2;
                obj = up6.G(D.a, true, false, new xjf(22), w0gVar);
            }
        }
        w0gVar = new w0g(this, cg6Var);
        Object obj2 = w0gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = w0gVar.l;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        w0gVar.l = 2;
        obj2 = up6.G(D2.a, true, false, new xjf(22), w0gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(String str, cg6 cg6Var) {
        x0g x0gVar;
        int i;
        q0g n;
        if (cg6Var instanceof x0g) {
            x0gVar = (x0g) cg6Var;
            int i2 = x0gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = x0gVar.j;
                nm6 nm6Var = nm6.a;
                i = x0gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    x0gVar.l = 1;
                    obj = this.a.b(str, x0gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ArrayList arrayList = new ArrayList();
                        for (re1 re1Var : (Iterable) obj) {
                            Integer num = re1Var.b;
                            n0g n0gVar = (num == null || (n = n(num.intValue())) == null) ? null : new n0g(n, re1Var.a);
                            if (n0gVar != null) {
                                arrayList.add(n0gVar);
                            }
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                x0gVar.l = 2;
                obj = up6.G(D.a, true, false, new xjf(21), x0gVar);
            }
        }
        x0gVar = new x0g(this, cg6Var);
        Object obj2 = x0gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = x0gVar.l;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        x0gVar.l = 2;
        obj2 = up6.G(D2.a, true, false, new xjf(21), x0gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0040, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, cg6 cg6Var) {
        y0g y0gVar;
        int i;
        o0g o0gVar;
        q0g n;
        if (cg6Var instanceof y0g) {
            y0gVar = (y0g) cg6Var;
            int i2 = y0gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = y0gVar.j;
                nm6 nm6Var = nm6.a;
                i = y0gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    y0gVar.l = 1;
                    obj = this.a.b(str, y0gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ArrayList arrayList = new ArrayList();
                        for (uwl uwlVar : (Iterable) obj) {
                            Integer num = uwlVar.b;
                            if (num != null && (n = n(num.intValue())) != null) {
                                Parcelable.Creator<nvl> creator = nvl.CREATOR;
                                nvl x = wxf.x(uwlVar.a);
                                if (x != null) {
                                    o0gVar = new o0g(n, x);
                                    if (o0gVar == null) {
                                        arrayList.add(o0gVar);
                                    }
                                }
                            }
                            o0gVar = null;
                            if (o0gVar == null) {
                            }
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                y0gVar.l = 2;
                obj = up6.G(D.a, true, false, new xjf(20), y0gVar);
            }
        }
        y0gVar = new y0g(this, cg6Var);
        Object obj2 = y0gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = y0gVar.l;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        y0gVar.l = 2;
        obj2 = up6.G(D2.a, true, false, new xjf(20), y0gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(String str, cg6 cg6Var) {
        z0g z0gVar;
        int i;
        if (cg6Var instanceof z0g) {
            z0gVar = (z0g) cg6Var;
            int i2 = z0gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = z0gVar.j;
                nm6 nm6Var = nm6.a;
                i = z0gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    z0gVar.l = 1;
                    obj = this.a.b(str, z0gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ArrayList arrayList = new ArrayList();
                        for (h5u h5uVar : (Iterable) obj) {
                            q0g n = n(h5uVar.b);
                            p0g p0gVar = n == null ? null : new p0g(n, h5uVar.a, h5uVar.c);
                            if (p0gVar != null) {
                                arrayList.add(p0gVar);
                            }
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                z0gVar.l = 2;
                obj = up6.G(D.a, true, false, new xjf(19), z0gVar);
            }
        }
        z0gVar = new z0g(this, cg6Var);
        Object obj2 = z0gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = z0gVar.l;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        z0gVar.l = 2;
        obj2 = up6.G(D2.a, true, false, new xjf(19), z0gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, m0g m0gVar, cg6 cg6Var) {
        a1g a1gVar;
        nm6 nm6Var;
        int i;
        Object G;
        if (cg6Var instanceof a1g) {
            a1gVar = (a1g) cg6Var;
            int i2 = a1gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = a1gVar.k;
                nm6Var = nm6.a;
                i = a1gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    a1gVar.j = m0gVar;
                    a1gVar.m = 1;
                    obj = this.a.b(str, a1gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m0gVar = a1gVar.j;
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                ew ewVar = new ew(m0gVar.b, Integer.valueOf(m(m0gVar.a)));
                a1gVar.j = null;
                a1gVar.m = 2;
                G = up6.G(D.a, false, true, new dae(12, D, ewVar), a1gVar);
                if (G != nm6Var) {
                    G = Unit.a;
                }
            }
        }
        a1gVar = new a1g(this, cg6Var);
        Object obj2 = a1gVar.k;
        nm6Var = nm6.a;
        i = a1gVar.m;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        ew ewVar2 = new ew(m0gVar.b, Integer.valueOf(m(m0gVar.a)));
        a1gVar.j = null;
        a1gVar.m = 2;
        G = up6.G(D2.a, false, true, new dae(12, D2, ewVar2), a1gVar);
        if (G != nm6Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, n0g n0gVar, cg6 cg6Var) {
        b1g b1gVar;
        nm6 nm6Var;
        int i;
        Object G;
        if (cg6Var instanceof b1g) {
            b1gVar = (b1g) cg6Var;
            int i2 = b1gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = b1gVar.k;
                nm6Var = nm6.a;
                i = b1gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    b1gVar.j = n0gVar;
                    b1gVar.m = 1;
                    obj = this.a.b(str, b1gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n0gVar = b1gVar.j;
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                re1 re1Var = new re1(n0gVar.b, Integer.valueOf(m(n0gVar.a)));
                b1gVar.j = null;
                b1gVar.m = 2;
                G = up6.G(D.a, false, true, new dae(14, D, re1Var), b1gVar);
                if (G != nm6Var) {
                    G = Unit.a;
                }
            }
        }
        b1gVar = new b1g(this, cg6Var);
        Object obj2 = b1gVar.k;
        nm6Var = nm6.a;
        i = b1gVar.m;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        re1 re1Var2 = new re1(n0gVar.b, Integer.valueOf(m(n0gVar.a)));
        b1gVar.j = null;
        b1gVar.m = 2;
        G = up6.G(D2.a, false, true, new dae(14, D2, re1Var2), b1gVar);
        if (G != nm6Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, o0g o0gVar, cg6 cg6Var) {
        c1g c1gVar;
        nm6 nm6Var;
        int i;
        Object G;
        if (cg6Var instanceof c1g) {
            c1gVar = (c1g) cg6Var;
            int i2 = c1gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = c1gVar.k;
                nm6Var = nm6.a;
                i = c1gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    c1gVar.j = o0gVar;
                    c1gVar.m = 1;
                    obj = this.a.b(str, c1gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o0gVar = c1gVar.j;
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                uwl uwlVar = new uwl(o0gVar.b.d(), Integer.valueOf(m(o0gVar.a)));
                c1gVar.j = null;
                c1gVar.m = 2;
                G = up6.G(D.a, false, true, new dae(11, D, uwlVar), c1gVar);
                if (G != nm6Var) {
                    G = Unit.a;
                }
            }
        }
        c1gVar = new c1g(this, cg6Var);
        Object obj2 = c1gVar.k;
        nm6Var = nm6.a;
        i = c1gVar.m;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        uwl uwlVar2 = new uwl(o0gVar.b.d(), Integer.valueOf(m(o0gVar.a)));
        c1gVar.j = null;
        c1gVar.m = 2;
        G = up6.G(D2.a, false, true, new dae(11, D2, uwlVar2), c1gVar);
        if (G != nm6Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, p0g p0gVar, cg6 cg6Var) {
        d1g d1gVar;
        nm6 nm6Var;
        int i;
        Object G;
        if (cg6Var instanceof d1g) {
            d1gVar = (d1g) cg6Var;
            int i2 = d1gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = d1gVar.k;
                nm6Var = nm6.a;
                i = d1gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    d1gVar.j = p0gVar;
                    d1gVar.m = 1;
                    obj = this.a.b(str, d1gVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p0gVar = d1gVar.j;
                    qgg.h0(obj);
                }
                q4g D = ((MainDatabase) obj).D();
                h5u h5uVar = new h5u(p0gVar.b, m(p0gVar.a), p0gVar.c);
                d1gVar.j = null;
                d1gVar.m = 2;
                G = up6.G(D.a, false, true, new dae(13, D, h5uVar), d1gVar);
                if (G != nm6Var) {
                    G = Unit.a;
                }
            }
        }
        d1gVar = new d1g(this, cg6Var);
        Object obj2 = d1gVar.k;
        nm6Var = nm6.a;
        i = d1gVar.m;
        if (i != 0) {
        }
        q4g D2 = ((MainDatabase) obj2).D();
        h5u h5uVar2 = new h5u(p0gVar.b, m(p0gVar.a), p0gVar.c);
        d1gVar.j = null;
        d1gVar.m = 2;
        G = up6.G(D2.a, false, true, new dae(13, D2, h5uVar2), d1gVar);
        if (G != nm6Var) {
        }
    }
}
