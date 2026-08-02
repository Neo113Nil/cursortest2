package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d51 implements p7q, u6c, f, xnh, n03, p03, jd6, t2c, gyd {
    public static volatile p77 c;
    public static volatile String d;
    public final /* synthetic */ int a;
    public static final d51 b = new d51(1);
    public static final d51 e = new d51(2);
    public static final d51 f = new d51(3);
    public static final /* synthetic */ d51 g = new d51(4);
    public static final d51 h = new d51(5);
    public static final d51 i = new d51(6);
    public static final d51 j = new d51(7);
    public static final d51 k = new d51(8);
    public static final /* synthetic */ d51 l = new d51(9);
    public static final d51 m = new d51(10);
    public static final d51 n = new d51(11);
    public static final d51 o = new d51(12);

    public /* synthetic */ d51(int i2) {
        this.a = i2;
    }

    public static ByteArrayInputStream b(String str) {
        if (!str.startsWith("data:image")) {
            xq0.x("Not a valid image data URL.");
            return null;
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            xq0.x("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
        }
        xq0.x("Not a base64 image data URL.");
        return null;
    }

    public static jxi e(izs izsVar) {
        s9p s9pVar;
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a)) {
                ssg.a(7, null, "This should not happen. Track source should be always filled in wave queue", null);
                return null;
            }
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof d6v) {
            z4q z4qVar = ((d6v) e6vVar).a;
            if (z4qVar instanceof u4q) {
                s9pVar = ((u4q) z4qVar).a.a;
            } else if (z4qVar instanceof s4q) {
                s9pVar = ((s4q) z4qVar).a.a;
            } else {
                if (!(z4qVar instanceof w4q)) {
                    b6e.s();
                    return null;
                }
                s9pVar = ((w4q) z4qVar).a.a;
            }
            return g(s9pVar);
        }
        if (!(e6vVar instanceof b6v)) {
            b6e.s();
            return null;
        }
        r3q r3qVar = ((b6v) e6vVar).a;
        if (r3qVar instanceof j3q) {
            return new fxi(((j3q) r3qVar).a.a);
        }
        if (r3qVar instanceof l3q) {
            return new gxi(((l3q) r3qVar).a.a);
        }
        if (r3qVar instanceof p3q) {
            bd5 bd5Var = ((p3q) r3qVar).a;
            return new hxi(new nvl(bd5Var.s(), bd5Var.a()));
        }
        if (r3qVar instanceof m3q) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static jxi g(s9p s9pVar) {
        k7h k7hVar = (k7h) s9pVar.b.getValue();
        if (k7hVar instanceof j9p) {
            return new gxi(((j9p) k7hVar).a);
        }
        if (k7hVar instanceof i9p) {
            return new fxi(((i9p) k7hVar).a);
        }
        if (k7hVar instanceof q9p) {
            return new ixi(((q9p) k7hVar).a);
        }
        if (k7hVar instanceof p9p) {
            p9p p9pVar = (p9p) k7hVar;
            String str = p9pVar.b;
            String str2 = p9pVar.c;
            if (str == null || str2 == null) {
                return null;
            }
            return new hxi(new nvl(str, str2));
        }
        if ((k7hVar instanceof h9p) || (k7hVar instanceof k9p) || (k7hVar instanceof l9p) || (k7hVar instanceof n9p) || Intrinsics.d(k7hVar, r9p.a) || k7hVar == null) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static eca h(cvl cvlVar, Collection collection) {
        collection.getClass();
        cvlVar.getClass();
        return new eca(collection, new gca(cvlVar, collection), null);
    }

    public static eca i(mqs mqsVar, fvs fvsVar) {
        mqsVar.getClass();
        return new eca(uop.b(mqsVar), null, fvsVar);
    }

    public static eca j(Collection collection) {
        collection.getClass();
        return new eca(collection, null, null);
    }

    public static eca o(oq oqVar) {
        LinkedList linkedList = oqVar.F;
        oqVar.getClass();
        linkedList.getClass();
        return new eca(linkedList, new fca(oqVar), null);
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        int i2 = this.a;
        jxtVar.getClass();
        jxtVar2.getClass();
        switch (i2) {
            case 13:
                yxt yxtVar = jxtVar2.a;
                yxt yxtVar2 = jxtVar.a;
                yxt yxtVar3 = yxt.Boolean;
                if (yxtVar2 == yxtVar3 && yxtVar == yxtVar3) {
                    return new vc3(jxtVar.c() && jxtVar2.c());
                }
                if (yxtVar2 != yxtVar3) {
                    yxtVar = yxtVar2;
                }
                throw new mac(yxtVar, yxtVar3);
            default:
                return new vc3(!gld.G(jxtVar, jxtVar2, fl5.c).c());
        }
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            j3c.l = true;
        }
    }

    @Override // defpackage.t2c
    public azs M(int i2, int i3) {
        return new z48();
    }

    @Override // defpackage.xnh
    public int a() {
        return 0;
    }

    public p77 d(Context context, jdk jdkVar, pyh pyhVar, ln lnVar, ugk ugkVar, String str, g86 g86Var, gp2 gp2Var) {
        p77 p77Var;
        context.getClass();
        lnVar.getClass();
        str.getClass();
        synchronized (this) {
            try {
                p77Var = c;
                if (p77Var != null) {
                    if (!Intrinsics.d(d, str)) {
                        p77Var = null;
                    }
                    if (p77Var == null) {
                    }
                }
                d = str;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                p77 p77Var2 = new p77(new cr(applicationContext, jdkVar, str, pyhVar, lnVar, gp2Var, ugkVar, g86Var, 2));
                c = p77Var2;
                p77Var = p77Var2;
            } finally {
            }
        }
        return p77Var;
    }

    @Override // defpackage.jd6
    public long f(long j2, long j3) {
        float max = Math.max(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        int i2 = sso.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.xnh
    public onh l(int i2) {
        return null;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 2:
                iocVar.getClass();
                return "";
            case 7:
                iocVar.getClass();
                return null;
            default:
                iocVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        boolean z;
        switch (this.a) {
            case 2:
                szuVar.getClass();
                return s7g.r(szuVar);
            case 7:
                szuVar.getClass();
                return e(szuVar.l.g);
            default:
                szuVar.getClass();
                int ordinal = hdg.W(szuVar.a).ordinal();
                if (ordinal != 0) {
                    z = true;
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public void p(Function0 function0) {
        synchronized (this) {
        }
        qht.b.post(new u6h(2, function0));
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 2:
                y4dVar.getClass();
                return y4dVar.a.b;
            case 7:
                y4dVar.getClass();
                return null;
            default:
                y4dVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 2:
                maqVar.getClass();
                return maqVar.k().getDescription();
            case 7:
                maqVar.getClass();
                if (maqVar instanceof jbq) {
                    return e(q7g.I(((jbq) maqVar).b().e()));
                }
                if ((maqVar instanceof eaq) || (maqVar instanceof vaq) || (maqVar instanceof raq)) {
                    return null;
                }
                b6e.s();
                return null;
            default:
                maqVar.getClass();
                boolean z = false;
                if (!(maqVar instanceof jbq)) {
                    if (!(maqVar instanceof vaq) && !(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                        b6e.s();
                        return null;
                    }
                    return Boolean.valueOf(z);
                }
                int ordinal = avf.J(((jbq) maqVar).b).ordinal();
                if (ordinal != 0) {
                    z = true;
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 2:
                t1qVar.getClass();
                z3q z3qVar = t1qVar.a;
                if (z3qVar instanceof c1q) {
                    return ((c1q) z3qVar).d;
                }
                if (z3qVar instanceof e1q) {
                    return ((e1q) z3qVar).d;
                }
                if (z3qVar instanceof h1q) {
                    return ((h1q) z3qVar).c;
                }
                if (z3qVar instanceof k1q) {
                    return "";
                }
                if (z3qVar instanceof r1q) {
                    return ((r1q) z3qVar).d;
                }
                if (z3qVar instanceof u1q) {
                    return ((u1q) z3qVar).d;
                }
                if (z3qVar instanceof a2q) {
                    return ((a2q) z3qVar).d;
                }
                b6e.s();
                return null;
            case 7:
                t1qVar.getClass();
                z3q z3qVar2 = t1qVar.a;
                if (z3qVar2 instanceof c1q) {
                    return new fxi(((c1q) z3qVar2).c.a);
                }
                if (z3qVar2 instanceof e1q) {
                    return new gxi(((e1q) z3qVar2).c.a);
                }
                if (z3qVar2 instanceof r1q) {
                    nvl nvlVar = ((r1q) z3qVar2).c.a;
                    return new hxi(new nvl(nvlVar.a, nvlVar.b));
                }
                if (!(z3qVar2 instanceof a2q)) {
                    if (z3qVar2 instanceof u1q) {
                        return g(o8g.E(((u1q) z3qVar2).c.b));
                    }
                    if (!(z3qVar2 instanceof h1q) && !(z3qVar2 instanceof k1q)) {
                        b6e.s();
                    }
                }
                return null;
            default:
                t1qVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 2:
                u7uVar.getClass();
                return "";
            case 7:
                u7uVar.getClass();
                return null;
            default:
                u7uVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.t2c
    public void K() {
    }

    @Override // defpackage.t2c
    public void E(fap fapVar) {
    }

    @Override // defpackage.p03
    public long c(long j2) {
        return j2;
    }

    @Override // defpackage.gyd
    public void k(hiu hiuVar) {
    }
}
