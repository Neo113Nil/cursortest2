package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class V2 implements InterfaceC3329i1, InterfaceC3725pL, InterfaceC3231gB, G0, M0, S0, InterfaceC3437k3, InterfaceC3814r3, F5, InterfaceC2919aL {

    /* renamed from: v, reason: collision with root package name */
    public static Cipher f28073v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28078n;

    /* renamed from: u, reason: collision with root package name */
    public static final V2 f28072u = new V2(0);

    /* renamed from: w, reason: collision with root package name */
    public static final Object f28074w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final Object f28075x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final V2 f28076y = new V2(2);

    /* renamed from: z, reason: collision with root package name */
    public static final V2 f28077z = new V2(3);

    /* renamed from: A, reason: collision with root package name */
    public static final V2 f28064A = new V2(4);

    /* renamed from: B, reason: collision with root package name */
    public static final V2 f28065B = new V2(5);

    /* renamed from: C, reason: collision with root package name */
    public static final V2 f28066C = new V2(7);

    /* renamed from: D, reason: collision with root package name */
    public static final V2 f28067D = new V2(8);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ V2 f28068E = new V2(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ V2 f28069F = new V2(12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ V2 f28070G = new V2(13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ V2 f28071H = new V2(16);

    public /* synthetic */ V2(int i) {
        this.f28078n = i;
    }

    public static final LL A(Object obj) {
        VK vk = (VK) obj;
        LL ll = vk.zzt;
        if (ll != LL.f26106f) {
            return ll;
        }
        LL a9 = LL.a();
        vk.zzt = a9;
        return a9;
    }

    public static final void E(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append("javascript: ");
                sb.append(str);
                webView.loadUrl(sb.toString());
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static H3.q m(AbstractC3171f5 abstractC3171f5, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(abstractC3171f5.e());
        URL url = new URL(abstractC3171f5.f30044v);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = abstractC3171f5.f30041E.f2133a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z3 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (abstractC3171f5.f30043u != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] f3 = abstractC3171f5.f();
                if (f3 != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(f3);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                H3.q qVar = new H3.q(responseCode, t(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return qVar;
            }
            try {
                return new H3.q(responseCode, t(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C3763q5(httpURLConnection, 0));
            } catch (Throwable th) {
                th = th;
                z3 = true;
                if (!z3) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static C3226g6 n(final long j6) {
        return C3226g6.f(new Z5() { // from class: com.google.android.gms.internal.ads.I5
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((C2958b6) obj).f29214a.b(C3226g6.b(j6));
                    return Optional.empty();
                } catch (X5 unused) {
                    return Optional.of(B5.f23843u);
                }
            }
        });
    }

    public static final Z8 o(Context context, X8 x82) {
        com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p(context, 5);
        Z8 z82 = new Z8(pVar);
        C3481ku c3481ku = new C3481ku(pVar, x82, z82);
        S0.e eVar = new S0.e(pVar, z82, 9, false);
        synchronized (pVar.f23471w) {
            W8 w82 = new W8(context, C4835j.f39733C.f39754t.b(), c3481ku, eVar, 0);
            pVar.f23470v = w82;
            w82.o();
        }
        return z82;
    }

    public static String p(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f28074w) {
                w().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = w().doFinal(bArr2);
                iv = w().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e9) {
            throw new C3711p7(e9);
        } catch (NoSuchAlgorithmException e10) {
            throw new C3711p7(e10);
        } catch (BadPaddingException e11) {
            throw new C3711p7(e11);
        } catch (IllegalBlockSizeException e12) {
            throw new C3711p7(e12);
        } catch (NoSuchPaddingException e13) {
            throw new C3711p7(e13);
        }
    }

    public static final void q(C4300b c4300b, C2570Gf c2570Gf) {
        File externalStorageDirectory;
        Context context = (Context) c2570Gf.f25044w;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        String str = (String) c2570Gf.f25045x;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c2570Gf.f25043v;
        c4300b.f35652e = context;
        c4300b.f35653f = str;
        c4300b.f35651d = (String) c2570Gf.f25042u;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c4300b.f35655h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC2650La.f26123c.r()).booleanValue());
        if (((AtomicBoolean) c4300b.f35655h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            c4300b.i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) c4300b.f35649b).put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC3413jg.f31268a.execute(new RunnableC3111e(12, c4300b));
        HashMap hashMap = (HashMap) c4300b.f35650c;
        C3623na c3623na = C3623na.f32734c;
        hashMap.put(NativeAdvancedJsUtils.f17906p, c3623na);
        hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, c3623na);
        hashMap.put("e", C3623na.f32735d);
    }

    public static final SharedPreferences s(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e9) {
            v2.i.g("", e9);
            return null;
        }
    }

    public static ArrayList t(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Z4((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void u(long j6, Qx qx, boolean z3) {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j9 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        long j17 = (((((~j9) & j10) | j11) + ((j9 & j12) | j13)) - j14) + j15;
        long j18 = j16 % 1629190168;
        long j19 = z3 ? (j6 + j6) ^ (j6 >> 63) : j6;
        int i = 1;
        while (true) {
            long j20 = j17 ^ j18;
            long j21 = j19 >>> 7;
            boolean z6 = j21 != 0 || i < 0;
            int i6 = (int) (j19 & j20);
            if (z6) {
                i6 = ((i6 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) qx.f27139u).write((byte) i6);
            if (!z6) {
                return;
            }
            i++;
            j19 = j21;
        }
    }

    public static byte[] v(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = decode.length;
            if (length2 <= 16) {
                throw new C3711p7();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(decode);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f28074w) {
                w().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = w().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e9) {
            throw new C3711p7(e9);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new C3711p7(e10);
        } catch (InvalidKeyException e11) {
            throw new C3711p7(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new C3711p7(e12);
        } catch (BadPaddingException e13) {
            throw new C3711p7(e13);
        } catch (IllegalBlockSizeException e14) {
            throw new C3711p7(e14);
        } catch (NoSuchPaddingException e15) {
            throw new C3711p7(e15);
        }
    }

    public static final Cipher w() {
        Cipher cipher;
        synchronized (f28075x) {
            try {
                if (f28073v == null) {
                    f28073v = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f28073v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public static boolean y(int i, C4242z c4242z, Object obj) {
        int i6 = c4242z.f35257n;
        int i9 = i6 >>> 3;
        int i10 = i6 & 7;
        W7.b bVar = (W7.b) c4242z.f35260w;
        if (i10 == 0) {
            c4242z.u(0);
            ((LL) obj).d(i9 << 3, Long.valueOf(bVar.q()));
            return true;
        }
        if (i10 == 1) {
            c4242z.u(1);
            ((LL) obj).d((i9 << 3) | 1, Long.valueOf(bVar.s()));
            return true;
        }
        if (i10 == 2) {
            ((LL) obj).d((i9 << 3) | 2, c4242z.D());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new C3295hL("Protocol message end-group tag did not match expected tag.");
            }
            if (i10 != 5) {
                throw new C3241gL();
            }
            c4242z.u(5);
            ((LL) obj).d(5 | (i9 << 3), Integer.valueOf(bVar.t()));
            return true;
        }
        LL a9 = LL.a();
        int i11 = i9 << 3;
        int i12 = i + 1;
        if (i12 >= 100) {
            throw new C3295hL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c4242z.B() != Integer.MAX_VALUE && y(i12, c4242z, a9)) {
        }
        if ((i11 | 4) != c4242z.f35257n) {
            throw new C3295hL("Protocol message end-group tag did not match expected tag.");
        }
        if (a9.f26111e) {
            a9.f26111e = false;
        }
        ((LL) obj).d(i11 | 3, a9);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void B() {
        switch (this.f28078n) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.S0
    public InterfaceC3543m1 C(int i, int i6) {
        switch (this.f28078n) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return new O0();
        }
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void D(InterfaceC3113e1 interfaceC3113e1) {
        switch (this.f28078n) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public /* synthetic */ Constructor mo15c() {
        switch (this.f28078n) {
            case 12:
                int[] iArr = N0.f26384v;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(Q0.class).getConstructor(new Class[0]);
            default:
                int[] iArr2 = N0.f26384v;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(Q0.class).getConstructor(Integer.TYPE);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725pL
    public boolean d(Class cls) {
        return VK.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725pL
    public C4264zL e(Class cls) {
        if (!VK.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C4264zL) VK.t(cls.asSubclass(VK.class)).w(3, null);
        } catch (Exception e9) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3814r3
    public boolean f(DP dp) {
        switch (this.f28078n) {
            case 18:
                String str = dp.f24431o;
                return Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8434P) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8433O) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.ab) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.Y) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.aa) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.af) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.ae) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.aj) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8443Z);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.F5
    public byte g(M5 m52, int i) {
        return m52.b(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    public long h(K0 k02) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.F5
    public F5 i() {
        return new V2(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3814r3
    public int j(DP dp) {
        char c9;
        switch (this.f28078n) {
            case 18:
                String str = dp.f24431o;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aj)) {
                                c9 = 7;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1248334819:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.af)) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1026075066:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ab)) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1004728940:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8433O)) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 691401887:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aa)) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 822864842:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8434P)) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1157994102:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ae)) {
                                c9 = 6;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1668750253:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.Y)) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1693976202:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8443Z)) {
                                c9 = '\b';
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        case 0:
                        case 1:
                        case 3:
                        case '\b':
                            return 1;
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            return 2;
                    }
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                return 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3814r3
    public InterfaceC3868s3 k(DP dp) {
        char c9;
        InterfaceC3868s3 interfaceC3868s3;
        switch (this.f28078n) {
            case 18:
                String str = dp.f24431o;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aj)) {
                                c9 = 7;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1248334819:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.af)) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1026075066:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ab)) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1004728940:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8433O)) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 691401887:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aa)) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 822864842:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8434P)) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1157994102:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ae)) {
                                c9 = 6;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1668750253:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.Y)) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1693976202:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8443Z)) {
                                c9 = '\b';
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    List list = dp.f24434r;
                    switch (c9) {
                        case 0:
                            interfaceC3868s3 = new E3(list);
                            break;
                        case 1:
                            return new S0.e(8);
                        case 2:
                            return new C3694or(5);
                        case 3:
                            return new I3();
                        case 4:
                            interfaceC3868s3 = new R3(list);
                            break;
                        case 5:
                            return new C2570Gf(3);
                        case 6:
                            interfaceC3868s3 = new T3(list);
                            break;
                        case 7:
                            C3 c32 = new C3();
                            Cr cr = new Cr((byte[]) list.get(0));
                            int L6 = cr.L();
                            int L8 = cr.L();
                            Paint paint = new Paint();
                            c32.f24020n = paint;
                            paint.setStyle(Paint.Style.FILL_AND_STROKE);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                            paint.setPathEffect(null);
                            Paint paint2 = new Paint();
                            c32.f24021u = paint2;
                            paint2.setStyle(Paint.Style.FILL);
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                            paint2.setPathEffect(null);
                            c32.f24022v = new Canvas();
                            int i = 719;
                            c32.f24023w = new C4084w3(i, 575, 0, i, 0, 575);
                            c32.f24024x = new C4030v3(0, new int[]{0, -1, -16777216, -8421505}, C3.f(), C3.j());
                            c32.f24025y = new B3(L6, L8);
                            interfaceC3868s3 = c32;
                            break;
                        case '\b':
                            return new N3();
                    }
                    return interfaceC3868s3;
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // com.google.android.gms.internal.ads.F5
    public M5 l(M5 m52, int i, int i6) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i < 0 || i > i6 || i6 > (length = (bArr = m52.f26246a).length) || i > i6 || i6 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i9 = i6 - i;
        if (i9 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i9];
            System.arraycopy(bArr, i, bArr3, 0, i9);
            bArr2 = bArr3;
        }
        return new M5(bArr2);
    }

    public long r() {
        return SystemClock.elapsedRealtime();
    }

    public String toString() {
        switch (this.f28078n) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public C3212ft x(Looper looper, Handler.Callback callback) {
        return new C3212ft(new Handler(looper, callback));
    }

    public void z(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append('\"');
                        sb.append(obj2);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                E(webView, sb2);
            } else {
                handler.post(new RunnableC3048cq(this, webView, sb2));
            }
        }
    }

    public /* synthetic */ V2(boolean z3) {
        this.f28078n = 21;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    /* renamed from: i, reason: collision with other method in class */
    public InterfaceC3113e1 mo9i() {
        return new V0(com.anythink.basead.exoplayer.b.f6382b, 0L);
    }

    public V2(C3227g7 c3227g7, Bw bw) {
        this.f28078n = 24;
        Objects.requireNonNull(c3227g7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public /* synthetic */ Object mo15c() {
        int i = C3112e0.f29866a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e9) {
            throw new IllegalStateException(e9);
        }
    }

    private final void F() {
    }

    private final void G(InterfaceC3113e1 interfaceC3113e1) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    public void a(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.G0
    public long b(long j6) {
        return j6;
    }
}
