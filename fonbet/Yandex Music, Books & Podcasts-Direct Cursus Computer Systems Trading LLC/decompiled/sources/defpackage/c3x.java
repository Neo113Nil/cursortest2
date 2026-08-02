package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class c3x {
    public static z6n a;
    public static final wn5 b = new wn5(new bo5(28), 1448094909, false);
    public static final wn5 c = new wn5(new lo5(9), 727265733, false);
    public static final wn5 d = new wn5(new wo5(8), 1622412557, false);
    public static final wn5 e = new wn5(new wo5(9), 732775830, false);
    public static final byte[] f = new byte[0];
    public static final kjn g = new kjn(20);
    public static final uh0 h = new uh0(1008);
    public static final uh0 i = new uh0(1022);

    public c3x(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
    }

    public static final void A(LinkedHashMap linkedHashMap, mhp mhpVar, String str, int i2) {
        String str2 = Intrinsics.d(mhpVar.a(), thp.b) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i2));
            return;
        }
        throw new d5f("The suggested name '" + str + "' for " + str2 + ' ' + mhpVar.f(i2) + " is already one of the names for " + str2 + ' ' + mhpVar.f(((Number) uah.c(str, linkedHashMap)).intValue()) + " in " + mhpVar);
    }

    public static final void B(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void C(Activity activity) {
        activity.getClass();
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            B(currentFocus);
        }
        View currentFocus2 = activity.getCurrentFocus();
        if (currentFocus2 != null) {
            currentFocus2.clearFocus();
        }
    }

    public static final long D(long j, long j2) {
        float f2;
        float f3;
        long a2 = d85.a(j, d85.f(j2));
        float d2 = d85.d(j2);
        float d3 = d85.d(a2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = d85.h(a2);
        float h3 = d85.h(j2);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = d85.g(a2);
        float g3 = d85.g(j2);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = d85.e(a2);
        float e3 = d85.e(j2);
        if (f5 != 0.0f) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return u(f2, f3, f6, f5, d85.f(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] E(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static String F(Context context) {
        context.getClass();
        if (pt0.g() == null) {
            synchronized (pt0.j()) {
                if (pt0.g() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!bp6.a.contains(pt0.class)) {
                        try {
                            pt0.e = string;
                        } catch (Throwable th) {
                            bp6.a(pt0.class, th);
                        }
                    }
                    if (pt0.g() == null) {
                        String str = "XZ" + UUID.randomUUID().toString();
                        if (!bp6.a.contains(pt0.class)) {
                            try {
                                pt0.e = str;
                            } catch (Throwable th2) {
                                bp6.a(pt0.class, th2);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", pt0.g()).apply();
                    }
                }
            }
        }
        String g2 = pt0.g();
        if (g2 != null) {
            return g2;
        }
        xq0.q("Required value was null.");
        return null;
    }

    public static final long G(hq5 hq5Var) {
        return ((dq0) ((oq5) hq5Var).j(eq0.a)).d.e;
    }

    public static final long H(hq5 hq5Var) {
        return ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a;
    }

    public static final int I(mhp mhpVar, x3f x3fVar, String str) {
        Object obj;
        mhpVar.getClass();
        x3fVar.getClass();
        ozw ozwVar = x3fVar.c;
        str.getClass();
        j4f j4fVar = x3fVar.a;
        boolean z = j4fVar.j;
        kjn kjnVar = g;
        if (z && Intrinsics.d(mhpVar.a(), thp.b)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            zya zyaVar = new zya(21, mhpVar, x3fVar);
            ozwVar.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ozwVar.b;
            Map map = (Map) concurrentHashMap.get(mhpVar);
            Object obj2 = map != null ? map.get(kjnVar) : null;
            obj = obj2 != null ? obj2 : null;
            if (obj == null) {
                obj = zyaVar.invoke();
                Object obj3 = concurrentHashMap.get(mhpVar);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(mhpVar, obj3);
                }
                ((Map) obj3).put(kjnVar, obj);
            }
            Integer num = (Integer) ((Map) obj).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        O(x3fVar, mhpVar);
        int d2 = mhpVar.d(str);
        if (d2 != -3 || !j4fVar.i) {
            return d2;
        }
        zya zyaVar2 = new zya(21, mhpVar, x3fVar);
        ozwVar.getClass();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ozwVar.b;
        Map map2 = (Map) concurrentHashMap2.get(mhpVar);
        Object obj4 = map2 != null ? map2.get(kjnVar) : null;
        obj = obj4 != null ? obj4 : null;
        if (obj == null) {
            obj = zyaVar2.invoke();
            Object obj5 = concurrentHashMap2.get(mhpVar);
            if (obj5 == null) {
                obj5 = new ConcurrentHashMap(2);
                concurrentHashMap2.put(mhpVar, obj5);
            }
            ((Map) obj5).put(kjnVar, obj);
        }
        Integer num2 = (Integer) ((Map) obj).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int J(mhp mhpVar, x3f x3fVar, String str, String str2) {
        mhpVar.getClass();
        x3fVar.getClass();
        str.getClass();
        int I = I(mhpVar, x3fVar, str);
        if (I != -3) {
            return I;
        }
        throw new zhp(mhpVar.i() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean K(x3f x3fVar, mhp mhpVar) {
        mhpVar.getClass();
        x3fVar.getClass();
        if (x3fVar.a.b) {
            return true;
        }
        List annotations = mhpVar.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof h5f) {
                return true;
            }
        }
        return false;
    }

    public static final boolean L(hq5 hq5Var) {
        return ff7.H((Context) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.b));
    }

    public static final long M(long j, long j2, float f2) {
        fpj fpjVar = n95.x;
        long a2 = d85.a(j, fpjVar);
        long a3 = d85.a(j2, fpjVar);
        float d2 = d85.d(a2);
        float h2 = d85.h(a2);
        float g2 = d85.g(a2);
        float e2 = d85.e(a2);
        float d3 = d85.d(a3);
        float h3 = d85.h(a3);
        float g3 = d85.g(a3);
        float e3 = d85.e(a3);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return d85.a(u(fxf.I(h2, h3, f2), fxf.I(g2, g3, f2), fxf.I(e2, e3, f2), fxf.I(d2, d3, f2), fpjVar), d85.f(j2));
    }

    public static final float N(long j) {
        l95 f2 = d85.f(j);
        if (!v85.a(f2.b, v85.a)) {
            rme.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) v85.b(f2.b)));
        }
        ndo ndoVar = ((rdo) f2).p;
        double c2 = ndoVar.c(d85.h(j));
        float c3 = (float) ((ndoVar.c(d85.e(j)) * 0.0722d) + (ndoVar.c(d85.g(j)) * 0.7152d) + (c2 * 0.2126d));
        if (c3 < 0.0f) {
            c3 = 0.0f;
        }
        if (c3 > 1.0f) {
            return 1.0f;
        }
        return c3;
    }

    public static final void O(x3f x3fVar, mhp mhpVar) {
        mhpVar.getClass();
        x3fVar.getClass();
        Intrinsics.d(mhpVar.a(), emr.b);
    }

    public static final yci P(yci yciVar, boolean z, float f2, float f3, hq5 hq5Var) {
        yci m;
        vci vciVar = vci.a;
        if (z) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-1103009341);
            zj0 m0 = j66.m0();
            tgo tgoVar = ugo.a;
            m = a.m(z(a.m(z(vciVar, f2, m0, tgoVar), f2), f3, new f3r(((dq0) oq5Var.j(eq0.a)).c.a), tgoVar), f3);
            oq5Var.p(false);
        } else {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-1102442568);
            oq5Var2.p(false);
            m = a.m(vciVar, f2 + f3);
        }
        return yciVar.f(m);
    }

    public static final long Q(ByteArrayInputStream byteArrayInputStream, int i2) {
        if (i2 > 8) {
            xq0.x("Could not read a number of more than 8 bytes.");
            return 0L;
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int read = byteArrayInputStream.read();
            if (read < 0) {
                throw new IOException("Missing length bytes: Expected " + i2 + ", got " + i3 + '.');
            }
            j = (j << 8) | read;
        }
        return j;
    }

    public static final byte[] R(ByteArrayInputStream byteArrayInputStream) {
        int Q = (int) Q(byteArrayInputStream, (int) (Math.ceil(Math.log(65535) / k86.b) / 8));
        byte[] bArr = new byte[Q];
        try {
            int read = byteArrayInputStream.read(bArr);
            if (read == Q) {
                return bArr;
            }
            throw new IOException("Incomplete data. Expected " + Q + " bytes, had " + read + '.');
        } catch (IOException e2) {
            throw new IOException("Error while reading variable-length data", e2);
        }
    }

    public static final void S(EditText editText, Context context) {
        editText.getClass();
        context.getClass();
        new Handler(Looper.getMainLooper()).postDelayed(new dsd(0, new zya(24, context, editText)), 250L);
    }

    public static final long T(float f2, long j) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f2);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final int U(long j) {
        float[] fArr = n95.a;
        long a2 = d85.a(j, n95.e) >>> 32;
        met metVar = net.b;
        return (int) a2;
    }

    public static final u9b V(EntityCoverDto entityCoverDto) {
        entityCoverDto.getClass();
        String uri = entityCoverDto.getUri();
        if (uri == null) {
            return null;
        }
        return new u9b(uri, entityCoverDto.getColor(), entityCoverDto.getVideoUrl());
    }

    public static luq W(yk9 yk9Var, DisplayMetrics displayMetrics, ly9 ly9Var, xzb xzbVar) {
        Number valueOf;
        ow8 ow8Var;
        ow8 ow8Var2;
        szb szbVar = yk9Var.b;
        bf9 bf9Var = yk9Var.h;
        long longValue = ((Number) szbVar.a(xzbVar)).longValue();
        szb szbVar2 = yk9Var.a;
        Integer num = null;
        ky9 a2 = ly9Var.a(szbVar2 != null ? (String) szbVar2.a(xzbVar) : null);
        a2.getClass();
        int ordinal = ((jk9) yk9Var.c.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            valueOf = Integer.valueOf(bg3.w(Long.valueOf(longValue), displayMetrics));
        } else if (ordinal == 1) {
            valueOf = Integer.valueOf(bg3.Z(Long.valueOf(longValue), displayMetrics));
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            valueOf = Long.valueOf(longValue);
        }
        float floatValue = valueOf.floatValue();
        float doubleValue = ((float) ((Number) yk9Var.g.a(xzbVar)).doubleValue()) / longValue;
        szb szbVar3 = yk9Var.e;
        e09 e09Var = szbVar3 != null ? (e09) szbVar3.a(xzbVar) : null;
        szb szbVar4 = yk9Var.f;
        if (szbVar4 != null) {
            long longValue2 = ((Number) szbVar4.a(xzbVar)).longValue();
            long j = longValue2 >> 31;
            num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        Typeface e2 = a2.e(tt0.I(e09Var, num));
        if (e2 == null) {
            e2 = Typeface.DEFAULT;
        }
        Typeface typeface = e2;
        float f2 = 0.0f;
        float f0 = (bf9Var == null || (ow8Var2 = bf9Var.a) == null) ? 0.0f : bg3.f0(ow8Var2, displayMetrics, xzbVar);
        if (bf9Var != null && (ow8Var = bf9Var.b) != null) {
            f2 = bg3.f0(ow8Var, displayMetrics, xzbVar);
        }
        return new luq(floatValue, doubleValue, typeface, f0, f2, ((Number) yk9Var.i.a(xzbVar)).intValue());
    }

    public static final void a(int i2, hq5 hq5Var, yci yciVar, String str, boolean z) {
        ges b2;
        sdr sdrVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-365826726);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                oq5Var.Z(-2011782032);
                b2 = nu0.e();
                oq5Var.p(false);
            } else {
                oq5Var.Z(-2011720621);
                b2 = nu0.b();
                oq5Var.p(false);
            }
            b9r Q = weo.Q(0.0f, 0.0f, null, 7);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vq2.a(0.0f);
                oq5Var.k0(K);
            }
            fk0 fk0Var = (fk0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(b2);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = szf.g0(b2);
                oq5Var.k0(K3);
            }
            aqi aqiVar2 = (aqi) K3;
            boolean c2 = oq5Var.c(((Number) fk0Var.e()).floatValue());
            Object K4 = oq5Var.K();
            if (c2 || K4 == kjnVar) {
                K4 = szf.U(new vd(1, fk0Var, aqiVar, aqiVar2));
                oq5Var.k0(K4);
            }
            sdr sdrVar2 = (sdr) K4;
            boolean f2 = oq5Var.f(sdrVar2) | oq5Var.f(b2) | oq5Var.h(fk0Var) | oq5Var.h(Q);
            Object K5 = oq5Var.K();
            if (f2 || K5 == kjnVar) {
                sdrVar = sdrVar2;
                xg xgVar = new xg(sdrVar, b2, fk0Var, Q, aqiVar, aqiVar2, null, 2);
                oq5Var.k0(xgVar);
                K5 = xgVar;
            } else {
                sdrVar = sdrVar2;
            }
            gld.y(b2, Q, (Function2) K5, oq5Var);
            sdr b3 = pk0.b(z ? -1.0f : 0.0f, null, null, null, oq5Var, 0, 30);
            yci d2 = d.d(yciVar, 1.0f);
            agr agrVar = eq0.a;
            yci b4 = androidx.compose.foundation.a.b(d2, ((dq0) oq5Var.j(agrVar)).c.b, vnj.i);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.e(vciVar, 28));
            xcs.b(str, a.o(androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.k(vciVar, true, null), "artist_info_header_text"), 16, 0.0f, 2).f(new HorizontalAlignElement(new gz2(((Number) b3.getValue()).floatValue()))), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, z ? Integer.MAX_VALUE : 1, 0, null, (ges) sdrVar.getValue(), oq5Var, i3 & 14, 48, 55288);
            oq5Var = oq5Var;
            eta.p(vciVar, 12, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gb1(str, z, yciVar, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ib1 ib1Var, yci yciVar, fvf fvfVar, hq5 hq5Var, int i2, int i3) {
        fvf fvfVar2;
        int i4;
        int i5;
        yci yciVar2;
        fvf fvfVar3;
        xmn r;
        yci yciVar3;
        ib1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1098048897);
        int i6 = i2 | (oq5Var.f(ib1Var) ? 4 : 2) | 48;
        if ((i3 & 4) == 0) {
            fvfVar2 = fvfVar;
            if (oq5Var.f(fvfVar2)) {
                i4 = 256;
                i5 = i6 | i4;
                if (oq5Var.P(i5 & 1, (i5 & 147) == 146)) {
                    oq5Var.S();
                    yciVar2 = yciVar;
                    fvfVar3 = fvfVar2;
                } else {
                    oq5Var.U();
                    if ((i2 & 1) == 0 || oq5Var.y()) {
                        int i7 = i3 & 4;
                        vci vciVar = vci.a;
                        if (i7 != 0) {
                            fvfVar2 = hvf.a(0, 0, oq5Var, 0, 3);
                            i5 &= -897;
                        }
                        yciVar3 = vciVar;
                    } else {
                        oq5Var.S();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        yciVar3 = yciVar;
                    }
                    oq5Var.q();
                    lb1 lb1Var = (lb1) gld.O(ib1Var.getState(), oq5Var).getValue();
                    Object K = oq5Var.K();
                    Object obj = gq5.a;
                    if (K == obj) {
                        K = k5r.h(0, oq5Var);
                    }
                    u6k u6kVar = (u6k) K;
                    yci a2 = androidx.compose.ui.platform.a.a(d.d(yciVar3, 1.0f), "artist_info_lazy_column");
                    boolean f2 = ((((i5 & 896) ^ 384) > 256 && oq5Var.f(fvfVar2)) || (i5 & 384) == 256) | oq5Var.f(lb1Var) | ((i5 & 14) == 4);
                    Object K2 = oq5Var.K();
                    if (f2 || K2 == obj) {
                        K2 = new i50(lb1Var, ib1Var, fvfVar2, u6kVar);
                        oq5Var.k0(K2);
                    }
                    fvf fvfVar4 = fvfVar2;
                    weo.f(a2, fvfVar4, null, null, null, null, false, null, (Function1) K2, oq5Var, (i5 >> 3) & 112, 508);
                    fvfVar3 = fvfVar4;
                    yciVar2 = yciVar3;
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new b3(ib1Var, yciVar2, fvfVar3, i2, i3);
                    return;
                }
                return;
            }
        } else {
            fvfVar2 = fvfVar;
        }
        i4 = 128;
        i5 = i6 | i4;
        if (oq5Var.P(i5 & 1, (i5 & 147) == 146)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final mg2 mg2Var, final boolean z, final yci yciVar, final float f2, final float f3, hq5 hq5Var, final int i2) {
        int i3;
        vdr vdrVar;
        oq5 oq5Var;
        xmn r;
        mg2Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1555985717);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(mg2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.c(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.c(f3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
        } else {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            switch (mg2Var.a) {
                case 0:
                    vdrVar = (fkn) mg2Var.b;
                    break;
                default:
                    vdrVar = (xdr) mg2Var.b;
                    break;
            }
            aqi Q = szf.Q(vdrVar, oq5Var2);
            boolean z2 = z && ((qg2) Q.getValue()).b;
            if (!((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                oq5Var2.Z(-1210869566);
                w1g.j(((qg2) Q.getValue()).a, null, b.c(P(yciVar, z2, f2, f3, oq5Var2), "avatar_icon_with_plus_border", Boolean.valueOf(z2)), null, null, null, hd6.a, 0.0f, null, 0, n7w.b, oq5Var2, 1572912, 952);
                oq5Var = oq5Var2;
                oq5Var.p(false);
                r = oq5Var.r();
                if (r == null) {
                    r.d = new Function2() { // from class: lg2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c3x.c(mg2.this, z, yciVar, f2, f3, (hq5) obj, rvf.R(i2 | 1));
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var2.Z(-1211176993);
            l(P(yciVar, z2, f2, f3, oq5Var2), oq5Var2, 0);
            oq5Var2.p(false);
        }
        oq5Var = oq5Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void d(int i2, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1033117036);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.g(z) ? 32 : 16) | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            float f2 = 48;
            vci vciVar = vci.a;
            aae.a(function0, d.q(vciVar, f2, f2, 0.0f, 0.0f, 12), !z, ild.C(927782920, new sm(13, z), oq5Var), oq5Var, (i3 & 14) | 24576, 8);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tm(function0, z, yciVar2, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long e(float f2, float f3, float f4, float f5, l95 l95Var) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        if (l95Var.c()) {
            float f6 = f5 < 0.0f ? 0.0f : f5;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            float f9 = f4 >= 0.0f ? f4 : 0.0f;
            float f10 = f9 <= 1.0f ? f9 : 1.0f;
            met metVar = net.b;
            long j = (i14 | ((int) ((f10 * 255.0f) + 0.5f))) << 32;
            int i15 = d85.o;
            return j;
        }
        long j2 = l95Var.b;
        int i16 = v85.e;
        if (((int) (j2 >> 32)) != 3) {
            rme.a("Color only works with ColorSpaces with 3 components");
        }
        int i17 = l95Var.c;
        if (i17 == -1) {
            rme.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = l95Var.b(0);
        float a4 = l95Var.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i18 = floatToRawIntBits >>> 31;
        int i19 = (floatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i20 = floatToRawIntBits & 8388607;
        if (i19 == 255) {
            i3 = i20 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i19 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i21 = i20 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i21) + 1) | (i18 << 15);
                    short s = (short) i4;
                    b2 = l95Var.b(1);
                    a2 = l95Var.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i22 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    int i23 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i23 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i24 = i23 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i24) + 1) | (i22 << 15);
                                short s2 = (short) i8;
                                b3 = l95Var.b(2);
                                a3 = l95Var.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i25 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                                int i26 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i26 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i27 = i9 - 112;
                                    if (i27 >= 31) {
                                        i10 = 0;
                                        r7 = 49;
                                    } else if (i27 > 0) {
                                        int i28 = i26 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i27 << 10) | i28) + 1) | (i25 << 15);
                                            long j3 = (i17 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            met metVar2 = net.b;
                                            int i29 = d85.o;
                                            return j3;
                                        }
                                        i10 = i28;
                                        r7 = i27;
                                    } else if (i27 >= -10) {
                                        int i30 = (i26 | 8388608) >> (1 - i27);
                                        if ((i30 & 4096) != 0) {
                                            i30 += RemoteCameraConfig.Notification.ID;
                                        }
                                        i10 = i30 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i25 << 15) | (r7 << 10);
                                if (f5 >= 0.0f) {
                                }
                                long j32 = (i17 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                met metVar22 = net.b;
                                int i292 = d85.o;
                                return j32;
                            }
                            i7 = i24;
                        } else if (i6 >= -10) {
                            int i31 = (i23 | 8388608) >> (1 - i6);
                            if ((i31 & 4096) != 0) {
                                i31 += RemoteCameraConfig.Notification.ID;
                            }
                            i7 = i31 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i22 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    b3 = l95Var.b(2);
                    a3 = l95Var.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i252 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    int i262 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i252 << 15) | (r7 << 10);
                    if (f5 >= 0.0f) {
                    }
                    long j322 = (i17 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    met metVar222 = net.b;
                    int i2922 = d85.o;
                    return j322;
                }
                i3 = i21;
            } else if (i2 >= -10) {
                int i32 = (i20 | 8388608) >> (1 - i2);
                if ((i32 & 4096) != 0) {
                    i32 += RemoteCameraConfig.Notification.ID;
                }
                i3 = i32 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i18 << 15) | (i2 << 10);
        short s3 = (short) i4;
        b2 = l95Var.b(1);
        a2 = l95Var.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i222 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i232 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i222 << 15) | (i6 << 10);
        short s222 = (short) i8;
        b3 = l95Var.b(2);
        a3 = l95Var.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2522 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i2622 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2522 << 15) | (r7 << 10);
        if (f5 >= 0.0f) {
        }
        long j3222 = (i17 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        met metVar2222 = net.b;
        int i29222 = d85.o;
        return j3222;
    }

    public static final long f(int i2) {
        long j = i2;
        met metVar = net.b;
        long j2 = j << 32;
        int i3 = d85.o;
        return j2;
    }

    public static final long g(int i2, int i3, int i4, int i5) {
        return f(((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | ((i5 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (i4 & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static final long h(long j) {
        long j2 = j << 32;
        met metVar = net.b;
        int i2 = d85.o;
        return j2;
    }

    public static final void j(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2007412894);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-1192290582);
            for (int i4 = 0; i4 < 15; i4++) {
                yci n = a.n(d.g(vciVar, 24, 0.0f, 2), 16, 22);
                kfh d2 = ug3.d(b2c.b, false);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, n);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var2);
                }
                g0g.U(oq5Var, H2, wp5.d);
                pm0.d(d.r(vciVar, 160), nu0.j(), oq5Var, 6);
                oq5Var.p(true);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fp5(i2, 1);
        }
    }

    public static final void k(int i2, Function0 function0, li6 li6Var, String str, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        Function0 function02;
        function0.getClass();
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1273391807);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.d(li6Var.ordinal()) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.f(str) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            function02 = function0;
            aae.a(function02, d.m(androidx.compose.foundation.a.b(xp3.u(yciVar, ugo.a), G(oq5Var), vnj.i), li6Var.a), false, ild.C(-31282395, new i4(i2, str), oq5Var), oq5Var, ((i4 >> 3) & 14) | 24576, 12);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(i2, function02, li6Var, str, yciVar, i3);
        }
    }

    public static final void l(yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1092001634);
        int i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        int i4 = 6;
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            irf.r(a0g.E(((ma5) oq5Var.j(pa5.a)).g() ? 2131231868 : 2131231900, 0, oq5Var), null, yciVar2, null, null, 0.0f, null, oq5Var, ((i3 << 6) & 896) | 48, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar2, i2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(int i2, int i3, long j, hq5 hq5Var, yci yciVar) {
        yci yciVar2;
        int i4;
        long j2;
        Object K;
        kjn kjnVar;
        aqi aqiVar;
        boolean z;
        Object K2;
        yci yciVar3;
        long j3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-225030184);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            yciVar2 = yciVar;
        } else if ((i2 & 6) == 0) {
            yciVar2 = yciVar;
            i4 = i2 | (oq5Var.f(yciVar2) ? 4 : 2);
        } else {
            yciVar2 = yciVar;
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            j2 = j;
            i4 |= oq5Var.e(j2) ? 32 : 16;
            if ((i4 & 19) == 18 || !oq5Var.z()) {
                yci yciVar4 = i5 == 0 ? vci.a : yciVar2;
                if (i6 != 0) {
                    j2 = 300;
                }
                long j4 = j2;
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = szf.g0(Boolean.FALSE);
                    oq5Var.k0(K);
                }
                aqiVar = (aqi) K;
                Unit unit = Unit.a;
                z = (i4 & 112) != 32;
                K2 = oq5Var.K();
                if (!z || K2 == kjnVar) {
                    fv7 fv7Var = new fv7(j4, aqiVar, null, 0);
                    oq5Var.k0(fv7Var);
                    K2 = fv7Var;
                }
                gld.w(oq5Var, unit, (Function2) K2);
                if (((Boolean) aqiVar.getValue()).booleanValue()) {
                    oq5Var.Z(569263338);
                } else {
                    oq5Var.Z(570009260);
                    pd.g(i4 & 14, 0, oq5Var, yciVar4);
                }
                oq5Var.p(false);
                yciVar3 = yciVar4;
                j3 = j4;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
                j3 = j2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new te5(i2, i3, j3, yciVar3);
                return;
            }
            return;
        }
        j2 = j;
        if ((i4 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        long j42 = j2;
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        aqiVar = (aqi) K;
        Unit unit2 = Unit.a;
        if ((i4 & 112) != 32) {
        }
        K2 = oq5Var.K();
        if (!z) {
        }
        fv7 fv7Var2 = new fv7(j42, aqiVar, null, 0);
        oq5Var.k0(fv7Var2);
        K2 = fv7Var2;
        gld.w(oq5Var, unit2, (Function2) K2);
        if (((Boolean) aqiVar.getValue()).booleanValue()) {
        }
        oq5Var.p(false);
        yciVar3 = yciVar4;
        j3 = j42;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final long n(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void o(List list, hq5 hq5Var, int i2) {
        List list2;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-845895679);
        int i3 = (oq5Var.f(list) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            list2 = list;
            lqd.b(list2, d.d(vci.a, 1.0f), 4, null, new mqd(16, 12), ild.C(1239726828, new s44(ywf.s(oq5Var), 1), oq5Var), oq5Var, (i3 & 14) | 197040, 8);
        } else {
            list2 = list;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t44(i2, 1, list2);
        }
    }

    public static final void p(hvq hvqVar, float f2, hq5 hq5Var, int i2) {
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1733583713);
        if ((((oq5Var.h(hvqVar) ? 4 : 2) | i2 | (oq5Var.c(f2) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ewq b2 = hvqVar.b();
            boolean booleanValue = ((Boolean) szf.Q(b2.b(), oq5Var).getValue()).booleanValue();
            vci vciVar = vci.a;
            yci e2 = d.e(vciVar, f2);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean h2 = oq5Var.h(b2);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                ceb cebVar = new ceb(0, b2, ewq.class, "toggleSound", "toggleSound()V", 0, 25);
                oq5Var.k0(cebVar);
                K = cebVar;
            }
            bcx.m(0, oq5Var, androidx.compose.foundation.layout.b.a.a(a.q(vciVar, xvq.d, 0.0f, 0.0f, xvq.c, 6), b2c.h), (Function0) ((h9f) K), booleanValue);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ze4(hvqVar, f2, i2, 3);
        }
    }

    public static final void q(int i2, hq5 hq5Var, yci yciVar, Function1 function1) {
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(774925846);
        int i3 = (oq5Var.h(function1) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String M = rvf.M(R.string.gdpr_welcome_title, oq5Var);
            ges d2 = nu0.d();
            agr agrVar = eq0.a;
            xcs.b(M, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, d2, oq5Var, 0, 0, 65530);
            oq5Var = oq5Var;
            s(rvf.M(R.string.gdpr_welcome_text, oq5Var), a.q(vci.a, 0.0f, 12, 0.0f, 0.0f, 13), nu0.j(), ((dq0) oq5Var.j(agrVar)).b.b, h(4278220748L), function1, oq5Var, ((i3 << 15) & 458752) | 48);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t1b(function1, yciVar, i2, 11);
        }
    }

    public static final void r(wa1 wa1Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1542810073);
        int i3 = (oq5Var.f(wa1Var) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            boolean z = wa1Var instanceof ra1;
            vci vciVar = vci.a;
            if (z || (wa1Var instanceof sa1) || (wa1Var instanceof ta1)) {
                oq5Var.Z(-876756880);
                eta.p(vciVar, 16, oq5Var, false);
            } else {
                if (!(wa1Var instanceof ua1) && !(wa1Var instanceof va1)) {
                    throw vz1.i(oq5Var, -876760819, false);
                }
                oq5Var.Z(-876753168);
                eta.p(vciVar, 32, oq5Var, false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(wa1Var, i2, 8);
        }
    }

    public static final void s(final String str, final yci yciVar, final ges gesVar, final long j, final long j2, final Function1 function1, hq5 hq5Var, final int i2) {
        int i3;
        boolean z;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(184792153);
        int i4 = (i2 & 6) == 0 ? (oq5Var2.f(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        ges gesVar2 = gesVar;
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.f(gesVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var2.e(j) ? 2048 : 1024;
        }
        long j3 = j2;
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var2.e(j3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var2.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i4) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            boolean z2 = (i4 & 14) == 4;
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z2 || K == obj) {
                Spanned fromHtml = Html.fromHtml(str, 63);
                String obj2 = fromHtml.toString();
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(obj2);
                i3 = i4;
                int i5 = 0;
                URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
                uRLSpanArr.getClass();
                int length = uRLSpanArr.length;
                while (i5 < length) {
                    URLSpan[] uRLSpanArr2 = uRLSpanArr;
                    URLSpan uRLSpan = uRLSpanArr2[i5];
                    StringBuilder sb2 = sb;
                    int spanStart = fromHtml.getSpanStart(uRLSpan);
                    int spanEnd = fromHtml.getSpanEnd(uRLSpan);
                    String url = uRLSpan.getURL();
                    arrayList.add(new jn0(ges.f(gesVar2, j3, 0L, null, 0L, null, null, 0, 0L, 16777214).a, spanStart, spanEnd, 8));
                    url.getClass();
                    arrayList.add(new jn0(spanStart, spanEnd, new dkr(url), "URL"));
                    i5++;
                    gesVar2 = gesVar;
                    j3 = j2;
                    uRLSpanArr = uRLSpanArr2;
                    sb = sb2;
                    fromHtml = fromHtml;
                }
                StringBuilder sb3 = sb;
                z = false;
                String sb4 = sb3.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList2.add(((jn0) arrayList.get(i6)).a(sb3.length()));
                }
                K = new mn0(sb4, arrayList2);
                oq5Var2.k0(K);
            } else {
                i3 = i4;
                z = false;
            }
            mn0 mn0Var = (mn0) K;
            ges f2 = ges.f(gesVar, j, 0L, null, 0L, null, null, 0, 0L, 16777214);
            boolean f3 = oq5Var2.f(mn0Var) | ((i3 & 458752) == 131072 ? true : z);
            Object K2 = oq5Var2.K();
            if (f3 || K2 == obj) {
                K2 = new ny2(26, mn0Var, function1);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            vq2.e(mn0Var, yciVar, f2, false, 0, 0, null, (Function1) K2, oq5Var, i3 & 112);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: u2d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    c3x.s(str, yciVar, gesVar, j, j2, function1, (hq5) obj3, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void t(fvf fvfVar, List list, hq5 hq5Var, int i2) {
        int i3;
        fvfVar.getClass();
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1195739653);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new ga2(fvfVar, 6);
                oq5Var.k0(K);
            }
            gld.D((Function0) K, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(fvfVar, list, i2, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long u(float f2, float f3, float f4, float f5, l95 l95Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (l95Var.c()) {
            met metVar = net.b;
            long j = ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f))) << 32;
            int i11 = d85.o;
            return j;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i12 = floatToRawIntBits >>> 31;
        int i13 = (floatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i14 = floatToRawIntBits & 8388607;
        int i15 = 49;
        int i16 = RemoteCameraConfig.Mic.BUFFER_SIZE;
        int i17 = 0;
        if (i13 == 255) {
            i3 = i14 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i13 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 > 0) {
                int i18 = i14 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i18) + 1) | (i12 << 15);
                    short s = (short) i4;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i19 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    int i20 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i20 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i6 = 49;
                            i7 = 0;
                        } else if (i6 > 0) {
                            int i21 = i20 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i21) + 1) | (i19 << 15);
                                short s2 = (short) i8;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i22 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                                int i23 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    if (i23 == 0) {
                                        i16 = 0;
                                    }
                                    i17 = i16;
                                    i15 = 31;
                                } else {
                                    int i24 = i9 - 112;
                                    if (i24 < 31) {
                                        if (i24 > 0) {
                                            i17 = i23 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i24 << 10) | i17) + 1) | (i22 << 15);
                                                long max = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (l95Var.c & 63);
                                                met metVar2 = net.b;
                                                int i25 = d85.o;
                                                return max;
                                            }
                                            i15 = i24;
                                        } else if (i24 >= -10) {
                                            int i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += RemoteCameraConfig.Notification.ID;
                                            }
                                            i15 = 0;
                                            i17 = i26 >> 13;
                                        } else {
                                            i15 = 0;
                                        }
                                    }
                                }
                                i10 = (i22 << 15) | (i15 << 10) | i17;
                                long max2 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (l95Var.c & 63);
                                met metVar22 = net.b;
                                int i252 = d85.o;
                                return max2;
                            }
                            i7 = i21;
                        } else if (i6 >= -10) {
                            int i27 = (i20 | 8388608) >> (1 - i6);
                            if ((i27 & 4096) != 0) {
                                i27 += RemoteCameraConfig.Notification.ID;
                            }
                            i7 = i27 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i19 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i222 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    int i232 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i10 = (i222 << 15) | (i15 << 10) | i17;
                    long max22 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (l95Var.c & 63);
                    met metVar222 = net.b;
                    int i2522 = d85.o;
                    return max22;
                }
                i3 = i18;
            } else if (i2 >= -10) {
                int i28 = (i14 | 8388608) >> (1 - i2);
                if ((i28 & 4096) != 0) {
                    i28 += RemoteCameraConfig.Notification.ID;
                }
                i3 = i28 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i12 << 15) | (i2 << 10);
        short s3 = (short) i4;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i192 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i202 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i192 << 15) | (i6 << 10);
        short s222 = (short) i8;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2222 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i2322 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i10 = (i2222 << 15) | (i15 << 10) | i17;
        long max222 = ((((short) i10) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (l95Var.c & 63);
        met metVar2222 = net.b;
        int i25222 = d85.o;
        return max222;
    }

    public static final fcc v(mq mqVar) {
        int i2;
        mqVar.getClass();
        String str = mqVar.a;
        int ordinal = mqVar.ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
        } else {
            i2 = 2;
        }
        return new fcc("sort", str, i2);
    }

    public static final thj w(lt ltVar, int i2, int i3) {
        ltVar.getClass();
        String str = ltVar.a;
        pkb pkbVar = lxe.x(ltVar) ? pkb.Podcast : lxe.w(ltVar) ? pkb.Audiobook : pkb.Album;
        str.getClass();
        return new thj(pkbVar, str, i2 + 1, i3 + 1, "");
    }

    public static final thj x(oq oqVar, int i2) {
        oqVar.getClass();
        return w(lxe.B(oqVar), i2, 0);
    }

    public static final yci y(float f2, long j, yci yciVar, dup dupVar) {
        return z(yciVar, f2, new f3r(j), dupVar);
    }

    public static final yci z(yci yciVar, float f2, ai3 ai3Var, dup dupVar) {
        return yciVar.f(new BorderModifierNodeElement(f2, ai3Var, dupVar));
    }
}
