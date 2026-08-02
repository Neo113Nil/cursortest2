package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.UserManager;
import android.util.Base64;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.radio.data.network.rotor.dto.VideoClipIdDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelFeedbackDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelItemFeedbackDto;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.InterruptedIOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import ru.yandex.music.R;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes3.dex */
public abstract class a4g {
    public static final boolean A(oq oqVar) {
        oqVar.getClass();
        return !oqVar.r && u2x.M(oqVar.j);
    }

    public static nlv B(String str) {
        if (str == null) {
            plv.a.getClass();
            return mlv.b;
        }
        Integer R = pd.R(str);
        if (R == null) {
            plv.a.getClass();
            return mlv.b;
        }
        p85 b0 = pd.b0(c3x.f(R.intValue()));
        float f = b0.b;
        float f2 = b0.a;
        float f3 = b0.c;
        int i = d85.o;
        long z = mvt.z(f2, 0.9f * f, f3 * 0.95f, 0.0f, 24);
        float f4 = f3 + 0.05f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        long z2 = mvt.z(f2, f, f4, 0.0f, 24);
        p85 b02 = pd.b0(d85.f);
        long b = p85.a(b02, 0.0f, b02.c * 0.95f, 11).b();
        p85 b03 = pd.b0(z);
        return new nlv(z, z2, b, p85.a(b03, 0.0f, b03.c * 0.95f, 11).b());
    }

    public static final boolean C(mqs mqsVar) {
        mqsVar.getClass();
        return D(gys.AudioBookHolder, mqsVar);
    }

    public static final boolean D(gys gysVar, mqs mqsVar) {
        String str = mqsVar.q;
        if (str == null) {
            return false;
        }
        return gysVar.a.contains(str);
    }

    public static final boolean E(ocg ocgVar, float f, float f2) {
        if (ocgVar instanceof ayj) {
            ynn ynnVar = ((ayj) ocgVar).j;
            return ynnVar.a <= f && f < ynnVar.c && ynnVar.b <= f2 && f2 < ynnVar.d;
        }
        if (!(ocgVar instanceof byj)) {
            if (ocgVar instanceof zxj) {
                return F(((zxj) ocgVar).j, f, f2);
            }
            b6e.s();
            return false;
        }
        jgo jgoVar = ((byj) ocgVar).j;
        float f3 = jgoVar.a;
        long j = jgoVar.f;
        long j2 = jgoVar.h;
        long j3 = jgoVar.g;
        float f4 = jgoVar.d;
        float f5 = jgoVar.b;
        float f6 = jgoVar.c;
        long j4 = jgoVar.e;
        if (f < f3 || f >= f6 || f2 < f5 || f2 >= f4) {
            return false;
        }
        int i = (int) (j4 >> 32);
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= jgoVar.b()) {
            int i3 = (int) (j2 >> 32);
            int i4 = (int) (j3 >> 32);
            if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= jgoVar.b()) {
                int i5 = (int) (j4 & 4294967295L);
                int i6 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= jgoVar.a()) {
                    int i7 = (int) (j & 4294967295L);
                    int i8 = (int) (j3 & 4294967295L);
                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= jgoVar.a()) {
                        float intBitsToFloat = Float.intBitsToFloat(i) + f3;
                        float intBitsToFloat2 = Float.intBitsToFloat(i5) + f5;
                        float intBitsToFloat3 = f6 - Float.intBitsToFloat(i2);
                        float intBitsToFloat4 = Float.intBitsToFloat(i7) + f5;
                        float intBitsToFloat5 = f6 - Float.intBitsToFloat(i4);
                        float intBitsToFloat6 = f4 - Float.intBitsToFloat(i8);
                        float intBitsToFloat7 = f4 - Float.intBitsToFloat(i6);
                        float intBitsToFloat8 = Float.intBitsToFloat(i3) + f3;
                        if (f < intBitsToFloat && f2 < intBitsToFloat2) {
                            return J(f, f2, intBitsToFloat, intBitsToFloat2, jgoVar.e);
                        }
                        if (f < intBitsToFloat8 && f2 > intBitsToFloat7) {
                            return J(f, f2, intBitsToFloat8, intBitsToFloat7, jgoVar.h);
                        }
                        if (f > intBitsToFloat3 && f2 < intBitsToFloat4) {
                            return J(f, f2, intBitsToFloat3, intBitsToFloat4, jgoVar.f);
                        }
                        if (f <= intBitsToFloat5 || f2 <= intBitsToFloat6) {
                            return true;
                        }
                        return J(f, f2, intBitsToFloat5, intBitsToFloat6, jgoVar.g);
                    }
                }
            }
        }
        nh0 a = ph0.a();
        eak.a(a, jgoVar);
        return F(a, f, f2);
    }

    public static final boolean F(eak eakVar, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        nh0 a = ph0.a();
        bak bakVar = bak.a;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            ph0.c("Invalid rectangle, make sure no value is NaN");
        }
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = a.a;
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.addRect(rectF2, ph0.b(bakVar));
        nh0 a2 = ph0.a();
        a2.g(eakVar, a, 1);
        boolean isEmpty = a2.a.isEmpty();
        a2.h();
        a.h();
        return !isEmpty;
    }

    public static final boolean G(mqs mqsVar) {
        mqsVar.getClass();
        return D(gys.NonMusicHolder, mqsVar);
    }

    public static final boolean H(mqs mqsVar) {
        mqsVar.getClass();
        return D(gys.PodcastHolder, mqsVar);
    }

    public static boolean I(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final boolean J(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final xzi K(ogp ogpVar, String str, Executor executor, Function0 function0) {
        ogpVar.getClass();
        executor.getClass();
        voi voiVar = new voi(xzi.c);
        vs3 vs3Var = new vs3();
        vs3Var.c = new h2o();
        ys3 ys3Var = new ys3(vs3Var);
        vs3Var.b = ys3Var;
        vs3Var.a = ouj.class;
        try {
            executor.execute(new f02(ogpVar, str, function0, voiVar, vs3Var));
            Unit unit = Unit.a;
            if (unit != null) {
                vs3Var.a = unit;
            }
        } catch (Exception e) {
            ys3Var.b.m(e);
        }
        return new xzi(voiVar, ys3Var);
    }

    public static euh L(XmlResourceParser xmlResourceParser) {
        String str;
        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "package");
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "release", false);
        String nextText = xmlResourceParser.nextText();
        nextText.getClass();
        String replace = huh.a.replace(nextText, "");
        replace.getClass();
        byte[] decode = Base64.decode(replace, 0);
        decode.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.getClass();
            messageDigest.update(decode);
            byte[] digest = messageDigest.digest();
            digest.getClass();
            str = xz0.I(digest, StringUtils.PROCESS_POSTFIX_DELIMITER, new dth(26));
        } catch (NoSuchAlgorithmException unused) {
            str = "Fail to find algorithm SHA256";
        }
        fuh fuhVar = new fuh(str, attributeBooleanValue);
        attributeValue.getClass();
        attributeValue2.getClass();
        return new euh(attributeValue, attributeValue2, vop.d(fuhVar));
    }

    public static euh M(XmlResourceParser xmlResourceParser) {
        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "package");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int next = xmlResourceParser.next();
        while (next != 3) {
            boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "release", false);
            String nextText = xmlResourceParser.nextText();
            nextText.getClass();
            String replace = huh.a.replace(nextText, "");
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = replace.toLowerCase(locale);
            lowerCase.getClass();
            linkedHashSet.add(new fuh(lowerCase, attributeBooleanValue));
            next = xmlResourceParser.next();
        }
        attributeValue.getClass();
        attributeValue2.getClass();
        return new euh(attributeValue, attributeValue2, linkedHashSet);
    }

    public static Object N(Function2 function2) {
        g gVar = g.a;
        gVar.getClass();
        try {
            return x97.D(gVar, function2);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public static final Object O(Function2 function2, cg6 cg6Var) {
        tjc tjcVar = new tjc(cg6Var.getContext(), cg6Var, 1);
        Object l0 = swf.l0(tjcVar, true, tjcVar, function2);
        nm6 nm6Var = nm6.a;
        return l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final VideoClipIdDto P(tfn tfnVar) {
        tfnVar.getClass();
        return new VideoClipIdDto(null, tfnVar.a, 1, 0 == true ? 1 : 0);
    }

    public static final WheelFeedbackDto Q(yhv yhvVar) {
        String str;
        yhvVar.getClass();
        String str2 = yhvVar.a;
        Long valueOf = Long.valueOf(yhvVar.e);
        int ordinal = yhvVar.d.ordinal();
        if (ordinal == 0) {
            str = "CLICK";
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            str = "VIEW";
        }
        Integer valueOf2 = Integer.valueOf(yhvVar.c);
        djv djvVar = yhvVar.b;
        return new WheelFeedbackDto(str2, valueOf, str, valueOf2, new WheelItemFeedbackDto(djvVar.b, djvVar.a));
    }

    public static final c0g R(j1g j1gVar) {
        j1gVar.getClass();
        int ordinal = j1gVar.ordinal();
        if (ordinal == 0) {
            return c0g.c;
        }
        if (ordinal == 1) {
            return c0g.b;
        }
        if (ordinal == 2) {
            return c0g.b;
        }
        b6e.s();
        return null;
    }

    public static int S(Parcel parcel, sgr sgrVar) {
        int i = sgrVar.a.a << 16;
        String str = sgrVar.b;
        if (str != null && str.length() > 1000) {
            str = str.substring(0, 1000);
        }
        if (str == null) {
            return i;
        }
        int i2 = i | 32;
        parcel.writeString(str);
        return i2;
    }

    public static final Object T(cg6 cg6Var) {
        Object obj;
        CoroutineContext context = cg6Var.getContext();
        saf.K(context);
        Continuation b = qxe.b(cg6Var);
        v98 v98Var = b instanceof v98 ? (v98) b : null;
        if (v98Var == null) {
            obj = Unit.a;
        } else {
            a aVar = v98Var.d;
            if (w98.c(aVar, context)) {
                v98Var.f = Unit.a;
                v98Var.c = 1;
                aVar.G0(context, v98Var);
            } else {
                nbw nbwVar = new nbw(nbw.d);
                CoroutineContext plus = context.plus(nbwVar);
                Unit unit = Unit.a;
                v98Var.f = unit;
                v98Var.c = 1;
                aVar.G0(plus, v98Var);
                if (nbwVar.c) {
                    rib a = rfs.a();
                    zx0 zx0Var = a.f;
                    if (!(zx0Var != null ? zx0Var.isEmpty() : true)) {
                        if (a.d >= 4294967296L) {
                            v98Var.f = unit;
                            v98Var.c = 1;
                            a.K0(v98Var);
                            obj = nm6.a;
                        } else {
                            a.M0(true);
                            try {
                                v98Var.run();
                                do {
                                } while (a.O0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.a;
                }
            }
            obj = nm6.a;
        }
        return obj == nm6.a ? obj : Unit.a;
    }

    public static final void a(c0p c0pVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(770142443);
        int i2 = (oq5Var.d(c0pVar.ordinal()) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            int i3 = c0pVar == c0p.e ? R.string.empty_concert_search : R.string.empty_own_search_history;
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            o5g.g(c0pVar, null, oq5Var, i2 & 14);
            xcs.b(rvf.M(i3, oq5Var), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 76, 0.0f, 8, 5), "search_history_empty_label"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n2p(c0pVar, yciVar, i, 0);
        }
    }

    public static final void b(c0p c0pVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-634450958);
        int i2 = (oq5Var.d(c0pVar.ordinal()) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            yci Q = bfg.Q(yciVar, bfg.C(oq5Var), false, 14);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, Q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            o5g.g(c0pVar, null, oq5Var, i2 & 14);
            q7g.j(3, 384, 3, oq5Var, null, false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n2p(c0pVar, yciVar, i, 1);
        }
    }

    public static final void c(String str, w4k w4kVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        w4kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-348019899);
        int i2 = (oq5Var2.f(str) ? 4 : 2) | i | (oq5Var2.h(w4kVar) ? 32 : 16) | 384;
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            vci vciVar = vci.a;
            if (str == null || str.length() == 0) {
                oq5Var2.Z(190394794);
                d(w4kVar, null, vciVar, null, null, oq5Var2, ((i2 >> 3) & 14) | 432, 24);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            } else {
                oq5Var2.Z(190584638);
                act S = weo.S(600, 0, null, 6);
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new brg(9);
                    oq5Var2.k0(K);
                }
                oq5Var = oq5Var2;
                ot0.l(str, (Function1) K, vciVar, S, "LumenCoverCrossfade", false, ild.C(-741655195, new s0h(w4kVar, 0), oq5Var2), oq5Var, (i2 & 14) | 1600944, 32);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(i, 29, yciVar2, str, w4kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(w4k w4kVar, String str, yci yciVar, g40 g40Var, jd6 jd6Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        g40 g40Var2;
        int i5;
        jd6 jd6Var2;
        Object K;
        g40 g40Var3;
        jd6 jd6Var3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1923523321);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(w4kVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                g40Var2 = g40Var;
                i3 |= oq5Var.f(g40Var2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    jd6Var2 = jd6Var;
                    i3 |= oq5Var.f(jd6Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
                    if ((i3 & 9363) == 9362 || !oq5Var.z()) {
                        yci yciVar3 = i6 == 0 ? vci.a : yciVar2;
                        g40 g40Var4 = i4 == 0 ? b2c.f : g40Var2;
                        jd6 jd6Var4 = i5 == 0 ? hd6.b : jd6Var2;
                        yci m = d.m(yciVar3, 64);
                        K = oq5Var.K();
                        if (K == gq5.a) {
                            K = new brg(10);
                            oq5Var.k0(K);
                        }
                        irf.r(w4kVar, str, androidx.compose.ui.draw.a.c(m, (Function1) K), g40Var4, jd6Var4, 0.0f, null, oq5Var, i3 & 64638, 96);
                        yciVar2 = yciVar3;
                        g40Var3 = g40Var4;
                        jd6Var3 = jd6Var4;
                    } else {
                        oq5Var.S();
                        g40Var3 = g40Var2;
                        jd6Var3 = jd6Var2;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new cj(w4kVar, str, yciVar2, g40Var3, jd6Var3, i, i2, 9);
                        return;
                    }
                    return;
                }
                jd6Var2 = jd6Var;
                if ((i3 & 9363) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                yci m2 = d.m(yciVar3, 64);
                K = oq5Var.K();
                if (K == gq5.a) {
                }
                irf.r(w4kVar, str, androidx.compose.ui.draw.a.c(m2, (Function1) K), g40Var4, jd6Var4, 0.0f, null, oq5Var, i3 & 64638, 96);
                yciVar2 = yciVar3;
                g40Var3 = g40Var4;
                jd6Var3 = jd6Var4;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            g40Var2 = g40Var;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            jd6Var2 = jd6Var;
            if ((i3 & 9363) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            yci m22 = d.m(yciVar3, 64);
            K = oq5Var.K();
            if (K == gq5.a) {
            }
            irf.r(w4kVar, str, androidx.compose.ui.draw.a.c(m22, (Function1) K), g40Var4, jd6Var4, 0.0f, null, oq5Var, i3 & 64638, 96);
            yciVar2 = yciVar3;
            g40Var3 = g40Var4;
            jd6Var3 = jd6Var4;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        g40Var2 = g40Var;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        jd6Var2 = jd6Var;
        if ((i3 & 9363) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        yci m222 = d.m(yciVar3, 64);
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        irf.r(w4kVar, str, androidx.compose.ui.draw.a.c(m222, (Function1) K), g40Var4, jd6Var4, 0.0f, null, oq5Var, i3 & 64638, 96);
        yciVar2 = yciVar3;
        g40Var3 = g40Var4;
        jd6Var3 = jd6Var4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final /* synthetic */ PlaybackParameters e(boolean z, Function1 function1) {
        o0l o0lVar = new o0l(z);
        function1.invoke(o0lVar);
        return o0lVar.a();
    }

    public static final void f(uxl uxlVar, jab jabVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-755245497);
        int i2 = i | (oq5Var2.f(uxlVar) ? 4 : 2) | 384;
        if (oq5Var2.P(i2 & 1, (i2 & 131) != 130)) {
            vci vciVar = vci.a;
            yci d = d.d(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13), 1.0f);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            nyl nylVar = uxlVar.a;
            xcs.b(rvf.M((!nylVar.a || nylVar.b) ? nylVar.c ? R.string.empty_foreign_playlist : R.string.playlist_not_available : uxlVar.b ? R.string.empty_playlist_msg_offline_mode : R.string.empty_playlist_msg, oq5Var2), new HorizontalAlignElement(b2c.o), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var2, 0, 0, 65016);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(uxlVar, jabVar, yciVar2, i, 23);
        }
    }

    public static final void g(Function1 function1, l6n l6nVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        function1.getClass();
        l6nVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2009451870);
        int i2 = (i & 6) == 0 ? i | (oq5Var.h(function1) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(l6nVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(498415249);
            uft.a.getClass();
            for (uft uftVar : uft.b) {
                if (uftVar == uft.c && l6nVar.a()) {
                    oq5Var.Z(490946884);
                    y1g.k(uftVar, function1, oq5Var, (i3 << 3) & 112);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(491137224);
                    k6n k6nVar = l6nVar instanceof k6n ? (k6n) l6nVar : null;
                    u1g.j(uftVar, uftVar == (k6nVar != null ? k6nVar.a : null), function1, oq5Var, (i3 << 6) & 896);
                    oq5Var.p(false);
                }
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(function1, l6nVar, yciVar2, i, 6);
        }
    }

    public static final void h(c0p c0pVar, s2p s2pVar, tmb tmbVar, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i) {
        c0pVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(973126826);
        int i2 = i | (oq5Var.d(c0pVar.ordinal()) ? 4 : 2) | (oq5Var.f(s2pVar) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | 24576 | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            pm0.a(null, ild.C(-1229186559, new pli(s2pVar, c0pVar, tmbVar, function0, function02), oq5Var), oq5Var, 48, 1);
            yciVar = vci.a;
        } else {
            oq5Var.S();
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr((Object) c0pVar, (Object) s2pVar, (Object) tmbVar, (Object) function0, yciVar2, (Object) function02, i, 17);
        }
    }

    public static final long i(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void j(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4, final x4r x4rVar, final boolean z, yci yciVar, wn5 wn5Var5, wn5 wn5Var6, hq5 hq5Var, int i) {
        wn5 wn5Var7;
        int i2;
        wn5 wn5Var8;
        wn5 wn5Var9;
        wn5 wn5Var10;
        wn5 wn5Var11;
        wn5 wn5Var12;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-128907344);
        if ((i & 6) == 0) {
            wn5Var7 = wn5Var;
            i2 = (oq5Var.h(wn5Var7) ? 4 : 2) | i;
        } else {
            wn5Var7 = wn5Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            wn5Var8 = wn5Var2;
            i2 |= oq5Var.h(wn5Var8) ? 32 : 16;
        } else {
            wn5Var8 = wn5Var2;
        }
        if ((i & 384) == 0) {
            wn5Var9 = wn5Var3;
            i2 |= oq5Var.h(wn5Var9) ? 256 : 128;
        } else {
            wn5Var9 = wn5Var3;
        }
        if ((i & 3072) == 0) {
            wn5Var10 = wn5Var4;
            i2 |= oq5Var.h(wn5Var10) ? 2048 : 1024;
        } else {
            wn5Var10 = wn5Var4;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.d(x4rVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            wn5Var11 = wn5Var5;
            i2 |= oq5Var.h(wn5Var11) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            wn5Var11 = wn5Var5;
        }
        if ((100663296 & i) == 0) {
            wn5Var12 = wn5Var6;
            i2 |= oq5Var.h(wn5Var12) ? 67108864 : 33554432;
        } else {
            wn5Var12 = wn5Var6;
        }
        if (oq5Var.P(i2 & 1, (38347923 & i2) != 38347922)) {
            ges c = nu0.c();
            ges d = nu0.d();
            final ges j = nu0.j();
            boolean z2 = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp < 360;
            if (!z2) {
                c = d;
            }
            final float p = w1g.p(c, 0, oq5Var, 0, 2) * 3;
            final float f = z2 ? 2 : 12;
            float f2 = 2;
            final wn5 wn5Var13 = wn5Var7;
            final ges gesVar = c;
            final wn5 wn5Var14 = wn5Var8;
            final wn5 wn5Var15 = wn5Var9;
            final wn5 wn5Var16 = wn5Var10;
            final wn5 wn5Var17 = wn5Var11;
            final wn5 wn5Var18 = wn5Var12;
            bg3.a(d.d(d.e(yciVar, (40 * f2) + (w1g.p(j, 0, oq5Var, 0, 2) * f2) + 24 + 12 + p + f), 1.0f), null, false, ild.C(-1764119142, new pyc() { // from class: c5r
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r15)) == false) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00ec, code lost:
                
                    if (r15 == defpackage.gq5.a) goto L36;
                 */
                @Override // defpackage.pyc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    iz2 iz2Var;
                    x4r x4rVar2;
                    iz2 iz2Var2 = b2c.e;
                    iz2 iz2Var3 = b2c.g;
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.P(intValue & 1, (intValue & 19) != 18)) {
                        long j2 = cVar.b;
                        b bVar = b.a;
                        vci vciVar = vci.a;
                        yci b = bVar.b(vciVar);
                        iz2 iz2Var4 = b2c.b;
                        kfh d2 = ug3.d(iz2Var4, true);
                        int i3 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, b);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(oq5Var2, d2, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(oq5Var2, l, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var2.O) {
                            iz2Var = iz2Var3;
                        } else {
                            iz2Var = iz2Var3;
                        }
                        ouj.x(i3, oq5Var2, i3, kb5Var3);
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(oq5Var2, H, kb5Var4);
                        eta.l(0, wn5Var18, oq5Var2, true);
                        agr agrVar = es5.h;
                        float c0 = ((jx7) oq5Var2.j(agrVar)).c0(ga6.i(j2) / 2);
                        float c02 = ((jx7) oq5Var2.j(agrVar)).c0(ga6.h(j2));
                        x4r x4rVar3 = x4r.a;
                        x4r x4rVar4 = x4r.this;
                        yci o = d.o(bVar.a(vciVar, x4rVar4 == x4rVar3 ? iz2Var : iz2Var2), c0, c02);
                        boolean z3 = z;
                        boolean g = oq5Var2.g(z3);
                        Object K = oq5Var2.K();
                        if (g) {
                            x4rVar2 = x4rVar3;
                        } else {
                            x4rVar2 = x4rVar3;
                        }
                        K = new xu0(24, z3);
                        oq5Var2.k0(K);
                        yci b2 = androidx.compose.ui.layout.a.b(o, (pyc) K);
                        kfh d3 = ug3.d(iz2Var4, false);
                        int i4 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                        yci H2 = vnj.H(oq5Var2, b2);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d3, kb5Var);
                        g0g.U(oq5Var2, l2, kb5Var2);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                            ouj.x(i4, oq5Var2, i4, kb5Var3);
                        }
                        g0g.U(oq5Var2, H2, kb5Var4);
                        wn5Var17.invoke(bVar, oq5Var2, 6);
                        oq5Var2.p(true);
                        float f3 = 40;
                        float f4 = 16;
                        yci a = bVar.a(d.d(androidx.compose.foundation.layout.a.p(vciVar, f4, f, f4, f3), irv.h(oq5Var2) ? 0.565f : 0.625f), x4rVar4 == x4rVar2 ? iz2Var2 : iz2Var);
                        ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                        int i5 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                        yci H3 = vnj.H(oq5Var2, a);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a2, kb5Var);
                        g0g.U(oq5Var2, l3, kb5Var2);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                            ouj.x(i5, oq5Var2, i5, kb5Var3);
                        }
                        g0g.U(oq5Var2, H3, kb5Var4);
                        xcs.a(gesVar, ild.C(736501715, new ze4(p, wn5Var13, 4), oq5Var2), oq5Var2, 48);
                        u1g.l(oq5Var2, d.e(vciVar, 12));
                        xcs.a(j, ild.C(-1802143620, new ion(wn5Var14, 11), oq5Var2), oq5Var2, 48);
                        u1g.l(oq5Var2, d.e(vciVar, 24));
                        yci d4 = d.d(d.e(vciVar, f3), 1.0f);
                        kfh d5 = ug3.d(iz2Var4, false);
                        int i6 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                        yci H4 = vnj.H(oq5Var2, d4);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d5, kb5Var);
                        g0g.U(oq5Var2, l4, kb5Var2);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                            ouj.x(i6, oq5Var2, i6, kb5Var3);
                        }
                        g0g.U(oq5Var2, H4, kb5Var4);
                        wn5Var15.invoke(bVar, oq5Var2, 6);
                        oq5Var2.p(true);
                        oq5Var2.p(true);
                        yci a3 = bVar.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f4, 2, 3), b2c.j);
                        kfh d6 = ug3.d(iz2Var4, false);
                        int i7 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l5 = oq5Var2.l();
                        yci H5 = vnj.H(oq5Var2, a3);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d6, kb5Var);
                        g0g.U(oq5Var2, l5, kb5Var2);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var2, i7, kb5Var3);
                        }
                        g0g.U(oq5Var2, H5, kb5Var4);
                        wn5Var16.invoke(bVar, oq5Var2, 6);
                        oq5Var2.p(true);
                    } else {
                        oq5Var2.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 3072, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mc(wn5Var, wn5Var2, wn5Var3, wn5Var4, x4rVar, z, yciVar, wn5Var5, wn5Var6, i);
        }
    }

    public static final void k(w4r w4rVar, yci yciVar, hq5 hq5Var, int i) {
        w4rVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1214002632);
        int i2 = (oq5Var.f(w4rVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            bht bhtVar = (bht) szf.Q(w4rVar.c, oq5Var).getValue();
            vci vciVar = vci.a;
            yci a = androidx.compose.ui.platform.a.a(vciVar, "special_block");
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new g5r(0);
                oq5Var.k0(K);
            }
            ot0.l(bhtVar, (Function1) K, a, null, "SpecialBlockCrossfade", false, ild.C(-48930310, new tik(w4rVar), oq5Var), oq5Var, 1597872, 40);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(w4rVar, yciVar, i, 2);
        }
    }

    public static final void l(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1078089843);
        if ((i & 48) == 0) {
            i2 = (oq5Var.f(yciVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            yciVar2 = yciVar;
            j(ild.C(-1613193033, new xu0(20, z), oq5Var), ild.C(2020184790, new xu0(21, z), oq5Var), ild.C(1358595317, new xu0(22, z), oq5Var), bow.d, x4r.a, true, yciVar2, ild.C(-1949352048, new xu0(23, z), oq5Var), bow.e, oq5Var, ((i2 << 15) & 3670016) | 113470902);
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar2, i, 15);
        }
    }

    public static final void m(final a5r a5rVar, final w4r w4rVar, yci yciVar, hq5 hq5Var, int i) {
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-528229995);
        int i2 = (oq5Var.f(a5rVar) ? 4 : 2) | i | (oq5Var.f(w4rVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            ynn i3 = irv.i(oq5Var);
            y4r y4rVar = a5rVar.f;
            d85 d85Var = y4rVar.b;
            d85 d85Var2 = y4rVar.a;
            if (d85Var2 == null || d85Var == null) {
                d85Var = null;
            } else if (pd.M()) {
                d85Var = d85Var2;
            }
            if (d85Var == null) {
                oq5Var.Z(-822875780);
                j = ((dq0) oq5Var.j(eq0.a)).b.a;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-822877578);
                oq5Var.p(false);
                j = d85Var.a;
            }
            x4r x4rVar = a5rVar.j;
            meo meoVar = new meo(0);
            int i4 = i2 & 112;
            int i5 = i2 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new b5r(0, w4rVar, a5rVar);
                oq5Var.k0(K);
            }
            long j2 = j;
            yci e = androidx.compose.foundation.a.e(yciVar, false, null, meoVar, (Function0) K, 3);
            boolean z2 = (i4 == 32) | (i5 == 4);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new k0r(3, w4rVar, a5rVar);
                oq5Var.k0(K2);
            }
            yci b = com.yandex.music.core.ui.compose.a.b(e, i3, 0L, 0.0f, null, (Function2) K2, 14);
            final int i6 = 0;
            final int i7 = 1;
            j(ild.C(2112596139, new d5r(a5rVar, j2), oq5Var), ild.C(2122366700, new d5r(j2, a5rVar), oq5Var), ild.C(2132137261, new pyc() { // from class: e5r
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j3;
                    long j4;
                    int i8 = i6;
                    kjn kjnVar2 = gq5.a;
                    w4r w4rVar2 = w4rVar;
                    a5r a5rVar2 = a5rVar;
                    switch (i8) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((dh3) obj).getClass();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                y4r y4rVar2 = a5rVar2.e;
                                d85 d85Var3 = y4rVar2.b;
                                d85 d85Var4 = y4rVar2.a;
                                d85 d85Var5 = null;
                                if (d85Var4 == null || d85Var3 == null) {
                                    d85Var3 = null;
                                } else if (pd.M()) {
                                    d85Var3 = d85Var4;
                                }
                                if (d85Var3 == null) {
                                    oq5Var2.Z(284510644);
                                    j3 = ((dq0) oq5Var2.j(eq0.a)).d.a;
                                    oq5Var2.p(false);
                                } else {
                                    oq5Var2.Z(284508722);
                                    oq5Var2.p(false);
                                    j3 = d85Var3.a;
                                }
                                y4r y4rVar3 = a5rVar2.g;
                                d85 d85Var6 = y4rVar3.b;
                                d85 d85Var7 = y4rVar3.a;
                                if (d85Var7 != null && d85Var6 != null) {
                                    d85Var5 = pd.M() ? d85Var7 : d85Var6;
                                }
                                if (d85Var5 == null) {
                                    oq5Var2.Z(284513428);
                                    j4 = kg5.r(R.color.text_primary_day, oq5Var2);
                                    oq5Var2.p(false);
                                } else {
                                    oq5Var2.Z(284512064);
                                    oq5Var2.p(false);
                                    j4 = d85Var5.a;
                                }
                                String str = a5rVar2.d;
                                yci d = com.yandex.music.core.ui.compose.b.d(androidx.compose.ui.platform.a.a(vci.a, "button_special_block"), uah.e(new Pair("button_color", jxd.h(c3x.U(j3))), new Pair("button_text_color", jxd.h(c3x.U(j4)))));
                                boolean h = oq5Var2.h(w4rVar2) | oq5Var2.f(a5rVar2);
                                Object K3 = oq5Var2.K();
                                if (h || K3 == kjnVar2) {
                                    K3 = new b5r(1, w4rVar2, a5rVar2);
                                    oq5Var2.k0(K3);
                                }
                                hdg.b(str, (Function0) K3, d, new d85(j3), new d85(j4), oq5Var2, 0, 0);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((dh3) obj).getClass();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                String str2 = a5rVar2.l;
                                if (str2 == null) {
                                    oq5Var3.Z(-753139203);
                                } else {
                                    oq5Var3.Z(-753139202);
                                    boolean h2 = oq5Var3.h(w4rVar2) | oq5Var3.f(str2);
                                    Object K4 = oq5Var3.K();
                                    if (h2 || K4 == kjnVar2) {
                                        K4 = new rln(24, w4rVar2, str2);
                                        oq5Var3.k0(K4);
                                    }
                                    lg3.a((Function0) K4, null, 0L, 0L, oq5Var3, 0, 14);
                                }
                                oq5Var3.p(false);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(2141907822, new pyc() { // from class: e5r
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j3;
                    long j4;
                    int i8 = i7;
                    kjn kjnVar2 = gq5.a;
                    w4r w4rVar2 = w4rVar;
                    a5r a5rVar2 = a5rVar;
                    switch (i8) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((dh3) obj).getClass();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                y4r y4rVar2 = a5rVar2.e;
                                d85 d85Var3 = y4rVar2.b;
                                d85 d85Var4 = y4rVar2.a;
                                d85 d85Var5 = null;
                                if (d85Var4 == null || d85Var3 == null) {
                                    d85Var3 = null;
                                } else if (pd.M()) {
                                    d85Var3 = d85Var4;
                                }
                                if (d85Var3 == null) {
                                    oq5Var2.Z(284510644);
                                    j3 = ((dq0) oq5Var2.j(eq0.a)).d.a;
                                    oq5Var2.p(false);
                                } else {
                                    oq5Var2.Z(284508722);
                                    oq5Var2.p(false);
                                    j3 = d85Var3.a;
                                }
                                y4r y4rVar3 = a5rVar2.g;
                                d85 d85Var6 = y4rVar3.b;
                                d85 d85Var7 = y4rVar3.a;
                                if (d85Var7 != null && d85Var6 != null) {
                                    d85Var5 = pd.M() ? d85Var7 : d85Var6;
                                }
                                if (d85Var5 == null) {
                                    oq5Var2.Z(284513428);
                                    j4 = kg5.r(R.color.text_primary_day, oq5Var2);
                                    oq5Var2.p(false);
                                } else {
                                    oq5Var2.Z(284512064);
                                    oq5Var2.p(false);
                                    j4 = d85Var5.a;
                                }
                                String str = a5rVar2.d;
                                yci d = com.yandex.music.core.ui.compose.b.d(androidx.compose.ui.platform.a.a(vci.a, "button_special_block"), uah.e(new Pair("button_color", jxd.h(c3x.U(j3))), new Pair("button_text_color", jxd.h(c3x.U(j4)))));
                                boolean h = oq5Var2.h(w4rVar2) | oq5Var2.f(a5rVar2);
                                Object K3 = oq5Var2.K();
                                if (h || K3 == kjnVar2) {
                                    K3 = new b5r(1, w4rVar2, a5rVar2);
                                    oq5Var2.k0(K3);
                                }
                                hdg.b(str, (Function0) K3, d, new d85(j3), new d85(j4), oq5Var2, 0, 0);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((dh3) obj).getClass();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                String str2 = a5rVar2.l;
                                if (str2 == null) {
                                    oq5Var3.Z(-753139203);
                                } else {
                                    oq5Var3.Z(-753139202);
                                    boolean h2 = oq5Var3.h(w4rVar2) | oq5Var3.f(str2);
                                    Object K4 = oq5Var3.K();
                                    if (h2 || K4 == kjnVar2) {
                                        K4 = new rln(24, w4rVar2, str2);
                                        oq5Var3.k0(K4);
                                    }
                                    lg3.a((Function0) K4, null, 0L, 0L, oq5Var3, 0, 14);
                                }
                                oq5Var3.p(false);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), x4rVar, false, b, ild.C(-2113977230, new tik(20, a5rVar), oq5Var), ild.C(-220159588, new f5r(0, a5rVar), oq5Var), oq5Var, 113446326);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(a5rVar, w4rVar, yciVar, i, 14);
        }
    }

    public static wqr n() {
        return new wqr(null);
    }

    public static final void o(lnu lnuVar, owu owuVar, yci yciVar, float f, hq5 hq5Var, int i, int i2) {
        int i3;
        float f2;
        int i4;
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-81115229);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(lnuVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(owuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f2 = f;
                if (oq5Var.c(f2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            } else if ((i2 & 8) != 0) {
                f2 = e9q.a;
            }
            oq5Var.q();
            jf0.a(new qzm[0], pd.t(new qzm[0]), false, ild.C(417800235, new ti7(lnuVar, owuVar, yciVar, f2), oq5Var), oq5Var, 0, 4);
        } else {
            oq5Var.S();
        }
        float f3 = f2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z8q(lnuVar, owuVar, yciVar, f3, i, i2, 1);
        }
    }

    public static final void p(Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-643965885);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.h(function02) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lg3.x(function0, function02, oq5Var, i2 & 126);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new w7a(function0, function02, i, 4);
        }
    }

    public static void q(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static void s(Object obj) {
        if (obj != null) {
            return;
        }
        jj4.j("Cannot return null from a non-@Nullable component method");
    }

    public static void t(Object obj) {
        if (obj != null) {
            return;
        }
        jj4.j("Cannot return null from a non-@Nullable @Provides method");
    }

    public static float[] u(int i, float[] fArr) {
        if (i < 0) {
            e7o.e();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fbk[] v(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                                        break;
                                                    case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = u(i5, fArr2);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                kac.k(hrg.q("error in parsing \"", trim, "\""), e);
                                return null;
                            }
                        }
                        arrayList.add(new fbk(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new fbk(str.charAt(i3), new float[0]));
        }
        return (fbk[]) arrayList.toArray(new fbk[i]);
    }

    public static cli w(d20 d20Var, w2r w2rVar, w70 w70Var) {
        d20Var.getClass();
        w70Var.getClass();
        zii ziiVar = (zii) w2rVar.c;
        mqs mqsVar = (mqs) w2rVar.d;
        qii qiiVar = ziiVar instanceof qii ? (qii) ziiVar : null;
        if (qiiVar == null) {
            dfi.r("For album track context must be album, ".concat(mqsVar.d().d()), "MusicHistory");
        }
        Iterable iterable = qiiVar != null ? qiiVar.b : c5b.a;
        int i = mqsVar.d.e;
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(v75.o(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(ghh.M((u51) it.next()));
        }
        return new cli(d20Var.a(mqsVar, i, arrayList, false), w70Var, w2rVar);
    }

    public static long x(Context context, rkd rkdVar, float f) {
        context.getClass();
        rkdVar.getClass();
        rv0 rv0Var = rkdVar instanceof rv0 ? (rv0) rkdVar : null;
        AppWidgetManager.getInstance(context).getAppWidgetOptions(rv0Var != null ? rv0Var.a : 0).getClass();
        float f2 = r6.getInt("appWidgetMinHeight", 0) * 1.0f;
        float f3 = r6.getInt("appWidgetMaxHeight", 0) * 1.0f;
        float f4 = r6.getInt("appWidgetMinWidth", 0) * f;
        float f5 = r6.getInt("appWidgetMaxWidth", 0) * f;
        return (f2 == 0.0f || f3 == 0.0f || f4 == 0.0f || f5 == 0.0f) ? new fma(0L).a : asq.H(context) ? xv.m(f5, f2) : xv.m(f4, f3);
    }

    public static final long y(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final float z(cds cdsVar, int i) {
        if (i < 0) {
            return 0.0f;
        }
        bds bdsVar = cdsVar.a;
        ogi ogiVar = cdsVar.b;
        if (bdsVar.a.b.length() == 0) {
            return 0.0f;
        }
        int min = Math.min(ogiVar.e(i), Math.min(ogiVar.b - 1, ogiVar.f - 1));
        if (i > ogiVar.d(min, false)) {
            return 0.0f;
        }
        ogiVar.p(min);
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, min));
        ih0 ih0Var = t5kVar.a;
        int i2 = min - t5kVar.d;
        ads adsVar = (ads) ih0Var.d;
        return adsVar.e(i2) - adsVar.g(i2);
    }
}
