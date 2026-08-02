package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.util.Log;
import android.view.Display;
import android.view.OrientationEventListener;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.ce5;
import defpackage.ibj;
import defpackage.jbj;
import defpackage.scc;
import defpackage.smw0;
import defpackage.v83;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;
import io.flutter.plugins.camerax.CameraXError;
import jason.statham.TerminatedException;
import jason.statham.UnknownInstructionException;
import jason.statham.tools.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;

/* loaded from: classes11.dex */
public abstract class uj91 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0045  */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final f530 f530Var, boolean z, boolean z2, boolean z3, wp2 wp2Var, float f, final qor qorVar, fid fidVar, final int i, final int i2) {
        int i3;
        wp2 wp2Var2;
        int i4;
        final float f2;
        final boolean z4;
        final boolean z5;
        final wp2 wp2Var3;
        final boolean z6;
        aii0 v;
        wp2 wp2Var4;
        boolean z7;
        Object ec1Var;
        ?? r7;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-475410962);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 3504;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i5 = i3 | 28080;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            wp2Var2 = wp2Var;
            i5 |= btsVar.k(wp2Var2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i5 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                f2 = f;
                i5 |= btsVar.b(f2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    i5 |= btsVar.k(qorVar) ? 1048576 : 524288;
                }
                if (btsVar.V(i5 & 1, (599187 & i5) != 599186)) {
                    if (i6 != 0) {
                        wp2Var2 = AppColor$Palette.CardDivider;
                    }
                    if (i4 != 0) {
                        f2 = 6.0f;
                    }
                    long n = tje.n(wp2Var2, btsVar);
                    ((nx2) btsVar.m(uy2.c)).getClass();
                    float w0 = ((fwi) btsVar.m(j.h)).w0(24.0f);
                    float f3 = 2.0f * w0;
                    boolean b = btsVar.b(24.0f);
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (b || Q == o430Var) {
                        jb2 a = nb2.a();
                        a.m(0.0f, 0.0f);
                        float f4 = -w0;
                        a.l(0.0f, f4);
                        float f5 = -f3;
                        if (a.b == null) {
                            a.b = new RectF();
                        }
                        wp2Var4 = wp2Var2;
                        a.b.set(0.0f, f5, f3, 0.0f);
                        a.a.arcTo(a.b, 180.0f, -90.0f, false);
                        a.g();
                        jb2 a2 = nb2.a();
                        a2.m(0.0f, 0.0f);
                        a2.l(f4, 0.0f);
                        if (a2.b == null) {
                            a2.b = new RectF();
                        }
                        a2.b.set(f5, f5, 0.0f, 0.0f);
                        a2.a.arcTo(a2.b, 90.0f, -90.0f, false);
                        a2.g();
                        jb2 a3 = nb2.a();
                        a3.m(0.0f, 0.0f);
                        a3.l(f3, 0.0f);
                        if (a3.b == null) {
                            a3.b = new RectF();
                        }
                        a3.b.set(0.0f, 0.0f, f3, f3);
                        a3.a.arcTo(a3.b, 270.0f, -90.0f, false);
                        a3.g();
                        jb2 a4 = nb2.a();
                        a4.m(0.0f, 0.0f);
                        a4.l(0.0f, w0);
                        if (a4.b == null) {
                            a4.b = new RectF();
                        }
                        a4.b.set(f5, 0.0f, 0.0f, f3);
                        z7 = false;
                        a4.a.arcTo(a4.b, 0.0f, -90.0f, false);
                        a4.g();
                        Q = new ve8(a, a2, a3, a4, w0);
                        btsVar.o0(Q);
                    } else {
                        wp2Var4 = wp2Var2;
                        z7 = false;
                    }
                    ve8 ve8Var = (ve8) Q;
                    ve8Var.getClass();
                    f530 g = s1a1.g(ljs0.n(f530Var, 48.0f, f2), 1.0f);
                    boolean d = btsVar.d(n) | ((3670016 & i5) == 1048576 ? true : z7) | btsVar.e(ve8Var) | ((i5 & 112) == 32 ? true : z7) | ((i5 & 7168) == 2048 ? true : z7) | ((i5 & 896) == 256 ? true : z7);
                    Object Q2 = btsVar.Q();
                    if (d || Q2 == o430Var) {
                        r7 = z7;
                        ec1Var = new ec1(qorVar, n, ve8Var, 4);
                        btsVar.o0(ec1Var);
                    } else {
                        ec1Var = Q2;
                        r7 = z7;
                    }
                    qeb1.a(r7, btsVar, (tls) ec1Var, g);
                    wp2Var3 = wp2Var4;
                    z6 = true;
                    z4 = true;
                    z5 = true;
                } else {
                    btsVar.Y();
                    z4 = z2;
                    z5 = z3;
                    wp2Var3 = wp2Var2;
                    z6 = z;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: vrl
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uj91.a(f530.this, z6, z4, z5, wp2Var3, f2, qorVar, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if (btsVar.V(i5 & 1, (599187 & i5) != 599186)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        wp2Var2 = wp2Var;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if (btsVar.V(i5 & 1, (599187 & i5) != 599186)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(f530 f530Var, qor qorVar, fid fidVar, int i, int i2) {
        int i3;
        int i4;
        qor qorVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-592856479);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (btsVar.k(qorVar) ? 32 : 16);
        }
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                f530Var = c530.a;
            }
            if (i6 != 0) {
                qorVar = null;
            }
            qor qorVar3 = qorVar;
            a(ljs0.c(f530Var, 1.0f), false, false, false, null, 0.0f, qorVar3, btsVar, (i4 << 15) & 3670016, 62);
            qorVar2 = qorVar3;
        } else {
            btsVar.Y();
            qorVar2 = qorVar;
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new url(f530Var2, qorVar2, i, i2, 0);
        }
    }

    public static final void c(int i, fid fidVar, qor qorVar, f530 f530Var) {
        qor qorVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-889464023);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(qorVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qorVar2 = qorVar;
            a(ljs0.c(f530Var, 1.0f), false, false, false, AppColor$Palette.EverBack, 2.0f, qorVar2, btsVar, ((i2 << 15) & 3670016) | 221184, 14);
        } else {
            qorVar2 = qorVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(f530Var, qorVar2, i);
        }
    }

    public static Object d(x4x x4xVar, kje kjeVar) {
        boolean z;
        Object t;
        long j;
        long j2;
        long j3 = 0;
        ArrayList arrayList = x4xVar.a;
        ArrayList arrayList2 = x4xVar.b;
        int i = 0;
        while (i < arrayList.size()) {
            String str = (String) arrayList.get(i);
            switch (str.hashCode()) {
                case -2053034266:
                    if (!str.equals("LENGTH")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(((String) kjeVar.a()).length()));
                    i++;
                    j3 = 0;
                case -2022879855:
                    if (!str.equals("LOWERCASE")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(((String) kjeVar.a()).toLowerCase(Locale.ROOT));
                    i++;
                    j3 = 0;
                case -2002991330:
                    if (!str.equals("TRIM_END")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(evu0.n0((String) kjeVar.a(), HexString.CHAR_SPACE, '\n'));
                    i++;
                    j3 = 0;
                case -1986360503:
                    if (!str.equals("NOTIFY")) {
                        throw new UnknownInstructionException(str);
                    }
                    i++;
                    kjeVar.g.add(new g5x((String) arrayList2.get(((Integer) arrayList.get(i)).intValue()), kjeVar.a()));
                    i++;
                    j3 = 0;
                case -1973032422:
                    if (!str.equals("JOIN_PATH")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a = kjeVar.a();
                    Object a2 = kjeVar.a();
                    hje hjeVar = a2 instanceof hje ? (hje) a2 : new hje(a2);
                    hjeVar.a(a);
                    kjeVar.b(hjeVar);
                    i++;
                    j3 = 0;
                case -1906687956:
                    if (!str.equals("DIV_FLOAT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(((Double) kjeVar.a()).doubleValue() / ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case -1881281404:
                    if (!str.equals("REMOVE")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(evu0.R((int) ((Long) kjeVar.a()).longValue(), (int) ((Long) kjeVar.a()).longValue(), (String) kjeVar.a()).toString());
                    i++;
                    j3 = 0;
                case -1881067216:
                    if (str.equals("RETURN")) {
                        int i2 = kjeVar.c;
                        if (i2 > -1) {
                            return kjeVar.b[i2];
                        }
                        return 0L;
                    }
                    throw new UnknownInstructionException(str);
                case -1720311790:
                    if (!str.equals("FLOAT_TO_STRING")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(String.valueOf(((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case -1653791684:
                    if (!str.equals("ADD_FLOAT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(((Double) kjeVar.a()).doubleValue() + ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case -1582188690:
                    if (!str.equals("FLOAT_TO_INT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf((long) ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case -1420928203:
                    if (!str.equals("REM_FLOAT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(((Double) kjeVar.a()).doubleValue() % ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case -1334087454:
                    if (!str.equals("CMP_INT64_GREAT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Long) kjeVar.a()).longValue() > ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case -1284848974:
                    if (!str.equals("UPPERCASE")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(((String) kjeVar.a()).toUpperCase(Locale.ROOT));
                    i++;
                    j3 = 0;
                case -1096654712:
                    if (!str.equals("DICT_CONTAINS")) {
                        throw new UnknownInstructionException(str);
                    }
                    String str2 = (String) kjeVar.a();
                    Object a3 = kjeVar.a();
                    j5x J = bb1.J(kjeVar.d, eja1.q(a3 instanceof hje ? ((hje) a3).a : (List) a3));
                    if (J instanceof m5x) {
                        z = ((m5x) J).a.containsKey(str2);
                    } else {
                        if (J != null) {
                            kbs.f(J, "Expected object but actual node is ");
                            return null;
                        }
                        z = false;
                    }
                    kjeVar.b(Boolean.valueOf(z));
                    i++;
                    j3 = 0;
                case -977830351:
                    if (!str.equals("SUBSTRING")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(((String) kjeVar.a()).substring((int) ((Long) kjeVar.a()).longValue(), (int) ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case -963480091:
                    if (!str.equals("INT_TO_STRING")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(String.valueOf(((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case -874611224:
                    if (!str.equals("INT_TO_FLOAT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case -716211739:
                    if (!str.equals("TRIM_START")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(evu0.p0((String) kjeVar.a(), HexString.CHAR_SPACE, '\n'));
                    i++;
                    j3 = 0;
                case -644548626:
                    if (!str.equals("SUB_INT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(((Long) kjeVar.a()).longValue() - ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case -563730140:
                    if (!str.equals("INVERT_INT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(-((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case -437755565:
                    if (!str.equals("FIRST_INDEX_OF")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(evu0.H((String) kjeVar.a(), (String) kjeVar.a(), 0, false, 6)));
                    i++;
                    j3 = 0;
                case -258103921:
                    if (!str.equals("ADD_INT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(((Long) kjeVar.a()).longValue() + ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case -181445500:
                    if (!str.equals("CMP_INT64_LESS")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Long) kjeVar.a()).longValue() < ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case 2531:
                    if (!str.equals("OR")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Boolean) kjeVar.a()).booleanValue() || ((Boolean) kjeVar.a()).booleanValue()));
                    i++;
                    j3 = 0;
                case 64951:
                    if (!str.equals(VsidGenerator.PLAYER_SERVICE_CODE)) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Boolean) kjeVar.a()).booleanValue() && ((Boolean) kjeVar.a()).booleanValue()));
                    i++;
                    j3 = 0;
                case 77491:
                    if (!str.equals("NOT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(!((Boolean) kjeVar.a()).booleanValue()));
                    i++;
                    j3 = 0;
                case 77494:
                    if (!str.equals("NOW")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(System.currentTimeMillis()));
                    i++;
                    j3 = 0;
                case 87099:
                    if (!str.equals("XOR")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Boolean) kjeVar.a()).booleanValue() ^ ((Boolean) kjeVar.a()).booleanValue()));
                    i++;
                    j3 = 0;
                case 2074485:
                    if (!str.equals("COPY")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a4 = kjeVar.a();
                    Object a5 = kjeVar.a();
                    r5x q = eja1.q(a5 instanceof hje ? ((hje) a5).a : (List) a5);
                    r5x q2 = eja1.q(a4 instanceof hje ? ((hje) a4).a : (List) a4);
                    j5x J2 = bb1.J(kjeVar.d, q);
                    d6x d6xVar = kjeVar.d;
                    if (J2 != null) {
                        kjeVar.d = a.c(kjeVar.d, q2, J2, sb2.z(q2, bb1.K(d6xVar, q)));
                    } else {
                        kjeVar.d = a.g(d6xVar, q2);
                    }
                    i++;
                    j3 = 0;
                case 2288686:
                    if (!str.equals("JUMP")) {
                        throw new UnknownInstructionException(str);
                    }
                    int i3 = i + 1;
                    i = i3 + ((Integer) arrayList.get(i3)).intValue();
                    j3 = 0;
                case 2342118:
                    if (!str.equals("LOAD")) {
                        throw new UnknownInstructionException(str);
                    }
                    i++;
                    kjeVar.b(kjeVar.a[((Integer) arrayList.get(i)).intValue()]);
                    i++;
                    j3 = 0;
                case 2558355:
                    if (!str.equals("SWAP")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a6 = kjeVar.a();
                    Object a7 = kjeVar.a();
                    kjeVar.b(a6);
                    kjeVar.b(a7);
                    i++;
                    j3 = 0;
                case 2583586:
                    if (!str.equals("TRIM")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(evu0.l0((String) kjeVar.a(), HexString.CHAR_SPACE, '\n'));
                    i++;
                    j3 = 0;
                case 64307011:
                    if (!str.equals("CONST")) {
                        throw new UnknownInstructionException(str);
                    }
                    i++;
                    kjeVar.b(arrayList2.get(((Integer) arrayList.get(i)).intValue()));
                    i++;
                    j3 = 0;
                case 66784922:
                    if (!str.equals("FETCH")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a8 = kjeVar.a();
                    Object a9 = kjeVar.a();
                    j5x J3 = bb1.J(kjeVar.d, eja1.q(a9 instanceof hje ? ((hje) a9).a : (List) a9));
                    if (J3 != null && (t = vez0.t(J3)) != null) {
                        a8 = t;
                    }
                    kjeVar.b(a8);
                    i++;
                    j3 = 0;
                    break;
                case 75900968:
                    if (!str.equals("PATCH")) {
                        throw new UnknownInstructionException(str);
                    }
                    i++;
                    Map map = (Map) arrayList2.get(((Integer) arrayList.get(i)).intValue());
                    Object a10 = kjeVar.a();
                    Object a11 = kjeVar.a();
                    r5x q3 = eja1.q(a11 instanceof hje ? ((hje) a11).a : (List) a11);
                    j5x M = jx81.M(a10);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), sb2.P(entry.getValue()));
                    }
                    kjeVar.d = a.c(kjeVar.d, q3, M, new s6x(linkedHashMap));
                    i++;
                    j3 = 0;
                case 76397197:
                    if (!str.equals("PRINT")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a12 = kjeVar.a();
                    t5x t5xVar = kjeVar.e;
                    if (t5xVar != null) {
                        t5xVar.a(a12);
                    }
                    i++;
                    j3 = 0;
                case 79233217:
                    if (!str.equals("STORE")) {
                        throw new UnknownInstructionException(str);
                    }
                    i++;
                    int intValue = ((Integer) arrayList.get(i)).intValue();
                    Object a13 = kjeVar.a();
                    Object[] objArr = kjeVar.a;
                    if (intValue >= objArr.length) {
                        kjeVar.a = Arrays.copyOf(objArr, objArr.length * 2);
                    }
                    kjeVar.a[intValue] = a13;
                    i++;
                    j3 = 0;
                case 151351270:
                    if (!str.equals("STRING_TO_FLOAT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(Double.parseDouble((String) kjeVar.a())));
                    i++;
                    j3 = 0;
                case 215180831:
                    if (!str.equals("CONTAINS")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(evu0.y((String) kjeVar.a(), (String) kjeVar.a(), false)));
                    i++;
                    j3 = 0;
                case 220350152:
                    if (!str.equals("REM_INT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(((Long) kjeVar.a()).longValue() % ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case 250837810:
                    if (!str.equals("STRING_TO_BOOLEAN")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(Boolean.parseBoolean((String) kjeVar.a())));
                    i++;
                    j3 = 0;
                case 433113563:
                    if (!str.equals("LIST_APPEND")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a14 = kjeVar.a();
                    Object a15 = kjeVar.a();
                    kjeVar.d = a.a(kjeVar.d, eja1.q(a15 instanceof hje ? ((hje) a15).a : (List) a15), jx81.M(a14));
                    i++;
                    j3 = 0;
                case 455761719:
                    if (!str.equals("CMP_FLOAT64_LESS")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Double) kjeVar.a()).doubleValue() < ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case 527617601:
                    if (str.equals("TERMINATE")) {
                        throw new TerminatedException((String) kjeVar.a());
                    }
                    throw new UnknownInstructionException(str);
                case 535315573:
                    if (!str.equals("CMP_INT64_GREAT_OR_EQUAL")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Long) kjeVar.a()).longValue() >= ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case 574223181:
                    if (!str.equals("STATE_EQUALS")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a16 = kjeVar.a();
                    Object a17 = kjeVar.a();
                    kjeVar.b(Boolean.valueOf(jl40.l(bb1.J(kjeVar.d, eja1.q(a17 instanceof hje ? ((hje) a17).a : (List) a17)), bb1.J(kjeVar.d, eja1.q(a16 instanceof hje ? ((hje) a16).a : (List) a16)))));
                    i++;
                    j3 = 0;
                case 635001563:
                    if (!str.equals("SUB_FLOAT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(((Double) kjeVar.a()).doubleValue() - ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case 762430312:
                    if (!str.equals("CMP_FLOAT64_GREAT_OR_EQUAL")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Double) kjeVar.a()).doubleValue() >= ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case 992155281:
                    if (!str.equals("INVERT_FLOAT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(-((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case 1015522752:
                    if (!str.equals("CMP_FLOAT64_LESS_OR_EQUAL")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Double) kjeVar.a()).doubleValue() <= ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case 1027273133:
                    if (!str.equals("ENDS_WITH")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(cvu0.s((String) kjeVar.a(), (String) kjeVar.a(), false)));
                    i++;
                    j3 = 0;
                case 1213247476:
                    if (!str.equals("STARTS_WITH")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(cvu0.x((String) kjeVar.a(), (String) kjeVar.a(), false)));
                    i++;
                    j3 = 0;
                case 1239467151:
                    if (!str.equals("CMP_FLOAT64_GREAT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Double) kjeVar.a()).doubleValue() > ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case 1535188702:
                    if (!str.equals("BOOLEAN_TO_STRING")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(String.valueOf(((Boolean) kjeVar.a()).booleanValue()));
                    i++;
                    j3 = 0;
                case 1592040194:
                    if (!str.equals("LIST_SIZE")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a18 = kjeVar.a();
                    j5x J4 = bb1.J(kjeVar.d, eja1.q(a18 instanceof hje ? ((hje) a18).a : (List) a18));
                    if (J4 instanceof v4x) {
                        j = ((v4x) J4).a.size();
                    } else {
                        if (J4 != null) {
                            kbs.f(J4, "Expected array but actual node is ");
                            return null;
                        }
                        j = 0;
                    }
                    kjeVar.b(Long.valueOf(j));
                    i++;
                    j3 = 0;
                case 1631427666:
                    if (!str.equals("JUMP_IF_FALSE")) {
                        throw new UnknownInstructionException(str);
                    }
                    i++;
                    int intValue2 = ((Integer) arrayList.get(i)).intValue();
                    if (!((Boolean) kjeVar.a()).booleanValue()) {
                        i += intValue2;
                        j3 = 0;
                    }
                    i++;
                    j3 = 0;
                case 1720828921:
                    if (!str.equals("STRING_TO_INT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(Long.parseLong((String) kjeVar.a())));
                    i++;
                    j3 = 0;
                case 1804120049:
                    if (!str.equals("BREAKPOINT")) {
                        throw new UnknownInstructionException(str);
                    }
                    int intValue3 = ((Integer) arrayList.get(i + 1)).intValue();
                    i += 2;
                    int intValue4 = ((Integer) arrayList.get(i)).intValue();
                    String str3 = (String) arrayList2.get(intValue3);
                    Map map2 = (Map) arrayList2.get(intValue4);
                    b5x b5xVar = kjeVar.f;
                    if (b5xVar != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map2.size()));
                        for (Map.Entry entry2 : map2.entrySet()) {
                            Object key = entry2.getKey();
                            Object obj = kjeVar.a[(int) ((Number) entry2.getValue()).longValue()];
                            if (obj == null) {
                                ny61.g("Captured variable should be not null");
                                return null;
                            }
                            linkedHashMap2.put(key, obj);
                        }
                        b5xVar.a(str3, kjeVar.d, linkedHashMap2);
                    }
                    i++;
                    j3 = 0;
                case 1807547871:
                    if (!str.equals("IS_BLANK")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(evu0.J((String) kjeVar.a())));
                    i++;
                    j3 = 0;
                case 1811961869:
                    if (!str.equals("LAST_INDEX_OF")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(evu0.L((String) kjeVar.a(), (String) kjeVar.a(), 6)));
                    i++;
                    j3 = 0;
                case 1812479636:
                    if (!str.equals("REPLACE")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(cvu0.v((String) kjeVar.a(), (String) kjeVar.a(), (String) kjeVar.a(), false));
                    i++;
                    j3 = 0;
                case 1828781439:
                    if (!str.equals("DIV_INT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(((Long) kjeVar.a()).longValue() / ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case 1851617002:
                    if (!str.equals("DICT_SIZE")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a19 = kjeVar.a();
                    j5x J5 = bb1.J(kjeVar.d, eja1.q(a19 instanceof hje ? ((hje) a19).a : (List) a19));
                    if (J5 instanceof m5x) {
                        j2 = ((m5x) J5).a.size();
                    } else {
                        if (J5 != null) {
                            kbs.f(J5, "Expected object but actual node is ");
                            return null;
                        }
                        j2 = j3;
                    }
                    kjeVar.b(Long.valueOf(j2));
                    i++;
                    j3 = 0;
                case 1895345778:
                    if (!str.equals("MUL_INT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Long.valueOf(((Long) kjeVar.a()).longValue() * ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case 1932099679:
                    if (!str.equals("MUL_FLOAT64")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Double.valueOf(((Double) kjeVar.a()).doubleValue() * ((Double) kjeVar.a()).doubleValue()));
                    i++;
                    j3 = 0;
                case 1978027795:
                    if (!str.equals("CMP_INT64_LESS_OR_EQUAL")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(((Long) kjeVar.a()).longValue() <= ((Long) kjeVar.a()).longValue()));
                    i++;
                    j3 = 0;
                case 1993501460:
                    if (!str.equals("CONCAT")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(((String) kjeVar.a()).concat((String) kjeVar.a()));
                    i++;
                    j3 = 0;
                case 2012838315:
                    if (!str.equals("DELETE")) {
                        throw new UnknownInstructionException(str);
                    }
                    Object a20 = kjeVar.a();
                    kjeVar.d = a.g(kjeVar.d, eja1.q(a20 instanceof hje ? ((hje) a20).a : (List) a20));
                    i++;
                    j3 = 0;
                case 2052813759:
                    if (!str.equals("EQUALS")) {
                        throw new UnknownInstructionException(str);
                    }
                    kjeVar.b(Boolean.valueOf(kjeVar.a().equals(kjeVar.a())));
                    i++;
                    j3 = 0;
                default:
                    throw new UnknownInstructionException(str);
            }
        }
        int i4 = kjeVar.c;
        if (i4 > -1) {
            return kjeVar.b[i4];
        }
        return 0L;
    }

    public static final f530 e(g5y g5yVar, a5y a5yVar, Orientation orientation) {
        return new b5y(g5yVar, a5yVar, orientation);
    }

    public static void f(tt5 tt5Var, final v83 v83Var) {
        rs10 j = v83Var != null ? v83Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.pigeon_defaultConstructor", j, obj);
        if (v83Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: gsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    int i3 = 0;
                    v83 v83Var2 = v83Var;
                    switch (i2) {
                        case 0:
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), new jbj(v83Var2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            jbj jbjVar = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                OrientationEventListener orientationEventListener = jbjVar.c;
                                if (orientationEventListener != null) {
                                    jbjVar.b = null;
                                    orientationEventListener.disable();
                                    jbjVar.c = null;
                                }
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            jbj jbjVar2 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                Display k = jbjVar2.a.a.k();
                                if (k != null) {
                                    i3 = k.getRotation();
                                }
                                g3 = Collections.singletonList(Long.valueOf(i3));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            jbj jbjVar3 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(jbjVar3.a().toString());
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.startListeningForDeviceOrientationChange", j, obj);
        if (v83Var != null) {
            m2vVar2.G(new ee5() { // from class: io.flutter.plugins.camerax.a
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    v83 v83Var2 = v83.this;
                    final jbj jbjVar = (jbj) ((List) obj2).get(0);
                    try {
                        v83Var2.getClass();
                        OrientationEventListener orientationEventListener = jbjVar.c;
                        if (orientationEventListener != null) {
                            jbjVar.b = null;
                            orientationEventListener.disable();
                            jbjVar.c = null;
                        }
                        OrientationEventListener orientationEventListener2 = new OrientationEventListener((Context) jbjVar.a.a.A) { // from class: io.flutter.plugins.camerax.DeviceOrientationManager$1
                            @Override // android.view.OrientationEventListener
                            public void onOrientationChanged(int i2) {
                                jbj jbjVar2 = jbj.this;
                                PlatformChannel$DeviceOrientation a = jbjVar2.a();
                                PlatformChannel$DeviceOrientation platformChannel$DeviceOrientation = jbjVar2.b;
                                v83 v83Var3 = jbjVar2.a;
                                if (!a.equals(platformChannel$DeviceOrientation)) {
                                    v83Var3.a.O(new ibj(v83Var3, jbjVar2, a));
                                }
                                jbjVar2.b = a;
                            }
                        };
                        jbjVar.c = orientationEventListener2;
                        orientationEventListener2.enable();
                        g = Collections.singletonList(null);
                    } catch (Throwable th) {
                        if (th instanceof CameraXError) {
                            CameraXError cameraXError = th;
                            g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                        } else {
                            g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                        }
                    }
                    ce5Var.a(g);
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.stopListeningForDeviceOrientationChange", j, obj);
        if (v83Var != null) {
            final int i2 = 1;
            m2vVar3.G(new ee5() { // from class: gsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    int i3 = 0;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), new jbj(v83Var2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            jbj jbjVar = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                OrientationEventListener orientationEventListener = jbjVar.c;
                                if (orientationEventListener != null) {
                                    jbjVar.b = null;
                                    orientationEventListener.disable();
                                    jbjVar.c = null;
                                }
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            jbj jbjVar2 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                Display k = jbjVar2.a.a.k();
                                if (k != null) {
                                    i3 = k.getRotation();
                                }
                                g3 = Collections.singletonList(Long.valueOf(i3));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            jbj jbjVar3 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(jbjVar3.a().toString());
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.getDefaultDisplayRotation", j, obj);
        if (v83Var != null) {
            final int i3 = 2;
            m2vVar4.G(new ee5() { // from class: gsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    int i32 = 0;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), new jbj(v83Var2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            jbj jbjVar = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                OrientationEventListener orientationEventListener = jbjVar.c;
                                if (orientationEventListener != null) {
                                    jbjVar.b = null;
                                    orientationEventListener.disable();
                                    jbjVar.c = null;
                                }
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            jbj jbjVar2 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                Display k = jbjVar2.a.a.k();
                                if (k != null) {
                                    i32 = k.getRotation();
                                }
                                g3 = Collections.singletonList(Long.valueOf(i32));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            jbj jbjVar3 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(jbjVar3.a().toString());
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.getUiOrientation", j, obj);
        if (v83Var == null) {
            m2vVar5.G(null);
        } else {
            final int i4 = 3;
            m2vVar5.G(new ee5() { // from class: gsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i4;
                    int i32 = 0;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), new jbj(v83Var2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            jbj jbjVar = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                OrientationEventListener orientationEventListener = jbjVar.c;
                                if (orientationEventListener != null) {
                                    jbjVar.b = null;
                                    orientationEventListener.disable();
                                    jbjVar.c = null;
                                }
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            jbj jbjVar2 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                Display k = jbjVar2.a.a.k();
                                if (k != null) {
                                    i32 = k.getRotation();
                                }
                                g3 = Collections.singletonList(Long.valueOf(i32));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            jbj jbjVar3 = (jbj) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(jbjVar3.a().toString());
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        }
    }
}
