package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class klx implements dup, dna, p7q, w8n, w2q, v3q, c0o, cm3, xeg, q3c, b0q, xij {
    public static klx b;
    public static final klx c = new klx(1);
    public static final klx d = new klx(2);
    public static final klx e = new klx(3);
    public static final klx f = new klx(4);
    public static final klx g = new klx(5);
    public static final klx h = new klx(6);
    public static final klx i = new klx(8);
    public static final klx j = new klx(9);
    public static final klx k = new klx(10);
    public static final klx l = new klx(11);
    public final /* synthetic */ int a;

    public /* synthetic */ klx(int i2) {
        this.a = i2;
    }

    public static final boolean T(String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String V(int i2, CharSequence charSequence) {
        String str = "";
        if (charSequence != null && charSequence.length() != 0) {
            str = c.r(c.r(c.r(charSequence.toString(), " \n", StringUtil.SPACE, false), StringUtil.LF, StringUtil.SPACE, false), "\"", "", false);
            if (charSequence.length() > i2) {
                return str.substring(0, i2).concat("...");
            }
        }
        return str;
    }

    public static rdp W(g3j g3jVar) {
        String str = g3jVar.a;
        hx3 D = kg5.D(str);
        return new rdp(zsd.L0(new qfk("NEW_CARD", u75.j("NEW_CARD"), up6.E(str.length(), up6.O(-4, null, str)), D != hx3.UNKNOWN ? D.a : "", true, cm2.UnknownBank, null, null, null, ufk.Card, null, null, null, null, null, null)), g3jVar);
    }

    public static ou0 Z(Context context) {
        String str;
        context.getClass();
        xdr xdrVar = ou0.b;
        ffs ffsVar = (ffs) xdrVar.getValue();
        if (ffsVar == null) {
            if (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime <= 1647810000000L || Build.VERSION.SDK_INT < 29) {
                ffs ffsVar2 = ffs.LIGHT;
                str = "DARK";
            } else {
                ffs ffsVar3 = ffs.LIGHT;
                str = "SYSTEM_DEFAULT";
            }
            String string = context.getSharedPreferences("Yandex_Music", 0).getString("theme", str);
            ffs ffsVar4 = ffs.DARK;
            if (Intrinsics.d(string, "DARK")) {
                ffsVar = ffsVar4;
            } else {
                ffs ffsVar5 = ffs.LIGHT;
                if (!Intrinsics.d(string, "LIGHT")) {
                    ffsVar5 = ffs.SYSTEM_DEFAULT;
                    if (!Intrinsics.d(string, "SYSTEM_DEFAULT")) {
                        su4.s(2, null, hrg.q("Unknown theme = ", string, ", fallback to system_default"), null);
                    }
                }
                ffsVar = ffsVar5;
            }
            xdrVar.m(null, ffsVar);
        }
        int ordinal = ffsVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? (context.getResources().getConfiguration().uiMode & 48) == 32 ? ou0.c : ou0.d : ou0.c : ou0.d;
    }

    public static boolean a0(String str, PrintWriter printWriter, String[] strArr) {
        PrintWriter printWriter2;
        Exception exc;
        str.getClass();
        printWriter.getClass();
        if (strArr == null || strArr.length == 0 || !"e2e".equals(strArr[0])) {
            return false;
        }
        if (osh.h == null) {
            osh.h = new osh(3);
        }
        osh oshVar = osh.h;
        if (oshVar != null) {
            printWriter.print(str);
            printWriter.println("Top Level Window View Hierarchy:");
            boolean T = T("all-roots", strArr);
            boolean T2 = T("top-root", strArr);
            boolean T3 = T("webview", strArr);
            boolean T4 = T("props", strArr);
            try {
                ArrayList V = ((z0j) oshVar.a).V();
                if (V != null && !V.isEmpty()) {
                    Collections.reverse(V);
                    Iterator it = V.iterator();
                    WindowManager.LayoutParams layoutParams = null;
                    while (it.hasNext()) {
                        ki0 ki0Var = (ki0) it.next();
                        if (ki0Var != null) {
                            WindowManager.LayoutParams layoutParams2 = ki0Var.b;
                            View view = ki0Var.a;
                            if (view != null && view.getVisibility() == 0) {
                                if (!T && layoutParams != null) {
                                    try {
                                        if (Math.abs(layoutParams2.type - layoutParams.type) != 1) {
                                            break;
                                        }
                                    } catch (Exception e2) {
                                        exc = e2;
                                        printWriter2 = printWriter;
                                        printWriter2.println("Failure in view hierarchy dump: " + exc.getMessage());
                                        return true;
                                    }
                                }
                                String str2 = str + "  ";
                                View view2 = ki0Var.a;
                                printWriter2 = printWriter;
                                try {
                                    oshVar.B(str2, printWriter2, view2, 0, 0, T3, T4);
                                    if (T2) {
                                        break;
                                    }
                                    layoutParams = layoutParams2;
                                    printWriter = printWriter2;
                                } catch (Exception e3) {
                                    e = e3;
                                    exc = e;
                                    printWriter2.println("Failure in view hierarchy dump: " + exc.getMessage());
                                    return true;
                                }
                            }
                        }
                        printWriter2 = printWriter;
                        printWriter = printWriter2;
                    }
                    printWriter2 = printWriter;
                    ((le3) oshVar.b).c(printWriter2);
                }
            } catch (Exception e4) {
                e = e4;
                printWriter2 = printWriter;
            }
        }
        return true;
    }

    public static void b0(PrintWriter printWriter, View view) {
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            tag = null;
        }
        String str = (String) tag;
        if (str == null || str.length() == 0) {
            return;
        }
        printWriter.print(" app:tag/");
        printWriter.print(V(60, str));
    }

    public static void c0() {
        File[] fileArr;
        if (gvt.B()) {
            return;
        }
        File m0 = zsd.m0();
        if (m0 != null) {
            fileArr = m0.listFiles(ngb.e);
            if (fileArr == null) {
                fileArr = new File[0];
            }
        } else {
            fileArr = new File[0];
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            arrayList.add(ox6.I(file));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((dpe) next).a()) {
                arrayList2.add(next);
            }
        }
        List o0 = CollectionsKt.o0(arrayList2, C1318t.d);
        JSONArray jSONArray = new JSONArray();
        ype it2 = yhn.m(0, Math.min(o0.size(), 5)).iterator();
        while (it2.c) {
            jSONArray.put(o0.get(it2.nextInt()));
        }
        zsd.A0("crash_reports", jSONArray, new s(o0, 1));
    }

    @Override // defpackage.v3q
    public Object A(p3q p3qVar) {
        p3qVar.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object B(aaq aaqVar) {
        aaqVar.getClass();
        if (aaqVar instanceof x9q) {
            x9q x9qVar = (x9q) aaqVar;
            return ouj.o(x9qVar.s(), StringUtils.PROCESS_POSTFIX_DELIMITER, x9qVar.a());
        }
        if ((aaqVar instanceof t9q) || (aaqVar instanceof u9q) || aaqVar.equals(y9q.a) || (aaqVar instanceof hbq) || (aaqVar instanceof uaq) || (aaqVar instanceof caq) || (aaqVar instanceof paq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.xeg
    public long C(j4x j4xVar) {
        Throwable th = (IOException) j4xVar.c;
        if ((th instanceof r7k) || (th instanceof FileNotFoundException) || (th instanceof e6e) || (th instanceof lgg)) {
            return -9223372036854775807L;
        }
        while (th != null) {
            if ((th instanceof hb7) && ((hb7) th).a == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((j4xVar.b - 1) * 1000, ScreenMirroringConfig.Test.pcVideoUdpPort);
    }

    @Override // defpackage.b0q
    public Object D(yc5 yc5Var) {
        yc5Var.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object E(e5q e5qVar) {
        e5qVar.getClass();
        if (e5qVar instanceof u4q) {
            return ((u4q) e5qVar).e;
        }
        if (e5qVar instanceof s4q) {
            return ((s4q) e5qVar).e;
        }
        if (e5qVar instanceof w4q) {
            return ((w4q) e5qVar).e;
        }
        if (e5qVar instanceof y4q) {
            return p4q.b;
        }
        if (e5qVar instanceof b5q) {
            return p4q.b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.b0q
    public Object F(doc docVar) {
        docVar.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object G(xc5 xc5Var) {
        xc5Var.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object H(l3q l3qVar) {
        l3qVar.getClass();
        return null;
    }

    @Override // defpackage.dup
    public ocg I(long j2, xof xofVar, jx7 jx7Var) {
        xofVar.getClass();
        jx7Var.getClass();
        float d2 = nmq.d(j2);
        float b2 = nmq.b(j2);
        jx7Var.n0(6);
        nh0 a = ph0.a();
        float f2 = 0.3028f * d2;
        a.f(f2, 0.0f);
        float f3 = 0.05739f * b2;
        float f4 = 0.09508f * b2;
        float f5 = 0.5051f * d2;
        a.c(0.3468f * d2, f3, 0.42099f * d2, f4, f5, f4);
        a.c(0.58922f * d2, f4, 0.6634f * d2, f3, 0.70742f * d2, 0.0f);
        float f6 = 0.99296f * d2;
        a.e(f6, 0.0f);
        float f7 = b2 * 1.0f;
        a.e(f6, f7);
        a.e(0.70763f * d2, f7);
        float f8 = 0.90465f * b2;
        a.c(0.66366f * d2, 0.94245f * b2, 0.58935f * d2, f8, f5, f8);
        a.c(0.42085f * d2, f8, 0.34656f * d2, 0.94246f * b2, 0.30258f * d2, f7);
        float f9 = 0.00704f * d2;
        a.e(f9, f7);
        a.e(f9, 0.58859f * b2);
        float f10 = 0.08902f * d2;
        float f11 = 0.42609f * b2;
        float f12 = 0.19014f * d2;
        a.c(f9, 0.49884f * b2, f10, f11, f12, f11);
        float f13 = b2 * 0.37937f;
        a.e(f12, f13);
        a.c(f10, f13, f9, b2 * 0.30662f, f9, b2 * 0.21687f);
        float f14 = b2 * 0.0f;
        a.e(f9, f14);
        a.e(f2, f14);
        a.b();
        return new zxj(a);
    }

    @Override // defpackage.w8n
    public Object J(igr igrVar) {
        return Boolean.valueOf(igrVar.e);
    }

    @Override // defpackage.v3q
    public Object K(j3q j3qVar) {
        j3qVar.getClass();
        return null;
    }

    @Override // defpackage.xeg
    public mdr L(weg wegVar, j4x j4xVar) {
        IOException iOException = (IOException) j4xVar.c;
        if (!(iOException instanceof i6e)) {
            return null;
        }
        int i2 = ((i6e) iOException).d;
        if (i2 != 403 && i2 != 404 && i2 != 410 && i2 != 416 && i2 != 500 && i2 != 503) {
            return null;
        }
        if (wegVar.a(1)) {
            return new mdr(1, 300000L);
        }
        if (wegVar.a(2)) {
            return new mdr(2, 60000L);
        }
        return null;
    }

    @Override // defpackage.b0q
    public Object M(g1q g1qVar) {
        g1qVar.getClass();
        if ((g1qVar instanceof d1q) || (g1qVar instanceof f1q) || (g1qVar instanceof i1q) || (g1qVar instanceof l1q)) {
            return null;
        }
        if (g1qVar instanceof s1q) {
            return ((s1q) g1qVar).a.d();
        }
        if ((g1qVar instanceof v1q) || (g1qVar instanceof b2q)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.b0q
    public Object N(cd5 cd5Var) {
        cd5Var.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object O(z3q z3qVar) {
        z3qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object P(f5q f5qVar) {
        f5qVar.getClass();
        if (f5qVar instanceof bbq) {
            bbq bbqVar = (bbq) f5qVar;
            if (bbqVar instanceof abq) {
                return ((abq) bbqVar).e;
            }
            if (bbqVar instanceof xaq) {
                return p4q.b;
            }
            b6e.s();
            return null;
        }
        if ((f5qVar instanceof s9q) || (f5qVar instanceof baq) || (f5qVar instanceof oaq) || (f5qVar instanceof taq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w8n
    public Object Q(se5 se5Var) {
        return Boolean.valueOf(se5Var.l);
    }

    @Override // defpackage.b0q
    public Object R(w3d w3dVar) {
        w3dVar.getClass();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        if (r29 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0119, code lost:
    
        if (r29 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void S(vne vneVar, long j2, long j3, jdp jdpVar, boolean z, wn5 wn5Var, hq5 hq5Var, int i2) {
        float f2;
        int ordinal;
        float f3;
        int ordinal2;
        float f4;
        int ordinal3;
        boolean f5;
        Object K;
        boolean f6;
        Object K2;
        gx3 gx3Var = gx3.J;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1988729962);
        int i3 = i2 | (oq5Var.f(vneVar) ? 4 : 2) | (oq5Var.e(j2) ? 32 : 16) | (oq5Var.e(j3) ? 256 : 128) | (oq5Var.h(jdpVar) ? 2048 : 1024) | (oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            d8t e2 = i8t.e(vneVar, "TextFieldInputState", oq5Var, (i3 & 14) | 48, 0);
            x6k x6kVar = e2.d;
            oct octVar = azt.a;
            vne vneVar2 = (vne) e2.c();
            oq5Var.Z(-1158004136);
            int ordinal4 = vneVar2.ordinal();
            float f7 = 0.0f;
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    f2 = 0.0f;
                    oq5Var.p(false);
                    Float valueOf = Float.valueOf(f2);
                    vne vneVar3 = (vne) x6kVar.getValue();
                    oq5Var.Z(-1158004136);
                    ordinal = vneVar3.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f3 = 0.0f;
                            oq5Var.p(false);
                            Float valueOf2 = Float.valueOf(f3);
                            e2.f();
                            oq5Var.Z(-611722692);
                            act S = weo.S(150, 0, null, 6);
                            oq5Var.p(false);
                            z7t c2 = i8t.c(e2, valueOf, valueOf2, S, octVar, oq5Var, 196608);
                            ag0 ag0Var = ag0.C;
                            vne vneVar4 = (vne) e2.c();
                            oq5Var.Z(-1376159017);
                            ordinal2 = vneVar4.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        b6e.s();
                                        return;
                                    }
                                }
                                f4 = 0.0f;
                                oq5Var.p(false);
                                Float valueOf3 = Float.valueOf(f4);
                                vne vneVar5 = (vne) x6kVar.getValue();
                                oq5Var.Z(-1376159017);
                                ordinal3 = vneVar5.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            b6e.s();
                                            return;
                                        }
                                    }
                                    oq5Var.p(false);
                                    z7t c3 = i8t.c(e2, valueOf3, Float.valueOf(f7), (wdc) ag0Var.invoke(e2.f(), oq5Var, 0), octVar, oq5Var, 196608);
                                    vne vneVar6 = (vne) x6kVar.getValue();
                                    oq5Var.Z(-1490209928);
                                    int[] iArr = wbs.a;
                                    long j4 = iArr[vneVar6.ordinal()] == 1 ? j2 : j3;
                                    oq5Var.p(false);
                                    l95 f8 = d85.f(j4);
                                    f5 = oq5Var.f(f8);
                                    K = oq5Var.K();
                                    kjn kjnVar = gq5.a;
                                    if (!f5 || K == kjnVar) {
                                        K = new oct(gx3Var, new m40(23, f8));
                                        oq5Var.k0(K);
                                    }
                                    oct octVar2 = (oct) K;
                                    vne vneVar7 = (vne) e2.c();
                                    oq5Var.Z(-1490209928);
                                    d85 f9 = k5r.f(oq5Var, false, iArr[vneVar7.ordinal()] == 1 ? j2 : j3);
                                    vne vneVar8 = (vne) x6kVar.getValue();
                                    oq5Var.Z(-1490209928);
                                    long j5 = iArr[vneVar8.ordinal()] == 1 ? j2 : j3;
                                    oq5Var.p(false);
                                    d85 d85Var = new d85(j5);
                                    e2.f();
                                    oq5Var.Z(-130058045);
                                    act S2 = weo.S(150, 0, null, 6);
                                    oq5Var.p(false);
                                    z7t c4 = i8t.c(e2, f9, d85Var, S2, octVar2, oq5Var, 196608);
                                    int i4 = (i3 & 7168) | 384;
                                    l95 f10 = d85.f(((d85) jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf((i4 >> 6) & 112))).a);
                                    f6 = oq5Var.f(f10);
                                    K2 = oq5Var.K();
                                    if (!f6 || K2 == kjnVar) {
                                        K2 = new oct(gx3Var, new m40(23, f10));
                                        oq5Var.k0(K2);
                                    }
                                    oct octVar3 = (oct) K2;
                                    int i5 = ((((i4 << 3) & 57344) | 3072) >> 9) & 112;
                                    Object invoke = jdpVar.invoke(e2.c(), oq5Var, Integer.valueOf(i5));
                                    Object invoke2 = jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf(i5));
                                    e2.f();
                                    oq5Var.Z(-32667848);
                                    act S3 = weo.S(150, 0, null, 6);
                                    oq5Var.p(false);
                                    wn5Var.b(Float.valueOf(((Number) c2.h.getValue()).floatValue()), new d85(((d85) c4.h.getValue()).a), new d85(((d85) i8t.c(e2, invoke, invoke2, S3, octVar3, oq5Var, 196608).h.getValue()).a), Float.valueOf(((Number) c3.h.getValue()).floatValue()), oq5Var, 24576);
                                }
                                f7 = 1.0f;
                                oq5Var.p(false);
                                z7t c32 = i8t.c(e2, valueOf3, Float.valueOf(f7), (wdc) ag0Var.invoke(e2.f(), oq5Var, 0), octVar, oq5Var, 196608);
                                vne vneVar62 = (vne) x6kVar.getValue();
                                oq5Var.Z(-1490209928);
                                int[] iArr2 = wbs.a;
                                if (iArr2[vneVar62.ordinal()] == 1) {
                                }
                                oq5Var.p(false);
                                l95 f82 = d85.f(j4);
                                f5 = oq5Var.f(f82);
                                K = oq5Var.K();
                                kjn kjnVar2 = gq5.a;
                                if (!f5) {
                                }
                                K = new oct(gx3Var, new m40(23, f82));
                                oq5Var.k0(K);
                                oct octVar22 = (oct) K;
                                vne vneVar72 = (vne) e2.c();
                                oq5Var.Z(-1490209928);
                                d85 f92 = k5r.f(oq5Var, false, iArr2[vneVar72.ordinal()] == 1 ? j2 : j3);
                                vne vneVar82 = (vne) x6kVar.getValue();
                                oq5Var.Z(-1490209928);
                                if (iArr2[vneVar82.ordinal()] == 1) {
                                }
                                oq5Var.p(false);
                                d85 d85Var2 = new d85(j5);
                                e2.f();
                                oq5Var.Z(-130058045);
                                act S22 = weo.S(150, 0, null, 6);
                                oq5Var.p(false);
                                z7t c42 = i8t.c(e2, f92, d85Var2, S22, octVar22, oq5Var, 196608);
                                int i42 = (i3 & 7168) | 384;
                                l95 f102 = d85.f(((d85) jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf((i42 >> 6) & 112))).a);
                                f6 = oq5Var.f(f102);
                                K2 = oq5Var.K();
                                if (!f6) {
                                }
                                K2 = new oct(gx3Var, new m40(23, f102));
                                oq5Var.k0(K2);
                                oct octVar32 = (oct) K2;
                                int i52 = ((((i42 << 3) & 57344) | 3072) >> 9) & 112;
                                Object invoke3 = jdpVar.invoke(e2.c(), oq5Var, Integer.valueOf(i52));
                                Object invoke22 = jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf(i52));
                                e2.f();
                                oq5Var.Z(-32667848);
                                act S32 = weo.S(150, 0, null, 6);
                                oq5Var.p(false);
                                wn5Var.b(Float.valueOf(((Number) c2.h.getValue()).floatValue()), new d85(((d85) c42.h.getValue()).a), new d85(((d85) i8t.c(e2, invoke3, invoke22, S32, octVar32, oq5Var, 196608).h.getValue()).a), Float.valueOf(((Number) c32.h.getValue()).floatValue()), oq5Var, 24576);
                            }
                            f4 = 1.0f;
                            oq5Var.p(false);
                            Float valueOf32 = Float.valueOf(f4);
                            vne vneVar52 = (vne) x6kVar.getValue();
                            oq5Var.Z(-1376159017);
                            ordinal3 = vneVar52.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f7 = 1.0f;
                            oq5Var.p(false);
                            z7t c322 = i8t.c(e2, valueOf32, Float.valueOf(f7), (wdc) ag0Var.invoke(e2.f(), oq5Var, 0), octVar, oq5Var, 196608);
                            vne vneVar622 = (vne) x6kVar.getValue();
                            oq5Var.Z(-1490209928);
                            int[] iArr22 = wbs.a;
                            if (iArr22[vneVar622.ordinal()] == 1) {
                            }
                            oq5Var.p(false);
                            l95 f822 = d85.f(j4);
                            f5 = oq5Var.f(f822);
                            K = oq5Var.K();
                            kjn kjnVar22 = gq5.a;
                            if (!f5) {
                            }
                            K = new oct(gx3Var, new m40(23, f822));
                            oq5Var.k0(K);
                            oct octVar222 = (oct) K;
                            vne vneVar722 = (vne) e2.c();
                            oq5Var.Z(-1490209928);
                            d85 f922 = k5r.f(oq5Var, false, iArr22[vneVar722.ordinal()] == 1 ? j2 : j3);
                            vne vneVar822 = (vne) x6kVar.getValue();
                            oq5Var.Z(-1490209928);
                            if (iArr22[vneVar822.ordinal()] == 1) {
                            }
                            oq5Var.p(false);
                            d85 d85Var22 = new d85(j5);
                            e2.f();
                            oq5Var.Z(-130058045);
                            act S222 = weo.S(150, 0, null, 6);
                            oq5Var.p(false);
                            z7t c422 = i8t.c(e2, f922, d85Var22, S222, octVar222, oq5Var, 196608);
                            int i422 = (i3 & 7168) | 384;
                            l95 f1022 = d85.f(((d85) jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf((i422 >> 6) & 112))).a);
                            f6 = oq5Var.f(f1022);
                            K2 = oq5Var.K();
                            if (!f6) {
                            }
                            K2 = new oct(gx3Var, new m40(23, f1022));
                            oq5Var.k0(K2);
                            oct octVar322 = (oct) K2;
                            int i522 = ((((i422 << 3) & 57344) | 3072) >> 9) & 112;
                            Object invoke32 = jdpVar.invoke(e2.c(), oq5Var, Integer.valueOf(i522));
                            Object invoke222 = jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf(i522));
                            e2.f();
                            oq5Var.Z(-32667848);
                            act S322 = weo.S(150, 0, null, 6);
                            oq5Var.p(false);
                            wn5Var.b(Float.valueOf(((Number) c2.h.getValue()).floatValue()), new d85(((d85) c422.h.getValue()).a), new d85(((d85) i8t.c(e2, invoke32, invoke222, S322, octVar322, oq5Var, 196608).h.getValue()).a), Float.valueOf(((Number) c322.h.getValue()).floatValue()), oq5Var, 24576);
                        } else if (ordinal != 2) {
                            b6e.s();
                            return;
                        }
                    }
                    f3 = 1.0f;
                    oq5Var.p(false);
                    Float valueOf22 = Float.valueOf(f3);
                    e2.f();
                    oq5Var.Z(-611722692);
                    act S4 = weo.S(150, 0, null, 6);
                    oq5Var.p(false);
                    z7t c22 = i8t.c(e2, valueOf, valueOf22, S4, octVar, oq5Var, 196608);
                    ag0 ag0Var2 = ag0.C;
                    vne vneVar42 = (vne) e2.c();
                    oq5Var.Z(-1376159017);
                    ordinal2 = vneVar42.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f4 = 1.0f;
                    oq5Var.p(false);
                    Float valueOf322 = Float.valueOf(f4);
                    vne vneVar522 = (vne) x6kVar.getValue();
                    oq5Var.Z(-1376159017);
                    ordinal3 = vneVar522.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f7 = 1.0f;
                    oq5Var.p(false);
                    z7t c3222 = i8t.c(e2, valueOf322, Float.valueOf(f7), (wdc) ag0Var2.invoke(e2.f(), oq5Var, 0), octVar, oq5Var, 196608);
                    vne vneVar6222 = (vne) x6kVar.getValue();
                    oq5Var.Z(-1490209928);
                    int[] iArr222 = wbs.a;
                    if (iArr222[vneVar6222.ordinal()] == 1) {
                    }
                    oq5Var.p(false);
                    l95 f8222 = d85.f(j4);
                    f5 = oq5Var.f(f8222);
                    K = oq5Var.K();
                    kjn kjnVar222 = gq5.a;
                    if (!f5) {
                    }
                    K = new oct(gx3Var, new m40(23, f8222));
                    oq5Var.k0(K);
                    oct octVar2222 = (oct) K;
                    vne vneVar7222 = (vne) e2.c();
                    oq5Var.Z(-1490209928);
                    d85 f9222 = k5r.f(oq5Var, false, iArr222[vneVar7222.ordinal()] == 1 ? j2 : j3);
                    vne vneVar8222 = (vne) x6kVar.getValue();
                    oq5Var.Z(-1490209928);
                    if (iArr222[vneVar8222.ordinal()] == 1) {
                    }
                    oq5Var.p(false);
                    d85 d85Var222 = new d85(j5);
                    e2.f();
                    oq5Var.Z(-130058045);
                    act S2222 = weo.S(150, 0, null, 6);
                    oq5Var.p(false);
                    z7t c4222 = i8t.c(e2, f9222, d85Var222, S2222, octVar2222, oq5Var, 196608);
                    int i4222 = (i3 & 7168) | 384;
                    l95 f10222 = d85.f(((d85) jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf((i4222 >> 6) & 112))).a);
                    f6 = oq5Var.f(f10222);
                    K2 = oq5Var.K();
                    if (!f6) {
                    }
                    K2 = new oct(gx3Var, new m40(23, f10222));
                    oq5Var.k0(K2);
                    oct octVar3222 = (oct) K2;
                    int i5222 = ((((i4222 << 3) & 57344) | 3072) >> 9) & 112;
                    Object invoke322 = jdpVar.invoke(e2.c(), oq5Var, Integer.valueOf(i5222));
                    Object invoke2222 = jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf(i5222));
                    e2.f();
                    oq5Var.Z(-32667848);
                    act S3222 = weo.S(150, 0, null, 6);
                    oq5Var.p(false);
                    wn5Var.b(Float.valueOf(((Number) c22.h.getValue()).floatValue()), new d85(((d85) c4222.h.getValue()).a), new d85(((d85) i8t.c(e2, invoke322, invoke2222, S3222, octVar3222, oq5Var, 196608).h.getValue()).a), Float.valueOf(((Number) c3222.h.getValue()).floatValue()), oq5Var, 24576);
                } else if (ordinal4 != 2) {
                    b6e.s();
                    return;
                }
            }
            f2 = 1.0f;
            oq5Var.p(false);
            Float valueOf4 = Float.valueOf(f2);
            vne vneVar32 = (vne) x6kVar.getValue();
            oq5Var.Z(-1158004136);
            ordinal = vneVar32.ordinal();
            if (ordinal != 0) {
            }
            f3 = 1.0f;
            oq5Var.p(false);
            Float valueOf222 = Float.valueOf(f3);
            e2.f();
            oq5Var.Z(-611722692);
            act S42 = weo.S(150, 0, null, 6);
            oq5Var.p(false);
            z7t c222 = i8t.c(e2, valueOf4, valueOf222, S42, octVar, oq5Var, 196608);
            ag0 ag0Var22 = ag0.C;
            vne vneVar422 = (vne) e2.c();
            oq5Var.Z(-1376159017);
            ordinal2 = vneVar422.ordinal();
            if (ordinal2 != 0) {
            }
            f4 = 1.0f;
            oq5Var.p(false);
            Float valueOf3222 = Float.valueOf(f4);
            vne vneVar5222 = (vne) x6kVar.getValue();
            oq5Var.Z(-1376159017);
            ordinal3 = vneVar5222.ordinal();
            if (ordinal3 != 0) {
            }
            f7 = 1.0f;
            oq5Var.p(false);
            z7t c32222 = i8t.c(e2, valueOf3222, Float.valueOf(f7), (wdc) ag0Var22.invoke(e2.f(), oq5Var, 0), octVar, oq5Var, 196608);
            vne vneVar62222 = (vne) x6kVar.getValue();
            oq5Var.Z(-1490209928);
            int[] iArr2222 = wbs.a;
            if (iArr2222[vneVar62222.ordinal()] == 1) {
            }
            oq5Var.p(false);
            l95 f82222 = d85.f(j4);
            f5 = oq5Var.f(f82222);
            K = oq5Var.K();
            kjn kjnVar2222 = gq5.a;
            if (!f5) {
            }
            K = new oct(gx3Var, new m40(23, f82222));
            oq5Var.k0(K);
            oct octVar22222 = (oct) K;
            vne vneVar72222 = (vne) e2.c();
            oq5Var.Z(-1490209928);
            d85 f92222 = k5r.f(oq5Var, false, iArr2222[vneVar72222.ordinal()] == 1 ? j2 : j3);
            vne vneVar82222 = (vne) x6kVar.getValue();
            oq5Var.Z(-1490209928);
            if (iArr2222[vneVar82222.ordinal()] == 1) {
            }
            oq5Var.p(false);
            d85 d85Var2222 = new d85(j5);
            e2.f();
            oq5Var.Z(-130058045);
            act S22222 = weo.S(150, 0, null, 6);
            oq5Var.p(false);
            z7t c42222 = i8t.c(e2, f92222, d85Var2222, S22222, octVar22222, oq5Var, 196608);
            int i42222 = (i3 & 7168) | 384;
            l95 f102222 = d85.f(((d85) jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf((i42222 >> 6) & 112))).a);
            f6 = oq5Var.f(f102222);
            K2 = oq5Var.K();
            if (!f6) {
            }
            K2 = new oct(gx3Var, new m40(23, f102222));
            oq5Var.k0(K2);
            oct octVar32222 = (oct) K2;
            int i52222 = ((((i42222 << 3) & 57344) | 3072) >> 9) & 112;
            Object invoke3222 = jdpVar.invoke(e2.c(), oq5Var, Integer.valueOf(i52222));
            Object invoke22222 = jdpVar.invoke(x6kVar.getValue(), oq5Var, Integer.valueOf(i52222));
            e2.f();
            oq5Var.Z(-32667848);
            act S32222 = weo.S(150, 0, null, 6);
            oq5Var.p(false);
            wn5Var.b(Float.valueOf(((Number) c222.h.getValue()).floatValue()), new d85(((d85) c42222.h.getValue()).a), new d85(((d85) i8t.c(e2, invoke3222, invoke22222, S32222, octVar32222, oq5Var, 196608).h.getValue()).a), Float.valueOf(((Number) c32222.h.getValue()).floatValue()), oq5Var, 24576);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vbs(this, vneVar, j2, j3, jdpVar, z, wn5Var, i2);
        }
    }

    public int X(int i2) {
        return 0;
    }

    @Override // defpackage.cm3
    public Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.w8n
    public Object b(uid uidVar) {
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = w9l.a;
        return r5d.b;
    }

    @Override // defpackage.xij
    public ajj call() {
        return new djj();
    }

    @Override // defpackage.b0q
    public Object d(w6u w6uVar) {
        w6uVar.getClass();
        return null;
    }

    @Override // defpackage.dna
    public Object e(pfm pfmVar, ak0 ak0Var, woa woaVar, woa woaVar2, Function2 function2, xoa xoaVar) {
        float f2 = wna.a;
        Object v = xee.v(pfmVar, new ona(ak0Var, woaVar, woaVar2, function2, null), xoaVar);
        nm6 nm6Var = nm6.a;
        if (v != nm6Var) {
            v = Unit.a;
        }
        return v == nm6Var ? v : Unit.a;
    }

    @Override // defpackage.q3c
    public Object f() {
        return new ArrayList();
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return r5d.f;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = w9l.a;
        return r5d.b;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return r5d.e;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return r5d.d;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = w9l.a;
        return r5d.b;
    }

    @Override // defpackage.cm3
    public Object l(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        throw null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return szuVar.m();
    }

    @Override // defpackage.w8n
    public Object o(u4d u4dVar) {
        return Boolean.FALSE;
    }

    @Override // defpackage.v3q
    public Object p(x3q x3qVar) {
        x3qVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return y4dVar.b.b.b;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            return ((jbq) maqVar).c;
        }
        if (maqVar instanceof vaq) {
            return ((vaq) maqVar).e;
        }
        if (maqVar instanceof eaq) {
            return ((eaq) maqVar).d.c().b;
        }
        if (maqVar instanceof raq) {
            return new gxc("", weo.t());
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.xeg
    public int r(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    @Override // defpackage.b0q
    public Object s(d0t d0tVar) {
        d0tVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return new gxc("", weo.t());
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return u7uVar.m;
    }

    @Override // defpackage.v3q
    public Object v(m3q m3qVar) {
        m3qVar.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object w(bd5 bd5Var) {
        bd5Var.getClass();
        return bd5Var.getId();
    }

    @Override // defpackage.b0q
    public Object x(aou aouVar) {
        aouVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object y(y3q y3qVar) {
        y3qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object z(m4q m4qVar) {
        m4qVar.getClass();
        return null;
    }

    public void U(LinkedList linkedList) {
    }

    public void Y(int i2) {
    }
}
