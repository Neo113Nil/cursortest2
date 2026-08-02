package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class i9w implements nn5, w2q, fnr, p7q, dmr, na, mu1, mr5, w68, c1j, m2i, nwu, o1j, wnk {
    public static final i9w a = new i9w();
    public static final i9w b = new i9w();
    public static final i9w c = new i9w();
    public static final i9w d = new i9w();
    public static final i9w e = new i9w();
    public static final i9w f = new i9w();
    public static final i9w g = new i9w();
    public static final tiu h = new tiu(0);
    public static final i9w i = new i9w();
    public static final i9w j = new i9w();

    public static bd5 A(String str, String str2) {
        List split$default;
        str.getClass();
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
        if (split$default.size() != 2) {
            dfi.r("Illegal playlist combined id ".concat(str), "PlaylistContentId");
            return null;
        }
        String str3 = (String) split$default.get(0);
        String str4 = (String) split$default.get(1);
        return (str2 == null || StringsKt.U(str2)) ? new zc5(str3, str4) : new ad5(str3, str4, str2);
    }

    public static ho6 B(String str) {
        Object obj;
        rdb rdbVar = ho6.e;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((ho6) obj).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        ho6 ho6Var = (ho6) obj;
        return ho6Var == null ? ho6.c : ho6Var;
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k = rdkVar.k(new m5n(pht.class, Executor.class));
        k.getClass();
        return u2x.E((Executor) k);
    }

    @Override // defpackage.na
    public String D() {
        return "oauth/access_token";
    }

    @Override // defpackage.o1j
    public n1j E(q1f q1fVar, int i2) {
        q1fVar.getClass();
        return null;
    }

    public synchronized nsh F() {
        n8c b2 = q8c.b(j3c.c());
        if (b2 != null) {
            return b2.e;
        }
        return nsh.m.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(String str, boolean z, cg6 cg6Var) {
        h5p h5pVar;
        int i2;
        k8q k8qVar;
        if (cg6Var instanceof h5p) {
            h5pVar = (h5p) cg6Var;
            int i3 = h5pVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h5pVar.l = i3 - Integer.MIN_VALUE;
                h5p h5pVar2 = h5pVar;
                Object obj = h5pVar2.j;
                nm6 nm6Var = nm6.a;
                i2 = h5pVar2.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    c0p c0pVar = c0p.d;
                    str.getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(vzo.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    vzo vzoVar = (vzo) qdcVar.C(I);
                    i8q i8qVar = new i8q(str, z, c0pVar, null, null);
                    h5pVar2.l = 1;
                    obj = vzo.c(vzoVar, i8qVar, 0, false, h5pVar2, 20);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                k8qVar = (k8q) obj;
                if (k8qVar == null) {
                    return k8qVar.f;
                }
                return null;
            }
        }
        h5pVar = new h5p(this, cg6Var);
        h5p h5pVar22 = h5pVar;
        Object obj2 = h5pVar22.j;
        nm6 nm6Var2 = nm6.a;
        i2 = h5pVar22.l;
        if (i2 != 0) {
        }
        k8qVar = (k8q) obj2;
        if (k8qVar == null) {
        }
    }

    @Override // defpackage.m2i
    public String a(Object obj) {
        Long l = (Long) obj;
        if (l.longValue() < 0) {
            xq0.x("Timeout too small");
            return null;
        }
        if (l.longValue() < 100000000) {
            return l + "n";
        }
        if (l.longValue() < 100000000000L) {
            return (l.longValue() / 1000) + "u";
        }
        if (l.longValue() < 100000000000000L) {
            return (l.longValue() / 1000000) + "m";
        }
        if (l.longValue() < 100000000000000000L) {
            return (l.longValue() / 1000000000) + "S";
        }
        if (l.longValue() < 6000000000000000000L) {
            return (l.longValue() / 60000000000L) + "M";
        }
        return (l.longValue() / 3600000000000L) + "H";
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.na
    public String e() {
        return "fb_extend_sso_token";
    }

    @Override // defpackage.o1j
    public n1j f(n1j n1jVar) {
        return n1jVar.b(r1c.d);
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        boolean z = false;
        if (faqVar.a() != null && (!wyf.O(r3))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.dmr
    /* renamed from: get */
    public dmr mo22get(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        jzsVar.a.getClass();
        return Boolean.valueOf(!wyf.O(r1));
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w68
    public File l(daf dafVar) {
        return null;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        HashSet hashSet = szuVar.o;
        return hashSet.size() == 1 ? (a0q) CollectionsKt.P(hashSet) : new cd5(c5b.a);
    }

    @Override // defpackage.m2i
    public Object o(String str) {
        o2g.J("empty timeout", str.length() > 0);
        o2g.J("bad timeout format", str.length() <= 9);
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        xla.e(charAt, "Invalid timeout unit: ");
        return null;
    }

    @Override // defpackage.o1j
    public mif p(n1j n1jVar) {
        return nif.d(p1j.b);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return y4dVar.a.a;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            Set o = ((jbq) maqVar).o();
            return o.size() == 1 ? (a0q) CollectionsKt.P(o) : new cd5(c5b.a);
        }
        if ((maqVar instanceof eaq) || (maqVar instanceof vaq) || (maqVar instanceof raq)) {
            return maqVar.k().getId();
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.c1j
    public boolean r() {
        return true;
    }

    @Override // defpackage.fnr
    public void s(enr enrVar) {
        enrVar.clear();
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return t1qVar.a.getId();
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return u7uVar.a.a;
    }

    @Override // defpackage.mr5
    public int v(w8 w8Var, int i2, Object obj, int i3) {
        w8Var.z((OutputStream) obj, i2);
        return 0;
    }

    @Override // defpackage.dmr
    public void w(Object obj, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mu1
    public int x(nu1 nu1Var) {
        return ((c01) nu1Var).g;
    }

    @Override // defpackage.fnr
    public boolean y(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.o1j
    public n1j z(q1f q1fVar) {
        q1fVar.getClass();
        return null;
    }

    @Override // defpackage.nwu
    public void d() {
    }

    @Override // defpackage.c1j
    public void shutdown() {
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
    }

    @Override // defpackage.w68
    public void b(daf dafVar, es6 es6Var) {
    }
}
