package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.google.android.gms.internal.ads.Sd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2772Sd implements T0 {

    /* renamed from: I, reason: collision with root package name */
    public static final C3586mr f27500I;
    public static final XJ J;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f27501K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f27502L = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27509n;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f27503u = {-75, 0, 60, 0, 1, 4};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f27504v = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f27505w = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f27506x = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: y, reason: collision with root package name */
    public static final C3493l5 f27507y = new C3493l5("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", 4);

    /* renamed from: z, reason: collision with root package name */
    public static final C4089w8 f27508z = new C4089w8(12);

    /* renamed from: A, reason: collision with root package name */
    public static final C4089w8 f27492A = new C4089w8(18);

    /* renamed from: B, reason: collision with root package name */
    public static final C2812Ul f27493B = new C2812Ul(2);

    /* renamed from: C, reason: collision with root package name */
    public static final C2812Ul f27494C = new C2812Ul(13);

    /* renamed from: D, reason: collision with root package name */
    public static final C2812Ul f27495D = new C2812Ul(19);

    /* renamed from: E, reason: collision with root package name */
    public static final C2812Ul f27496E = new C2812Ul(25);

    /* renamed from: F, reason: collision with root package name */
    public static final Bs f27497F = new Bs(5);

    /* renamed from: G, reason: collision with root package name */
    public static final Bs f27498G = new Bs(11);

    /* renamed from: H, reason: collision with root package name */
    public static final Bs f27499H = new Bs(16);

    static {
        byte b9 = 0;
        f27500I = new C3586mr(b9, 20);
        J = new XJ(b9, 6);
    }

    public /* synthetic */ AbstractC2772Sd(int i) {
        this.f27509n = i;
    }

    public static void A(boolean z3, String str, long j6) {
        if (!z3) {
            throw new IllegalArgumentException(AbstractC2639Kg.x(str, Long.valueOf(j6)));
        }
    }

    public static double B(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static void C(boolean z3, String str, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(AbstractC2639Kg.x(str, obj));
        }
    }

    public static boolean E(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        z("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        z("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new C2561Fn("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(eglGetError))), RB.j(Integer.valueOf(eglGetError)));
    }

    public static int F(C3052cu c3052cu) {
        int q8 = com.bumptech.glide.d.q(c3052cu) - 1;
        return (q8 == 0 || q8 == 1) ? 7 : 23;
    }

    public static void G(N3.a aVar, Vu vu, Su su, boolean z3) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            ID s9 = ID.s(aVar);
            com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p(vu, su, z3);
            s9.a(new LD(0, s9, pVar), AbstractC3413jg.f31275h);
        }
    }

    public static void H(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static void I(String str, boolean z3) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    public static void J(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void K(int i, int i6) {
        String x9;
        if (i < 0 || i >= i6) {
            if (i < 0) {
                x9 = AbstractC2639Kg.x("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i6 < 0) {
                    throw new IllegalArgumentException(D.y.m(i6, "negative size: ", new StringBuilder(String.valueOf(i6).length() + 15)));
                }
                x9 = AbstractC2639Kg.x("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i6));
            }
            throw new IndexOutOfBoundsException(x9);
        }
    }

    public static void L(int i, int i6) {
        if (i < 0 || i > i6) {
            throw new IndexOutOfBoundsException(N(i, i6, "index"));
        }
    }

    public static void M(int i, int i6, int i9) {
        if (i < 0 || i6 < i || i6 > i9) {
            throw new IndexOutOfBoundsException((i < 0 || i > i9) ? N(i, i9, "start index") : (i6 < 0 || i6 > i9) ? N(i6, i9, "end index") : AbstractC2639Kg.x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i)));
        }
    }

    public static String N(int i, int i6, String str) {
        if (i < 0) {
            return AbstractC2639Kg.x("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i6 >= 0) {
            return AbstractC2639Kg.x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(D.y.m(i6, "negative size: ", new StringBuilder(String.valueOf(i6).length() + 15)));
    }

    public static long e(ByteBuffer byteBuffer) {
        long j6 = byteBuffer.getInt();
        return j6 < 0 ? j6 + 4294967296L : j6;
    }

    public static H6 f(Context context, String str, String str2) {
        H6 h62;
        try {
            h62 = (H6) ((LinkedBlockingQueue) new C3864s(context, str, str2).f33789x).poll(com.anythink.basead.exoplayer.f.f7187a, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            h62 = null;
        }
        return h62 == null ? C3864s.g() : h62;
    }

    public static String g(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        boolean z3 = false;
        while (it.hasNext()) {
            String str2 = ((C3008c3) it.next()).f29416a.f28828g.f24431o;
            if (H4.b(str2)) {
                return com.anythink.basead.exoplayer.k.o.f8448e;
            }
            if (H4.a(str2)) {
                z3 = true;
            } else if (H4.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z3 ? com.anythink.basead.exoplayer.k.o.f8459q : str != null ? str : com.anythink.basead.exoplayer.k.o.f8435Q;
    }

    public static void h(W2.a aVar, Throwable th, String str) {
        C2501Ce.a((Context) W2.b.F0(aVar)).f(th, str, ((Double) AbstractC2865Ya.f28688f.r()).floatValue());
    }

    public static void i(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(Object[] objArr, int i) {
        for (int i6 = 0; i6 < i; i6++) {
            o(i6, objArr[i6]);
        }
    }

    public static boolean k(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return E("EGL_EXT_protected_content");
        }
        return false;
    }

    public static long l(Cr cr, int i, int i6) {
        cr.E(i);
        if (cr.B() < 5) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        int b9 = cr.b();
        if ((8388608 & b9) != 0 || ((b9 >> 8) & 8191) != i6 || (b9 & 32) == 0 || cr.K() < 7 || cr.B() < 7 || (cr.K() & 16) != 16) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        byte[] bArr = new byte[6];
        cr.H(bArr, 0, 6);
        long j6 = bArr[0];
        long j9 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3] & 255;
        return ((j6 & 255) << 25) | ((j9 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
    }

    public static void n(int i, long j6, String str, int i6, PriorityQueue priorityQueue) {
        G8 g82 = new G8(i6, j6, str);
        if ((priorityQueue.size() != i || (((G8) priorityQueue.peek()).f24939c <= i6 && ((G8) priorityQueue.peek()).f24937a <= j6)) && !priorityQueue.contains(g82)) {
            priorityQueue.add(g82);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void o(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(D.y.m(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
        }
    }

    public static void p(N3.a aVar, Su su) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            ID s9 = ID.s(aVar);
            C4178xq c4178xq = new C4178xq(7, su);
            s9.a(new LD(0, s9, c4178xq), AbstractC3413jg.f31275h);
        }
    }

    public static void q(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static byte[] r(String str, boolean z3) {
        CC cc;
        if (z3) {
            cc = EC.f24556e;
            if (cc.f24559b != null) {
                cc = new CC(cc.f24558a, (Character) null);
            }
        } else {
            cc = EC.f24555d;
        }
        byte[] h9 = cc.h(str);
        if (h9.length != 0 || str.length() <= 0) {
            return h9;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static C3500lC s(XmlPullParser xmlPullParser, String str, String str2) {
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (AbstractC2639Kg.s(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String v9 = AbstractC2639Kg.v(xmlPullParser, concat2);
                String v10 = AbstractC2639Kg.v(xmlPullParser, concat3);
                String v11 = AbstractC2639Kg.v(xmlPullParser, concat4);
                String v12 = AbstractC2639Kg.v(xmlPullParser, concat5);
                if (v9 == null || v10 == null) {
                    return C3500lC.f31745x;
                }
                M1 m12 = new M1(v9, v11 != null ? Long.parseLong(v11) : 0L, v12 != null ? Long.parseLong(v12) : 0L);
                int length = objArr.length;
                int i6 = i + 1;
                int d2 = MB.d(length, i6);
                if (d2 > length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i] = m12;
                i = i6;
            }
        } while (!AbstractC2639Kg.l(xmlPullParser, str.concat(":Directory")));
        return RB.p(objArr, i);
    }

    public static String t(String[] strArr, int i, int i6) {
        int i9 = i6 + i;
        if (strArr.length < i9) {
            int i10 = u2.z.f41322b;
            v2.i.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i9 - 1;
            if (i >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static long u(int i, long j6) {
        if (i == 1) {
            return j6;
        }
        int i6 = i >> 1;
        long j9 = (j6 * j6) % 1073807359;
        return (i & 1) == 0 ? u(i6, j9) % 1073807359 : ((u(i6, j9) % 1073807359) * j6) % 1073807359;
    }

    public static long v(ByteBuffer byteBuffer) {
        long e9 = e(byteBuffer) << 32;
        if (e9 >= 0) {
            return e(byteBuffer) + e9;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void w(int i, String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(AbstractC2639Kg.x(str, Integer.valueOf(i)));
        }
    }

    public static double x(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static long y(String[] strArr, int i) {
        long e9 = (SK.e(strArr[0]) + 2147483647L) % 1073807359;
        for (int i6 = 1; i6 < i; i6++) {
            e9 = (((SK.e(strArr[i6]) + 2147483647L) % 1073807359) + ((e9 * 16785407) % 1073807359)) % 1073807359;
        }
        return e9;
    }

    public static void z(String str, boolean z3) {
        if (z3) {
            return;
        }
        PB pb = RB.f27177u;
        throw new C2561Fn(str, C3500lC.f31745x);
    }

    public abstract Object m();

    public String toString() {
        switch (this.f27509n) {
            case 28:
                return m().toString();
            default:
                return super.toString();
        }
    }
}
