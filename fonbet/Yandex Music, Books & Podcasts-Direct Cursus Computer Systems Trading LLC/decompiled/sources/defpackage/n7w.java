package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.gms.common.api.Status;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public abstract class n7w {
    public static Handler a;
    public static final wn5 b = new wn5(new h3(21), -235300111, false);
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final ns9 g;
    public static final Object h;

    static {
        new wn5(new bo5(20), 1981849329, false);
        c = new wn5(new lo5(0), -1686970798, false);
        new wn5(new lo5(1), 685185784, false);
        new wn5(new lo5(2), -42180642, false);
        d = new wn5(new ro5(28), 152949382, false);
        new wn5(new ro5(29), 510916864, false);
        e = new wn5(new ep5(6), 2032141225, false);
        f = new wn5(new gp5(0), 695982723, false);
        g = new ns9(17);
        h = new Object();
    }

    public static final eu7 A(eu7 eu7Var, int i) {
        eu7Var.getClass();
        cu7 cu7Var = eu7Var.a;
        int e2 = yhn.e(i, new IntRange(0, cu7Var.a.getElements().size(), 1));
        du7 du7Var = eu7Var.b;
        if (e2 == du7Var.a) {
            return eu7Var;
        }
        boolean f2 = cu7Var.f(e2);
        List list = cu7Var.b;
        if (f2) {
            eu7 a2 = eu7.a(eu7Var, null, new du7(e2, Math.max(e2, du7Var.b)), 1);
            return list.isEmpty() ? a2 : i4w.b0(a2);
        }
        throw new IndexOutOfBoundsException(("Unable to perform atPosition(" + du7Var + ") operation. Position is out of available queue bounds (size = " + u75.f(cu7Var.a.getElements()) + " + " + u75.f(list) + "). coercedPosition = " + e2).toString());
    }

    public static final as3 B(String str, ges gesVar, int i, int i2, Map map, jx7 jx7Var, ppc ppcVar) {
        Object next;
        str.getClass();
        map.getClass();
        jx7Var.getClass();
        ppcVar.getClass();
        if (i <= 0 || map.isEmpty()) {
            fds fdsVar = (fds) CollectionsKt.R(map.values());
            if (fdsVar == null) {
                fdsVar = new fds(0.0f, 12, v7g.z(12), v7g.z(12));
            }
            return new as3(fdsVar.c, fdsVar.d, 1, fdsVar.b);
        }
        float f2 = -1.0f;
        as3 as3Var = null;
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            fds fdsVar2 = (fds) entry.getValue();
            float c2 = kes.c(fdsVar2.b);
            float c3 = kes.c(fdsVar2.a);
            float f3 = f2;
            long j = 4294967296L;
            int i3 = i;
            ih0 C = C(gesVar, i3, str, jx7Var, ppcVar, v7g.D(c2, 4294967296L), intValue, fdsVar2);
            int i4 = Integer.MAX_VALUE;
            boolean z = i2 == Integer.MAX_VALUE || C.b() <= ((float) i2);
            ads adsVar = (ads) C.d;
            boolean z2 = adsVar.g <= intValue && !adsVar.d;
            float c4 = ((mh0) C.c).c();
            float f4 = i3;
            boolean z3 = c4 <= f4;
            if (z && z2 && z3) {
                float f5 = c3;
                float f6 = c2;
                while (true) {
                    float f7 = f5 - f6;
                    if (f7 <= 0.1f) {
                        break;
                    }
                    float f8 = (f7 / 2.0f) + f6;
                    float f9 = f4;
                    long D = v7g.D(f8, j);
                    int i5 = i4;
                    ih0 C2 = C(gesVar, i3, str, jx7Var, ppcVar, D, intValue, fdsVar2);
                    boolean z4 = i2 == i5 || C2.b() <= ((float) i2);
                    ads adsVar2 = (ads) C2.d;
                    boolean z5 = adsVar2.g <= intValue && !adsVar2.d;
                    boolean z6 = ((mh0) C2.c).c() <= f9;
                    if (z4 && z5 && z6) {
                        i3 = i;
                        i4 = i5;
                        f4 = f9;
                        c2 = f8;
                        f6 = c2;
                    } else {
                        i3 = i;
                        i4 = i5;
                        f4 = f9;
                        f5 = f8;
                    }
                    j = 4294967296L;
                }
                if (c2 > f3) {
                    as3Var = new as3(fdsVar2.c, fdsVar2.d, intValue, v7g.D(c2, 4294967296L));
                    f2 = c2;
                }
            }
            f2 = f3;
        }
        if (as3Var != null) {
            return as3Var;
        }
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float c5 = kes.c(((fds) ((Map.Entry) next).getValue()).b);
                do {
                    Object next2 = it.next();
                    float c6 = kes.c(((fds) ((Map.Entry) next2).getValue()).b);
                    if (Float.compare(c5, c6) > 0) {
                        next = next2;
                        c5 = c6;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return new as3(((fds) entry2.getValue()).c, ((fds) entry2.getValue()).d, ((Number) entry2.getKey()).intValue(), ((fds) entry2.getValue()).b);
        }
        fds fdsVar3 = (fds) CollectionsKt.P(map.values());
        return new as3(fdsVar3.c, fdsVar3.d, 1, fdsVar3.b);
    }

    public static final ih0 C(ges gesVar, int i, String str, jx7 jx7Var, ppc ppcVar, long j, int i2, fds fdsVar) {
        ges b2 = ges.b(gesVar, 0L, j, null, null, v7g.D(fdsVar.d, 8589934592L), 0, v7g.D(fdsVar.c, 8589934592L), null, null, u5g.b, 1, 10354557);
        long b3 = ia6.b(i, 0, 13);
        c5b c5bVar = c5b.a;
        return new ih0(new mh0(str, b2, c5bVar, c5bVar, ppcVar, jx7Var), i2, 1, b3);
    }

    public static byte[] D(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static ja E(JSONObject jSONObject) {
        if (jSONObject.getInt("version") > 1) {
            throw new c3c("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string2 = jSONObject.getString("source");
        string2.getClass();
        ra valueOf = ra.valueOf(string2);
        String string3 = jSONObject.getString("application_id");
        String string4 = jSONObject.getString("user_id");
        Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
        String optString = jSONObject.optString("graph_domain", null);
        string.getClass();
        string3.getClass();
        string4.getClass();
        jSONArray.getClass();
        ArrayList F = gvt.F(jSONArray);
        jSONArray2.getClass();
        return new ja(string, string3, string4, F, gvt.F(jSONArray2), optJSONArray == null ? new ArrayList() : gvt.F(optJSONArray), valueOf, date, date2, date3, optString);
    }

    public static bfu F(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (bfu) newInstance;
        } catch (IllegalAccessException e2) {
            kac.k(tlm.j("Cannot create an instance of ", cls), e2);
            return null;
        } catch (InstantiationException e3) {
            kac.k(tlm.j("Cannot create an instance of ", cls), e3);
            return null;
        } catch (NoSuchMethodException e4) {
            kac.k(tlm.j("Cannot create an instance of ", cls), e4);
            return null;
        }
    }

    public static final f9h G(Map map) {
        map.getClass();
        f9h f9hVar = new f9h();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                f9hVar.put(key, value);
            }
        }
        return f9hVar.b();
    }

    public static final eu7 H(eu7 eu7Var, j2t j2tVar, gyn gynVar) {
        eu7Var.getClass();
        j2tVar.getClass();
        int i = eu7Var.a.f;
        for (int i2 = 0; i2 < i; i2++) {
            eu7Var = gynVar.c(eu7Var);
            if (eu7Var == null) {
                return null;
            }
            if (j2tVar.a(eu7Var.b())) {
                return eu7Var;
            }
        }
        return null;
    }

    public static final eu7 I(eu7 eu7Var, j2t j2tVar, gyn gynVar) {
        eu7Var.getClass();
        j2tVar.getClass();
        int i = eu7Var.a.f;
        for (int i2 = 0; i2 < i; i2++) {
            eu7Var = gynVar.a(eu7Var);
            if (eu7Var == null) {
                return null;
            }
            if (j2tVar.a(eu7Var.b())) {
                return eu7Var;
            }
        }
        return null;
    }

    public static final eu7 J(int i, eu7 eu7Var, gyn gynVar, j2t j2tVar) {
        eu7Var.getClass();
        j2tVar.getClass();
        if (!eu7Var.a.f(i)) {
            return null;
        }
        eu7 A = A(eu7Var, i);
        if (j2tVar.a(A.b())) {
            return A;
        }
        int i2 = A.a.f;
        for (int i3 = 0; i3 < i2; i3++) {
            A = gynVar.c(A);
            if (A == null) {
                return null;
            }
            if (j2tVar.a(A.b())) {
                return A;
            }
        }
        return null;
    }

    public static qo0 K(Status status) {
        return status.c != null ? new f2o(status) : new qo0(status);
    }

    public static final o6g L(long j) {
        float[] fArr = new float[3];
        aa5.h(c3x.U(j), fArr);
        float f2 = fArr[1];
        if (f2 > 0.3f) {
            f2 = 0.3f;
        }
        fArr[1] = f2;
        fArr[2] = 0.1f;
        long f3 = c3x.f(aa5.a(fArr));
        return y9w.U(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(d85.b(f3, 0.3f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.2f), new d85(d85.b(f3, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.5f), new d85(d85.b(f3, 0.3f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(f3, 0.9f, 0.0f, 0.0f, 0.0f, 14)))}, 14);
    }

    public static ja N() {
        return (ja) gs4.i.o().a;
    }

    public static synchronized Handler O() {
        Handler handler;
        synchronized (n7w.class) {
            try {
                if (a == null) {
                    a = new Handler(Looper.getMainLooper());
                }
                handler = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static boolean P() {
        ja jaVar = (ja) gs4.i.o().a;
        return (jaVar == null || new Date().after(jaVar.a)) ? false : true;
    }

    public static boolean Q() {
        return ((Boolean) txd.e.getValue()).booleanValue();
    }

    public static final boolean R(q6c q6cVar) {
        fhc fhcVar = fhc.b;
        String str = q6cVar.a;
        fhcVar.getClass();
        str.getClass();
        zn0 zn0Var = (zn0) fhcVar.a.get(str);
        Object invoke = zn0Var != null ? zn0Var.d.invoke() : null;
        String str2 = invoke instanceof String ? (String) invoke : null;
        return str2 != null ? str2.equals(PListParser.TAG_TRUE) : q6cVar.b;
    }

    public static byte[] Y(int i, InputStream inputStream) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                xq0.q(k5r.i(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] Z(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static final void a(sa1 sa1Var, ib1 ib1Var, hq5 hq5Var, int i) {
        ib1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-865794648);
        int i2 = (oq5Var.h(sa1Var) ? 4 : 2) | i | (oq5Var.f(ib1Var) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            vci vciVar = vci.a;
            yci a2 = a.a(vciVar, "artist_donations_block");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.h(rvf.M(R.string.artist_donate_carousel_title, oq5Var), null, null, null, null, false, null, false, null, oq5Var, 0, 510);
            float A = w1g.A(((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp, oq5Var);
            float f2 = 16;
            hld.l(sa1Var.a, d.d(vciVar, 1.0f), null, 0.0f, f2, f2, (2 * A) + vt0.a, androidx.compose.foundation.layout.a.c(f2, 0.0f, 32, 0.0f, 10), 0, false, false, false, ild.C(-1218889460, new bb1(ib1Var, A, 0), oq5Var), oq5Var, 12804144, 390, 2828);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a3(sa1Var, ib1Var, i, 11);
        }
    }

    public static long a0(int i, InputStream inputStream) {
        byte[] Y = Y(i, inputStream);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (Y[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final void b(y93 y93Var, tmb tmbVar, hq5 hq5Var, int i) {
        boolean z;
        cb3 cb3Var;
        boolean z2;
        kjn kjnVar;
        boolean z3;
        boolean z4;
        y93 y93Var2 = y93Var;
        y93Var2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-211180171);
        int i2 = (oq5Var.h(y93Var2) ? 4 : 2) | i | (oq5Var.h(tmbVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            cb3 cb3Var2 = (cb3) gld.O(y93Var2.f, oq5Var).getValue();
            mud O = vnj.O(bcb.a(oq5Var), y93Var2.e, oq5Var);
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = new uu1(27);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            ogp ogpVar = ogp.g;
            boolean z5 = cb3Var2 instanceof wa3;
            boolean z6 = cb3Var2 instanceof xa3;
            cb3Var2.getClass();
            boolean z7 = cb3Var2 instanceof ab3;
            if (z7) {
                z = ((ab3) cb3Var2).e.a;
            } else {
                if (!(cb3Var2 instanceof za3) && !(cb3Var2 instanceof xa3) && !(cb3Var2 instanceof bb3) && !(cb3Var2 instanceof ya3) && !(cb3Var2 instanceof wa3)) {
                    b6e.s();
                    return;
                }
                z = false;
            }
            ogpVar.e(z5, z6, (z || ((Boolean) aqiVar.getValue()).booleanValue()) ? ogp.r().e() : ogp.r().b(), oq5Var, 4096, 0);
            oq5Var = oq5Var;
            if (cb3Var2 instanceof ya3) {
                oq5Var.Z(859620548);
                float e2 = zs4.e(oq5Var);
                vci vciVar = vci.a;
                yci c2 = d.c(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, e2, 7), 1.0f);
                kfh d2 = ug3.d(b2c.b, false);
                int i3 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, c2);
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
                boolean a2 = ((ya3) cb3Var2).a();
                boolean h2 = oq5Var.h(y93Var2);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar2) {
                    kjnVar = kjnVar2;
                    z3 = true;
                    z4 = false;
                    t93 t93Var = new t93(0, y93Var2, y93.class, "onBackClick", "onBackClick()V", 0, 0);
                    oq5Var.k0(t93Var);
                    K2 = t93Var;
                } else {
                    kjnVar = kjnVar2;
                    z3 = true;
                    z4 = false;
                }
                Function0 function0 = (Function0) ((h9f) K2);
                boolean h3 = oq5Var.h(y93Var2);
                Object K3 = oq5Var.K();
                if (h3 || K3 == kjnVar) {
                    t93 t93Var2 = new t93(0, y93Var2, y93.class, "onSearchClick", "onSearchClick()V", 0, 1);
                    oq5Var.k0(t93Var2);
                    K3 = t93Var2;
                }
                Function0 function02 = (Function0) ((h9f) K3);
                boolean h4 = oq5Var.h(y93Var2);
                Object K4 = oq5Var.K();
                if (h4 || K4 == kjnVar) {
                    t93 t93Var3 = new t93(0, y93Var2, y93.class, "onOverflowClick", "onOverflowClick()V", 0, 2);
                    oq5Var.k0(t93Var3);
                    K4 = t93Var3;
                }
                leu.d("", a2, O, function0, function02, (Function0) ((h9f) K4), d.d(vciVar, 1.0f), oq5Var, 1572870, 0);
                oq5Var = oq5Var;
                oq5Var.p(z3);
                oq5Var.p(z4);
            } else if (z7) {
                oq5Var.Z(860407204);
                boolean booleanValue = ((Boolean) gld.O(y93Var2.h, oq5Var).getValue()).booleanValue();
                boolean h5 = oq5Var.h(y93Var2);
                Object K5 = oq5Var.K();
                if (h5 || K5 == kjnVar2) {
                    cb3Var = cb3Var2;
                    z2 = false;
                    t93 t93Var4 = new t93(0, y93Var2, y93.class, "onRefresh", "onRefresh()V", 0, 3);
                    oq5Var.k0(t93Var4);
                    K5 = t93Var4;
                } else {
                    cb3Var = cb3Var2;
                    z2 = false;
                }
                y93Var2 = y93Var;
                bcx.j(booleanValue, (Function0) ((h9f) K5), ild.C(1054099207, new wl(cb3Var, y93Var2, O, aqiVar, 21), oq5Var), oq5Var, 384);
                oq5Var.p(z2);
            } else if (cb3Var2.equals(wa3.a)) {
                oq5Var.Z(862389995);
                q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(-86097807, new s93(y93Var2, tmbVar), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!(cb3Var2 instanceof bb3)) {
                    throw vz1.i(oq5Var, -1080646403, false);
                }
                oq5Var.Z(863487953);
                q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(-1743104048, new m32(8, cb3Var2, y93Var2), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s93(y93Var2, tmbVar, i);
        }
    }

    public static final void b0(Continuation continuation, a6 a6Var) {
        try {
            Continuation b2 = qxe.b(continuation);
            r7o r7oVar = z7o.b;
            w98.a(Unit.a, b2);
        } catch (Throwable th) {
            th = th;
            if (th instanceof t98) {
                th = ((t98) th).a;
            }
            r7o r7oVar2 = z7o.b;
            a6Var.resumeWith(qgg.J(th));
            throw th;
        }
    }

    public static final CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void c0(Function2 function2, a6 a6Var, a6 a6Var2) {
        try {
            Continuation b2 = qxe.b(qxe.a(a6Var, a6Var2, function2));
            r7o r7oVar = z7o.b;
            w98.a(Unit.a, b2);
        } catch (Throwable th) {
            th = th;
            if (th instanceof t98) {
                th = ((t98) th).a;
            }
            r7o r7oVar2 = z7o.b;
            a6Var2.resumeWith(qgg.J(th));
            throw th;
        }
    }

    public static final void d(zf4 zf4Var, bg5 bg5Var, yci yciVar, hq5 hq5Var, int i) {
        zf4 zf4Var2;
        int i2;
        kjn kjnVar;
        bg5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1508416396);
        int i3 = i | (oq5Var.f(zf4Var) ? 4 : 2) | (oq5Var.h(bg5Var) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            aqi M = gld.M(bg5Var.l(), oq5Var);
            aqi M2 = gld.M(bg5Var.c(), oq5Var);
            aqi M3 = gld.M(bg5Var.h(), oq5Var);
            if (bg5Var.k()) {
                zf4Var2 = zf4Var;
            } else {
                int i4 = zf4Var.a;
                kf4 kf4Var = zf4Var.b;
                String str = zf4Var.c;
                String str2 = zf4Var.d;
                boolean z = zf4Var.e;
                jzb jzbVar = zf4Var.f;
                String str3 = zf4Var.h;
                str.getClass();
                zf4Var2 = new zf4(i4, kf4Var, str, str2, z, jzbVar, false, str3);
            }
            rba rbaVar = (rba) M.getValue();
            lzs lzsVar = (lzs) M2.getValue();
            frs frsVar = (frs) M3.getValue();
            boolean j = bg5Var.j();
            boolean h2 = oq5Var.h(bg5Var);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h2 || K == kjnVar2) {
                i2 = i3;
                kjnVar = kjnVar2;
                ub4 ub4Var = new ub4(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 2);
                oq5Var.k0(ub4Var);
                K = ub4Var;
            } else {
                i2 = i3;
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(bg5Var);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                ub4 ub4Var2 = new ub4(0, bg5Var, bg5.class, "onLongClick", "onLongClick()V", 0, 3);
                oq5Var.k0(ub4Var2);
                K2 = ub4Var2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(bg5Var);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                ub4 ub4Var3 = new ub4(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 4);
                oq5Var.k0(ub4Var3);
                K3 = ub4Var3;
            }
            e(zf4Var2, rbaVar, lzsVar, frsVar, j, function0, function02, (Function0) ((h9f) K3), yciVar, oq5Var, (i2 << 18) & 234881024);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(zf4Var, bg5Var, yciVar, i, 16);
        }
    }

    public static final pce d0(co6 co6Var, Context context, int i, int i2, int i3) {
        co6Var.getClass();
        context.getClass();
        pce pceVar = new pce(context);
        pceVar.c = co6Var.a.getPathForSize(i);
        pceVar.c(i2);
        pceVar.v = Integer.valueOf(i3);
        pceVar.w = null;
        return pceVar;
    }

    public static final void e(zf4 zf4Var, rba rbaVar, lzs lzsVar, frs frsVar, boolean z, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        oq5 oq5Var;
        rbaVar.getClass();
        lzsVar.getClass();
        frsVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-999388130);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(zf4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.d(rbaVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.d(lzsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.d(frsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            function04 = function0;
            i2 |= oq5Var2.h(function04) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function04 = function0;
        }
        if ((1572864 & i) == 0) {
            function05 = function02;
            i2 |= oq5Var2.h(function05) ? 1048576 : 524288;
        } else {
            function05 = function02;
        }
        if ((12582912 & i) == 0) {
            function06 = function03;
            i2 |= oq5Var2.h(function06) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function06 = function03;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 67108864 : 33554432;
        }
        if (oq5Var2.P(i2 & 1, (38347923 & i2) != 38347922)) {
            int i3 = 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2);
            int i4 = i2 << 3;
            oq5Var = oq5Var2;
            t7g.c(new hg5(zf4Var.c, zf4Var.d, zf4Var.e, zf4Var.f, zf4Var.g), rbaVar, lzsVar, frsVar, z, nxq.b, function04, function05, function06, d.g(yciVar, zf4Var.d != null ? 60 : 52, 0.0f, 2), null, null, ild.C(-1686476398, new sh1(17, zf4Var, frsVar, lzsVar), oq5Var2), oq5Var, i3 | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024), 384, 3072);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mc(zf4Var, rbaVar, lzsVar, frsVar, z, function0, function02, function03, yciVar, i, 1);
        }
    }

    public static final eu7 e0(eu7 eu7Var) {
        return eu7Var.b.d ? eu7.a(eu7Var, null, new du7(0, 0), 1) : eu7Var;
    }

    public static final void f(String str, int i, kf4 kf4Var, lzs lzsVar, yci yciVar, boolean z, hq5 hq5Var, int i2) {
        lzsVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1505003056);
        int i3 = (oq5Var.f(str) ? 4 : 2) | i2 | (oq5Var.d(i) ? 32 : 16) | (oq5Var.d(kf4Var == null ? -1 : kf4Var.ordinal()) ? 256 : 128) | (oq5Var.d(lzsVar.ordinal()) ? 2048 : 1024) | 24576 | (oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            h(i, ild.C(548815026, new qt(z, str, lzsVar, 5), oq5Var), ild.C(1269773240, new u2(20, kf4Var), oq5Var), oq5Var, ((i3 >> 3) & 14) | 3504);
            yciVar = vci.a;
        } else {
            oq5Var.S();
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(str, i, kf4Var, lzsVar, yciVar2, z, i2);
        }
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void g(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(681111909);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.d(i) ? 32 : 16) | 384;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            h(i, ild.C(-1894776765, new xu0(3, z), oq5Var), jf0.a, oq5Var, ((i3 >> 3) & 14) | 3504);
            yciVar = vci.a;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, i, yciVar, i2);
        }
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, int i) {
        f0(byteArrayOutputStream, i, 2);
    }

    public static final void h(int i, wn5 wn5Var, wn5 wn5Var2, hq5 hq5Var, int i2) {
        int i3;
        wn5 wn5Var3;
        kb5 kb5Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2133719098);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var.f(vciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            hz2 hz2Var = b2c.l;
            float f2 = 12;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, f2, f2, 0.0f, f2, 4);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var4);
            }
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var, H, kb5Var5);
            yci a3 = a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 8, 0.0f, 11), "chart_info");
            ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                kb5Var = kb5Var4;
                ouj.x(i6, oq5Var, i6, kb5Var);
            } else {
                kb5Var = kb5Var4;
            }
            g0g.U(oq5Var, H2, kb5Var5);
            String valueOf = String.valueOf(i);
            long j = ((dq0) oq5Var.j(eq0.a)).b.a;
            ges j2 = nu0.j();
            yci r = d.r(vciVar, 28);
            gz2 gz2Var = b2c.o;
            wa5 wa5Var = wa5.a;
            kb5 kb5Var6 = kb5Var;
            int i7 = i3;
            xcs.b(valueOf, d.z(wa5Var.a(r, gz2Var), 1), j, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, j2, oq5Var, 0, 3072, 57336);
            oq5Var = oq5Var;
            wn5Var2.invoke(wa5Var, oq5Var, Integer.valueOf(((i7 >> 3) & 112) | 6));
            oq5Var.p(true);
            iz2 iz2Var = b2c.f;
            yci a5 = a.a(d.m(vciVar, 52), "track_cover");
            kfh d2 = ug3.d(iz2Var, false);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, a5);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var2);
            g0g.U(oq5Var, l3, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var6);
            }
            g0g.U(oq5Var, H3, kb5Var5);
            wn5Var3 = wn5Var;
            wn5Var3.invoke(b.a, oq5Var, Integer.valueOf((i7 & 112) | 6));
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            wn5Var3 = wn5Var;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new uf4(i, wn5Var3, wn5Var2, i2);
        }
    }

    public static final void i(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(79046387);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.g(z) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
            zyj zyjVar = zyj.b;
            rba rbaVar = rba.a;
            lzs lzsVar = lzs.a;
            nxq nxqVar = nxq.b;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new uf3(20);
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new uf3(21);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            yciVar2 = vci.a;
            qgg.l(zyjVar, rbaVar, lzsVar, false, true, function0, null, (Function0) K2, ild.C(-905439571, new vf4(i, 0, z, false), oq5Var2), ild.C(-761029876, new sm(11, z), oq5Var2), yciVar2, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 920350134, ((i4 >> 6) & 14) | 48, 0, 2093056);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n10(i, z, yciVar2, i2);
        }
    }

    public static final void j(ew5 ew5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-331883405);
        if (((i | (oq5Var.h(ew5Var) ? 4 : 2)) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lx0 lx0Var = qx0.e;
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            ta5 a2 = sa5.a(lx0Var, gz2Var, oq5Var, 54);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String M = rvf.M(R.string.concert_tab_buy_ticket, oq5Var);
            ges j = nu0.j();
            agr agrVar = eq0.a;
            xcs.b(M, null, ((dq0) oq5Var.j(agrVar)).b.e, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, oq5Var, 0, 3120, 55290);
            u1g.l(oq5Var, d.e(vciVar, mu0.a));
            xcs.b(ew5Var.f, null, d85.b(((dq0) oq5Var.j(agrVar)).b.e, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 0, 3120, 55290);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(ew5Var, i, 10);
        }
    }

    public static final void k(int i, hq5 hq5Var, yci yciVar, String str, String str2) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1787447542);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(str2) ? 32 : 16) | 384;
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            vci vciVar = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 0.0f, 0.0f, 8, 7);
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new cb(str, str2, 2);
                oq5Var2.k0(K);
            }
            yci a2 = nfp.a(q, (Function1) K);
            nho a3 = lho.a(qx0.a, b2c.k, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            ges j = nu0.j();
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var2.j(agrVar)).b.b;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.b(str, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), j2, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, j, oq5Var2, i3, 3072, 57336);
            ges j3 = nu0.j();
            long j4 = ((dq0) oq5Var2.j(agrVar)).b.a;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.b(str2, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), j4, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, j3, oq5Var2, (i2 >> 3) & 14, 3072, 57336);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cw5(str, str2, yciVar2, i, 0);
        }
    }

    public static final void l(ew5 ew5Var, Function0 function0, boolean z, yci yciVar, fvf fvfVar, hq5 hq5Var, int i) {
        yci yciVar2;
        yci yciVar3;
        ew5 ew5Var2 = ew5Var;
        boolean z2 = z;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-575314877);
        int i2 = i | (oq5Var.h(ew5Var2) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128) | 3072 | (oq5Var.f(fvfVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
        } else {
            oq5Var.U();
            int i3 = i & 1;
            vci vciVar = vci.a;
            if (i3 == 0 || oq5Var.y()) {
                yciVar2 = vciVar;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
            }
            oq5Var.q();
            ges j = nu0.j();
            ges i4 = nu0.i();
            int i5 = i2 >> 9;
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f2 = 16;
            q0k c2 = androidx.compose.foundation.layout.a.c(f2, 0.0f, f2, irv.e(oq5Var) + 128, 2);
            yci d3 = d.d(vciVar, 1.0f);
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4 || oq5Var.h(ew5Var2));
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new bw5(z2, ew5Var2);
                oq5Var.k0(K);
            }
            weo.g(d3, fvfVar, c2, null, null, null, false, (Function1) K, oq5Var, (i5 & 112) | 6, 248);
            float f3 = 32;
            yci u = d.u(b.a.a(androidx.compose.foundation.layout.a.p(d.d(vciVar, 1.0f), f3, f2, f3, irv.e(oq5Var) + f2), b2c.i), b2c.m, true);
            ew5Var2 = ew5Var;
            z2 = z;
            hdg.n(((i2 >> 3) & 14) | 384, 0, ild.C(-196095494, new pu(z2, ew5Var2, j, i4), oq5Var), oq5Var, u, function0);
            oq5Var.p(true);
            yciVar3 = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(ew5Var2, function0, z2, yciVar3, fvfVar, i);
        }
    }

    public static final void m(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1068570002);
        int i2 = (oq5Var.g(true) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            leu.o(androidx.compose.foundation.layout.a.o(yciVar, 16, 0.0f, 2), oq5Var, i2 & 14);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    public static final void n(eha ehaVar, int i, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        boolean z;
        oq5 oq5Var2;
        boolean z2;
        ehaVar.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1305551270);
        int i3 = (oq5Var3.h(ehaVar) ? 4 : 2) | i2 | (oq5Var3.d(i) ? 32 : 16);
        if (oq5Var3.P(i3 & 1, (i3 & 19) != 18)) {
            kha khaVar = (kha) szf.Q(ehaVar.e, oq5Var3).getValue();
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var3);
                oq5Var3.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            fvf a2 = hvf.a(0, 0, oq5Var3, 0, 3);
            fvf a3 = hvf.a(0, 0, oq5Var3, 0, 3);
            Object K2 = oq5Var3.K();
            if (K2 == kjnVar) {
                K2 = k5r.h(i, oq5Var3);
            }
            u6k u6kVar = (u6k) K2;
            List h2 = u75.h(a2, a3);
            u6kVar.getClass();
            h2.getClass();
            boolean f2 = oq5Var3.f(h2);
            Object K3 = oq5Var3.K();
            if (f2 || K3 == kjnVar) {
                K3 = new u2s(u6kVar, h2);
                oq5Var3.k0(K3);
            }
            ek B = yd5.B((u2s) K3, oq5Var3);
            wxi L = zc4.L(B, false, oq5Var3, 2);
            vci vciVar = vci.a;
            yci a4 = androidx.compose.ui.input.nestedscroll.a.a(vciVar, L, null);
            ta5 a5 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
            int i4 = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, a4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a5, wp5.f);
            g0g.U(oq5Var3, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var3, i4, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            yd5.b(B, rvf.M(R.string.downloaded_playlists, oq5Var3), mp0.a(oq5Var3), a.a(vciVar, "collection_downloaded_toolbar"), ild.C(1641464823, new tt5(11, ehaVar), oq5Var3), ild.C(848949054, new kv4(29, ehaVar), oq5Var3), 0L, oq5Var3, 224256, 64);
            if (khaVar instanceof jha) {
                oq5Var3.Z(69171170);
                List list = ((jha) khaVar).a;
                boolean f3 = oq5Var3.f(list);
                Object K4 = oq5Var3.K();
                if (f3 || K4 == kjnVar) {
                    z2 = 0;
                    K4 = new zga(list, z2);
                    oq5Var3.k0(K4);
                } else {
                    z2 = 0;
                }
                int i5 = 2;
                fp7 b2 = r3k.b(i, (Function0) K4, oq5Var3, (i3 >> 3) & 14, 2);
                boolean f4 = oq5Var3.f(b2);
                Object K5 = oq5Var3.K();
                if (f4 || K5 == kjnVar) {
                    K5 = new s25(b2, i5);
                    oq5Var3.k0(K5);
                }
                eno s0 = szf.s0((Function0) K5);
                boolean h3 = oq5Var3.h(ehaVar) | oq5Var3.f(list);
                Object K6 = oq5Var3.K();
                if (h3 || K6 == kjnVar) {
                    K6 = new tl0(13, u6kVar, ehaVar, list);
                    oq5Var3.k0(K6);
                }
                ox6.B(s0, mm6Var, (rjc) K6);
                oq5 oq5Var4 = oq5Var3;
                z = true;
                bow.i(b2, mm6Var, a2, a3, list, ehaVar, oq5Var4, 458752 & (i3 << 15));
                oq5Var4.p(z2);
                oq5Var2 = oq5Var4;
            } else {
                oq5 oq5Var5 = oq5Var3;
                z = true;
                if (Intrinsics.d(khaVar, iha.b)) {
                    oq5Var5.Z(69986191);
                    oq5Var5.p(false);
                    oq5Var2 = oq5Var5;
                } else {
                    if (!Intrinsics.d(khaVar, iha.a)) {
                        throw vz1.i(oq5Var5, 2229422, false);
                    }
                    oq5Var5.Z(2259947);
                    fgq.n(48, oq5Var5, d.c(vciVar, 1.0f), rvf.M(R.string.downloaded_playlists_empty, oq5Var5));
                    oq5Var5.p(false);
                    oq5Var2 = oq5Var5;
                }
            }
            oq5Var2.p(z);
            oq5Var = oq5Var2;
        } else {
            oq5Var3.S();
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(ehaVar, i, i2, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(q0d q0dVar, d1d d1dVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        xmn r;
        q0dVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(989723931);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(q0dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(d1dVar) : oq5Var2.h(d1dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
        } else {
            a1d a1dVar = (a1d) szf.Q(q0dVar.getState(), oq5Var2).getValue();
            if (Intrinsics.d(a1dVar, x0d.a)) {
                oq5Var2.Z(1936932267);
                u1g.l(oq5Var2, yciVar);
                oq5Var2.p(false);
            } else {
                if (!Intrinsics.d(a1dVar, y0d.a)) {
                    if (!(a1dVar instanceof z0d)) {
                        throw vz1.i(oq5Var2, 1936929939, false);
                    }
                    oq5Var2.Z(1936935854);
                    z0d z0dVar = (z0d) a1dVar;
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = vz1.h(oq5Var2);
                    }
                    uoi uoiVar = (uoi) K;
                    boolean h2 = oq5Var2.h(a1dVar) | oq5Var2.h(q0dVar);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new zya(6, q0dVar, z0dVar);
                        oq5Var2.k0(K2);
                    }
                    oq5Var = oq5Var2;
                    q(z0dVar, q0dVar, d1dVar, androidx.compose.foundation.a.d(yciVar, uoiVar, null, false, null, null, (Function0) K2, 28), oq5Var, (i2 << 3) & 1008);
                    oq5Var.p(false);
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new yja(q0dVar, d1dVar, yciVar, i, 6);
                        return;
                    }
                    return;
                }
                oq5Var2.Z(1936933835);
                u1g.l(oq5Var2, yciVar);
                oq5Var2.p(false);
            }
        }
        oq5Var = oq5Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void p(j0d j0dVar, hs1 hs1Var, boolean z, jd6 jd6Var, fuw fuwVar, yci yciVar, hq5 hq5Var, int i) {
        Function1 function1;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1692556796);
        int i2 = i | (oq5Var2.f(j0dVar) ? 4 : 2) | (oq5Var2.f(hs1Var) ? 32 : 16) | (oq5Var2.g(z) ? 256 : 128) | (oq5Var2.f(jd6Var) ? 2048 : 1024) | (oq5Var2.f(fuwVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if ((74899 & i2) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            vci vciVar = vci.a;
            yci a2 = a.a(vciVar, "gallery_photo");
            o0d o0dVar = j0dVar.a;
            String str = o0dVar.b;
            String str2 = o0dVar.a;
            if (z) {
                oq5Var2.Z(-42906359);
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = h01.j;
                    oq5Var2.k0(K);
                }
                function1 = (Function1) K;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(-42848606);
                oq5Var2.p(false);
                function1 = null;
            }
            oq5Var = oq5Var2;
            i4w.j(str, str2, hs1Var, jd6Var, fuwVar, a2, function1, null, oq5Var, ((i2 << 3) & 896) | (i2 & 7168) | (i2 & 57344), 128);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(i, 1, j0dVar, hs1Var, jd6Var, fuwVar, yciVar2, z);
        }
    }

    public static final void q(z0d z0dVar, q0d q0dVar, d1d d1dVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1826672119);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(z0dVar) : oq5Var2.h(z0dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(q0dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(d1dVar) : oq5Var2.h(d1dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int i3 = z0dVar.a;
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && oq5Var2.h(z0dVar));
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z || K == obj) {
                K = new ita(21, z0dVar);
                oq5Var2.k0(K);
            }
            fp7 b2 = r3k.b(i3, (Function0) K, oq5Var2, 0, 2);
            Object J = up6.J(oq5Var2);
            dib h2 = q0dVar.h();
            boolean h3 = oq5Var2.h(q0dVar) | oq5Var2.f(J);
            Object K2 = oq5Var2.K();
            Continuation continuation = null;
            if (h3 || K2 == obj) {
                K2 = new fzb(q0dVar, J, continuation, 14);
                oq5Var2.k0(K2);
            }
            gld.w(oq5Var2, h2, (Function2) K2);
            Integer valueOf = Integer.valueOf(z0dVar.c);
            boolean f2 = oq5Var2.f(b2) | (i4 == 4 || ((i2 & 8) != 0 && oq5Var2.h(z0dVar)));
            Object K3 = oq5Var2.K();
            if (f2 || K3 == obj) {
                K3 = new fzb(b2, z0dVar, continuation, 15);
                oq5Var2.k0(K3);
            }
            gld.w(oq5Var2, valueOf, (Function2) K3);
            Integer valueOf2 = Integer.valueOf(b2.j());
            boolean h4 = oq5Var2.h(q0dVar) | oq5Var2.f(b2);
            Object K4 = oq5Var2.K();
            if (h4 || K4 == obj) {
                K4 = new m0d(q0dVar, b2, continuation, 0);
                oq5Var2.k0(K4);
            }
            gld.w(oq5Var2, valueOf2, (Function2) K4);
            Integer valueOf3 = Integer.valueOf(b2.q());
            boolean h5 = oq5Var2.h(q0dVar) | oq5Var2.f(b2);
            Object K5 = oq5Var2.K();
            if (h5 || K5 == obj) {
                K5 = new m0d(q0dVar, b2, continuation, 1);
                oq5Var2.k0(K5);
            }
            gld.w(oq5Var2, valueOf3, (Function2) K5);
            Unit unit = Unit.a;
            boolean f3 = oq5Var2.f(b2) | oq5Var2.h(q0dVar);
            Object K6 = oq5Var2.K();
            if (f3 || K6 == obj) {
                K6 = new fzb(b2, q0dVar, continuation, 16);
                oq5Var2.k0(K6);
            }
            gld.w(oq5Var2, unit, (Function2) K6);
            yci a2 = a.a(yciVar, "gallery");
            boolean z2 = z0dVar.f;
            Object K7 = oq5Var2.K();
            if (K7 == obj) {
                K7 = new uv1(15);
                oq5Var2.k0(K7);
            }
            oq5Var = oq5Var2;
            rvf.b(b2, a2, null, null, 5, 0.0f, null, null, z2, (Function1) K7, null, null, ild.C(1252741803, new k71(z0dVar, d1dVar, b2, J, q0dVar, 4), oq5Var2), oq5Var, 24576, 3078, 6892);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 6, z0dVar, q0dVar, d1dVar, yciVar);
        }
    }

    public static final void r(k0d k0dVar, Function1 function1, jd6 jd6Var, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1545644329);
        int i2 = i | (oq5Var.f(k0dVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.f(jd6Var) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            aqi B = t7g.B(k0dVar.a, true, (Function0) oq5Var.j(xpg.a), null, null, oq5Var, 48, 24);
            boolean f2 = oq5Var.f((pbu) B.getValue());
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f2 || K == kjnVar) {
                K = Boolean.valueOf(((pbu) B.getValue()) instanceof obu);
                oq5Var.k0(K);
            }
            ((Boolean) K).getClass();
            pbu pbuVar = (pbu) B.getValue();
            boolean f3 = ((i2 & 112) == 32) | oq5Var.f(B);
            Object K2 = oq5Var.K();
            if (f3 || K2 == kjnVar) {
                K2 = new n0d(function1, B, null, 0);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, pbuVar, (Function2) K2);
            boolean z2 = ((pbu) B.getValue()) instanceof obu;
            vci vciVar = vci.a;
            ycu.a((pbu) B.getValue(), ild.C(1586936823, new oc1(k0dVar, jd6Var, z, 9), oq5Var), jd6Var, z, com.yandex.music.core.ui.compose.b.c(a.a(vciVar, "gallery_video"), "video_loaded", Boolean.valueOf(z2)), oq5Var, (i2 & 896) | 48 | (i2 & 7168));
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(k0dVar, function1, jd6Var, z, yciVar2, i, 7);
        }
    }

    public static final ome s(t9f t9fVar, String str) {
        return new ome(str, new pme(t9fVar));
    }

    public static final void t(Function0 function0, yci yciVar, euf eufVar, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2002163445);
        int i4 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (oq5Var.f(eufVar) ? 256 : 128);
        }
        int i6 = i3 | (oq5Var.h(function2) ? 2048 : 1024);
        if (oq5Var.P(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                eufVar = null;
            }
            rvf.d(ild.C(-1488997347, new c(eufVar, yciVar, function2, szf.o0(function0, oq5Var)), oq5Var), oq5Var, 6);
        } else {
            oq5Var.S();
        }
        euf eufVar2 = eufVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new un5(function0, yciVar, eufVar2, function2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(final boolean z, yci yciVar, boolean z2, boolean z3, hq5 hq5Var, final int i, final int i2) {
        int i3;
        final boolean z4;
        int i4;
        boolean z5;
        oq5 oq5Var;
        final boolean z6;
        final boolean z7;
        final yci yciVar2;
        xmn r;
        boolean z8;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-702091310);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 = i3 | 432;
        } else if ((i & 384) == 0) {
            z4 = z2;
            i5 |= oq5Var2.g(z4) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i5 |= 3072;
            } else if ((i & 3072) == 0) {
                z5 = z3;
                i5 |= oq5Var2.g(z5) ? 2048 : 1024;
                if (oq5Var2.P(i5 & 1, (i5 & 1171) != 1170)) {
                    if (i6 != 0) {
                        z4 = true;
                    }
                    final boolean z9 = i4 != 0 ? true : z5;
                    kfh d2 = ug3.d(b2c.b, false);
                    int i7 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l = oq5Var2.l();
                    vci vciVar = vci.a;
                    yci H = vnj.H(oq5Var2, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, d2, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var2, i7, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    zyj zyjVar = z9 ? zyj.a : zyj.b;
                    rba rbaVar = rba.a;
                    zyj zyjVar2 = zyjVar;
                    lzs lzsVar = lzs.a;
                    nxq nxqVar = nxq.b;
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = new uf3(19);
                        oq5Var2.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        K2 = new uf3(22);
                        oq5Var2.k0(K2);
                    }
                    boolean z10 = z9;
                    qgg.l(zyjVar2, rbaVar, lzsVar, false, true, function0, null, (Function0) K2, ild.C(1894366226, new Function2() { // from class: wf4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                float f2 = z9 ? 16 : 8;
                                float f3 = 12;
                                vci vciVar2 = vci.a;
                                yci q = androidx.compose.foundation.layout.a.q(vciVar2, f2, f3, 0.0f, f3, 4);
                                nho a2 = lho.a(qx0.a, b2c.k, oq5Var3, 0);
                                int i8 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                                yci H2 = vnj.H(oq5Var3, q);
                                xp5.T.getClass();
                                grb grbVar2 = wp5.b;
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar2);
                                } else {
                                    oq5Var3.n0();
                                }
                                g0g.U(oq5Var3, a2, wp5.f);
                                g0g.U(oq5Var3, l2, wp5.e);
                                kb5 kb5Var2 = wp5.g;
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                                    ouj.x(i8, oq5Var3, i8, kb5Var2);
                                }
                                g0g.U(oq5Var3, H2, wp5.d);
                                if (z4) {
                                    oq5Var3.Z(760097277);
                                    vz1.B(vciVar2, 8, oq5Var3, false);
                                } else {
                                    oq5Var3.Z(2080924396);
                                    oq5Var3.p(false);
                                }
                                ivf.k(0, 0, oq5Var3, a.a(xp3.u(d.m(vciVar2, 52), irf.R(qo6.a, oq5Var3)), "track_cover"), z);
                                oq5Var3.p(true);
                            } else {
                                oq5Var3.S();
                            }
                            return Unit.a;
                        }
                    }, oq5Var2), ild.C(-1115538541, new sm(12, z), oq5Var2), null, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var2, 920350128, 48, 0, 2094080);
                    oq5Var = oq5Var2;
                    if (z10) {
                        oq5Var.Z(-1459417853);
                        z8 = false;
                        ivf.k(i5 & 14, 0, oq5Var, xp3.u(d.m(androidx.compose.foundation.layout.a.k(b.a.a(vciVar, b2c.g), 35, 0.0f, 2), 52), irf.R(qo6.a, oq5Var)), z);
                    } else {
                        z8 = false;
                        oq5Var.Z(-1467781994);
                    }
                    oq5Var.p(z8);
                    oq5Var.p(true);
                    z6 = z4;
                    z7 = z10;
                    yciVar2 = vciVar;
                } else {
                    oq5Var = oq5Var2;
                    oq5Var.S();
                    z6 = z4;
                    z7 = z5;
                    yciVar2 = yciVar;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new Function2() { // from class: xf4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n7w.u(z, yciVar2, z6, z7, (hq5) obj, rvf.R(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z3;
            if (oq5Var2.P(i5 & 1, (i5 & 1171) != 1170)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z4 = z2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z5 = z3;
        if (oq5Var2.P(i5 & 1, (i5 & 1171) != 1170)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void v(l0d l0dVar, int i, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1903821971);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(l0dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(i) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci b2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.d(d.d(vci.a, 1.0f), 1.0f), d85.b(d85.g, 0.7f, 0.0f, 0.0f, 0.0f, 14), vnj.i);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xcs.b("Item: " + l0dVar + ", Page: " + i, null, 0L, v7g.z(32), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var, 3072, 0, 131062);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cv5(l0dVar, i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(String str, ges gesVar, Map map, yci yciVar, int i, int i2, hq5 hq5Var, int i3, int i4) {
        int i5;
        yci yciVar2;
        int i6;
        int i7;
        int i8;
        yci yciVar3;
        int i9;
        int i10;
        boolean f2;
        Object K;
        yci yciVar4;
        int i11;
        xmn r;
        int i12;
        str.getClass();
        map.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2136907299);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.f(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var.f(gesVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var.f(map) ? 256 : 128;
        }
        int i13 = i4 & 8;
        if (i13 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            if ((i3 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    i6 = i;
                    if (oq5Var.d(i6)) {
                        i12 = 16384;
                        i5 |= i12;
                    }
                } else {
                    i6 = i;
                }
                i12 = RemoteCameraConfig.Notification.ID;
                i5 |= i12;
            } else {
                i6 = i;
            }
            i7 = i4 & 32;
            if (i7 == 0) {
                i5 |= 196608;
            } else if ((196608 & i3) == 0) {
                i8 = i2;
                i5 |= oq5Var.d(i8) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                if ((74899 & i5) == 74898 || !oq5Var.z()) {
                    oq5Var.U();
                    if ((i3 & 1) != 0 || oq5Var.y()) {
                        yciVar3 = i13 != 0 ? vci.a : yciVar2;
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            i9 = 2;
                            i10 = i6;
                            oq5Var.q();
                            Function0 function0 = (Function0) oq5Var.j(zlu.d);
                            f2 = oq5Var.f(function0);
                            K = oq5Var.K();
                            if (!f2 || K == gq5.a) {
                                K = new l92(0, function0);
                                oq5Var.k0(K);
                            }
                            int i14 = i5 & 1022;
                            int i15 = i5 << 3;
                            yci yciVar5 = yciVar3;
                            y(str, gesVar, map, (Function0) K, yciVar5, i10, i9, oq5Var, i14 | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 0);
                            yciVar4 = yciVar5;
                            i11 = i10;
                            i8 = i9;
                        }
                    } else {
                        oq5Var.S();
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                        }
                        yciVar3 = yciVar2;
                    }
                    i10 = i6;
                    i9 = i8;
                    oq5Var.q();
                    Function0 function02 = (Function0) oq5Var.j(zlu.d);
                    f2 = oq5Var.f(function02);
                    K = oq5Var.K();
                    if (!f2) {
                    }
                    K = new l92(0, function02);
                    oq5Var.k0(K);
                    int i142 = i5 & 1022;
                    int i152 = i5 << 3;
                    yci yciVar52 = yciVar3;
                    y(str, gesVar, map, (Function0) K, yciVar52, i10, i9, oq5Var, i142 | (57344 & i152) | (458752 & i152) | (i152 & 3670016), 0);
                    yciVar4 = yciVar52;
                    i11 = i10;
                    i8 = i9;
                } else {
                    oq5Var.S();
                    i11 = i6;
                    yciVar4 = yciVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new i92(str, gesVar, map, yciVar4, i11, i8, i3, i4);
                    return;
                }
                return;
            }
            i8 = i2;
            if ((74899 & i5) == 74898) {
            }
            oq5Var.U();
            if ((i3 & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if ((i4 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            i10 = i6;
            i9 = i8;
            oq5Var.q();
            Function0 function022 = (Function0) oq5Var.j(zlu.d);
            f2 = oq5Var.f(function022);
            K = oq5Var.K();
            if (!f2) {
            }
            K = new l92(0, function022);
            oq5Var.k0(K);
            int i1422 = i5 & 1022;
            int i1522 = i5 << 3;
            yci yciVar522 = yciVar3;
            y(str, gesVar, map, (Function0) K, yciVar522, i10, i9, oq5Var, i1422 | (57344 & i1522) | (458752 & i1522) | (i1522 & 3670016), 0);
            yciVar4 = yciVar522;
            i11 = i10;
            i8 = i9;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i3 & 24576) != 0) {
        }
        i7 = i4 & 32;
        if (i7 == 0) {
        }
        i8 = i2;
        if ((74899 & i5) == 74898) {
        }
        oq5Var.U();
        if ((i3 & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        i10 = i6;
        i9 = i8;
        oq5Var.q();
        Function0 function0222 = (Function0) oq5Var.j(zlu.d);
        f2 = oq5Var.f(function0222);
        K = oq5Var.K();
        if (!f2) {
        }
        K = new l92(0, function0222);
        oq5Var.k0(K);
        int i14222 = i5 & 1022;
        int i15222 = i5 << 3;
        yci yciVar5222 = yciVar3;
        y(str, gesVar, map, (Function0) K, yciVar5222, i10, i9, oq5Var, i14222 | (57344 & i15222) | (458752 & i15222) | (i15222 & 3670016), 0);
        yciVar4 = yciVar5222;
        i11 = i10;
        i8 = i9;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void x(String str, ges gesVar, fds fdsVar, yci yciVar, int i, int i2, hq5 hq5Var, int i3) {
        int i4;
        int i5;
        int i6;
        yci yciVar2;
        int i7;
        yci yciVar3;
        int i8;
        int i9;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1446004635);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.f(gesVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.f(fdsVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.d(4) ? 2048 : 1024;
        }
        int i10 = i4 | 24576;
        if ((196608 & i3) == 0) {
            i10 = 90112 | i4;
        }
        int i11 = 1572864 | i10;
        if ((599187 & i11) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
            i8 = i;
            i9 = i2;
        } else {
            oq5Var.U();
            if ((i3 & 1) == 0 || oq5Var.y()) {
                i5 = i11 & (-458753);
                i6 = 2;
                yciVar2 = vci.a;
                i7 = 3;
            } else {
                oq5Var.S();
                i5 = i11 & (-458753);
                yciVar2 = yciVar;
                i7 = i;
                i6 = i2;
            }
            oq5Var.q();
            ArrayList arrayList = new ArrayList(4);
            int i12 = 0;
            while (i12 < 4) {
                i12++;
                arrayList.add(new Pair(Integer.valueOf(i12), fdsVar));
            }
            int i13 = i5 & 126;
            int i14 = i5 >> 3;
            w(str, gesVar, uah.n(arrayList), yciVar2, i7, i6, oq5Var, i13 | (i14 & 7168) | (i14 & 458752), 0);
            yciVar3 = yciVar2;
            i8 = i7;
            i9 = i6;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xj(str, gesVar, fdsVar, yciVar3, i8, i9, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(final String str, final ges gesVar, final Map map, final Function0 function0, final yci yciVar, int i, int i2, hq5 hq5Var, final int i3, final int i4) {
        int i5;
        final Function0 function02;
        final int i6;
        int i7;
        oq5 oq5Var;
        final int i8;
        xmn r;
        int i9;
        str.getClass();
        map.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1589203945);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var2.f(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var2.f(gesVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var2.f(map) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            function02 = function0;
            i5 |= oq5Var2.h(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i3 & 24576) == 0) {
            i5 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            if ((i4 & 32) == 0) {
                i6 = i;
                if (oq5Var2.d(i6)) {
                    i9 = SQLiteDatabase.OPEN_SHAREDCACHE;
                    i5 |= i9;
                }
            } else {
                i6 = i;
            }
            i9 = SQLiteDatabase.OPEN_FULLMUTEX;
            i5 |= i9;
        } else {
            i6 = i;
        }
        int i10 = i4 & 64;
        if (i10 != 0) {
            i5 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i3) == 0) {
            i7 = i2;
            i5 |= oq5Var2.d(i7) ? 1048576 : 524288;
            if ((i5 & 599187) == 599186 || !oq5Var2.z()) {
                oq5Var2.U();
                if ((i3 & 1) != 0 || oq5Var2.y()) {
                    if ((i4 & 32) != 0) {
                        i6 = 3;
                    }
                    if (i10 != 0) {
                        i7 = 2;
                    }
                } else {
                    oq5Var2.S();
                }
                oq5Var2.q();
                yci D = ksw.D(yciVar, str, null);
                final int i11 = i6;
                final int i12 = i7;
                wn5 C = ild.C(-687835309, new pyc() { // from class: j92
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        String str2;
                        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        jx7 jx7Var = (jx7) oq5Var4.j(es5.h);
                        ppc ppcVar = (ppc) oq5Var4.j(es5.k);
                        ids O = o5g.O(0, 1, oq5Var4);
                        long j = cVar.b;
                        int i13 = ga6.i(j);
                        int h2 = ga6.h(j);
                        String str3 = str;
                        boolean d2 = oq5Var4.d(i13) | oq5Var4.f(str3) | oq5Var4.d(h2);
                        Map map2 = map;
                        boolean f2 = d2 | oq5Var4.f(map2);
                        Object K = oq5Var4.K();
                        ges gesVar2 = gesVar;
                        kjn kjnVar = gq5.a;
                        if (f2 || K == kjnVar) {
                            str2 = str3;
                            as3 B = n7w.B(str2, gesVar2, ga6.i(j), ga6.d(j) ? ga6.h(j) : Integer.MAX_VALUE, map2, jx7Var, ppcVar);
                            gesVar2 = gesVar2;
                            oq5Var4.k0(B);
                            K = B;
                        } else {
                            str2 = str3;
                        }
                        as3 as3Var = (as3) K;
                        ges b2 = ges.b(gesVar2, 0L, as3Var.a, null, null, 0L, i11, v7g.D(as3Var.c, 8589934592L), null, null, u5g.b, 1, 10321917);
                        boolean f3 = oq5Var4.f(as3Var) | oq5Var4.f(str2) | oq5Var4.e(j);
                        Object K2 = oq5Var4.K();
                        if (f3 || K2 == kjnVar) {
                            K2 = ids.a(O, str2, b2, i12, false, as3Var.b, cVar.b, 968);
                            oq5Var4.k0(K2);
                        }
                        cds cdsVar = (cds) K2;
                        int i14 = cdsVar.b.f;
                        float f4 = -1.0f;
                        for (int i15 = 0; i15 < i14; i15++) {
                            f4 = Math.max(f4, cdsVar.d(i15) - cdsVar.b.g(i15));
                        }
                        int ceil = (int) Math.ceil(f4);
                        agr agrVar = es5.h;
                        yci o = d.o(vci.a, ((jx7) oq5Var4.j(agrVar)).c0(ceil), ((jx7) oq5Var4.j(agrVar)).c0((int) (cdsVar.c & 4294967295L)));
                        boolean h3 = oq5Var4.h(cdsVar) | oq5Var4.d(ceil);
                        Function0 function03 = function02;
                        boolean f5 = h3 | oq5Var4.f(function03);
                        Object K3 = oq5Var4.K();
                        if (f5 || K3 == kjnVar) {
                            K3 = new v50(cdsVar, ceil, function03, 2);
                            oq5Var4.k0(K3);
                        }
                        ksw.j(0, oq5Var4, o, (Function1) K3);
                        return Unit.a;
                    }
                }, oq5Var2);
                oq5Var = oq5Var2;
                bg3.a(D, null, false, C, oq5Var, 3072, 6);
                i6 = i11;
                i8 = i12;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                i8 = i7;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: k92
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n7w.y(str, gesVar, map, function0, yciVar, i6, i8, (hq5) obj, rvf.R(i3 | 1), i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i7 = i2;
        if ((i5 & 599187) == 599186) {
        }
        oq5Var2.U();
        if ((i3 & 1) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if (i10 != 0) {
        }
        oq5Var2.q();
        yci D2 = ksw.D(yciVar, str, null);
        final int i112 = i6;
        final int i122 = i7;
        wn5 C2 = ild.C(-687835309, new pyc() { // from class: j92
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String str2;
                androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                jx7 jx7Var = (jx7) oq5Var4.j(es5.h);
                ppc ppcVar = (ppc) oq5Var4.j(es5.k);
                ids O = o5g.O(0, 1, oq5Var4);
                long j = cVar.b;
                int i13 = ga6.i(j);
                int h2 = ga6.h(j);
                String str3 = str;
                boolean d2 = oq5Var4.d(i13) | oq5Var4.f(str3) | oq5Var4.d(h2);
                Map map2 = map;
                boolean f2 = d2 | oq5Var4.f(map2);
                Object K = oq5Var4.K();
                ges gesVar2 = gesVar;
                kjn kjnVar = gq5.a;
                if (f2 || K == kjnVar) {
                    str2 = str3;
                    as3 B = n7w.B(str2, gesVar2, ga6.i(j), ga6.d(j) ? ga6.h(j) : Integer.MAX_VALUE, map2, jx7Var, ppcVar);
                    gesVar2 = gesVar2;
                    oq5Var4.k0(B);
                    K = B;
                } else {
                    str2 = str3;
                }
                as3 as3Var = (as3) K;
                ges b2 = ges.b(gesVar2, 0L, as3Var.a, null, null, 0L, i112, v7g.D(as3Var.c, 8589934592L), null, null, u5g.b, 1, 10321917);
                boolean f3 = oq5Var4.f(as3Var) | oq5Var4.f(str2) | oq5Var4.e(j);
                Object K2 = oq5Var4.K();
                if (f3 || K2 == kjnVar) {
                    K2 = ids.a(O, str2, b2, i122, false, as3Var.b, cVar.b, 968);
                    oq5Var4.k0(K2);
                }
                cds cdsVar = (cds) K2;
                int i14 = cdsVar.b.f;
                float f4 = -1.0f;
                for (int i15 = 0; i15 < i14; i15++) {
                    f4 = Math.max(f4, cdsVar.d(i15) - cdsVar.b.g(i15));
                }
                int ceil = (int) Math.ceil(f4);
                agr agrVar = es5.h;
                yci o = d.o(vci.a, ((jx7) oq5Var4.j(agrVar)).c0(ceil), ((jx7) oq5Var4.j(agrVar)).c0((int) (cdsVar.c & 4294967295L)));
                boolean h3 = oq5Var4.h(cdsVar) | oq5Var4.d(ceil);
                Function0 function03 = function02;
                boolean f5 = h3 | oq5Var4.f(function03);
                Object K3 = oq5Var4.K();
                if (f5 || K3 == kjnVar) {
                    K3 = new v50(cdsVar, ceil, function03, 2);
                    oq5Var4.k0(K3);
                }
                ksw.j(0, oq5Var4, o, (Function1) K3);
                return Unit.a;
            }
        }, oq5Var2);
        oq5Var = oq5Var2;
        bg3.a(D2, null, false, C2, oq5Var, 3072, 6);
        i6 = i112;
        i8 = i122;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final eu7 z(eu7 eu7Var, int i) {
        eu7Var.getClass();
        du7 du7Var = eu7Var.b;
        int e2 = yhn.e(i, new IntRange(du7Var.a, eu7Var.a.a.getElements().size(), 1));
        return e2 == du7Var.b ? eu7Var : eu7.a(eu7Var, null, du7.a(du7Var, e2), 1);
    }

    public abstract fvo M();

    public void S() {
        T();
    }

    public void T() {
        U(null);
    }

    public abstract void U(Throwable th);

    public abstract void W(p9 p9Var);

    public abstract void X(qq3 qq3Var);

    public void V() {
    }
}
