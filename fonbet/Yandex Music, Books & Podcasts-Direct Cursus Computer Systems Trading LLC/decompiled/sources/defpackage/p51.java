package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p51 {
    public final i5h a;
    public final qne b;

    public p51(i5h i5hVar, qne qneVar) {
        this.a = i5hVar;
        this.b = qneVar;
    }

    public final Object a(String str, Iterable iterable, Map map, cg6 cg6Var) {
        if (qld.H(iterable)) {
            return Unit.a;
        }
        Object t = this.b.t(str, iterable, map, cg6Var);
        nm6 nm6Var = nm6.a;
        if (t != nm6Var) {
            t = Unit.a;
        }
        return t == nm6Var ? t : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r6 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, HashSet hashSet, cg6 cg6Var) {
        h51 h51Var;
        int i;
        p51 p51Var;
        Iterable iterable;
        Object t;
        if (cg6Var instanceof h51) {
            h51Var = (h51) cg6Var;
            int i2 = h51Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h51Var.n = i2 - Integer.MIN_VALUE;
                Object obj = h51Var.l;
                nm6 nm6Var = nm6.a;
                i = h51Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    h51Var.j = this;
                    h51Var.k = str;
                    h51Var.n = 1;
                    obj = d(str, hashSet, h51Var);
                    if (obj != nm6Var) {
                        p51Var = this;
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
                str = h51Var.k;
                p51Var = h51Var.j;
                qgg.h0(obj);
                iterable = (Iterable) obj;
                h51Var.j = null;
                h51Var.k = null;
                h51Var.n = 2;
                p51Var.getClass();
                if (qld.H(iterable)) {
                    t = p51Var.b.t(str, iterable, null, h51Var);
                    if (t != nm6Var) {
                        t = Unit.a;
                    }
                    if (t != nm6Var) {
                        t = Unit.a;
                    }
                } else {
                    t = Unit.a;
                }
            }
        }
        h51Var = new h51(this, cg6Var);
        Object obj2 = h51Var.l;
        nm6 nm6Var2 = nm6.a;
        i = h51Var.n;
        if (i != 0) {
        }
        iterable = (Iterable) obj2;
        h51Var.j = null;
        h51Var.k = null;
        h51Var.n = 2;
        p51Var.getClass();
        if (qld.H(iterable)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r7.a(r6, (java.lang.Iterable) r9, r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Iterable iterable, Map map, cg6 cg6Var) {
        i51 i51Var;
        int i;
        p51 p51Var;
        if (cg6Var instanceof i51) {
            i51Var = (i51) cg6Var;
            int i2 = i51Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i51Var.o = i2 - Integer.MIN_VALUE;
                Object obj = i51Var.m;
                nm6 nm6Var = nm6.a;
                i = i51Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    i51Var.j = map;
                    i51Var.k = this;
                    i51Var.l = str;
                    i51Var.o = 1;
                    obj = d(str, iterable, i51Var);
                    if (obj != nm6Var) {
                        p51Var = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map2 = i51Var.j;
                    qgg.h0(obj);
                    return Unit.a;
                }
                str = i51Var.l;
                p51Var = i51Var.k;
                map = i51Var.j;
                qgg.h0(obj);
                i51Var.j = null;
                i51Var.k = null;
                i51Var.l = null;
                i51Var.o = 2;
            }
        }
        i51Var = new i51(this, cg6Var);
        Object obj2 = i51Var.m;
        nm6 nm6Var2 = nm6.a;
        i = i51Var.o;
        if (i != 0) {
        }
        i51Var.j = null;
        i51Var.k = null;
        i51Var.l = null;
        i51Var.o = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        r1 = r2.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        if (r1 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
    
        r0.r = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Iterable iterable, cg6 cg6Var) {
        j51 j51Var;
        int i;
        ArrayList arrayList;
        Object obj;
        if (cg6Var instanceof j51) {
            j51Var = (j51) cg6Var;
            int i2 = j51Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j51Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = j51Var.l;
                Object obj3 = nm6.a;
                i = j51Var.n;
                if (i != 0) {
                    ArrayList q = su4.q(obj2);
                    ArrayList arrayList2 = new ArrayList(v75.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((c01) it.next()).a);
                    }
                    j51Var.j = iterable;
                    j51Var.k = q;
                    j51Var.n = 1;
                    Object f = f(str, arrayList2, j51Var);
                    if (f == obj3) {
                        return obj3;
                    }
                    obj2 = f;
                    arrayList = q;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = j51Var.k;
                    iterable = j51Var.j;
                    qgg.h0(obj2);
                }
                List list = (List) obj2;
                for (c01 c01Var : iterable) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (Intrinsics.d(((c01) obj).a, c01Var.a)) {
                            break;
                        }
                    }
                    c01 c01Var2 = (c01) obj;
                    if (c01Var2 != null) {
                        c01Var.getClass();
                        if (c01Var != c01Var2) {
                            if (Intrinsics.d(c01Var2.a, c01Var.a) && Intrinsics.d(c01Var2.b, c01Var.b) && c01Var2.c == c01Var.c && Intrinsics.d(c01Var2.k, c01Var.k) && Intrinsics.d(c01Var2.l, c01Var.l)) {
                                a01 a01Var = c01Var2.j;
                                int i3 = a01Var.a;
                                a01 a01Var2 = c01Var.j;
                                if (i3 == a01Var2.a && a01Var.b == a01Var2.b && Intrinsics.d(c01Var2.n, c01Var.n) && c01Var2.o == c01Var.o) {
                                }
                            }
                        }
                    }
                    arrayList.add(c01Var);
                }
                return arrayList;
            }
        }
        j51Var = new j51(this, cg6Var);
        Object obj22 = j51Var.l;
        Object obj32 = nm6.a;
        i = j51Var.n;
        if (i != 0) {
        }
        List list2 = (List) obj22;
        while (r9.hasNext()) {
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, cg6 cg6Var) {
        k51 k51Var;
        int i;
        if (cg6Var instanceof k51) {
            k51Var = (k51) cg6Var;
            int i2 = k51Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k51Var.l = i2 - Integer.MIN_VALUE;
                Object obj = k51Var.j;
                Object obj2 = nm6.a;
                i = k51Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Iterable c = t75.c(str2);
                    k51Var.l = 1;
                    obj = f(str, c, k51Var);
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
                return CollectionsKt.firstOrNull((List) obj);
            }
        }
        k51Var = new k51(this, cg6Var);
        Object obj3 = k51Var.j;
        Object obj22 = nm6.a;
        i = k51Var.l;
        if (i != 0) {
        }
        return CollectionsKt.firstOrNull((List) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (r1 != r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Iterable iterable, cg6 cg6Var) {
        l51 l51Var;
        int i;
        List list;
        String str2;
        List list2;
        if (cg6Var instanceof l51) {
            l51Var = (l51) cg6Var;
            int i2 = l51Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l51Var.n = i2 - Integer.MIN_VALUE;
                l51 l51Var2 = l51Var;
                Object obj = l51Var2.l;
                nm6 nm6Var = nm6.a;
                i = l51Var2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    List w0 = CollectionsKt.w0(iterable);
                    int size = w0.size();
                    i5h i5hVar = this.a;
                    if (size > 950) {
                        l51Var2.j = str;
                        l51Var2.k = w0;
                        l51Var2.n = 1;
                        Object b = i5hVar.b(str, l51Var2);
                        if (b != nm6Var) {
                            str2 = str;
                            list2 = w0;
                            obj = b;
                            ueo ueoVar = (ueo) obj;
                            m51 m51Var = new m51(ueoVar, (Continuation) null, list2, this, str2);
                            l51Var2.j = null;
                            l51Var2.k = null;
                            l51Var2.n = 2;
                            Object N = tyf.N(ueoVar, m51Var, l51Var2);
                            if (N != nm6Var) {
                            }
                        }
                    } else {
                        l51Var2.j = null;
                        l51Var2.k = w0;
                        l51Var2.n = 3;
                        Object b2 = i5hVar.b(str, l51Var2);
                        if (b2 != nm6Var) {
                            obj = b2;
                            list = w0;
                            lm1 B = ((MainDatabase) obj).B();
                            l51Var2.j = null;
                            l51Var2.k = null;
                            l51Var2.n = 4;
                            obj = B.a(list, l51Var2);
                        }
                    }
                }
                if (i == 1) {
                    List list3 = l51Var2.k;
                    String str3 = l51Var2.j;
                    qgg.h0(obj);
                    list2 = list3;
                    str2 = str3;
                    ueo ueoVar2 = (ueo) obj;
                    m51 m51Var2 = new m51(ueoVar2, (Continuation) null, list2, this, str2);
                    l51Var2.j = null;
                    l51Var2.k = null;
                    l51Var2.n = 2;
                    Object N2 = tyf.N(ueoVar2, m51Var2, l51Var2);
                    return N2 != nm6Var ? nm6Var : N2;
                }
                if (i == 2) {
                    List list4 = l51Var2.k;
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 3) {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list5 = l51Var2.k;
                    qgg.h0(obj);
                    Iterable iterable2 = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(v75.o(iterable2, 10));
                    Iterator it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(saf.m0((q51) it.next()));
                    }
                    return arrayList;
                }
                list = l51Var2.k;
                qgg.h0(obj);
                lm1 B2 = ((MainDatabase) obj).B();
                l51Var2.j = null;
                l51Var2.k = null;
                l51Var2.n = 4;
                obj = B2.a(list, l51Var2);
            }
        }
        l51Var = new l51(this, cg6Var);
        l51 l51Var22 = l51Var;
        Object obj2 = l51Var22.l;
        nm6 nm6Var2 = nm6.a;
        i = l51Var22.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0070, code lost:
    
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0056, code lost:
    
        if (r1 == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, cg6 cg6Var) {
        n51 n51Var;
        int i;
        lm1 B;
        ArrayList arrayList;
        if (cg6Var instanceof n51) {
            n51Var = (n51) cg6Var;
            int i2 = n51Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n51Var.n = i2 - Integer.MIN_VALUE;
                Object obj = n51Var.l;
                nm6 nm6Var = nm6.a;
                i = n51Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    n51Var.n = 1;
                    obj = this.a.b(str, n51Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            arrayList = n51Var.k;
                            qgg.h0(obj);
                            Iterable<jx0> iterable = (Iterable) obj;
                            ArrayList arrayList2 = new ArrayList(v75.o(iterable, 10));
                            for (jx0 jx0Var : iterable) {
                                String str2 = jx0Var.a;
                                j1g j1gVar = j1g.c;
                                tfs tfsVar = wc7.a;
                                Date b = wc7.a.b(jx0Var.b);
                                if (b == null) {
                                    b = new Date(0L);
                                }
                                arrayList2.add(new ac1(str2, j1gVar, b));
                            }
                            return new bc1(arrayList2, arrayList);
                        }
                        B = n51Var.j;
                        qgg.h0(obj);
                        Iterable<jx0> iterable2 = (Iterable) obj;
                        ArrayList arrayList3 = new ArrayList(v75.o(iterable2, 10));
                        for (jx0 jx0Var2 : iterable2) {
                            String str3 = jx0Var2.a;
                            j1g j1gVar2 = j1g.a;
                            tfs tfsVar2 = wc7.a;
                            Date b2 = wc7.a.b(jx0Var2.b);
                            if (b2 == null) {
                                b2 = new Date(0L);
                            }
                            arrayList3.add(new ac1(str3, j1gVar2, b2));
                        }
                        n51Var.j = null;
                        n51Var.k = arrayList3;
                        n51Var.n = 3;
                        obj = up6.G(B.a, true, true, new ci1(19), n51Var);
                        if (obj != nm6Var) {
                            arrayList = arrayList3;
                            Iterable<jx0> iterable3 = (Iterable) obj;
                            ArrayList arrayList22 = new ArrayList(v75.o(iterable3, 10));
                            while (r1.hasNext()) {
                            }
                            return new bc1(arrayList22, arrayList);
                        }
                        return nm6Var;
                    }
                    qgg.h0(obj);
                }
                B = ((MainDatabase) obj).B();
                n51Var.j = B;
                n51Var.n = 2;
                obj = up6.G(B.a, true, true, new ci1(20), n51Var);
            }
        }
        n51Var = new n51(this, cg6Var);
        Object obj2 = n51Var.l;
        nm6 nm6Var2 = nm6.a;
        i = n51Var.n;
        if (i != 0) {
        }
        B = ((MainDatabase) obj2).B();
        n51Var.j = B;
        n51Var.n = 2;
        obj2 = up6.G(B.a, true, true, new ci1(20), n51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, Iterable iterable, cg6 cg6Var) {
        o51 o51Var;
        int i;
        if (cg6Var instanceof o51) {
            o51Var = (o51) cg6Var;
            int i2 = o51Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o51Var.m = i2 - Integer.MIN_VALUE;
                Object obj = o51Var.k;
                nm6 nm6Var = nm6.a;
                i = o51Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (qld.H(iterable)) {
                        return Unit.a;
                    }
                    o51Var.j = iterable;
                    o51Var.m = 1;
                    obj = this.a.b(str, o51Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Iterable iterable2 = o51Var.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    iterable = o51Var.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                ct ctVar = new ct(mainDatabase, (Continuation) null, iterable, mainDatabase.B(), 1);
                o51Var.j = null;
                o51Var.m = 2;
            }
        }
        o51Var = new o51(this, cg6Var);
        Object obj2 = o51Var.k;
        nm6 nm6Var2 = nm6.a;
        i = o51Var.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        ct ctVar2 = new ct(mainDatabase2, (Continuation) null, iterable, mainDatabase2.B(), 1);
        o51Var.j = null;
        o51Var.m = 2;
    }
}
