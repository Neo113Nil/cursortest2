package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes3.dex */
public final class fs7 implements g88, u6c, m7q, crk, p7q, lci, ymx, x7o, jd6, yla, ux7, dko, vft {
    public static final fs7 b = new fs7(1);
    public static final fs7 c = new fs7(2);
    public static final fs7 d = new fs7(3);
    public static final fs7 e = new fs7(4);
    public static final fs7 f = new fs7(5);
    public static final fs7 g = new fs7(6);
    public static final fs7 h = new fs7(7);
    public static final fs7 i = new fs7(8);
    public static final fs7 j = new fs7(9);
    public static final fs7 k = new fs7(10);
    public static final fs7 l = new fs7(11);
    public static final fs7 m = new fs7(12);
    public final /* synthetic */ int a;

    public fs7() {
        this.a = 20;
        if (dvt.a >= 35) {
        }
    }

    public static Map B(VideoData videoData) {
        Map b2 = videoData != null ? tah.b(new Pair("videoData", videoData)) : null;
        if (b2 != null) {
            return b2;
        }
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return e5bVar;
    }

    public static final boolean g() {
        Class cls = AndroidComposeView.j1;
        try {
            if (AndroidComposeView.j1 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                AndroidComposeView.j1 = cls2;
                AndroidComposeView.k1 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = AndroidComposeView.k1;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final l3o i(l3o l3oVar) {
        if ((l3oVar != null ? l3oVar.g : null) == null) {
            return l3oVar;
        }
        k3o g2 = l3oVar.g();
        g2.g = null;
        return g2.a();
    }

    public static boolean z(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // defpackage.m7q
    public Object C(lzu lzuVar) {
        lzuVar.getClass();
        return lzuVar.a;
    }

    public boolean D(dsc dscVar) {
        String str = dscVar.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            j3c.m = true;
        }
    }

    @Override // defpackage.ymx
    public jnx b(Class cls) {
        if (!jmx.class.isAssignableFrom(cls)) {
            xq0.x("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (jnx) jmx.l(cls.asSubclass(jmx.class)).i(3, null);
        } catch (Exception e2) {
            kac.k("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.m7q
    public void d(v4d v4dVar) {
        v4dVar.getClass();
    }

    @Override // defpackage.jd6
    public long f(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        int i2 = sso.a;
        return floatToRawIntBits;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(6:29|30|31|32|(1:34)|27)|23|24|25))|42|6|7|(0)(0)|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r10 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0044, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0032, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(iec iecVar, cg6 cg6Var) {
        poe poeVar;
        int i2;
        iec iecVar2;
        ?? r9;
        if (cg6Var instanceof poe) {
            poeVar = (poe) cg6Var;
            int i3 = poeVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                poeVar.m = i3 - Integer.MIN_VALUE;
                Object obj = poeVar.k;
                nm6 nm6Var = nm6.a;
                i2 = poeVar.m;
                String str = "";
                if (i2 != 0) {
                    qgg.h0(obj);
                    hec hecVar = (hec) iecVar;
                    onx d2 = hecVar.d();
                    try {
                        d2.getClass();
                        poeVar.j = hecVar;
                        poeVar.m = 1;
                        Object v = zwf.v(d2, poeVar);
                        if (v != nm6Var) {
                            obj = v;
                            iecVar = hecVar;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        iecVar = hecVar;
                        Log.w("InstallationId", "Error getting authentication token.", e);
                        iecVar2 = iecVar;
                        r9 = "";
                        onx c2 = ((hec) iecVar2).c();
                        c2.getClass();
                        poeVar.j = r9;
                        poeVar.m = 2;
                        obj = zwf.v(c2, poeVar);
                        iecVar = r9;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r92 = (String) poeVar.j;
                    qgg.h0(obj);
                    iecVar = r92;
                    obj.getClass();
                    str = (String) obj;
                    ?? r93 = iecVar;
                    return new qoe(str, r93);
                }
                iec iecVar3 = (iec) poeVar.j;
                qgg.h0(obj);
                iecVar = iecVar3;
                String str2 = ((kd2) obj).a;
                str2.getClass();
                iecVar2 = iecVar;
                r9 = str2;
                onx c22 = ((hec) iecVar2).c();
                c22.getClass();
                poeVar.j = r9;
                poeVar.m = 2;
                obj = zwf.v(c22, poeVar);
                iecVar = r9;
            }
        }
        poeVar = new poe(this, cg6Var);
        Object obj2 = poeVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = poeVar.m;
        String str3 = "";
        if (i2 != 0) {
        }
        String str22 = ((kd2) obj2).a;
        str22.getClass();
        iecVar2 = iecVar;
        r9 = str22;
        onx c222 = ((hec) iecVar2).c();
        c222.getClass();
        poeVar.j = r9;
        poeVar.m = 2;
        obj2 = zwf.v(c222, poeVar);
        iecVar = r9;
    }

    public wyf k(dsc dscVar) {
        int i2;
        int i3;
        String str = dscVar.n;
        if (str != null) {
            i2 = 1;
            i3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new au0(i3);
                case "application/x-icy":
                    return new kae();
                case "application/id3":
                    return new pae(null);
                case "application/x-emsg":
                    return new au0(i2);
                case "application/x-scte35":
                    return new k8r();
            }
        }
        xq0.x(f1d.g("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.ymx
    public boolean l(Class cls) {
        return jmx.class.isAssignableFrom(cls);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 7:
                iocVar.getClass();
                return ylb.Device;
            default:
                iocVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        boolean z;
        switch (this.a) {
            case 7:
                szuVar.getClass();
                return ylb.Device;
            default:
                szuVar.getClass();
                fyu l2 = szuVar.l();
                if (l2 instanceof eyu) {
                    z = true;
                } else {
                    if (!Intrinsics.d(l2, dyu.a)) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.m7q
    public void o(hoc hocVar) {
        hocVar.getClass();
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        fg3 fg3Var = (fg3) obj;
        fg3Var.getClass();
        z03.o.a(new z7o(fg3Var));
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 7:
                y4dVar.getClass();
                return ylb.Device;
            default:
                y4dVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 7:
                maqVar.getClass();
                return ylb.Ynison;
            default:
                maqVar.getClass();
                boolean z = false;
                if (!(maqVar instanceof jbq)) {
                    if (!(maqVar instanceof eaq) && !(maqVar instanceof raq) && !(maqVar instanceof vaq)) {
                        b6e.s();
                        return null;
                    }
                    return Boolean.valueOf(z);
                }
                fyu s = ((jbq) maqVar).s();
                if (s instanceof eyu) {
                    z = true;
                } else if (!Intrinsics.d(s, dyu.a)) {
                    b6e.s();
                    return null;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.m7q
    public Object r(xhd xhdVar) {
        xhdVar.getClass();
        return null;
    }

    @Override // defpackage.m7q
    public void s(t7u t7uVar) {
        t7uVar.getClass();
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 7:
                t1qVar.getClass();
                return ylb.Glagol;
            default:
                t1qVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 7:
                u7uVar.getClass();
                return ylb.Device;
            default:
                u7uVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.m7q
    public Object w(pnw pnwVar) {
        pnwVar.getClass();
        return pnwVar.a;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        x0q x0qVar = z03.o;
        r7o r7oVar = z7o.b;
        x0qVar.a(new z7o(new t7o(bfkVar)));
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return uit.b;
    }

    public /* synthetic */ fs7(int i2) {
        this.a = i2;
    }

    @Override // defpackage.vft
    public void A() {
    }

    @Override // defpackage.yla
    public void c() {
    }

    @Override // defpackage.vft
    public void p() {
    }

    @Override // defpackage.ux7
    public void a(paw pawVar) {
    }

    @Override // defpackage.ux7
    public void e(paw pawVar) {
    }

    @Override // defpackage.dko
    public joj v(joj jojVar) {
        return jojVar;
    }

    @Override // defpackage.yla
    public void h(r33 r33Var, Bitmap bitmap) {
    }
}
