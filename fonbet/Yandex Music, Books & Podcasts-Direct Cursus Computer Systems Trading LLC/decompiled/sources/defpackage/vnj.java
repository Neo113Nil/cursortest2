package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.sloth.ui.v;
import io.appmetrica.analytics.AppMetrica;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import org.json.JSONObject;
import ru.yandex.music.data.CoverInfo$CoverType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class vnj {
    public static final wn5 a = new wn5(new t83(27), 1329808692, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final uec h;
    public static final jzk i;

    static {
        new wn5(new t83(28), 356749300, false);
        new wn5(new t83(29), 280099886, false);
        new wn5(new bo5(0), 417414050, false);
        b = new wn5(new io5(9), 1703950586, false);
        c = new wn5(new ro5(8), -968562021, false);
        d = new wn5(new ro5(9), -623587527, false);
        e = new wn5(new dp5(19), -671012093, false);
        f = new wn5(new dp5(20), -1550013571, false);
        g = new wn5(new dp5(21), 1858922535, false);
        h = new uec(1);
        i = new jzk(2);
    }

    public static final Integer A(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final JSONObject B(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final Long C(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    public static final PublicKey D(String str) {
        byte[] decode = Base64.decode(c.r(c.r(c.r(str, StringUtil.LF, "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0);
        decode.getClass();
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        generatePublic.getClass();
        return generatePublic;
    }

    public static final String E(String str) {
        str.getClass();
        URL url = new URL("https", "www." + j3c.p, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        xqn xqnVar = new xqn();
        xqnVar.a = null;
        j3c.d().execute(new lr1(url, xqnVar, str, reentrantLock, newCondition));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) xqnVar.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String F(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        string.getClass();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public static final yci G(hq5 hq5Var, yci yciVar) {
        if (yciVar.b(gx3.L)) {
            return yciVar;
        }
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1219399079);
        yci yciVar2 = (yci) yciVar.a(vci.a, new y5(6, oq5Var));
        oq5Var.p(false);
        return yciVar2;
    }

    public static final yci H(hq5 hq5Var, yci yciVar) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(439770924);
        yci G = G(oq5Var, yciVar);
        oq5Var.p(false);
        return G;
    }

    public static gk0 I(m7f m7fVar, ayg aygVar) {
        return new gk0(dcf.a(m7fVar, aygVar, 1.0f, gos.b, false), 0);
    }

    public static hk0 J(b7f b7fVar, ayg aygVar, boolean z) {
        return new hk0(dcf.a(b7fVar, aygVar, z ? rvt.c() : 1.0f, aaw.c, false), 0);
    }

    public static gk0 K(m7f m7fVar, ayg aygVar, int i2) {
        jsg jsgVar = new jsg(4);
        jsgVar.b = i2;
        ArrayList a2 = dcf.a(m7fVar, aygVar, 1.0f, jsgVar, false);
        for (int i3 = 0; i3 < a2.size(); i3++) {
            acf acfVar = (acf) a2.get(i3);
            aod aodVar = (aod) acfVar.b;
            aod aodVar2 = (aod) acfVar.c;
            if (aodVar != null && aodVar2 != null) {
                float[] fArr = aodVar.a;
                int length = fArr.length;
                float[] fArr2 = aodVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    acfVar = new acf(aodVar.b(copyOfRange), aodVar2.b(copyOfRange));
                }
            }
            a2.set(i3, acfVar);
        }
        return new gk0(a2, 1);
    }

    public static gk0 L(b7f b7fVar, ayg aygVar) {
        return new gk0(dcf.a(b7fVar, aygVar, 1.0f, wvo.d, false), 2);
    }

    public static gk0 M(m7f m7fVar, ayg aygVar) {
        return new gk0(dcf.a(m7fVar, aygVar, rvt.c(), b2c.u, true), 3);
    }

    public static final byte[] N(InputStream inputStream) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(RemoteCameraConfig.Notification.ID, inputStream.available()));
        u(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final mud O(long j, dud dudVar, hq5 hq5Var) {
        dudVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        cce cceVar = (cce) oq5Var.j(tkg.a);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new d85(j);
            oq5Var.k0(K);
        }
        long j2 = ((d85) K).a;
        Object K2 = oq5Var.K();
        if (K2 == kjnVar) {
            K2 = new fs5(gld.R(dm6.b(), oq5Var));
            oq5Var.k0(K2);
        }
        mm6 mm6Var = ((fs5) K2).a;
        boolean f2 = oq5Var.f(dudVar) | oq5Var.f(context) | oq5Var.f(mm6Var);
        Object K3 = oq5Var.K();
        if (f2 || K3 == kjnVar) {
            mud mudVar = new mud(j2, mm6Var, dudVar, context, cceVar);
            oq5Var.k0(mudVar);
            K3 = mudVar;
        }
        mud mudVar2 = (mud) K3;
        f(mudVar2, oq5Var, 0);
        return mudVar2;
    }

    public static final void P(vb vbVar, qfp qfpVar) {
        Object g2 = qfpVar.i().a.g(ufp.f);
        if (g2 == null) {
            g2 = null;
        }
        ky4 ky4Var = (ky4) g2;
        if (ky4Var != null) {
            vbVar.p(tb.b(ky4Var.a, ky4Var.b, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g3 = qfpVar.i().a.g(ufp.e);
        if ((g3 != null ? g3 : null) != null) {
            List h2 = qfp.h(4, qfpVar);
            int size = h2.size();
            for (int i2 = 0; i2 < size; i2++) {
                qfp qfpVar2 = (qfp) h2.get(i2);
                if (qfpVar2.i().a.c(ufp.G)) {
                    arrayList.add(qfpVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean m = m(arrayList);
        vbVar.p(tb.b(m ? 1 : arrayList.size(), m ? arrayList.size() : 1, 0));
    }

    public static int R(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final String S(tn6 tn6Var) {
        if (tn6Var == null || tn6Var.a == CoverInfo$CoverType.UNDEFINED) {
            return "null";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(tn6Var.a + "<custom>" + tn6Var.c);
        Iterator it = tn6Var.b.iterator();
        while (it.hasNext()) {
            arrayList.add(men.I((CoverPath) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        return CollectionsKt.X(arrayList2, "|", null, null, null, 62);
    }

    public static final String T(o5n o5nVar) {
        o5nVar.getClass();
        int ordinal = o5nVar.ordinal();
        if (ordinal == 0) {
            return "auto";
        }
        if (ordinal == 1) {
            return "lq";
        }
        if (ordinal == 2) {
            return "nq";
        }
        if (ordinal == 3) {
            return "hq";
        }
        if (ordinal == 4) {
            return "lossless";
        }
        b6e.s();
        return null;
    }

    public static final boolean U(PublicKey publicKey, String str, String str2) {
        publicKey.getClass();
        str2.getClass();
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            decode.getClass();
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void a(k61 k61Var, nii niiVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        k61Var.getClass();
        niiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2034998914);
        if ((((oq5Var.h(k61Var) ? 4 : 2) | i2 | (oq5Var.f(niiVar) ? 32 : 16) | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            aqi O = gld.O(k61Var.c, oq5Var);
            vci vciVar = vci.a;
            yci a2 = a.a(vciVar, "block_donations");
            t61 t61Var = (t61) O.getValue();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new zs0(13);
                oq5Var.k0(K);
            }
            ot0.l(t61Var, (Function1) K, a2, null, null, false, ild.C(-721280400, new ar(5, niiVar, k61Var), oq5Var), oq5Var, 1572912, 56);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(k61Var, niiVar, yciVar2, i2, 16);
        }
    }

    public static final void b(s61 s61Var, k61 k61Var, nii niiVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(17828588);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(s61Var) : oq5Var.h(s61Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(k61Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(niiVar) ? 256 : 128;
        }
        if (((i3 | 3072) & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            bg3.a(d.d(vciVar, 1.0f), null, false, ild.C(-554166974, new xk(niiVar, s61Var, k61Var), oq5Var), oq5Var, 3078, 6);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(s61Var, k61Var, false, niiVar, yciVar2, i2, 6);
        }
    }

    public static final void c(r61 r61Var, nii niiVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1252744219);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(r61Var) : oq5Var.h(r61Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(niiVar) ? 32 : 16;
        }
        if (((i3 | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, ild.C(1758776754, new a3(niiVar, r61Var), oq5Var), oq5Var, 48, 1);
            yciVar = vci.a;
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(r61Var, niiVar, yciVar2, i2, 8);
        }
    }

    public static final g73 d(drf drfVar, Function1 function1, wn5 wn5Var) {
        drfVar.getClass();
        return new g73(drfVar.a().a, drfVar.a().b, new wn5(new sh1(8, function1, wn5Var, drfVar), 4007598, true), (cma) null, 24);
    }

    public static final vf0 e(String str) {
        return new vf0(uop.b(str));
    }

    public static final void f(fud fudVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(523806761);
        if ((((oq5Var.f(fudVar) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (fudVar.c().equals(cud.a)) {
                oq5Var.Z(1108102201);
            } else {
                oq5Var.Z(1111197954);
                nyf lifecycle = ((dzf) oq5Var.j(ykg.a)).getLifecycle();
                long b2 = fudVar.b();
                d85 d85Var = new d85(b2);
                boolean e2 = oq5Var.e(b2) | oq5Var.h(lifecycle);
                Object K = oq5Var.K();
                if (e2 || K == gq5.a) {
                    K = new gud(lifecycle, b2, 0);
                    oq5Var.k0(K);
                }
                gld.j(lifecycle, d85Var, (Function1) K, oq5Var);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(fudVar, i2, 13);
        }
    }

    public static final int g(twg twgVar, v2e v2eVar) {
        twg G0 = twgVar.G0();
        if (G0 == null) {
            sme.b("Child of " + twgVar + " cannot be null when calculating alignment line");
        }
        if (twgVar.K0().b().containsKey(v2eVar)) {
            Integer num = (Integer) twgVar.K0().b().get(v2eVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int Y = G0.Y(v2eVar);
            if (Y != Integer.MIN_VALUE) {
                G0.g = true;
                twgVar.h = true;
                twgVar.O0();
                G0.g = false;
                twgVar.h = false;
                return Y + ((int) (v2eVar instanceof v2e ? G0.M0() & 4294967295L : G0.M0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0290, code lost:
    
        if (r8.d == r6) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0442 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0699 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06f0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(ba6 ba6Var, j7g j7gVar, ArrayList arrayList, int i2) {
        int i3;
        sa4[] sa4VarArr;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        aa6 aa6Var;
        float f2;
        int i6;
        ArrayList arrayList2;
        aa6 aa6Var2;
        aa6 aa6Var3;
        j7g j7gVar2;
        o86 o86Var;
        o86 o86Var2;
        o86 o86Var3;
        aa6 aa6Var4;
        i3r i3rVar;
        o86 o86Var4;
        i3r i3rVar2;
        aa6 aa6Var5;
        int i7;
        o86 o86Var5;
        i3r i3rVar3;
        aa6 aa6Var6;
        o86[] o86VarArr;
        aa6 aa6Var7;
        int i8;
        o86 o86Var6;
        o86[] o86VarArr2;
        int i9;
        o86 o86Var7;
        i3r i3rVar4;
        i3r i3rVar5;
        int size;
        int i10;
        ArrayList arrayList3;
        int i11;
        int i12;
        aa6 aa6Var8;
        float f3;
        float f4;
        float f5;
        int i13;
        aa6 aa6Var9;
        int i14;
        int i15;
        int i16;
        aa6 aa6Var10;
        o86 o86Var8;
        aa6 aa6Var11;
        float f6;
        ba6 ba6Var2 = ba6Var;
        j7g j7gVar3 = j7gVar;
        ArrayList arrayList4 = arrayList;
        if (i2 == 0) {
            i3 = ba6Var2.D0;
            sa4VarArr = ba6Var2.G0;
            i4 = 0;
        } else {
            i3 = ba6Var2.E0;
            sa4VarArr = ba6Var2.F0;
            i4 = 2;
        }
        int i17 = i3;
        sa4[] sa4VarArr2 = sa4VarArr;
        int i18 = 0;
        while (i18 < i17) {
            sa4 sa4Var = sa4VarArr2[i18];
            boolean z5 = sa4Var.q;
            aa6 aa6Var12 = sa4Var.a;
            o86[] o86VarArr3 = aa6Var12.R;
            z96 z96Var = z96.c;
            int i19 = 8;
            float f7 = 0.0f;
            if (z5) {
                i5 = i18;
            } else {
                int i20 = sa4Var.l;
                int i21 = i20 * 2;
                aa6 aa6Var13 = aa6Var12;
                aa6 aa6Var14 = aa6Var13;
                boolean z6 = false;
                while (!z6) {
                    sa4Var.i++;
                    aa6[] aa6VarArr = aa6Var13.p0;
                    o86[] o86VarArr4 = aa6Var13.R;
                    aa6VarArr[i20] = null;
                    aa6Var13.o0[i20] = null;
                    if (aa6Var13.i0 != i19) {
                        aa6Var13.k(i20);
                        o86VarArr4[i21].e();
                        int i22 = i21 + 1;
                        o86VarArr4[i22].e();
                        o86VarArr4[i21].e();
                        o86VarArr4[i22].e();
                        if (sa4Var.b == null) {
                            sa4Var.b = aa6Var13;
                        }
                        sa4Var.d = aa6Var13;
                        z96 z96Var2 = aa6Var13.U[i20];
                        if (z96Var2 == z96Var) {
                            int i23 = aa6Var13.t[i20];
                            i15 = i18;
                            if (i23 == 0 || i23 == 3 || i23 == 2) {
                                sa4Var.j++;
                                float f8 = aa6Var13.n0[i20];
                                if (f8 > 0.0f) {
                                    f6 = f8;
                                    sa4Var.k += f6;
                                } else {
                                    f6 = f8;
                                }
                                i16 = i20;
                                if (aa6Var13.i0 != 8 && z96Var2 == z96Var && (i23 == 0 || i23 == 3)) {
                                    if (f6 < 0.0f) {
                                        sa4Var.n = true;
                                    } else {
                                        sa4Var.o = true;
                                    }
                                    if (sa4Var.h == null) {
                                        sa4Var.h = new ArrayList();
                                    }
                                    sa4Var.h.add(aa6Var13);
                                }
                                if (sa4Var.f == null) {
                                    sa4Var.f = aa6Var13;
                                }
                                aa6 aa6Var15 = sa4Var.g;
                                if (aa6Var15 != null) {
                                    aa6Var15.o0[i16] = aa6Var13;
                                }
                                sa4Var.g = aa6Var13;
                            } else {
                                i16 = i20;
                            }
                            if (i16 == 0) {
                                if (aa6Var13.r == 0 && aa6Var13.u == 0) {
                                    int i24 = aa6Var13.v;
                                }
                            } else if (aa6Var13.s == 0 && aa6Var13.x == 0) {
                                int i25 = aa6Var13.y;
                            }
                            aa6Var10 = aa6Var14;
                            if (aa6Var10 != aa6Var13) {
                                aa6Var10.p0[i16] = aa6Var13;
                            }
                            o86Var8 = o86VarArr4[i21 + 1].f;
                            if (o86Var8 != null) {
                                aa6Var11 = o86Var8.d;
                                o86 o86Var9 = aa6Var11.R[i21].f;
                                if (o86Var9 != null) {
                                }
                            }
                            aa6Var11 = null;
                            if (aa6Var11 != null) {
                                aa6Var11 = aa6Var13;
                                z6 = true;
                            }
                            aa6Var14 = aa6Var13;
                            i20 = i16;
                            i19 = 8;
                            aa6Var13 = aa6Var11;
                            i18 = i15;
                        }
                    }
                    i15 = i18;
                    i16 = i20;
                    aa6Var10 = aa6Var14;
                    if (aa6Var10 != aa6Var13) {
                    }
                    o86Var8 = o86VarArr4[i21 + 1].f;
                    if (o86Var8 != null) {
                    }
                    aa6Var11 = null;
                    if (aa6Var11 != null) {
                    }
                    aa6Var14 = aa6Var13;
                    i20 = i16;
                    i19 = 8;
                    aa6Var13 = aa6Var11;
                    i18 = i15;
                }
                i5 = i18;
                int i26 = i20;
                aa6 aa6Var16 = sa4Var.b;
                if (aa6Var16 != null) {
                    aa6Var16.R[i21].e();
                }
                aa6 aa6Var17 = sa4Var.d;
                if (aa6Var17 != null) {
                    aa6Var17.R[i21 + 1].e();
                }
                sa4Var.c = aa6Var13;
                if (i26 == 0 && sa4Var.m) {
                    sa4Var.e = aa6Var13;
                } else {
                    sa4Var.e = aa6Var12;
                }
                sa4Var.p = sa4Var.o && sa4Var.n;
            }
            sa4Var.q = true;
            if (arrayList4 == null || arrayList4.contains(aa6Var12)) {
                aa6 aa6Var18 = sa4Var.c;
                aa6 aa6Var19 = sa4Var.b;
                aa6 aa6Var20 = sa4Var.d;
                aa6 aa6Var21 = sa4Var.e;
                float f9 = sa4Var.k;
                z96[] z96VarArr = ba6Var2.U;
                o86[] o86VarArr5 = o86VarArr3;
                o86[] o86VarArr6 = ba6Var2.R;
                boolean z7 = z96VarArr[i2] == z96.b;
                if (i2 == 0) {
                    int i27 = aa6Var21.l0;
                    boolean z8 = i27 == 0;
                    z = z7;
                    z3 = i27 == 1;
                    z4 = i27 == 2;
                    aa6Var = aa6Var12;
                    f2 = f9;
                    z2 = z8;
                } else {
                    z = z7;
                    int i28 = aa6Var21.m0;
                    z2 = i28 == 0;
                    z3 = i28 == 1;
                    z4 = i28 == 2;
                    aa6Var = aa6Var12;
                    f2 = f9;
                }
                boolean z9 = z3;
                boolean z10 = false;
                while (!z10) {
                    o86[] o86VarArr7 = aa6Var.R;
                    o86 o86Var10 = o86VarArr7[i4];
                    int i29 = z4 ? 1 : 4;
                    int e2 = o86Var10.e();
                    boolean z11 = z4;
                    boolean z12 = aa6Var.U[i2] == z96Var && aa6Var.t[i2] == 0;
                    o86 o86Var11 = o86Var10.f;
                    if (o86Var11 != null && aa6Var != aa6Var12) {
                        e2 = o86Var11.e() + e2;
                    }
                    int i30 = e2;
                    if (z11 && aa6Var != aa6Var12 && aa6Var != aa6Var19) {
                        i29 = 8;
                    }
                    aa6 aa6Var22 = aa6Var12;
                    o86 o86Var12 = o86Var10.f;
                    if (o86Var12 != null) {
                        i3r i3rVar6 = o86Var10.i;
                        i3r i3rVar7 = o86Var12.i;
                        if (aa6Var == aa6Var19) {
                            i13 = i17;
                            j7gVar3.f(i3rVar6, i3rVar7, i30, 6);
                        } else {
                            i13 = i17;
                            j7gVar3.f(i3rVar6, i3rVar7, i30, 8);
                        }
                        if (z12 && !z11) {
                            i29 = 5;
                        }
                        j7gVar3.e(o86Var10.i, o86Var10.f.i, i30, (aa6Var == aa6Var19 && z11 && aa6Var.T[i2]) ? 5 : i29);
                    } else {
                        i13 = i17;
                    }
                    if (z) {
                        if (aa6Var.i0 == 8 || aa6Var.U[i2] != z96Var) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            j7gVar3.f(o86VarArr7[i4 + 1].i, o86VarArr7[i4].i, 0, 5);
                        }
                        j7gVar3.f(o86VarArr7[i4].i, o86VarArr6[i4].i, i14, 8);
                    }
                    o86 o86Var13 = o86VarArr7[i4 + 1].f;
                    if (o86Var13 != null) {
                        aa6Var9 = o86Var13.d;
                        o86 o86Var14 = aa6Var9.R[i4].f;
                        if (o86Var14 != null) {
                        }
                    }
                    aa6Var9 = null;
                    if (aa6Var9 != null) {
                        aa6Var = aa6Var9;
                    } else {
                        z10 = true;
                    }
                    aa6Var12 = aa6Var22;
                    z4 = z11;
                    i17 = i13;
                }
                boolean z13 = z4;
                i6 = i17;
                if (aa6Var20 != null) {
                    int i31 = i4 + 1;
                    if (aa6Var18.R[i31].f != null) {
                        o86 o86Var15 = aa6Var20.R[i31];
                        if (aa6Var20.U[i2] == z96Var && aa6Var20.t[i2] == 0 && !z13) {
                            o86 o86Var16 = o86Var15.f;
                            if (o86Var16.d == ba6Var2) {
                                j7gVar3.e(o86Var15.i, o86Var16.i, -o86Var15.e(), 5);
                                j7gVar3.g(o86Var15.i, aa6Var18.R[i31].f.i, -o86Var15.e(), 6);
                                if (z) {
                                    int i32 = i4 + 1;
                                    i3r i3rVar8 = o86VarArr6[i32].i;
                                    o86 o86Var17 = aa6Var18.R[i32];
                                    j7gVar3.f(i3rVar8, o86Var17.i, o86Var17.e(), 8);
                                }
                                arrayList2 = sa4Var.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f10 = (sa4Var.n || sa4Var.p) ? f2 : sa4Var.j;
                                    aa6 aa6Var23 = null;
                                    float f11 = 0.0f;
                                    i10 = 0;
                                    while (i10 < size) {
                                        aa6 aa6Var24 = (aa6) arrayList2.get(i10);
                                        float[] fArr = aa6Var24.n0;
                                        o86[] o86VarArr8 = aa6Var24.R;
                                        float f12 = fArr[i2];
                                        if (f12 < f7) {
                                            if (sa4Var.p) {
                                                arrayList3 = arrayList2;
                                                j7gVar3.e(o86VarArr8[i4 + 1].i, o86VarArr8[i4].i, 0, 4);
                                                i11 = i10;
                                                i12 = size;
                                                f4 = f7;
                                                f5 = f10;
                                                i10 = i11 + 1;
                                                f10 = f5;
                                                arrayList2 = arrayList3;
                                                size = i12;
                                                f7 = f4;
                                            } else {
                                                f12 = 1.0f;
                                            }
                                        }
                                        arrayList3 = arrayList2;
                                        if (f12 == f7) {
                                            i11 = i10;
                                            j7gVar3.e(o86VarArr8[i4 + 1].i, o86VarArr8[i4].i, 0, 8);
                                            i12 = size;
                                            f4 = f7;
                                            f5 = f10;
                                            i10 = i11 + 1;
                                            f10 = f5;
                                            arrayList2 = arrayList3;
                                            size = i12;
                                            f7 = f4;
                                        } else {
                                            i11 = i10;
                                            if (aa6Var23 != null) {
                                                o86[] o86VarArr9 = aa6Var23.R;
                                                i3r i3rVar9 = o86VarArr9[i4].i;
                                                int i33 = i4 + 1;
                                                i3r i3rVar10 = o86VarArr9[i33].i;
                                                i3r i3rVar11 = o86VarArr8[i4].i;
                                                i3r i3rVar12 = o86VarArr8[i33].i;
                                                i12 = size;
                                                bz0 l = j7gVar3.l();
                                                aa6Var8 = aa6Var24;
                                                float f13 = f7;
                                                l.b = f13;
                                                f4 = f13;
                                                if (f10 == f13 || f11 == f12) {
                                                    f5 = f10;
                                                    f3 = f12;
                                                    l.d.g(i3rVar9, 1.0f);
                                                    l.d.g(i3rVar10, -1.0f);
                                                    l.d.g(i3rVar12, 1.0f);
                                                    l.d.g(i3rVar11, -1.0f);
                                                } else {
                                                    py0 py0Var = l.d;
                                                    if (f11 == f4) {
                                                        f5 = f10;
                                                        py0Var.g(i3rVar9, 1.0f);
                                                        l.d.g(i3rVar10, -1.0f);
                                                        f3 = f12;
                                                    } else {
                                                        f5 = f10;
                                                        f3 = f12;
                                                        if (f12 == f7) {
                                                            py0Var.g(i3rVar11, 1.0f);
                                                            l.d.g(i3rVar12, -1.0f);
                                                        } else {
                                                            float f14 = (f11 / f5) / (f3 / f5);
                                                            py0Var.g(i3rVar9, 1.0f);
                                                            l.d.g(i3rVar10, -1.0f);
                                                            l.d.g(i3rVar12, f14);
                                                            l.d.g(i3rVar11, -f14);
                                                        }
                                                    }
                                                }
                                                j7gVar3.c(l);
                                            } else {
                                                i12 = size;
                                                aa6Var8 = aa6Var24;
                                                f3 = f12;
                                                f4 = f7;
                                                f5 = f10;
                                            }
                                            aa6Var23 = aa6Var8;
                                            f11 = f3;
                                            i10 = i11 + 1;
                                            f10 = f5;
                                            arrayList2 = arrayList3;
                                            size = i12;
                                            f7 = f4;
                                        }
                                    }
                                }
                                if (aa6Var19 == null && (aa6Var19 == aa6Var20 || z13)) {
                                    o86 o86Var18 = o86VarArr5[i4];
                                    int i34 = i4 + 1;
                                    o86 o86Var19 = aa6Var18.R[i34];
                                    o86 o86Var20 = o86Var18.f;
                                    i3r i3rVar13 = o86Var20 != null ? o86Var20.i : null;
                                    o86 o86Var21 = o86Var19.f;
                                    i3r i3rVar14 = o86Var21 != null ? o86Var21.i : null;
                                    o86 o86Var22 = aa6Var19.R[i4];
                                    if (aa6Var20 != null) {
                                        o86Var19 = aa6Var20.R[i34];
                                    }
                                    if (i3rVar13 == null || i3rVar14 == null) {
                                        aa6Var2 = aa6Var20;
                                    } else {
                                        float f15 = i2 == 0 ? aa6Var21.f0 : aa6Var21.g0;
                                        int e3 = o86Var22.e();
                                        int e4 = o86Var19.e();
                                        i3r i3rVar15 = o86Var22.i;
                                        i3r i3rVar16 = o86Var19.i;
                                        i3r i3rVar17 = i3rVar13;
                                        aa6Var2 = aa6Var20;
                                        j7gVar3.b(i3rVar15, i3rVar17, e3, f15, i3rVar14, i3rVar16, e4, 7);
                                    }
                                } else {
                                    aa6Var2 = aa6Var20;
                                    if (z2 || aa6Var19 == null) {
                                        int i35 = 8;
                                        if (z9 && aa6Var19 != null) {
                                            int i36 = sa4Var.j;
                                            boolean z14 = i36 <= 0 && sa4Var.i == i36;
                                            aa6 aa6Var25 = aa6Var19;
                                            aa6Var3 = aa6Var25;
                                            while (aa6Var3 != null) {
                                                o86[] o86VarArr10 = aa6Var3.R;
                                                aa6 aa6Var26 = aa6Var3.p0[i2];
                                                while (aa6Var26 != null && aa6Var26.i0 == i35) {
                                                    aa6Var26 = aa6Var26.p0[i2];
                                                }
                                                if (aa6Var3 == aa6Var19 || aa6Var3 == aa6Var2 || aa6Var26 == null) {
                                                    aa6Var4 = aa6Var25;
                                                } else {
                                                    if (aa6Var26 == aa6Var2) {
                                                        aa6Var26 = null;
                                                    }
                                                    o86 o86Var23 = o86VarArr10[i4];
                                                    i3r i3rVar18 = o86Var23.i;
                                                    int i37 = i4 + 1;
                                                    i3r i3rVar19 = aa6Var25.R[i37].i;
                                                    int e5 = o86Var23.e();
                                                    int e6 = o86VarArr10[i37].e();
                                                    if (aa6Var26 != null) {
                                                        o86Var4 = aa6Var26.R[i4];
                                                        i3rVar2 = o86Var4.i;
                                                        o86 o86Var24 = o86Var4.f;
                                                        i3rVar = o86Var24 != null ? o86Var24.i : null;
                                                    } else {
                                                        o86 o86Var25 = aa6Var2.R[i4];
                                                        i3r i3rVar20 = o86Var25 != null ? o86Var25.i : null;
                                                        i3rVar = o86VarArr10[i37].i;
                                                        o86Var4 = o86Var25;
                                                        i3rVar2 = i3rVar20;
                                                    }
                                                    if (o86Var4 != null) {
                                                        e6 += o86Var4.e();
                                                    }
                                                    int e7 = e5 + aa6Var25.R[i37].e();
                                                    aa6 aa6Var27 = aa6Var26;
                                                    i3r i3rVar21 = i3rVar2;
                                                    int i38 = z14 ? 8 : 4;
                                                    if (i3rVar18 == null || i3rVar19 == null || i3rVar21 == null || i3rVar == null) {
                                                        aa6Var4 = aa6Var25;
                                                        aa6Var5 = aa6Var27;
                                                    } else {
                                                        aa6Var5 = aa6Var27;
                                                        i3r i3rVar22 = i3rVar;
                                                        aa6Var4 = aa6Var25;
                                                        j7gVar.b(i3rVar18, i3rVar19, e7, 0.5f, i3rVar21, i3rVar22, e6, i38);
                                                    }
                                                    aa6Var26 = aa6Var5;
                                                }
                                                if (aa6Var3.i0 != 8) {
                                                    aa6Var4 = aa6Var3;
                                                }
                                                aa6Var3 = aa6Var26;
                                                aa6Var25 = aa6Var4;
                                                i35 = 8;
                                            }
                                            j7gVar2 = j7gVar;
                                            o86 o86Var26 = aa6Var19.R[i4];
                                            o86Var = o86VarArr5[i4].f;
                                            int i39 = i4 + 1;
                                            o86Var2 = aa6Var2.R[i39];
                                            o86Var3 = aa6Var18.R[i39].f;
                                            if (o86Var != null) {
                                                if (aa6Var19 != aa6Var2) {
                                                    j7gVar2.e(o86Var26.i, o86Var.i, o86Var26.e(), 5);
                                                } else if (o86Var3 != null) {
                                                    j7gVar2.b(o86Var26.i, o86Var.i, o86Var26.e(), 0.5f, o86Var2.i, o86Var3.i, o86Var2.e(), 5);
                                                }
                                            }
                                            if (o86Var3 != null && aa6Var19 != aa6Var2) {
                                                j7gVar2.e(o86Var2.i, o86Var3.i, -o86Var2.e(), 5);
                                            }
                                            if ((!z2 || z9) && aa6Var19 != null && aa6Var19 != aa6Var2) {
                                                o86[] o86VarArr11 = aa6Var19.R;
                                                o86Var6 = o86VarArr11[i4];
                                                if (aa6Var2 == null) {
                                                    aa6Var2 = aa6Var19;
                                                }
                                                o86VarArr2 = aa6Var2.R;
                                                i9 = i4 + 1;
                                                o86Var7 = o86VarArr2[i9];
                                                o86 o86Var27 = o86Var6.f;
                                                i3rVar4 = o86Var27 != null ? o86Var27.i : null;
                                                o86 o86Var28 = o86Var7.f;
                                                i3rVar5 = o86Var28 != null ? o86Var28.i : null;
                                                if (aa6Var18 != aa6Var2) {
                                                    o86 o86Var29 = aa6Var18.R[i9].f;
                                                    i3rVar5 = o86Var29 != null ? o86Var29.i : null;
                                                }
                                                if (aa6Var19 == aa6Var2) {
                                                    o86Var7 = o86VarArr11[i9];
                                                }
                                                if (i3rVar4 == null && i3rVar5 != null) {
                                                    j7gVar2.b(o86Var6.i, i3rVar4, o86Var6.e(), 0.5f, i3rVar5, o86Var7.i, o86VarArr2[i9].e(), 5);
                                                }
                                            }
                                        }
                                    } else {
                                        int i40 = sa4Var.j;
                                        boolean z15 = i40 > 0 && sa4Var.i == i40;
                                        aa6 aa6Var28 = aa6Var19;
                                        aa6 aa6Var29 = aa6Var28;
                                        while (aa6Var28 != null) {
                                            o86[] o86VarArr12 = aa6Var28.R;
                                            aa6 aa6Var30 = aa6Var28.p0[i2];
                                            while (true) {
                                                if (aa6Var30 == null) {
                                                    i7 = 8;
                                                    break;
                                                }
                                                i7 = 8;
                                                if (aa6Var30.i0 != 8) {
                                                    break;
                                                } else {
                                                    aa6Var30 = aa6Var30.p0[i2];
                                                }
                                            }
                                            if (aa6Var30 != null || aa6Var28 == aa6Var2) {
                                                o86 o86Var30 = o86VarArr12[i4];
                                                i3r i3rVar23 = o86Var30.i;
                                                o86 o86Var31 = o86Var30.f;
                                                i3r i3rVar24 = o86Var31 != null ? o86Var31.i : null;
                                                if (aa6Var29 != aa6Var28) {
                                                    i3rVar24 = aa6Var29.R[i4 + 1].i;
                                                } else if (aa6Var28 == aa6Var19) {
                                                    o86 o86Var32 = o86VarArr5[i4].f;
                                                    i3rVar24 = o86Var32 != null ? o86Var32.i : null;
                                                }
                                                int e8 = o86Var30.e();
                                                int i41 = i4 + 1;
                                                int e9 = o86VarArr12[i41].e();
                                                if (aa6Var30 != null) {
                                                    o86Var5 = aa6Var30.R[i4];
                                                    i3rVar3 = o86Var5.i;
                                                } else {
                                                    o86Var5 = aa6Var18.R[i41].f;
                                                    i3rVar3 = o86Var5 != null ? o86Var5.i : null;
                                                }
                                                i3r i3rVar25 = o86VarArr12[i41].i;
                                                if (o86Var5 != null) {
                                                    e9 += o86Var5.e();
                                                }
                                                int e10 = aa6Var29.R[i41].e() + e8;
                                                if (i3rVar23 == null || i3rVar24 == null || i3rVar3 == null || i3rVar25 == null) {
                                                    aa6Var6 = aa6Var30;
                                                    o86VarArr = o86VarArr5;
                                                    aa6Var7 = aa6Var29;
                                                    i8 = 8;
                                                } else {
                                                    if (aa6Var28 == aa6Var19) {
                                                        e10 = aa6Var19.R[i4].e();
                                                    }
                                                    if (aa6Var28 == aa6Var2) {
                                                        e9 = aa6Var2.R[i41].e();
                                                    }
                                                    aa6Var6 = aa6Var30;
                                                    o86VarArr = o86VarArr5;
                                                    aa6Var7 = aa6Var29;
                                                    i8 = 8;
                                                    j7gVar.b(i3rVar23, i3rVar24, e10, 0.5f, i3rVar3, i3rVar25, e9, z15 ? 8 : 5);
                                                }
                                            } else {
                                                aa6Var6 = aa6Var30;
                                                o86VarArr = o86VarArr5;
                                                aa6Var7 = aa6Var29;
                                                i8 = i7;
                                            }
                                            if (aa6Var28.i0 != i8) {
                                                aa6Var7 = aa6Var28;
                                            }
                                            aa6Var28 = aa6Var6;
                                            aa6Var29 = aa6Var7;
                                            o86VarArr5 = o86VarArr;
                                        }
                                    }
                                }
                                j7gVar2 = j7gVar;
                                if (!z2) {
                                }
                                o86[] o86VarArr112 = aa6Var19.R;
                                o86Var6 = o86VarArr112[i4];
                                if (aa6Var2 == null) {
                                }
                                o86VarArr2 = aa6Var2.R;
                                i9 = i4 + 1;
                                o86Var7 = o86VarArr2[i9];
                                o86 o86Var272 = o86Var6.f;
                                if (o86Var272 != null) {
                                }
                                o86 o86Var282 = o86Var7.f;
                                if (o86Var282 != null) {
                                }
                                if (aa6Var18 != aa6Var2) {
                                }
                                if (aa6Var19 == aa6Var2) {
                                }
                                if (i3rVar4 == null) {
                                    j7gVar2.b(o86Var6.i, i3rVar4, o86Var6.e(), 0.5f, i3rVar5, o86Var7.i, o86VarArr2[i9].e(), 5);
                                }
                            }
                        }
                        if (z13) {
                            o86 o86Var33 = o86Var15.f;
                            if (o86Var33.d == ba6Var2) {
                                j7gVar3.e(o86Var15.i, o86Var33.i, -o86Var15.e(), 4);
                            }
                        }
                        j7gVar3.g(o86Var15.i, aa6Var18.R[i31].f.i, -o86Var15.e(), 6);
                        if (z) {
                        }
                        arrayList2 = sa4Var.h;
                        if (arrayList2 != null) {
                            if (sa4Var.n) {
                            }
                            aa6 aa6Var232 = null;
                            float f112 = 0.0f;
                            i10 = 0;
                            while (i10 < size) {
                            }
                        }
                        if (aa6Var19 == null) {
                        }
                        aa6Var2 = aa6Var20;
                        if (z2) {
                        }
                        int i352 = 8;
                        if (z9) {
                            int i362 = sa4Var.j;
                            if (i362 <= 0) {
                            }
                            aa6 aa6Var252 = aa6Var19;
                            aa6Var3 = aa6Var252;
                            while (aa6Var3 != null) {
                            }
                            j7gVar2 = j7gVar;
                            o86 o86Var262 = aa6Var19.R[i4];
                            o86Var = o86VarArr5[i4].f;
                            int i392 = i4 + 1;
                            o86Var2 = aa6Var2.R[i392];
                            o86Var3 = aa6Var18.R[i392].f;
                            if (o86Var != null) {
                            }
                            if (o86Var3 != null) {
                                j7gVar2.e(o86Var2.i, o86Var3.i, -o86Var2.e(), 5);
                            }
                            if (!z2) {
                            }
                            o86[] o86VarArr1122 = aa6Var19.R;
                            o86Var6 = o86VarArr1122[i4];
                            if (aa6Var2 == null) {
                            }
                            o86VarArr2 = aa6Var2.R;
                            i9 = i4 + 1;
                            o86Var7 = o86VarArr2[i9];
                            o86 o86Var2722 = o86Var6.f;
                            if (o86Var2722 != null) {
                            }
                            o86 o86Var2822 = o86Var7.f;
                            if (o86Var2822 != null) {
                            }
                            if (aa6Var18 != aa6Var2) {
                            }
                            if (aa6Var19 == aa6Var2) {
                            }
                            if (i3rVar4 == null) {
                            }
                        }
                        j7gVar2 = j7gVar;
                        if (!z2) {
                        }
                        o86[] o86VarArr11222 = aa6Var19.R;
                        o86Var6 = o86VarArr11222[i4];
                        if (aa6Var2 == null) {
                        }
                        o86VarArr2 = aa6Var2.R;
                        i9 = i4 + 1;
                        o86Var7 = o86VarArr2[i9];
                        o86 o86Var27222 = o86Var6.f;
                        if (o86Var27222 != null) {
                        }
                        o86 o86Var28222 = o86Var7.f;
                        if (o86Var28222 != null) {
                        }
                        if (aa6Var18 != aa6Var2) {
                        }
                        if (aa6Var19 == aa6Var2) {
                        }
                        if (i3rVar4 == null) {
                        }
                    }
                }
                if (z) {
                }
                arrayList2 = sa4Var.h;
                if (arrayList2 != null) {
                }
                if (aa6Var19 == null) {
                }
                aa6Var2 = aa6Var20;
                if (z2) {
                }
                int i3522 = 8;
                if (z9) {
                }
                j7gVar2 = j7gVar;
                if (!z2) {
                }
                o86[] o86VarArr112222 = aa6Var19.R;
                o86Var6 = o86VarArr112222[i4];
                if (aa6Var2 == null) {
                }
                o86VarArr2 = aa6Var2.R;
                i9 = i4 + 1;
                o86Var7 = o86VarArr2[i9];
                o86 o86Var272222 = o86Var6.f;
                if (o86Var272222 != null) {
                }
                o86 o86Var282222 = o86Var7.f;
                if (o86Var282222 != null) {
                }
                if (aa6Var18 != aa6Var2) {
                }
                if (aa6Var19 == aa6Var2) {
                }
                if (i3rVar4 == null) {
                }
            } else {
                i6 = i17;
            }
            i18 = i5 + 1;
            ba6Var2 = ba6Var;
            j7gVar3 = j7gVar;
            arrayList4 = arrayList;
            i17 = i6;
        }
    }

    public static final thj j(m7a m7aVar, int i2, int i3) {
        m7aVar.getClass();
        return new thj(pkb.Donation, "", i2 + 1, i3 + 1, m7aVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t28 k(pxf pxfVar, String str, g86 g86Var, String str2, g0c g0cVar, b0j b0jVar, Context context, jdk jdkVar, boolean z, String str3) {
        context.getClass();
        str3.getClass();
        ugk ugkVar = pxfVar.a;
        int i2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i3 = 14;
        xo7 xo7Var = new xo7(new ypb(i3, pxfVar), new nzi(g86Var.a(ugkVar), t7g.o(ugkVar == ugk.TESTING), t75.c(new n56())), new ozw(25, (byte) 0), new v(g0cVar, 0), new w(0 == true ? 1 : 0, g0cVar));
        ozw ozwVar = new ozw(25, (byte) 0);
        dj2 dj2Var = new dj2(context, jdkVar, z, ugkVar.a, g0cVar);
        int i4 = 2;
        ArrayList j = u75.j(b0jVar, new q9i(1));
        ArrayList j2 = u75.j(new lgj(str, i4, objArr3 == true ? 1 : 0), new lgj(str2, i2, objArr2 == true ? 1 : 0), new lgj(str3, 3));
        j2.add(new yt0(i4, new r28(dj2Var, objArr == true ? 1 : 0)));
        return new t28(new t1f(i3, new d0j(xo7Var, u1g.A(j2, j)), ozwVar, new sld(29)), g0cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l9i l(Context context, jdk jdkVar, pyh pyhVar, boolean z, boolean z2, String str, pxf pxfVar, g86 g86Var, String str2, g0c g0cVar, b0j b0jVar, String str3, String str4, Boolean bool, efs efsVar) {
        String str5;
        context.getClass();
        str4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("integration_profile_id", new jkr(str3 == null ? "default" : str3));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Сервис передал id интеграционного профиля"));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        int i2 = 1;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        ((x60) g0cVar).a(su4.j(vtmVar, "event_name", "integration_profile_from_service", "integration_profile_from_service", vtmVar));
        ugk ugkVar = pxfVar.a;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        xo7 xo7Var = new xo7(new rs6(20, new URL(pxfVar.a())), new nzi(g86Var.a(ugkVar), t7g.o(ugkVar == ugk.TESTING), t75.c(new n56())), new ozw(25, (byte) 0), new v(g0cVar, i2), new w(i2, g0cVar));
        wnd wndVar = new wnd(context, 4);
        pv9 pv9Var = new pv9(3, bool);
        ozw ozwVar = new ozw(25, (byte) 0);
        String str6 = pyhVar.a;
        dj2 dj2Var = new dj2(context, jdkVar, z, ugkVar.a, g0cVar);
        lo4 lo4Var = lo4.android;
        String deviceId = AppMetrica.getDeviceId(context.getApplicationContext());
        ArrayList j = u75.j(b0jVar, new q9i(1));
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        g06 g06Var = new g06(Build.VERSION.RELEASE.toString(), String.valueOf(Build.VERSION.SDK_INT), String.valueOf(Resources.getSystem().getDisplayMetrics().widthPixels), String.valueOf(Resources.getSystem().getDisplayMetrics().heightPixels));
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        PackageManager packageManager = applicationContext.getPackageManager();
        String packageName = applicationContext.getPackageName();
        try {
            str5 = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str5 = null;
        }
        y3e y3eVar = new y3e(str5, packageName, i3);
        str6.getClass();
        int i4 = 1;
        ArrayList j2 = u75.j(new p9i(new r28(dj2Var, 2), str6, deviceId), new q9i(0), new i9i(z2, str3, pv9Var, efsVar), new lgj(str, 2, objArr3 == true ? 1 : 0), new lgj(str2, i4, objArr2 == true ? 1 : 0), new lgj(str4, 3));
        j2.add(new yt0(i4, g06Var));
        j2.add(new yt0(objArr == true ? 1 : 0, y3eVar));
        j2.add(new yt0(3, new ypb(16, wndVar)));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            j2.add((b0j) it.next());
        }
        return new l9i(new t1f(14, new d0j(xo7Var, j2), ozwVar, new cib(17, new r28(dj2Var, 1))), g0cVar);
    }

    public static final boolean m(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = c5b.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    qfp qfpVar = (qfp) obj2;
                    qfp qfpVar2 = (qfp) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (qfpVar2.e().c() >> 32)) - Float.intBitsToFloat((int) (qfpVar.e().c() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (qfpVar2.e().c() & 4294967295L)) - Float.intBitsToFloat((int) (qfpVar.e().c() & 4294967295L)));
                    arrayList2.add(new enj((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((enj) CollectionsKt.Q(list)).a;
            } else {
                if (list.isEmpty()) {
                    lag.c("Empty collection can't be reduced.");
                }
                Object Q = CollectionsKt.Q(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        Q = new enj(enj.h(((enj) Q).a, ((enj) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j = ((enj) Q).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void n(boolean z) {
        if (z) {
            return;
        }
        e7o.e();
    }

    public static void o(boolean z) {
        if (z) {
            return;
        }
        e7o.n();
    }

    public static void p(Object obj) {
        if (obj != null) {
            return;
        }
        e7o.n();
    }

    public static final yci q(yci yciVar, pyc pycVar) {
        return yciVar.f(new fq5(pycVar, lhb.v0));
    }

    public static final yci r(yci yciVar, String str, Object[] objArr, pyc pycVar) {
        return yciVar.f(new wbf(str, objArr, pycVar));
    }

    public static final double s(int i2, int i3, int i4, int i5, nso nsoVar) {
        double d2 = i4 / i2;
        double d3 = i5 / i3;
        int ordinal = nsoVar.ordinal();
        if (ordinal == 0) {
            return Math.max(d2, d3);
        }
        if (ordinal == 1) {
            return Math.min(d2, d3);
        }
        b6e.s();
        return 0.0d;
    }

    public static ru t(lt ltVar, List list) {
        String str;
        list.getClass();
        u9b u9bVar = ltVar.e;
        if (u9bVar == null || (str = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) == null) {
            str = "";
        }
        String str2 = str;
        String str3 = ltVar.c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ghh.M((u51) it.next()));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new ru(ltVar.g, str2, str3, arrayList != null ? xp3.L(arrayList, c5b.a) : null, null, ltVar.d == WarningContent.EXPLICIT);
    }

    public static final long u(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[RemoteCameraConfig.Notification.ID];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static final zh v(sh shVar, dxd dxdVar, v vVar) {
        fi activityResultRegistry;
        if (shVar instanceof hn5) {
            return ((hn5) shVar).getActivityResultRegistry().c(hdg.d0(), dxdVar, vVar);
        }
        if (!(shVar instanceof o)) {
            if (shVar instanceof orq) {
                return ((orq) shVar).registerForActivityResult(dxdVar, vVar);
            }
            zh registerForActivityResult = shVar.registerForActivityResult(dxdVar, vVar);
            registerForActivityResult.getClass();
            return registerForActivityResult;
        }
        o oVar = (o) shVar;
        t l = oVar.l();
        if (l != null && (activityResultRegistry = l.getActivityResultRegistry()) != null) {
            return activityResultRegistry.c(hdg.d0(), dxdVar, vVar);
        }
        zh registerForActivityResult2 = oVar.registerForActivityResult(dxdVar, vVar);
        registerForActivityResult2.getClass();
        return registerForActivityResult2;
    }

    public static Number w(oms omsVar, Object obj, Object obj2) {
        double doubleValue;
        long longValue;
        omsVar.getClass();
        obj.getClass();
        obj2.getClass();
        if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
            if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                ghh.H(omsVar, obj, obj2);
                throw null;
            }
            if (omsVar instanceof nms) {
                doubleValue = ((Number) obj2).doubleValue() * ((Number) obj).doubleValue();
            } else if (omsVar instanceof lms) {
                Number number = (Number) obj2;
                if (number.doubleValue() == 0.0d) {
                    ghh.I(obj + " / " + obj2, "Division by zero is not supported.", null);
                    throw null;
                }
                doubleValue = ((Number) obj).doubleValue() / number.doubleValue();
            } else {
                if (!(omsVar instanceof mms)) {
                    b6e.s();
                    return null;
                }
                Number number2 = (Number) obj2;
                if (number2.doubleValue() == 0.0d) {
                    ghh.I(obj + " % " + obj2, "Division by zero is not supported.", null);
                    throw null;
                }
                doubleValue = ((Number) obj).doubleValue() % number2.doubleValue();
            }
            return Double.valueOf(doubleValue);
        }
        if (omsVar instanceof nms) {
            Number number3 = (Number) obj;
            Number number4 = (Number) obj2;
            long longValue2 = number4.longValue() * number3.longValue();
            if (((Math.abs(number3.longValue()) | Math.abs(number4.longValue())) >>> 31) == 0 || ((obj2.equals(0L) || longValue2 / number4.longValue() == number3.longValue()) && !(obj.equals(Long.MIN_VALUE) && obj2.equals(-1L)))) {
                return Long.valueOf(longValue2);
            }
            xla.g(obj, " * ", obj2);
            return null;
        }
        if (omsVar instanceof lms) {
            if (obj2.equals(0L)) {
                ghh.I(obj + " / " + obj2, "Division by zero is not supported.", null);
                throw null;
            }
            longValue = ((Number) obj).longValue() / ((Number) obj2).longValue();
        } else {
            if (!(omsVar instanceof mms)) {
                b6e.s();
                return null;
            }
            if (obj2.equals(0L)) {
                ghh.I(obj + " % " + obj2, "Division by zero is not supported.", null);
                throw null;
            }
            longValue = ((Number) obj).longValue() % ((Number) obj2).longValue();
        }
        return Long.valueOf(longValue);
    }

    public static Object x(vms vmsVar, Object obj, Object obj2) {
        double doubleValue;
        vmsVar.getClass();
        obj.getClass();
        obj2.getClass();
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (!(vmsVar instanceof ums)) {
                ghh.H(vmsVar, obj, obj2);
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(obj2);
            return sb.toString();
        }
        if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
            if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                ghh.H(vmsVar, obj, obj2);
                throw null;
            }
            if (vmsVar instanceof ums) {
                doubleValue = ((Number) obj2).doubleValue() + ((Number) obj).doubleValue();
            } else {
                if (!(vmsVar instanceof tms)) {
                    b6e.s();
                    return null;
                }
                doubleValue = ((Number) obj).doubleValue() - ((Number) obj2).doubleValue();
            }
            return Double.valueOf(doubleValue);
        }
        if (vmsVar instanceof ums) {
            Number number = (Number) obj;
            Number number2 = (Number) obj2;
            long longValue = number2.longValue() + number.longValue();
            if (((number.longValue() ^ longValue) & (number2.longValue() ^ longValue)) >= 0) {
                return Long.valueOf(longValue);
            }
            xla.g(obj, " + ", obj2);
            return null;
        }
        if (!(vmsVar instanceof tms)) {
            b6e.s();
            return null;
        }
        Number number3 = (Number) obj;
        Number number4 = (Number) obj2;
        long longValue2 = number3.longValue() - number4.longValue();
        if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ longValue2)) >= 0) {
            return Long.valueOf(longValue2);
        }
        xla.g(obj, " - ", obj2);
        return null;
    }

    public static final tn6 y(String str) {
        List split$default;
        CoverInfo$CoverType B;
        List split$default2;
        tn6 tn6Var = new tn6();
        if (str != null && str.length() != 0 && !"null".equals(str)) {
            boolean z = false;
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"|"}, false, 0, 6, null);
            String str2 = (String) split$default.get(0);
            if (StringsKt.M(str2, "<custom>", false)) {
                split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"<custom>"}, false, 0, 6, null);
                if (split$default2.size() != 2) {
                    ssg.a(7, null, "Unexpected custom: ".concat(str), null);
                }
                B = ghh.B((String) split$default2.get(0));
                z = Boolean.parseBoolean((String) split$default2.get(1));
            } else {
                B = ghh.B(str2);
            }
            tn6Var.a = B;
            ArrayList arrayList = new ArrayList();
            int size = split$default.size();
            for (int i2 = 1; i2 < size; i2++) {
                arrayList.add(men.x((String) split$default.get(i2), WebPath$Storage.AVATARS));
            }
            tn6Var.a(arrayList);
            tn6Var.c = z;
        }
        return tn6Var;
    }

    public static final String[] z(ce6 ce6Var) {
        ce6Var.getClass();
        return (String[]) ((vf0) ce6Var).b.toArray(new String[0]);
    }

    public abstract void Q(zyr zyrVar, zyr zyrVar2, Window window, View view, boolean z, boolean z2);

    public void h(Window window) {
        window.getClass();
    }
}
