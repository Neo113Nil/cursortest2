package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Display;
import com.facebook.ads.AdError;
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
import r2.C4906k;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2659Kg implements T0 {

    /* renamed from: E, reason: collision with root package name */
    public static l3.m f26720E;

    /* renamed from: F, reason: collision with root package name */
    public static S0.l f26721F;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f26725K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f26726L = 0;

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f26727M = 0;

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f26728N = 0;

    /* renamed from: n, reason: collision with root package name */
    public static AudioManager f26729n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f26730u = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f26731v = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f26732w = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: x, reason: collision with root package name */
    public static final C3516l5 f26733x = new C3516l5("gads:pan:experiment_id", "", 4);

    /* renamed from: y, reason: collision with root package name */
    public static final C4112w8 f26734y = new C4112w8(13);

    /* renamed from: z, reason: collision with root package name */
    public static final C4112w8 f26735z = new C4112w8(19);

    /* renamed from: A, reason: collision with root package name */
    public static final C2851Vl f26716A = new C2851Vl(4);

    /* renamed from: B, reason: collision with root package name */
    public static final C2851Vl f26717B = new C2851Vl(14);

    /* renamed from: C, reason: collision with root package name */
    public static final C2851Vl f26718C = new C2851Vl(20);

    /* renamed from: D, reason: collision with root package name */
    public static final C2851Vl f26719D = new C2851Vl(26);

    /* renamed from: G, reason: collision with root package name */
    public static final Object f26722G = new Object();

    /* renamed from: H, reason: collision with root package name */
    public static final Bs f26723H = new Bs(12);

    /* renamed from: I, reason: collision with root package name */
    public static final Bs f26724I = new Bs(17);
    public static final C3609mr J = new C3609mr(0, 22);

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

    public static boolean C(AbstractC4116wC abstractC4116wC, Collection collection) {
        collection.getClass();
        boolean z6 = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC4116wC.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z6 |= abstractC4116wC.remove(it.next());
            }
            return z6;
        }
        Iterator<E> it2 = abstractC4116wC.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z6 = true;
            }
        }
        return z6;
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
        synchronized (AbstractC2659Kg.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f26729n = null;
                }
                AudioManager audioManager = f26729n;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    C2818Tm c2818Tm = new C2818Tm();
                    AbstractC3066cl.j().execute(new RunnableC3996u0(13, applicationContext, c2818Tm));
                    c2818Tm.b();
                    AudioManager audioManager2 = f26729n;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
                f26729n = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Ww e(Context context, EnumC2983b8 enumC2983b8, String str, String str2, Cw cw) {
        Ww ww;
        Fw fw = new Fw(context, enumC2983b8, str, str2, cw);
        try {
            ww = (Ww) fw.f25680x.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            fw.b(AdError.INTERSTITIAL_AD_TIMEOUT, fw.f25675A, e9);
            ww = null;
        }
        fw.b(3004, fw.f25675A, null);
        if (ww != null) {
            if (ww.f29227v == 7) {
                Cw.f25017e = 3;
            } else {
                Cw.f25017e = 2;
            }
        }
        return ww == null ? new Ww() : ww;
    }

    public static C3954tC f(XB xb, XB xb2) {
        AbstractC2792Sd.J(xb, "set1");
        AbstractC2792Sd.J(xb2, "set2");
        return new C3954tC(xb, xb2);
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
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC2659Kg.f26720E.h() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r5 = r4.getMessage();
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 31);
        r3.append("Failed to get app set ID info: ");
        r3.append(r5);
        w2.z.k(r3.toString());
        com.google.android.gms.internal.ads.AbstractC2659Kg.f26720E = com.bumptech.glide.d.q(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(Context context, boolean z6) {
        synchronized (f26722G) {
            try {
                if (f26721F == null) {
                    f26721F = new S0.l(context);
                }
                l3.m mVar = f26720E;
                if (mVar != null) {
                    if (mVar.h()) {
                        if (f26720E.i()) {
                        }
                    }
                    if (z6) {
                    }
                }
                S0.l lVar = f26721F;
                R2.w.i(lVar, "the appSetIdClient shouldn't be null");
                f26720E = lVar.j();
            } finally {
            }
        }
    }

    public static void i(String str) {
        if (((Boolean) AbstractC2872Xa.f29304a.r()).booleanValue()) {
            int i = w2.z.f41712b;
            x2.i.a(str);
        }
    }

    public static void j(AtomicReference atomicReference, InterfaceC3988tt interfaceC3988tt) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC3988tt.a(obj);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
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
        int i4 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i6 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = iArr[4];
        ByteBuffer allocate = ByteBuffer.allocate(com.IceFishing.LiveIceFishing.k.f((i9 & (~i6)) | i10, (i6 & i11) | i12, iArr[5], iArr[6]) ^ (iArr[7] % 1275373743));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) i4);
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
    public static C3944t2 p(C4256yr c4256yr, boolean z6) {
        int i;
        int h3 = c4256yr.h(5);
        if (h3 == 31) {
            h3 = c4256yr.h(6) + 32;
        }
        int w3 = w(c4256yr);
        int h9 = c4256yr.h(4);
        String k9 = D.x.k(h3, "mp4a.40.", new StringBuilder(String.valueOf(h3).length() + 8));
        if (h3 == 5 || h3 == 29) {
            w3 = w(c4256yr);
            int h10 = c4256yr.h(5);
            if (h10 == 31) {
                h10 = c4256yr.h(6) + 32;
            }
            h3 = h10;
            if (h3 == 22) {
                h9 = c4256yr.h(4);
            }
        }
        if (z6) {
            int i4 = 3;
            if (h3 != 1 && h3 != 2 && h3 != 3 && h3 != 4 && h3 != 6 && h3 != 7 && h3 != 17) {
                switch (h3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(h3).length() + 31);
                        sb.append("Unsupported audio object type: ");
                        sb.append(h3);
                        throw U4.c(sb.toString());
                }
            }
            if (c4256yr.g()) {
                AbstractC2991bG.y("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c4256yr.g()) {
                c4256yr.f(14);
            }
            boolean g9 = c4256yr.g();
            if (h9 == 0) {
                throw new UnsupportedOperationException();
            }
            if (h3 != 6) {
                if (h3 == 20) {
                    h3 = 20;
                }
                if (g9) {
                    if (h3 == 22) {
                        c4256yr.f(16);
                        i = 22;
                    } else {
                        i = h3;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        c4256yr.f(3);
                    }
                    c4256yr.f(1);
                }
                switch (h3) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int h11 = c4256yr.h(2);
                        if (h11 == 2) {
                            i4 = h11;
                        }
                        StringBuilder sb2 = new StringBuilder(Wv.b(i4, 22));
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(i4);
                        throw U4.c(sb2.toString());
                }
            }
            c4256yr.f(3);
            if (g9) {
            }
            switch (h3) {
            }
        }
        int i6 = f26731v[h9];
        if (i6 != -1) {
            return new C3944t2(w3, i6, k9);
        }
        throw U4.a(null, null);
    }

    public static C4008uC q(Set set, XA xa) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C4008uC)) {
                set.getClass();
                return new C4008uC(set, xa);
            }
            C4008uC c4008uC = (C4008uC) set;
            XA xa2 = c4008uC.f35279u;
            xa2.getClass();
            return new C4008uC(c4008uC.f35278n, new YA(Arrays.asList(xa2, xa)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C4008uC)) {
            set2.getClass();
            return new C4062vC(set2, xa);
        }
        C4008uC c4008uC2 = (C4008uC) set2;
        XA xa3 = c4008uC2.f35279u;
        xa3.getClass();
        return new C4062vC((SortedSet) c4008uC2.f35278n, new YA(Arrays.asList(xa3, xa)));
    }

    public static boolean r(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                try {
                } catch (PatternSyntaxException e9) {
                    C4906k.f40186C.f40196h.d("RtbAdapterMap.hasAtleastOneRegexMatch", e9);
                }
                if ((((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.pc)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
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
    public static InterfaceC3352i1 u(R0 r02, boolean z6) {
        InterfaceC3352i1 interfaceC3352i1;
        long j6;
        Cr cr;
        int i;
        int i4;
        Cr cr2;
        int i6;
        int i9;
        int i10;
        int[] iArr;
        long s9 = r02.s();
        long j9 = -1;
        long j10 = 4096;
        if (s9 != -1 && s9 <= 4096) {
            j10 = s9;
        }
        Cr cr3 = new Cr(64);
        int i11 = (int) j10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i11) {
                interfaceC3352i1 = null;
                break;
            }
            cr3.y(8);
            if (!r02.E(cr3.f24997a, i12, 8, true)) {
                interfaceC3352i1 = null;
                break;
            }
            long P8 = cr3.P();
            int b9 = cr3.b();
            if (P8 == 1) {
                r02.x(cr3.f24997a, 8, 8);
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
                interfaceC3352i1 = null;
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
                interfaceC3352i1 = null;
            }
            i13 += i;
            if (b9 != 1836019574) {
                if (b9 == 1970628964) {
                    b9 = 1970628964;
                } else {
                    i4 = 1;
                    if (b9 != 1953653099 || b9 == 1835297121 || b9 == 1835626086) {
                        cr2 = cr;
                    } else {
                        if (b9 == 1836019558 || b9 == 1836475768) {
                            break;
                        }
                        i14 |= (b9 == 1835295092 ? 0 : i4) ^ 1;
                        if (b9 == 1937007212) {
                            if (j6 > 1000000) {
                                break;
                            }
                            b9 = 1937007212;
                        }
                        int i15 = b9;
                        if ((i13 + j6) - j11 >= i11) {
                            break;
                        }
                        int i16 = (int) (j6 - j11);
                        i13 += i16;
                        if (i15 != 1718909296) {
                            cr2 = cr;
                            if (i16 != 0) {
                                r02.t(i16);
                            }
                        } else {
                            if (i16 < 8) {
                                return new E2(1718909296, i16, 8);
                            }
                            cr2 = cr;
                            cr2.y(i16);
                            r02.x(cr2.f24997a, 0, i16);
                            int b10 = cr2.b();
                            int i17 = b10 >>> 8;
                            int[] iArr2 = f26732w;
                            int i18 = 3368816;
                            if (i17 != 3368816) {
                                for (int i19 = 0; i19 < 29; i19++) {
                                    if (iArr2[i19] != b10) {
                                    }
                                }
                                i6 = 0;
                                i9 = i6 | i14;
                                cr2.G(4);
                                int B3 = cr2.B() / 4;
                                if (i9 == 0 || B3 <= 0) {
                                    i10 = i9;
                                    iArr = interfaceC3352i1;
                                } else {
                                    int[] iArr3 = new int[B3];
                                    int i20 = 0;
                                    while (i20 < B3) {
                                        int b11 = cr2.b();
                                        iArr3[i20] = b11;
                                        if ((b11 >>> 8) != i18) {
                                            for (int i21 = 0; i21 < 29; i21++) {
                                                if (iArr2[i21] != b11) {
                                                }
                                            }
                                            i20++;
                                            i18 = 3368816;
                                        }
                                        iArr = iArr3;
                                        i10 = i4;
                                        break;
                                    }
                                    i10 = i9;
                                    iArr = iArr3;
                                }
                                if (i10 != 0) {
                                    return new I1.a(b10, 4, iArr);
                                }
                                i14 = i10;
                            }
                            i6 = i4;
                            i9 = i6 | i14;
                            cr2.G(4);
                            int B32 = cr2.B() / 4;
                            if (i9 == 0) {
                            }
                            i10 = i9;
                            iArr = interfaceC3352i1;
                            if (i10 != 0) {
                            }
                        }
                    }
                    cr3 = cr2;
                    j9 = -1;
                    i12 = 0;
                }
            }
            i11 += (int) j6;
            i4 = 1;
            if (s9 != -1 && i11 > s9) {
                i11 = (int) s9;
            }
            if (b9 == 1836019574) {
                cr3 = cr;
                j9 = -1;
                i12 = 0;
            }
            if (b9 != 1953653099) {
            }
            cr2 = cr;
            cr3 = cr2;
            j9 = -1;
            i12 = 0;
        }
        i12 = 0;
        return i14 == 0 ? V2.f28869u : z6 != i12 ? i12 != 0 ? R2.f27912v : R2.f27913w : interfaceC3352i1;
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

    public static int w(C4256yr c4256yr) {
        int h3 = c4256yr.h(4);
        if (h3 == 15) {
            if (c4256yr.b() >= 24) {
                return c4256yr.h(24);
            }
            throw U4.a(null, "AAC header insufficient data");
        }
        if (h3 < 13) {
            return f26730u[h3];
        }
        throw U4.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static String x(String str, Object... objArr) {
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
            sb.append(z(objArr[i]));
            i4 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i4, str.length());
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
            String p9 = D.x.p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p9), (Throwable) e9);
            String name2 = e9.getClass().getName();
            StringBuilder sb = new StringBuilder(p9.length() + 8 + name2.length() + 1);
            AbstractC5128c.h(sb, "<", p9, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
