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
import com.google.android.gms.internal.consent_sdk.C4313b;
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

/* loaded from: classes2.dex */
public final class T2 implements InterfaceC3234g1, InterfaceC4277zL, InterfaceC3404jB, F0, K0, Q0, InterfaceC3344i3, InterfaceC3720p3, D5, InterfaceC3468kL {

    /* renamed from: v, reason: collision with root package name */
    public static Cipher f27688v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27693n;

    /* renamed from: u, reason: collision with root package name */
    public static final T2 f27687u = new T2(0);

    /* renamed from: w, reason: collision with root package name */
    public static final Object f27689w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final Object f27690x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final T2 f27691y = new T2(2);

    /* renamed from: z, reason: collision with root package name */
    public static final T2 f27692z = new T2(3);

    /* renamed from: A, reason: collision with root package name */
    public static final T2 f27679A = new T2(4);

    /* renamed from: B, reason: collision with root package name */
    public static final T2 f27680B = new T2(5);

    /* renamed from: C, reason: collision with root package name */
    public static final T2 f27681C = new T2(7);

    /* renamed from: D, reason: collision with root package name */
    public static final T2 f27682D = new T2(8);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ T2 f27683E = new T2(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ T2 f27684F = new T2(12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ T2 f27685G = new T2(13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ T2 f27686H = new T2(16);

    public /* synthetic */ T2(int i) {
        this.f27693n = i;
    }

    public static /* bridge */ XL B(Object obj) {
        AbstractC3199fL abstractC3199fL = (AbstractC3199fL) obj;
        XL xl = abstractC3199fL.zzt;
        if (xl != XL.f28633f) {
            return xl;
        }
        XL a9 = XL.a();
        abstractC3199fL.zzt = a9;
        return a9;
    }

    public static final void D(WebView webView, String str) {
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
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public static boolean E(int i, C4201y c4201y, Object obj) {
        int i4 = c4201y.f35292n;
        int i9 = i4 >>> 3;
        int i10 = i4 & 7;
        S7.b bVar = (S7.b) c4201y.f35295w;
        if (i10 == 0) {
            c4201y.u(0);
            ((XL) obj).d(i9 << 3, Long.valueOf(bVar.q()));
            return true;
        }
        if (i10 == 1) {
            c4201y.u(1);
            ((XL) obj).d((i9 << 3) | 1, Long.valueOf(bVar.s()));
            return true;
        }
        if (i10 == 2) {
            ((XL) obj).d((i9 << 3) | 2, c4201y.D());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new C3845rL("Protocol message end-group tag did not match expected tag.");
            }
            if (i10 != 5) {
                throw new C3792qL();
            }
            c4201y.u(5);
            ((XL) obj).d(5 | (i9 << 3), Integer.valueOf(bVar.t()));
            return true;
        }
        XL a9 = XL.a();
        int i11 = i9 << 3;
        int i12 = i + 1;
        if (i12 >= 100) {
            throw new C3845rL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c4201y.B() != Integer.MAX_VALUE && E(i12, c4201y, a9)) {
        }
        if ((i11 | 4) != c4201y.f35292n) {
            throw new C3845rL("Protocol message end-group tag did not match expected tag.");
        }
        if (a9.f28638e) {
            a9.f28638e = false;
        }
        ((XL) obj).d(i11 | 3, a9);
        return true;
    }

    public static F3.q m(AbstractC3074d5 abstractC3074d5, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(abstractC3074d5.e());
        URL url = new URL(abstractC3074d5.f29795v);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = abstractC3074d5.f29792E.f2319a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z8 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (abstractC3074d5.f29794u != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] f6 = abstractC3074d5.f();
                if (f6 != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(f6);
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
                F3.q qVar = new F3.q(responseCode, t(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return qVar;
            }
            try {
                return new F3.q(responseCode, t(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C3668o5(httpURLConnection, 0));
            } catch (Throwable th) {
                th = th;
                z8 = true;
                if (!z8) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static C3020c6 n(final long j9) {
        return C3020c6.f(new W5() { // from class: com.google.android.gms.internal.ads.G5
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((Y5) obj).f28787a.b(C3020c6.b(j9));
                    return Optional.empty();
                } catch (U5 unused) {
                    return Optional.of(EnumC4261z5.f35473u);
                }
            }
        });
    }

    public static final W8 o(Context context, U8 u82) {
        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(context, 5);
        W8 w82 = new W8(oVar);
        C3602mu c3602mu = new C3602mu(oVar, u82, w82);
        C2881Yl c2881Yl = new C2881Yl(oVar, w82);
        synchronized (oVar.f23625w) {
            T8 t82 = new T8(context, p2.j.f39798C.f39819t.b(), c3602mu, c2881Yl, 0);
            oVar.f23624v = t82;
            t82.o();
        }
        return w82;
    }

    public static String p(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f27689w) {
                z().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = z().doFinal(bArr2);
                iv = z().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e6) {
            throw new C3616n7(e6);
        } catch (NoSuchAlgorithmException e9) {
            throw new C3616n7(e9);
        } catch (BadPaddingException e10) {
            throw new C3616n7(e10);
        } catch (IllegalBlockSizeException e11) {
            throw new C3616n7(e11);
        } catch (NoSuchPaddingException e12) {
            throw new C3616n7(e12);
        }
    }

    public static final void q(C4313b c4313b, C2518Df c2518Df) {
        File externalStorageDirectory;
        Context context = (Context) c2518Df.f24455w;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        String str = (String) c2518Df.f24456x;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c2518Df.f24454v;
        c4313b.f35815e = context;
        c4313b.f35816f = str;
        c4313b.f35814d = (String) c2518Df.f24453u;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c4313b.f35818h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC2564Ga.f25179c.r()).booleanValue());
        if (((AtomicBoolean) c4313b.f35818h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            c4313b.i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) c4313b.f35812b).put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC3212fg.f30738a.execute(new RunnableC3068d(12, c4313b));
        HashMap hashMap = (HashMap) c4313b.f35813c;
        C3474ka c3474ka = C3474ka.f32308c;
        hashMap.put(NativeAdvancedJsUtils.f18064p, c3474ka);
        hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, c3474ka);
        hashMap.put("e", C3474ka.f32309d);
    }

    public static final SharedPreferences s(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e6) {
            u2.i.g("", e6);
            return null;
        }
    }

    public static ArrayList t(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new X4((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void u(long j9, Rx rx, boolean z8) {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
        long j19 = j17 % 1629190168;
        long j20 = z8 ? (j9 + j9) ^ (j9 >> 63) : j9;
        int i = 1;
        while (true) {
            long j21 = j18 ^ j19;
            long j22 = j20 >>> 7;
            boolean z9 = j22 != 0 || i < 0;
            int i4 = (int) (j20 & j21);
            if (z9) {
                i4 = ((i4 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) rx.f27448u).write((byte) i4);
            if (!z9) {
                return;
            }
            i++;
            j20 = j22;
        }
    }

    public static byte[] y(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = decode.length;
            if (length2 <= 16) {
                throw new C3616n7();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(decode);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f27689w) {
                z().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = z().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e6) {
            throw new C3616n7(e6);
        } catch (InvalidAlgorithmParameterException e9) {
            throw new C3616n7(e9);
        } catch (InvalidKeyException e10) {
            throw new C3616n7(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new C3616n7(e11);
        } catch (BadPaddingException e12) {
            throw new C3616n7(e12);
        } catch (IllegalBlockSizeException e13) {
            throw new C3616n7(e13);
        } catch (NoSuchPaddingException e14) {
            throw new C3616n7(e14);
        }
    }

    public static final Cipher z() {
        Cipher cipher;
        synchronized (f27690x) {
            try {
                if (f27688v == null) {
                    f27688v = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f27688v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public C3709ot A(Looper looper, Handler.Callback callback) {
        return new C3709ot(new Handler(looper, callback));
    }

    public void C(WebView webView, String str, Object... objArr) {
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
                D(webView, sb2);
            } else {
                handler.post(new RunnableC3329hp(this, webView, sb2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Constructor a() {
        switch (this.f27693n) {
            case 12:
                int[] iArr = L0.f26082v;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(O0.class).getConstructor(new Class[0]);
            default:
                int[] iArr2 = L0.f26082v;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(O0.class).getConstructor(Integer.TYPE);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277zL
    public boolean c(Class cls) {
        return AbstractC3199fL.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277zL
    public KL e(Class cls) {
        if (!AbstractC3199fL.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (KL) AbstractC3199fL.t(cls.asSubclass(AbstractC3199fL.class)).w(3, null);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.D5
    public byte f(J5 j52, int i) {
        return j52.b(i);
    }

    @Override // com.google.android.gms.internal.ads.D5
    public J5 g(J5 j52, int i, int i4) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i < 0 || i > i4 || i4 > (length = (bArr = j52.f25735a).length) || i > i4 || i4 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i9 = i4 - i;
        if (i9 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i9];
            System.arraycopy(bArr, i, bArr3, 0, i9);
            bArr2 = bArr3;
        }
        return new J5(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    public long h(J0 j02) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.D5
    public D5 i() {
        return new T2(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3720p3
    public boolean j(TP tp) {
        switch (this.f27693n) {
            case 18:
                String str = tp.f27776o;
                return Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8591P) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8590O) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.ab) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.Y) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.aa) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.af) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.ae) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.aj) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8600Z);
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3720p3
    public int k(TP tp) {
        char c4;
        switch (this.f27693n) {
            case 18:
                String str = tp.f27776o;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aj)) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1248334819:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.af)) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1026075066:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ab)) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1004728940:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8590O)) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 691401887:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aa)) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 822864842:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8591P)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1157994102:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ae)) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1668750253:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.Y)) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1693976202:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8600Z)) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3720p3
    public InterfaceC3774q3 l(TP tp) {
        char c4;
        InterfaceC3774q3 interfaceC3774q3;
        switch (this.f27693n) {
            case 18:
                String str = tp.f27776o;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aj)) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1248334819:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.af)) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1026075066:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ab)) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1004728940:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8590O)) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 691401887:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.aa)) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 822864842:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8591P)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1157994102:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.ae)) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1668750253:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.Y)) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1693976202:
                            if (str.equals(com.anythink.basead.exoplayer.k.o.f8600Z)) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    List list = tp.f27779r;
                    switch (c4) {
                        case 0:
                            interfaceC3774q3 = new C3(list);
                            break;
                        case 1:
                            return new C2881Yl(7);
                        case 2:
                            return new C3761pr(4);
                        case 3:
                            return new G3();
                        case 4:
                            interfaceC3774q3 = new O3(list);
                            break;
                        case 5:
                            return new C2518Df(3);
                        case 6:
                            interfaceC3774q3 = new Q3(list);
                            break;
                        case 7:
                            A3 a32 = new A3();
                            Lr lr = new Lr((byte[]) list.get(0));
                            int L8 = lr.L();
                            int L9 = lr.L();
                            Paint paint = new Paint();
                            a32.f23807n = paint;
                            paint.setStyle(Paint.Style.FILL_AND_STROKE);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                            paint.setPathEffect(null);
                            Paint paint2 = new Paint();
                            a32.f23808u = paint2;
                            paint2.setStyle(Paint.Style.FILL);
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                            paint2.setPathEffect(null);
                            a32.f23809v = new Canvas();
                            int i = 719;
                            a32.f23810w = new C3935t3(i, 575, 0, i, 0, 575);
                            a32.f23811x = new C3881s3(0, new int[]{0, -1, -16777216, -8421505}, A3.g(), A3.j());
                            a32.f23812y = new C4259z3(L8, L9);
                            interfaceC3774q3 = a32;
                            break;
                        case '\b':
                            return new L3();
                    }
                    return interfaceC3774q3;
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    public long r() {
        return SystemClock.elapsedRealtime();
    }

    public String toString() {
        switch (this.f27693n) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public void v() {
        switch (this.f27693n) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public void w(InterfaceC3015c1 interfaceC3015c1) {
        switch (this.f27693n) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public InterfaceC3448k1 x(int i, int i4) {
        switch (this.f27693n) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return new M0();
        }
    }

    public /* synthetic */ T2(boolean z8) {
        this.f27693n = 21;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    /* renamed from: i, reason: collision with other method in class */
    public InterfaceC3015c1 mo6i() {
        return new T0(com.anythink.basead.exoplayer.b.f6539b, 0L);
    }

    public T2(C3130e7 c3130e7, Cw cw) {
        this.f27693n = 24;
        Objects.requireNonNull(c3130e7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Object a() {
        int i = C3014c0.f29620a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    private final void F() {
    }

    private final void G(InterfaceC3015c1 interfaceC3015c1) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    public void b(long j9) {
    }

    @Override // com.google.android.gms.internal.ads.F0
    public long d(long j9) {
        return j9;
    }
}
