package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class uys {
    public final i5h a;

    public uys(i5h i5hVar) {
        this.a = i5hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static iys g(jys jysVar) {
        kys kysVar;
        kys kysVar2;
        Long l;
        Integer num;
        Long l2 = jysVar.a;
        if (l2 != null) {
            long longValue = l2.longValue();
            String str = jysVar.e;
            if (str != null) {
                rr5 A = q6k.A(str, jysVar.f);
                Integer num2 = jysVar.c;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    kys.b.getClass();
                    if (intValue == 0) {
                        kysVar = kys.INSERT;
                    } else if (intValue != 1) {
                        kysVar2 = null;
                        if (kysVar2 != null && (l = jysVar.b) != null) {
                            long longValue2 = l.longValue();
                            num = jysVar.d;
                            if (num != null) {
                                return new iys(longValue, A, kysVar2, longValue2, num.intValue(), jysVar.g);
                            }
                        }
                    } else {
                        kysVar = kys.DELETE;
                    }
                    kysVar2 = kysVar;
                    if (kysVar2 != null) {
                        long longValue22 = l.longValue();
                        num = jysVar.d;
                        if (num != null) {
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        if (r1 != r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, List list) {
        nys nysVar;
        int i;
        List list2;
        Object G;
        if (cg6Var instanceof nys) {
            nysVar = (nys) cg6Var;
            int i2 = nysVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nysVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nysVar.k;
                nm6 nm6Var = nm6.a;
                i = nysVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    nysVar.j = list;
                    nysVar.m = 1;
                    obj = this.a.b(str, nysVar);
                    if (obj != nm6Var) {
                        list2 = list;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = nysVar.j;
                    qgg.h0(obj);
                    return Unit.a;
                }
                list2 = nysVar.j;
                qgg.h0(obj);
                mys R = ((MainDatabase) obj).R();
                List<iys> list4 = list2;
                ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                for (iys iysVar : list4) {
                    long j = iysVar.a;
                    Long valueOf = j != -1 ? Long.valueOf(j) : null;
                    long j2 = iysVar.d;
                    rr5 rr5Var = iysVar.b;
                    arrayList.add(new jys(valueOf, Long.valueOf(j2), Integer.valueOf(iysVar.c.a), Integer.valueOf(iysVar.e), rr5Var.a, rr5Var.b, iysVar.f));
                }
                nysVar.j = null;
                nysVar.m = 2;
                G = up6.G(R.a, false, true, new lys(R, arrayList, 1), nysVar);
                if (G != nm6.a) {
                    G = Unit.a;
                }
            }
        }
        nysVar = new nys(this, cg6Var);
        Object obj2 = nysVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nysVar.m;
        if (i != 0) {
        }
        mys R2 = ((MainDatabase) obj2).R();
        List<iys> list42 = list2;
        ArrayList arrayList2 = new ArrayList(v75.o(list42, 10));
        while (r4.hasNext()) {
        }
        nysVar.j = null;
        nysVar.m = 2;
        G = up6.G(R2.a, false, true, new lys(R2, arrayList2, 1), nysVar);
        if (G != nm6.a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        if (r1 != r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[LOOP:0: B:18:0x0071->B:20:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, String str, List list) {
        oys oysVar;
        int i;
        List list2;
        Object G;
        if (cg6Var instanceof oys) {
            oysVar = (oys) cg6Var;
            int i2 = oysVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oysVar.m = i2 - Integer.MIN_VALUE;
                Object obj = oysVar.k;
                nm6 nm6Var = nm6.a;
                i = oysVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    oysVar.j = list;
                    oysVar.m = 1;
                    obj = this.a.b(str, oysVar);
                    if (obj != nm6Var) {
                        list2 = list;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = oysVar.j;
                    qgg.h0(obj);
                    return Unit.a;
                }
                list2 = oysVar.j;
                qgg.h0(obj);
                mys R = ((MainDatabase) obj).R();
                List<r5j> list4 = list2;
                ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                for (r5j r5jVar : list4) {
                    long j = r5jVar.c;
                    rr5 rr5Var = r5jVar.a;
                    String str2 = rr5Var.b;
                    int i3 = r5jVar.b.a;
                    int i4 = r5jVar.d;
                    arrayList.add(new jys(null, Long.valueOf(j), Integer.valueOf(i3), Integer.valueOf(i4), rr5Var.a, str2, r5jVar.e));
                }
                oysVar.j = null;
                oysVar.m = 2;
                G = up6.G(R.a, false, true, new lys(R, arrayList, 1), oysVar);
                if (G != nm6.a) {
                    G = Unit.a;
                }
            }
        }
        oysVar = new oys(this, cg6Var);
        Object obj2 = oysVar.k;
        nm6 nm6Var2 = nm6.a;
        i = oysVar.m;
        if (i != 0) {
        }
        mys R2 = ((MainDatabase) obj2).R();
        List<r5j> list42 = list2;
        ArrayList arrayList2 = new ArrayList(v75.o(list42, 10));
        while (r4.hasNext()) {
        }
        oysVar.j = null;
        oysVar.m = 2;
        G = up6.G(R2.a, false, true, new lys(R2, arrayList2, 1), oysVar);
        if (G != nm6.a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r9.a(r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (defpackage.tyf.N(r8, r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var, String str, ArrayList arrayList) {
        pys pysVar;
        int i;
        if (cg6Var instanceof pys) {
            pysVar = (pys) cg6Var;
            int i2 = pysVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pysVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pysVar.k;
                nm6 nm6Var = nm6.a;
                i = pysVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pysVar.j = arrayList;
                    pysVar.m = 1;
                    obj = this.a.b(str, pysVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = pysVar.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                mys R = mainDatabase.R();
                if (arrayList.size() >= 950) {
                    pysVar.j = null;
                    pysVar.m = 2;
                } else {
                    qys qysVar = new qys(mainDatabase, null, arrayList, R);
                    pysVar.j = null;
                    pysVar.m = 3;
                }
                return nm6Var;
            }
        }
        pysVar = new pys(this, cg6Var);
        Object obj2 = pysVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pysVar.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        mys R2 = mainDatabase2.R();
        if (arrayList.size() >= 950) {
        }
        return nm6Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, cg6 cg6Var) {
        rys rysVar;
        int i;
        if (cg6Var instanceof rys) {
            rysVar = (rys) cg6Var;
            int i2 = rysVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rysVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rysVar.j;
                nm6 nm6Var = nm6.a;
                i = rysVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    rysVar.l = 1;
                    obj = this.a.b(str, rysVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((Iterable) obj).iterator();
                        while (it.hasNext()) {
                            iys g = g((jys) it.next());
                            if (g != null) {
                                arrayList.add(g);
                            }
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                mys R = ((MainDatabase) obj).R();
                rysVar.l = 2;
                obj = up6.G(R.a, true, true, new phs(24), rysVar);
            }
        }
        rysVar = new rys(this, cg6Var);
        Object obj2 = rysVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rysVar.l;
        if (i != 0) {
        }
        mys R2 = ((MainDatabase) obj2).R();
        rysVar.l = 2;
        obj2 = up6.G(R2.a, true, true, new phs(24), rysVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r12 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var, String str, List list) {
        tys tysVar;
        int i;
        if (cg6Var instanceof tys) {
            tysVar = (tys) cg6Var;
            int i2 = tysVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tysVar.m = i2 - Integer.MIN_VALUE;
                Object obj = tysVar.k;
                nm6 nm6Var = nm6.a;
                i = tysVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tysVar.j = list;
                    tysVar.m = 1;
                    obj = this.a.b(str, tysVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = tysVar.j;
                        qgg.h0(obj);
                        return obj;
                    }
                    list = tysVar.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                jbb jbbVar = new jbb(mainDatabase, (Continuation) null, mainDatabase.R(), list, this, 11);
                tysVar.j = null;
                tysVar.m = 2;
                Object N = tyf.N(mainDatabase, jbbVar, tysVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        tysVar = new tys(this, cg6Var);
        Object obj2 = tysVar.k;
        nm6 nm6Var2 = nm6.a;
        i = tysVar.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        jbb jbbVar2 = new jbb(mainDatabase2, (Continuation) null, mainDatabase2.R(), list, this, 11);
        tysVar.j = null;
        tysVar.m = 2;
        Object N2 = tyf.N(mainDatabase2, jbbVar2, tysVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, nvl nvlVar, cg6 cg6Var) {
        sys sysVar;
        int i;
        if (cg6Var instanceof sys) {
            sysVar = (sys) cg6Var;
            int i2 = sysVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sysVar.n = i2 - Integer.MIN_VALUE;
                Object obj = sysVar.l;
                nm6 nm6Var = nm6.a;
                i = sysVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    sysVar.j = str;
                    sysVar.k = nvlVar;
                    sysVar.n = 1;
                    obj = this.a.b(str, sysVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nvlVar = sysVar.k;
                    str = sysVar.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                ulg ulgVar = new ulg(mainDatabase, null, mainDatabase.I(), nvlVar, this, str);
                sysVar.j = null;
                sysVar.k = null;
                sysVar.n = 2;
                Object N = tyf.N(mainDatabase, ulgVar, sysVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        sysVar = new sys(this, cg6Var);
        Object obj2 = sysVar.l;
        nm6 nm6Var2 = nm6.a;
        i = sysVar.n;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        ulg ulgVar2 = new ulg(mainDatabase2, null, mainDatabase2.I(), nvlVar, this, str);
        sysVar.j = null;
        sysVar.k = null;
        sysVar.n = 2;
        Object N2 = tyf.N(mainDatabase2, ulgVar2, sysVar);
        if (N2 != nm6Var2) {
        }
    }
}
