package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k2.C4637h;
import org.xmlpull.v1.XmlPullParser;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.cL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3035cL implements R0 {

    /* renamed from: D, reason: collision with root package name */
    public static h3.n f29681D;

    /* renamed from: E, reason: collision with root package name */
    public static S0.e f29682E;
    public static final /* synthetic */ int J = 0;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f29687K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static UiModeManager f29688L;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f29689n = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f29690u = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f29691v = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: w, reason: collision with root package name */
    public static final C3398j5 f29692w = new C3398j5("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", 4);

    /* renamed from: x, reason: collision with root package name */
    public static final C3940t8 f29693x = new C3940t8(12);

    /* renamed from: y, reason: collision with root package name */
    public static final C3940t8 f29694y = new C3940t8(18);

    /* renamed from: z, reason: collision with root package name */
    public static final C2945am f29695z = new C2945am(3);

    /* renamed from: A, reason: collision with root package name */
    public static final C2945am f29678A = new C2945am(13);

    /* renamed from: B, reason: collision with root package name */
    public static final C2945am f29679B = new C2945am(19);

    /* renamed from: C, reason: collision with root package name */
    public static final C2945am f29680C = new C2945am(25);

    /* renamed from: F, reason: collision with root package name */
    public static final Object f29683F = new Object();

    /* renamed from: G, reason: collision with root package name */
    public static final C3225ft f29684G = new C3225ft(11);

    /* renamed from: H, reason: collision with root package name */
    public static final C3225ft f29685H = new C3225ft(16);

    /* renamed from: I, reason: collision with root package name */
    public static final Dr f29686I = new Dr(0, 21);

    public static final void A(byte[] bArr, String str, Dw dw) {
        if (dw == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        dw.d(4007, sb.toString());
    }

    public static String B(Context context, String str) {
        p2.j jVar = p2.j.f39798C;
        String b9 = jVar.f39824y.b(context);
        String c4 = jVar.f39824y.c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(b9)) {
            str = w(str, "gmp_app_id", b9).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(c4)) ? str : w(str, "fbs_aiid", c4).toString();
    }

    public static boolean C(char c4) {
        return c4 >= 'A' && c4 <= 'Z';
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean D(java.lang.String r6, java.lang.CharSequence r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L30
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 != r1) goto L32
            r1 = r2
        Lf:
            if (r1 >= r0) goto L30
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1c
            goto L2d
        L1c:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L32
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 == r4) goto L2d
            goto L32
        L2d:
            int r1 = r1 + 1
            goto Lf
        L30:
            r6 = 1
            return r6
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3035cL.D(java.lang.String, java.lang.CharSequence):boolean");
    }

    public static long E(byte b9, byte b10) {
        int i;
        int i4 = b9 & 255;
        int i9 = b9 & 3;
        if (i9 != 0) {
            i = 2;
            if (i9 != 1 && i9 != 2) {
                i = b10 & com.anythink.core.common.s.a.c.f16476c;
            }
        } else {
            i = 1;
        }
        int i10 = i4 >> 3;
        return i * (i10 >= 16 ? com.anythink.basead.exoplayer.d.f6921c << r6 : i10 >= 12 ? 10000 << (i10 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int b(int i) {
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
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static Bundle c(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static InterfaceC3404jB e(InterfaceC3404jB interfaceC3404jB) {
        return !(interfaceC3404jB instanceof C3512lB) ? interfaceC3404jB instanceof C3458kB ? interfaceC3404jB : interfaceC3404jB instanceof Serializable ? new C3458kB(interfaceC3404jB) : new C3512lB(interfaceC3404jB) : interfaceC3404jB;
    }

    public static String f(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (C(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c4 = charArray[i];
                    if (C(c4)) {
                        charArray[i] = (char) (c4 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String g(String str, Context context, boolean z8, HashMap hashMap) {
        C2569Gf c2569Gf;
        String d2;
        C3151ea c3151ea = AbstractC3368ia.f31588X0;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && !z8) {
            return str;
        }
        p2.j jVar = p2.j.f39798C;
        if (!jVar.f39824y.a(context) || TextUtils.isEmpty(str) || (d2 = (c2569Gf = jVar.f39824y).d(context)) == null) {
            return str;
        }
        C3151ea c3151ea2 = AbstractC3368ia.f31527Q0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        String str2 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2);
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31519P0)).booleanValue();
        t2.G g9 = jVar.f39803c;
        if (booleanValue && str.contains(str2)) {
            if (g9.F(str)) {
                Map map = (Map) hashMap.get("_ac");
                c2569Gf.getClass();
                c2569Gf.h(context, "_ac", d2, C2569Gf.f(map));
                return B(context, str).replace(str2, d2);
            }
            if (!g9.G(str)) {
                return str;
            }
            Map map2 = (Map) hashMap.get("_ai");
            c2569Gf.getClass();
            c2569Gf.h(context, "_ai", d2, C2569Gf.f(map2));
            return B(context, str).replace(str2, d2);
        }
        if (str.contains("fbs_aeid") || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31510O0)).booleanValue()) {
            return str;
        }
        if (g9.F(str)) {
            Map map3 = (Map) hashMap.get("_ac");
            c2569Gf.getClass();
            c2569Gf.h(context, "_ac", d2, C2569Gf.f(map3));
            return w(B(context, str), "fbs_aeid", d2).toString();
        }
        if (!g9.G(str)) {
            return str;
        }
        Map map4 = (Map) hashMap.get("_ai");
        c2569Gf.getClass();
        c2569Gf.h(context, "_ai", d2, C2569Gf.f(map4));
        return w(B(context, str), "fbs_aeid", d2).toString();
    }

    public static ArrayList h(byte[] bArr) {
        long j9 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j9 * com.anythink.basead.exoplayer.b.f6545h) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static q2.g1 i(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Vt vt = (Vt) it.next();
            if (vt.f28317c) {
                arrayList.add(C4637h.f38709n);
            } else {
                arrayList.add(new C4637h(vt.f28315a, vt.f28316b));
            }
        }
        return new q2.g1(context, (C4637h[]) arrayList.toArray(new C4637h[arrayList.size()]));
    }

    public static void j(long j9, Lr lr, InterfaceC3448k1[] interfaceC3448k1Arr) {
        int i;
        int i4;
        while (true) {
            if (lr.B() <= 1) {
                return;
            }
            int i9 = 0;
            while (true) {
                if (lr.B() == 0) {
                    i = -1;
                    break;
                }
                int K8 = lr.K();
                i9 += K8;
                if (K8 != 255) {
                    i = i9;
                    break;
                }
            }
            int i10 = 0;
            while (true) {
                if (lr.B() == 0) {
                    i10 = -1;
                    break;
                }
                int K9 = lr.K();
                i10 += K9;
                if (K9 != 255) {
                    break;
                }
            }
            int i11 = lr.f26234b + i10;
            if (i10 == -1 || i10 > lr.B()) {
                AbstractC3217fl.I("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i11 = lr.f26235c;
            } else if (i == 4 && i10 >= 8) {
                int K10 = lr.K();
                int L8 = lr.L();
                if (L8 == 49) {
                    i4 = lr.b();
                    L8 = 49;
                } else {
                    i4 = 0;
                }
                int K11 = lr.K();
                if (L8 == 47) {
                    lr.G(1);
                    L8 = 47;
                }
                boolean z8 = K10 == 181 && (L8 == 49 || L8 == 47) && K11 == 3;
                if (L8 == 49) {
                    z8 &= i4 == 1195456820;
                }
                if (z8) {
                    t(j9, lr, interfaceC3448k1Arr);
                }
            }
            lr.E(i11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:3|4|(1:6)|7|(4:9|(2:11|(1:13))|(1:15)|17)|21|22|17) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC3035cL.f29681D.h() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        r5 = r4.getMessage();
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 31);
        r3.append("Failed to get app set ID info: ");
        r3.append(r5);
        t2.C.k(r3.toString());
        com.google.android.gms.internal.ads.AbstractC3035cL.f29681D = a.AbstractC0415a.q(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(Context context, boolean z8) {
        synchronized (f29683F) {
            try {
                if (f29682E == null) {
                    f29682E = new S0.e(context, 7);
                }
                h3.n nVar = f29681D;
                if (nVar != null) {
                    if (nVar.h()) {
                        if (f29681D.i()) {
                        }
                    }
                    if (z8) {
                    }
                }
                S0.e eVar = f29682E;
                O2.w.i(eVar, "the appSetIdClient shouldn't be null");
                f29681D = eVar.a();
            } finally {
            }
        }
    }

    public static void l(File file, byte[] bArr) {
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, AbstractC2917aC.l(new MC[0]).contains(MC.f26308n));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void m(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(J0 j02, boolean z8) {
        int i;
        Lr lr = new Lr(16);
        boolean z9 = true;
        while (true) {
            lr.y(8);
            if (!j02.I(lr.f26233a, 0, 8, true)) {
                break;
            }
            long P8 = lr.P();
            int b9 = lr.b();
            if (P8 != 1) {
                i = 8;
            } else {
                if (!j02.I(lr.f26233a, 8, 8, true)) {
                    break;
                }
                P8 = lr.j();
                i = 16;
            }
            long j9 = i;
            if (P8 < j9) {
                break;
            }
            int i4 = (int) (P8 - j9);
            if (z9) {
                if (b9 != 1718909296 || i4 < 8) {
                    break;
                }
                lr.y(4);
                j02.I(lr.f26233a, 0, 4, false);
                if (lr.b() != 1751476579) {
                    break;
                }
                if (!z8) {
                    break;
                }
                j02.d(i4 - 4, false);
                z9 = false;
            } else {
                if (b9 == 1836086884) {
                    break;
                }
                if (i4 != 0) {
                    j02.d(i4, false);
                }
                z9 = false;
            }
        }
        return false;
    }

    public static boolean o(X7 x72) {
        int ordinal = x72.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    public static long[] p(long[]... jArr) {
        long j9 = 0;
        for (long[] jArr2 : jArr) {
            j9 += jArr2.length;
        }
        int i = (int) j9;
        PA.J(j9 == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j9);
        long[] jArr3 = new long[i];
        int i4 = 0;
        for (long[] jArr4 : jArr) {
            int length = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i4, length);
            i4 += length;
        }
        return jArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final X7 q(Context context, Dw dw) {
        X7 x72;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean exists = file.exists();
        X7 x73 = X7.X86;
        X7 x74 = X7.ARM7;
        X7 x75 = X7.X86_64;
        X7 x76 = X7.ARM64;
        X7 x77 = X7.RISCV64;
        X7 x78 = X7.UNKNOWN;
        X7 x79 = X7.UNSUPPORTED;
        if (!exists) {
            if (dw != null) {
                dw.d(5017, "No lib/");
                x72 = x78;
                if (x72 != x78) {
                    HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                    String property = System.getProperty("os.arch");
                    if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                        try {
                            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                            if (strArr != null && strArr.length > 0) {
                                property = strArr[0];
                            }
                        } catch (IllegalAccessException e6) {
                            if (dw != null) {
                                dw.c(2024, 0L, e6);
                            }
                        } catch (NoSuchFieldException e9) {
                            if (dw != null) {
                                dw.c(2024, 0L, e9);
                            }
                        }
                        property = Build.CPU_ABI;
                        if (property == null) {
                            property = Build.CPU_ABI2;
                        }
                    }
                    if (TextUtils.isEmpty(property)) {
                        A(null, "Empty dev arch", dw);
                    } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                        if (property.equalsIgnoreCase("x86_64")) {
                            x73 = x75;
                        } else if (property.equalsIgnoreCase("arm64-v8a")) {
                            x73 = x76;
                        } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                            x73 = x74;
                        } else if (property.equalsIgnoreCase("riscv64")) {
                            x73 = x77;
                        } else {
                            A(null, property, dw);
                        }
                    }
                    x73 = x79;
                } else {
                    x73 = x72;
                }
                if (dw != null) {
                    dw.d(5018, x73.name());
                }
                return x73;
            }
            dw = null;
            x72 = x78;
            if (x72 != x78) {
            }
            if (dw != null) {
            }
            return x73;
        }
        File[] listFiles = file.listFiles(new OC(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            if (dw != null) {
                dw.d(5017, "No .so");
                x72 = x78;
                if (x72 != x78) {
                }
                if (dw != null) {
                }
                return x73;
            }
            dw = null;
            x72 = x78;
            if (x72 != x78) {
            }
            if (dw != null) {
            }
            return x73;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            try {
                bArr = new byte[20];
            } finally {
            }
        } catch (IOException e10) {
            A(null, e10.toString(), dw);
        }
        if (fileInputStream.read(bArr) == 20) {
            byte[] bArr2 = {0, 0};
            if (bArr[5] != 2) {
                bArr2[0] = bArr[19];
                bArr2[1] = bArr[18];
                short s3 = ByteBuffer.wrap(bArr2).getShort();
                if (s3 == 3) {
                    x72 = x73;
                } else if (s3 == 40) {
                    x72 = x74;
                } else if (s3 == 62) {
                    x72 = x75;
                } else if (s3 == 183) {
                    x72 = x76;
                } else if (s3 != 243) {
                    A(bArr, null, dw);
                    x72 = x79;
                } else {
                    x72 = x77;
                }
                fileInputStream.close();
                if (x72 != x78) {
                }
                if (dw != null) {
                }
                return x73;
            }
            A(bArr, null, dw);
        }
        fileInputStream.close();
        x72 = x79;
        if (x72 != x78) {
        }
        if (dw != null) {
        }
        return x73;
    }

    public static YK r() {
        ClassLoader classLoader = AbstractC3035cL.class.getClassLoader();
        if (YK.class.equals(YK.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e6) {
                    throw new IllegalStateException(e6);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new AbstractC3035cL[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e9) {
                    Logger.getLogger(XK.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(YK.class.getSimpleName()), (Throwable) e9);
                }
            }
            if (arrayList.size() == 1) {
                return (YK) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (YK) YK.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c4 = charArray[i];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i] = (char) (c4 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void t(long j9, Lr lr, InterfaceC3448k1[] interfaceC3448k1Arr) {
        int K8 = lr.K();
        if ((K8 & 64) != 0) {
            int i = K8 & 31;
            lr.G(1);
            int i4 = lr.f26234b;
            for (InterfaceC3448k1 interfaceC3448k1 : interfaceC3448k1Arr) {
                int i9 = i * 3;
                lr.E(i4);
                interfaceC3448k1.a(i9, lr);
                PA.T(j9 != com.anythink.basead.exoplayer.b.f6539b);
                interfaceC3448k1.b(j9, 1, i9, 0, null);
            }
        }
    }

    public static void u(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void v(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static Uri w(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        AbstractC5051n.j(sb, str2, "=", str3, "&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static C3675oC x(XmlPullParser xmlPullParser, String str, String str2) {
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (AbstractC3194fG.r(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String t9 = AbstractC3194fG.t(xmlPullParser, concat2);
                String t10 = AbstractC3194fG.t(xmlPullParser, concat3);
                String t11 = AbstractC3194fG.t(xmlPullParser, concat4);
                String t12 = AbstractC3194fG.t(xmlPullParser, concat5);
                if (t9 == null || t10 == null) {
                    return C3675oC.f33115x;
                }
                K1 k12 = new K1(t9, t11 != null ? Long.parseLong(t11) : 0L, t12 != null ? Long.parseLong(t12) : 0L);
                int length = objArr.length;
                int i4 = i + 1;
                int d2 = PB.d(length, i4);
                if (d2 > length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i] = k12;
                i = i4;
            }
        } while (!AbstractC3194fG.j(xmlPullParser, str.concat(":Directory")));
        return UB.p(objArr, i);
    }

    public static void y(File file, File file2) {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(AbstractC3194fG.u("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(AbstractC3194fG.u("Source %s and destination %s must be different", file, file2));
        }
        AbstractC2917aC l9 = AbstractC2917aC.l(new MC[0]);
        LC lc = new LC();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ArrayDeque arrayDeque = lc.f26115n;
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, l9.contains(MC.f26308n));
            arrayDeque.addFirst(fileOutputStream);
            int i = JC.f25748a;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            lc.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                lc.f26116u = th;
                Object obj = AbstractC3566mB.f32671a;
                if (IOException.class.isInstance(th)) {
                    throw ((Throwable) IOException.class.cast(th));
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (!(th instanceof Error)) {
                    throw new RuntimeException(th);
                }
                throw ((Error) th);
            } catch (Throwable th2) {
                lc.close();
                throw th2;
            }
        }
    }

    public static void z(ArrayList arrayList, C3398j5 c3398j5) {
        String str = (String) c3398j5.r();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }
}
