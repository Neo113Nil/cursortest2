package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class i2m {
    public final i5h a;

    public i2m(i5h i5hVar) {
        this.a = i5hVar;
    }

    public static Object i(MainDatabase mainDatabase, long j, List list, boolean z, cg6 cg6Var) {
        ssg.a(3, "PlaylistTrackSource", (z ? "replace tracks" : "add tracks") + " for playlist _id = " + j, null);
        Object N = tyf.N(mainDatabase, new d2m(mainDatabase, null, z, j, list), cg6Var);
        return N == nm6.a ? N : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (defpackage.tyf.N(r1, r0, r9) != r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, long j, List list, Integer num, cg6 cg6Var) {
        r1m r1mVar;
        int i;
        String str2;
        long j2;
        List list2;
        Integer num2;
        if (cg6Var instanceof r1m) {
            r1mVar = (r1m) cg6Var;
            int i2 = r1mVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1mVar.p = i2 - Integer.MIN_VALUE;
                r1m r1mVar2 = r1mVar;
                Object obj = r1mVar2.n;
                nm6 nm6Var = nm6.a;
                i = r1mVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    r1mVar2.j = str;
                    r1mVar2.k = list;
                    r1mVar2.l = num;
                    r1mVar2.m = j;
                    r1mVar2.p = 1;
                    Object b = this.a.b(str, r1mVar2);
                    if (b != nm6Var) {
                        str2 = str;
                        j2 = j;
                        list2 = list;
                        num2 = num;
                        obj = b;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = r1mVar2.k;
                    qgg.h0(obj);
                    return Unit.a;
                }
                long j3 = r1mVar2.m;
                Integer num3 = r1mVar2.l;
                List list4 = r1mVar2.k;
                String str3 = r1mVar2.j;
                qgg.h0(obj);
                list2 = list4;
                str2 = str3;
                j2 = j3;
                num2 = num3;
                ueo ueoVar = (ueo) obj;
                s1m s1mVar = new s1m(ueoVar, null, num2, j2, list2, this, str2);
                r1mVar2.j = null;
                r1mVar2.k = null;
                r1mVar2.l = null;
                r1mVar2.m = j2;
                r1mVar2.p = 2;
            }
        }
        r1mVar = new r1m(this, cg6Var);
        r1m r1mVar22 = r1mVar;
        Object obj2 = r1mVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = r1mVar22.p;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        s1m s1mVar2 = new s1m(ueoVar2, null, num2, j2, list2, this, str2);
        r1mVar22.j = null;
        r1mVar22.k = null;
        r1mVar22.l = null;
        r1mVar22.m = j2;
        r1mVar22.p = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, String str, List list) {
        t1m t1mVar;
        int i;
        if (cg6Var instanceof t1m) {
            t1mVar = (t1m) cg6Var;
            int i2 = t1mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t1mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = t1mVar.k;
                nm6 nm6Var = nm6.a;
                i = t1mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1mVar.j = list;
                    t1mVar.m = 1;
                    obj = this.a.b(str, t1mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = t1mVar.j;
                        qgg.h0(obj);
                        return obj;
                    }
                    list = t1mVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                v1m v1mVar = new v1m(ueoVar, null, list);
                t1mVar.j = null;
                t1mVar.m = 2;
                Object N = tyf.N(ueoVar, v1mVar, t1mVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        t1mVar = new t1m(this, cg6Var);
        Object obj2 = t1mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = t1mVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        v1m v1mVar2 = new v1m(ueoVar2, null, list);
        t1mVar.j = null;
        t1mVar.m = 2;
        Object N2 = tyf.N(ueoVar2, v1mVar2, t1mVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (defpackage.tyf.N(r7, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, long j, List list, cg6 cg6Var) {
        u1m u1mVar;
        int i;
        if (cg6Var instanceof u1m) {
            u1mVar = (u1m) cg6Var;
            int i2 = u1mVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u1mVar.n = i2 - Integer.MIN_VALUE;
                Object obj = u1mVar.l;
                nm6 nm6Var = nm6.a;
                i = u1mVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    u1mVar.j = list;
                    u1mVar.k = j;
                    u1mVar.n = 1;
                    obj = this.a.b(str, u1mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = u1mVar.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    j = u1mVar.k;
                    list = u1mVar.j;
                    qgg.h0(obj);
                }
                long j2 = j;
                ueo ueoVar = (ueo) obj;
                yw4 yw4Var = new yw4(j2, ueoVar, list, (Continuation) null);
                u1mVar.j = null;
                u1mVar.k = j2;
                u1mVar.n = 2;
            }
        }
        u1mVar = new u1m(this, cg6Var);
        Object obj2 = u1mVar.l;
        nm6 nm6Var2 = nm6.a;
        i = u1mVar.n;
        if (i != 0) {
        }
        long j22 = j;
        ueo ueoVar2 = (ueo) obj2;
        yw4 yw4Var2 = new yw4(j22, ueoVar2, list, (Continuation) null);
        u1mVar.j = null;
        u1mVar.k = j22;
        u1mVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r15 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, long j, List list, cg6 cg6Var) {
        w1m w1mVar;
        int i;
        if (cg6Var instanceof w1m) {
            w1mVar = (w1m) cg6Var;
            int i2 = w1mVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w1mVar.n = i2 - Integer.MIN_VALUE;
                Object obj = w1mVar.l;
                nm6 nm6Var = nm6.a;
                i = w1mVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    w1mVar.j = list;
                    w1mVar.k = j;
                    w1mVar.n = 1;
                    obj = this.a.b(str, w1mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = w1mVar.j;
                        qgg.h0(obj);
                        return obj;
                    }
                    j = w1mVar.k;
                    list = w1mVar.j;
                    qgg.h0(obj);
                }
                long j2 = j;
                ueo ueoVar = (ueo) obj;
                x1m x1mVar = new x1m(j2, ueoVar, list, null);
                w1mVar.j = null;
                w1mVar.k = j2;
                w1mVar.n = 2;
                Object N = tyf.N(ueoVar, x1mVar, w1mVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        w1mVar = new w1m(this, cg6Var);
        Object obj2 = w1mVar.l;
        nm6 nm6Var2 = nm6.a;
        i = w1mVar.n;
        if (i != 0) {
        }
        long j22 = j;
        ueo ueoVar2 = (ueo) obj2;
        x1m x1mVar2 = new x1m(j22, ueoVar2, list, null);
        w1mVar.j = null;
        w1mVar.k = j22;
        w1mVar.n = 2;
        Object N2 = tyf.N(ueoVar2, x1mVar2, w1mVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, long j, String str2, cg6 cg6Var) {
        y1m y1mVar;
        int i;
        if (cg6Var instanceof y1m) {
            y1mVar = (y1m) cg6Var;
            int i2 = y1mVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y1mVar.n = i2 - Integer.MIN_VALUE;
                Object obj = y1mVar.l;
                nm6 nm6Var = nm6.a;
                i = y1mVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    y1mVar.j = str2;
                    y1mVar.k = j;
                    y1mVar.n = 1;
                    obj = this.a.b(str, y1mVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = y1mVar.k;
                    str2 = y1mVar.j;
                    qgg.h0(obj);
                }
                q1m K = ((MainDatabase) obj).K();
                y1mVar.j = null;
                y1mVar.k = j;
                y1mVar.n = 2;
                Object G = up6.G(K.a, true, false, new l1m(str2, 1, j), y1mVar);
                return G != nm6Var ? nm6Var : G;
            }
        }
        y1mVar = new y1m(this, cg6Var);
        Object obj2 = y1mVar.l;
        nm6 nm6Var2 = nm6.a;
        i = y1mVar.n;
        if (i != 0) {
        }
        q1m K2 = ((MainDatabase) obj2).K();
        y1mVar.j = null;
        y1mVar.k = j;
        y1mVar.n = 2;
        Object G2 = up6.G(K2.a, true, false, new l1m(str2, 1, j), y1mVar);
        if (G2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, nvl nvlVar, cg6 cg6Var) {
        z1m z1mVar;
        int i;
        if (cg6Var instanceof z1m) {
            z1mVar = (z1m) cg6Var;
            int i2 = z1mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z1mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = z1mVar.k;
                nm6 nm6Var = nm6.a;
                i = z1mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    z1mVar.j = nvlVar;
                    z1mVar.m = 1;
                    obj = this.a.b(str, z1mVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nvlVar = z1mVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                a2m a2mVar = new a2m(ueoVar, null, nvlVar);
                z1mVar.j = null;
                z1mVar.m = 2;
                Object N = tyf.N(ueoVar, a2mVar, z1mVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        z1mVar = new z1m(this, cg6Var);
        Object obj2 = z1mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = z1mVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        a2m a2mVar2 = new a2m(ueoVar2, null, nvlVar);
        z1mVar.j = null;
        z1mVar.m = 2;
        Object N2 = tyf.N(ueoVar2, a2mVar2, z1mVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, long j, cg6 cg6Var) {
        b2m b2mVar;
        int i;
        if (cg6Var instanceof b2m) {
            b2mVar = (b2m) cg6Var;
            int i2 = b2mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = b2mVar.k;
                nm6 nm6Var = nm6.a;
                i = b2mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    b2mVar.j = j;
                    b2mVar.m = 1;
                    obj = this.a.b(str, b2mVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = b2mVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                jlg jlgVar = new jlg(ueoVar, null, j);
                b2mVar.j = j;
                b2mVar.m = 2;
                Object N = tyf.N(ueoVar, jlgVar, b2mVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        b2mVar = new b2m(this, cg6Var);
        Object obj2 = b2mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = b2mVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        jlg jlgVar2 = new jlg(ueoVar2, null, j);
        b2mVar.j = j;
        b2mVar.m = 2;
        Object N2 = tyf.N(ueoVar2, jlgVar2, b2mVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, lxs lxsVar, cg6 cg6Var) {
        c2m c2mVar;
        int i;
        if (cg6Var instanceof c2m) {
            c2mVar = (c2m) cg6Var;
            int i2 = c2mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = c2mVar.k;
                nm6 nm6Var = nm6.a;
                i = c2mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    c2mVar.j = lxsVar;
                    c2mVar.m = 1;
                    obj = this.a.b(str, c2mVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lxsVar = c2mVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                w90 w90Var = new w90(ueoVar, (Continuation) null, lxsVar);
                c2mVar.j = null;
                c2mVar.m = 2;
                Object N = tyf.N(ueoVar, w90Var, c2mVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        c2mVar = new c2m(this, cg6Var);
        Object obj2 = c2mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = c2mVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        w90 w90Var2 = new w90(ueoVar2, (Continuation) null, lxsVar);
        c2mVar.j = null;
        c2mVar.m = 2;
        Object N2 = tyf.N(ueoVar2, w90Var2, c2mVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (i((com.yandex.music.databases.main.MainDatabase) r13, r10, r12, true, r6) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, long j, List list, cg6 cg6Var) {
        e2m e2mVar;
        int i;
        ArrayList arrayList;
        i2m i2mVar;
        if (cg6Var instanceof e2m) {
            e2mVar = (e2m) cg6Var;
            int i2 = e2mVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e2mVar.o = i2 - Integer.MIN_VALUE;
                e2m e2mVar2 = e2mVar;
                Object obj = e2mVar2.m;
                nm6 nm6Var = nm6.a;
                i = e2mVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    int i3 = 0;
                    for (Object obj2 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList2.add(q5g.M((t2m) obj2, i3, j));
                        i3 = i4;
                    }
                    e2mVar2.j = arrayList2;
                    e2mVar2.k = this;
                    e2mVar2.l = j;
                    e2mVar2.o = 1;
                    Object b = this.a.b(str, e2mVar2);
                    if (b != nm6Var) {
                        arrayList = arrayList2;
                        obj = b;
                        i2mVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = e2mVar2.l;
                i2mVar = e2mVar2.k;
                arrayList = e2mVar2.j;
                qgg.h0(obj);
                e2mVar2.j = null;
                e2mVar2.k = null;
                e2mVar2.l = j;
                e2mVar2.o = 2;
                i2mVar.getClass();
            }
        }
        e2mVar = new e2m(this, cg6Var);
        e2m e2mVar22 = e2mVar;
        Object obj3 = e2mVar22.m;
        nm6 nm6Var2 = nm6.a;
        i = e2mVar22.o;
        if (i != 0) {
        }
        e2mVar22.j = null;
        e2mVar22.k = null;
        e2mVar22.l = j;
        e2mVar22.o = 2;
        i2mVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r14 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, ArrayList arrayList, ArrayList arrayList2, cg6 cg6Var) {
        f2m f2mVar;
        int i;
        if (cg6Var instanceof f2m) {
            f2mVar = (f2m) cg6Var;
            int i2 = f2mVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f2mVar.n = i2 - Integer.MIN_VALUE;
                Object obj = f2mVar.l;
                nm6 nm6Var = nm6.a;
                i = f2mVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        return Unit.a;
                    }
                    f2mVar.j = arrayList;
                    f2mVar.k = arrayList2;
                    f2mVar.n = 1;
                    obj = this.a.b(str, f2mVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = f2mVar.k;
                    arrayList = f2mVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                ct ctVar = new ct(ueoVar, (Continuation) null, arrayList, arrayList2, 4);
                f2mVar.j = null;
                f2mVar.k = null;
                f2mVar.n = 2;
            }
        }
        f2mVar = new f2m(this, cg6Var);
        Object obj2 = f2mVar.l;
        nm6 nm6Var2 = nm6.a;
        i = f2mVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        ct ctVar2 = new ct(ueoVar2, (Continuation) null, arrayList, arrayList2, 4);
        f2mVar.j = null;
        f2mVar.k = null;
        f2mVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (defpackage.tyf.N(r7, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, long j, List list, cg6 cg6Var) {
        g2m g2mVar;
        int i;
        if (cg6Var instanceof g2m) {
            g2mVar = (g2m) cg6Var;
            int i2 = g2mVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g2mVar.n = i2 - Integer.MIN_VALUE;
                Object obj = g2mVar.l;
                nm6 nm6Var = nm6.a;
                i = g2mVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    g2mVar.j = list;
                    g2mVar.k = j;
                    g2mVar.n = 1;
                    obj = this.a.b(str, g2mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = g2mVar.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    j = g2mVar.k;
                    list = g2mVar.j;
                    qgg.h0(obj);
                }
                long j2 = j;
                ueo ueoVar = (ueo) obj;
                h2m h2mVar = new h2m(j2, ueoVar, list, null);
                g2mVar.j = null;
                g2mVar.k = j2;
                g2mVar.n = 2;
            }
        }
        g2mVar = new g2m(this, cg6Var);
        Object obj2 = g2mVar.l;
        nm6 nm6Var2 = nm6.a;
        i = g2mVar.n;
        if (i != 0) {
        }
        long j22 = j;
        ueo ueoVar2 = (ueo) obj2;
        h2m h2mVar2 = new h2m(j22, ueoVar2, list, null);
        g2mVar.j = null;
        g2mVar.k = j22;
        g2mVar.n = 2;
    }
}
