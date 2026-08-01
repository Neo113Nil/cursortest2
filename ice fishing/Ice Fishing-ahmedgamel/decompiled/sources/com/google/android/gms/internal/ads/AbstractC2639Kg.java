package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Display;
import com.facebook.ads.AdError;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2639Kg implements T0 {

    /* renamed from: E, reason: collision with root package name */
    public static j3.m f25942E;

    /* renamed from: F, reason: collision with root package name */
    public static C2991bm f25943F;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f25947K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f25948L = 0;

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f25949M = 0;

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f25950N = 0;

    /* renamed from: n, reason: collision with root package name */
    public static AudioManager f25951n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f25952u = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f25953v = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f25954w = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: x, reason: collision with root package name */
    public static final C3493l5 f25955x = new C3493l5("gads:pan:experiment_id", "", 4);

    /* renamed from: y, reason: collision with root package name */
    public static final C4089w8 f25956y = new C4089w8(13);

    /* renamed from: z, reason: collision with root package name */
    public static final C4089w8 f25957z = new C4089w8(19);

    /* renamed from: A, reason: collision with root package name */
    public static final C2812Ul f25938A = new C2812Ul(4);

    /* renamed from: B, reason: collision with root package name */
    public static final C2812Ul f25939B = new C2812Ul(14);

    /* renamed from: C, reason: collision with root package name */
    public static final C2812Ul f25940C = new C2812Ul(20);

    /* renamed from: D, reason: collision with root package name */
    public static final C2812Ul f25941D = new C2812Ul(26);

    /* renamed from: G, reason: collision with root package name */
    public static final Object f25944G = new Object();

    /* renamed from: H, reason: collision with root package name */
    public static final Bs f25945H = new Bs(12);

    /* renamed from: I, reason: collision with root package name */
    public static final Bs f25946I = new Bs(17);
    public static final C3586mr J = new C3586mr(0, 22);

    public static void A(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static int B(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences != null) {
            try {
                return sharedPreferences.getInt(str, 0);
            } catch (ClassCastException unused) {
            }
        }
        return 0;
    }

    public static boolean C(AbstractC4093wC abstractC4093wC, Collection collection) {
        collection.getClass();
        boolean z3 = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC4093wC.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z3 |= abstractC4093wC.remove(it.next());
            }
            return z3;
        }
        Iterator<E> it2 = abstractC4093wC.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z3 = true;
            }
        }
        return z3;
    }

    public static int a(int i) {
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

    public static synchronized AudioManager b(Context context) {
        synchronized (AbstractC2639Kg.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f25951n = null;
                }
                AudioManager audioManager = f25951n;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    C2781Sm c2781Sm = new C2781Sm();
                    AbstractC3043cl.j().execute(new RunnableC3973u0(13, applicationContext, c2781Sm));
                    c2781Sm.b();
                    AudioManager audioManager2 = f25951n;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
                f25951n = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Ww e(Context context, EnumC2960b8 enumC2960b8, String str, String str2, Cw cw) {
        Ww ww;
        Fw fw = new Fw(context, enumC2960b8, str, str2, cw);
        try {
            ww = (Ww) fw.f24890x.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            fw.b(AdError.INTERSTITIAL_AD_TIMEOUT, fw.f24885A, e9);
            ww = null;
        }
        fw.b(3004, fw.f24885A, null);
        if (ww != null) {
            if (ww.f28447v == 7) {
                Cw.f24272e = 3;
            } else {
                Cw.f24272e = 2;
            }
        }
        return ww == null ? new Ww() : ww;
    }

    public static C3931tC f(XB xb, XB xb2) {
        AbstractC2772Sd.J(xb, "set1");
        AbstractC2772Sd.J(xb2, "set2");
        return new C3931tC(xb, xb2);
    }

    public static String g(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (r(optJSONArray2, str) && !r(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:3|4|(1:6)|7|(4:9|(2:11|(1:13))|(1:15)|17)|21|22|17) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC2639Kg.f25942E.h() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        r5 = r4.getMessage();
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 31);
        r3.append("Failed to get app set ID info: ");
        r3.append(r5);
        u2.z.k(r3.toString());
        com.google.android.gms.internal.ads.AbstractC2639Kg.f25942E = S0.f.h(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(Context context, boolean z3) {
        synchronized (f25944G) {
            try {
                if (f25943F == null) {
                    f25943F = new C2991bm(context, 5);
                }
                j3.m mVar = f25942E;
                if (mVar != null) {
                    if (mVar.h()) {
                        if (f25942E.i()) {
                        }
                    }
                    if (z3) {
                    }
                }
                C2991bm c2991bm = f25943F;
                P2.w.i(c2991bm, "the appSetIdClient shouldn't be null");
                f25942E = c2991bm.b();
            } finally {
            }
        }
    }

    public static void i(String str) {
        if (((Boolean) AbstractC2849Xa.f28532a.r()).booleanValue()) {
            int i = u2.z.f41322b;
            v2.i.a(str);
        }
    }

    public static void j(AtomicReference atomicReference, InterfaceC3965tt interfaceC3965tt) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC3965tt.a(obj);
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public static boolean k(Context context) {
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

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static byte[] m() {
        int i = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i6 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        ByteBuffer allocate = ByteBuffer.allocate(com.anythink.basead.exoplayer.f.f.g((i10 & (~i9)) | i11, (i9 & i12) | i13, iArr[5], iArr[6]) ^ (iArr[7] % 1275373743));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) i6);
        allocate.putInt(i);
        return allocate.array();
    }

    public static int n(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int o(Object obj) {
        return n(obj == null ? 0 : obj.hashCode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3921t2 p(C4233yr c4233yr, boolean z3) {
        int i;
        int h9 = c4233yr.h(5);
        if (h9 == 31) {
            h9 = c4233yr.h(6) + 32;
        }
        int w6 = w(c4233yr);
        int h10 = c4233yr.h(4);
        String m4 = D.y.m(h9, "mp4a.40.", new StringBuilder(String.valueOf(h9).length() + 8));
        if (h9 == 5 || h9 == 29) {
            w6 = w(c4233yr);
            int h11 = c4233yr.h(5);
            if (h11 == 31) {
                h11 = c4233yr.h(6) + 32;
            }
            h9 = h11;
            if (h9 == 22) {
                h10 = c4233yr.h(4);
            }
        }
        if (z3) {
            int i6 = 3;
            if (h9 != 1 && h9 != 2 && h9 != 3 && h9 != 4 && h9 != 6 && h9 != 7 && h9 != 17) {
                switch (h9) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(h9).length() + 31);
                        sb.append("Unsupported audio object type: ");
                        sb.append(h9);
                        throw U4.c(sb.toString());
                }
            }
            if (c4233yr.g()) {
                AbstractC2968bG.y("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c4233yr.g()) {
                c4233yr.f(14);
            }
            boolean g4 = c4233yr.g();
            if (h10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (h9 != 6) {
                if (h9 == 20) {
                    h9 = 20;
                }
                if (g4) {
                    if (h9 == 22) {
                        c4233yr.f(16);
                        i = 22;
                    } else {
                        i = h9;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        c4233yr.f(3);
                    }
                    c4233yr.f(1);
                }
                switch (h9) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int h12 = c4233yr.h(2);
                        if (h12 == 2) {
                            i6 = h12;
                        }
                        StringBuilder sb2 = new StringBuilder(AbstractC4404f.b(i6, 22));
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(i6);
                        throw U4.c(sb2.toString());
                }
            }
            c4233yr.f(3);
            if (g4) {
            }
            switch (h9) {
            }
        }
        int i9 = f25953v[h10];
        if (i9 != -1) {
            return new C3921t2(w6, i9, m4);
        }
        throw U4.a(null, null);
    }

    public static C3985uC q(Set set, XA xa) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C3985uC)) {
                set.getClass();
                return new C3985uC(set, xa);
            }
            C3985uC c3985uC = (C3985uC) set;
            XA xa2 = c3985uC.f34505u;
            xa2.getClass();
            return new C3985uC(c3985uC.f34504n, new YA(Arrays.asList(xa2, xa)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C3985uC)) {
            set2.getClass();
            return new C4039vC(set2, xa);
        }
        C3985uC c3985uC2 = (C3985uC) set2;
        XA xa3 = c3985uC2.f34505u;
        xa3.getClass();
        return new C4039vC((SortedSet) c3985uC2.f34504n, new YA(Arrays.asList(xa3, xa)));
    }

    public static boolean r(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                try {
                } catch (PatternSyntaxException e9) {
                    C4835j.f39733C.f39743h.d("RtbAdapterMap.hasAtleastOneRegexMatch", e9);
                }
                if ((((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.pc)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int t(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00cd, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0088, code lost:
    
        return new com.google.android.gms.internal.ads.E2(r13, r3, r15);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC3329i1 u(R0 r02, boolean z3) {
        InterfaceC3329i1 interfaceC3329i1;
        long j6;
        Cr cr;
        int i;
        int i6;
        Cr cr2;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        long s9 = r02.s();
        long j9 = -1;
        long j10 = 4096;
        if (s9 != -1 && s9 <= 4096) {
            j10 = s9;
        }
        Cr cr3 = new Cr(64);
        int i12 = (int) j10;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= i12) {
                interfaceC3329i1 = null;
                break;
            }
            cr3.y(8);
            if (!r02.A(cr3.f24252a, i13, 8, true)) {
                interfaceC3329i1 = null;
                break;
            }
            long P8 = cr3.P();
            int b9 = cr3.b();
            if (P8 == 1) {
                r02.y(cr3.f24252a, 8, 8);
                i = 16;
                cr3.C(16);
                j6 = cr3.d();
                cr = cr3;
            } else {
                if (P8 == 0) {
                    long s10 = r02.s();
                    if (s10 != j9) {
                        P8 = (s10 - r02.q()) + 8;
                    }
                }
                j6 = P8;
                cr = cr3;
                i = 8;
            }
            long j11 = i;
            if (j6 < j11) {
                interfaceC3329i1 = null;
                if (b9 != 1718773093) {
                    break;
                }
                if (i != 8) {
                    b9 = 1718773093;
                    break;
                }
                b9 = 1718773093;
                j6 = 8;
            } else {
                interfaceC3329i1 = null;
            }
            i14 += i;
            if (b9 != 1836019574) {
                if (b9 == 1970628964) {
                    b9 = 1970628964;
                } else {
                    i6 = 1;
                    if (b9 != 1953653099 || b9 == 1835297121 || b9 == 1835626086) {
                        cr2 = cr;
                    } else {
                        if (b9 == 1836019558 || b9 == 1836475768) {
                            break;
                        }
                        i15 |= (b9 == 1835295092 ? 0 : i6) ^ 1;
                        if (b9 == 1937007212) {
                            if (j6 > 1000000) {
                                break;
                            }
                            b9 = 1937007212;
                        }
                        int i16 = b9;
                        if ((i14 + j6) - j11 >= i12) {
                            break;
                        }
                        int i17 = (int) (j6 - j11);
                        i14 += i17;
                        if (i16 != 1718909296) {
                            cr2 = cr;
                            if (i17 != 0) {
                                r02.t(i17);
                            }
                        } else {
                            if (i17 < 8) {
                                return new E2(1718909296, i17, 8);
                            }
                            cr2 = cr;
                            cr2.y(i17);
                            r02.y(cr2.f24252a, 0, i17);
                            int b10 = cr2.b();
                            int i18 = b10 >>> 8;
                            int[] iArr2 = f25954w;
                            int i19 = 3368816;
                            if (i18 != 3368816) {
                                for (int i20 = 0; i20 < 29; i20++) {
                                    if (iArr2[i20] != b10) {
                                    }
                                }
                                i9 = 0;
                                i10 = i9 | i15;
                                cr2.G(4);
                                int B9 = cr2.B() / 4;
                                if (i10 == 0 || B9 <= 0) {
                                    i11 = i10;
                                    iArr = interfaceC3329i1;
                                } else {
                                    int[] iArr3 = new int[B9];
                                    int i21 = 0;
                                    while (i21 < B9) {
                                        int b11 = cr2.b();
                                        iArr3[i21] = b11;
                                        if ((b11 >>> 8) != i19) {
                                            for (int i22 = 0; i22 < 29; i22++) {
                                                if (iArr2[i22] != b11) {
                                                }
                                            }
                                            i21++;
                                            i19 = 3368816;
                                        }
                                        iArr = iArr3;
                                        i11 = i6;
                                        break;
                                    }
                                    i11 = i10;
                                    iArr = iArr3;
                                }
                                if (i11 != 0) {
                                    return new G1.a(b10, 4, iArr);
                                }
                                i15 = i11;
                            }
                            i9 = i6;
                            i10 = i9 | i15;
                            cr2.G(4);
                            int B92 = cr2.B() / 4;
                            if (i10 == 0) {
                            }
                            i11 = i10;
                            iArr = interfaceC3329i1;
                            if (i11 != 0) {
                            }
                        }
                    }
                    cr3 = cr2;
                    j9 = -1;
                    i13 = 0;
                }
            }
            i12 += (int) j6;
            i6 = 1;
            if (s9 != -1 && i12 > s9) {
                i12 = (int) s9;
            }
            if (b9 == 1836019574) {
                cr3 = cr;
                j9 = -1;
                i13 = 0;
            }
            if (b9 != 1953653099) {
            }
            cr2 = cr;
            cr3 = cr2;
            j9 = -1;
            i13 = 0;
        }
        i13 = 0;
        return i15 == 0 ? V2.f28072u : z3 != i13 ? i13 != 0 ? R2.f27156v : R2.f27157w : interfaceC3329i1;
    }

    public static String v(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int w(C4233yr c4233yr) {
        int h9 = c4233yr.h(4);
        if (h9 == 15) {
            if (c4233yr.b() >= 24) {
                return c4233yr.h(24);
            }
            throw U4.a(null, "AAC header insufficient data");
        }
        if (h9 < 13) {
            return f25952u[h9];
        }
        throw U4.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static String x(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(z(objArr[i]));
            i6 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(z(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean y(Set set, Object obj) {
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

    public static String z(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e9) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String s9 = D.y.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(s9), (Throwable) e9);
            String name2 = e9.getClass().getName();
            StringBuilder sb = new StringBuilder(s9.length() + 8 + name2.length() + 1);
            u1.h.i(sb, "<", s9, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
