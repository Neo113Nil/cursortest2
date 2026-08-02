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
public abstract class AbstractC2792Sd implements T0 {

    /* renamed from: I, reason: collision with root package name */
    public static final C3609mr f28292I;
    public static final XJ J;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f28293K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f28294L = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28301n;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f28295u = {-75, 0, 60, 0, 1, 4};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f28296v = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f28297w = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f28298x = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: y, reason: collision with root package name */
    public static final C3516l5 f28299y = new C3516l5("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", 4);

    /* renamed from: z, reason: collision with root package name */
    public static final C4112w8 f28300z = new C4112w8(12);

    /* renamed from: A, reason: collision with root package name */
    public static final C4112w8 f28284A = new C4112w8(18);

    /* renamed from: B, reason: collision with root package name */
    public static final C2851Vl f28285B = new C2851Vl(2);

    /* renamed from: C, reason: collision with root package name */
    public static final C2851Vl f28286C = new C2851Vl(13);

    /* renamed from: D, reason: collision with root package name */
    public static final C2851Vl f28287D = new C2851Vl(19);

    /* renamed from: E, reason: collision with root package name */
    public static final C2851Vl f28288E = new C2851Vl(25);

    /* renamed from: F, reason: collision with root package name */
    public static final Bs f28289F = new Bs(5);

    /* renamed from: G, reason: collision with root package name */
    public static final Bs f28290G = new Bs(11);

    /* renamed from: H, reason: collision with root package name */
    public static final Bs f28291H = new Bs(16);

    static {
        byte b9 = 0;
        f28292I = new C3609mr(b9, 20);
        J = new XJ(b9, 6);
    }

    public /* synthetic */ AbstractC2792Sd(int i) {
        this.f28301n = i;
    }

    public static void A(boolean z6, String str, long j6) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2659Kg.x(str, Long.valueOf(j6)));
        }
    }

    public static double B(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static void C(boolean z6, String str, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2659Kg.x(str, obj));
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
        throw new C2598Gn("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(eglGetError))), RB.j(Integer.valueOf(eglGetError)));
    }

    public static int F(C3075cu c3075cu) {
        int B3 = t8.g.B(c3075cu) - 1;
        return (B3 == 0 || B3 == 1) ? 7 : 23;
    }

    public static void G(P3.a aVar, Vu vu, Su su, boolean z6) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            ID s9 = ID.s(aVar);
            com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(vu, su, z6);
            s9.a(new LD(0, s9, oVar), AbstractC3436jg.f32062h);
        }
    }

    public static void H(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void I(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    public static void J(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void K(int i, int i4) {
        String x9;
        if (i < 0 || i >= i4) {
            if (i < 0) {
                x9 = AbstractC2659Kg.x("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(D.x.k(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
                }
                x9 = AbstractC2659Kg.x("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(x9);
        }
    }

    public static void L(int i, int i4) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(N(i, i4, "index"));
        }
    }

    public static void M(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? N(i, i6, "start index") : (i4 < 0 || i4 > i6) ? N(i4, i6, "end index") : AbstractC2659Kg.x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    public static String N(int i, int i4, String str) {
        if (i < 0) {
            return AbstractC2659Kg.x("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return AbstractC2659Kg.x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(D.x.k(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
    }

    public static long e(ByteBuffer byteBuffer) {
        long j6 = byteBuffer.getInt();
        return j6 < 0 ? j6 + 4294967296L : j6;
    }

    public static H6 f(Context context, String str, String str2) {
        H6 h62;
        try {
            h62 = (H6) ((LinkedBlockingQueue) new C3887s(context, str, str2).f34557x).poll(com.anythink.basead.exoplayer.f.f7973a, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            h62 = null;
        }
        return h62 == null ? C3887s.g() : h62;
    }

    public static String g(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        boolean z6 = false;
        while (it.hasNext()) {
            String str2 = ((C3031c3) it.next()).f30199a.f29608g.f25176o;
            if (H4.b(str2)) {
                return com.anythink.basead.exoplayer.k.o.f9234e;
            }
            if (H4.a(str2)) {
                z6 = true;
            } else if (H4.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z6 ? com.anythink.basead.exoplayer.k.o.f9245q : str != null ? str : com.anythink.basead.exoplayer.k.o.f9221Q;
    }

    public static void h(Y2.a aVar, Throwable th, String str) {
        C2521Ce.a((Context) Y2.b.D0(aVar)).f(th, str, ((Double) AbstractC2888Ya.f29463f.r()).floatValue());
    }

    public static void i(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            o(i4, objArr[i4]);
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

    public static long l(Cr cr, int i, int i4) {
        cr.E(i);
        if (cr.B() < 5) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        int b9 = cr.b();
        if ((8388608 & b9) != 0 || ((b9 >> 8) & 8191) != i4 || (b9 & 32) == 0 || cr.K() < 7 || cr.B() < 7 || (cr.K() & 16) != 16) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        byte[] bArr = new byte[6];
        cr.H(bArr, 0, 6);
        long j6 = bArr[0];
        long j9 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3] & 255;
        return ((j6 & 255) << 25) | ((j9 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
    }

    public static void n(int i, long j6, String str, int i4, PriorityQueue priorityQueue) {
        G8 g82 = new G8(i4, j6, str);
        if ((priorityQueue.size() != i || (((G8) priorityQueue.peek()).f25729c <= i4 && ((G8) priorityQueue.peek()).f25727a <= j6)) && !priorityQueue.contains(g82)) {
            priorityQueue.add(g82);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void o(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(D.x.k(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
        }
    }

    public static void p(P3.a aVar, Su su) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            ID s9 = ID.s(aVar);
            C4201xq c4201xq = new C4201xq(7, su);
            s9.a(new LD(0, s9, c4201xq), AbstractC3436jg.f32062h);
        }
    }

    public static void q(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static byte[] r(String str, boolean z6) {
        CC cc;
        if (z6) {
            cc = EC.f25317e;
            if (cc.f25320b != null) {
                cc = new CC(cc.f25319a, (Character) null);
            }
        } else {
            cc = EC.f25316d;
        }
        byte[] h3 = cc.h(str);
        if (h3.length != 0 || str.length() <= 0) {
            return h3;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static C3523lC s(XmlPullParser xmlPullParser, String str, String str2) {
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (AbstractC2659Kg.s(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String v9 = AbstractC2659Kg.v(xmlPullParser, concat2);
                String v10 = AbstractC2659Kg.v(xmlPullParser, concat3);
                String v11 = AbstractC2659Kg.v(xmlPullParser, concat4);
                String v12 = AbstractC2659Kg.v(xmlPullParser, concat5);
                if (v9 == null || v10 == null) {
                    return C3523lC.f32525x;
                }
                M1 m12 = new M1(v9, v11 != null ? Long.parseLong(v11) : 0L, v12 != null ? Long.parseLong(v12) : 0L);
                int length = objArr.length;
                int i4 = i + 1;
                int d9 = MB.d(length, i4);
                if (d9 > length) {
                    objArr = Arrays.copyOf(objArr, d9);
                }
                objArr[i] = m12;
                i = i4;
            }
        } while (!AbstractC2659Kg.l(xmlPullParser, str.concat(":Directory")));
        return RB.p(objArr, i);
    }

    public static String t(String[] strArr, int i, int i4) {
        int i6 = i4 + i;
        if (strArr.length < i6) {
            int i9 = w2.z.f41712b;
            x2.i.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i10 = i6 - 1;
            if (i >= i10) {
                sb.append(strArr[i10]);
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
        int i4 = i >> 1;
        long j9 = (j6 * j6) % 1073807359;
        return (i & 1) == 0 ? u(i4, j9) % 1073807359 : ((u(i4, j9) % 1073807359) * j6) % 1073807359;
    }

    public static long v(ByteBuffer byteBuffer) {
        long e9 = e(byteBuffer) << 32;
        if (e9 >= 0) {
            return e(byteBuffer) + e9;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void w(int i, String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2659Kg.x(str, Integer.valueOf(i)));
        }
    }

    public static double x(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static long y(String[] strArr, int i) {
        long e9 = (SK.e(strArr[0]) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i; i4++) {
            e9 = (((SK.e(strArr[i4]) + 2147483647L) % 1073807359) + ((e9 * 16785407) % 1073807359)) % 1073807359;
        }
        return e9;
    }

    public static void z(String str, boolean z6) {
        if (z6) {
            return;
        }
        PB pb = RB.f27933u;
        throw new C2598Gn(str, C3523lC.f32525x);
    }

    public abstract Object m();

    public String toString() {
        switch (this.f28301n) {
            case 28:
                return m().toString();
            default:
                return super.toString();
        }
    }
}
