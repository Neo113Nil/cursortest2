package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class o62 {
    public final s62 a;
    public final arf b;
    public final raa c;
    public final c72 d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final tf6 i;
    public final es6 j;

    public o62(wka wkaVar, s62 s62Var, jyr jyrVar, jyr jyrVar2, raa raaVar, c72 c72Var) {
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        jyrVar.getClass();
        jyrVar2.getClass();
        mn7Var.getClass();
        mn7Var.getClass();
        raaVar.getClass();
        c72Var.getClass();
        this.a = s62Var;
        this.b = jyrVar;
        this.c = raaVar;
        this.d = c72Var;
        this.e = btf.b(new e62(this, 0));
        this.f = btf.b(new e62(this, 1));
        this.g = btf.b(new e62(this, 2));
        this.h = btf.b(new e62(this, 3));
        this.i = gld.e(mn7Var);
        this.j = new es6(wkaVar, (e6q) jyrVar2.getValue(), (mm6) gld.e(mn7Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (((java.lang.Boolean) defpackage.dag.p(r0, new defpackage.jzk(0))).booleanValue() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(o62 o62Var, Collection collection) {
        mqs mqsVar;
        d6l x = p6g.x((e6l) ((f7l) ((dla) o62Var.e.getValue()).a.getValue()).c.getValue());
        if (x != null) {
            mwk b = x.a.b();
            mqsVar = b.a();
        }
        mqsVar = null;
        String str = mqsVar != null ? mqsVar.a : null;
        ((kij) o62Var.b.getValue()).b(collection);
        es6 es6Var = o62Var.j;
        String str2 = (str == null || !collection.contains(str)) ? null : str;
        es6Var.getClass();
        ((zi3) es6Var.c).c(new vx4(es6Var, collection, str2, (cvl) null, (oq) null, (Continuation) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o62 o62Var, List list, cg6 cg6Var) {
        m62 m62Var;
        int i;
        long j;
        ArrayList arrayList;
        List list2;
        long j2;
        Long l;
        jyr jyrVar = o62Var.f;
        c72 c72Var = o62Var.d;
        if (cg6Var instanceof m62) {
            m62Var = (m62) cg6Var;
            int i2 = m62Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m62Var.o = i2 - Integer.MIN_VALUE;
                Object obj = m62Var.m;
                nm6 nm6Var = nm6.a;
                i = m62Var.o;
                long j3 = 0;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    xdr xdrVar = saa.a;
                    z22 z22Var = (z22) c72Var;
                    boolean g = z22Var.g();
                    if (g) {
                        j = ((q3t) jyrVar.getValue()).d(css.g);
                    } else {
                        if (g) {
                            b6e.s();
                            return null;
                        }
                        q3t q3tVar = (q3t) jyrVar.getValue();
                        List a = q3tVar.d.a();
                        String a2 = q3tVar.n.a();
                        a2.getClass();
                        ArrayList c = q3tVar.a.c(a2);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            iss issVar = (iss) next;
                            if (a.contains(issVar.c) && ((Boolean) issVar.f.b.getValue()).booleanValue()) {
                                arrayList2.add(next);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        long j4 = 0;
                        while (it2.hasNext()) {
                            j4 += hag.m(q3tVar.m, (iss) it2.next());
                        }
                        j = j4;
                    }
                    m62Var.j = list;
                    m62Var.k = q;
                    m62Var.l = j;
                    m62Var.o = 2;
                    Object a3 = z22Var.a(m62Var);
                    if (a3 == nm6Var) {
                        return nm6Var;
                    }
                    arrayList = q;
                    obj = a3;
                    list2 = list;
                    j2 = j;
                } else {
                    if (i == 1) {
                        ArrayList arrayList3 = m62Var.k;
                        List list3 = m62Var.j;
                        qgg.h0(obj);
                        Long a4 = ((k22) obj).a();
                        if (a4 != null) {
                            long j5 = 0;
                            if (j5 > a4.longValue()) {
                                Iterator it3 = CollectionsKt.o0(list3, new C1318t(23)).iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(((y62) it3.next()).a);
                                    j3 += j5;
                                    if (j5 - j3 <= a4.longValue()) {
                                        break;
                                    }
                                }
                            }
                        }
                        return arrayList3;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = m62Var.l;
                    arrayList = m62Var.k;
                    list2 = m62Var.j;
                    qgg.h0(obj);
                }
                l = (Long) obj;
                if (l != null && j2 > l.longValue()) {
                    for (y62 y62Var : CollectionsKt.o0(list2, new C1318t(24))) {
                        arrayList.add(y62Var.a);
                        j3 += ((q3t) jyrVar.getValue()).f(new zvs(y62Var.a));
                        if (j2 - j3 <= l.longValue()) {
                            break;
                        }
                    }
                }
                return arrayList;
            }
        }
        m62Var = new m62(o62Var, cg6Var);
        Object obj2 = m62Var.m;
        nm6 nm6Var2 = nm6.a;
        i = m62Var.o;
        long j32 = 0;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
            while (r2.hasNext()) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r10 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r10 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0051, code lost:
    
        if (r10 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(o62 o62Var, mqs mqsVar, cg6 cg6Var) {
        n62 n62Var;
        Object obj;
        int i;
        css cssVar;
        if (cg6Var instanceof n62) {
            n62Var = (n62) cg6Var;
            int i2 = n62Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n62Var.m = i2 - Integer.MIN_VALUE;
                obj = n62Var.k;
                nm6 nm6Var = nm6.a;
                i = n62Var.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    c72 c72Var = o62Var.d;
                    n62Var.j = mqsVar;
                    n62Var.m = 1;
                    obj = ((z22) c72Var).b(n62Var);
                } else if (i == 1) {
                    mqsVar = n62Var.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return !((Boolean) obj).booleanValue() ? Boolean.FALSE : Boolean.TRUE;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqsVar = n62Var.j;
                    qgg.h0(obj);
                    iss issVar = (iss) obj;
                    if (issVar != null && (cssVar = issVar.f) != null && cssVar.b()) {
                        return Boolean.FALSE;
                    }
                    s62 s62Var = o62Var.a;
                    rr5 d = mqsVar.d();
                    n62Var.j = null;
                    n62Var.m = 3;
                    obj = s62Var.a(d, n62Var);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                mqsVar.getClass();
                switch (mqsVar.I().ordinal()) {
                    case 0:
                        zvs zvsVar = new zvs(mqsVar.a);
                        raa raaVar = o62Var.c;
                        n62Var.j = mqsVar;
                        n62Var.m = 2;
                        taa taaVar = (taa) raaVar;
                        taaVar.getClass();
                        obj = x97.V(dm6.b, new f98(taaVar, zvsVar, continuation, 6), n62Var);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        return Boolean.FALSE;
                    default:
                        b6e.s();
                        return null;
                }
            }
        }
        n62Var = new n62(o62Var, cg6Var);
        obj = n62Var.k;
        nm6 nm6Var2 = nm6.a;
        i = n62Var.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final a72 d() {
        return (a72) this.g.getValue();
    }
}
