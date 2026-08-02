package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import com.connectsdk.discovery.provider.ssdp.SSDPClient;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.track.TrackFadeDto;
import com.yandex.music.shared.trailers.api.model.SmartPreviewParamsDto;
import com.yandex.music.shared.trailers.api.model.TrackWithSmartPreviewDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class zc4 implements kbp {
    public static ExecutorService b;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final l29 g;
    public static final byte[] h;
    public static final float[] i;
    public static final Object j;
    public static int[] k;
    public static final Object l;
    public static String m;
    public static final Object a = new Object();
    public static final wn5 c = new wn5(new go5(17), 1772303124, false);

    static {
        new wn5(new fo5(25), -340551562, false);
        new wn5(new fo5(26), 2049183080, false);
        d = new wn5(new lo5(29), 1581039716, false);
        e = new wn5(new bp5(9), -622798982, false);
        f = new wn5(new bp5(10), -473608555, false);
        new wn5(new bp5(11), 1835240573, false);
        new wn5(new bp5(12), -1723100106, false);
        new wn5(new bp5(13), 1769193755, false);
        new wn5(new bp5(14), -1495581220, false);
        g = new l29(19);
        h = new byte[]{0, 0, 0, 1};
        i = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        j = new Object();
        k = new int[10];
        l = new Object();
    }

    public static u28 A(a38 a38Var, int i2) {
        a38Var.getClass();
        q1c r = yd5.r(a38Var);
        r1c r1cVar = r1c.c;
        Integer valueOf = Integer.valueOf(i2);
        String str = a38Var.a;
        String str2 = a38Var.b;
        if (str2 == null) {
            str2 = "N/A";
        }
        String str3 = a38Var.d;
        if (str3 == null) {
            str3 = "N/A";
        }
        String str4 = a38Var.c;
        String str5 = str4 != null ? str4 : "N/A";
        StringBuilder r2 = k5r.r(i2, "Diehard Error: http_code - ", ", status - ", str, ", status_code - ");
        su4.v(r2, str2, ", status_3ds - ", str3, ", description - ");
        r2.append(str5);
        return new u28(r, r1cVar, valueOf, r2.toString(), str, 32);
    }

    public static final float B(ja0 ja0Var) {
        ja0Var.getClass();
        float D = 1 - (D(ja0Var) * 2.0f);
        if (D < 0.0f) {
            return 0.0f;
        }
        return D;
    }

    public static String C(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                tde u = yde.u();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int z = z(bArr, i3, bArr.length, zArr);
                    if (z != bArr.length) {
                        u.a(Integer.valueOf(z));
                    }
                    i3 = z + 3;
                }
                qsn f2 = u.f();
                for (int i4 = 0; i4 < f2.d; i4++) {
                    if (((Integer) f2.get(i4)).intValue() + 3 < length) {
                        v94 v94Var = new v94(bArr, ((Integer) f2.get(i4)).intValue() + 3, length);
                        aa P = P(v94Var);
                        if (P.a == 33 && P.b == 0) {
                            v94Var.t(4);
                            int i5 = v94Var.i(3);
                            v94Var.s();
                            fwi Q = Q(v94Var, true, i5, null);
                            return ir4.b(Q.a, Q.b, Q.c, Q.d, Q.e, Q.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final float D(ja0 ja0Var) {
        ja0Var.getClass();
        ml7 c2 = ja0Var.c();
        lf3 lf3Var = lf3.a;
        if (Float.isNaN(c2.d(lf3Var))) {
            return 0.0f;
        }
        ml7 c3 = ja0Var.c();
        lf3 lf3Var2 = lf3.b;
        if (Float.isNaN(c3.d(lf3Var2))) {
            return 0.0f;
        }
        return ja0Var.f(lf3Var, lf3Var2);
    }

    public static Uri E(Bundle bundle, String str) {
        str.getClass();
        Collection collection = qjp.a;
        return gvt.a(String.format("m.%s", Arrays.copyOf(new Object[]{j3c.p}, 1)), j3c.e() + "/dialog/" + str, bundle);
    }

    public static int F(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static boolean G(byte[] bArr, int i2, dsc dscVar) {
        int i3;
        if (Objects.equals(dscVar.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(dscVar.n, "video/hevc")) {
            aa P = P(new v94(bArr, 4, i2 + 4));
            int i4 = P.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && P.c == dscVar.C - 1) {
                return false;
            }
        }
        return true;
    }

    public static final c7 H(Object[] objArr) {
        objArr.getClass();
        return new c7(objArr);
    }

    public static boolean K(n7q n7qVar, String str, k3q k3qVar, Function0 function0) {
        n7qVar.getClass();
        str.getClass();
        return ((Boolean) wdg.A(n7qVar, new nsh(str, k3qVar, function0))).booleanValue();
    }

    public static wxi L(ek ekVar, boolean z, hq5 hq5Var, int i2) {
        boolean z2;
        ekVar.getClass();
        if ((i2 & 2) != 0) {
            z = true;
        }
        boolean z3 = ekVar.a;
        kjn kjnVar = gq5.a;
        if (z3) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(601501672);
            Object K = oq5Var.K();
            if (K == kjnVar) {
                K = new bk();
                oq5Var.k0(K);
            }
            bk bkVar = (bk) K;
            oq5Var.p(false);
            return bkVar;
        }
        if (z3) {
            throw vz1.i((oq5) hq5Var, -1781713467, false);
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-1781709013);
        mct mctVar = ekVar.b;
        mctVar.getClass();
        msa msaVar = nsa.b;
        long M = yd5.M(300, ssa.MILLISECONDS);
        oq5Var2.Z(837993783);
        if (z) {
            oq5Var2.Z(-1972014904);
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            Unit unit = Unit.a;
            boolean e2 = oq5Var2.e(M);
            Object K3 = oq5Var2.K();
            if (e2 || K3 == kjnVar) {
                fv7 fv7Var = new fv7(M, aqiVar, null, 2);
                oq5Var2.k0(fv7Var);
                K3 = fv7Var;
            }
            gld.w(oq5Var2, unit, (Function2) K3);
            z2 = ((Boolean) aqiVar.getValue()).booleanValue();
            oq5Var2.p(false);
            oq5Var2.p(false);
        } else {
            oq5Var2.Z(-1971789906);
            oq5Var2.p(false);
            oq5Var2.p(false);
            z2 = false;
        }
        aqi o0 = szf.o0(Boolean.valueOf(z2), oq5Var2);
        Object K4 = oq5Var2.K();
        if (K4 == kjnVar) {
            K4 = new cct(mctVar, o0);
            oq5Var2.k0(K4);
        }
        cct cctVar = (cct) K4;
        oq5Var2.p(false);
        return cctVar;
    }

    public static int N(dsc dscVar) {
        if (Objects.equals(dscVar.n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(dscVar.n, "video/hevc") || l5i.c(dscVar.k, "video/hevc") != null) ? 2 : 0;
    }

    public static long O(int i2, String str) {
        int w = w(str, false, 0, i2);
        Matcher matcher = ek6.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (w < i2) {
            int w2 = w(str, true, w + 1, i2);
            matcher.region(w, w2);
            if (i4 == -1 && matcher.usePattern(ek6.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(ek6.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = ek6.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        String s = ouj.s(locale, group5, locale);
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = StringsKt.T(pattern2, s, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(ek6.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            w = w(str, false, w2 + 1, i2);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += SSDPClient.PORT;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            xq0.x("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            xq0.x("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            xq0.x("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            xq0.x("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            xq0.x("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            xq0.x("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(cvt.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static aa P(v94 v94Var) {
        v94Var.s();
        return new aa(v94Var.i(6), v94Var.i(6), v94Var.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fwi Q(v94 v94Var, boolean z, int i2, fwi fwiVar) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (z) {
            int i8 = v94Var.i(2);
            z3 = v94Var.h();
            i6 = v94Var.i(5);
            i7 = 0;
            for (int i9 = 0; i9 < 32; i9++) {
                if (v94Var.h()) {
                    i7 |= 1 << i9;
                }
            }
            for (int i10 = 0; i10 < 6; i10++) {
                iArr2[i10] = v94Var.i(8);
            }
            i3 = i8;
        } else {
            if (fwiVar == null) {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
                int i11 = v94Var.i(8);
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    if (v94Var.h()) {
                        i12 += 88;
                    }
                    if (v94Var.h()) {
                        i12 += 8;
                    }
                }
                v94Var.t(i12);
                if (i2 > 0) {
                    v94Var.t((8 - i2) * 2);
                }
                return new fwi(i3, z2, i4, i5, iArr, i11);
            }
            int i14 = fwiVar.a;
            z3 = fwiVar.b;
            i6 = fwiVar.c;
            i7 = fwiVar.d;
            iArr2 = fwiVar.e;
            i3 = i14;
        }
        iArr = iArr2;
        z2 = z3;
        i4 = i6;
        i5 = i7;
        int i112 = v94Var.i(8);
        int i122 = 0;
        while (i13 < i2) {
        }
        v94Var.t(i122);
        if (i2 > 0) {
        }
        return new fwi(i3, z2, i4, i5, iArr, i112);
    }

    public static jsg R(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        v94 v94Var = new v94(bArr, i4, i3 + 1);
        while (v94Var.d(16)) {
            int i5 = v94Var.i(8);
            int i6 = 0;
            while (i5 == 255) {
                i6 += KotlinVersion.MAX_COMPONENT_VALUE;
                i5 = v94Var.i(8);
            }
            int i7 = i6 + i5;
            int i8 = v94Var.i(8);
            int i9 = 0;
            while (i8 == 255) {
                i9 += KotlinVersion.MAX_COMPONENT_VALUE;
                i8 = v94Var.i(8);
            }
            int i10 = i9 + i8;
            if (i10 == 0 || !v94Var.d(i10)) {
                return null;
            }
            if (i7 == 176) {
                int m2 = v94Var.m();
                boolean h2 = v94Var.h();
                int m3 = h2 ? v94Var.m() : 0;
                int m4 = v94Var.m();
                int i11 = -1;
                for (int i12 = 0; i12 <= m4; i12++) {
                    i11 = v94Var.m();
                    v94Var.m();
                    int i13 = v94Var.i(6);
                    if (i13 == 63) {
                        return null;
                    }
                    v94Var.i(i13 == 0 ? Math.max(0, m2 - 30) : Math.max(0, (i13 + m2) - 31));
                    if (h2) {
                        int i14 = v94Var.i(6);
                        if (i14 == 63) {
                            return null;
                        }
                        v94Var.i(i14 == 0 ? Math.max(0, m3 - 30) : Math.max(0, (i14 + m3) - 31));
                    }
                    if (v94Var.h()) {
                        v94Var.t(10);
                    }
                }
                return new jsg(i11, 8);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hwi S(byte[] bArr, int i2, int i3, xdh xdhVar) {
        int i4;
        int i5;
        int i6;
        int m2;
        int m3;
        int i7;
        int m4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        jtc jtcVar;
        int i15;
        int i16;
        int i17;
        qdc qdcVar;
        aa P = P(new v94(bArr, i2, i3));
        v94 v94Var = new v94(bArr, i2 + 2, i3);
        int i18 = 4;
        v94Var.t(4);
        int i19 = v94Var.i(3);
        int i20 = P.b;
        boolean z = i20 != 0 && i19 == 7;
        if (xdhVar != null) {
            yde ydeVar = (yde) xdhVar.a;
            if (!ydeVar.isEmpty()) {
                i4 = ((ewi) ydeVar.get(Math.min(i20, ydeVar.size() - 1))).a;
                fwi fwiVar = null;
                if (z) {
                    v94Var.s();
                    fwiVar = Q(v94Var, true, i19, null);
                } else if (xdhVar != null) {
                    j6e j6eVar = (j6e) xdhVar.b;
                    int[] iArr = (int[]) j6eVar.b;
                    yde ydeVar2 = (yde) j6eVar.a;
                    int i21 = iArr[i4];
                    if (ydeVar2.size() > i21) {
                        fwiVar = (fwi) ydeVar2.get(i21);
                    }
                }
                v94Var.m();
                if (z) {
                    int m5 = v94Var.m();
                    if (m5 == 3) {
                        v94Var.s();
                    }
                    int m6 = v94Var.m();
                    int m7 = v94Var.m();
                    if (v94Var.h()) {
                        int m8 = v94Var.m();
                        int m9 = v94Var.m();
                        int m10 = v94Var.m();
                        int m11 = v94Var.m();
                        m6 -= (m8 + m9) * ((m5 == 1 || m5 == 2) ? 2 : 1);
                        m7 -= (m10 + m11) * (m5 == 1 ? 2 : 1);
                    }
                    i5 = m7;
                    i6 = m6;
                    m2 = v94Var.m();
                    m3 = v94Var.m();
                } else {
                    int i22 = v94Var.h() ? v94Var.i(8) : -1;
                    if (xdhVar != null && (qdcVar = (qdc) xdhVar.c) != null) {
                        yde ydeVar3 = (yde) qdcVar.b;
                        if (i22 == -1) {
                            i22 = ((int[]) qdcVar.c)[i4];
                        }
                        if (i22 != -1 && ydeVar3.size() > i22) {
                            gwi gwiVar = (gwi) ydeVar3.get(i22);
                            int i23 = gwiVar.a;
                            i6 = gwiVar.d;
                            i5 = gwiVar.e;
                            m2 = gwiVar.b;
                            m3 = gwiVar.c;
                        }
                    }
                    m2 = 0;
                    m3 = 0;
                    i6 = 0;
                    i5 = 0;
                }
                int m12 = v94Var.m();
                if (z) {
                    i7 = -1;
                    for (int i24 = v94Var.h() ? 0 : i19; i24 <= i19; i24++) {
                        v94Var.m();
                        i7 = Math.max(v94Var.m(), i7);
                        v94Var.m();
                    }
                } else {
                    i7 = -1;
                }
                v94Var.m();
                v94Var.m();
                v94Var.m();
                v94Var.m();
                v94Var.m();
                v94Var.m();
                if (v94Var.h()) {
                    int i25 = 6;
                    if (z ? v94Var.h() : false) {
                        v94Var.t(6);
                    } else if (v94Var.h()) {
                        int i26 = 0;
                        while (i26 < i18) {
                            int i27 = 0;
                            while (i27 < i25) {
                                if (v94Var.h()) {
                                    int min = Math.min(64, 1 << ((i26 << 1) + 4));
                                    if (i26 > 1) {
                                        v94Var.n();
                                    }
                                    for (int i28 = 0; i28 < min; i28++) {
                                        v94Var.n();
                                    }
                                } else {
                                    v94Var.m();
                                }
                                i27 += i26 == 3 ? 3 : 1;
                                i25 = 6;
                            }
                            i26++;
                            i18 = 4;
                            i25 = 6;
                        }
                    }
                }
                v94Var.t(2);
                if (v94Var.h()) {
                    v94Var.t(8);
                    v94Var.m();
                    v94Var.m();
                    v94Var.s();
                }
                m4 = v94Var.m();
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                i8 = 0;
                int i29 = -1;
                int i30 = -1;
                while (i8 < m4) {
                    if (i8 == 0 || !v94Var.h()) {
                        i15 = m4;
                        i16 = i4;
                        i17 = i8;
                        int m13 = v94Var.m();
                        i29 = v94Var.m();
                        int[] iArr4 = new int[m13];
                        int i31 = 0;
                        while (i31 < m13) {
                            iArr4[i31] = (i31 > 0 ? iArr4[i31 - 1] : 0) - (v94Var.m() + 1);
                            v94Var.s();
                            i31++;
                        }
                        int[] iArr5 = new int[i29];
                        int i32 = 0;
                        while (i32 < i29) {
                            iArr5[i32] = v94Var.m() + 1 + (i32 > 0 ? iArr5[i32 - 1] : 0);
                            v94Var.s();
                            i32++;
                        }
                        i30 = m13;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i15 = m4;
                        int i33 = i30 + i29;
                        int m14 = (1 - ((v94Var.h() ? 1 : 0) * 2)) * (v94Var.m() + 1);
                        i16 = i4;
                        int i34 = i33 + 1;
                        i17 = i8;
                        boolean[] zArr = new boolean[i34];
                        for (int i35 = 0; i35 <= i33; i35++) {
                            if (v94Var.h()) {
                                zArr[i35] = true;
                            } else {
                                zArr[i35] = v94Var.h();
                            }
                        }
                        int[] iArr6 = new int[i34];
                        int[] iArr7 = new int[i34];
                        int i36 = 0;
                        for (int i37 = i29 - 1; i37 >= 0; i37--) {
                            int i38 = iArr3[i37] + m14;
                            if (i38 < 0 && zArr[i30 + i37]) {
                                iArr6[i36] = i38;
                                i36++;
                            }
                        }
                        if (m14 < 0 && zArr[i33]) {
                            iArr6[i36] = m14;
                            i36++;
                        }
                        int i39 = i36;
                        int[] iArr8 = iArr2;
                        for (int i40 = 0; i40 < i30; i40++) {
                            int i41 = iArr8[i40] + m14;
                            if (i41 < 0 && zArr[i40]) {
                                iArr6[i39] = i41;
                                i39++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i39);
                        int i42 = 0;
                        for (int i43 = i30 - 1; i43 >= 0; i43--) {
                            int i44 = iArr8[i43] + m14;
                            if (i44 > 0 && zArr[i43]) {
                                iArr7[i42] = i44;
                                i42++;
                            }
                        }
                        if (m14 > 0 && zArr[i33]) {
                            iArr7[i42] = m14;
                            i42++;
                        }
                        int i45 = i39;
                        int i46 = i42;
                        for (int i47 = 0; i47 < i29; i47++) {
                            int i48 = iArr3[i47] + m14;
                            if (i48 > 0 && zArr[i30 + i47]) {
                                iArr7[i46] = i48;
                                i46++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i46);
                        i29 = i46;
                        i30 = i45;
                        iArr2 = copyOf;
                    }
                    i8 = i17 + 1;
                    m4 = i15;
                    i4 = i16;
                }
                int i49 = i4;
                if (v94Var.h()) {
                    int m15 = v94Var.m();
                    for (int i50 = 0; i50 < m15; i50++) {
                        v94Var.t(m12 + 5);
                    }
                }
                v94Var.t(2);
                float f2 = 1.0f;
                if (v94Var.h()) {
                    i9 = -1;
                    i10 = -1;
                    i11 = -1;
                } else {
                    if (v94Var.h()) {
                        int i51 = v94Var.i(8);
                        if (i51 == 255) {
                            int i52 = v94Var.i(16);
                            int i53 = v94Var.i(16);
                            if (i52 != 0 && i53 != 0) {
                                f2 = i52 / i53;
                            }
                        } else if (i51 < 17) {
                            f2 = i[i51];
                        } else {
                            dfi.o(i51, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (v94Var.h()) {
                        v94Var.s();
                    }
                    if (v94Var.h()) {
                        v94Var.t(3);
                        i14 = v94Var.h() ? 1 : 2;
                        if (v94Var.h()) {
                            int i54 = v94Var.i(8);
                            int i55 = v94Var.i(8);
                            v94Var.t(8);
                            i12 = q85.f(i54);
                            i13 = q85.g(i55);
                        } else {
                            i12 = -1;
                            i13 = -1;
                        }
                    } else {
                        if (xdhVar != null && (jtcVar = (jtc) xdhVar.d) != null) {
                            yde ydeVar4 = (yde) jtcVar.a;
                            int i56 = ((int[]) jtcVar.b)[i49];
                            if (ydeVar4.size() > i56) {
                                iwi iwiVar = (iwi) ydeVar4.get(i56);
                                int i57 = iwiVar.a;
                                int i58 = iwiVar.b;
                                i13 = iwiVar.c;
                                i12 = i57;
                                i14 = i58;
                            }
                        }
                        i12 = -1;
                        i13 = -1;
                        i14 = -1;
                    }
                    if (v94Var.h()) {
                        v94Var.m();
                        v94Var.m();
                    }
                    v94Var.s();
                    if (v94Var.h()) {
                        i5 *= 2;
                    }
                    i9 = i12;
                    i11 = i13;
                    i10 = i14;
                }
                return new hwi(i19, fwiVar, m2, m3, i6, i5, f2, i7, i9, i10, i11);
            }
        }
        i4 = 0;
        fwi fwiVar2 = null;
        if (z) {
        }
        v94Var.m();
        if (z) {
        }
        int m122 = v94Var.m();
        if (z) {
        }
        v94Var.m();
        v94Var.m();
        v94Var.m();
        v94Var.m();
        v94Var.m();
        v94Var.m();
        if (v94Var.h()) {
        }
        v94Var.t(2);
        if (v94Var.h()) {
        }
        m4 = v94Var.m();
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        i8 = 0;
        int i292 = -1;
        int i302 = -1;
        while (i8 < m4) {
        }
        int i492 = i4;
        if (v94Var.h()) {
        }
        v94Var.t(2);
        float f22 = 1.0f;
        if (v94Var.h()) {
        }
        return new hwi(i19, fwiVar2, m2, m3, i6, i5, f22, i7, i9, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xdh T(byte[] bArr, int i2, int i3) {
        int[] iArr;
        int[] iArr2;
        jtc jtcVar;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        qsn qsnVar;
        boolean[][] zArr;
        int i8;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i9;
        boolean z2;
        int i10;
        boolean h2;
        int i11;
        int i12;
        int i13;
        boolean h3;
        int i14;
        int i15;
        boolean z3;
        boolean z4;
        v94 v94Var = new v94(bArr, i2, i3);
        P(v94Var);
        v94Var.t(4);
        boolean h4 = v94Var.h();
        boolean h5 = v94Var.h();
        int i16 = v94Var.i(6);
        int i17 = i16 + 1;
        int i18 = v94Var.i(3);
        v94Var.t(17);
        fwi Q = Q(v94Var, true, i18, null);
        for (int i19 = v94Var.h() ? 0 : i18; i19 <= i18; i19++) {
            v94Var.m();
            v94Var.m();
            v94Var.m();
        }
        int i20 = v94Var.i(6);
        int m2 = v94Var.m() + 1;
        int i21 = 6;
        j6e j6eVar = new j6e(yde.y(Q), new int[1]);
        boolean z5 = i17 >= 2 && m2 >= 2;
        boolean z6 = h4 && h5;
        int i22 = i20 + 1;
        boolean z7 = i22 >= i17;
        if (!z5 || !z6 || !z7) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, m2, i22);
        int i23 = 1;
        int[] iArr6 = new int[m2];
        int[] iArr7 = new int[m2];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i24 = 1; i24 < m2; i24++) {
            int i25 = 0;
            for (int i26 = 0; i26 <= i20; i26++) {
                if (v94Var.h()) {
                    iArr5[i24][i25] = i26;
                    iArr7[i24] = i26;
                    i25++;
                }
                iArr6[i24] = i25;
            }
        }
        if (v94Var.h()) {
            v94Var.t(64);
            if (v94Var.h()) {
                v94Var.m();
            }
            int m3 = v94Var.m();
            int i27 = 0;
            while (i27 < m3) {
                v94Var.m();
                if (i27 == 0 || v94Var.h()) {
                    boolean h6 = v94Var.h();
                    boolean h7 = v94Var.h();
                    z4 = h6;
                    z3 = h7;
                    if (h6 || h7) {
                        h2 = v94Var.h();
                        if (h2) {
                            v94Var.t(19);
                        }
                        v94Var.t(8);
                        if (h2) {
                            v94Var.t(4);
                        }
                        v94Var.t(15);
                        i12 = h6;
                        i11 = h7;
                        i13 = 0;
                        while (i13 <= i18) {
                            boolean h8 = v94Var.h();
                            if (!h8) {
                                h8 = v94Var.h();
                            }
                            if (h8) {
                                v94Var.m();
                                h3 = false;
                            } else {
                                h3 = v94Var.h();
                            }
                            if (h3) {
                                i14 = i27;
                                i15 = 0;
                            } else {
                                i14 = i27;
                                i15 = v94Var.m();
                            }
                            int[][] iArr8 = iArr5;
                            int i28 = i12 + i11;
                            int[] iArr9 = iArr7;
                            int i29 = 0;
                            while (i29 < i28) {
                                int i30 = i28;
                                for (int i31 = 0; i31 <= i15; i31++) {
                                    v94Var.m();
                                    v94Var.m();
                                    if (h2) {
                                        v94Var.m();
                                        v94Var.m();
                                    }
                                    v94Var.s();
                                }
                                i29++;
                                i28 = i30;
                            }
                            i13++;
                            i27 = i14;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i27++;
                    }
                } else {
                    z4 = false;
                    z3 = false;
                }
                h2 = false;
                i12 = z4;
                i11 = z3;
                i13 = 0;
                while (i13 <= i18) {
                }
                i27++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!v94Var.h()) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        int i32 = v94Var.e;
        if (i32 > 0) {
            v94Var.t(8 - i32);
        }
        fwi Q2 = Q(v94Var, false, i18, Q);
        boolean h9 = v94Var.h();
        boolean[] zArr3 = new boolean[16];
        int i33 = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            boolean h10 = v94Var.h();
            zArr3[i34] = h10;
            if (h10) {
                i33++;
            }
        }
        if (i33 == 0 || !zArr3[1]) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        int[] iArr12 = new int[i33];
        for (int i35 = 0; i35 < i33 - (h9 ? 1 : 0); i35++) {
            iArr12[i35] = v94Var.i(3);
        }
        int[] iArr13 = new int[i33 + 1];
        if (h9) {
            int i36 = 1;
            while (i36 < i33) {
                int[] iArr14 = iArr13;
                for (int i37 = 0; i37 < i36; i37++) {
                    iArr14[i36] = iArr12[i37] + 1 + iArr14[i36];
                }
                i36++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i33] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i17, i33);
        int[] iArr16 = new int[i17];
        iArr16[0] = 0;
        boolean h11 = v94Var.h();
        int i38 = 1;
        while (i38 < i17) {
            if (h11) {
                i10 = i38;
                iArr16[i10] = v94Var.i(i21);
            } else {
                i10 = i38;
                iArr16[i10] = i10;
            }
            if (h9) {
                for (int i39 = 0; i39 < i33; i39++) {
                    iArr15[i10][i39] = (iArr16[i10] & ((1 << iArr[r31]) - 1)) >> iArr[i39];
                }
            } else {
                int i40 = 0;
                while (i40 < i33) {
                    int i41 = i40;
                    iArr15[i10][i41] = v94Var.i(iArr12[i40] + 1);
                    i40 = i41 + 1;
                }
            }
            i38 = i10 + 1;
            i21 = 6;
        }
        int[] iArr17 = new int[i22];
        int i42 = 1;
        int i43 = 0;
        while (i43 < i17) {
            iArr17[iArr16[i43]] = -1;
            int[] iArr18 = iArr17;
            int i44 = 0;
            int i45 = 0;
            while (i44 < 16) {
                if (zArr3[i44]) {
                    if (i44 == i23) {
                        iArr18[iArr16[i43]] = iArr15[i43][i45];
                    }
                    i45++;
                }
                i44++;
                i23 = 1;
            }
            if (i43 > 0) {
                int i46 = 0;
                while (true) {
                    if (i46 >= i43) {
                        z2 = true;
                        break;
                    }
                    int i47 = i46;
                    if (iArr18[iArr16[i43]] == iArr18[iArr16[i46]]) {
                        z2 = false;
                        break;
                    }
                    i46 = i47 + 1;
                }
                if (z2) {
                    i42++;
                }
            }
            i43++;
            iArr17 = iArr18;
            i23 = 1;
        }
        int[] iArr19 = iArr17;
        int i48 = v94Var.i(4);
        if (i42 < 2 || i48 == 0) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        int[] iArr20 = new int[i42];
        for (int i49 = 0; i49 < i42; i49++) {
            iArr20[i49] = v94Var.i(i48);
        }
        int[] iArr21 = new int[i22];
        for (int i50 = 0; i50 < i17; i50++) {
            iArr21[Math.min(iArr16[i50], i20)] = i50;
        }
        tde u = yde.u();
        int i51 = 0;
        while (i51 <= i20) {
            int[] iArr22 = iArr21;
            int i52 = i42;
            int min = Math.min(iArr19[i51], i52 - 1);
            u.a(new ewi(iArr22[i51], min >= 0 ? iArr20[min] : -1));
            i51++;
            iArr21 = iArr22;
            iArr16 = iArr16;
            i42 = i52;
        }
        int[] iArr23 = iArr16;
        qsn f2 = u.f();
        if (((ewi) f2.get(0)).b == -1) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        int i53 = 1;
        while (true) {
            if (i53 > i20) {
                i53 = -1;
                break;
            }
            if (((ewi) f2.get(i53)).b != -1) {
                break;
            }
            i53++;
        }
        if (i53 == -1) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i17, i17);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i17, i17);
        for (int i54 = 1; i54 < i17; i54++) {
            for (int i55 = 0; i55 < i54; i55++) {
                boolean[] zArr6 = zArr4[i54];
                boolean[] zArr7 = zArr5[i54];
                boolean h12 = v94Var.h();
                zArr7[i55] = h12;
                zArr6[i55] = h12;
            }
        }
        for (int i56 = 1; i56 < i17; i56++) {
            int i57 = 0;
            while (i57 < i16) {
                boolean[][] zArr8 = zArr4;
                int i58 = 0;
                while (true) {
                    if (i58 < i56) {
                        boolean[] zArr9 = zArr5[i56];
                        if (zArr9[i58] && zArr5[i58][i57]) {
                            zArr9[i57] = true;
                            break;
                        }
                        i58++;
                    }
                }
                i57++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr24 = new int[i22];
        for (int i59 = 0; i59 < i17; i59++) {
            int i60 = 0;
            for (int i61 = 0; i61 < i59; i61++) {
                i60 += zArr10[i59][i61] ? 1 : 0;
            }
            iArr24[iArr23[i59]] = i60;
        }
        int i62 = 0;
        for (int i63 = 0; i63 < i17; i63++) {
            if (iArr24[iArr23[i63]] == 0) {
                i62++;
            }
        }
        if (i62 > 1) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        int[] iArr25 = new int[i17];
        int[] iArr26 = new int[m2];
        if (v94Var.h()) {
            iArr2 = iArr24;
            int i64 = 0;
            while (i64 < i17) {
                int i65 = i64;
                iArr25[i65] = v94Var.i(3);
                i64 = i65 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i17, i18);
        }
        int i66 = 0;
        while (i66 < m2) {
            int i67 = i66;
            boolean[][] zArr11 = zArr5;
            int[] iArr27 = iArr25;
            int i68 = 0;
            for (int i69 = 0; i69 < iArr6[i67]; i69++) {
                i68 = Math.max(i68, iArr27[((ewi) f2.get(iArr10[i67][i69])).a]);
            }
            iArr26[i67] = i68 + 1;
            i66 = i67 + 1;
            zArr5 = zArr11;
            iArr25 = iArr27;
        }
        boolean[][] zArr12 = zArr5;
        if (v94Var.h()) {
            int i70 = 0;
            while (i70 < i16) {
                int i71 = i70 + 1;
                int i72 = i71;
                while (i72 < i17) {
                    if (zArr10[i72][i70]) {
                        i9 = i16;
                        v94Var.t(3);
                    } else {
                        i9 = i16;
                    }
                    i72++;
                    i16 = i9;
                }
                i70 = i71;
            }
        }
        v94Var.s();
        int m4 = v94Var.m() + 1;
        tde u2 = yde.u();
        u2.a(Q);
        if (m4 > 1) {
            u2.a(Q2);
            for (int i73 = 2; i73 < m4; i73++) {
                Q2 = Q(v94Var, v94Var.h(), i18, Q2);
                u2.a(Q2);
            }
        }
        qsn f3 = u2.f();
        int m5 = v94Var.m() + m2;
        if (m5 > m2) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        int i74 = v94Var.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, m5, i22);
        int[] iArr28 = new int[m5];
        int i75 = 0;
        int[] iArr29 = new int[m5];
        int i76 = 0;
        while (i76 < m2) {
            iArr28[i76] = i75;
            iArr29[i76] = iArr11[i76];
            if (i74 == 0) {
                i8 = i76;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                Arrays.fill(zArr13[i8], i75, iArr6[i8], true);
                iArr3[i8] = iArr6[i8];
            } else {
                i8 = i76;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                if (i74 == 1) {
                    int i77 = iArr11[i8];
                    for (int i78 = 0; i78 < iArr6[i8]; i78++) {
                        zArr2[i8][i78] = iArr10[i8][i78] == i77;
                    }
                    iArr3[i8] = 1;
                } else {
                    i75 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i76 = i8 + 1;
                    zArr13 = zArr2;
                    iArr28 = iArr3;
                    iArr26 = iArr4;
                }
            }
            i75 = 0;
            i76 = i8 + 1;
            zArr13 = zArr2;
            iArr28 = iArr3;
            iArr26 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr30 = iArr28;
        int[] iArr31 = iArr26;
        int[] iArr32 = new int[i22];
        int i79 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i22;
        iArr33[i75] = m5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i80 = 1;
        int i81 = 0;
        while (i80 < m5) {
            if (i74 == i79) {
                for (int i82 = 0; i82 < iArr6[i80]; i82++) {
                    zArr14[i80][i82] = v94Var.h();
                    int i83 = iArr30[i80];
                    boolean z8 = zArr14[i80][i82];
                    iArr30[i80] = i83 + (z8 ? 1 : 0);
                    if (z8) {
                        iArr29[i80] = iArr10[i80][i82];
                    }
                }
            }
            if (i81 == 0) {
                i7 = 0;
                if (iArr10[i80][0] == 0 && zArr14[i80][0]) {
                    for (int i84 = 1; i84 < iArr6[i80]; i84++) {
                        if (iArr10[i80][i84] == i53 && zArr14[i80][i53]) {
                            i81 = i80;
                        }
                    }
                }
            } else {
                i7 = 0;
            }
            int i85 = i7;
            while (i85 < iArr6[i80]) {
                if (m4 > 1) {
                    zArr15[i80][i85] = zArr14[i80][i85];
                    qsnVar = f3;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c2 = f9a.c(m4);
                    if (!zArr[i80][i85]) {
                        int i86 = ((ewi) f2.get(iArr10[i80][i85])).a;
                        int i87 = i7;
                        while (true) {
                            if (i87 >= i85) {
                                break;
                            }
                            int i88 = i87;
                            if (zArr12[i86][((ewi) f2.get(iArr10[i80][i88])).a]) {
                                zArr[i80][i85] = true;
                                break;
                            }
                            i87 = i88 + 1;
                        }
                    }
                    if (zArr[i80][i85]) {
                        if (i81 <= 0 || i80 != i81) {
                            v94Var.t(c2);
                        } else {
                            iArr32[i85] = v94Var.i(c2);
                        }
                    }
                } else {
                    qsnVar = f3;
                    zArr = zArr15;
                }
                i85++;
                f3 = qsnVar;
                zArr15 = zArr;
            }
            qsn qsnVar2 = f3;
            boolean[][] zArr16 = zArr15;
            if (iArr30[i80] == 1 && iArr2[iArr29[i80]] > 0) {
                v94Var.s();
            }
            i80++;
            f3 = qsnVar2;
            zArr15 = zArr16;
            i79 = 2;
        }
        qsn qsnVar3 = f3;
        boolean[][] zArr17 = zArr15;
        if (i81 == 0) {
            return new xdh((qsn) null, j6eVar, (qdc) null, (jtc) null);
        }
        int m6 = v94Var.m();
        int i89 = m6 + 1;
        hld.w(i89, "expectedSize");
        hld.w(i89, "initialCapacity");
        int[] iArr34 = new int[i17];
        Object[] objArr = new Object[i89];
        int i90 = 0;
        int i91 = 0;
        boolean z9 = false;
        while (i90 < i89) {
            int i92 = i90;
            int i93 = v94Var.i(16);
            int i94 = v94Var.i(16);
            boolean z10 = z9;
            if (v94Var.h()) {
                i4 = v94Var.i(2);
                if (i4 == 3) {
                    v94Var.s();
                }
                i5 = v94Var.i(4);
                i6 = v94Var.i(4);
            } else {
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            if (v94Var.h()) {
                int m7 = v94Var.m();
                int m8 = v94Var.m();
                int m9 = v94Var.m();
                int m10 = v94Var.m();
                i93 -= (m7 + m8) * ((i4 == 1 || i4 == 2) ? 2 : 1);
                i94 -= (m9 + m10) * (i4 == 1 ? 2 : 1);
            }
            gwi gwiVar = new gwi(i4, i5, i6, i93, i94);
            int e2 = pde.e(objArr.length, i91 + 1);
            if (e2 > objArr.length || z10) {
                objArr = Arrays.copyOf(objArr, e2);
                z = false;
            } else {
                z = z10;
            }
            objArr[i91] = gwiVar;
            i91++;
            i90 = i92 + 1;
            z9 = z;
        }
        if (i89 <= 1 || !v94Var.h()) {
            for (int i95 = 1; i95 < i17; i95++) {
                iArr34[i95] = Math.min(i95, m6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c3 = f9a.c(i89);
            for (int i96 = 1; i96 < i17; i96++) {
                iArr34[i96] = v94Var.i(c3);
            }
        }
        qdc qdcVar = new qdc(yde.t(i91, objArr), iArr34);
        v94Var.t(2);
        for (int i97 = 1; i97 < i17; i97++) {
            if (iArr2[iArr23[i97]] == 0) {
                v94Var.s();
            }
        }
        for (int i98 = 1; i98 < m5; i98++) {
            boolean h13 = v94Var.h();
            int i99 = 0;
            while (i99 < iArr31[i98]) {
                if ((i99 <= 0 || !h13) ? i99 == 0 : v94Var.h()) {
                    for (int i100 = 0; i100 < iArr6[i98]; i100++) {
                        if (zArr17[i98][i100]) {
                            v94Var.m();
                        }
                    }
                    v94Var.m();
                    v94Var.m();
                }
                i99++;
            }
        }
        int m11 = v94Var.m() + 2;
        if (v94Var.h()) {
            v94Var.t(m11);
        } else {
            for (int i101 = 1; i101 < i17; i101++) {
                for (int i102 = 0; i102 < i101; i102++) {
                    if (zArr10[i101][i102]) {
                        v94Var.t(m11);
                    }
                }
            }
        }
        int m12 = v94Var.m();
        for (int i103 = 1; i103 <= m12; i103++) {
            v94Var.t(8);
        }
        if (v94Var.h()) {
            int i104 = v94Var.e;
            if (i104 > 0) {
                v94Var.t(8 - i104);
            }
            if (!v94Var.h() ? v94Var.h() : true) {
                v94Var.s();
            }
            boolean h14 = v94Var.h();
            boolean h15 = v94Var.h();
            if (h14 || h15) {
                for (int i105 = 0; i105 < m2; i105++) {
                    for (int i106 = 0; i106 < iArr31[i105]; i106++) {
                        boolean h16 = h14 ? v94Var.h() : false;
                        boolean h17 = h15 ? v94Var.h() : false;
                        if (h16) {
                            v94Var.t(32);
                        }
                        if (h17) {
                            v94Var.t(18);
                        }
                    }
                }
            }
            boolean h18 = v94Var.h();
            int i107 = h18 ? v94Var.i(4) + 1 : i17;
            hld.w(i107, "expectedSize");
            hld.w(i107, "initialCapacity");
            int[] iArr35 = new int[i17];
            Object[] objArr2 = new Object[i107];
            int i108 = 0;
            int i109 = 0;
            boolean z11 = false;
            while (i108 < i107) {
                v94Var.t(3);
                int i110 = v94Var.h() ? 1 : 2;
                int f4 = q85.f(v94Var.i(8));
                boolean z12 = h18;
                int g2 = q85.g(v94Var.i(8));
                v94Var.t(8);
                iwi iwiVar = new iwi(f4, i110, g2);
                int e3 = pde.e(objArr2.length, i109 + 1);
                if (e3 > objArr2.length || z11) {
                    objArr2 = Arrays.copyOf(objArr2, e3);
                    z11 = false;
                }
                objArr2[i109] = iwiVar;
                i108++;
                i109++;
                h18 = z12;
                z11 = z11;
            }
            if (h18 && i107 > 1) {
                for (int i111 = 0; i111 < i17; i111++) {
                    iArr35[i111] = v94Var.i(4);
                }
            }
            qsn t = yde.t(i109, objArr2);
            jtcVar = new jtc();
            jtcVar.a = yde.v(t);
            jtcVar.b = iArr35;
        } else {
            jtcVar = null;
        }
        return new xdh(f2, new j6e(qsnVar3, iArr32), qdcVar, jtcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kwi U(byte[] bArr, int i2, int i3) {
        int m2;
        int m3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean h2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f2;
        int i16;
        int i17;
        int i18;
        boolean h3;
        boolean h4;
        int i19;
        v94 v94Var = new v94(bArr, i2 + 1, i3);
        int i20 = v94Var.i(8);
        int i21 = v94Var.i(8);
        int i22 = v94Var.i(8);
        int m4 = v94Var.m();
        if (i20 == 100 || i20 == 110 || i20 == 122 || i20 == 244 || i20 == 44 || i20 == 83 || i20 == 86 || i20 == 118 || i20 == 128 || i20 == 138) {
            m2 = v94Var.m();
            boolean h5 = m2 == 3 ? v94Var.h() : false;
            int m5 = v94Var.m();
            m3 = v94Var.m();
            v94Var.s();
            if (v94Var.h()) {
                int i23 = m2 != 3 ? 8 : 12;
                i4 = 16;
                int i24 = 0;
                while (i24 < i23) {
                    if (v94Var.h()) {
                        int i25 = i24 < 6 ? 16 : 64;
                        int i26 = 8;
                        int i27 = 8;
                        for (int i28 = 0; i28 < i25; i28++) {
                            if (i26 != 0) {
                                i26 = ((v94Var.n() + i27) + 256) % 256;
                            }
                            if (i26 != 0) {
                                i27 = i26;
                            }
                        }
                    }
                    i24++;
                }
            } else {
                i4 = 16;
            }
            z = h5;
            i5 = m5;
        } else {
            m2 = 1;
            i4 = 16;
            i5 = 0;
            z = false;
            m3 = 0;
        }
        int m6 = v94Var.m() + 4;
        int m7 = v94Var.m();
        if (m7 == 0) {
            i9 = v94Var.m() + 4;
            i6 = i20;
            i7 = m7;
            i8 = m3;
        } else {
            if (m7 == 1) {
                boolean h6 = v94Var.h();
                v94Var.n();
                v94Var.n();
                i6 = i20;
                long m8 = v94Var.m();
                i7 = m7;
                for (int i29 = 0; i29 < m8; i29++) {
                    v94Var.m();
                }
                i8 = m3;
                z2 = h6;
                i9 = 0;
                v94Var.m();
                v94Var.s();
                int m9 = v94Var.m() + 1;
                int m10 = v94Var.m() + 1;
                h2 = v94Var.h();
                int i30 = 2 - (h2 ? 1 : 0);
                int i31 = m10 * i30;
                if (!h2) {
                    v94Var.s();
                }
                v94Var.s();
                int i32 = m9 * 16;
                int i33 = i31 * 16;
                if (v94Var.h()) {
                    int m11 = v94Var.m();
                    int m12 = v94Var.m();
                    int m13 = v94Var.m();
                    int m14 = v94Var.m();
                    if (m2 == 0) {
                        i19 = 1;
                    } else {
                        i19 = m2 == 3 ? 1 : 2;
                        i30 *= m2 == 1 ? 2 : 1;
                    }
                    i32 -= (m11 + m12) * i19;
                    i33 -= (m13 + m14) * i30;
                }
                int i34 = i33;
                int i35 = i32;
                int i36 = i6;
                int i37 = ((i36 != 44 || i36 == 86 || i36 == 100 || i36 == 110 || i36 == 122 || i36 == 244) && (i21 & 16) != 0) ? 0 : i4;
                int i38 = -1;
                float f3 = 1.0f;
                if (v94Var.h()) {
                    i10 = m6;
                    i11 = i8;
                    i12 = i37;
                    i13 = -1;
                    i14 = -1;
                    i15 = i9;
                    f2 = 1.0f;
                    i16 = -1;
                } else {
                    if (v94Var.h()) {
                        int i39 = v94Var.i(8);
                        if (i39 == 255) {
                            int i40 = i4;
                            int i41 = v94Var.i(i40);
                            int i42 = v94Var.i(i40);
                            if (i41 != 0 && i42 != 0) {
                                f3 = i41 / i42;
                            }
                        } else if (i39 < 17) {
                            f3 = i[i39];
                        } else {
                            i10 = m6;
                            dfi.o(i39, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (v94Var.h()) {
                                v94Var.s();
                            }
                            if (v94Var.h()) {
                                i17 = -1;
                                i18 = -1;
                            } else {
                                v94Var.t(3);
                                i17 = v94Var.h() ? 1 : 2;
                                if (v94Var.h()) {
                                    int i43 = v94Var.i(8);
                                    int i44 = v94Var.i(8);
                                    v94Var.t(8);
                                    i38 = q85.f(i43);
                                    i18 = q85.g(i44);
                                } else {
                                    i18 = -1;
                                }
                            }
                            if (v94Var.h()) {
                                v94Var.m();
                                v94Var.m();
                            }
                            if (v94Var.h()) {
                                v94Var.t(65);
                            }
                            h3 = v94Var.h();
                            if (h3) {
                                X(v94Var);
                            }
                            h4 = v94Var.h();
                            if (h4) {
                                X(v94Var);
                            }
                            if (!h3 || h4) {
                                v94Var.s();
                            }
                            v94Var.s();
                            if (v94Var.h()) {
                                v94Var.s();
                                v94Var.m();
                                v94Var.m();
                                v94Var.m();
                                v94Var.m();
                                i37 = v94Var.m();
                                v94Var.m();
                            }
                            int i45 = i38;
                            i15 = i9;
                            f2 = f3;
                            i16 = i45;
                            i13 = i17;
                            i14 = i18;
                            i11 = i8;
                            i12 = i37;
                        }
                    }
                    i10 = m6;
                    if (v94Var.h()) {
                    }
                    if (v94Var.h()) {
                    }
                    if (v94Var.h()) {
                    }
                    if (v94Var.h()) {
                    }
                    h3 = v94Var.h();
                    if (h3) {
                    }
                    h4 = v94Var.h();
                    if (h4) {
                    }
                    if (!h3) {
                    }
                    v94Var.s();
                    v94Var.s();
                    if (v94Var.h()) {
                    }
                    int i452 = i38;
                    i15 = i9;
                    f2 = f3;
                    i16 = i452;
                    i13 = i17;
                    i14 = i18;
                    i11 = i8;
                    i12 = i37;
                }
                return new kwi(i36, i21, i22, m4, i35, i34, f2, i5, i11, z, h2, i10, i7, i15, z2, i16, i13, i14, i12);
            }
            i6 = i20;
            i7 = m7;
            i8 = m3;
            i9 = 0;
        }
        z2 = false;
        v94Var.m();
        v94Var.s();
        int m92 = v94Var.m() + 1;
        int m102 = v94Var.m() + 1;
        h2 = v94Var.h();
        int i302 = 2 - (h2 ? 1 : 0);
        int i312 = m102 * i302;
        if (!h2) {
        }
        v94Var.s();
        int i322 = m92 * 16;
        int i332 = i312 * 16;
        if (v94Var.h()) {
        }
        int i342 = i332;
        int i352 = i322;
        int i362 = i6;
        if (i362 != 44) {
        }
        int i382 = -1;
        float f32 = 1.0f;
        if (v94Var.h()) {
        }
        return new kwi(i362, i21, i22, m4, i352, i342, f2, i5, i11, z, h2, i10, i7, i15, z2, i16, i13, i14, i12);
    }

    public static int W(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static void X(v94 v94Var) {
        int m2 = v94Var.m() + 1;
        v94Var.t(8);
        for (int i2 = 0; i2 < m2; i2++) {
            v94Var.m();
            v94Var.m();
            v94Var.s();
        }
        v94Var.t(20);
    }

    public static int[] Y(Collection collection) {
        if (collection instanceof txe) {
            txe txeVar = (txe) collection;
            return Arrays.copyOfRange(txeVar.a, txeVar.b, txeVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.dp4 Z(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Removed duplicated region for block: B:101:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ab0 ab0Var, final o14 o14Var, final Function1 function1, final j24 j24Var, final yci yciVar, yci yciVar2, Function0 function0, Function0 function02, boolean z, boolean z2, float f2, boolean z3, float f3, boolean z4, float f4, final wn5 wn5Var, hq5 hq5Var, final int i2, final int i3, final int i4) {
        int i5;
        o14 o14Var2;
        Function1 function12;
        j24 j24Var2;
        yci yciVar3;
        Function0 function03;
        Function0 function04;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Function0 function05;
        final Function0 function06;
        boolean z5;
        oq5 oq5Var;
        final float f5;
        final Function0 function07;
        final Function0 function08;
        final boolean z6;
        final yci yciVar4;
        final boolean z7;
        final float f6;
        final boolean z8;
        final float f7;
        final boolean z9;
        xmn r;
        ab0Var.getClass();
        o14Var.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(876356377);
        if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? oq5Var2.f(ab0Var) : oq5Var2.h(ab0Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            o14Var2 = o14Var;
            i5 |= oq5Var2.f(o14Var2) ? 32 : 16;
        } else {
            o14Var2 = o14Var;
        }
        if ((i2 & 384) == 0) {
            function12 = function1;
            i5 |= oq5Var2.h(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i2 & 3072) == 0) {
            j24Var2 = j24Var;
            i5 |= oq5Var2.f(j24Var2) ? 2048 : 1024;
        } else {
            j24Var2 = j24Var;
        }
        if ((i2 & 24576) == 0) {
            i5 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i16 = i4 & 32;
        if (i16 != 0) {
            i5 |= 196608;
            yciVar3 = yciVar2;
        } else {
            yciVar3 = yciVar2;
            if ((i2 & 196608) == 0) {
                i5 |= oq5Var2.f(yciVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
        }
        int i17 = i4 & 64;
        if (i17 != 0) {
            i5 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i5 |= oq5Var2.h(function03) ? 1048576 : 524288;
            }
        }
        int i18 = i4 & 128;
        if (i18 != 0) {
            i5 |= 12582912;
            function04 = function02;
        } else {
            function04 = function02;
            if ((i2 & 12582912) == 0) {
                i5 |= oq5Var2.h(function04) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
        }
        int i19 = i4 & 256;
        if (i19 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= oq5Var2.g(z) ? 67108864 : 33554432;
        }
        int i20 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i20 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i6 = i20;
            i5 |= oq5Var2.g(z2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            i7 = i4 & 1024;
            if (i7 == 0) {
                i9 = i3 | 6;
                i8 = i7;
            } else if ((i3 & 6) == 0) {
                i8 = i7;
                i9 = i3 | (oq5Var2.c(f2) ? 4 : 2);
            } else {
                i8 = i7;
                i9 = i3;
            }
            i10 = i4 & 2048;
            if (i10 == 0) {
                i9 |= 48;
                i11 = i10;
            } else if ((i3 & 48) == 0) {
                i11 = i10;
                i9 |= oq5Var2.g(z3) ? 32 : 16;
            } else {
                i11 = i10;
            }
            int i21 = i9;
            i12 = i4 & 4096;
            if (i12 == 0) {
                i13 = i21 | 384;
            } else {
                int i22 = i21;
                if ((i3 & 384) == 0) {
                    i22 |= oq5Var2.c(f3) ? 256 : 128;
                }
                i13 = i22;
            }
            i14 = i4 & RemoteCameraConfig.Notification.ID;
            if (i14 == 0) {
                i15 = i13 | 3072;
            } else {
                int i23 = i13;
                if ((i3 & 3072) == 0) {
                    i15 = i23 | (oq5Var2.g(z4) ? 2048 : 1024);
                } else {
                    i15 = i23;
                }
            }
            int i24 = i15 | 24576;
            if ((i5 & 306783379) != 306783378 && (i24 & 74899) == 74898 && oq5Var2.z()) {
                oq5Var2.S();
                z8 = z2;
                f7 = f2;
                f6 = f3;
                z7 = z4;
                f5 = f4;
                oq5Var = oq5Var2;
                yciVar4 = yciVar3;
                function07 = function03;
                function08 = function04;
                z6 = z;
                z9 = z3;
            } else {
                yci yciVar5 = vci.a;
                if (i16 != 0) {
                    yciVar3 = yciVar5;
                }
                Object obj = gq5.a;
                if (i17 == 0) {
                    Object K = oq5Var2.K();
                    if (K == obj) {
                        K = new s2(28);
                        oq5Var2.k0(K);
                    }
                    function05 = (Function0) K;
                } else {
                    function05 = function03;
                }
                if (i18 == 0) {
                    Object K2 = oq5Var2.K();
                    if (K2 == obj) {
                        K2 = new s2(28);
                        oq5Var2.k0(K2);
                    }
                    function06 = (Function0) K2;
                } else {
                    function06 = function04;
                }
                boolean z10 = i19 == 0 ? false : z;
                boolean z11 = i6 == 0 ? false : z2;
                float f8 = i8 == 0 ? 1.0f : f2;
                z5 = i11 == 0 ? true : z3;
                float f9 = i12 == 0 ? 0 : f3;
                boolean z12 = i14 == 0 ? z4 : true;
                final float f10 = 0;
                if (z5) {
                    yciVar5 = q7g.N(yciVar5);
                }
                final Function1 function13 = function12;
                final boolean z13 = z11;
                final j24 j24Var3 = j24Var2;
                final float f11 = f8;
                final yci yciVar6 = yciVar3;
                final o14 o14Var3 = o14Var2;
                final Function0 function09 = function05;
                final boolean z14 = z10;
                final float f12 = f9;
                final boolean z15 = z12;
                bg3.a(d.d(yciVar.f(yciVar5), 1.0f), null, false, ild.C(-908925713, new pyc() { // from class: l24
                    /* JADX WARN: Code restructure failed: missing block: B:97:0x03d5, code lost:
                    
                        if (r11 == r16) goto L126;
                     */
                    @Override // defpackage.pyc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Object i50Var;
                        c cVar;
                        kjn kjnVar;
                        Object[] objArr;
                        Object obj5;
                        float f13;
                        float n0;
                        aqi aqiVar;
                        l54 l54Var;
                        yci yciVar7;
                        final l54 l54Var2;
                        boolean z16;
                        Object obj6;
                        boolean z17;
                        Object obj7;
                        boolean z18;
                        c cVar2 = (c) obj2;
                        hq5 hq5Var2 = (hq5) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        cVar2.getClass();
                        long j2 = cVar2.b;
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar2) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        if (ga6.l(j2)) {
                            return Unit.a;
                        }
                        o14 o14Var4 = o14.this;
                        aqi o0 = szf.o0(o14Var4, hq5Var2);
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        Object K3 = oq5Var4.K();
                        kjn kjnVar2 = gq5.a;
                        Object obj8 = K3;
                        if (K3 == kjnVar2) {
                            x80 x80Var = new x80(o0, 7);
                            oq5Var4.k0(x80Var);
                            obj8 = x80Var;
                        }
                        Function1 function14 = (Function1) obj8;
                        ab0 ab0Var2 = ab0Var;
                        boolean f14 = oq5Var4.f(ab0Var2);
                        Object K4 = oq5Var4.K();
                        Object obj9 = K4;
                        if (f14 || K4 == kjnVar2) {
                            ap1 ap1Var = new ap1(15, ab0Var2, function14);
                            oq5Var4.k0(ap1Var);
                            obj9 = ap1Var;
                        }
                        Function0 function010 = (Function0) obj9;
                        Object[] objArr2 = {function010};
                        Object K5 = oq5Var4.K();
                        Object obj10 = K5;
                        if (K5 == kjnVar2) {
                            t83 t83Var = new t83(3);
                            oq5Var4.k0(t83Var);
                            obj10 = t83Var;
                        }
                        Function2 function2 = (Function2) obj10;
                        boolean h2 = oq5Var4.h(ab0Var2);
                        wn5 wn5Var2 = wn5Var;
                        boolean f15 = h2 | oq5Var4.f(wn5Var2) | oq5Var4.f(o14Var4);
                        Object K6 = oq5Var4.K();
                        if (f15 || K6 == kjnVar2) {
                            cVar = cVar2;
                            kjnVar = kjnVar2;
                            objArr = objArr2;
                            i50Var = new i50(ab0Var2, function14, wn5Var2, o14Var4, 4);
                            oq5Var4.k0(i50Var);
                        } else {
                            cVar = cVar2;
                            kjnVar = kjnVar2;
                            i50Var = K6;
                            objArr = objArr2;
                        }
                        apo apoVar = bpo.a;
                        apo apoVar2 = new apo(0, function2, (Function1) i50Var);
                        boolean f16 = oq5Var4.f(function010) | oq5Var4.f(wn5Var2) | oq5Var4.f(o14Var4);
                        Object K7 = oq5Var4.K();
                        Object obj11 = K7;
                        if (f16 || K7 == kjnVar) {
                            vd vdVar = new vd(11, function010, wn5Var2, o14Var4);
                            oq5Var4.k0(vdVar);
                            obj11 = vdVar;
                        }
                        aqi f0 = o2g.f0(objArr, apoVar2, (Function0) obj11, oq5Var4);
                        j24 j24Var4 = j24Var3;
                        boolean z19 = j24Var4 instanceof i24;
                        if (z19) {
                            obj5 = null;
                            f13 = cVar.d() - (((i24) j24Var4).a * 2);
                        } else {
                            obj5 = null;
                            if (!(j24Var4 instanceof h24)) {
                                b6e.s();
                                return null;
                            }
                            f13 = ((h24) j24Var4).a;
                        }
                        jx7 jx7Var = (jx7) oq5Var4.j(es5.h);
                        float f17 = f12;
                        if (z19) {
                            n0 = ga6.i(j2);
                        } else {
                            if (!(j24Var4 instanceof h24)) {
                                b6e.s();
                                return obj5;
                            }
                            n0 = jx7Var.n0((2 * f17) + ((h24) j24Var4).a);
                        }
                        boolean f18 = oq5Var4.f(f0) | oq5Var4.c(n0);
                        Object K8 = oq5Var4.K();
                        Object obj12 = K8;
                        if (f18 || K8 == kjnVar) {
                            o24 o24Var = new o24(n0, f0);
                            oq5Var4.k0(o24Var);
                            obj12 = o24Var;
                        }
                        gld.D((Function0) obj12, oq5Var4);
                        Unit unit = Unit.a;
                        boolean f19 = oq5Var4.f(f0) | oq5Var4.f(o0) | oq5Var4.f(wn5Var2) | oq5Var4.f(function010);
                        Object K9 = oq5Var4.K();
                        if (f19 || K9 == kjnVar) {
                            aqiVar = f0;
                            v3 v3Var = new v3(aqiVar, o0, wn5Var2, function010, (Continuation) null, 16);
                            oq5Var4.k0(v3Var);
                            K9 = v3Var;
                        } else {
                            aqiVar = f0;
                        }
                        gld.w(oq5Var4, unit, (Function2) K9);
                        l54 l54Var3 = (l54) aqiVar.getValue();
                        boolean h3 = oq5Var4.h(l54Var3) | oq5Var4.f(o0);
                        Function1 function15 = function13;
                        boolean f20 = h3 | oq5Var4.f(function15);
                        Object K10 = oq5Var4.K();
                        Continuation continuation = null;
                        if (f20 || K10 == kjnVar) {
                            k3 k3Var = new k3(l54Var3, function15, o0, continuation, 28);
                            l54Var = l54Var3;
                            oq5Var4.k0(k3Var);
                            K10 = k3Var;
                        } else {
                            l54Var = l54Var3;
                        }
                        gld.w(oq5Var4, l54Var, (Function2) K10);
                        oq5Var4.Z(-1598989362);
                        ya0 ya0Var = l54Var.a;
                        oe6 oe6Var = l54Var.b;
                        bxj bxjVar = bxj.a;
                        yci c2 = ya0Var.c(z15);
                        boolean z20 = z14;
                        Function0 function011 = function06;
                        vci vciVar = vci.a;
                        if (z20) {
                            boolean c3 = oq5Var4.c(f13) | oq5Var4.f(function011);
                            Object K11 = oq5Var4.K();
                            Object obj13 = K11;
                            if (c3 || K11 == kjnVar) {
                                p24 p24Var = new p24(f13, function011);
                                oq5Var4.k0(p24Var);
                                obj13 = p24Var;
                            }
                            yciVar7 = a.b(vciVar, (Function1) obj13);
                        } else {
                            yciVar7 = vciVar;
                        }
                        yci f21 = c2.f(yciVar7);
                        oq5Var4.p(false);
                        boolean h4 = oq5Var4.h(l54Var);
                        float f22 = f10;
                        boolean c4 = h4 | oq5Var4.c(f22) | oq5Var4.c(n0);
                        Function0 function012 = function09;
                        boolean f23 = c4 | oq5Var4.f(function012) | oq5Var4.f(function011) | oq5Var4.c(f13) | oq5Var4.c(f17) | oq5Var4.g(z20);
                        boolean z21 = z13;
                        boolean g2 = f23 | oq5Var4.g(z21);
                        float f24 = f11;
                        boolean c5 = g2 | oq5Var4.c(f24);
                        Object K12 = oq5Var4.K();
                        if (c5 || K12 == kjnVar) {
                            l54Var2 = l54Var;
                            b34 b34Var = new b34(l54Var2, f22, n0, function012, function011, f13, f17, z20, z21, f24);
                            oq5Var4.k0(b34Var);
                            K12 = b34Var;
                        } else {
                            l54Var2 = l54Var;
                        }
                        kfh kfhVar = (kfh) K12;
                        int i25 = oq5Var4.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                        yci H = vnj.H(oq5Var4, f21);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(grbVar);
                        } else {
                            oq5Var4.n0();
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(oq5Var4, kfhVar, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(oq5Var4, l2, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                            ouj.x(i25, oq5Var4, i25, kb5Var3);
                        }
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(oq5Var4, H, kb5Var4);
                        yci c6 = androidx.compose.ui.layout.a.c(vciVar, d44.a);
                        boolean h5 = oq5Var4.h(l54Var2);
                        Object K13 = oq5Var4.K();
                        if (h5 || K13 == kjnVar) {
                            z16 = false;
                            final boolean z22 = false ? 1 : 0;
                            Function1 function16 = new Function1() { // from class: q24
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj14) {
                                    jx7 jx7Var2 = (jx7) obj14;
                                    switch (z22) {
                                        case 0:
                                            jx7Var2.getClass();
                                            return new wpe(xv.t(eeh.b(((Number) l54Var2.c.e()).floatValue()), 0));
                                        default:
                                            jx7Var2.getClass();
                                            return new wpe(xv.t(eeh.b(((Number) l54Var2.d.e()).floatValue()), 0));
                                    }
                                }
                            };
                            oq5Var4.k0(function16);
                            obj6 = function16;
                        } else {
                            z16 = false;
                            obj6 = K13;
                        }
                        yci c7 = b.c(androidx.compose.foundation.layout.a.i(c6, (Function1) obj6), "carousel_item_position", "left");
                        iz2 iz2Var = b2c.b;
                        kjn kjnVar3 = kjnVar;
                        kfh d2 = ug3.d(iz2Var, z16);
                        int i26 = oq5Var4.P;
                        final l54 l54Var4 = l54Var2;
                        androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                        yci H2 = vnj.H(oq5Var4, c7);
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(grbVar);
                        } else {
                            oq5Var4.n0();
                        }
                        g0g.U(oq5Var4, d2, kb5Var);
                        g0g.U(oq5Var4, l3, kb5Var2);
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i26))) {
                            ouj.x(i26, oq5Var4, i26, kb5Var3);
                        }
                        g0g.U(oq5Var4, H2, kb5Var4);
                        qne qneVar = oe6Var.a;
                        Function2 function22 = qneVar != null ? (wn5) qneVar.a : null;
                        if (function22 == null) {
                            oq5Var4.Z(-2115339379);
                            z17 = false;
                        } else {
                            z17 = false;
                            oq5Var4.Z(-2007899404);
                            function22.invoke(oq5Var4, 0);
                        }
                        oq5Var4.p(z17);
                        oq5Var4.p(true);
                        yci f25 = b.c(androidx.compose.ui.layout.a.c(vciVar, d44.b), "carousel_item_position", "center").f(yciVar6);
                        kfh d3 = ug3.d(iz2Var, z17);
                        int i27 = oq5Var4.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var4.l();
                        yci H3 = vnj.H(oq5Var4, f25);
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(grbVar);
                        } else {
                            oq5Var4.n0();
                        }
                        g0g.U(oq5Var4, d3, kb5Var);
                        g0g.U(oq5Var4, l4, kb5Var2);
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i27))) {
                            ouj.x(i27, oq5Var4, i27, kb5Var3);
                        }
                        g0g.U(oq5Var4, H3, kb5Var4);
                        ((wn5) oe6Var.b.a).invoke(oq5Var4, 0);
                        final int i28 = 1;
                        oq5Var4.p(true);
                        yci c8 = androidx.compose.ui.layout.a.c(vciVar, d44.c);
                        boolean h6 = oq5Var4.h(l54Var4);
                        Object K14 = oq5Var4.K();
                        if (!h6) {
                            obj7 = K14;
                        }
                        Function1 function17 = new Function1() { // from class: q24
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                jx7 jx7Var2 = (jx7) obj14;
                                switch (i28) {
                                    case 0:
                                        jx7Var2.getClass();
                                        return new wpe(xv.t(eeh.b(((Number) l54Var4.c.e()).floatValue()), 0));
                                    default:
                                        jx7Var2.getClass();
                                        return new wpe(xv.t(eeh.b(((Number) l54Var4.d.e()).floatValue()), 0));
                                }
                            }
                        };
                        oq5Var4.k0(function17);
                        obj7 = function17;
                        yci c9 = b.c(androidx.compose.foundation.layout.a.i(c8, (Function1) obj7), "carousel_item_position", "right");
                        kfh d4 = ug3.d(iz2Var, false);
                        int i29 = oq5Var4.P;
                        androidx.compose.runtime.internal.a l5 = oq5Var4.l();
                        yci H4 = vnj.H(oq5Var4, c9);
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(grbVar);
                        } else {
                            oq5Var4.n0();
                        }
                        g0g.U(oq5Var4, d4, kb5Var);
                        g0g.U(oq5Var4, l5, kb5Var2);
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i29))) {
                            ouj.x(i29, oq5Var4, i29, kb5Var3);
                        }
                        g0g.U(oq5Var4, H4, kb5Var4);
                        qne qneVar2 = oe6Var.c;
                        Function2 function23 = qneVar2 != null ? (wn5) qneVar2.a : null;
                        if (function23 == null) {
                            oq5Var4.Z(-1910843787);
                            z18 = false;
                        } else {
                            z18 = false;
                            oq5Var4.Z(-2001302772);
                            function23.invoke(oq5Var4, 0);
                        }
                        oq5Var4.p(z18);
                        oq5Var4.p(true);
                        oq5Var4.p(true);
                        return Unit.a;
                    }
                }, oq5Var2), oq5Var2, 3072, 6);
                oq5Var = oq5Var2;
                f5 = f10;
                function07 = function09;
                function08 = function06;
                z6 = z14;
                yciVar4 = yciVar6;
                z7 = z15;
                f6 = f12;
                z8 = z13;
                f7 = f11;
                z9 = z5;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: m24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int R = rvf.R(i2 | 1);
                        int R2 = rvf.R(i3);
                        zc4.a(ab0.this, o14Var, function1, j24Var, yciVar, yciVar4, function07, function08, z6, z8, f7, z9, f6, z7, f5, wn5Var, (hq5) obj2, R, R2, i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i6 = i20;
        i7 = i4 & 1024;
        if (i7 == 0) {
        }
        i10 = i4 & 2048;
        if (i10 == 0) {
        }
        int i212 = i9;
        i12 = i4 & 4096;
        if (i12 == 0) {
        }
        i14 = i4 & RemoteCameraConfig.Notification.ID;
        if (i14 == 0) {
        }
        int i242 = i15 | 24576;
        if ((i5 & 306783379) != 306783378) {
        }
        yci yciVar52 = vci.a;
        if (i16 != 0) {
        }
        Object obj2 = gq5.a;
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        final float f102 = 0;
        if (z5) {
        }
        final Function1 function132 = function12;
        final boolean z132 = z11;
        final j24 j24Var32 = j24Var2;
        final float f112 = f8;
        final yci yciVar62 = yciVar3;
        final o14 o14Var32 = o14Var2;
        final Function0 function092 = function05;
        final boolean z142 = z10;
        final float f122 = f9;
        final boolean z152 = z12;
        bg3.a(d.d(yciVar.f(yciVar52), 1.0f), null, false, ild.C(-908925713, new pyc() { // from class: l24
            /* JADX WARN: Code restructure failed: missing block: B:97:0x03d5, code lost:
            
                if (r11 == r16) goto L126;
             */
            @Override // defpackage.pyc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22, Object obj3, Object obj4) {
                Object i50Var;
                c cVar;
                kjn kjnVar;
                Object[] objArr;
                Object obj5;
                float f13;
                float n0;
                aqi aqiVar;
                l54 l54Var;
                yci yciVar7;
                final l54 l54Var2;
                boolean z16;
                Object obj6;
                boolean z17;
                Object obj7;
                boolean z18;
                c cVar2 = (c) obj22;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                cVar2.getClass();
                long j2 = cVar2.b;
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar2) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                if (ga6.l(j2)) {
                    return Unit.a;
                }
                o14 o14Var4 = o14.this;
                aqi o0 = szf.o0(o14Var4, hq5Var2);
                oq5 oq5Var4 = (oq5) hq5Var2;
                Object K3 = oq5Var4.K();
                kjn kjnVar2 = gq5.a;
                Object obj8 = K3;
                if (K3 == kjnVar2) {
                    x80 x80Var = new x80(o0, 7);
                    oq5Var4.k0(x80Var);
                    obj8 = x80Var;
                }
                Function1 function14 = (Function1) obj8;
                ab0 ab0Var2 = ab0Var;
                boolean f14 = oq5Var4.f(ab0Var2);
                Object K4 = oq5Var4.K();
                Object obj9 = K4;
                if (f14 || K4 == kjnVar2) {
                    ap1 ap1Var = new ap1(15, ab0Var2, function14);
                    oq5Var4.k0(ap1Var);
                    obj9 = ap1Var;
                }
                Function0 function010 = (Function0) obj9;
                Object[] objArr2 = {function010};
                Object K5 = oq5Var4.K();
                Object obj10 = K5;
                if (K5 == kjnVar2) {
                    t83 t83Var = new t83(3);
                    oq5Var4.k0(t83Var);
                    obj10 = t83Var;
                }
                Function2 function2 = (Function2) obj10;
                boolean h2 = oq5Var4.h(ab0Var2);
                wn5 wn5Var2 = wn5Var;
                boolean f15 = h2 | oq5Var4.f(wn5Var2) | oq5Var4.f(o14Var4);
                Object K6 = oq5Var4.K();
                if (f15 || K6 == kjnVar2) {
                    cVar = cVar2;
                    kjnVar = kjnVar2;
                    objArr = objArr2;
                    i50Var = new i50(ab0Var2, function14, wn5Var2, o14Var4, 4);
                    oq5Var4.k0(i50Var);
                } else {
                    cVar = cVar2;
                    kjnVar = kjnVar2;
                    i50Var = K6;
                    objArr = objArr2;
                }
                apo apoVar = bpo.a;
                apo apoVar2 = new apo(0, function2, (Function1) i50Var);
                boolean f16 = oq5Var4.f(function010) | oq5Var4.f(wn5Var2) | oq5Var4.f(o14Var4);
                Object K7 = oq5Var4.K();
                Object obj11 = K7;
                if (f16 || K7 == kjnVar) {
                    vd vdVar = new vd(11, function010, wn5Var2, o14Var4);
                    oq5Var4.k0(vdVar);
                    obj11 = vdVar;
                }
                aqi f0 = o2g.f0(objArr, apoVar2, (Function0) obj11, oq5Var4);
                j24 j24Var4 = j24Var32;
                boolean z19 = j24Var4 instanceof i24;
                if (z19) {
                    obj5 = null;
                    f13 = cVar.d() - (((i24) j24Var4).a * 2);
                } else {
                    obj5 = null;
                    if (!(j24Var4 instanceof h24)) {
                        b6e.s();
                        return null;
                    }
                    f13 = ((h24) j24Var4).a;
                }
                jx7 jx7Var = (jx7) oq5Var4.j(es5.h);
                float f17 = f122;
                if (z19) {
                    n0 = ga6.i(j2);
                } else {
                    if (!(j24Var4 instanceof h24)) {
                        b6e.s();
                        return obj5;
                    }
                    n0 = jx7Var.n0((2 * f17) + ((h24) j24Var4).a);
                }
                boolean f18 = oq5Var4.f(f0) | oq5Var4.c(n0);
                Object K8 = oq5Var4.K();
                Object obj12 = K8;
                if (f18 || K8 == kjnVar) {
                    o24 o24Var = new o24(n0, f0);
                    oq5Var4.k0(o24Var);
                    obj12 = o24Var;
                }
                gld.D((Function0) obj12, oq5Var4);
                Unit unit = Unit.a;
                boolean f19 = oq5Var4.f(f0) | oq5Var4.f(o0) | oq5Var4.f(wn5Var2) | oq5Var4.f(function010);
                Object K9 = oq5Var4.K();
                if (f19 || K9 == kjnVar) {
                    aqiVar = f0;
                    v3 v3Var = new v3(aqiVar, o0, wn5Var2, function010, (Continuation) null, 16);
                    oq5Var4.k0(v3Var);
                    K9 = v3Var;
                } else {
                    aqiVar = f0;
                }
                gld.w(oq5Var4, unit, (Function2) K9);
                l54 l54Var3 = (l54) aqiVar.getValue();
                boolean h3 = oq5Var4.h(l54Var3) | oq5Var4.f(o0);
                Function1 function15 = function132;
                boolean f20 = h3 | oq5Var4.f(function15);
                Object K10 = oq5Var4.K();
                Continuation continuation = null;
                if (f20 || K10 == kjnVar) {
                    k3 k3Var = new k3(l54Var3, function15, o0, continuation, 28);
                    l54Var = l54Var3;
                    oq5Var4.k0(k3Var);
                    K10 = k3Var;
                } else {
                    l54Var = l54Var3;
                }
                gld.w(oq5Var4, l54Var, (Function2) K10);
                oq5Var4.Z(-1598989362);
                ya0 ya0Var = l54Var.a;
                oe6 oe6Var = l54Var.b;
                bxj bxjVar = bxj.a;
                yci c2 = ya0Var.c(z152);
                boolean z20 = z142;
                Function0 function011 = function06;
                vci vciVar = vci.a;
                if (z20) {
                    boolean c3 = oq5Var4.c(f13) | oq5Var4.f(function011);
                    Object K11 = oq5Var4.K();
                    Object obj13 = K11;
                    if (c3 || K11 == kjnVar) {
                        p24 p24Var = new p24(f13, function011);
                        oq5Var4.k0(p24Var);
                        obj13 = p24Var;
                    }
                    yciVar7 = a.b(vciVar, (Function1) obj13);
                } else {
                    yciVar7 = vciVar;
                }
                yci f21 = c2.f(yciVar7);
                oq5Var4.p(false);
                boolean h4 = oq5Var4.h(l54Var);
                float f22 = f102;
                boolean c4 = h4 | oq5Var4.c(f22) | oq5Var4.c(n0);
                Function0 function012 = function092;
                boolean f23 = c4 | oq5Var4.f(function012) | oq5Var4.f(function011) | oq5Var4.c(f13) | oq5Var4.c(f17) | oq5Var4.g(z20);
                boolean z21 = z132;
                boolean g2 = f23 | oq5Var4.g(z21);
                float f24 = f112;
                boolean c5 = g2 | oq5Var4.c(f24);
                Object K12 = oq5Var4.K();
                if (c5 || K12 == kjnVar) {
                    l54Var2 = l54Var;
                    b34 b34Var = new b34(l54Var2, f22, n0, function012, function011, f13, f17, z20, z21, f24);
                    oq5Var4.k0(b34Var);
                    K12 = b34Var;
                } else {
                    l54Var2 = l54Var;
                }
                kfh kfhVar = (kfh) K12;
                int i25 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                yci H = vnj.H(oq5Var4, f21);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var4, kfhVar, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var4, l2, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                    ouj.x(i25, oq5Var4, i25, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var4, H, kb5Var4);
                yci c6 = androidx.compose.ui.layout.a.c(vciVar, d44.a);
                boolean h5 = oq5Var4.h(l54Var2);
                Object K13 = oq5Var4.K();
                if (h5 || K13 == kjnVar) {
                    z16 = false;
                    final int z22 = false ? 1 : 0;
                    Function1 function16 = new Function1() { // from class: q24
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj14) {
                            jx7 jx7Var2 = (jx7) obj14;
                            switch (z22) {
                                case 0:
                                    jx7Var2.getClass();
                                    return new wpe(xv.t(eeh.b(((Number) l54Var2.c.e()).floatValue()), 0));
                                default:
                                    jx7Var2.getClass();
                                    return new wpe(xv.t(eeh.b(((Number) l54Var2.d.e()).floatValue()), 0));
                            }
                        }
                    };
                    oq5Var4.k0(function16);
                    obj6 = function16;
                } else {
                    z16 = false;
                    obj6 = K13;
                }
                yci c7 = b.c(androidx.compose.foundation.layout.a.i(c6, (Function1) obj6), "carousel_item_position", "left");
                iz2 iz2Var = b2c.b;
                kjn kjnVar3 = kjnVar;
                kfh d2 = ug3.d(iz2Var, z16);
                int i26 = oq5Var4.P;
                final l54 l54Var4 = l54Var2;
                androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                yci H2 = vnj.H(oq5Var4, c7);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, d2, kb5Var);
                g0g.U(oq5Var4, l3, kb5Var2);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i26))) {
                    ouj.x(i26, oq5Var4, i26, kb5Var3);
                }
                g0g.U(oq5Var4, H2, kb5Var4);
                qne qneVar = oe6Var.a;
                Function2 function22 = qneVar != null ? (wn5) qneVar.a : null;
                if (function22 == null) {
                    oq5Var4.Z(-2115339379);
                    z17 = false;
                } else {
                    z17 = false;
                    oq5Var4.Z(-2007899404);
                    function22.invoke(oq5Var4, 0);
                }
                oq5Var4.p(z17);
                oq5Var4.p(true);
                yci f25 = b.c(androidx.compose.ui.layout.a.c(vciVar, d44.b), "carousel_item_position", "center").f(yciVar62);
                kfh d3 = ug3.d(iz2Var, z17);
                int i27 = oq5Var4.P;
                androidx.compose.runtime.internal.a l4 = oq5Var4.l();
                yci H3 = vnj.H(oq5Var4, f25);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, d3, kb5Var);
                g0g.U(oq5Var4, l4, kb5Var2);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i27))) {
                    ouj.x(i27, oq5Var4, i27, kb5Var3);
                }
                g0g.U(oq5Var4, H3, kb5Var4);
                ((wn5) oe6Var.b.a).invoke(oq5Var4, 0);
                final int i28 = 1;
                oq5Var4.p(true);
                yci c8 = androidx.compose.ui.layout.a.c(vciVar, d44.c);
                boolean h6 = oq5Var4.h(l54Var4);
                Object K14 = oq5Var4.K();
                if (!h6) {
                    obj7 = K14;
                }
                Function1 function17 = new Function1() { // from class: q24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj14) {
                        jx7 jx7Var2 = (jx7) obj14;
                        switch (i28) {
                            case 0:
                                jx7Var2.getClass();
                                return new wpe(xv.t(eeh.b(((Number) l54Var4.c.e()).floatValue()), 0));
                            default:
                                jx7Var2.getClass();
                                return new wpe(xv.t(eeh.b(((Number) l54Var4.d.e()).floatValue()), 0));
                        }
                    }
                };
                oq5Var4.k0(function17);
                obj7 = function17;
                yci c9 = b.c(androidx.compose.foundation.layout.a.i(c8, (Function1) obj7), "carousel_item_position", "right");
                kfh d4 = ug3.d(iz2Var, false);
                int i29 = oq5Var4.P;
                androidx.compose.runtime.internal.a l5 = oq5Var4.l();
                yci H4 = vnj.H(oq5Var4, c9);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, d4, kb5Var);
                g0g.U(oq5Var4, l5, kb5Var2);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i29))) {
                    ouj.x(i29, oq5Var4, i29, kb5Var3);
                }
                g0g.U(oq5Var4, H4, kb5Var4);
                qne qneVar2 = oe6Var.c;
                Function2 function23 = qneVar2 != null ? (wn5) qneVar2.a : null;
                if (function23 == null) {
                    oq5Var4.Z(-1910843787);
                    z18 = false;
                } else {
                    z18 = false;
                    oq5Var4.Z(-2001302772);
                    function23.invoke(oq5Var4, 0);
                }
                oq5Var4.p(z18);
                oq5Var4.p(true);
                oq5Var4.p(true);
                return Unit.a;
            }
        }, oq5Var2), oq5Var2, 3072, 6);
        oq5Var = oq5Var2;
        f5 = f102;
        function07 = function092;
        function08 = function06;
        z6 = z142;
        yciVar4 = yciVar62;
        z7 = z152;
        f6 = f122;
        z8 = z132;
        f7 = f112;
        z9 = z5;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final jya a0(rr5 rr5Var) {
        rr5Var.getClass();
        String str = rr5Var.b;
        String str2 = rr5Var.a;
        if (str != null && !StringsKt.U(str) && !CommonUrlParts.Values.FALSE_INTEGER.equals(str)) {
            str2 = ouj.o(str2, StringUtils.PROCESS_POSTFIX_DELIMITER, str);
        }
        return new jya(str2, 4);
    }

    public static final void b(c26 c26Var, yci yciVar, hq5 hq5Var, int i2) {
        c26Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1447447253);
        if ((((oq5Var.h(c26Var) ? 4 : 2) | i2) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            u7g.s(0, oq5Var);
            pm0.a(null, ild.C(-1161806868, new z16(c26Var, yciVar), oq5Var), oq5Var, 48, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z16(c26Var, yciVar, i2, 2);
        }
    }

    public static final h0r b0(TrackWithSmartPreviewDto trackWithSmartPreviewDto) {
        mqs a2;
        SmartPreviewParamsDto smartPreviewParams;
        Long durationMs;
        qvs M;
        trackWithSmartPreviewDto.getClass();
        TrackDto track = trackWithSmartPreviewDto.getTrack();
        if (track == null || (a2 = wts.a(track)) == null || (smartPreviewParams = trackWithSmartPreviewDto.getSmartPreviewParams()) == null || (durationMs = smartPreviewParams.getDurationMs()) == null) {
            return null;
        }
        long longValue = durationMs.longValue();
        TrackFadeDto fadeDto = trackWithSmartPreviewDto.getSmartPreviewParams().getFadeDto();
        if (fadeDto == null || (M = ldg.M(fadeDto)) == null) {
            return null;
        }
        return new h0r(a2, longValue, M);
    }

    public static final void c(c26 c26Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-733596257);
        int i3 = (oq5Var.h(c26Var) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ivf.g(c26Var.f(((i3 << 3) & 112) | 6, oq5Var), d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(yciVar, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var))), 1.0f), bfg.C(oq5Var), false, 14), b2c.f, 2), true, null, oq5Var, 384, 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z16(c26Var, yciVar, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer c0(String str) {
        byte b2;
        Integer num;
        Long l2;
        byte b3;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = str.charAt(0) == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    b2 = qwg.a[charAt];
                } else {
                    byte[] bArr = qwg.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j2 = -b2;
                    long j3 = 10;
                    long j4 = Long.MIN_VALUE / j3;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            char charAt2 = str.charAt(i3);
                            if (charAt2 < 128) {
                                b3 = qwg.a[charAt2];
                            } else {
                                byte[] bArr2 = qwg.a;
                                b3 = -1;
                            }
                            if (b3 < 0 || b3 >= 10 || j2 < j4) {
                                break;
                            }
                            long j5 = j2 * j3;
                            num = null;
                            long j6 = b3;
                            if (j5 < j6 - Long.MIN_VALUE) {
                                break;
                            }
                            j2 = j5 - j6;
                            i3 = i4;
                        } else {
                            num = null;
                            if (i2 != 0) {
                                l2 = Long.valueOf(j2);
                            } else if (j2 != Long.MIN_VALUE) {
                                l2 = Long.valueOf(-j2);
                            }
                        }
                    }
                }
                num = null;
                l2 = num;
                return (l2 == 0 && l2.longValue() == ((long) l2.intValue())) ? Integer.valueOf(l2.intValue()) : num;
            }
        }
        l2 = 0;
        num = null;
        if (l2 == 0) {
        }
    }

    public static final void d(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1255592966);
        if ((((oq5Var.f(yciVar) ? 32 : 16) | i2) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            sk3.f(6, oq5Var, null, true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 19);
        }
    }

    public static int d0(int i2, byte[] bArr) {
        int i3;
        synchronized (j) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = k;
                    if (iArr.length <= i5) {
                        k = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    k[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = k[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final void f(List list, c26 c26Var, o0k o0kVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1758158705);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(c26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            o16 o16Var = ((l26) gld.O(c26Var.y(), oq5Var).getValue()).b;
            y06 y06Var = ((l26) gld.O(c26Var.y(), oq5Var).getValue()).c;
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            tvd e2 = edo.e(a2, null, null, edo.b, oq5Var, 6);
            WeakHashMap weakHashMap = rqv.w;
            eoe n = p6g.n(z7l.h(oq5Var).f, oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            xqc u = vq2.u(oq5Var);
            uf7 a3 = m8r.a(oq5Var);
            boolean f2 = oq5Var.f(a3);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new om7(a3);
                oq5Var.k0(K2);
            }
            om7 om7Var = (om7) K2;
            vm C = ghh.C(ghh.C(o0kVar, zs4.g(oq5Var)), ogp.A(oq5Var));
            etn.t(a2, om7Var, oq5Var, 0);
            irv.a(zs4.f(oq5Var), 0.0f, 0.0f, ild.C(2069923651, new a26(c26Var, y06Var, a2, list, mm6Var, yciVar, u, n, om7Var, C, o16Var, e2), oq5Var), oq5Var, 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(list, c26Var, false, o0kVar, yciVar, i2, 25);
        }
    }

    public static final void i(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        Function0 function02;
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1550655223);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.d(R.drawable.ic_feedback_button) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            yciVar2 = yciVar;
        } else {
            function02 = function0;
            yciVar2 = yciVar;
            aae.a(function02, yciVar2, false, ild.C(1769638035, new rea(9), oq5Var), oq5Var, (i3 & 14) | 24576 | ((i3 >> 3) & 112), 12);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function02, yciVar2, i2, 8);
        }
    }

    public static final void j(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1974614756);
        int i3 = (oq5Var.d(R.drawable.ic_feedback_button) ? 4 : 2) | i2 | 48;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            w4k E = a0g.E(R.drawable.ic_feedback_button, i3 & 14, oq5Var);
            f3r f3rVar = new f3r(((dq0) oq5Var.j(eq0.a)).a.a);
            tgo F = o5g.F(oq5Var);
            vci vciVar = vci.a;
            irf.r(E, null, xp3.u(d.o(androidx.compose.foundation.layout.a.m(c3x.z(vciVar, 1, f3rVar, F), 2), 20, 24), o5g.E(oq5Var)), null, null, 0.0f, null, oq5Var, 48, 120);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(o0c o0cVar, um0 um0Var, d85 d85Var, yci yciVar, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        oq5 oq5Var;
        yci yciVar2;
        hvq hvqVar2;
        zsq zsqVar2;
        xmn r;
        zsq zsqVar3 = zsqVar;
        um0Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-208432501);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var2.f(o0cVar) : oq5Var2.h(o0cVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.f(d85Var) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        int i6 = i3 & 16;
        if (i6 != 0) {
            i5 = i4 | 27648;
        } else if ((i2 & 24576) == 0) {
            i5 |= oq5Var2.h(hvqVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i7 = i3 & 32;
        int i8 = 196608;
        if (i7 == 0) {
            if ((196608 & i2) == 0) {
                i8 = (262144 & i2) == 0 ? oq5Var2.f(zsqVar3) : oq5Var2.h(zsqVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((i5 & 74899) == 74898 || !oq5Var2.z()) {
                hvq hvqVar3 = i6 == 0 ? null : hvqVar;
                if (i7 != 0) {
                    zsqVar3 = null;
                }
                zsq zsqVar4 = zsqVar3;
                oq5Var = oq5Var2;
                jf0.a(new qzm[0], null, true, ild.C(-631891181, new bj(d85Var, hvqVar3, zsqVar4, um0Var, o0cVar), oq5Var2), oq5Var, 3072, 2);
                yciVar2 = vci.a;
                hvqVar2 = hvqVar3;
                zsqVar2 = zsqVar4;
            } else {
                oq5Var2.S();
                hvqVar2 = hvqVar;
                oq5Var = oq5Var2;
                zsqVar2 = zsqVar3;
                yciVar2 = yciVar;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new fd1(o0cVar, um0Var, d85Var, yciVar2, hvqVar2, zsqVar2, i2, i3, 8);
                return;
            }
            return;
        }
        i5 |= i8;
        if ((i5 & 74899) == 74898) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        zsq zsqVar42 = zsqVar3;
        oq5Var = oq5Var2;
        jf0.a(new qzm[0], null, true, ild.C(-631891181, new bj(d85Var, hvqVar3, zsqVar42, um0Var, o0cVar), oq5Var2), oq5Var, 3072, 2);
        yciVar2 = vci.a;
        hvqVar2 = hvqVar3;
        zsqVar2 = zsqVar42;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l(ygf ygfVar, hq5 hq5Var, int i2) {
        ygfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-159829861);
        int i3 = (oq5Var.h(ygfVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            shf shfVar = (shf) szf.Q(ygfVar.i, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(ygfVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                pef pefVar = new pef(0, ygfVar, ygf.class, "onBackClicked", "onBackClicked()V", 0, 3);
                oq5Var.k0(pefVar);
                K = pefVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(ygfVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                pef pefVar2 = new pef(0, ygfVar, ygf.class, "onSearchClicked", "onSearchClicked()V", 0, 5);
                oq5Var.k0(pefVar2);
                K2 = pefVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(ygfVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                pef pefVar3 = new pef(0, ygfVar, ygf.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 7);
                oq5Var.k0(pefVar3);
                K3 = pefVar3;
            }
            kg5.g(R.string.kids_tracks_and_episodes_title, a2, function0, function02, (Function0) ((h9f) K3), ild.C(1240053512, new vtb(7, shfVar, ygfVar, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(ygfVar, i2, 27);
        }
    }

    public static void l0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if ((r13 & 1) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(long j2, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2121508035);
        if ((i2 & 6) == 0) {
            i4 = (((i3 & 1) == 0 && oq5Var.e(j2)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                if ((i3 & 1) != 0) {
                    j2 = ((dq0) oq5Var.j(eq0.a)).c.c;
                    i4 &= -15;
                }
                oq5Var.q();
                etn.l(v(j2), wn5Var, oq5Var, (i4 & 112) | 8);
            } else {
                oq5Var.S();
            }
        }
        long j3 = j2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new te5(j3, wn5Var, i2, i3);
        }
    }

    public static Object n(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void o(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            l0(parcel, (Parcelable) list.get(i2));
        }
    }

    public static List p(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new txe(0, iArr.length, iArr);
    }

    public static final Object q(sv7 sv7Var, Function0 function0, cg6 cg6Var) {
        Object obj;
        cr crVar;
        xci xciVar = (xci) sv7Var;
        boolean z = xciVar.a.n;
        if (!z) {
            return Unit.a;
        }
        if (!z) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = xciVar.a.e;
        mpf F = bcx.F(sv7Var);
        loop0: while (true) {
            obj = null;
            if (F == null) {
                break;
            }
            if ((((xci) F.F.f).d & 524288) != 0) {
                while (xciVar2 != null) {
                    if ((xciVar2.c & 524288) != 0) {
                        xci xciVar3 = xciVar2;
                        eqi eqiVar = null;
                        while (xciVar3 != null) {
                            if (xciVar3 instanceof ih3) {
                                obj = xciVar3;
                                break loop0;
                            }
                            if ((xciVar3.c & 524288) != 0 && (xciVar3 instanceof cw7)) {
                                int i2 = 0;
                                for (xci xciVar4 = ((cw7) xciVar3).p; xciVar4 != null; xciVar4 = xciVar4.f) {
                                    if ((xciVar4.c & 524288) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            xciVar3 = xciVar4;
                                        } else {
                                            if (eqiVar == null) {
                                                eqiVar = new eqi(new xci[16]);
                                            }
                                            if (xciVar3 != null) {
                                                eqiVar.d(xciVar3);
                                                xciVar3 = null;
                                            }
                                            eqiVar.d(xciVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            xciVar3 = bcx.p(eqiVar);
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
        ih3 ih3Var = (ih3) obj;
        if (ih3Var == null) {
            return Unit.a;
        }
        f8j E = bcx.E(sv7Var);
        Object z2 = ih3Var.z(E, new ha0(20, function0, E), cg6Var);
        return z2 == nm6.a ? z2 : Unit.a;
    }

    public static int s(long j2) {
        int i2 = (int) j2;
        o2g.I("Out of range: %s", j2, ((long) i2) == j2);
        return i2;
    }

    public static void t(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static final aqi u(uoi uoiVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = szf.g0(Boolean.FALSE);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        boolean z = (((i2 & 14) ^ 6) > 4 && oq5Var.f(uoiVar)) || (i2 & 6) == 4;
        Object K2 = oq5Var.K();
        if (z || K2 == kjnVar) {
            K2 = new noa(uoiVar, aqiVar, null, 1);
            oq5Var.k0(K2);
        }
        gld.w(oq5Var, uoiVar, (Function2) K2);
        return aqiVar;
    }

    public static final qzm v(long j2) {
        qs5 qs5Var = eeo.a;
        float d2 = d85.d(j2) * 1.0f;
        return qs5Var.a(new xdo(j2, new udo(d85.d(j2) * 0.66f, d85.d(j2) * 1.0f, d85.d(j2) * 0.32f, d2)));
    }

    public static int w(String str, boolean z, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean y(String str, String str2) {
        return Intrinsics.d(str, str2) || (kotlin.text.c.n(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !cvt.f.e(str));
    }

    public static int z(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        vq1.A(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            t(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            t(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            t(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    t(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public abstract void I(int i2, String str);

    public abstract void J(int i2, String str, Object... objArr);

    public abstract int M(int i2);

    public abstract int V(int i2);

    @Override // defpackage.kbp
    public int e(int i2) {
        int M = M(i2);
        if (M == -1 || M(M) == -1) {
            return -1;
        }
        return M;
    }

    public void e0(kv8 kv8Var) {
        x(kv8Var);
    }

    public void f0(v19 v19Var) {
        x(v19Var);
    }

    @Override // defpackage.kbp
    public int g(int i2) {
        return V(i2);
    }

    public void g0(i39 i39Var) {
        x(i39Var);
    }

    @Override // defpackage.kbp
    public int h(int i2) {
        return M(i2);
    }

    public void h0(oc9 oc9Var) {
        x(oc9Var);
    }

    public void i0(hh9 hh9Var) {
        x(hh9Var);
    }

    public void j0(l0a l0aVar) {
        x(l0aVar);
    }

    @Override // defpackage.kbp
    public int r(int i2) {
        int V = V(i2);
        if (V == -1 || V(V) == -1) {
            return -1;
        }
        return V;
    }

    public abstract void x(f29 f29Var);

    public void k0(View view) {
    }
}
