package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import com.yandex.media.ynison.service.s0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rwd implements p7q, nn5, u6c, w2q, n2r, f0n, jd6, n03, v3q, m2i, b8j {
    public static final rwd b = new rwd(1);
    public static final rwd c = new rwd(2);
    public static final rwd d = new rwd(3);
    public static final rwd e = new rwd(4);
    public static final rwd f = new rwd(5);
    public static final rwd g = new rwd(6);
    public static final rwd h = new rwd(7);
    public static final rwd i = new rwd(8);
    public static final rwd j = new rwd(10);
    public static final rwd k = new rwd(11);
    public static final rwd l = new rwd(12);
    public final /* synthetic */ int a;

    public /* synthetic */ rwd(int i2) {
        this.a = i2;
    }

    public static ck1 d() {
        pas pasVar = new pas(2147483648L, "раз подпевали трекам артиста", null, "а можно сходить на концерт и подпевать ему офлайн", "Каждый сезон звучит по своему", dtq.b, "https://avatars.mds.yandex.net/get-music-misc/2406661/img.6543b69f17dfa91083743b6e/orig", etq.b, "Zivertsdikjgnbdskjlvan");
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add("https://avatars.yandex.net/get-music-content/5234847/74f987bb.p.9048/200x200");
        }
        return new ck1(pasVar, arrayList, dtq.b);
    }

    public static s0 r(String str, int i2, long j2) {
        phn.a.getClass();
        long g2 = phn.b.g();
        if ((i2 & 4) != 0) {
            j2 = System.currentTimeMillis();
        }
        str.getClass();
        iot m = s0.m();
        m.d();
        s0.f((s0) m.b, str);
        m.d();
        s0.h((s0) m.b, g2);
        m.d();
        s0.g((s0) m.b, j2);
        return (s0) m.b();
    }

    @Override // defpackage.v3q
    public Object A(p3q p3qVar) {
        p3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        jxtVar.getClass();
        jxtVar2.getClass();
        return gld.G(jxtVar, jxtVar2, fl5.c);
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k2 = rdkVar.k(new m5n(nj2.class, Executor.class));
        k2.getClass();
        return u2x.E((Executor) k2);
    }

    @Override // defpackage.v3q
    public Object E(e5q e5qVar) {
        e5qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.v3q
    public Object H(l3q l3qVar) {
        l3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.n2r
    public boolean J(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // defpackage.v3q
    public Object K(j3q j3qVar) {
        j3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        File[] fileArr;
        if (z) {
            HashSet hashSet = j3c.a;
            if (!gtt.c() || gvt.B()) {
                return;
            }
            File m0 = zsd.m0();
            if (m0 != null) {
                fileArr = m0.listFiles(ngb.b);
                fileArr.getClass();
            } else {
                fileArr = new File[0];
            }
            ArrayList arrayList = new ArrayList();
            for (File file : fileArr) {
                file.getClass();
                mgb mgbVar = new mgb();
                String name = file.getName();
                name.getClass();
                mgbVar.a = name;
                JSONObject y0 = zsd.y0(name);
                if (y0 != null) {
                    mgbVar.c = Long.valueOf(y0.optLong("timestamp", 0L));
                    mgbVar.b = y0.optString("error_message", null);
                }
                if (mgbVar.b != null && mgbVar.c != null) {
                    arrayList.add(mgbVar);
                }
            }
            y75.s(arrayList, C1318t.e);
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
                jSONArray.put(arrayList.get(i2));
            }
            zsd.A0("error_reports", jSONArray, new qa(2, arrayList));
        }
    }

    @Override // defpackage.v3q
    public Object O(z3q z3qVar) {
        z3qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.v3q
    public Object P(f5q f5qVar) {
        f5qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.m2i
    public String a(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.f0n
    public hv3 b() {
        return new h1b();
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return 0L;
    }

    public List e(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (vm5 vm5Var : componentRegistrar.getComponents()) {
            String str = vm5Var.a;
            if (str != null) {
                vm5Var = new vm5(str, vm5Var.b, vm5Var.c, vm5Var.d, vm5Var.e, new v13(2, str, vm5Var), vm5Var.g);
            }
            arrayList.add(vm5Var);
        }
        return arrayList;
    }

    @Override // defpackage.jd6
    public long f(long j2, long j3) {
        if (Float.intBitsToFloat((int) (j2 >> 32)) <= Float.intBitsToFloat((int) (j3 >> 32)) && Float.intBitsToFloat((int) (j2 & 4294967295L)) <= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
            int i2 = sso.a;
            return floatToRawIntBits;
        }
        float B = irf.B(j2, j3);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(B) << 32) | (Float.floatToRawIntBits(B) & 4294967295L);
        int i3 = sso.a;
        return floatToRawIntBits2;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        long j2;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            j2 = ((naq) faqVar).e.e;
        } else if (faqVar instanceof saq) {
            j2 = ((saq) faqVar).e.f;
        } else {
            if (!(faqVar instanceof daq) && !(faqVar instanceof qaq)) {
                b6e.s();
                return null;
            }
            j2 = 0;
        }
        return Long.valueOf(j2);
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return Long.valueOf(jzsVar.a.e);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        long j2;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            j2 = ((c2q) m1qVar).f.e;
        } else {
            if (!(m1qVar instanceof j1q) && !(m1qVar instanceof e2q)) {
                b6e.s();
                return null;
            }
            j2 = 0;
        }
        return Long.valueOf(j2);
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return Long.valueOf(i5uVar.a.f);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return 0L;
    }

    @Override // defpackage.b8j
    public boolean l(xci xciVar) {
        return false;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 1:
                iocVar.getClass();
                break;
            default:
                iocVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 1:
                szuVar.getClass();
                return Boolean.TRUE;
            default:
                szuVar.getClass();
                return Boolean.valueOf(szuVar.n());
        }
    }

    @Override // defpackage.v3q
    public Object p(x3q x3qVar) {
        x3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 1:
                y4dVar.getClass();
                return Boolean.TRUE;
            default:
                y4dVar.getClass();
                return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (((defpackage.vaq) r4).o() != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (((defpackage.naq) ((defpackage.jbq) r4).m.getValue()) != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Type inference failed for: r4v8, types: [arf, java.lang.Object] */
    @Override // defpackage.p7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 1:
                maqVar.getClass();
                return Boolean.TRUE;
            default:
                maqVar.getClass();
                boolean z = true;
                boolean z2 = false;
                if (maqVar instanceof jbq) {
                    break;
                } else if (maqVar instanceof vaq) {
                    break;
                } else if (!(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                    b6e.s();
                    return null;
                }
                return Boolean.valueOf(z2);
        }
    }

    @Override // defpackage.b8j
    public int s() {
        return 8;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 1:
                t1qVar.getClass();
                return Boolean.TRUE;
            default:
                t1qVar.getClass();
                return Boolean.valueOf(t1qVar.d != null);
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 1:
                u7uVar.getClass();
                return Boolean.TRUE;
            default:
                u7uVar.getClass();
                return Boolean.valueOf(u7uVar.k);
        }
    }

    @Override // defpackage.v3q
    public Object v(m3q m3qVar) {
        m3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.b8j
    public void w(mpf mpfVar, long j2, gzd gzdVar, int i2, boolean z) {
        cr crVar = mpfVar.F;
        f8j f8jVar = (f8j) crVar.d;
        zco zcoVar = f8j.H;
        ((f8j) crVar.d).g1(f8j.L, f8jVar.X0(j2), gzdVar, 1, z);
    }

    @Override // defpackage.b8j
    public boolean x(mpf mpfVar) {
        jfp w = mpfVar.w();
        boolean z = false;
        if (w != null && w.d) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.v3q
    public Object y(y3q y3qVar) {
        y3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.v3q
    public Object z(m4q m4qVar) {
        m4qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.m2i
    public Object o(String str) {
        return str;
    }
}
