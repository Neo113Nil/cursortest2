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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.cl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3043cl implements T0 {

    /* renamed from: E, reason: collision with root package name */
    public static final C4089w8 f29561E;

    /* renamed from: I, reason: collision with root package name */
    public static final C2812Ul f29565I;

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f29569N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f29570O = 0;

    /* renamed from: P, reason: collision with root package name */
    public static UiModeManager f29571P;

    /* renamed from: n, reason: collision with root package name */
    public static ExecutorService f29572n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f29573u = {1, 2, 3, 6};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f29574v = {48000, 44100, 32000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f29575w = {24000, 22050, 16000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f29576x = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f29577y = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, p.a.f19675a, 512, 576, 640};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f29578z = {69, 87, 104, 121, 139, 174, BaseATView.a.f9771G, 243, com.anythink.expressad.foundation.g.a.aW, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f29557A = {0, 0, 0, 0, 16, 0, com.anythink.core.common.s.a.c.f16316a, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f29558B = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: C, reason: collision with root package name */
    public static final C2866Yb f29559C = new C2866Yb(6);

    /* renamed from: D, reason: collision with root package name */
    public static final C4089w8 f29560D = new C4089w8(14);

    /* renamed from: F, reason: collision with root package name */
    public static final C2812Ul f29562F = new C2812Ul(8);

    /* renamed from: G, reason: collision with root package name */
    public static final C2812Ul f29563G = new C2812Ul(15);

    /* renamed from: H, reason: collision with root package name */
    public static final C2812Ul f29564H = new C2812Ul(21);
    public static final Bs J = new Bs(7);

    /* renamed from: K, reason: collision with root package name */
    public static final Bs f29566K = new Bs(13);

    /* renamed from: L, reason: collision with root package name */
    public static final Bs f29567L = new Bs(18);

    /* renamed from: M, reason: collision with root package name */
    public static final String[] f29568M = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        int i = 28;
        f29561E = new C4089w8(i);
        f29565I = new C2812Ul(i);
    }

    public static D A(int i, K0 k02, Cr cr) {
        D a9 = D.a(k02, cr);
        while (true) {
            int i6 = a9.f24288a;
            if (i6 == i) {
                return a9;
            }
            com.anythink.basead.exoplayer.f.f.q(i6, "Ignoring unknown WAV chunk: ", "WavHeaderReader", new StringBuilder(String.valueOf(i6).length() + 28));
            long j6 = a9.f24289b;
            long j9 = 8 + j6;
            if ((1 & j6) != 0) {
                j9 = 9 + j6;
            }
            if (j9 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i6);
                throw U4.c(sb.toString());
            }
            k02.a((int) j9, false);
            a9 = D.a(k02, cr);
        }
    }

    public static String B(Context context, String str) {
        C4835j c4835j = C4835j.f39730C;
        String b9 = c4835j.f39756y.b(context);
        String c9 = c4835j.f39756y.c(context);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3043cl.D(java.lang.String, java.lang.CharSequence):boolean");
    }

    public static int E(int i, int i6) {
        int i9;
        if (i < 0 || i >= 3 || i6 < 0 || (i9 = i6 >> 1) >= 19) {
            return -1;
        }
        int i10 = f29574v[i];
        if (i10 == 44100) {
            int i11 = f29578z[i9] + (i6 & 1);
            return i11 + i11;
        }
        int i12 = f29577y[i9];
        return i10 == 32000 ? i12 * 6 : i12 * 4;
    }

    public static long F(byte b9, byte b10) {
        int i;
        int i6 = b9 & 255;
        int i9 = b9 & 3;
        if (i9 != 0) {
            i = 2;
            if (i9 != 1 && i9 != 2) {
                i = b10 & com.anythink.core.common.s.a.c.f16318c;
            }
        } else {
            i = 1;
        }
        int i10 = i6 >> 3;
        return i * (i10 >= 16 ? com.anythink.basead.exoplayer.d.f6764c << r6 : i10 >= 12 ? 10000 << (i10 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r6);
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
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.J2)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static InterfaceC3231gB e(InterfaceC3231gB interfaceC3231gB) {
        return !(interfaceC3231gB instanceof C3339iB) ? interfaceC3231gB instanceof C3285hB ? interfaceC3231gB : interfaceC3231gB instanceof Serializable ? new C3285hB(interfaceC3231gB) : new C3339iB(interfaceC3231gB) : interfaceC3231gB;
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

    public static String g(String str, Context context, boolean z3, HashMap hashMap) {
        C2621Jf c2621Jf;
        String d2;
        C3301ha c3301ha = AbstractC3569ma.f32168X0;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && !z3) {
            return str;
        }
        C4835j c4835j = C4835j.f39730C;
        if (!c4835j.f39756y.a(context) || TextUtils.isEmpty(str) || (d2 = (c2621Jf = c4835j.f39756y).d(context)) == null) {
            return str;
        }
        C3301ha c3301ha2 = AbstractC3569ma.f32106Q0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        String str2 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2);
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32098P0)).booleanValue();
        u2.D d9 = c4835j.f39735c;
        if (booleanValue && str.contains(str2)) {
            if (d9.F(str)) {
                Map map = (Map) hashMap.get("_ac");
                c2621Jf.getClass();
                c2621Jf.h(context, "_ac", d2, C2621Jf.f(map));
                return B(context, str).replace(str2, d2);
            }
            if (!d9.G(str)) {
                return str;
            }
            Map map2 = (Map) hashMap.get("_ai");
            c2621Jf.getClass();
            c2621Jf.h(context, "_ai", d2, C2621Jf.f(map2));
            return B(context, str).replace(str2, d2);
        }
        if (str.contains("fbs_aeid") || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32089O0)).booleanValue()) {
            return str;
        }
        if (d9.F(str)) {
            Map map3 = (Map) hashMap.get("_ac");
            c2621Jf.getClass();
            c2621Jf.h(context, "_ac", d2, C2621Jf.f(map3));
            return w(B(context, str), "fbs_aeid", d2).toString();
        }
        if (!d9.G(str)) {
            return str;
        }
        Map map4 = (Map) hashMap.get("_ai");
        c2621Jf.getClass();
        c2621Jf.h(context, "_ai", d2, C2621Jf.f(map4));
        return w(B(context, str), "fbs_aeid", d2).toString();
    }

    public static Provider h() {
        String[] strArr = f29568M;
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
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j6 * com.anythink.basead.exoplayer.b.f6388h) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static synchronized Executor j() {
        ExecutorService executorService;
        synchronized (AbstractC3043cl.class) {
            try {
                if (f29572n == null) {
                    String str = AbstractC3159eu.f29993a;
                    f29572n = Executors.newSingleThreadExecutor(new Pt("ExoPlayer:BackgroundExecutor"));
                }
                executorService = f29572n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static q2.f1 k(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tt tt = (Tt) it.next();
            if (tt.f27809c) {
                arrayList.add(k2.h.f38589n);
            } else {
                arrayList.add(new k2.h(tt.f27807a, tt.f27808b));
            }
        }
        return new q2.f1(context, (k2.h[]) arrayList.toArray(new k2.h[arrayList.size()]));
    }

    public static void l(long j6, Cr cr, InterfaceC3543m1[] interfaceC3543m1Arr) {
        int i;
        int i6;
        while (true) {
            if (cr.B() <= 1) {
                return;
            }
            int i9 = 0;
            while (true) {
                if (cr.B() == 0) {
                    i = -1;
                    break;
                }
                int K7 = cr.K();
                i9 += K7;
                if (K7 != 255) {
                    i = i9;
                    break;
                }
            }
            int i10 = 0;
            while (true) {
                if (cr.B() == 0) {
                    i10 = -1;
                    break;
                }
                int K8 = cr.K();
                i10 += K8;
                if (K8 != 255) {
                    break;
                }
            }
            int i11 = cr.f24253b + i10;
            if (i10 == -1 || i10 > cr.B()) {
                AbstractC2968bG.y("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i11 = cr.f24254c;
            } else if (i == 4 && i10 >= 8) {
                int K9 = cr.K();
                int L6 = cr.L();
                if (L6 == 49) {
                    i6 = cr.b();
                    L6 = 49;
                } else {
                    i6 = 0;
                }
                int K10 = cr.K();
                if (L6 == 47) {
                    cr.G(1);
                    L6 = 47;
                }
                boolean z3 = K9 == 181 && (L6 == 49 || L6 == 47) && K10 == 3;
                if (L6 == 49) {
                    z3 &= i6 == 1195456820;
                }
                if (z3) {
                    t(j6, cr, interfaceC3543m1Arr);
                }
            }
            cr.E(i11);
        }
    }

    public static void m(File file, byte[] bArr) {
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, XB.l(new JC[0]).contains(JC.f25655n));
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
        int i = D.a(k02, cr).f24288a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        k02.A(cr.f24252a, 0, 4, false);
        cr.E(0);
        int b9 = cr.b();
        if (b9 == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b9).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(b9);
        AbstractC2968bG.H("WavHeaderReader", sb.toString());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(K0 k02, boolean z3) {
        int i;
        Cr cr = new Cr(16);
        boolean z6 = true;
        while (true) {
            cr.y(8);
            if (!k02.A(cr.f24252a, 0, 8, true)) {
                break;
            }
            long P8 = cr.P();
            int b9 = cr.b();
            if (P8 != 1) {
                i = 8;
            } else {
                if (!k02.A(cr.f24252a, 8, 8, true)) {
                    break;
                }
                P8 = cr.j();
                i = 16;
            }
            long j6 = i;
            if (P8 < j6) {
                break;
            }
            int i6 = (int) (P8 - j6);
            if (z6) {
                if (b9 != 1718909296 || i6 < 8) {
                    break;
                }
                cr.y(4);
                k02.A(cr.f24252a, 0, 4, false);
                if (cr.b() != 1751476579) {
                    break;
                }
                if (!z3) {
                    break;
                }
                k02.c(i6 - 4, false);
                z6 = false;
            } else {
                if (b9 == 1836086884) {
                    break;
                }
                if (i6 != 0) {
                    k02.c(i6, false);
                }
                z6 = false;
            }
        }
        return false;
    }

    public static boolean q(EnumC2960b8 enumC2960b8) {
        int ordinal = enumC2960b8.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EnumC2960b8 r(Context context, Cw cw) {
        EnumC2960b8 enumC2960b8;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean exists = file.exists();
        EnumC2960b8 enumC2960b82 = EnumC2960b8.X86;
        EnumC2960b8 enumC2960b83 = EnumC2960b8.ARM7;
        EnumC2960b8 enumC2960b84 = EnumC2960b8.X86_64;
        EnumC2960b8 enumC2960b85 = EnumC2960b8.ARM64;
        EnumC2960b8 enumC2960b86 = EnumC2960b8.RISCV64;
        EnumC2960b8 enumC2960b87 = EnumC2960b8.UNKNOWN;
        EnumC2960b8 enumC2960b88 = EnumC2960b8.UNSUPPORTED;
        if (!exists) {
            if (cw != null) {
                cw.d(5017, "No lib/");
                enumC2960b8 = enumC2960b87;
                if (enumC2960b8 != enumC2960b87) {
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
                            enumC2960b82 = enumC2960b84;
                        } else if (property.equalsIgnoreCase("arm64-v8a")) {
                            enumC2960b82 = enumC2960b85;
                        } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                            enumC2960b82 = enumC2960b83;
                        } else if (property.equalsIgnoreCase("riscv64")) {
                            enumC2960b82 = enumC2960b86;
                        } else {
                            z(null, property, cw);
                        }
                    }
                    enumC2960b82 = enumC2960b88;
                } else {
                    enumC2960b82 = enumC2960b8;
                }
                if (cw != null) {
                    cw.d(5018, enumC2960b82.name());
                }
                return enumC2960b82;
            }
            cw = null;
            enumC2960b8 = enumC2960b87;
            if (enumC2960b8 != enumC2960b87) {
            }
            if (cw != null) {
            }
            return enumC2960b82;
        }
        File[] listFiles = file.listFiles(new KC(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            if (cw != null) {
                cw.d(5017, "No .so");
                enumC2960b8 = enumC2960b87;
                if (enumC2960b8 != enumC2960b87) {
                }
                if (cw != null) {
                }
                return enumC2960b82;
            }
            cw = null;
            enumC2960b8 = enumC2960b87;
            if (enumC2960b8 != enumC2960b87) {
            }
            if (cw != null) {
            }
            return enumC2960b82;
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
                    enumC2960b8 = enumC2960b82;
                } else if (s9 == 40) {
                    enumC2960b8 = enumC2960b83;
                } else if (s9 == 62) {
                    enumC2960b8 = enumC2960b84;
                } else if (s9 == 183) {
                    enumC2960b8 = enumC2960b85;
                } else if (s9 != 243) {
                    z(bArr, null, cw);
                    enumC2960b8 = enumC2960b88;
                } else {
                    enumC2960b8 = enumC2960b86;
                }
                fileInputStream.close();
                if (enumC2960b8 != enumC2960b87) {
                }
                if (cw != null) {
                }
                return enumC2960b82;
            }
            z(bArr, null, cw);
        }
        fileInputStream.close();
        enumC2960b8 = enumC2960b88;
        if (enumC2960b8 != enumC2960b87) {
        }
        if (cw != null) {
        }
        return enumC2960b82;
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

    public static void t(long j6, Cr cr, InterfaceC3543m1[] interfaceC3543m1Arr) {
        int K7 = cr.K();
        if ((K7 & 64) != 0) {
            int i = K7 & 31;
            cr.G(1);
            int i6 = cr.f24253b;
            for (InterfaceC3543m1 interfaceC3543m1 : interfaceC3543m1Arr) {
                int i9 = i * 3;
                cr.E(i6);
                interfaceC3543m1.a(i9, cr);
                AbstractC2772Sd.H(j6 != com.anythink.basead.exoplayer.b.f6382b);
                interfaceC3543m1.c(j6, 1, i9, 0, null);
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
        u1.h.i(sb, str2, "=", str3, "&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static void x(File file, File file2) {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(AbstractC2639Kg.x("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(AbstractC2639Kg.x("Source %s and destination %s must be different", file, file2));
        }
        XB l9 = XB.l(new JC[0]);
        IC ic = new IC();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ArrayDeque arrayDeque = ic.f25468n;
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, l9.contains(JC.f25655n));
            arrayDeque.addFirst(fileOutputStream);
            int i = GC.f24951a;
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
                ic.f25469u = th;
                Object obj = AbstractC3391jB.f31212a;
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

    public static void y(ArrayList arrayList, C3493l5 c3493l5) {
        String str = (String) c3493l5.r();
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
