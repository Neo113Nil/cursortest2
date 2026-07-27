package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.os.RemoteException;
import android.view.Display;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.fG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3194fG implements R0 {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f30671s0 = 0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f30672t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f30674u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f30676v0 = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f30665n = {com.anythink.basead.exoplayer.k.o.f8620u, com.anythink.basead.exoplayer.k.o.f8621v, com.anythink.basead.exoplayer.k.o.f8619t};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f30673u = {44100, 48000, 32000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f30675v = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f30677w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f30678x = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f30679y = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f30680z = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: A, reason: collision with root package name */
    public static final C3398j5 f30641A = new C3398j5("gads:afs:csa:experiment_id", "", 4);

    /* renamed from: B, reason: collision with root package name */
    public static final C3398j5 f30642B = new C3398j5("gads:app_index:experiment_id", "", 4);

    /* renamed from: C, reason: collision with root package name */
    public static final C3398j5 f30643C = new C3398j5("gads:block_autoclicks_experiment_id", "", 4);

    /* renamed from: D, reason: collision with root package name */
    public static final C3398j5 f30644D = new C3398j5("gads:sdk_core_experiment_id", "", 4);

    /* renamed from: E, reason: collision with root package name */
    public static final C3398j5 f30645E = new C3398j5("gads:spam_app_context:experiment_id", "", 4);

    /* renamed from: F, reason: collision with root package name */
    public static final C3398j5 f30646F = new C3398j5("gads:temporary_experiment_id:1", "", 4);

    /* renamed from: G, reason: collision with root package name */
    public static final C3398j5 f30647G = new C3398j5("gads:temporary_experiment_id:10", "", 4);

    /* renamed from: H, reason: collision with root package name */
    public static final C3398j5 f30648H = new C3398j5("gads:temporary_experiment_id:11", "", 4);

    /* renamed from: I, reason: collision with root package name */
    public static final C3398j5 f30649I = new C3398j5("gads:temporary_experiment_id:12", "", 4);
    public static final C3398j5 J = new C3398j5("gads:temporary_experiment_id:13", "", 4);

    /* renamed from: K, reason: collision with root package name */
    public static final C3398j5 f30650K = new C3398j5("gads:temporary_experiment_id:14", "", 4);

    /* renamed from: L, reason: collision with root package name */
    public static final C3398j5 f30651L = new C3398j5("gads:temporary_experiment_id:15", "", 4);

    /* renamed from: M, reason: collision with root package name */
    public static final C3398j5 f30652M = new C3398j5("gads:temporary_experiment_id:2", "", 4);

    /* renamed from: N, reason: collision with root package name */
    public static final C3398j5 f30653N = new C3398j5("gads:temporary_experiment_id:3", "", 4);

    /* renamed from: O, reason: collision with root package name */
    public static final C3398j5 f30654O = new C3398j5("gads:temporary_experiment_id:4", "", 4);

    /* renamed from: P, reason: collision with root package name */
    public static final C3398j5 f30655P = new C3398j5("gads:temporary_experiment_id:5", "", 4);

    /* renamed from: Q, reason: collision with root package name */
    public static final C3398j5 f30656Q = new C3398j5("gads:temporary_experiment_id:6", "", 4);

    /* renamed from: R, reason: collision with root package name */
    public static final C3398j5 f30657R = new C3398j5("gads:temporary_experiment_id:7", "", 4);

    /* renamed from: S, reason: collision with root package name */
    public static final C3398j5 f30658S = new C3398j5("gads:temporary_experiment_id:8", "", 4);

    /* renamed from: T, reason: collision with root package name */
    public static final C3398j5 f30659T = new C3398j5("gads:temporary_experiment_id:9", "", 4);

    /* renamed from: U, reason: collision with root package name */
    public static final C3398j5 f30660U = new C3398j5("gads:corewebview:experiment_id", "", 4);

    /* renamed from: V, reason: collision with root package name */
    public static final C3940t8 f30661V = new C3940t8(11);

    /* renamed from: W, reason: collision with root package name */
    public static final C3940t8 f30662W = new C3940t8(17);

    /* renamed from: X, reason: collision with root package name */
    public static final C2945am f30663X = new C2945am(1);
    public static final C2945am Y = new C2945am(12);

    /* renamed from: Z, reason: collision with root package name */
    public static final C2945am f30664Z = new C2945am(18);

    /* renamed from: n0, reason: collision with root package name */
    public static final C2945am f30666n0 = new C2945am(24);

    /* renamed from: o0, reason: collision with root package name */
    public static final C3225ft f30667o0 = new C3225ft(4);

    /* renamed from: p0, reason: collision with root package name */
    public static final C3225ft f30668p0 = new C3225ft(10);

    /* renamed from: q0, reason: collision with root package name */
    public static final C3225ft f30669q0 = new C3225ft(15);

    /* renamed from: r0, reason: collision with root package name */
    public static final Dr f30670r0 = new Dr(0, 19);

    public static int A(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences != null) {
            try {
                return sharedPreferences.getInt(str, 0);
            } catch (ClassCastException unused) {
            }
        }
        return 0;
    }

    public static boolean B(AC ac, Collection collection) {
        collection.getClass();
        boolean z8 = false;
        if (!(collection instanceof Set) || collection.size() <= ac.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z8 |= ac.remove(it.next());
            }
            return z8;
        }
        Iterator<E> it2 = ac.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean C(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        z("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        z("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new C2696Nn("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(eglGetError))), UB.j(Integer.valueOf(eglGetError)));
    }

    public static int[] D(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof VC) {
            VC vc = (VC) abstractCollection;
            return Arrays.copyOfRange(vc.f28221n, vc.f28222u, vc.f28223v);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List E(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new VC(0, length, iArr);
    }

    public static Integer F(String str) {
        byte b9;
        Long valueOf;
        byte b10;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i = charAt == '-' ? 1 : 0;
            if (i != str.length()) {
                int i4 = i + 1;
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    b9 = WC.f28373a[charAt2];
                } else {
                    byte[] bArr = WC.f28373a;
                    b9 = -1;
                }
                if (b9 >= 0 && b9 < 10) {
                    long j9 = -b9;
                    while (true) {
                        if (i4 < str.length()) {
                            int i9 = i4 + 1;
                            char charAt3 = str.charAt(i4);
                            if (charAt3 < 128) {
                                b10 = WC.f28373a[charAt3];
                            } else {
                                byte[] bArr2 = WC.f28373a;
                                b10 = -1;
                            }
                            if (b10 < 0 || b10 >= 10 || j9 < -922337203685477580L) {
                                break;
                            }
                            long j10 = j9 * 10;
                            long j11 = b10;
                            if (j10 < Long.MIN_VALUE + j11) {
                                break;
                            }
                            j9 = j10 - j11;
                            i4 = i9;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j9);
                        } else if (j9 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j9);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static int b(int i) {
        int i4;
        int i9;
        int i10;
        int i11;
        if (!((i & (-2097152)) == -2097152) || (i4 = (i >>> 19) & 3) == 1 || (i9 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = i10 - 1;
        int i13 = f30673u[i11];
        if (i4 == 2) {
            i13 /= 2;
        } else if (i4 == 0) {
            i13 /= 4;
        }
        int i14 = (i >>> 9) & 1;
        if (i9 == 3) {
            return ((((i4 == 3 ? f30675v[i12] : f30677w[i12]) * 12) / i13) + i14) * 4;
        }
        int i15 = i4 == 3 ? i9 == 2 ? f30678x[i12] : f30679y[i12] : f30680z[i12];
        if (i4 == 3) {
            return ((i15 * 144) / i13) + i14;
        }
        return (((i9 == 1 ? 72 : 144) * i15) / i13) + i14;
    }

    public static int c(long j9) {
        int i = (int) j9;
        PA.J(((long) i) == j9, "Out of range: %s", j9);
        return i;
    }

    public static Yw e(Context context, X7 x72, String str, String str2, Dw dw) {
        Yw yw;
        Gw gw = new Gw(context, x72, str, str2, dw);
        try {
            yw = (Yw) gw.f25256x.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            gw.b(AdError.INTERSTITIAL_AD_TIMEOUT, gw.f25251A, e6);
            yw = null;
        }
        gw.b(3004, gw.f25251A, null);
        if (yw != null) {
            if (yw.f28923v == 7) {
                Dw.f24605e = 3;
            } else {
                Dw.f24605e = 2;
            }
        }
        return yw == null ? new Yw() : yw;
    }

    public static C4106wC f(AbstractC2917aC abstractC2917aC, AbstractC2917aC abstractC2917aC2) {
        PA.X(abstractC2917aC, "set1");
        PA.X(abstractC2917aC2, "set2");
        return new C4106wC(abstractC2917aC, abstractC2917aC2);
    }

    public static void g(String str) {
        if (((Boolean) AbstractC2785Ta.f27789a.r()).booleanValue()) {
            int i = t2.C.f40822b;
            u2.i.a(str);
        }
    }

    public static void h(AtomicReference atomicReference, InterfaceC4032ut interfaceC4032ut) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC4032ut.b(obj);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    public static boolean i(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr && (hdrCapabilities = display.getHdrCapabilities()) != null) {
                for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static byte[] k() {
        int i = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i4 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        ByteBuffer allocate = ByteBuffer.allocate(com.anythink.basead.b.c.i.g((i10 & (~i9)) | i11, (i9 & i12) | i13, iArr[5], iArr[6]) ^ (iArr[7] % 1275373743));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) i4);
        allocate.putInt(i);
        return allocate.array();
    }

    public static int l(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static boolean m(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return C("EGL_EXT_protected_content");
        }
        return false;
    }

    public static int n(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int o(long j9) {
        if (j9 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j9 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j9;
    }

    public static int p(Object obj) {
        return n(obj == null ? 0 : obj.hashCode());
    }

    public static C4160xC q(Set set, InterfaceC2916aB interfaceC2916aB) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C4160xC)) {
                set.getClass();
                return new C4160xC(set, interfaceC2916aB);
            }
            C4160xC c4160xC = (C4160xC) set;
            InterfaceC2916aB interfaceC2916aB2 = c4160xC.f35128u;
            interfaceC2916aB2.getClass();
            return new C4160xC(c4160xC.f35127n, new C2971bB(Arrays.asList(interfaceC2916aB2, interfaceC2916aB)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C4160xC)) {
            set2.getClass();
            return new C4268zC(set2, interfaceC2916aB);
        }
        C4160xC c4160xC2 = (C4160xC) set2;
        InterfaceC2916aB interfaceC2916aB3 = c4160xC2.f35128u;
        interfaceC2916aB3.getClass();
        return new C4268zC((SortedSet) c4160xC2.f35127n, new C2971bB(Arrays.asList(interfaceC2916aB3, interfaceC2916aB)));
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int s(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String u(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, indexOf);
            sb.append(x(objArr[i]));
            i4 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(x(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean v(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static int w(byte b9, byte b10, byte b11, byte b12) {
        return (b9 << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public static String x(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String o9 = D.y.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o9), (Throwable) e6);
            String name2 = e6.getClass().getName();
            StringBuilder sb = new StringBuilder(o9.length() + 8 + name2.length() + 1);
            AbstractC5051n.j(sb, "<", o9, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static void y(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static void z(String str, boolean z8) {
        if (z8) {
            return;
        }
        SB sb = UB.f27942u;
        throw new C2696Nn(str, C3675oC.f33115x);
    }
}
