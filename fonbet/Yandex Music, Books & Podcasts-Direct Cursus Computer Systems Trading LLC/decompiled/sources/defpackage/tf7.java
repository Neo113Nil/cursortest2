package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tf7 implements cm0 {
    public long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public tf7(uf7 uf7Var, oct octVar, Object obj, cn0 cn0Var) {
        vzt vztVar = new vzt(uf7Var.a);
        xic xicVar = (xic) vztVar.b;
        this.b = vztVar;
        this.c = octVar;
        this.d = obj;
        cn0 cn0Var2 = (cn0) octVar.a.invoke(obj);
        this.f = cn0Var2;
        this.g = qwp.H(cn0Var);
        Function1 function1 = octVar.b;
        if (((cn0) vztVar.e) == null) {
            vztVar.e = cn0Var2.c();
        }
        cn0 cn0Var3 = (cn0) vztVar.e;
        if (cn0Var3 == null) {
            Intrinsics.j("targetVector");
            throw null;
        }
        int b = cn0Var3.b();
        int i = 0;
        while (true) {
            cn0 cn0Var4 = (cn0) vztVar.e;
            if (i >= b) {
                if (cn0Var4 == null) {
                    Intrinsics.j("targetVector");
                    throw null;
                }
                this.e = function1.invoke(cn0Var4);
                if (((cn0) vztVar.d) == null) {
                    vztVar.d = cn0Var2.c();
                }
                cn0 cn0Var5 = (cn0) vztVar.d;
                if (cn0Var5 == null) {
                    Intrinsics.j("velocityVector");
                    throw null;
                }
                int b2 = cn0Var5.b();
                long j = 0;
                for (int i2 = 0; i2 < b2; i2++) {
                    cn0Var2.getClass();
                    j = Math.max(j, xicVar.F(cn0Var.a(i2)));
                }
                this.a = j;
                cn0 H = qwp.H(((vzt) this.b).a(j, (cn0) this.f, cn0Var));
                this.h = H;
                int b3 = H.b();
                for (int i3 = 0; i3 < b3; i3++) {
                    cn0 cn0Var6 = (cn0) this.h;
                    float a = cn0Var6.a(i3);
                    float f = ((vzt) this.b).a;
                    cn0Var6.e(i3, yhn.c(a, -f, f));
                }
                return;
            }
            if (cn0Var4 == null) {
                Intrinsics.j("targetVector");
                throw null;
            }
            cn0Var4.e(i, xicVar.I(cn0Var2.a(i), cn0Var.a(i)));
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(tf7 tf7Var, String str, cg6 cg6Var) {
        k3t k3tVar;
        int i;
        if (cg6Var instanceof k3t) {
            k3tVar = (k3t) cg6Var;
            int i2 = k3tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k3tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k3tVar.j;
                Object obj2 = nm6.a;
                i = k3tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    long j = tf7Var.a;
                    if (j != -1) {
                        return new Long(j);
                    }
                    rtl rtlVar = (rtl) tf7Var.e;
                    cvl cvlVar = new cvl("-15", "metadata", ((xus) tf7Var.h).a(), 0, -1, false, 0, 0, 0, 0L, 0L, yxr.b, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134215656);
                    k3tVar.l = 1;
                    obj = rtlVar.a.d(str, cvlVar, false, k3tVar);
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
                Long l = new Long(((cvl) obj).k);
                tf7Var.a = l.longValue();
                return l;
            }
        }
        k3tVar = new k3t(tf7Var, cg6Var);
        Object obj3 = k3tVar.j;
        Object obj22 = nm6.a;
        i = k3tVar.l;
        if (i != 0) {
        }
        Long l2 = new Long(((cvl) obj3).k);
        tf7Var.a = l2.longValue();
        return l2;
    }

    @Override // defpackage.cm0
    public boolean a() {
        return false;
    }

    @Override // defpackage.cm0
    public cn0 b(long j) {
        return !c(j) ? ((vzt) this.b).a(j, (cn0) this.f, (cn0) this.g) : (cn0) this.h;
    }

    @Override // defpackage.cm0
    public long d() {
        return this.a;
    }

    @Override // defpackage.cm0
    public oct e() {
        return (oct) this.c;
    }

    @Override // defpackage.cm0
    public Object f(long j) {
        if (c(j)) {
            return this.e;
        }
        Function1 function1 = ((oct) this.c).b;
        vzt vztVar = (vzt) this.b;
        cn0 cn0Var = (cn0) this.f;
        cn0 cn0Var2 = (cn0) this.g;
        if (((cn0) vztVar.c) == null) {
            vztVar.c = cn0Var.c();
        }
        cn0 cn0Var3 = (cn0) vztVar.c;
        if (cn0Var3 == null) {
            Intrinsics.j("valueVector");
            throw null;
        }
        int b = cn0Var3.b();
        int i = 0;
        while (true) {
            cn0 cn0Var4 = (cn0) vztVar.c;
            if (i >= b) {
                if (cn0Var4 != null) {
                    return function1.invoke(cn0Var4);
                }
                Intrinsics.j("valueVector");
                throw null;
            }
            if (cn0Var4 == null) {
                Intrinsics.j("valueVector");
                throw null;
            }
            cn0Var4.e(i, ((xic) vztVar.b).o(cn0Var.a(i), cn0Var2.a(i), j));
            i++;
        }
    }

    @Override // defpackage.cm0
    public Object g() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (defpackage.tyf.N(r7, r6, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Collection collection, cg6 cg6Var) {
        l3t l3tVar;
        int i;
        Collection collection2;
        String str;
        int i2;
        int i3;
        if (cg6Var instanceof l3t) {
            l3tVar = (l3t) cg6Var;
            int i4 = l3tVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l3tVar.p = i4 - Integer.MIN_VALUE;
                Object obj = l3tVar.n;
                nm6 nm6Var = nm6.a;
                i = l3tVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (collection.isEmpty()) {
                        return Unit.a;
                    }
                    String str2 = ((xus) this.h).a().a;
                    str2.getClass();
                    i5h i5hVar = (i5h) this.f;
                    l3tVar.j = collection;
                    l3tVar.k = str2;
                    l3tVar.l = 0;
                    l3tVar.m = 0;
                    l3tVar.p = 1;
                    Object b = i5hVar.b(str2, l3tVar);
                    if (b != nm6Var) {
                        collection2 = collection;
                        str = str2;
                        obj = b;
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection3 = l3tVar.j;
                    qgg.h0(obj);
                    return Unit.a;
                }
                i2 = l3tVar.m;
                i3 = l3tVar.l;
                String str3 = l3tVar.k;
                Collection collection4 = l3tVar.j;
                qgg.h0(obj);
                str = str3;
                collection2 = collection4;
                ueo ueoVar = (ueo) obj;
                m3t m3tVar = new m3t(ueoVar, null, collection2, this, str);
                l3tVar.j = null;
                l3tVar.k = null;
                l3tVar.l = i3;
                l3tVar.m = i2;
                l3tVar.p = 2;
            }
        }
        l3tVar = new l3t(this, cg6Var);
        Object obj2 = l3tVar.n;
        nm6 nm6Var2 = nm6.a;
        i = l3tVar.p;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        m3t m3tVar2 = new m3t(ueoVar2, null, collection2, this, str);
        l3tVar.j = null;
        l3tVar.k = null;
        l3tVar.l = i3;
        l3tVar.m = i2;
        l3tVar.p = 2;
    }

    public tf7(et etVar, p51 p51Var, i5h i5hVar, rtl rtlVar, i2m i2mVar, rus rusVar, xus xusVar) {
        p51Var.getClass();
        etVar.getClass();
        rusVar.getClass();
        rtlVar.getClass();
        i2mVar.getClass();
        this.b = p51Var;
        this.c = etVar;
        this.d = rusVar;
        this.e = rtlVar;
        this.f = i5hVar;
        this.g = i2mVar;
        this.h = xusVar;
        this.a = -1L;
    }
}
