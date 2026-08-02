package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.connectsdk.service.command.ServiceCommand;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.kids.KidsCatalogActivity;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes.dex */
public final class hs4 implements upt, czc, p7q, pcm, kg3, ysb, y7e, f72, cm3, z89, r2o, oob, tft, eac, n03 {
    public static cce c;
    public static s1c d;
    public final /* synthetic */ int a;
    public static final hs4 b = new hs4(0);
    public static final hs4 e = new hs4(1);
    public static final uf0 f = new uf0();
    public static final hs4 g = new hs4(3);
    public static final hs4 h = new hs4(4);
    public static final hs4 i = new hs4(5);
    public static final hs4 j = new hs4(6);
    public static final hs4 k = new hs4(7);
    public static final hs4 l = new hs4(8);
    public static final hs4 m = new hs4(9);
    public static final /* synthetic */ hs4 n = new hs4(10);
    public static final hs4 o = new hs4(11);
    public static final hs4 p = new hs4(12);

    public /* synthetic */ hs4(int i2) {
        this.a = i2;
    }

    public static final cce C(Context context) {
        cce k2;
        cce cceVar = c;
        if (cceVar != null) {
            return cceVar;
        }
        synchronized (b) {
            cce cceVar2 = c;
            if (cceVar2 != null) {
                return cceVar2;
            }
            if (d == null || (k2 = (cce) t1c.a.getValue()) == null) {
                context.getApplicationContext();
                k2 = new mmo(context).k();
            }
            d = null;
            c = k2;
            return k2;
        }
    }

    public static Bundle v(kqt kqtVar) {
        return cxb.K(new Pair("kids.landing.focus.on.tab.id", ((vdf) kqtVar.a).Q("tab")), new Pair("kids.landing.focus.on.block.id", ((vdf) kqtVar.a).Q("block")));
    }

    public static fo7 y(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(ServiceCommand.TYPE_GET);
        httpURLConnection.connect();
        return new fo7(0, httpURLConnection);
    }

    public static h94 z(String str) {
        Object obj;
        str.getClass();
        rdb rdbVar = h94.i;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((h94) obj).a.equals(str)) {
                break;
            }
        }
        return (h94) obj;
    }

    @Override // defpackage.m6b
    public boolean A(Object obj, File file, pwj pwjVar) {
        try {
            tm3.d(((vcd) ((pcd) ((k2o) obj).get()).a.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            return false;
        }
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        yxt yxtVar;
        jxtVar.getClass();
        jxtVar2.getClass();
        yxt yxtVar2 = jxtVar2.a;
        yxt yxtVar3 = jxtVar.a;
        if (yxtVar3 != yxt.String_ || yxtVar2 != (yxtVar = yxt.Map)) {
            throw new mac(yxtVar3, yxtVar2);
        }
        if (yxtVar2 == yxtVar) {
            throw new ClassCastException();
        }
        throw new mac(jxtVar2, yxtVar);
    }

    @Override // defpackage.cm3
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.y7e
    public /* bridge */ /* synthetic */ Object f(Map map) {
        return Boolean.TRUE;
    }

    @Override // defpackage.tft
    public Intent g(Intent intent, Context context, Intent intent2, kqt kqtVar) {
        intent.getClass();
        kqtVar.getClass();
        super.g(intent, context, intent2, kqtVar);
        return p(context, intent2, kqtVar);
    }

    @Override // defpackage.kg3
    public long h(idp idpVar, int i2) {
        String str = idpVar.f.a.a.b;
        return y5g.P(ngg.t(i2, str), ngg.s(i2, str));
    }

    @Override // defpackage.ysb
    public zsb[] i(xsb[] xsbVarArr, yk2 yk2Var) {
        int i2;
        zsb kkVar;
        int i3;
        int[] iArr;
        int i4;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i2 = 1;
            if (i6 >= xsbVarArr.length) {
                break;
            }
            xsb xsbVar = xsbVarArr[i6];
            if (xsbVar == null || xsbVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                tde u = yde.u();
                u.a(new jk(0L, 0L));
                arrayList.add(u);
            }
            i6++;
        }
        int length = xsbVarArr.length;
        long[][] jArr = new long[length][];
        for (int i7 = 0; i7 < xsbVarArr.length; i7++) {
            xsb xsbVar2 = xsbVarArr[i7];
            if (xsbVar2 == null) {
                jArr[i7] = new long[0];
            } else {
                int[] iArr2 = xsbVar2.b;
                jArr[i7] = new long[iArr2.length];
                for (int i8 = 0; i8 < iArr2.length; i8++) {
                    long j2 = xsbVar2.a.d[iArr2[i8]].j;
                    long[] jArr2 = jArr[i7];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i8] = j2;
                }
                Arrays.sort(jArr[i7]);
            }
        }
        int[] iArr3 = new int[length];
        long[] jArr3 = new long[length];
        for (int i9 = 0; i9 < length; i9++) {
            long[] jArr4 = jArr[i9];
            jArr3[i9] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        kk.w(arrayList, jArr3);
        hld.w(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(dxi.a);
        xgi xgiVar = new xgi();
        ygi ygiVar = new ygi(treeMap);
        ygiVar.f = xgiVar;
        int i10 = 0;
        while (i10 < length) {
            long[] jArr5 = jArr[i10];
            if (jArr5.length <= i2) {
                i3 = i5;
                i4 = i2;
                iArr = iArr3;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i11 = i5;
                while (true) {
                    long[] jArr6 = jArr[i10];
                    i3 = i5;
                    double d2 = 0.0d;
                    if (i11 >= jArr6.length) {
                        break;
                    }
                    int i12 = i2;
                    int[] iArr4 = iArr3;
                    long j3 = jArr6[i11];
                    if (j3 != -1) {
                        d2 = Math.log(j3);
                    }
                    dArr[i11] = d2;
                    i11++;
                    i2 = i12;
                    i5 = i3;
                    iArr3 = iArr4;
                }
                int i13 = i2;
                iArr = iArr3;
                int i14 = length2 - 1;
                double d3 = dArr[i14] - dArr[i3];
                int i15 = i3;
                while (i15 < i14) {
                    double d4 = dArr[i15];
                    i15++;
                    ygiVar.h(Double.valueOf(d3 == 0.0d ? 1.0d : (((d4 + dArr[i15]) * 0.5d) - dArr[i3]) / d3), Integer.valueOf(i10));
                    i13 = i13;
                }
                i4 = i13;
            }
            i10++;
            i5 = i3;
            iArr3 = iArr;
            i2 = i4;
        }
        int i16 = i5;
        int[] iArr5 = iArr3;
        yde v = yde.v(ygiVar.g());
        for (int i17 = i16; i17 < v.size(); i17++) {
            int intValue = ((Integer) v.get(i17)).intValue();
            int i18 = iArr5[intValue] + 1;
            iArr5[intValue] = i18;
            jArr3[intValue] = jArr[intValue][i18];
            kk.w(arrayList, jArr3);
        }
        for (int i19 = i16; i19 < xsbVarArr.length; i19++) {
            if (arrayList.get(i19) != null) {
                jArr3[i19] = jArr3[i19] * 2;
            }
        }
        kk.w(arrayList, jArr3);
        tde u2 = yde.u();
        for (int i20 = i16; i20 < arrayList.size(); i20++) {
            tde tdeVar = (tde) arrayList.get(i20);
            u2.a(tdeVar == null ? qsn.e : tdeVar.f());
        }
        qsn f2 = u2.f();
        zsb[] zsbVarArr = new zsb[xsbVarArr.length];
        for (int i21 = 0; i21 < xsbVarArr.length; i21++) {
            xsb xsbVar3 = xsbVarArr[i21];
            if (xsbVar3 != null) {
                int[] iArr6 = xsbVar3.b;
                if (iArr6.length != 0) {
                    int length3 = iArr6.length;
                    xvs xvsVar = xsbVar3.a;
                    if (length3 == 1) {
                        kkVar = new mgc(xvsVar, iArr6[0]);
                    } else {
                        long j4 = 25000;
                        kkVar = new kk(xvsVar, iArr6, yk2Var, 10000, j4, j4, (yde) f2.get(i21));
                    }
                    zsbVarArr[i21] = kkVar;
                }
            }
        }
        return zsbVarArr;
    }

    @Override // defpackage.eac
    public String j() {
        return null;
    }

    @Override // defpackage.cm3
    public Object l(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 5:
                iocVar.getClass();
                return Boolean.FALSE;
            default:
                iocVar.getClass();
                return new gxj(0);
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 5:
                szuVar.getClass();
                return Boolean.FALSE;
            default:
                szuVar.getClass();
                return new gxj(szuVar.h());
        }
    }

    @Override // defpackage.f72
    public void o(rsr rsrVar) {
        rsrVar.getClass();
        rsrVar.execSQL("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // defpackage.tft
    public Intent p(Context context, Intent intent, kqt kqtVar) {
        kqtVar.getClass();
        int i2 = kqtVar.c;
        ypt yptVar = kqtVar.a;
        if (i2 != 1) {
            Intent t = w1g.t(context, intent, kqtVar);
            if (t != null) {
                return t;
            }
            Intent z = StubActivity.z(context, rpt.NOT_FOUND);
            z.getClass();
            return z;
        }
        jyr jyrVar = o5j.e;
        if (tyf.v()) {
            vdf vdfVar = (vdf) yptVar;
            String Q = vdfVar.Q("tab");
            String Q2 = vdfVar.Q("block");
            jyr jyrVar2 = KidsCatalogActivity.Y;
            return xv.N(context, Q, Q2);
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(wst.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        wst wstVar = (wst) qdcVar.C(I);
        if (((Boolean) wstVar.a(wstVar.b.c()).f(pff.e)).booleanValue()) {
            lhs lhsVar = MainScreenActivity.Q0;
            return imp.J(context, rf3.k, v(kqtVar), null, 8);
        }
        jyr jyrVar3 = KidsCatalogActivity.Y;
        Bundle v = v(kqtVar);
        Intent intent2 = new Intent(context, (Class<?>) KidsCatalogActivity.class);
        intent2.putExtra("key.extra.args", v);
        return intent2;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 5:
                y4dVar.getClass();
                return Boolean.FALSE;
            default:
                y4dVar.getClass();
                return new gxj(0);
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        int i2;
        switch (this.a) {
            case 5:
                maqVar.getClass();
                return Boolean.TRUE;
            default:
                maqVar.getClass();
                if (maqVar instanceof jbq) {
                    i2 = ((jbq) maqVar).j;
                } else {
                    if (!(maqVar instanceof vaq) && !(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                        b6e.s();
                        return null;
                    }
                    i2 = maqVar.i();
                }
                return new gxj(i2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.czc
    public oyc r(String str, ArrayList arrayList) {
        kb5 kb5Var = kb5.Z;
        iyc iycVar = iyc.g;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    dz0 dz0Var = dz0.a;
                    if (!dz0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        uc3 uc3Var = uc3.a;
                        if (!uc3Var.g(arrayList, kb5Var).equals(iycVar)) {
                            z95 z95Var = z95.a;
                            if (!z95Var.g(arrayList, kb5Var).equals(iycVar)) {
                                g28 g28Var = g28.a;
                                if (!g28Var.g(arrayList, kb5Var).equals(iycVar)) {
                                    cre creVar = cre.a;
                                    if (!creVar.g(arrayList, kb5Var).equals(iycVar)) {
                                        chj chjVar = chj.a;
                                        if (!chjVar.g(arrayList, kb5Var).equals(iycVar)) {
                                            zkr zkrVar = zkr.a;
                                            if (!zkrVar.g(arrayList, kb5Var).equals(iycVar)) {
                                                hqt hqtVar = hqt.a;
                                                if (!hqtVar.g(arrayList, kb5Var).equals(iycVar)) {
                                                    if (!dz0Var.i(arrayList).equals(iycVar)) {
                                                        if (!uc3Var.i(arrayList).equals(iycVar)) {
                                                            if (!z95Var.i(arrayList).equals(iycVar)) {
                                                                if (!g28Var.i(arrayList).equals(iycVar)) {
                                                                    if (!creVar.i(arrayList).equals(iycVar)) {
                                                                        if (!chjVar.i(arrayList).equals(iycVar)) {
                                                                            if (!zkrVar.i(arrayList).equals(iycVar)) {
                                                                                if (!hqtVar.i(arrayList).equals(iycVar)) {
                                                                                    throw wct.A(str, arrayList);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return hqtVar;
                                            }
                                            return zkrVar;
                                        }
                                        return chjVar;
                                    }
                                    return creVar;
                                }
                                return g28Var;
                            }
                            return z95Var;
                        }
                        return uc3Var;
                    }
                    return dz0Var;
                }
                break;
            case -1300054776:
                if (str.equals("getInteger")) {
                    gy0 gy0Var = gy0.e;
                    if (!gy0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        v8d v8dVar = v8d.d;
                        v8dVar.getClass();
                        if (!v8dVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!gy0Var.i(arrayList).equals(iycVar)) {
                                if (!v8dVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return v8dVar;
                    }
                    return gy0Var;
                }
                break;
            case -1249348039:
                if (str.equals("getUrl")) {
                    jy0 jy0Var = jy0.e;
                    if (!jy0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        fcd fcdVar = fcd.d;
                        fcdVar.getClass();
                        if (!fcdVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!jy0Var.i(arrayList).equals(iycVar)) {
                                if (!fcdVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return fcdVar;
                    }
                    return jy0Var;
                }
                break;
            case -75598804:
                if (str.equals("getDict")) {
                    fy0 fy0Var = fy0.e;
                    if (!fy0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        r7d r7dVar = r7d.d;
                        r7dVar.getClass();
                        if (!r7dVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!fy0Var.i(arrayList).equals(iycVar)) {
                                if (!r7dVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return r7dVar;
                    }
                    return fy0Var;
                }
                break;
            case -75393430:
                if (str.equals("getKeys")) {
                    h9d h9dVar = h9d.d;
                    wct.O(h9dVar, arrayList);
                    return h9dVar;
                }
                break;
            case 208013248:
                if (str.equals("containsKey")) {
                    e28 e28Var = e28.a;
                    wct.O(e28Var, arrayList);
                    return e28Var;
                }
                break;
            case 661651007:
                if (str.equals("getNumber")) {
                    hy0 hy0Var = hy0.e;
                    if (!hy0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        s9d s9dVar = s9d.d;
                        s9dVar.getClass();
                        if (!s9dVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!hy0Var.i(arrayList).equals(iycVar)) {
                                if (!s9dVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return s9dVar;
                    }
                    return hy0Var;
                }
                break;
            case 804029191:
                if (str.equals("getString")) {
                    iy0 iy0Var = iy0.e;
                    if (!iy0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        vbd vbdVar = vbd.d;
                        vbdVar.getClass();
                        if (!vbdVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!iy0Var.i(arrayList).equals(iycVar)) {
                                if (!vbdVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return vbdVar;
                    }
                    return iy0Var;
                }
                break;
            case 872202264:
                if (str.equals("getValues")) {
                    kcd kcdVar = kcd.d;
                    wct.O(kcdVar, arrayList);
                    return kcdVar;
                }
                break;
            case 1101572082:
                if (str.equals("getBoolean")) {
                    dy0 dy0Var = dy0.e;
                    if (!dy0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        c7d c7dVar = c7d.d;
                        c7dVar.getClass();
                        if (!c7dVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!dy0Var.i(arrayList).equals(iycVar)) {
                                if (!c7dVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return c7dVar;
                    }
                    return dy0Var;
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    mqe mqeVar = mqe.b;
                    if (!mqeVar.g(arrayList, kb5Var).equals(iycVar)) {
                        kqg kqgVar = kqg.b;
                        if (!kqgVar.g(arrayList, kb5Var).equals(iycVar)) {
                            lqg lqgVar = lqg.b;
                            if (!lqgVar.g(arrayList, kb5Var).equals(iycVar)) {
                                ahj ahjVar = ahj.b;
                                if (!ahjVar.g(arrayList, kb5Var).equals(iycVar)) {
                                    if (!mqeVar.i(arrayList).equals(iycVar)) {
                                        if (!kqgVar.i(arrayList).equals(iycVar)) {
                                            if (!lqgVar.i(arrayList).equals(iycVar)) {
                                                if (!ahjVar.i(arrayList).equals(iycVar)) {
                                                    throw wct.A(str, arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return ahjVar;
                            }
                            return lqgVar;
                        }
                        return kqgVar;
                    }
                    return mqeVar;
                }
                break;
            case 1948915875:
                if (str.equals("getArray")) {
                    cy0 cy0Var = cy0.e;
                    if (!cy0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        i6d i6dVar = i6d.d;
                        i6dVar.getClass();
                        if (!i6dVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!cy0Var.i(arrayList).equals(iycVar)) {
                                if (!i6dVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return i6dVar;
                    }
                    return cy0Var;
                }
                break;
            case 1950668205:
                if (str.equals("getColor")) {
                    ey0 ey0Var = ey0.e;
                    if (!ey0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        g7d g7dVar = g7d.d;
                        g7dVar.getClass();
                        if (!g7dVar.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!ey0Var.i(arrayList).equals(iycVar)) {
                                if (!g7dVar.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return g7dVar;
                    }
                    return ey0Var;
                }
                break;
            case 2058039875:
                if (str.equals("isEmpty")) {
                    ly0 ly0Var = ly0.a;
                    if (!ly0Var.g(arrayList, kb5Var).equals(iycVar)) {
                        f28 f28Var = f28.a;
                        if (!f28Var.g(arrayList, kb5Var).equals(iycVar)) {
                            if (!ly0Var.i(arrayList).equals(iycVar)) {
                                if (!f28Var.i(arrayList).equals(iycVar)) {
                                    throw wct.A(str, arrayList);
                                }
                            }
                        }
                        return f28Var;
                    }
                    return ly0Var;
                }
                break;
        }
        kac.h(ouj.k('.', "Unknown method name: ", str), null);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.czc
    public oyc s(String str, ArrayList arrayList) {
        iyc iycVar = iyc.g;
        switch (str.hashCode()) {
            case -2129095909:
                if (str.equals("getArrayInteger")) {
                    n6d n6dVar = n6d.e;
                    wct.O(n6dVar, arrayList);
                    return n6dVar;
                }
                break;
            case -2096254100:
                if (str.equals("getArrayFromArray")) {
                    l6d l6dVar = l6d.e;
                    wct.O(l6dVar, arrayList);
                    return l6dVar;
                }
                break;
            case -2015731347:
                if (str.equals("formatDateAsUTCWithLocale")) {
                    hsc hscVar = hsc.a;
                    wct.O(hscVar, arrayList);
                    return hscVar;
                }
                break;
            case -1930505522:
                if (str.equals("getOptIntegerFromArray")) {
                    gad gadVar = gad.e;
                    wct.O(gadVar, arrayList);
                    return gadVar;
                }
                break;
            case -1919300188:
                if (str.equals("toNumber")) {
                    bre breVar = bre.a;
                    if (!Intrinsics.d(breVar.h(arrayList), iycVar)) {
                        ykr ykrVar = ykr.a;
                        if (!Intrinsics.d(ykrVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(breVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(ykrVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return ykrVar;
                    }
                    return breVar;
                }
                break;
            case -1857218874:
                if (str.equals("getIntervalTotalHours")) {
                    d9d d9dVar = d9d.a;
                    wct.O(d9dVar, arrayList);
                    return d9dVar;
                }
                break;
            case -1843679562:
                if (str.equals("getIntervalTotalWeeks")) {
                    g9d g9dVar = g9d.a;
                    wct.O(g9dVar, arrayList);
                    return g9dVar;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    dz0 dz0Var = dz0.a;
                    if (!Intrinsics.d(dz0Var.h(arrayList), iycVar)) {
                        uc3 uc3Var = uc3.a;
                        if (!Intrinsics.d(uc3Var.h(arrayList), iycVar)) {
                            z95 z95Var = z95.a;
                            if (!Intrinsics.d(z95Var.h(arrayList), iycVar)) {
                                g28 g28Var = g28.a;
                                if (!Intrinsics.d(g28Var.h(arrayList), iycVar)) {
                                    cre creVar = cre.a;
                                    if (!Intrinsics.d(creVar.h(arrayList), iycVar)) {
                                        chj chjVar = chj.a;
                                        if (!Intrinsics.d(chjVar.h(arrayList), iycVar)) {
                                            zkr zkrVar = zkr.a;
                                            if (!Intrinsics.d(zkrVar.h(arrayList), iycVar)) {
                                                hqt hqtVar = hqt.a;
                                                if (!Intrinsics.d(hqtVar.h(arrayList), iycVar)) {
                                                    if (!Intrinsics.d(dz0Var.i(arrayList), iycVar)) {
                                                        if (!Intrinsics.d(uc3Var.i(arrayList), iycVar)) {
                                                            if (!Intrinsics.d(z95Var.i(arrayList), iycVar)) {
                                                                if (!Intrinsics.d(g28Var.i(arrayList), iycVar)) {
                                                                    if (!Intrinsics.d(creVar.i(arrayList), iycVar)) {
                                                                        if (!Intrinsics.d(chjVar.i(arrayList), iycVar)) {
                                                                            if (!Intrinsics.d(zkrVar.i(arrayList), iycVar)) {
                                                                                if (!Intrinsics.d(hqtVar.i(arrayList), iycVar)) {
                                                                                    throw wct.y(str, arrayList);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return hqtVar;
                                            }
                                            return zkrVar;
                                        }
                                        return chjVar;
                                    }
                                    return creVar;
                                }
                                return g28Var;
                            }
                            return z95Var;
                        }
                        return uc3Var;
                    }
                    return dz0Var;
                }
                break;
            case -1730341801:
                if (str.equals("getDictOptInteger")) {
                    d8d d8dVar = d8d.d;
                    wct.O(d8dVar, arrayList);
                    return d8dVar;
                }
                break;
            case -1603949422:
                if (str.equals("getBooleanFromDict")) {
                    e7d e7dVar = e7d.d;
                    wct.O(e7dVar, arrayList);
                    return e7dVar;
                }
                break;
            case -1601021533:
                if (str.equals("getDictUrl")) {
                    j8d j8dVar = j8d.d;
                    wct.O(j8dVar, arrayList);
                    return j8dVar;
                }
                break;
            case -1598503635:
                if (str.equals("toBoolean")) {
                    are areVar = are.a;
                    if (!Intrinsics.d(areVar.h(arrayList), iycVar)) {
                        vkr vkrVar = vkr.a;
                        if (!Intrinsics.d(vkrVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(areVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(vkrVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return vkrVar;
                    }
                    return areVar;
                }
                break;
            case -1586214751:
                if (str.equals("getOptIntegerFromDict")) {
                    had hadVar = had.d;
                    wct.O(hadVar, arrayList);
                    return hadVar;
                }
                break;
            case -1544450268:
                if (str.equals("getOptBooleanFromArray")) {
                    y9d y9dVar = y9d.e;
                    wct.O(y9dVar, arrayList);
                    return y9dVar;
                }
                break;
            case -1536224128:
                if (str.equals("getArrayColor")) {
                    k6d k6dVar = k6d.e;
                    wct.O(k6dVar, arrayList);
                    return k6dVar;
                }
                break;
            case -1506310026:
                if (str.equals("getIntervalTotalSeconds")) {
                    f9d f9dVar = f9d.a;
                    wct.O(f9dVar, arrayList);
                    return f9dVar;
                }
                break;
            case -1436100668:
                if (str.equals("getIntervalSeconds")) {
                    b9d b9dVar = b9d.a;
                    wct.O(b9dVar, arrayList);
                    return b9dVar;
                }
                break;
            case -1288010167:
                if (str.equals("getSeconds")) {
                    fbd fbdVar = fbd.a;
                    wct.O(fbdVar, arrayList);
                    return fbdVar;
                }
                break;
            case -1249364890:
                if (str.equals("getDay")) {
                    p7d p7dVar = p7d.a;
                    wct.O(p7dVar, arrayList);
                    return p7dVar;
                }
                break;
            case -1233067443:
                if (str.equals("replaceAll")) {
                    rkr rkrVar = rkr.a;
                    wct.O(rkrVar, arrayList);
                    return rkrVar;
                }
                break;
            case -1223509624:
                if (str.equals("getStringFromArray")) {
                    wbd wbdVar = wbd.e;
                    wct.O(wbdVar, arrayList);
                    return wbdVar;
                }
                break;
            case -1192573227:
                if (str.equals("testRegex")) {
                    j9s j9sVar = j9s.a;
                    wct.O(j9sVar, arrayList);
                    return j9sVar;
                }
                break;
            case -1180629592:
                if (str.equals("toColor")) {
                    wkr wkrVar = wkr.a;
                    wct.O(wkrVar, arrayList);
                    return wkrVar;
                }
                break;
            case -1168421440:
                if (str.equals("getIntervalTotalDays")) {
                    c9d c9dVar = c9d.a;
                    wct.O(c9dVar, arrayList);
                    return c9dVar;
                }
                break;
            case -1162978502:
                if (str.equals("maxInteger")) {
                    qqe qqeVar = qqe.a;
                    wct.O(qqeVar, arrayList);
                    return qqeVar;
                }
                break;
            case -1148047119:
                if (str.equals("parseUnixTimeAsLocal")) {
                    h7k h7kVar = h7k.a;
                    wct.O(h7kVar, arrayList);
                    return h7kVar;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    xks xksVar = xks.a;
                    wct.O(xksVar, arrayList);
                    return xksVar;
                }
                break;
            case -1133026611:
                if (str.equals("formatDateAsUTC")) {
                    gsc gscVar = gsc.a;
                    wct.O(gscVar, arrayList);
                    return gscVar;
                }
                break;
            case -1131397482:
                if (str.equals("getUrlFromArray")) {
                    gcd gcdVar = gcd.e;
                    wct.O(gcdVar, arrayList);
                    return gcdVar;
                }
                break;
            case -1077888264:
                if (str.equals("getArrayOptBoolean")) {
                    q6d q6dVar = q6d.e;
                    wct.O(q6dVar, arrayList);
                    return q6dVar;
                }
                break;
            case -1072121784:
                if (str.equals("parseUnixTime")) {
                    g7k g7kVar = g7k.a;
                    wct.O(g7kVar, arrayList);
                    return g7kVar;
                }
                break;
            case -1071222151:
                if (str.equals("getArrayOptNumber")) {
                    u6d u6dVar = u6d.e;
                    wct.O(u6dVar, arrayList);
                    return u6dVar;
                }
                break;
            case -1013579358:
                if (str.equals("getColorFromArray")) {
                    h7d h7dVar = h7d.e;
                    wct.O(h7dVar, arrayList);
                    return h7dVar;
                }
                break;
            case -1000110441:
                if (str.equals("getDictColor")) {
                    t7d t7dVar = t7d.d;
                    wct.O(t7dVar, arrayList);
                    return t7dVar;
                }
                break;
            case -995871928:
                if (str.equals("padEnd")) {
                    f0k f0kVar = f0k.a;
                    if (!Intrinsics.d(f0kVar.h(arrayList), iycVar)) {
                        g0k g0kVar = g0k.a;
                        if (!Intrinsics.d(g0kVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(f0kVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(g0kVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return g0kVar;
                    }
                    return f0kVar;
                }
                break;
            case -962804868:
                if (str.equals("getOptArrayFromDict")) {
                    x9d x9dVar = x9d.a;
                    wct.O(x9dVar, arrayList);
                    return x9dVar;
                }
                break;
            case -928843967:
                if (str.equals("getArrayOptString")) {
                    v6d v6dVar = v6d.e;
                    wct.O(v6dVar, arrayList);
                    return v6dVar;
                }
                break;
            case -905815078:
                if (str.equals("setDay")) {
                    pnp pnpVar = pnp.a;
                    wct.O(pnpVar, arrayList);
                    return pnpVar;
                }
                break;
            case -902467307:
                if (str.equals("signum")) {
                    o9a o9aVar = o9a.a;
                    if (!Intrinsics.d(o9aVar.h(arrayList), iycVar)) {
                        xqe xqeVar = xqe.a;
                        if (!Intrinsics.d(xqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(o9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(xqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return xqeVar;
                    }
                    return o9aVar;
                }
                break;
            case -863899827:
                if (str.equals("getColorFromDict")) {
                    i7d i7dVar = i7d.d;
                    wct.O(i7dVar, arrayList);
                    return i7dVar;
                }
                break;
            case -823914681:
                if (str.equals("getStoredColorValue")) {
                    xad xadVar = xad.c;
                    if (!Intrinsics.d(xadVar.h(arrayList), iycVar)) {
                        yad yadVar = yad.c;
                        if (!Intrinsics.d(yadVar.h(arrayList), iycVar)) {
                            mbd mbdVar = mbd.c;
                            if (!Intrinsics.d(mbdVar.h(arrayList), iycVar)) {
                                nbd nbdVar = nbd.c;
                                if (!Intrinsics.d(nbdVar.h(arrayList), iycVar)) {
                                    if (!Intrinsics.d(xadVar.i(arrayList), iycVar)) {
                                        if (!Intrinsics.d(yadVar.i(arrayList), iycVar)) {
                                            if (!Intrinsics.d(mbdVar.i(arrayList), iycVar)) {
                                                if (!Intrinsics.d(nbdVar.i(arrayList), iycVar)) {
                                                    throw wct.y(str, arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return nbdVar;
                            }
                            return mbdVar;
                        }
                        return yadVar;
                    }
                    return xadVar;
                }
                break;
            case -792903165:
                if (str.equals("getDictFromArray")) {
                    u7d u7dVar = u7d.e;
                    wct.O(u7dVar, arrayList);
                    return u7dVar;
                }
                break;
            case -775185381:
                if (str.equals("setColorBlue")) {
                    i85 i85Var = i85.f;
                    if (!Intrinsics.d(i85Var.h(arrayList), iycVar)) {
                        s95 s95Var = s95.f;
                        if (!Intrinsics.d(s95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(i85Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(s95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return s95Var;
                    }
                    return i85Var;
                }
                break;
            case -757068958:
                if (str.equals("getStoredBooleanValue")) {
                    wad wadVar = wad.c;
                    if (!Intrinsics.d(wadVar.h(arrayList), iycVar)) {
                        kbd kbdVar = kbd.c;
                        if (!Intrinsics.d(kbdVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(wadVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(kbdVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return kbdVar;
                    }
                    return wadVar;
                }
                break;
            case -740156815:
                if (str.equals("getDayOfWeek")) {
                    q7d q7dVar = q7d.a;
                    wct.O(q7dVar, arrayList);
                    return q7dVar;
                }
                break;
            case -719400499:
                if (str.equals("maxNumber")) {
                    h9a h9aVar = h9a.a;
                    wct.O(h9aVar, arrayList);
                    return h9aVar;
                }
                break;
            case -718233908:
                if (str.equals("getDictFromDict")) {
                    v7d v7dVar = v7d.d;
                    wct.O(v7dVar, arrayList);
                    return v7dVar;
                }
                break;
            case -711609332:
                if (str.equals("getStoredIntegerValue")) {
                    abd abdVar = abd.c;
                    if (!Intrinsics.d(abdVar.h(arrayList), iycVar)) {
                        qbd qbdVar = qbd.c;
                        if (!Intrinsics.d(qbdVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(abdVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(qbdVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return qbdVar;
                    }
                    return abdVar;
                }
                break;
            case -694406281:
                if (str.equals("toRadians")) {
                    wu7 wu7Var = wu7.a;
                    wct.O(wu7Var, arrayList);
                    return wu7Var;
                }
                break;
            case -637295986:
                if (str.equals("getOptStringFromDict")) {
                    lad ladVar = lad.d;
                    wct.O(ladVar, arrayList);
                    return ladVar;
                }
                break;
            case -625627966:
                if (str.equals("getStoredDictValue")) {
                    zad zadVar = zad.c;
                    if (!Intrinsics.d(zadVar.h(arrayList), iycVar)) {
                        pbd pbdVar = pbd.c;
                        if (!Intrinsics.d(pbdVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(zadVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(pbdVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return pbdVar;
                    }
                    return zadVar;
                }
                break;
            case -618173803:
                if (str.equals("getDictNumber")) {
                    z7d z7dVar = z7d.d;
                    wct.O(z7dVar, arrayList);
                    return z7dVar;
                }
                break;
            case -593965816:
                if (str.equals("getDictOptUrl")) {
                    g8d g8dVar = g8d.d;
                    if (!Intrinsics.d(g8dVar.h(arrayList), iycVar)) {
                        h8d h8dVar = h8d.d;
                        if (!Intrinsics.d(h8dVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(g8dVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(h8dVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return h8dVar;
                    }
                    return g8dVar;
                }
                break;
            case -567445985:
                if (str.equals("contains")) {
                    fkr fkrVar = fkr.a;
                    wct.O(fkrVar, arrayList);
                    return fkrVar;
                }
                break;
            case -505987374:
                if (str.equals("copySign")) {
                    z8a z8aVar = z8a.a;
                    if (!Intrinsics.d(z8aVar.h(arrayList), iycVar)) {
                        lqe lqeVar = lqe.a;
                        if (!Intrinsics.d(lqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(z8aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(lqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return lqeVar;
                    }
                    return z8aVar;
                }
                break;
            case -496262374:
                if (str.equals("trimRight")) {
                    tat tatVar = tat.a;
                    wct.O(tatVar, arrayList);
                    return tatVar;
                }
                break;
            case -475795619:
                if (str.equals("getDictString")) {
                    i8d i8dVar = i8d.d;
                    wct.O(i8dVar, arrayList);
                    return i8dVar;
                }
                break;
            case -407622546:
                if (str.equals("getDictValues")) {
                    k8d k8dVar = k8d.d;
                    wct.O(k8dVar, arrayList);
                    return k8dVar;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    bls blsVar = bls.a;
                    wct.O(blsVar, arrayList);
                    return blsVar;
                }
                break;
            case -342730167:
                if (str.equals("getOptNumberFromArray")) {
                    iad iadVar = iad.e;
                    wct.O(iadVar, arrayList);
                    return iadVar;
                }
                break;
            case -288070202:
                if (str.equals("getOptNumberFromDict")) {
                    jad jadVar = jad.d;
                    wct.O(jadVar, arrayList);
                    return jadVar;
                }
                break;
            case -256399843:
                if (str.equals("setMinutes")) {
                    snp snpVar = snp.a;
                    wct.O(snpVar, arrayList);
                    return snpVar;
                }
                break;
            case -230929496:
                if (str.equals("getIntegerFromDict")) {
                    x8d x8dVar = x8d.d;
                    wct.O(x8dVar, arrayList);
                    return x8dVar;
                }
                break;
            case -181255609:
                if (str.equals("addMillis")) {
                    lk lkVar = lk.a;
                    wct.O(lkVar, arrayList);
                    return lkVar;
                }
                break;
            case -174963751:
                if (str.equals("getUrlFromDict")) {
                    hcd hcdVar = hcd.d;
                    wct.O(hcdVar, arrayList);
                    return hcdVar;
                }
                break;
            case -116997076:
                if (str.equals("toDegrees")) {
                    hfn hfnVar = hfn.a;
                    wct.O(hfnVar, arrayList);
                    return hfnVar;
                }
                break;
            case -92937393:
                if (str.equals("getStoredNumberValue")) {
                    bbd bbdVar = bbd.c;
                    if (!Intrinsics.d(bbdVar.h(arrayList), iycVar)) {
                        rbd rbdVar = rbd.c;
                        if (!Intrinsics.d(rbdVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(bbdVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(rbdVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return rbdVar;
                    }
                    return bbdVar;
                }
                break;
            case -74977101:
                if (str.equals("getYear")) {
                    lcd lcdVar = lcd.a;
                    wct.O(lcdVar, arrayList);
                    return lcdVar;
                }
                break;
            case -57828916:
                if (str.equals("getArrayNumber")) {
                    p6d p6dVar = p6d.e;
                    wct.O(p6dVar, arrayList);
                    return p6dVar;
                }
                break;
            case -33620929:
                if (str.equals("getArrayOptUrl")) {
                    w6d w6dVar = w6d.f;
                    if (!Intrinsics.d(w6dVar.h(arrayList), iycVar)) {
                        x6d x6dVar = x6d.e;
                        if (!Intrinsics.d(x6dVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(w6dVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(x6dVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return x6dVar;
                    }
                    return w6dVar;
                }
                break;
            case 3577:
                if (str.equals("pi")) {
                    urk urkVar = urk.a;
                    wct.O(urkVar, arrayList);
                    return urkVar;
                }
                break;
            case 96370:
                if (str.equals("abs")) {
                    l8a l8aVar = l8a.a;
                    if (!Intrinsics.d(l8aVar.h(arrayList), iycVar)) {
                        kqe kqeVar = kqe.a;
                        if (!Intrinsics.d(kqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(l8aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(kqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return kqeVar;
                    }
                    return l8aVar;
                }
                break;
            case 98695:
                if (str.equals("cos")) {
                    ym6 ym6Var = ym6.a;
                    wct.O(ym6Var, arrayList);
                    return ym6Var;
                }
                break;
            case 98696:
                if (str.equals("cot")) {
                    zm6 zm6Var = zm6.a;
                    wct.O(zm6Var, arrayList);
                    return zm6Var;
                }
                break;
            case 99473:
                if (str.equals("div")) {
                    a9a a9aVar = a9a.a;
                    if (!Intrinsics.d(a9aVar.h(arrayList), iycVar)) {
                        nqe nqeVar = nqe.a;
                        if (!Intrinsics.d(nqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(a9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(nqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return nqeVar;
                    }
                    return a9aVar;
                }
                break;
            case 107029:
                if (str.equals("len")) {
                    o6d o6dVar = o6d.a;
                    if (!Intrinsics.d(o6dVar.h(arrayList), iycVar)) {
                        y7d y7dVar = y7d.a;
                        if (!Intrinsics.d(y7dVar.h(arrayList), iycVar)) {
                            mkr mkrVar = mkr.a;
                            if (!Intrinsics.d(mkrVar.h(arrayList), iycVar)) {
                                if (!Intrinsics.d(o6dVar.i(arrayList), iycVar)) {
                                    if (!Intrinsics.d(y7dVar.i(arrayList), iycVar)) {
                                        if (!Intrinsics.d(mkrVar.i(arrayList), iycVar)) {
                                            throw wct.y(str, arrayList);
                                        }
                                    }
                                }
                            }
                            return mkrVar;
                        }
                        return y7dVar;
                    }
                    return o6dVar;
                }
                break;
            case 107876:
                if (str.equals("max")) {
                    g9a g9aVar = g9a.a;
                    if (!Intrinsics.d(g9aVar.h(arrayList), iycVar)) {
                        pqe pqeVar = pqe.a;
                        if (!Intrinsics.d(pqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(g9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(pqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return pqeVar;
                    }
                    return g9aVar;
                }
                break;
            case 108114:
                if (str.equals("min")) {
                    i9a i9aVar = i9a.a;
                    if (!Intrinsics.d(i9aVar.h(arrayList), iycVar)) {
                        rqe rqeVar = rqe.a;
                        if (!Intrinsics.d(rqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(i9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(rqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return rqeVar;
                    }
                    return i9aVar;
                }
                break;
            case 108290:
                if (str.equals("mod")) {
                    k9a k9aVar = k9a.a;
                    if (!Intrinsics.d(k9aVar.h(arrayList), iycVar)) {
                        tqe tqeVar = tqe.a;
                        if (!Intrinsics.d(tqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(k9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(tqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return tqeVar;
                    }
                    return k9aVar;
                }
                break;
            case 108484:
                if (str.equals("mul")) {
                    l9a l9aVar = l9a.a;
                    if (!Intrinsics.d(l9aVar.h(arrayList), iycVar)) {
                        uqe uqeVar = uqe.a;
                        if (!Intrinsics.d(uqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(l9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(uqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return uqeVar;
                    }
                    return l9aVar;
                }
                break;
            case 112845:
                if (str.equals("rgb")) {
                    f95 f95Var = f95.a;
                    wct.O(f95Var, arrayList);
                    return f95Var;
                }
                break;
            case 113880:
                if (str.equals("sin")) {
                    bkq bkqVar = bkq.a;
                    wct.O(bkqVar, arrayList);
                    return bkqVar;
                }
                break;
            case 114240:
                if (str.equals("sub")) {
                    p9a p9aVar = p9a.a;
                    if (!Intrinsics.d(p9aVar.h(arrayList), iycVar)) {
                        yqe yqeVar = yqe.a;
                        if (!Intrinsics.d(yqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(p9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(yqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return yqeVar;
                    }
                    return p9aVar;
                }
                break;
            case 114251:
                if (str.equals("sum")) {
                    q9a q9aVar = q9a.a;
                    if (!Intrinsics.d(q9aVar.h(arrayList), iycVar)) {
                        zqe zqeVar = zqe.a;
                        if (!Intrinsics.d(zqeVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(q9aVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(zqeVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return zqeVar;
                    }
                    return q9aVar;
                }
                break;
            case 114593:
                if (str.equals("tan")) {
                    u5s u5sVar = u5s.a;
                    wct.O(u5sVar, arrayList);
                    return u5sVar;
                }
                break;
            case 2988422:
                if (str.equals("acos")) {
                    gd gdVar = gd.a;
                    wct.O(gdVar, arrayList);
                    return gdVar;
                }
                break;
            case 3002572:
                if (str.equals("argb")) {
                    g85 g85Var = g85.a;
                    wct.O(g85Var, arrayList);
                    return g85Var;
                }
                break;
            case 3003607:
                if (str.equals("asin")) {
                    hq1 hq1Var = hq1.a;
                    wct.O(hq1Var, arrayList);
                    return hq1Var;
                }
                break;
            case 3004320:
                if (str.equals("atan")) {
                    zt1 zt1Var = zt1.a;
                    wct.O(zt1Var, arrayList);
                    return zt1Var;
                }
                break;
            case 3049733:
                if (str.equals("ceil")) {
                    r8a r8aVar = r8a.a;
                    wct.O(r8aVar, arrayList);
                    return r8aVar;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    qat qatVar = qat.a;
                    wct.O(qatVar, arrayList);
                    return qatVar;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    bcd bcdVar = bcd.a;
                    wct.O(bcdVar, arrayList);
                    return bcdVar;
                }
                break;
            case 53078075:
                if (str.equals("minNumber")) {
                    j9a j9aVar = j9a.a;
                    wct.O(j9aVar, arrayList);
                    return j9aVar;
                }
                break;
            case 81708636:
                if (str.equals("getDictBoolean")) {
                    s7d s7dVar = s7d.d;
                    wct.O(s7dVar, arrayList);
                    return s7dVar;
                }
                break;
            case 84549268:
                if (str.equals("getArrayString")) {
                    y6d y6dVar = y6d.e;
                    wct.O(y6dVar, arrayList);
                    return y6dVar;
                }
                break;
            case 88715890:
                if (str.equals("getNumberValue")) {
                    v9d v9dVar = v9d.a;
                    wct.O(v9dVar, arrayList);
                    return v9dVar;
                }
                break;
            case 93133970:
                if (str.equals("atan2")) {
                    yt1 yt1Var = yt1.a;
                    wct.O(yt1Var, arrayList);
                    return yt1Var;
                }
                break;
            case 97526796:
                if (str.equals("floor")) {
                    b9a b9aVar = b9a.a;
                    wct.O(b9aVar, arrayList);
                    return b9aVar;
                }
                break;
            case 100346066:
                if (str.equals("index")) {
                    ikr ikrVar = ikr.a;
                    wct.O(ikrVar, arrayList);
                    return ikrVar;
                }
                break;
            case 108704142:
                if (str.equals("round")) {
                    m9a m9aVar = m9a.a;
                    wct.O(m9aVar, arrayList);
                    return m9aVar;
                }
                break;
            case 110520564:
                if (str.equals("toUrl")) {
                    alr alrVar = alr.a;
                    wct.O(alrVar, arrayList);
                    return alrVar;
                }
                break;
            case 181165108:
                if (str.equals("formatDateAsLocalWithLocale")) {
                    fsc fscVar = fsc.a;
                    wct.O(fscVar, arrayList);
                    return fscVar;
                }
                break;
            case 215331667:
                if (str.equals("getOptArrayFromArray")) {
                    w9d w9dVar = w9d.d;
                    wct.O(w9dVar, arrayList);
                    return w9dVar;
                }
                break;
            case 232128784:
                if (str.equals("getDictOptNumber")) {
                    e8d e8dVar = e8d.d;
                    wct.O(e8dVar, arrayList);
                    return e8dVar;
                }
                break;
            case 272530949:
                if (str.equals("getArrayBoolean")) {
                    j6d j6dVar = j6d.e;
                    wct.O(j6dVar, arrayList);
                    return j6dVar;
                }
                break;
            case 294836803:
                if (str.equals("toInteger")) {
                    tc3 tc3Var = tc3.a;
                    if (!Intrinsics.d(tc3Var.h(arrayList), iycVar)) {
                        bhj bhjVar = bhj.a;
                        if (!Intrinsics.d(bhjVar.h(arrayList), iycVar)) {
                            xkr xkrVar = xkr.a;
                            if (!Intrinsics.d(xkrVar.h(arrayList), iycVar)) {
                                if (!Intrinsics.d(tc3Var.i(arrayList), iycVar)) {
                                    if (!Intrinsics.d(bhjVar.i(arrayList), iycVar)) {
                                        if (!Intrinsics.d(xkrVar.i(arrayList), iycVar)) {
                                            throw wct.y(str, arrayList);
                                        }
                                    }
                                }
                            }
                            return xkrVar;
                        }
                        return bhjVar;
                    }
                    return tc3Var;
                }
                break;
            case 374506968:
                if (str.equals("getDictOptString")) {
                    f8d f8dVar = f8d.d;
                    wct.O(f8dVar, arrayList);
                    return f8dVar;
                }
                break;
            case 407302472:
                if (str.equals("setMillis")) {
                    rnp rnpVar = rnp.a;
                    wct.O(rnpVar, arrayList);
                    return rnpVar;
                }
                break;
            case 412791996:
                if (str.equals("getDictOptColor")) {
                    b8d b8dVar = b8d.d;
                    if (!Intrinsics.d(b8dVar.h(arrayList), iycVar)) {
                        c8d c8dVar = c8d.d;
                        if (!Intrinsics.d(c8dVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(b8dVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(c8dVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return c8dVar;
                    }
                    return b8dVar;
                }
                break;
            case 515198110:
                if (str.equals("decodeUri")) {
                    gkr gkrVar = gkr.a;
                    wct.O(gkrVar, arrayList);
                    return gkrVar;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    ukr ukrVar = ukr.a;
                    wct.O(ukrVar, arrayList);
                    return ukrVar;
                }
                break;
            case 579215519:
                if (str.equals("getBooleanValue")) {
                    f7d f7dVar = f7d.a;
                    wct.O(f7dVar, arrayList);
                    return f7dVar;
                }
                break;
            case 609553469:
                if (str.equals("getOptUrlFromArray")) {
                    mad madVar = mad.f;
                    if (!Intrinsics.d(madVar.h(arrayList), iycVar)) {
                        nad nadVar = nad.e;
                        if (!Intrinsics.d(nadVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(madVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(nadVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return nadVar;
                    }
                    return madVar;
                }
                break;
            case 621919548:
                if (str.equals("getMillis")) {
                    j9d j9dVar = j9d.a;
                    wct.O(j9dVar, arrayList);
                    return j9dVar;
                }
                break;
            case 624675145:
                if (str.equals("getIntegerValue")) {
                    y8d y8dVar = y8d.a;
                    wct.O(y8dVar, arrayList);
                    return y8dVar;
                }
                break;
            case 648795069:
                if (str.equals("setSeconds")) {
                    gop gopVar = gop.a;
                    wct.O(gopVar, arrayList);
                    return gopVar;
                }
                break;
            case 671285057:
                if (str.equals("getDictOptBoolean")) {
                    a8d a8dVar = a8d.d;
                    wct.O(a8dVar, arrayList);
                    return a8dVar;
                }
                break;
            case 757893007:
                if (str.equals("padStart")) {
                    h0k h0kVar = h0k.a;
                    if (!Intrinsics.d(h0kVar.h(arrayList), iycVar)) {
                        i0k i0kVar = i0k.a;
                        if (!Intrinsics.d(i0kVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(h0kVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(i0kVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return i0kVar;
                    }
                    return h0kVar;
                }
                break;
            case 785010124:
                if (str.equals("getArrayUrl")) {
                    z6d z6dVar = z6d.e;
                    wct.O(z6dVar, arrayList);
                    return z6dVar;
                }
                break;
            case 815452174:
                if (str.equals("getArrayOptInteger")) {
                    t6d t6dVar = t6d.e;
                    wct.O(t6dVar, arrayList);
                    return t6dVar;
                }
                break;
            case 833284859:
                if (str.equals("getStoredUrlValue")) {
                    dbd dbdVar = dbd.c;
                    if (!Intrinsics.d(dbdVar.h(arrayList), iycVar)) {
                        ebd ebdVar = ebd.c;
                        if (!Intrinsics.d(ebdVar.h(arrayList), iycVar)) {
                            tbd tbdVar = tbd.c;
                            if (!Intrinsics.d(tbdVar.h(arrayList), iycVar)) {
                                ubd ubdVar = ubd.c;
                                if (!Intrinsics.d(ubdVar.h(arrayList), iycVar)) {
                                    if (!Intrinsics.d(dbdVar.i(arrayList), iycVar)) {
                                        if (!Intrinsics.d(ebdVar.i(arrayList), iycVar)) {
                                            if (!Intrinsics.d(tbdVar.i(arrayList), iycVar)) {
                                                if (!Intrinsics.d(ubdVar.i(arrayList), iycVar)) {
                                                    throw wct.y(str, arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return ubdVar;
                            }
                            return tbdVar;
                        }
                        return ebdVar;
                    }
                    return dbdVar;
                }
                break;
            case 851027282:
                if (str.equals("getOptUrlFromDict")) {
                    oad oadVar = oad.d;
                    if (!Intrinsics.d(oadVar.h(arrayList), iycVar)) {
                        pad padVar = pad.d;
                        if (!Intrinsics.d(padVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(oadVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(padVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return padVar;
                    }
                    return oadVar;
                }
                break;
            case 902290499:
                if (str.equals("getArrayFromDict")) {
                    m6d m6dVar = m6d.d;
                    wct.O(m6dVar, arrayList);
                    return m6dVar;
                }
                break;
            case 963997617:
                if (str.equals("getColorAlpha")) {
                    e85 e85Var = e85.f;
                    if (!Intrinsics.d(e85Var.h(arrayList), iycVar)) {
                        p95 p95Var = p95.f;
                        if (!Intrinsics.d(p95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(e85Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(p95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return p95Var;
                    }
                    return e85Var;
                }
                break;
            case 968898065:
                if (str.equals("getStoredArrayValue")) {
                    vad vadVar = vad.c;
                    if (!Intrinsics.d(vadVar.h(arrayList), iycVar)) {
                        ibd ibdVar = ibd.c;
                        if (!Intrinsics.d(ibdVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(vadVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(ibdVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return ibdVar;
                    }
                    return vadVar;
                }
                break;
            case 969706838:
                if (str.equals("getColorGreen")) {
                    n85 n85Var = n85.f;
                    if (!Intrinsics.d(n85Var.h(arrayList), iycVar)) {
                        u95 u95Var = u95.f;
                        if (!Intrinsics.d(u95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(n85Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(u95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return u95Var;
                    }
                    return n85Var;
                }
                break;
            case 983060420:
                if (str.equals("getColorValue")) {
                    j7d j7dVar = j7d.a;
                    if (!Intrinsics.d(j7dVar.h(arrayList), iycVar)) {
                        k7d k7dVar = k7d.a;
                        if (!Intrinsics.d(k7dVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(j7dVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(k7dVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return k7dVar;
                    }
                    return j7dVar;
                }
                break;
            case 1012555088:
                if (str.equals("getNumberFromArray")) {
                    t9d t9dVar = t9d.e;
                    wct.O(t9dVar, arrayList);
                    return t9dVar;
                }
                break;
            case 1022717043:
                if (str.equals("getOptDictFromDict")) {
                    fad fadVar = fad.a;
                    wct.O(fadVar, arrayList);
                    return fadVar;
                }
                break;
            case 1098852024:
                if (str.equals("getUrlValue")) {
                    icd icdVar = icd.a;
                    if (!Intrinsics.d(icdVar.h(arrayList), iycVar)) {
                        jcd jcdVar = jcd.a;
                        if (!Intrinsics.d(jcdVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(icdVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(jcdVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return jcdVar;
                    }
                    return icdVar;
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    mqe mqeVar = mqe.b;
                    if (!Intrinsics.d(mqeVar.h(arrayList), iycVar)) {
                        kqg kqgVar = kqg.b;
                        if (!Intrinsics.d(kqgVar.h(arrayList), iycVar)) {
                            lqg lqgVar = lqg.b;
                            if (!Intrinsics.d(lqgVar.h(arrayList), iycVar)) {
                                ahj ahjVar = ahj.b;
                                if (!Intrinsics.d(ahjVar.h(arrayList), iycVar)) {
                                    if (!Intrinsics.d(mqeVar.i(arrayList), iycVar)) {
                                        if (!Intrinsics.d(kqgVar.i(arrayList), iycVar)) {
                                            if (!Intrinsics.d(lqgVar.i(arrayList), iycVar)) {
                                                if (!Intrinsics.d(ahjVar.i(arrayList), iycVar)) {
                                                    throw wct.y(str, arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return ahjVar;
                            }
                            return lqgVar;
                        }
                        return kqgVar;
                    }
                    return mqeVar;
                }
                break;
            case 1298006409:
                if (str.equals("getOptColorFromArray")) {
                    aad aadVar = aad.e;
                    if (!Intrinsics.d(aadVar.h(arrayList), iycVar)) {
                        bad badVar = bad.f;
                        if (!Intrinsics.d(badVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(aadVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(badVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return badVar;
                    }
                    return aadVar;
                }
                break;
            case 1309020812:
                if (str.equals("minInteger")) {
                    sqe sqeVar = sqe.a;
                    wct.O(sqeVar, arrayList);
                    return sqeVar;
                }
                break;
            case 1335732619:
                if (str.equals("getOptBooleanFromDict")) {
                    z9d z9dVar = z9d.d;
                    wct.O(z9dVar, arrayList);
                    return z9dVar;
                }
                break;
            case 1346085543:
                if (str.equals("getStringFromDict")) {
                    xbd xbdVar = xbd.d;
                    wct.O(xbdVar, arrayList);
                    return xbdVar;
                }
                break;
            case 1360482480:
                if (str.equals("setColorRed")) {
                    e95 e95Var = e95.f;
                    if (!Intrinsics.d(e95Var.h(arrayList), iycVar)) {
                        x95 x95Var = x95.f;
                        if (!Intrinsics.d(x95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(e95Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(x95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return x95Var;
                    }
                    return e95Var;
                }
                break;
            case 1394182093:
                if (str.equals("setHours")) {
                    qnp qnpVar = qnp.a;
                    wct.O(qnpVar, arrayList);
                    return qnpVar;
                }
                break;
            case 1398793022:
                if (str.equals("setMonth")) {
                    tnp tnpVar = tnp.a;
                    wct.O(tnpVar, arrayList);
                    return tnpVar;
                }
                break;
            case 1428631719:
                if (str.equals("getIntegerFromArray")) {
                    w8d w8dVar = w8d.e;
                    wct.O(w8dVar, arrayList);
                    return w8dVar;
                }
                break;
            case 1449062308:
                if (str.equals("getColorRed")) {
                    d95 d95Var = d95.f;
                    if (!Intrinsics.d(d95Var.h(arrayList), iycVar)) {
                        w95 w95Var = w95.f;
                        if (!Intrinsics.d(w95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(d95Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(w95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return w95Var;
                    }
                    return d95Var;
                }
                break;
            case 1507829577:
                if (str.equals("trimLeft")) {
                    rat ratVar = rat.a;
                    wct.O(ratVar, arrayList);
                    return ratVar;
                }
                break;
            case 1508134774:
                if (str.equals("encodeUri")) {
                    hkr hkrVar = hkr.a;
                    wct.O(hkrVar, arrayList);
                    return hkrVar;
                }
                break;
            case 1565972102:
                if (str.equals("getOptColorFromDict")) {
                    cad cadVar = cad.d;
                    if (!Intrinsics.d(cadVar.h(arrayList), iycVar)) {
                        dad dadVar = dad.d;
                        if (!Intrinsics.d(dadVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(cadVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(dadVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return dadVar;
                    }
                    return cadVar;
                }
                break;
            case 1636968764:
                if (str.equals("getOptDictFromArray")) {
                    ead eadVar = ead.d;
                    wct.O(eadVar, arrayList);
                    return eadVar;
                }
                break;
            case 1644730933:
                if (str.equals("nowLocal")) {
                    fgj fgjVar = fgj.a;
                    wct.O(fgjVar, arrayList);
                    return fgjVar;
                }
                break;
            case 1695311327:
                if (str.equals("getNumberFromDict")) {
                    u9d u9dVar = u9d.d;
                    wct.O(u9dVar, arrayList);
                    return u9dVar;
                }
                break;
            case 1716172417:
                if (str.equals("getOptStringFromArray")) {
                    kad kadVar = kad.e;
                    wct.O(kadVar, arrayList);
                    return kadVar;
                }
                break;
            case 1738128829:
                if (str.equals("setColorAlpha")) {
                    f85 f85Var = f85.f;
                    if (!Intrinsics.d(f85Var.h(arrayList), iycVar)) {
                        q95 q95Var = q95.f;
                        if (!Intrinsics.d(q95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(f85Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(q95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return q95Var;
                    }
                    return f85Var;
                }
                break;
            case 1743838050:
                if (str.equals("setColorGreen")) {
                    o85 o85Var = o85.f;
                    if (!Intrinsics.d(o85Var.h(arrayList), iycVar)) {
                        v95 v95Var = v95.f;
                        if (!Intrinsics.d(v95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(o85Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(v95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return v95Var;
                    }
                    return o85Var;
                }
                break;
            case 1745084820:
                if (str.equals("getIntervalHours")) {
                    z8d z8dVar = z8d.a;
                    wct.O(z8dVar, arrayList);
                    return z8dVar;
                }
                break;
            case 1814686973:
                if (str.equals("getBooleanFromArray")) {
                    d7d d7dVar = d7d.e;
                    wct.O(d7dVar, arrayList);
                    return d7dVar;
                }
                break;
            case 1883462358:
                if (str.equals("getIntervalTotalMinutes")) {
                    e9d e9dVar = e9d.a;
                    wct.O(e9dVar, arrayList);
                    return e9dVar;
                }
                break;
            case 1907630144:
                if (str.equals("getDictKeys")) {
                    x7d x7dVar = x7d.d;
                    wct.O(x7dVar, arrayList);
                    return x7dVar;
                }
                break;
            case 1910382545:
                if (str.equals("encodeRegex")) {
                    h6b h6bVar = h6b.a;
                    wct.O(h6bVar, arrayList);
                    return h6bVar;
                }
                break;
            case 1953671716:
                if (str.equals("getIntervalMinutes")) {
                    a9d a9dVar = a9d.a;
                    wct.O(a9dVar, arrayList);
                    return a9dVar;
                }
                break;
            case 1953831815:
                if (str.equals("getStoredStringValue")) {
                    cbd cbdVar = cbd.c;
                    if (!Intrinsics.d(cbdVar.h(arrayList), iycVar)) {
                        sbd sbdVar = sbd.c;
                        if (!Intrinsics.d(sbdVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(cbdVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(sbdVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return sbdVar;
                    }
                    return cbdVar;
                }
                break;
            case 1955294553:
                if (str.equals("getHours")) {
                    t8d t8dVar = t8d.a;
                    wct.O(t8dVar, arrayList);
                    return t8dVar;
                }
                break;
            case 1959905482:
                if (str.equals("getMonth")) {
                    l9d l9dVar = l9d.a;
                    wct.O(l9dVar, arrayList);
                    return l9dVar;
                }
                break;
            case 1970789287:
                if (str.equals("getColorBlue")) {
                    h85 h85Var = h85.f;
                    if (!Intrinsics.d(h85Var.h(arrayList), iycVar)) {
                        r95 r95Var = r95.f;
                        if (!Intrinsics.d(r95Var.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(h85Var.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(r95Var.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return r95Var;
                    }
                    return h85Var;
                }
                break;
            case 1975049074:
                if (str.equals("getDictInteger")) {
                    w7d w7dVar = w7d.d;
                    wct.O(w7dVar, arrayList);
                    return w7dVar;
                }
                break;
            case 1985132479:
                if (str.equals("setYear")) {
                    pop popVar = pop.a;
                    wct.O(popVar, arrayList);
                    return popVar;
                }
                break;
            case 1992807388:
                if (str.equals("lastIndex")) {
                    lkr lkrVar = lkr.a;
                    wct.O(lkrVar, arrayList);
                    return lkrVar;
                }
                break;
            case 2033316403:
                if (str.equals("getArrayOptColor")) {
                    r6d r6dVar = r6d.e;
                    if (!Intrinsics.d(r6dVar.h(arrayList), iycVar)) {
                        s6d s6dVar = s6d.f;
                        if (!Intrinsics.d(s6dVar.h(arrayList), iycVar)) {
                            if (!Intrinsics.d(r6dVar.i(arrayList), iycVar)) {
                                if (!Intrinsics.d(s6dVar.i(arrayList), iycVar)) {
                                    throw wct.y(str, arrayList);
                                }
                            }
                        }
                        return s6dVar;
                    }
                    return r6dVar;
                }
                break;
            case 2075646548:
                if (str.equals("formatDateAsLocal")) {
                    esc escVar = esc.a;
                    wct.O(escVar, arrayList);
                    return escVar;
                }
                break;
            case 2101762217:
                if (str.equals("getMinutes")) {
                    k9d k9dVar = k9d.a;
                    wct.O(k9dVar, arrayList);
                    return k9dVar;
                }
                break;
            case 2135485098:
                if (str.equals("getStringValue")) {
                    ybd ybdVar = ybd.a;
                    wct.O(ybdVar, arrayList);
                    return ybdVar;
                }
                break;
        }
        throw new khb(ouj.k('.', "Unknown function name: ", str), 0);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 5:
                t1qVar.getClass();
                return Boolean.TRUE;
            default:
                t1qVar.getClass();
                return new gxj(t1qVar.f);
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 5:
                u7uVar.getClass();
                return Boolean.FALSE;
            default:
                u7uVar.getClass();
                return new gxj(u7uVar.i);
        }
    }

    @Override // defpackage.r2o
    public int w(pwj pwjVar) {
        return 1;
    }

    public long x() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // defpackage.eac
    public void b() {
    }

    @Override // defpackage.upt
    public String c(String str) {
        return str;
    }

    @Override // defpackage.upt
    public String e(String str) {
        return str;
    }

    @Override // defpackage.eac
    public void k(long j2, String str) {
    }
}
