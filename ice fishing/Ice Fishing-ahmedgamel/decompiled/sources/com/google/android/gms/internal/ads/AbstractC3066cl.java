package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.foundation.h.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import r2.C4906k;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.cl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3066cl implements T0 {

    /* renamed from: E, reason: collision with root package name */
    public static final C4112w8 f30346E;

    /* renamed from: I, reason: collision with root package name */
    public static final C2851Vl f30350I;

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f30354N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f30355O = 0;

    /* renamed from: P, reason: collision with root package name */
    public static UiModeManager f30356P;

    /* renamed from: n, reason: collision with root package name */
    public static ExecutorService f30357n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f30358u = {1, 2, 3, 6};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f30359v = {48000, 44100, 32000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f30360w = {24000, 22050, 16000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f30361x = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f30362y = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, p.a.f20462a, 512, 576, 640};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f30363z = {69, 87, 104, 121, 139, 174, BaseATView.a.f10557G, 243, com.anythink.expressad.foundation.g.a.aW, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f30342A = {0, 0, 0, 0, 16, 0, com.anythink.core.common.s.a.c.f17103a, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f30343B = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: C, reason: collision with root package name */
    public static final C2889Yb f30344C = new C2889Yb(6);

    /* renamed from: D, reason: collision with root package name */
    public static final C4112w8 f30345D = new C4112w8(14);

    /* renamed from: F, reason: collision with root package name */
    public static final C2851Vl f30347F = new C2851Vl(8);

    /* renamed from: G, reason: collision with root package name */
    public static final C2851Vl f30348G = new C2851Vl(15);

    /* renamed from: H, reason: collision with root package name */
    public static final C2851Vl f30349H = new C2851Vl(21);
    public static final Bs J = new Bs(7);

    /* renamed from: K, reason: collision with root package name */
    public static final Bs f30351K = new Bs(13);

    /* renamed from: L, reason: collision with root package name */
    public static final Bs f30352L = new Bs(18);

    /* renamed from: M, reason: collision with root package name */
    public static final String[] f30353M = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        int i = 28;
        f30346E = new C4112w8(i);
        f30350I = new C2851Vl(i);
    }

    public static D A(int i, K0 k02, Cr cr) {
        D a9 = D.a(k02, cr);
        while (true) {
            int i4 = a9.f25033a;
            if (i4 == i) {
                return a9;
            }
            com.IceFishing.LiveIceFishing.k.t(i4, "Ignoring unknown WAV chunk: ", "WavHeaderReader", new StringBuilder(String.valueOf(i4).length() + 28));
            long j6 = a9.f25034b;
            long j9 = 8 + j6;
            if ((1 & j6) != 0) {
                j9 = 9 + j6;
            }
            if (j9 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i4);
                throw U4.c(sb.toString());
            }
            k02.a((int) j9, false);
            a9 = D.a(k02, cr);
        }
    }

    public static String B(Context context, String str) {
        C4906k c4906k = C4906k.f40186C;
        String b9 = c4906k.f40212y.b(context);
        String c9 = c4906k.f40212y.c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(b9)) {
            str = w(str, "gmp_app_id", b9).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(c9)) ? str : w(str, "fbs_aiid", c9).toString();
    }

    public static boolean C(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3066cl.D(java.lang.String, java.lang.CharSequence):boolean");
    }

    public static int E(int i, int i4) {
        int i6;
        if (i < 0 || i >= 3 || i4 < 0 || (i6 = i4 >> 1) >= 19) {
            return -1;
        }
        int i9 = f30359v[i];
        if (i9 == 44100) {
            int i10 = f30363z[i6] + (i4 & 1);
            return i10 + i10;
        }
        int i11 = f30362y[i6];
        return i9 == 32000 ? i11 * 6 : i11 * 4;
    }

    public static long F(byte b9, byte b10) {
        int i;
        int i4 = b9 & 255;
        int i6 = b9 & 3;
        if (i6 != 0) {
            i = 2;
            if (i6 != 1 && i6 != 2) {
                i = b10 & com.anythink.core.common.s.a.c.f17105c;
            }
        } else {
            i = 1;
        }
        int i9 = i4 >> 3;
        return i * (i9 >= 16 ? com.anythink.basead.exoplayer.d.f7550c << r6 : i9 >= 12 ? 10000 << (i9 & 1) : (i9 & 3) == 3 ? 60000 : 10000 << r6);
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
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static Bundle b(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static InterfaceC3254gB e(InterfaceC3254gB interfaceC3254gB) {
        return !(interfaceC3254gB instanceof C3362iB) ? interfaceC3254gB instanceof C3308hB ? interfaceC3254gB : interfaceC3254gB instanceof Serializable ? new C3308hB(interfaceC3254gB) : new C3362iB(interfaceC3254gB) : interfaceC3254gB;
    }

    public static String f(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (C(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c9 = charArray[i];
                    if (C(c9)) {
                        charArray[i] = (char) (c9 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String g(String str, Context context, boolean z6, HashMap hashMap) {
        C2641Jf c2641Jf;
        String d9;
        C3324ha c3324ha = AbstractC3592ma.f32947X0;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && !z6) {
            return str;
        }
        C4906k c4906k = C4906k.f40186C;
        if (!c4906k.f40212y.a(context) || TextUtils.isEmpty(str) || (d9 = (c2641Jf = c4906k.f40212y).d(context)) == null) {
            return str;
        }
        C3324ha c3324ha2 = AbstractC3592ma.f32886Q0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        String str2 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2);
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32877P0)).booleanValue();
        w2.D d10 = c4906k.f40191c;
        if (booleanValue && str.contains(str2)) {
            if (d10.F(str)) {
                Map map = (Map) hashMap.get("_ac");
                c2641Jf.getClass();
                c2641Jf.h(context, "_ac", d9, C2641Jf.f(map));
                return B(context, str).replace(str2, d9);
            }
            if (!d10.G(str)) {
                return str;
            }
            Map map2 = (Map) hashMap.get("_ai");
            c2641Jf.getClass();
            c2641Jf.h(context, "_ai", d9, C2641Jf.f(map2));
            return B(context, str).replace(str2, d9);
        }
        if (str.contains("fbs_aeid") || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32868O0)).booleanValue()) {
            return str;
        }
        if (d10.F(str)) {
            Map map3 = (Map) hashMap.get("_ac");
            c2641Jf.getClass();
            c2641Jf.h(context, "_ac", d9, C2641Jf.f(map3));
            return w(B(context, str), "fbs_aeid", d9).toString();
        }
        if (!d10.G(str)) {
            return str;
        }
        Map map4 = (Map) hashMap.get("_ai");
        c2641Jf.getClass();
        c2641Jf.h(context, "_ai", d9, C2641Jf.f(map4));
        return w(B(context, str), "fbs_aeid", d9).toString();
    }

    public static Provider h() {
        String[] strArr = f30353M;
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static ArrayList i(byte[] bArr) {
        long j6 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j6 * com.anythink.basead.exoplayer.b.f7174h) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static synchronized Executor j() {
        ExecutorService executorService;
        synchronized (AbstractC3066cl.class) {
            try {
                if (f30357n == null) {
                    String str = AbstractC3182eu.f30782a;
                    f30357n = Executors.newSingleThreadExecutor(new Pt("ExoPlayer:BackgroundExecutor"));
                }
                executorService = f30357n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static s2.f1 k(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tt tt = (Tt) it.next();
            if (tt.f28606c) {
                arrayList.add(m2.h.f39378n);
            } else {
                arrayList.add(new m2.h(tt.f28604a, tt.f28605b));
            }
        }
        return new s2.f1(context, (m2.h[]) arrayList.toArray(new m2.h[arrayList.size()]));
    }

    public static void l(long j6, Cr cr, InterfaceC3566m1[] interfaceC3566m1Arr) {
        int i;
        int i4;
        while (true) {
            if (cr.B() <= 1) {
                return;
            }
            int i6 = 0;
            while (true) {
                if (cr.B() == 0) {
                    i = -1;
                    break;
                }
                int K7 = cr.K();
                i6 += K7;
                if (K7 != 255) {
                    i = i6;
                    break;
                }
            }
            int i9 = 0;
            while (true) {
                if (cr.B() == 0) {
                    i9 = -1;
                    break;
                }
                int K8 = cr.K();
                i9 += K8;
                if (K8 != 255) {
                    break;
                }
            }
            int i10 = cr.f24998b + i9;
            if (i9 == -1 || i9 > cr.B()) {
                AbstractC2991bG.y("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i10 = cr.f24999c;
            } else if (i == 4 && i9 >= 8) {
                int K9 = cr.K();
                int L2 = cr.L();
                if (L2 == 49) {
                    i4 = cr.b();
                    L2 = 49;
                } else {
                    i4 = 0;
                }
                int K10 = cr.K();
                if (L2 == 47) {
                    cr.G(1);
                    L2 = 47;
                }
                boolean z6 = K9 == 181 && (L2 == 49 || L2 == 47) && K10 == 3;
                if (L2 == 49) {
                    z6 &= i4 == 1195456820;
                }
                if (z6) {
                    t(j6, cr, interfaceC3566m1Arr);
                }
            }
            cr.E(i10);
        }
    }

    public static void m(File file, byte[] bArr) {
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, XB.l(new JC[0]).contains(JC.f26408n));
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

    public static void n(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static boolean o(K0 k02) {
        Cr cr = new Cr(8);
        int i = D.a(k02, cr).f25033a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        k02.E(cr.f24997a, 0, 4, false);
        cr.E(0);
        int b9 = cr.b();
        if (b9 == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b9).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(b9);
        AbstractC2991bG.H("WavHeaderReader", sb.toString());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(K0 k02, boolean z6) {
        int i;
        Cr cr = new Cr(16);
        boolean z9 = true;
        while (true) {
            cr.y(8);
            if (!k02.E(cr.f24997a, 0, 8, true)) {
                break;
            }
            long P8 = cr.P();
            int b9 = cr.b();
            if (P8 != 1) {
                i = 8;
            } else {
                if (!k02.E(cr.f24997a, 8, 8, true)) {
                    break;
                }
                P8 = cr.j();
                i = 16;
            }
            long j6 = i;
            if (P8 < j6) {
                break;
            }
            int i4 = (int) (P8 - j6);
            if (z9) {
                if (b9 != 1718909296 || i4 < 8) {
                    break;
                }
                cr.y(4);
                k02.E(cr.f24997a, 0, 4, false);
                if (cr.b() != 1751476579) {
                    break;
                }
                if (!z6) {
                    break;
                }
                k02.d(i4 - 4, false);
                z9 = false;
            } else {
                if (b9 == 1836086884) {
                    break;
                }
                if (i4 != 0) {
                    k02.d(i4, false);
                }
                z9 = false;
            }
        }
        return false;
    }

    public static boolean q(EnumC2983b8 enumC2983b8) {
        int ordinal = enumC2983b8.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EnumC2983b8 r(Context context, Cw cw) {
        EnumC2983b8 enumC2983b8;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean exists = file.exists();
        EnumC2983b8 enumC2983b82 = EnumC2983b8.X86;
        EnumC2983b8 enumC2983b83 = EnumC2983b8.ARM7;
        EnumC2983b8 enumC2983b84 = EnumC2983b8.X86_64;
        EnumC2983b8 enumC2983b85 = EnumC2983b8.ARM64;
        EnumC2983b8 enumC2983b86 = EnumC2983b8.RISCV64;
        EnumC2983b8 enumC2983b87 = EnumC2983b8.UNKNOWN;
        EnumC2983b8 enumC2983b88 = EnumC2983b8.UNSUPPORTED;
        if (!exists) {
            if (cw != null) {
                cw.d(5017, "No lib/");
                enumC2983b8 = enumC2983b87;
                if (enumC2983b8 != enumC2983b87) {
                    HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                    String property = System.getProperty("os.arch");
                    if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                        try {
                            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                            if (strArr != null && strArr.length > 0) {
                                property = strArr[0];
                            }
                        } catch (IllegalAccessException e9) {
                            if (cw != null) {
                                cw.c(2024, 0L, e9);
                            }
                        } catch (NoSuchFieldException e10) {
                            if (cw != null) {
                                cw.c(2024, 0L, e10);
                            }
                        }
                        property = Build.CPU_ABI;
                        if (property == null) {
                            property = Build.CPU_ABI2;
                        }
                    }
                    if (TextUtils.isEmpty(property)) {
                        z(null, "Empty dev arch", cw);
                    } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                        if (property.equalsIgnoreCase("x86_64")) {
                            enumC2983b82 = enumC2983b84;
                        } else if (property.equalsIgnoreCase("arm64-v8a")) {
                            enumC2983b82 = enumC2983b85;
                        } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                            enumC2983b82 = enumC2983b83;
                        } else if (property.equalsIgnoreCase("riscv64")) {
                            enumC2983b82 = enumC2983b86;
                        } else {
                            z(null, property, cw);
                        }
                    }
                    enumC2983b82 = enumC2983b88;
                } else {
                    enumC2983b82 = enumC2983b8;
                }
                if (cw != null) {
                    cw.d(5018, enumC2983b82.name());
                }
                return enumC2983b82;
            }
            cw = null;
            enumC2983b8 = enumC2983b87;
            if (enumC2983b8 != enumC2983b87) {
            }
            if (cw != null) {
            }
            return enumC2983b82;
        }
        File[] listFiles = file.listFiles(new KC(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            if (cw != null) {
                cw.d(5017, "No .so");
                enumC2983b8 = enumC2983b87;
                if (enumC2983b8 != enumC2983b87) {
                }
                if (cw != null) {
                }
                return enumC2983b82;
            }
            cw = null;
            enumC2983b8 = enumC2983b87;
            if (enumC2983b8 != enumC2983b87) {
            }
            if (cw != null) {
            }
            return enumC2983b82;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            try {
                bArr = new byte[20];
            } finally {
            }
        } catch (IOException e11) {
            z(null, e11.toString(), cw);
        }
        if (fileInputStream.read(bArr) == 20) {
            byte[] bArr2 = {0, 0};
            if (bArr[5] != 2) {
                bArr2[0] = bArr[19];
                bArr2[1] = bArr[18];
                short s9 = ByteBuffer.wrap(bArr2).getShort();
                if (s9 == 3) {
                    enumC2983b8 = enumC2983b82;
                } else if (s9 == 40) {
                    enumC2983b8 = enumC2983b83;
                } else if (s9 == 62) {
                    enumC2983b8 = enumC2983b84;
                } else if (s9 == 183) {
                    enumC2983b8 = enumC2983b85;
                } else if (s9 != 243) {
                    z(bArr, null, cw);
                    enumC2983b8 = enumC2983b88;
                } else {
                    enumC2983b8 = enumC2983b86;
                }
                fileInputStream.close();
                if (enumC2983b8 != enumC2983b87) {
                }
                if (cw != null) {
                }
                return enumC2983b82;
            }
            z(bArr, null, cw);
        }
        fileInputStream.close();
        enumC2983b8 = enumC2983b88;
        if (enumC2983b8 != enumC2983b87) {
        }
        if (cw != null) {
        }
        return enumC2983b82;
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c9 = charArray[i];
                    if (c9 >= 'a' && c9 <= 'z') {
                        charArray[i] = (char) (c9 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void t(long j6, Cr cr, InterfaceC3566m1[] interfaceC3566m1Arr) {
        int K7 = cr.K();
        if ((K7 & 64) != 0) {
            int i = K7 & 31;
            cr.G(1);
            int i4 = cr.f24998b;
            for (InterfaceC3566m1 interfaceC3566m1 : interfaceC3566m1Arr) {
                int i6 = i * 3;
                cr.E(i4);
                interfaceC3566m1.a(i6, cr);
                AbstractC2792Sd.H(j6 != com.anythink.basead.exoplayer.b.f7168b);
                interfaceC3566m1.c(j6, 1, i6, 0, null);
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
        AbstractC5128c.h(sb, str2, "=", str3, "&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static void x(File file, File file2) {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(AbstractC2659Kg.x("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(AbstractC2659Kg.x("Source %s and destination %s must be different", file, file2));
        }
        XB l9 = XB.l(new JC[0]);
        IC ic = new IC();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ArrayDeque arrayDeque = ic.f26211n;
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, l9.contains(JC.f26408n));
            arrayDeque.addFirst(fileOutputStream);
            int i = GC.f25741a;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            ic.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                ic.f26212u = th;
                Object obj = AbstractC3414jB.f31999a;
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
                ic.close();
                throw th2;
            }
        }
    }

    public static void y(ArrayList arrayList, C3516l5 c3516l5) {
        String str = (String) c3516l5.r();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static final void z(byte[] bArr, String str, Cw cw) {
        if (cw == null) {
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
        cw.d(4007, sb.toString());
    }
}
