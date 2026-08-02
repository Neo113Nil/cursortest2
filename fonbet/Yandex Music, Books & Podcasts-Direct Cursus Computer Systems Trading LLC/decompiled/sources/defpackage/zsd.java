package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Base64;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.core.app.q;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.ActionButtonDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.video.m3.player.b;

/* loaded from: classes.dex */
public abstract class zsd {
    public static final qee h;
    public static final x2i i;
    public static final rre j;
    public static final String[] a = {"MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK", "MIIEqDCCA5CgAwIBAgIJANWFuGx90071MA0GCSqGSIb3DQEBBAUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0wODA0MTUyMzM2NTZaFw0zNTA5MDEyMzM2NTZaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANbOLggKv+IxTdGNs8/TGFy0PTP6DHThvbbR24kT9ixcOd9W+EaBPWW+wPPKQmsHxajtWjmQwWfna8mZuSeJS48LIgAZlKkpFeVyxW0qMBujb8X8ETrWy550NaFtI6t9+u7hZeTfHwqNvacKhp1RbE6dBRGWynwMVX8XW8N1+UjFaq6GCJukT4qmpN2afb8sCjUigq0GuMwYXrFVee74bQgLHWGJwPmvmLHC69EH6kWr22ijx4OKXlSIx2xT1AsSHee70w5iDBiK4aph27yH3TxkXy9V89TDdexAcKk/cVHYNnDBapcavl7y0RiQ4biu8ymM8Ga/nmzhRKya6G0cGw8CAQOjgfwwgfkwHQYDVR0OBBYEFI0cxb6VTEM8YYY6FbBMvAPyT+CyMIHJBgNVHSMEgcEwgb6AFI0cxb6VTEM8YYY6FbBMvAPyT+CyoYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJANWFuGx90071MAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEEBQADggEBABnTDPEF+3iSP0wNfdIjIz1AlnrPzgAIHVvXxunW7SBrDhEglQZBbKJEk5kT0mtKoOD1JMrSu1xuTKEBahWRbqHsXclaXjoBADb0kkjVEJu/Lh5hgYZnOjvlba8Ld7HCKePCVePoTJBdI4fvugnL8TsgK05aIskyY0hKI9L8KfqfGTl1lzOv2KoWD0KWwtAWPoGChZxmQ+nBli+gwYMzM1vAkP+aayLe0a1EQimlOalO762r0GXO0ks+UeXde2Z4e+8S/pf7pITEI/tP+MxJTALw9QUWEv9lKTk+jkbqxbsh8nfBUapfKqYn0eidpwq2AzVp3juYl7//fKnaPhJD9gs="};
    public static final int[] b = {96000, 88200, 64000, ScreenMirroringConfig.Audio.SAMPLING_RATE, RemoteCameraConfig.Mic.SAMPLING_RATE, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final wn5 d = new wn5(new fo5(4), -1420942929, false);
    public static final wn5 e = new wn5(new jo5(24), -1427063200, false);
    public static final wn5 f = new wn5(new rz3(16), 2038642824, false);
    public static final dl4 g = new dl4(19);
    public static final kg k = new kg("android.widget.extra.CHECKED");

    static {
        int i2 = 26;
        h = new qee(i2);
        i = new x2i(i2);
        j = new rre(i2);
    }

    public static l95 A(l95 l95Var) {
        jkv jkvVar = i4w.p;
        efo efoVar = efo.e;
        if (v85.a(l95Var.b, v85.a)) {
            rdo rdoVar = (rdo) l95Var;
            jkv jkvVar2 = rdoVar.d;
            if (!S(jkvVar2, jkvVar)) {
                return new rdo(rdoVar.a, rdoVar.h, jkvVar, v0(L((float[]) efoVar.b, jkvVar2.a(), jkvVar.a()), rdoVar.i), rdoVar.k, rdoVar.n, rdoVar.e, rdoVar.f, rdoVar.g, -1);
            }
        }
        return l95Var;
    }

    public static final void A0(String str, JSONArray jSONArray, lod lodVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject q = gvt.q();
            if (q != null) {
                Iterator<String> keys = q.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, q.get(next));
                }
            }
            String str2 = ood.j;
            h1b.S(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{j3c.c()}, 1)), jSONObject, lodVar).d();
        } catch (JSONException unused) {
        }
    }

    public static wd3 B0() {
        return new wd3(null, null, "Сохранить для сториз", "Ваша карточка сохранена 1");
    }

    public static pjc C(pjc pjcVar, int i2) {
        oi3 oi3Var = oi3.a;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            xq0.o(k5r.i(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            oi3Var = oi3.b;
            i2 = 0;
        }
        int i3 = i2;
        oi3 oi3Var2 = oi3Var;
        return pjcVar instanceof hzc ? vut.D((hzc) pjcVar, null, i3, oi3Var2, 1) : new vc4(pjcVar, null, i3, oi3Var2, 2);
    }

    public static wd3 C0() {
        return new wd3(new d85(d85.f), new d85(d85.b), "Сохранить для сториз", "Ваша карточка сохранена 2");
    }

    public static final zx3 D(xx3 xx3Var) {
        sq5 sq5Var;
        xx3Var.getClass();
        pv3 pv3Var = xx3Var.a;
        sq5 sq5Var2 = new sq5(0);
        if (n7w.R(q6c.D)) {
            ((ArrayList) sq5Var2.b).add(new ok7(6));
        }
        ((ArrayList) sq5Var2.b).add(new ok7(1));
        ((ArrayList) sq5Var2.b).add(new ok7(3));
        List<Pair> list = pv3Var.a;
        yx3 yx3Var = yx3.b;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Pair pair : list) {
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                str.getClass();
                str2.getClass();
                Integer q0 = str.length() == 8 ? StringsKt.q0(str) : null;
                if (q0 == null) {
                    throw new k03("Card BIN must contain exactly 8 digits", 3);
                }
                int intValue = q0.intValue();
                Integer q02 = str2.length() == 8 ? StringsKt.q0(str2) : null;
                if (q02 == null) {
                    throw new k03("Card BIN must contain exactly 8 digits", 3);
                }
                int intValue2 = q02.intValue();
                if (intValue2 < intValue) {
                    throw new k03(hrg.r("Invalid range specified: ", str2, " < ", str), 3);
                }
                arrayList.add(new nv3(intValue, intValue2));
            }
            String str3 = pv3Var.b;
            yx3 yx3Var2 = str3 != null ? new yx3(str3, false) : yx3Var;
            y75.s(arrayList, new ze0(af0.X));
            ((ArrayList) sq5Var2.b).add(new ov3(arrayList, yx3Var2));
        }
        fw3 fw3Var = xx3Var.b;
        boolean z = fw3Var.d;
        Integer num = fw3Var.a;
        if (z) {
            sq5Var = new sq5(0);
            ((ArrayList) sq5Var.b).add(new ok7(2));
        } else {
            sq5Var = new sq5(0);
            ((ArrayList) sq5Var.b).add(new sq5(2));
        }
        Integer num2 = fw3Var.b;
        if (num2 != null && num != null) {
            String str4 = fw3Var.c;
            if (str4 != null) {
                yx3Var = new yx3(str4, false);
            }
            int intValue3 = num2.intValue();
            int intValue4 = num.intValue();
            if (intValue4 < 1 || intValue4 > 12) {
                throw new k03(k5r.i(intValue4, "Invalid month specified: "), 3);
            }
            ((ArrayList) sq5Var.b).add(new yw3(intValue3 % 100, intValue4, yx3Var));
        }
        return new zx3(sq5Var2, sq5Var, new ok7(0), new ok7(4), new ok7(5));
    }

    public static final dkn D0(pjc pjcVar, mm6 mm6Var, mbq mbqVar) {
        anx F = vq1.F(pjcVar);
        x0q a2 = y0q.a(1, F.a, (oi3) F.c);
        x97.x(mm6Var, (CoroutineContext) F.d, mbqVar.equals(lbq.a) ? pm6.a : pm6.d, new d57(mbqVar, (pjc) F.b, a2, y0q.a, (Continuation) null));
        return new dkn(a2);
    }

    public static byte[] E(int i2, int i3) {
        int i4 = -1;
        for (int i5 = 0; i5 < 13; i5++) {
            if (i2 == b[i5]) {
                i4 = i5;
            }
        }
        int i6 = -1;
        for (int i7 = 0; i7 < 16; i7++) {
            if (i3 == c[i7]) {
                i6 = i7;
            }
        }
        if (i2 != -1 && i6 != -1) {
            return F(2, i4, i6);
        }
        xq0.x(f1d.e(i2, i3, "Invalid sample rate or number of channels: ", ", "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E0(pjc pjcVar, cg6 cg6Var) {
        cmc cmcVar;
        int i2;
        js3 js3Var;
        xqn xqnVar;
        Object obj;
        if (cg6Var instanceof cmc) {
            cmcVar = (cmc) cg6Var;
            int i3 = cmcVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cmcVar.l = i3 - Integer.MIN_VALUE;
                Object obj2 = cmcVar.k;
                Object obj3 = nm6.a;
                i2 = cmcVar.l;
                js3Var = ugj.a;
                if (i2 != 0) {
                    xqn i4 = hrg.i(obj2);
                    i4.a = js3Var;
                    rjc ulcVar = new ulc(i4, 2);
                    cmcVar.j = i4;
                    cmcVar.l = 1;
                    if (pjcVar.collect(ulcVar, cmcVar) == obj3) {
                        return obj3;
                    }
                    xqnVar = i4;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = cmcVar.j;
                    qgg.h0(obj2);
                }
                obj = xqnVar.a;
                if (obj == js3Var) {
                    return obj;
                }
                wvs.h("Flow is empty");
                return null;
            }
        }
        cmcVar = new cmc(cg6Var);
        Object obj22 = cmcVar.k;
        Object obj32 = nm6.a;
        i2 = cmcVar.l;
        js3Var = ugj.a;
        if (i2 != 0) {
        }
        obj = xqnVar.a;
        if (obj == js3Var) {
        }
    }

    public static byte[] F(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    public static final fkn F0(pjc pjcVar, mm6 mm6Var, mbq mbqVar, Object obj) {
        anx F = vq1.F(pjcVar);
        xdr a2 = ydr.a(obj);
        x97.x(mm6Var, (CoroutineContext) F.d, mbqVar.equals(lbq.a) ? pm6.a : pm6.d, new d57(mbqVar, (pjc) F.b, a2, obj, (Continuation) null));
        return new fkn(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G0(pjc pjcVar, mm6 mm6Var, cg6 cg6Var) {
        emc emcVar;
        int i2;
        if (cg6Var instanceof emc) {
            emcVar = (emc) cg6Var;
            int i3 = emcVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                emcVar.k = i3 - Integer.MIN_VALUE;
                Object obj = emcVar.j;
                nm6 nm6Var = nm6.a;
                i2 = emcVar.k;
                if (i2 != 0) {
                    qgg.h0(obj);
                    anx F = vq1.F(pjcVar);
                    gm5 gm5Var = new gm5((r2f) mm6Var.getCoroutineContext().get(o6c.l));
                    x97.y(mm6Var, (CoroutineContext) F.d, null, new dmc((pjc) F.b, gm5Var, null, 0), 2);
                    emcVar.k = 1;
                    obj = gm5Var.s(emcVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object obj2 = ((z7o) obj).a;
                qgg.h0(obj2);
                return obj2;
            }
        }
        emcVar = new emc(cg6Var);
        Object obj3 = emcVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = emcVar.k;
        if (i2 != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        qgg.h0(obj22);
        return obj22;
    }

    public static e38 H(j66 j66Var) {
        int i2;
        h38 h38Var;
        int i3;
        g38 g38Var;
        int i4;
        int i5;
        h38 h38Var2;
        h38 h38Var3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int a0 = j66Var.a0();
        int Z = j66Var.Z();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        g38 g38Var2 = new g38();
        int i15 = 0;
        g38Var2.a = 0;
        g38Var2.b = a0;
        g38Var2.c = 0;
        g38Var2.d = Z;
        arrayList2.add(g38Var2);
        int i16 = a0 + Z;
        int i17 = 1;
        int i18 = (((i16 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i18];
        int i19 = i18 / 2;
        int[] iArr2 = new int[i18];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g38 g38Var3 = (g38) arrayList2.remove(arrayList2.size() - i17);
            if (g38Var3.b() >= i17 && g38Var3.a() >= i17) {
                int a2 = ((g38Var3.a() + g38Var3.b()) + i17) / 2;
                int i20 = i17 + i19;
                iArr[i20] = g38Var3.a;
                iArr2[i20] = g38Var3.b;
                int i21 = i15;
                while (i21 < a2) {
                    int i22 = Math.abs(g38Var3.b() - g38Var3.a()) % 2 == i17 ? i17 : i15;
                    int b2 = g38Var3.b() - g38Var3.a();
                    int i23 = -i21;
                    int i24 = i23;
                    while (true) {
                        if (i24 > i21) {
                            i4 = i15;
                            i2 = i19;
                            i5 = a2;
                            h38Var2 = null;
                            break;
                        }
                        if (i24 == i23 || (i24 != i21 && iArr[i24 + 1 + i19] > iArr[(i24 - 1) + i19])) {
                            i10 = iArr[i24 + 1 + i19];
                            i11 = i10;
                        } else {
                            i10 = iArr[(i24 - 1) + i19];
                            i11 = i10 + 1;
                        }
                        i2 = i19;
                        int i25 = ((i11 - g38Var3.a) + g38Var3.c) - i24;
                        if (i21 == 0 || i11 != i10) {
                            i12 = i11;
                            i13 = i25;
                        } else {
                            i12 = i11;
                            i13 = i25 - 1;
                        }
                        int i26 = i24;
                        int i27 = i25;
                        int i28 = i12;
                        i5 = a2;
                        while (i28 < g38Var3.b && i27 < g38Var3.d && j66Var.J(i28, i27)) {
                            i28++;
                            i27++;
                        }
                        iArr[i26 + i2] = i28;
                        if (i22 != 0) {
                            int i29 = b2 - i26;
                            i14 = i22;
                            if (i29 >= i23 + 1 && i29 <= i21 - 1 && iArr2[i29 + i2] <= i28) {
                                h38Var2 = new h38();
                                h38Var2.a = i10;
                                h38Var2.b = i13;
                                h38Var2.c = i28;
                                h38Var2.d = i27;
                                i4 = 0;
                                h38Var2.e = false;
                                break;
                            }
                        } else {
                            i14 = i22;
                        }
                        i24 = i26 + 2;
                        i15 = 0;
                        i19 = i2;
                        a2 = i5;
                        i22 = i14;
                    }
                    if (h38Var2 != null) {
                        h38Var = h38Var2;
                        break;
                    }
                    int i30 = (g38Var3.b() - g38Var3.a()) % 2 == 0 ? 1 : i4;
                    int b3 = g38Var3.b() - g38Var3.a();
                    int i31 = i23;
                    while (true) {
                        if (i31 > i21) {
                            h38Var3 = null;
                            break;
                        }
                        if (i31 == i23 || (i31 != i21 && iArr2[i31 + 1 + i2] < iArr2[(i31 - 1) + i2])) {
                            i6 = iArr2[i31 + 1 + i2];
                            i7 = i6;
                        } else {
                            i6 = iArr2[(i31 - 1) + i2];
                            i7 = i6 - 1;
                        }
                        int i32 = g38Var3.d - ((g38Var3.b - i7) - i31);
                        int i33 = (i21 == 0 || i7 != i6) ? i32 : i32 + 1;
                        int i34 = i30;
                        while (i7 > g38Var3.a && i32 > g38Var3.c) {
                            i8 = b3;
                            if (!j66Var.J(i7 - 1, i32 - 1)) {
                                break;
                            }
                            i7--;
                            i32--;
                            b3 = i8;
                        }
                        i8 = b3;
                        iArr2[i31 + i2] = i7;
                        if (i34 != 0 && (i9 = i8 - i31) >= i23 && i9 <= i21 && iArr[i9 + i2] >= i7) {
                            h38Var3 = new h38();
                            h38Var3.a = i7;
                            h38Var3.b = i32;
                            h38Var3.c = i6;
                            h38Var3.d = i33;
                            h38Var3.e = true;
                            break;
                        }
                        i31 += 2;
                        i30 = i34;
                        b3 = i8;
                    }
                    if (h38Var3 != null) {
                        h38Var = h38Var3;
                        break;
                    }
                    i21++;
                    i19 = i2;
                    a2 = i5;
                    i17 = 1;
                    i15 = 0;
                }
            }
            i2 = i19;
            h38Var = null;
            if (h38Var != null) {
                if (h38Var.a() > 0) {
                    int i35 = h38Var.d;
                    int i36 = h38Var.b;
                    int i37 = i35 - i36;
                    int i38 = h38Var.c;
                    int i39 = h38Var.a;
                    int i40 = i38 - i39;
                    arrayList.add(i37 != i40 ? h38Var.e ? new d38(i39, i36, h38Var.a()) : i37 > i40 ? new d38(i39, i36 + 1, h38Var.a()) : new d38(i39 + 1, i36, h38Var.a()) : new d38(i39, i36, i40));
                }
                if (arrayList3.isEmpty()) {
                    g38Var = new g38();
                    i3 = 1;
                } else {
                    i3 = 1;
                    g38Var = (g38) arrayList3.remove(arrayList3.size() - 1);
                }
                g38Var.a = g38Var3.a;
                g38Var.c = g38Var3.c;
                g38Var.b = h38Var.a;
                g38Var.d = h38Var.b;
                arrayList2.add(g38Var);
                g38Var3.b = g38Var3.b;
                g38Var3.d = g38Var3.d;
                g38Var3.a = h38Var.c;
                g38Var3.c = h38Var.d;
                arrayList2.add(g38Var3);
            } else {
                i3 = 1;
                arrayList3.add(g38Var3);
            }
            i19 = i2;
            i17 = i3;
            i15 = 0;
        }
        Collections.sort(arrayList, g);
        return new e38(j66Var, arrayList, iArr, iArr2);
    }

    public static final h7a H0(pjc pjcVar, int i2) {
        if (i2 > 0) {
            return new h7a(pjcVar, i2, 2);
        }
        xq0.o(dfi.c(i2, "Requested element count ", " should be positive"));
        return null;
    }

    public static final ss3 I(Function2 function2) {
        return new ss3(function2, g.a, -2, oi3.a);
    }

    public static final ff I0(ActionButtonDto actionButtonDto) {
        String url;
        String text = actionButtonDto.getText();
        if (text == null || (url = actionButtonDto.getUrl()) == null) {
            return null;
        }
        return new ff(text, url, actionButtonDto.getColor(), actionButtonDto.getViewBrowser());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable J(pjc pjcVar, rjc rjcVar, cg6 cg6Var) {
        elc elcVar;
        int i2;
        xqn xqnVar;
        Throwable th;
        if (cg6Var instanceof elc) {
            elcVar = (elc) cg6Var;
            int i3 = elcVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                elcVar.l = i3 - Integer.MIN_VALUE;
                Object obj = elcVar.k;
                nm6 nm6Var = nm6.a;
                i2 = elcVar.l;
                if (i2 != 0) {
                    xqn i4 = hrg.i(obj);
                    try {
                        rjc u3Var = new u3(rjcVar, i4, 5);
                        elcVar.j = i4;
                        elcVar.l = 1;
                        if (pjcVar.collect(u3Var, elcVar) == nm6Var) {
                            return nm6Var;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        xqnVar = i4;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = elcVar.j;
                    try {
                        qgg.h0(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) xqnVar.a;
                if (!ot0.K(th, th)) {
                    r2f r2fVar = (r2f) elcVar.getContext().get(o6c.l);
                    if (!((r2fVar == null || !r2fVar.isCancelled()) ? false : ot0.K(th, r2fVar.D()))) {
                        if (th == null) {
                            return th;
                        }
                        if (th instanceof CancellationException) {
                            fob.a(th, th);
                            throw th;
                        }
                        fob.a(th, th);
                        throw th;
                    }
                }
                throw th;
            }
        }
        elcVar = new elc(cg6Var);
        Object obj2 = elcVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = elcVar.l;
        if (i2 != 0) {
        }
        th = (Throwable) xqnVar.a;
        if (!ot0.K(th, th)) {
        }
        throw th;
    }

    public static final ArrayList J0(bg2 bg2Var) {
        bg2Var.getClass();
        List list = bg2Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(L0((qfk) it.next()));
        }
        if (bg2Var.c) {
            arrayList.add(ifk.a);
        }
        if (bg2Var.f) {
            arrayList.add(gfk.a);
        }
        if (bg2Var.d) {
            arrayList.add(lfk.a);
        }
        if (bg2Var.e) {
            arrayList.add(kfk.a);
        }
        arrayList.add(jfk.a);
        return arrayList;
    }

    public static final tc4 K(Function2 function2) {
        return new tc4(function2, g.a, -2, oi3.a);
    }

    public static final ix3 K0(hx3 hx3Var) {
        hx3Var.getClass();
        switch (hx3Var.ordinal()) {
            case 0:
                return ix3.a;
            case 1:
                return ix3.b;
            case 2:
                return ix3.c;
            case 3:
                return ix3.d;
            case 4:
                return ix3.e;
            case 5:
                return ix3.f;
            case 6:
                return ix3.g;
            case 7:
                return ix3.h;
            case 8:
                return ix3.i;
            case 9:
                return ix3.j;
            case 10:
                return ix3.k;
            case 11:
                return ix3.l;
            case 12:
                return ix3.m;
            default:
                b6e.s();
                return null;
        }
    }

    public static final float[] L(float[] fArr, float[] fArr2, float[] fArr3) {
        w0(fArr, fArr2);
        w0(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] p0 = p0(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return v0(p0, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final rfk L0(qfk qfkVar) {
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        hx3 hx3Var;
        dm2 dm2Var;
        qfkVar.getClass();
        r8k r8kVar = qfkVar.l;
        iae iaeVar = qfkVar.m;
        b5c b5cVar = qfkVar.k;
        if (qdq.B(r8kVar != null ? Boolean.valueOf(r8kVar.a) : null)) {
            if ((r8kVar != null ? r8kVar.c : null) != null) {
                String str3 = qfkVar.a;
                boolean C = qdq.C(r8kVar != null ? Boolean.valueOf(r8kVar.b) : null);
                t7w t7wVar = r8kVar != null ? r8kVar.c : null;
                int i2 = t7wVar == null ? -1 : jj6.a[t7wVar.ordinal()];
                return new pfk(str3, C, i2 != 1 ? i2 != 2 ? u7w.b : u7w.c : u7w.a, b5cVar != null ? new c5c(b5cVar.a, b5cVar.b, b5cVar.c, b5cVar.d, b5cVar.e, b5cVar.f, b5cVar.g) : null, qfkVar.o, qfkVar.b, null);
            }
        }
        int ordinal = qfkVar.j.ordinal();
        if (ordinal == 0) {
            String str4 = qfkVar.a;
            String str5 = qfkVar.g;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = qfkVar.h;
            String str7 = str5;
            String str8 = qfkVar.i;
            if (iaeVar != null && (str2 = iaeVar.a) != null) {
                try {
                    uri = Uri.parse(str2);
                } catch (Throwable unused) {
                }
                if (iaeVar != null && (str = iaeVar.b) != null) {
                    try {
                        uri2 = Uri.parse(str);
                    } catch (Throwable unused2) {
                    }
                    return new mfk(str4, str7, str6, str8, uri, uri2, qfkVar.o, qfkVar.b, qfkVar.p);
                }
                uri2 = null;
                return new mfk(str4, str7, str6, str8, uri, uri2, qfkVar.o, qfkVar.b, qfkVar.p);
            }
            uri = null;
            if (iaeVar != null) {
                uri2 = Uri.parse(str);
                return new mfk(str4, str7, str6, str8, uri, uri2, qfkVar.o, qfkVar.b, qfkVar.p);
            }
            uri2 = null;
            return new mfk(str4, str7, str6, str8, uri, uri2, qfkVar.o, qfkVar.b, qfkVar.p);
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        hw3 hw3Var = new hw3(qfkVar.a);
        String str9 = qfkVar.d;
        str9.getClass();
        switch (str9.hashCode()) {
            case -1804444521:
                if (str9.equals("DinersClubCarteBlanche")) {
                    hx3Var = hx3.DinersClub;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case -1802816241:
                if (str9.equals("Maestro")) {
                    hx3Var = hx3.Maestro;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case -1745773739:
                if (str9.equals("Uzcard")) {
                    hx3Var = hx3.Uzcard;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case -780280800:
                if (str9.equals("VISA_ELECTRON")) {
                    hx3Var = hx3.VISA_ELECTRON;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case -231891079:
                if (str9.equals("UnionPay")) {
                    hx3Var = hx3.UnionPay;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case -217540848:
                if (str9.equals("AmericanExpress")) {
                    hx3Var = hx3.AmericanExpress;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case -46205774:
                if (str9.equals("MasterCard")) {
                    hx3Var = hx3.MasterCard;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case 73257:
                if (str9.equals("JCB")) {
                    hx3Var = hx3.JCB;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case 76342:
                if (str9.equals("MIR")) {
                    hx3Var = hx3.MIR;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case 2229103:
                if (str9.equals("HUMO")) {
                    hx3Var = hx3.HUMO;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case 2634817:
                if (str9.equals("VISA")) {
                    hx3Var = hx3.VISA;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            case 1341365945:
                if (str9.equals("DiscoverCard")) {
                    hx3Var = hx3.DiscoverCard;
                    break;
                }
                hx3Var = hx3.UNKNOWN;
                break;
            default:
                hx3Var = hx3.UNKNOWN;
                break;
        }
        ix3 K0 = K0(hx3Var);
        String str10 = qfkVar.c;
        cm2 cm2Var = qfkVar.f;
        cm2Var.getClass();
        switch (cm2Var.ordinal()) {
            case 0:
                dm2Var = dm2.a;
                break;
            case 1:
                dm2Var = dm2.b;
                break;
            case 2:
                dm2Var = dm2.c;
                break;
            case 3:
                dm2Var = dm2.d;
                break;
            case 4:
                dm2Var = dm2.e;
                break;
            case 5:
                dm2Var = dm2.f;
                break;
            case 6:
                dm2Var = dm2.g;
                break;
            case 7:
                dm2Var = dm2.h;
                break;
            case 8:
                dm2Var = dm2.i;
                break;
            case 9:
                dm2Var = dm2.j;
                break;
            case 10:
                dm2Var = dm2.k;
                break;
            case 11:
                dm2Var = dm2.l;
                break;
            case 12:
                dm2Var = dm2.m;
                break;
            case 13:
                dm2Var = dm2.n;
                break;
            default:
                b6e.s();
                return null;
        }
        return new ffk(hw3Var, K0, str10, dm2Var, b5cVar != null ? new c5c(b5cVar.a, b5cVar.b, b5cVar.c, b5cVar.d, b5cVar.e, b5cVar.f, b5cVar.g) : null, qfkVar.n, qfkVar.o, qfkVar.b, qfkVar.p);
    }

    public static final List M(int i2, Collection collection) {
        collection.getClass();
        double size = collection.size();
        if (size <= i2) {
            return t75.c(CollectionsKt.w0(collection));
        }
        return CollectionsKt.H(collection, (int) Math.ceil(size / ((int) Math.ceil(size / r2))));
    }

    public static final yc4 M0(pjc pjcVar, pyc pycVar) {
        int i2 = tlc.a;
        return new yc4(pycVar, pjcVar, g.a, -2, oi3.a);
    }

    public static final Object N(pjc pjcVar, Continuation continuation) {
        Object collect = pjcVar.collect(qej.a, continuation);
        return collect == nm6.a ? collect : Unit.a;
    }

    public static yd3 N0() {
        long j2 = d85.l;
        return new yd3("Моя волна 2023", "Моя волна", "user:onyourwave", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", null, new d85(j2), null, t75.c("playlist:yamusic-premiere_157118776"));
    }

    public static final Object O(pjc pjcVar, Function2 function2, Continuation continuation) {
        Object N = N(C(s0(pjcVar, function2), 0), continuation);
        return N == nm6.a ? N : Unit.a;
    }

    public static final void O0(String str, String str2) {
        File m0 = m0();
        if (m0 == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m0, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static final ub7 P(pjc pjcVar, pjc pjcVar2, pjc pjcVar3, pjc pjcVar4, tyc tycVar) {
        return new ub7(14, new pjc[]{pjcVar, pjcVar2, pjcVar3, pjcVar4}, tycVar);
    }

    public static final ub7 Q(pjc pjcVar, pjc pjcVar2, pjc pjcVar3, ryc rycVar) {
        return new ub7(13, new pjc[]{pjcVar, pjcVar2, pjcVar3}, rycVar);
    }

    public static final lmc R(pjc pjcVar, pjc pjcVar2, pjc pjcVar3, pjc pjcVar4, pjc pjcVar5, uyc uycVar) {
        return new lmc(new pjc[]{pjcVar, pjcVar2, pjcVar3, pjcVar4, pjcVar5}, uycVar, 0);
    }

    public static final boolean S(jkv jkvVar, jkv jkvVar2) {
        if (jkvVar == jkvVar2) {
            return true;
        }
        return Math.abs(jkvVar.a - jkvVar2.a) < 0.001f && Math.abs(jkvVar.b - jkvVar2.b) < 0.001f;
    }

    public static final String T(String str) {
        int read;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            bigInteger.getClass();
            bufferedInputStream.close();
            return bigInteger;
        } finally {
        }
    }

    public static final String U(Context context) {
        context.getClass();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.decode(a[i2], 0))));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        xqn xqnVar = new xqn();
        xqnVar.a = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Field field = Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
            field.getClass();
            Object obj = field.get(null);
            Class<?> cls = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            Object newProxyInstance = Proxy.newProxyInstance(zsd.class.getClassLoader(), new Class[]{cls}, new ysd(obj, xqnVar, reentrantLock, newCondition));
            newProxyInstance.getClass();
            Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, cls);
            method.getClass();
            method.invoke(context.getPackageManager(), context.getPackageName(), Boolean.FALSE, obj, new ArrayList(arrayList2), newProxyInstance);
            newCondition.await();
            String str = (String) xqnVar.a;
            reentrantLock.unlock();
            return str;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    public static final nc4 V(zi3 zi3Var) {
        return new nc4(zi3Var, true);
    }

    public static final z76 W(l95 l95Var, l95 l95Var2) {
        if (l95Var == l95Var2) {
            return new w76(l95Var, l95Var, 1);
        }
        long j2 = l95Var.b;
        long j3 = v85.a;
        return (v85.a(j2, j3) && v85.a(l95Var2.b, j3)) ? new x76((rdo) l95Var, (rdo) l95Var2) : new z76(l95Var, l95Var2, 0);
    }

    public static final pjc X(pjc pjcVar, long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? pjcVar : jf0.z(pjcVar, new fn1(j2, 5));
        }
        xq0.x("Debounce timeout should not be negative");
        return null;
    }

    public static final pjc Y(pjc pjcVar, long j2) {
        return X(pjcVar, y2x.c0(j2));
    }

    public static final void Z(String str) {
        File m0 = m0();
        if (m0 == null || str == null) {
            return;
        }
        new File(m0, str).delete();
    }

    public static final void a(ArrayList arrayList, a60 a60Var, fvf fvfVar, vm vmVar, hq5 hq5Var, int i2) {
        int i3;
        a60Var.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1825455881);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(a60Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(vmVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            boolean f2 = oq5Var.f(arrayList);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (f2 || K == kjnVar) {
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((b2t) it.next()).a);
                }
                oq5Var.k0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            yci a2 = a.a(d.c(vci.a, 1.0f), "track_list");
            boolean h2 = oq5Var.h(arrayList) | oq5Var.h(a60Var) | oq5Var.h(list);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new g3(4, arrayList, a60Var, list);
                oq5Var.k0(K2);
            }
            int i4 = i3 >> 3;
            weo.f(a2, fvfVar, vmVar, null, null, null, false, null, (Function1) K2, oq5Var, (i4 & 112) | 6 | (i4 & 896), 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(i2, 2, arrayList, a60Var, fvfVar, vmVar);
        }
    }

    public static final za8 a0(pjc pjcVar, Function2 function2) {
        s3f s3fVar = q6k.f;
        function2.getClass();
        wct.o(2, function2);
        return q6k.m(pjcVar, s3fVar, function2);
    }

    public static final void b(boolean z, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1847719420);
        if ((((oq5Var.g(z) ? 4 : 2) | i2 | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            wn5Var2 = wn5Var;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new pa1(1);
                oq5Var.k0(K);
            }
            wn5 C = ild.C(-412776638, new sm(3, z), oq5Var);
            wn5 C2 = ild.C(1697914721, new sm(4, z), oq5Var);
            vci vciVar = vci.a;
            wn5Var2 = wn5Var;
            f((Function0) K, C, C2, vciVar, false, wn5Var2, oq5Var, 224694, 0);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(z, wn5Var2, yciVar, i2);
        }
    }

    public static final pjc b0(pjc pjcVar) {
        return pjcVar instanceof vdr ? pjcVar : q6k.m(pjcVar, q6k.f, q6k.g);
    }

    public static final void c(final dd1 dd1Var, wn5 wn5Var, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-659196883);
        int i3 = i2 | (oq5Var.f(dd1Var) ? 4 : 2) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            final int i4 = 0;
            wn5 C = ild.C(-408057109, new Function2() { // from class: pc1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            ltg.e(qo6.k, dd1Var.d, d.m(vci.a, 52), null, null, men.a, men.b, null, hq5Var2, 1769862, 152);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var3, 0);
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            int i5 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l = oq5Var4.l();
                            yci H = vnj.H(hq5Var3, vci.a);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var3, a2, wp5.f);
                            g0g.U(hq5Var3, l, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                                ouj.x(i5, oq5Var4, i5, kb5Var);
                            }
                            g0g.U(hq5Var3, H, wp5.d);
                            dd1 dd1Var2 = dd1Var;
                            String str = dd1Var2.a;
                            ges j2 = nu0.j();
                            agr agrVar = eq0.a;
                            oq5 oq5Var5 = (oq5) hq5Var3;
                            xv7.j(str, null, ((dq0) oq5Var5.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, j2, hq5Var3, 0, 3120, 55290);
                            xv7.j(dd1Var2.b, null, ((dq0) oq5Var5.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), hq5Var3, 0, 3120, 55290);
                            oq5Var4.p(true);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var);
            final int i5 = 1;
            f(function0, C, ild.C(1846235082, new Function2() { // from class: pc1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            ltg.e(qo6.k, dd1Var.d, d.m(vci.a, 52), null, null, men.a, men.b, null, hq5Var2, 1769862, 152);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var3, 0);
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            int i52 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l = oq5Var4.l();
                            yci H = vnj.H(hq5Var3, vci.a);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var3, a2, wp5.f);
                            g0g.U(hq5Var3, l, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i52))) {
                                ouj.x(i52, oq5Var4, i52, kb5Var);
                            }
                            g0g.U(hq5Var3, H, wp5.d);
                            dd1 dd1Var2 = dd1Var;
                            String str = dd1Var2.a;
                            ges j2 = nu0.j();
                            agr agrVar = eq0.a;
                            oq5 oq5Var5 = (oq5) hq5Var3;
                            xv7.j(str, null, ((dq0) oq5Var5.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, j2, hq5Var3, 0, 3120, 55290);
                            xv7.j(dd1Var2.b, null, ((dq0) oq5Var5.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), hq5Var3, 0, 3120, 55290);
                            oq5Var4.p(true);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), yciVar, false, wn5Var, oq5Var, (i3 & 7168) | ((i3 >> 6) & 14) | 432 | 196608, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 14, dd1Var, wn5Var, function0, yciVar);
        }
    }

    public static final yci c0(yci yciVar, Function0 function0) {
        yciVar.getClass();
        function0.getClass();
        return androidx.compose.ui.draw.a.b(yciVar, new ex(8, function0));
    }

    public static final void d(wc1 wc1Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-441241960);
        if ((((oq5Var.d(wc1Var.ordinal()) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int ordinal = wc1Var.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(1168242919);
                q7g.e(0, oq5Var);
                oq5Var.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, 1168241070, false);
                }
                oq5Var.Z(1168244908);
                ngg.f(0, oq5Var);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qc1(wc1Var, i2);
        }
    }

    public static final h7a d0(pjc pjcVar, int i2) {
        if (i2 >= 0) {
            return new h7a(pjcVar, i2, 1);
        }
        xq0.o(k5r.i(i2, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final void e(uc1 uc1Var, wc1 wc1Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        vci vciVar;
        yci yciVar2;
        uc1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1056623795);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var.h(uc1Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(wc1Var.ordinal()) ? 32 : 16;
        }
        if (((i3 | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            ed1 ed1Var = (ed1) szf.Q(uc1Var.a.h, oq5Var).getValue();
            vci vciVar2 = vci.a;
            yci d2 = d.d(vciVar2, 1.0f);
            kfh d3 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (ed1Var instanceof cd1) {
                oq5Var.Z(1653269384);
                b(((cd1) ed1Var).a, ild.C(675482146, new qc1(wc1Var, 0, (byte) 0), oq5Var), null, oq5Var, 48);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                if (!(ed1Var instanceof dd1)) {
                    throw vz1.i(oq5Var, 1653267878, false);
                }
                oq5Var.Z(1653276238);
                dd1 dd1Var = (dd1) ed1Var;
                wn5 C = ild.C(-258727031, new qc1(wc1Var, 1, (byte) 0), oq5Var);
                boolean h2 = oq5Var.h(uc1Var) | oq5Var.f(ed1Var);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (h2 || K == kjnVar) {
                    K = new hb(18, uc1Var, dd1Var);
                    oq5Var.k0(K);
                }
                Function0 function0 = (Function0) K;
                boolean f2 = oq5Var.f(ed1Var) | oq5Var.h(uc1Var);
                Object K2 = oq5Var.K();
                if (f2 || K2 == kjnVar) {
                    K2 = new a3(14, uc1Var, dd1Var);
                    oq5Var.k0(K2);
                }
                yci b2 = com.yandex.music.core.ui.compose.a.b(vciVar2, null, 0L, 0.0f, null, (Function2) K2, 15);
                vciVar = vciVar2;
                c(dd1Var, C, function0, b2, oq5Var, 48);
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(uc1Var, wc1Var, yciVar2, i2, 11);
        }
    }

    public static final Object e0(rjc rjcVar, pjc pjcVar, Continuation continuation) {
        f0(rjcVar);
        Object collect = pjcVar.collect(rjcVar, continuation);
        return collect == nm6.a ? collect : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Function0 function0, wn5 wn5Var, wn5 wn5Var2, yci yciVar, boolean z, Function2 function2, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1034672767);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i4 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((i2 & 196608) == 0) {
                i4 |= oq5Var.h(function2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((74899 & i4) == 74898 || !oq5Var.z()) {
                boolean z4 = i5 == 0 ? true : z2;
                int i6 = i4 >> 9;
                ltg.i(yciVar, z4, 0L, function0, null, ild.C(-1884962629, new x3(22, wn5Var, wn5Var2, function2), oq5Var), oq5Var, (i6 & 112) | (i6 & 14) | 196608 | ((i4 << 9) & 7168), 20);
                z3 = z4;
            } else {
                oq5Var.S();
                z3 = z2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new tp(function0, wn5Var, wn5Var2, yciVar, z3, function2, i2, i3, 2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i2 & 196608) == 0) {
        }
        if ((74899 & i4) == 74898) {
        }
        if (i5 == 0) {
        }
        int i62 = i4 >> 9;
        ltg.i(yciVar, z4, 0L, function0, null, ild.C(-1884962629, new x3(22, wn5Var, wn5Var2, function2), oq5Var), oq5Var, (i62 & 112) | (i62 & 14) | 196608 | ((i4 << 9) & 7168), 20);
        z3 = z4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void f0(rjc rjcVar) {
        if (rjcVar instanceof ggs) {
            throw ((ggs) rjcVar).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final Function0 function0, yci yciVar, int i2, long j2, int i3, hq5 hq5Var, final int i4, final int i5) {
        Function0 function02;
        int i6;
        yci yciVar2;
        int i7;
        long j3;
        final int i8;
        yci yciVar3;
        int i9;
        final int i10;
        final long j4;
        final int i11;
        oq5 oq5Var;
        final int i12;
        final long j5;
        final yci yciVar4;
        xmn r;
        int i13;
        int i14;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1516610613);
        if ((i4 & 6) == 0) {
            function02 = function0;
            i6 = (oq5Var2.h(function02) ? 4 : 2) | i4;
        } else {
            function02 = function0;
            i6 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var2.f(yciVar2) ? 32 : 16;
            if ((i4 & 384) != 0) {
                if ((i5 & 4) == 0) {
                    i7 = i2;
                    if (oq5Var2.d(i7)) {
                        i14 = 256;
                        i6 |= i14;
                    }
                } else {
                    i7 = i2;
                }
                i14 = 128;
                i6 |= i14;
            } else {
                i7 = i2;
            }
            if ((i4 & 3072) != 0) {
                j3 = j2;
                i6 |= ((i5 & 8) == 0 && oq5Var2.e(j3)) ? 2048 : 1024;
            } else {
                j3 = j2;
            }
            if ((i4 & 24576) != 0) {
                if ((i5 & 16) == 0) {
                    i8 = i3;
                    if (oq5Var2.d(i8)) {
                        i13 = 16384;
                        i6 |= i13;
                    }
                } else {
                    i8 = i3;
                }
                i13 = RemoteCameraConfig.Notification.ID;
                i6 |= i13;
            } else {
                i8 = i3;
            }
            if ((i6 & 9363) == 9362 || !oq5Var2.z()) {
                oq5Var2.U();
                if ((i4 & 1) != 0 || oq5Var2.y()) {
                    yciVar3 = i15 == 0 ? vci.a : yciVar2;
                    if ((i5 & 4) == 0) {
                        i6 &= -897;
                        i9 = R.string.go_back;
                    } else {
                        i9 = i7;
                    }
                    if ((i5 & 8) != 0) {
                        j3 = d85.b(((d85) oq5Var2.j(sb6.a)).a, ((Number) oq5Var2.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                        i6 &= -7169;
                    }
                    if ((i5 & 16) == 0) {
                        i6 &= -57345;
                        i10 = R.drawable.ic_arrow_android_back_24;
                    } else {
                        i10 = i8;
                    }
                    j4 = j3;
                    i11 = i9;
                } else {
                    oq5Var2.S();
                    if ((i5 & 4) != 0) {
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        i6 &= -7169;
                    }
                    if ((i5 & 16) != 0) {
                        i6 &= -57345;
                    }
                    yciVar3 = yciVar2;
                    i10 = i8;
                    j4 = j3;
                    i11 = i7;
                }
                oq5Var2.q();
                float f2 = 48;
                yci yciVar5 = yciVar3;
                aae.a(function02, a.a(d.q(yciVar5, f2, f2, 0.0f, 0.0f, 12), "go_back"), false, ild.C(1874379985, new Function2() { // from class: pi2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        hq5 hq5Var2 = (hq5) obj;
                        if ((((Integer) obj2).intValue() & 3) == 2) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        gae.b(a0g.E(i10, 0, hq5Var2), rvf.M(i11, hq5Var2), null, j4, hq5Var2, 0, 4);
                        return Unit.a;
                    }
                }, oq5Var2), oq5Var2, (i6 & 14) | 24576, 12);
                oq5Var = oq5Var2;
                i12 = i11;
                j5 = j4;
                i8 = i10;
                yciVar4 = yciVar5;
            } else {
                oq5Var2.S();
                yciVar4 = yciVar2;
                oq5Var = oq5Var2;
                i12 = i7;
                j5 = j3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: qi2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zsd.g(Function0.this, yciVar4, i12, j5, i8, (hq5) obj, rvf.R(i4 | 1), i5);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i4 & 384) != 0) {
        }
        if ((i4 & 3072) != 0) {
        }
        if ((i4 & 24576) != 0) {
        }
        if ((i6 & 9363) == 9362) {
        }
        oq5Var2.U();
        if ((i4 & 1) != 0) {
        }
        if (i15 == 0) {
        }
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) != 0) {
        }
        if ((i5 & 16) == 0) {
        }
        j4 = j3;
        i11 = i9;
        oq5Var2.q();
        float f22 = 48;
        yci yciVar52 = yciVar3;
        aae.a(function02, a.a(d.q(yciVar52, f22, f22, 0.0f, 0.0f, 12), "go_back"), false, ild.C(1874379985, new Function2() { // from class: pi2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                gae.b(a0g.E(i10, 0, hq5Var2), rvf.M(i11, hq5Var2), null, j4, hq5Var2, 0, 4);
                return Unit.a;
            }
        }, oq5Var2), oq5Var2, (i6 & 14) | 24576, 12);
        oq5Var = oq5Var2;
        i12 = i11;
        j5 = j4;
        i8 = i10;
        yciVar4 = yciVar52;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g0(pjc pjcVar, Continuation continuation) {
        xlc xlcVar;
        int i2;
        js3 js3Var;
        xqn xqnVar;
        p2 e2;
        ulc ulcVar;
        Object obj;
        if (continuation instanceof xlc) {
            xlcVar = (xlc) continuation;
            int i3 = xlcVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xlcVar.m = i3 - Integer.MIN_VALUE;
                Object obj2 = xlcVar.l;
                Object obj3 = nm6.a;
                i2 = xlcVar.m;
                js3Var = ugj.a;
                if (i2 != 0) {
                    xqn i4 = hrg.i(obj2);
                    i4.a = js3Var;
                    ulc ulcVar2 = new ulc(i4, 0);
                    try {
                        xlcVar.j = i4;
                        xlcVar.k = ulcVar2;
                        xlcVar.m = 1;
                        if (pjcVar.collect(ulcVar2, xlcVar) == obj3) {
                            return obj3;
                        }
                        xqnVar = i4;
                    } catch (p2 e3) {
                        xqnVar = i4;
                        e2 = e3;
                        ulcVar = ulcVar2;
                        if (e2.a == ulcVar) {
                            throw e2;
                        }
                        saf.K(xlcVar.getContext());
                        obj = xqnVar.a;
                        if (obj != js3Var) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ulcVar = xlcVar.k;
                    xqnVar = xlcVar.j;
                    try {
                        qgg.h0(obj2);
                    } catch (p2 e4) {
                        e2 = e4;
                        if (e2.a == ulcVar) {
                        }
                    }
                }
                obj = xqnVar.a;
                if (obj != js3Var) {
                    return obj;
                }
                wvs.h("Expected at least one element");
                return null;
            }
        }
        xlcVar = new xlc(continuation);
        Object obj22 = xlcVar.l;
        Object obj32 = nm6.a;
        i2 = xlcVar.m;
        js3Var = ugj.a;
        if (i2 != 0) {
        }
        obj = xqnVar.a;
        if (obj != js3Var) {
        }
    }

    public static final void h(int i2, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(23944617);
        int i3 = (oq5Var.f(str) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            w1g.j(str, null, yciVar, null, null, null, hd6.a, 0.0f, null, 0, bg3.b, oq5Var, (i3 & 14) | 1572912 | ((i3 << 3) & 896), 952);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h0(pjc pjcVar, Function2 function2, Continuation continuation) {
        ylc ylcVar;
        int i2;
        js3 js3Var;
        xqn xqnVar;
        p2 e2;
        wlc wlcVar;
        Object obj;
        if (continuation instanceof ylc) {
            ylcVar = (ylc) continuation;
            int i3 = ylcVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ylcVar.m = i3 - Integer.MIN_VALUE;
                Object obj2 = ylcVar.l;
                Object obj3 = nm6.a;
                i2 = ylcVar.m;
                js3Var = ugj.a;
                if (i2 != 0) {
                    xqn i4 = hrg.i(obj2);
                    i4.a = js3Var;
                    wlc wlcVar2 = new wlc(function2, i4, 0);
                    try {
                        ylcVar.j = i4;
                        ylcVar.k = wlcVar2;
                        ylcVar.m = 1;
                        if (pjcVar.collect(wlcVar2, ylcVar) == obj3) {
                            return obj3;
                        }
                        xqnVar = i4;
                    } catch (p2 e3) {
                        xqnVar = i4;
                        e2 = e3;
                        wlcVar = wlcVar2;
                        if (e2.a == wlcVar) {
                            throw e2;
                        }
                        saf.K(ylcVar.getContext());
                        obj = xqnVar.a;
                        if (obj != js3Var) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wlcVar = ylcVar.k;
                    xqnVar = ylcVar.j;
                    try {
                        qgg.h0(obj2);
                    } catch (p2 e4) {
                        e2 = e4;
                        if (e2.a == wlcVar) {
                        }
                    }
                }
                obj = xqnVar.a;
                if (obj != js3Var) {
                    return obj;
                }
                wvs.h("Expected at least one element matching the predicate");
                return null;
            }
        }
        ylcVar = new ylc(continuation);
        Object obj22 = ylcVar.l;
        Object obj32 = nm6.a;
        i2 = ylcVar.m;
        js3Var = ugj.a;
        if (i2 != 0) {
        }
        obj = xqnVar.a;
        if (obj != js3Var) {
        }
    }

    public static final void i(gy5 gy5Var, yci yciVar, hq5 hq5Var, int i2) {
        gy5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(296445493);
        int i3 = (oq5Var.h(gy5Var) ? 4 : 2) | i2 | 48;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ry5 ry5Var = (ry5) gld.M(gy5Var.getState(), oq5Var).getValue();
            boolean z = ry5Var instanceof py5;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(1416284479);
                boolean z2 = ((py5) ry5Var).a;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new uo5(27);
                    oq5Var.k0(K);
                }
                j(0, oq5Var, nfp.a(vciVar, (Function1) K), z2);
                oq5Var.p(false);
            } else {
                if (!(ry5Var instanceof qy5)) {
                    throw vz1.i(oq5Var, 1416281373, false);
                }
                oq5Var.Z(1416290295);
                k((qy5) ry5Var, gy5Var, oq5Var, (i3 << 3) & 1008);
                oq5Var.p(false);
            }
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(gy5Var, yciVar, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i0(pjc pjcVar, Continuation continuation) {
        amc amcVar;
        int i2;
        xqn xqnVar;
        p2 e2;
        ulc ulcVar;
        if (continuation instanceof amc) {
            amcVar = (amc) continuation;
            int i3 = amcVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                amcVar.m = i3 - Integer.MIN_VALUE;
                Object obj = amcVar.l;
                Object obj2 = nm6.a;
                i2 = amcVar.m;
                if (i2 != 0) {
                    xqn i4 = hrg.i(obj);
                    ulc ulcVar2 = new ulc(i4, 1);
                    try {
                        amcVar.j = i4;
                        amcVar.k = ulcVar2;
                        amcVar.m = 1;
                        if (pjcVar.collect(ulcVar2, amcVar) == obj2) {
                            return obj2;
                        }
                        xqnVar = i4;
                    } catch (p2 e3) {
                        xqnVar = i4;
                        e2 = e3;
                        ulcVar = ulcVar2;
                        if (e2.a == ulcVar) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ulcVar = amcVar.k;
                    xqnVar = amcVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (p2 e4) {
                        e2 = e4;
                        if (e2.a == ulcVar) {
                            throw e2;
                        }
                        saf.K(amcVar.getContext());
                        return xqnVar.a;
                    }
                }
                return xqnVar.a;
            }
        }
        amcVar = new amc(continuation);
        Object obj3 = amcVar.l;
        Object obj22 = nm6.a;
        i2 = amcVar.m;
        if (i2 != 0) {
        }
        return xqnVar.a;
    }

    public static final void j(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2097149911);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
        } else {
            float f2 = 16;
            yci o = androidx.compose.foundation.layout.a.o(d.d(yciVar, 1.0f), f2, 0.0f, 2);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
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
            int i5 = i3 & 14;
            int i6 = i5 | 48;
            z2 = z;
            ivf.l(z2, d.r(vciVar, 148), nu0.c(), oq5Var, i6, 0);
            u1g.l(oq5Var, d.e(vciVar, f2));
            ivf.k(i5, 0, oq5Var, xp3.u(androidx.compose.foundation.layout.a.d(d.d(vciVar, 1.0f), 3.0f), o5g.E(oq5Var)), z2);
            u1g.l(oq5Var, d.e(vciVar, f2));
            ivf.l(z2, d.r(vciVar, 256), nu0.j(), oq5Var, i6, 0);
            u1g.l(oq5Var, d.e(vciVar, 8));
            ivf.l(z2, d.r(vciVar, 230), nu0.i(), oq5Var, i6, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z2, yciVar, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j0(pjc pjcVar, Function2 function2, cg6 cg6Var) {
        bmc bmcVar;
        int i2;
        xqn xqnVar;
        p2 e2;
        wlc wlcVar;
        if (cg6Var instanceof bmc) {
            bmcVar = (bmc) cg6Var;
            int i3 = bmcVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bmcVar.m = i3 - Integer.MIN_VALUE;
                Object obj = bmcVar.l;
                Object obj2 = nm6.a;
                i2 = bmcVar.m;
                if (i2 != 0) {
                    xqn i4 = hrg.i(obj);
                    wlc wlcVar2 = new wlc(function2, i4, 1);
                    try {
                        bmcVar.j = i4;
                        bmcVar.k = wlcVar2;
                        bmcVar.m = 1;
                        if (pjcVar.collect(wlcVar2, bmcVar) == obj2) {
                            return obj2;
                        }
                        xqnVar = i4;
                    } catch (p2 e3) {
                        xqnVar = i4;
                        e2 = e3;
                        wlcVar = wlcVar2;
                        if (e2.a == wlcVar) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wlcVar = bmcVar.k;
                    xqnVar = bmcVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (p2 e4) {
                        e2 = e4;
                        if (e2.a == wlcVar) {
                            throw e2;
                        }
                        saf.K(bmcVar.getContext());
                        return xqnVar.a;
                    }
                }
                return xqnVar.a;
            }
        }
        bmcVar = new bmc(cg6Var);
        Object obj3 = bmcVar.l;
        Object obj22 = nm6.a;
        i2 = bmcVar.m;
        if (i2 != 0) {
        }
        return xqnVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0216, code lost:
    
        if (r13 == r11) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(qy5 qy5Var, gy5 gy5Var, hq5 hq5Var, int i2) {
        int i3;
        long j2;
        kb5 kb5Var;
        oy5 oy5Var;
        oq5 oq5Var;
        vci vciVar;
        int i4;
        float f2;
        boolean z;
        Object obj;
        ozm ozmVar;
        kb5 kb5Var2;
        kb5 kb5Var3;
        Function0 function0;
        vci vciVar2;
        Object obj2;
        boolean z2;
        kb5 kb5Var4;
        Object e65Var;
        vci vciVar3;
        oy5 oy5Var2;
        Object obj3;
        ozm ozmVar2;
        float f3;
        float f4;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2130342172);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(qy5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(gy5Var) ? 32 : 16;
        }
        int i5 = i2 & 384;
        vci vciVar4 = vci.a;
        if (i5 == 0) {
            i3 |= oq5Var2.f(vciVar4) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oy5 oy5Var3 = qy5Var.a;
            float f5 = 16;
            yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar4, 1.0f), f5, 0.0f, 2);
            boolean h2 = oq5Var2.h(gy5Var);
            Object K = oq5Var2.K();
            Object obj4 = gq5.a;
            int i6 = 0;
            if (h2 || K == obj4) {
                K = new cy5(gy5Var, i6);
                oq5Var2.k0(K);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(o, null, 0L, 0.0f, null, (Function2) K, 15);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i7 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b2);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function02);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var2, i7, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var8);
            String str = oy5Var3.a;
            ges c2 = nu0.c();
            ozm ozmVar3 = eq0.a;
            long j3 = ((dq0) oq5Var2.j(ozmVar3)).b.a;
            Object K2 = oq5Var2.K();
            if (K2 == obj4) {
                j2 = j3;
                K2 = new uo5(28);
                oq5Var2.k0(K2);
            } else {
                j2 = j3;
            }
            xcs.b(str, nfp.b(vciVar4, false, (Function1) K2), j2, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2, oq5Var2, 0, 3120, 55288);
            String str2 = oy5Var3.d;
            if (str2 != null) {
                oq5Var2.Z(-706472904);
                String M = rvf.M(R.string.open_map, oq5Var2);
                String concat = str2.concat(!((ma5) oq5Var2.j(pa5.a)).g() ? "&theme=dark" : "&theme=light");
                boolean h3 = oq5Var2.h(gy5Var);
                Object K3 = oq5Var2.K();
                if (h3 || K3 == obj4) {
                    kb5Var4 = kb5Var7;
                    vciVar3 = vciVar4;
                    oy5Var2 = oy5Var3;
                    obj3 = obj4;
                    ozmVar2 = ozmVar3;
                    f3 = f5;
                    f4 = 1.0f;
                    e65Var = new e65(0, gy5Var, gy5.class, "onMapClicked", "onMapClicked()V", 0, 12);
                    oq5Var2.k0(e65Var);
                } else {
                    kb5Var4 = kb5Var7;
                    oy5Var2 = oy5Var3;
                    obj3 = obj4;
                    ozmVar2 = ozmVar3;
                    f3 = f5;
                    e65Var = K3;
                    f4 = 1.0f;
                    vciVar3 = vciVar4;
                }
                Function0 function03 = (Function0) ((h9f) e65Var);
                oq5Var = oq5Var2;
                vciVar = vciVar3;
                oy5Var = oy5Var2;
                Object obj5 = obj3;
                ozmVar = ozmVar2;
                kb5Var = kb5Var4;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var5;
                function0 = function02;
                float f6 = f3;
                f2 = f6;
                yci u = xp3.u(androidx.compose.foundation.layout.a.d(d.d(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.e(vciVar, false, null, null, function03, 7), 0.0f, f6, 0.0f, 0.0f, 13), f4), 3.0f), o5g.E(oq5Var));
                boolean f7 = oq5Var.f(M);
                Object K4 = oq5Var.K();
                if (f7) {
                    obj = obj5;
                } else {
                    obj = obj5;
                }
                K4 = new wq(M, 13);
                oq5Var.k0(K4);
                z = false;
                h(0, oq5Var, nfp.b(u, false, (Function1) K4), concat);
                oq5Var.p(false);
                i4 = -711627088;
            } else {
                kb5Var = kb5Var7;
                oy5Var = oy5Var3;
                oq5Var = oq5Var2;
                vciVar = vciVar4;
                i4 = -711627088;
                f2 = f5;
                z = false;
                obj = obj4;
                ozmVar = ozmVar3;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var5;
                function0 = function02;
                oq5Var.Z(-711627088);
                oq5Var.p(false);
            }
            String str3 = oy5Var.b;
            if (str3 != null) {
                oq5Var.Z(-705771994);
                ges j4 = nu0.j();
                long j5 = ((dq0) oq5Var.j(ozmVar)).b.a;
                obj2 = obj;
                vciVar2 = vciVar;
                xcs.b(str3, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f2, 0.0f, 0.0f, 13), j5, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j4, oq5Var, 48, 3120, 55288);
            } else {
                vciVar2 = vciVar;
                obj2 = obj;
                oq5Var.Z(i4);
            }
            oq5Var.p(z);
            List list = oy5Var.c;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                boolean z3 = z;
                z2 = true;
                oq5Var.Z(i4);
                oq5Var.p(z3);
            } else {
                oq5Var.Z(-705366483);
                nx0 g2 = qx0.g(8);
                int i8 = 4;
                float f8 = 4;
                nx0 g3 = qx0.g(f8);
                yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, f8, 0.0f, 0.0f, 13);
                eu6 eu6Var = lnc.a;
                boolean d2 = oq5Var.d(Integer.MAX_VALUE);
                Object K5 = oq5Var.K();
                if (d2 || K5 == obj2) {
                    float f9 = g2.d;
                    eu6 eu6Var2 = lnc.a;
                    float f10 = g3.d;
                    mnc.a.getClass();
                    qmc qmcVar = qmc.a;
                    K5 = new n5b(i8, new dnc(g2, g3, f9, eu6Var2, f10, new vmc()));
                    oq5Var.k0(K5);
                }
                kfh kfhVar = (kfh) K5;
                int i9 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, q);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(function0);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, kfhVar, kb5Var3);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var, i9, kb5Var);
                }
                g0g.U(oq5Var, H2, kb5Var8);
                oq5Var.Z(-1119830516);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    y((g5i) it.next(), oq5Var, 0);
                }
                z2 = true;
                f1d.u(oq5Var, false, true, false);
            }
            oq5Var.p(z2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(qy5Var, gy5Var, i2);
        }
    }

    public static final pjc k0(pjc pjcVar, CoroutineContext coroutineContext) {
        if (coroutineContext.get(o6c.l) == null) {
            return coroutineContext.equals(g.a) ? pjcVar : pjcVar instanceof hzc ? vut.D((hzc) pjcVar, coroutineContext, 0, null, 6) : new vc4(pjcVar, coroutineContext, 0, null, 12);
        }
        l1j.p(coroutineContext, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static kx7 l() {
        return new kx7(1.0f, 1.0f);
    }

    public static final o6g l0(oq5 oq5Var) {
        return y9w.T(u75.h(new d85(((dq0) oq5Var.j(eq0.a)).b.a), new d85(((q9b) oq5Var.j(s9b.a)).c(oq5Var))), 0.0f, 0.0f, 14);
    }

    public static final void m(uja ujaVar, rja rjaVar, hq5 hq5Var, int i2) {
        int i3;
        rjaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2033538850);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(ujaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(rjaVar) : oq5Var.h(rjaVar) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            yci a2 = a.a(vci.a, "collection_downloaded_tracks_block");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (ujaVar instanceof tja) {
                oq5Var.Z(-748331231);
                q((tja) ujaVar, rjaVar, oq5Var, i3 & 126);
                oq5Var.p(false);
            } else {
                if (!(ujaVar instanceof sja)) {
                    throw vz1.i(oq5Var, -1963804464, false);
                }
                oq5Var.Z(-748115936);
                p(((sja) ujaVar).a, 0, oq5Var);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(ujaVar, rjaVar, i2, 27);
        }
    }

    public static final File m0() {
        File file = new File(j3c.b().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final void n(List list, rja rjaVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        fvf fvfVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(413660114);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(rjaVar) : oq5Var2.h(rjaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            yci d2 = d.d(yciVar, 1.0f);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object K2 = oq5Var2.K();
            if (z || K2 == kjnVar) {
                K2 = new h50(list, 3);
                oq5Var2.k0(K2);
            }
            yci b2 = nfp.b(d2, false, (Function1) K2);
            q0k a3 = androidx.compose.foundation.layout.a.a(16, 0.0f, 2);
            nx0 g2 = qx0.g(8);
            hz2 hz2Var = b2c.l;
            boolean h2 = (i4 == 4) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var2.h(rjaVar))) | oq5Var2.h(mm6Var) | oq5Var2.f(a2);
            Object K3 = oq5Var2.K();
            if (h2 || K3 == kjnVar) {
                fvfVar = a2;
                i50 i50Var = new i50(list, rjaVar, mm6Var, fvfVar, 8);
                oq5Var2.k0(i50Var);
                K3 = i50Var;
            } else {
                fvfVar = a2;
            }
            oq5Var = oq5Var2;
            weo.i(b2, fvfVar, a3, false, g2, hz2Var, null, false, null, (Function1) K3, oq5Var, 221568, 456);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(list, rjaVar, yciVar, i2, 0);
        }
    }

    public static long n0(oq5 oq5Var) {
        return ((dq0) oq5Var.j(eq0.a)).c.c;
    }

    public static final void o(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1480809479);
        int i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            yci d2 = d.d(yciVar, 1.0f);
            q0k a2 = androidx.compose.foundation.layout.a.a(16, 0.0f, 2);
            nx0 g2 = qx0.g(8);
            hz2 hz2Var = b2c.l;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new xga(3);
                oq5Var.k0(K);
            }
            weo.i(d2, null, a2, false, g2, hz2Var, null, false, null, (Function1) K, oq5Var, 805527936, 458);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 27);
        }
    }

    public static int o0(v94 v94Var) {
        int i2 = v94Var.i(4);
        if (i2 == 15) {
            if (v94Var.b() >= 24) {
                return v94Var.i(24);
            }
            throw r7k.a(null, "AAC header insufficient data");
        }
        if (i2 < 13) {
            return b[i2];
        }
        throw r7k.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static final void p(int i2, int i3, hq5 hq5Var) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(94090719);
        int i5 = (oq5Var.d(i2) ? 4 : 2) | i3 | (oq5Var.g(true) ? 32 : 16);
        if (oq5Var.P(i5 & 1, (i5 & 19) != 18)) {
            vci vciVar = vci.a;
            irf.j(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13), true, null, oq5Var, 54);
            oq5Var.Z(-1556806242);
            o(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.b(vciVar, svd.a(oq5Var), vnj.i), 0.0f, 0.0f, 0.0f, 12, 7), oq5Var, 0);
            oq5Var.p(false);
            i4 = i2;
            v(i4, ((i5 << 3) & 112) | 6, 4, oq5Var, null, true);
        } else {
            i4 = i2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mz3(i4, i3, 4);
        }
    }

    public static final float[] p0(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final void q(tja tjaVar, rja rjaVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        int i4;
        List list = tjaVar.c;
        long j2 = tjaVar.b;
        ArrayList arrayList = tjaVar.d;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1241841785);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var2.f(tjaVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(rjaVar) : oq5Var2.h(rjaVar) ? 32 : 16;
        }
        int i5 = i3;
        if (oq5Var2.P(i5 & 1, (i5 & 19) != 18)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i6 = oq5Var2.P;
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
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            Resources resources = ((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b)).getResources();
            int i7 = tjaVar.a;
            boolean f2 = oq5Var2.f(arrayList) | oq5Var2.d(i7) | oq5Var2.e(j2);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (f2 || K == kjnVar) {
                K = resources.getQuantityString(R.plurals.total_downloaded_tracks, i7, tt0.C(i7)) + " · " + saf.M(j2);
                oq5Var2.k0(K);
            }
            String str = (String) K;
            String M = rvf.M(R.string.all_downloaded_tracks_title, oq5Var2);
            yci a3 = a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13), "collection_downloaded_tracks_header");
            int i8 = i5 & 112;
            boolean z = i8 == 32 || ((i5 & 64) != 0 && oq5Var2.h(rjaVar));
            Object K2 = oq5Var2.K();
            if (z || K2 == kjnVar) {
                i4 = 28;
                K2 = new yg6(i4, rjaVar);
                oq5Var2.k0(K2);
            } else {
                i4 = 28;
            }
            Function0 function0 = (Function0) K2;
            if (!(i7 > 3)) {
                function0 = null;
            }
            irf.h(M, a3, str, null, function0, false, null, false, "downloaded_tracks_show_more", oq5Var2, 100663344, 232);
            oq5 oq5Var3 = oq5Var2;
            if (list.isEmpty()) {
                oq5Var3.Z(1946204037);
            } else {
                oq5Var3.Z(1950549245);
                n(list, rjaVar, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.b(vciVar, svd.a(oq5Var3), vnj.i), 0.0f, 0.0f, 0.0f, 12, 7), oq5Var3, i8);
            }
            oq5Var3.p(false);
            yci a4 = a.a(vciVar, "collection_downloaded_tracks_pager");
            boolean f3 = oq5Var3.f(arrayList);
            Object K3 = oq5Var3.K();
            Object obj = K3;
            if (f3 || K3 == kjnVar) {
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ko6) it.next()).a);
                }
                oq5Var3.k0(arrayList2);
                obj = arrayList2;
            }
            List list2 = (List) obj;
            boolean f4 = oq5Var3.f(arrayList);
            Object K4 = oq5Var3.K();
            Object obj2 = K4;
            if (f4 || K4 == kjnVar) {
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ko6) it2.next()).b);
                }
                oq5Var3.k0(arrayList3);
                obj2 = arrayList3;
            }
            List list3 = (List) obj2;
            rjaVar.getClass();
            list3.getClass();
            oq5Var3.Z(-1666907866);
            boolean f5 = oq5Var3.f(list3);
            Object K5 = oq5Var3.K();
            if (f5 || K5 == kjnVar) {
                gs4 gs4Var = rjaVar.a;
                cka ckaVar = rjaVar.c;
                K5 = new w3e(list3, ckaVar.b, gs4Var, ckaVar, rjaVar.d, rjaVar.e);
                oq5Var3.k0(K5);
            }
            w3e w3eVar = (w3e) K5;
            oq5Var3.p(false);
            boolean f6 = oq5Var3.f(arrayList) | (i8 == 32 || ((i5 & 64) != 0 && oq5Var3.h(rjaVar)));
            Object K6 = oq5Var3.K();
            if (f6 || K6 == kjnVar) {
                K6 = new ar(27, arrayList, rjaVar);
                oq5Var3.k0(K6);
            }
            u(list2, w3eVar, a4, (pyc) K6, null, null, oq5Var3, 384, 48);
            oq5Var3.p(true);
            oq5Var = oq5Var3;
        } else {
            oq5Var2.S();
            oq5Var = oq5Var2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(tjaVar, rjaVar, i2, 28);
        }
    }

    public static final boolean q0(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                String className = stackTraceElement.getClassName();
                className.getClass();
                if (c.v(className, "com.facebook", false)) {
                    String className2 = stackTraceElement.getClassName();
                    className2.getClass();
                    if (!c.v(className2, "com.facebook.appevents.codeless", false)) {
                        String className3 = stackTraceElement.getClassName();
                        className3.getClass();
                        if (!c.v(className3, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (c.v(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (c.v(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!c.v(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final void r(final Function0 function0, final tvd tvdVar, final yci yciVar, hq5 hq5Var, final int i2) {
        boolean g2;
        Function0 function02;
        tvd tvdVar2;
        yci yciVar2;
        int i3;
        Function0 function03;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1841800909);
        int i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(tvdVar) ? 32 : 16;
        }
        if (((i4 | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            tvdVar2 = tvdVar;
            yciVar2 = yciVar;
            i3 = i2;
        } else {
            if (function0 == null) {
                oq5Var.Z(883823061);
                oq5Var.p(false);
                g2 = true;
            } else {
                oq5Var.Z(444152925);
                g2 = ((ma5) oq5Var.j(pa5.a)).g();
                oq5Var.p(false);
            }
            if (g2) {
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i5 = 0;
                    r.d = new Function2() { // from class: cab
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    zsd.r(function0, tvdVar, yciVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                                default:
                                    zsd.r(function0, tvdVar, yciVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            function02 = function0;
            tvdVar2 = tvdVar;
            yciVar2 = yciVar;
            i3 = i2;
            kjn kjnVar = gq5.a;
            if (tvdVar2 == null) {
                oq5Var.Z(883902090);
                oq5Var.p(false);
                function03 = null;
            } else {
                oq5Var.Z(883902091);
                boolean f2 = oq5Var.f(tvdVar2);
                Object K = oq5Var.K();
                if (f2 || K == kjnVar) {
                    K = new nr(tvdVar2, 18);
                    oq5Var.k0(K);
                }
                function03 = (Function0) K;
                oq5Var.p(false);
            }
            if (function03 == null) {
                oq5Var.Z(883946607);
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new s2(28);
                    oq5Var.k0(K2);
                }
                function03 = (Function0) K2;
            } else {
                oq5Var.Z(444154574);
            }
            oq5Var.p(false);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = szf.U(new or(21, function03));
                oq5Var.k0(K3);
            }
            if (((Boolean) ((sdr) K3).getValue()).booleanValue()) {
                oq5Var.Z(884059974);
                ug3.a(androidx.compose.ui.draw.a.b(wyf.s(d.e(d.d(yciVar2, 1.0f), 160), function03), new ex(9, function02)), oq5Var, 0);
            } else {
                oq5Var.Z(882671701);
            }
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i6 = i3;
            final yci yciVar3 = yciVar2;
            final tvd tvdVar3 = tvdVar2;
            final Function0 function04 = function02;
            final int i7 = 1;
            r2.d = new Function2() { // from class: cab
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i7;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            zsd.r(function04, tvdVar3, yciVar3, hq5Var2, rvf.R(i6 | 1));
                            break;
                        default:
                            zsd.r(function04, tvdVar3, yciVar3, hq5Var2, rvf.R(i6 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final rar r0(mm6 mm6Var, pjc pjcVar) {
        return x97.y(mm6Var, null, null, new g68(pjcVar, null, 17), 3);
    }

    public static final b s(Context context, Function1 function1) {
        cbh cbhVar;
        erb erbVar;
        context.getClass();
        frb frbVar = new frb();
        function1.invoke(frbVar);
        ScheduledExecutorService scheduledExecutorService = frbVar.c;
        if (scheduledExecutorService != null) {
            cbhVar = new cbh(false, scheduledExecutorService);
        } else {
            jyr jyrVar = b.l;
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new lp7(2, Executors.defaultThreadFactory()));
            newSingleThreadScheduledExecutor.getClass();
            cbhVar = new cbh(true, newSingleThreadScheduledExecutor);
        }
        erb erbVar2 = frbVar.f;
        if (erbVar2 == null) {
            drb drbVar = new drb();
            dw1 dw1Var = drbVar.a;
            if (dw1Var == null) {
                dw1Var = new dw1(true);
            }
            lqa lqaVar = new lqa();
            xqr xqrVar = drbVar.b;
            if (xqrVar == null) {
                xqrVar = new xqr(false, false, false);
            }
            erbVar = new erb(dw1Var, lqaVar, xqrVar, drbVar.c, drbVar.d, drbVar.e);
        } else {
            erbVar = erbVar2;
        }
        kma kmaVar = new kma(5, erbVar);
        qsb qsbVar = new qsb(context);
        kmaVar.invoke(qsbVar);
        rsb a2 = qsbVar.a();
        OkHttpClient okHttpClient = frbVar.a;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient(new joj());
        }
        cwh cwhVar = frbVar.b;
        if (cwhVar == null) {
            cwhVar = wdp.P(e27.D);
        }
        cbh cbhVar2 = cbhVar;
        h1b h1bVar = new h1b();
        a1t a1tVar = frbVar.d;
        if (a1tVar == null) {
            a1tVar = new dt7(context, new androidx.media3.exoplayer.trackselection.a(new us7()), new b2c());
        }
        leg legVar = frbVar.e;
        if (legVar == null) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            legVar = new iwe(7, applicationContext, new keg());
        }
        return new b(context, okHttpClient, cwhVar, cbhVar2, h1bVar, a1tVar, legVar, a2, new gsa(), erbVar);
    }

    public static final yc4 s0(pjc pjcVar, Function2 function2) {
        int i2 = tlc.a;
        return M0(pjcVar, new l1(function2, (Continuation) null, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(int i2, int i3, wn5 wn5Var, wn5 wn5Var2, hq5 hq5Var, yci yciVar, boolean z) {
        int i4;
        yci yciVar2;
        int i5;
        boolean z2;
        yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1059574193);
        int i6 = 4;
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(wn5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(wn5Var2) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= oq5Var.g(z2) ? 2048 : 1024;
                if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
                    vci vciVar = vci.a;
                    if (i7 != 0) {
                        yciVar2 = vciVar;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = szf.g0(Boolean.FALSE);
                        oq5Var.k0(K);
                    }
                    aqi aqiVar = (aqi) K;
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new qs(aqiVar, null, i6);
                        oq5Var.k0(K2);
                    }
                    bzf.c((Function1) K2, oq5Var, 0);
                    yci d2 = d.d(yciVar2, 1.0f);
                    kx0 kx0Var = qx0.c;
                    gz2 gz2Var = b2c.n;
                    ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
                    int i8 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, d2);
                    xp5.T.getClass();
                    int i9 = i4;
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, a2, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    yci yciVar4 = yciVar2;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var, i8, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    Object K3 = oq5Var.K();
                    if (K3 == kjnVar) {
                        K3 = new x80(aqiVar, 15);
                        oq5Var.k0(K3);
                    }
                    yci b2 = nfp.b(vciVar, false, (Function1) K3);
                    kfh d3 = ug3.d(b2c.b, false);
                    int i10 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, b2);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d3, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                        ouj.x(i10, oq5Var, i10, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    wn5Var.invoke(oq5Var, Integer.valueOf(i9 & 14));
                    oq5Var.p(true);
                    yci Q = bfg.Q(vciVar, bfg.C(oq5Var), z2, 12);
                    ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
                    int i11 = oq5Var.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, Q);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a3, kb5Var);
                    g0g.U(oq5Var, l3, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                        ouj.x(i11, oq5Var, i11, kb5Var3);
                    }
                    g0g.U(oq5Var, H3, kb5Var4);
                    wn5Var2.invoke(wa5.a, oq5Var, Integer.valueOf((i9 & 112) | 6));
                    oq5Var.p(true);
                    WeakHashMap weakHashMap = rqv.w;
                    u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
                    oq5Var.p(true);
                    yciVar3 = yciVar4;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                }
                boolean z3 = z2;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new i5d(wn5Var, wn5Var2, yciVar3, z3, i2, i3);
                    return;
                }
                return;
            }
            z2 = z;
            if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            }
            boolean z32 = z2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
        }
        boolean z322 = z2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final tc4 t0(Iterable iterable) {
        int i2 = tlc.a;
        return new tc4(iterable, g.a, -2, oi3.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(List list, o3e o3eVar, yci yciVar, pyc pycVar, o0k o0kVar, pyc pycVar2, hq5 hq5Var, int i2, int i3) {
        int i4;
        o0k o0kVar2;
        pyc pycVar3;
        oq5 oq5Var;
        pyc pycVar4;
        xmn r;
        o0k o0kVar3;
        pyc pycVar5;
        int i5;
        list.getClass();
        o3eVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(29314684);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.h(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(o3eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var2.h(pycVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                o0kVar2 = o0kVar;
                if (oq5Var2.f(o0kVar2)) {
                    i5 = 16384;
                    i4 |= i5;
                }
            } else {
                o0kVar2 = o0kVar;
            }
            i5 = RemoteCameraConfig.Notification.ID;
            i4 |= i5;
        } else {
            o0kVar2 = o0kVar;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            pycVar3 = pycVar2;
            i4 |= oq5Var2.h(pycVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if (oq5Var2.P(i4 & 1, (74899 & i4) == 74898)) {
                oq5Var = oq5Var2;
                oq5Var.S();
                pycVar4 = pycVar3;
            } else {
                oq5Var2.U();
                if ((i2 & 1) == 0 || oq5Var2.y()) {
                    if ((i3 & 16) != 0) {
                        o0kVar2 = i3e.b;
                        i4 &= -57345;
                    }
                    if (i6 != 0) {
                        o0kVar3 = o0kVar2;
                        pycVar5 = null;
                        oq5Var2.q();
                        oq5Var = oq5Var2;
                        d3e.a(list.size(), o0kVar3, yciVar, 0.0f, 3, 4, 0.0f, false, pycVar5, ild.C(-878872226, new m3e(0, list, o3eVar, pycVar), oq5Var2), oq5Var, ((i4 >> 9) & 112) | 805527552 | (i4 & 896) | ((i4 << 9) & 234881024), 200);
                        o0kVar2 = o0kVar3;
                        pycVar4 = pycVar5;
                    }
                } else {
                    oq5Var2.S();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                }
                o0kVar3 = o0kVar2;
                pycVar5 = pycVar3;
                oq5Var2.q();
                oq5Var = oq5Var2;
                d3e.a(list.size(), o0kVar3, yciVar, 0.0f, 3, 4, 0.0f, false, pycVar5, ild.C(-878872226, new m3e(0, list, o3eVar, pycVar), oq5Var2), oq5Var, ((i4 >> 9) & 112) | 805527552 | (i4 & 896) | ((i4 << 9) & 234881024), 200);
                o0kVar2 = o0kVar3;
                pycVar4 = pycVar5;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new fd1(list, o3eVar, yciVar, pycVar, o0kVar2, pycVar4, i2, i3);
                return;
            }
            return;
        }
        pycVar3 = pycVar2;
        if (oq5Var2.P(i4 & 1, (74899 & i4) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final tc4 u0(pjc... pjcVarArr) {
        int i2 = tlc.a;
        return t0(xz0.q(pjcVarArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(int i2, int i3, int i4, hq5 hq5Var, yci yciVar, boolean z) {
        int i5;
        yci yciVar2;
        yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-256152138);
        boolean z2 = z;
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.g(z2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var.d(i2) ? 32 : 16;
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 256 : 128;
            if (oq5Var.P(i5 & 1, (i5 & 147) == 146)) {
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                yciVar3 = i6 != 0 ? vci.a : yciVar2;
                boolean z3 = i2 >= 6;
                yci d2 = d.d(yciVar3, 1.0f);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, d2);
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
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                oq5Var.Z(57500684);
                int min = Math.min(i2, 3);
                int i8 = 0;
                while (i8 < min) {
                    n7w.u(z2, null, false, z3, oq5Var, i5 & 14, 6);
                    i8++;
                    z2 = z;
                }
                oq5Var.p(false);
                oq5Var.p(true);
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new j3e(z, i2, yciVar3, i3, i4);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i5 & 1, (i5 & 147) == 146)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final float[] v0(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final void w(final int i2, hq5 hq5Var, final yci yciVar, boolean z, boolean z2) {
        final boolean z3;
        final boolean z4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-430444267);
        int i3 = ((i2 & 6) == 0 ? (oq5Var.g(z) ? 4 : 2) | i2 : i2) | 48;
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.g(z2) ? 256 : 128;
        }
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            vci vciVar = vci.a;
            yci d2 = d.d(vciVar, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
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
            oq5Var.Z(-1096247652);
            for (int i5 = 0; i5 < 3; i5++) {
                n7w.u(z, null, z2, false, oq5Var, i3 & 910, 10);
            }
            z3 = z;
            z4 = z2;
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            z3 = z;
            z4 = z2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: l3e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zsd.w(rvf.R(i2 | 1), (hq5) obj, yciVar, z3, z4);
                    return Unit.a;
                }
            };
        }
    }

    public static final float[] w0(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final void x(List list, cdf cdfVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        list.getClass();
        cdfVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2065642956);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(cdfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, list, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(0.0f, 24, 0.0f, 16, 5));
            yci a2 = a.a(d.c(vci.a, 1.0f), "collection_kids_albums_lazy_column");
            boolean h2 = oq5Var.h(list) | oq5Var.h(cdfVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dae(5, list, cdfVar);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 13, list, cdfVar, fvfVar, o0kVar);
        }
    }

    public static c1 x0(v94 v94Var, boolean z) {
        int i2 = v94Var.i(5);
        if (i2 == 31) {
            i2 = v94Var.i(6) + 32;
        }
        int o0 = o0(v94Var);
        int i3 = v94Var.i(4);
        String i4 = k5r.i(i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            o0 = o0(v94Var);
            int i5 = v94Var.i(5);
            if (i5 == 31) {
                i5 = v94Var.i(6) + 32;
            }
            i2 = i5;
            if (i2 == 22) {
                i3 = v94Var.i(4);
            }
        }
        if (z) {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6 && i2 != 7 && i2 != 17) {
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw r7k.c("Unsupported audio object type: " + i2);
                }
            }
            if (v94Var.h()) {
                vq1.n0("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (v94Var.h()) {
                v94Var.t(14);
            }
            boolean h2 = v94Var.h();
            if (i3 == 0) {
                q.i();
                return null;
            }
            if (i2 == 6 || i2 == 20) {
                v94Var.t(3);
            }
            if (h2) {
                if (i2 == 22) {
                    v94Var.t(16);
                }
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    v94Var.t(3);
                }
                v94Var.t(1);
            }
            switch (i2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i6 = v94Var.i(2);
                    if (i6 == 2 || i6 == 3) {
                        throw r7k.c("Unsupported epConfig: " + i6);
                    }
            }
        }
        int i7 = c[i3];
        if (i7 != -1) {
            return new c1(o0, i7, i4);
        }
        throw r7k.a(null, null);
    }

    public static final void y(g5i g5iVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1681271967);
        if ((((oq5Var.f(g5iVar) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
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
            oq5Var.Z(-1430691559);
            Iterator it = g5iVar.b.iterator();
            while (it.hasNext()) {
                float f2 = 8;
                ug3.a(androidx.compose.foundation.a.b(d.m(xp3.u(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f2, 0.0f, 11), ugo.a), f2), c3x.f(((Number) it.next()).intValue()), vnj.i), oq5Var, 0);
            }
            oq5Var.p(false);
            String o = ouj.o(rvf.M(R.string.metro_station_content_description, oq5Var), StringUtil.SPACE, g5iVar.a);
            String str = g5iVar.a;
            ges i4 = nu0.i();
            long j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
            boolean f3 = oq5Var.f(o);
            Object K = oq5Var.K();
            if (f3 || K == gq5.a) {
                K = new wq(o, 14);
                oq5Var.k0(K);
            }
            xcs.b(str, nfp.b(vciVar, false, (Function1) K), j2, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, i4, oq5Var, 0, 3120, 55288);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(g5iVar, i2, 12);
        }
    }

    public static final JSONObject y0(String str) {
        File m0 = m0();
        if (m0 != null && str != null) {
            try {
                return new JSONObject(gvt.N(new FileInputStream(new File(m0, str))));
            } catch (Exception unused) {
                Z(str);
            }
        }
        return null;
    }

    public static final ny9 z(e09 e09Var) {
        int ordinal = e09Var.ordinal();
        if (ordinal == 0) {
            return ny9.d;
        }
        if (ordinal == 1) {
            return ny9.b;
        }
        if (ordinal == 2) {
            return ny9.a;
        }
        if (ordinal == 3) {
            return ny9.c;
        }
        b6e.s();
        return null;
    }

    public static final clc z0(pjc pjcVar, long j2, Function2 function2) {
        if (j2 > 0) {
            return new clc(pjcVar, new glc(j2, function2, null));
        }
        xq0.o(dfi.d(j2, "Expected positive amount of retries, but had "));
        return null;
    }

    public abstract int B(int i2, int i3, ksk kskVar);

    public Integer G(ksk kskVar) {
        return null;
    }
}
