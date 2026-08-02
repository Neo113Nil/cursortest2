package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.aN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2944aN implements YG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29820n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29821u;

    public C2944aN(String str, int i) {
        this.f29820n = i;
        switch (i) {
            case 1:
                this.f29821u = Logger.getLogger(str);
                break;
            default:
                this.f29821u = str;
                break;
        }
    }

    public static int A(int i, byte[] bArr, int i4, int i6, CK ck) {
        if ((i >>> 3) == 0) {
            throw new C3318hL("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i & 7;
        if (i9 == 0) {
            return m(bArr, i4, ck);
        }
        if (i9 == 1) {
            return i4 + 8;
        }
        if (i9 == 2) {
            return a(bArr, i4, ck) + ck.f24861a;
        }
        if (i9 != 3) {
            if (i9 == 5) {
                return i4 + 4;
            }
            throw new C3318hL("Protocol message contained an invalid tag (zero).");
        }
        int i10 = (i & (-8)) | 4;
        int i11 = ck.f24864d + 1;
        ck.f24864d = i11;
        B(i11);
        int i12 = 0;
        while (i4 < i6) {
            i4 = a(bArr, i4, ck);
            i12 = ck.f24861a;
            if (i12 == i10) {
                break;
            }
            i4 = A(i12, bArr, i4, i6, ck);
        }
        ck.f24864d--;
        if (i4 > i6 || i12 != i10) {
            throw new C3318hL("Failed to parse the message.");
        }
        return i4;
    }

    public static void B(int i) {
        if (i >= 100) {
            throw new C3318hL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public static int a(byte[] bArr, int i, CK ck) {
        int i4 = i + 1;
        byte b9 = bArr[i];
        if (b9 < 0) {
            return h(b9, bArr, i4, ck);
        }
        ck.f24861a = b9;
        return i4;
    }

    public static AF b(S0.l lVar, InterfaceC4012uG interfaceC4012uG) {
        C3263gK i;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < ((List) lVar.f2926u).size(); i4++) {
            C3687oE O8 = lVar.O(i4);
            if (O8.f33666b.equals(C3579mE.f32705v)) {
                WC wc = O8.f33665a;
                if (wc instanceof AbstractC4226yE) {
                    i = ((AbstractC4226yE) wc).i();
                } else {
                    if (!(wc instanceof ZF)) {
                        String name = wc.getClass().getName();
                        String valueOf = String.valueOf(wc.b());
                        throw new GeneralSecurityException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    i = ((ZF) wc).i();
                }
                C4281zF c4281zF = new C4281zF((InterfaceC3417jE) interfaceC4012uG.d(O8), O8.f33667c);
                byte[] bArr = i.f31325a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(i)) {
                    arrayList = (List) hashMap.get(i);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(i, arrayList);
                }
                arrayList.add(c4281zF);
            }
        }
        if (((HashMap) lVar.f2927v).get(AbstractC2991bG.class) != null) {
            throw new ClassCastException();
        }
        lVar.N();
        return new AF(new C3743pG(hashMap));
    }

    public static C3263gK c(C3956tE c3956tE, Integer num) {
        if (c3956tE == C3956tE.f35018f) {
            if (num == null) {
                return AbstractC3367iG.f31791a;
            }
            throw new GeneralSecurityException("RAW output prefix type cannot have an id requirement");
        }
        String str = c3956tE.f35038b;
        if (num == null) {
            throw new GeneralSecurityException(D.x.p(new StringBuilder(str.length() + 40), "idRequirement must be non-null for ", str, " type"));
        }
        if (c3956tE == C3956tE.f35016d) {
            return AbstractC3367iG.b(num.intValue());
        }
        if (c3956tE == C3956tE.f35017e || c3956tE == C3956tE.f35019g) {
            return AbstractC3367iG.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(str));
    }

    public static Object e(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static long[] g(long[]... jArr) {
        long j6 = 0;
        for (long[] jArr2 : jArr) {
            j6 += jArr2.length;
        }
        int i = (int) j6;
        AbstractC2792Sd.A(j6 == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j6);
        long[] jArr3 = new long[i];
        int i4 = 0;
        for (long[] jArr4 : jArr) {
            int length = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i4, length);
            i4 += length;
        }
        return jArr3;
    }

    public static int h(int i, byte[] bArr, int i4, CK ck) {
        byte b9 = bArr[i4];
        int i6 = i4 + 1;
        int i9 = i & com.anythink.expressad.video.module.a.a.f22515R;
        if (b9 >= 0) {
            ck.f24861a = i9 | (b9 << 7);
            return i6;
        }
        int i10 = i9 | ((b9 & Byte.MAX_VALUE) << 7);
        int i11 = i4 + 2;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            ck.f24861a = i10 | (b10 << 14);
            return i11;
        }
        int i12 = i10 | ((b10 & Byte.MAX_VALUE) << 14);
        int i13 = i4 + 3;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            ck.f24861a = i12 | (b11 << 21);
            return i13;
        }
        int i14 = i12 | ((b11 & Byte.MAX_VALUE) << 21);
        int i15 = i4 + 4;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            ck.f24861a = i14 | (b12 << 28);
            return i15;
        }
        int i16 = i14 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                ck.f24861a = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    public static int i(C3902sE c3902sE) {
        if (c3902sE.equals(C3902sE.f34677c)) {
            return 2;
        }
        if (c3902sE.equals(C3902sE.f34678d)) {
            return 3;
        }
        if (c3902sE.equals(C3902sE.f34679e)) {
            return 4;
        }
        if (c3902sE.equals(C3902sE.f34680f)) {
            return 5;
        }
        if (c3902sE.equals(C3902sE.f34681g)) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(c3902sE.f34696b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int j(boolean z6) {
        List supportedPerformancePoints;
        boolean covers;
        try {
            C3322hP c3322hP = new C3322hP();
            c3322hP.e(com.anythink.basead.exoplayer.k.o.f9237h);
            DP dp = new DP(c3322hP);
            if (dp.f25176o != null) {
                C3523lC b9 = ZP.b(C3107dP.f30547z, dp, z6, false);
                for (int i = 0; i < b9.f32527w; i++) {
                    if (((PP) b9.get(i)).f27600d != null && (r2 = ((PP) b9.get(i)).f27600d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        P.e.i();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint c9 = P.e.c();
                        for (int i4 = 0; i4 < supportedPerformancePoints.size(); i4++) {
                            covers = P.e.e(supportedPerformancePoints.get(i4)).covers(c9);
                            if (covers) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (UP unused) {
        }
        return 0;
    }

    public static YG k(WG wg) {
        C3128du c3128du = wg.f29128c;
        ZG zg = new ZG(((C3263gK) c3128du.f30647u).b());
        try {
            Provider h3 = AbstractC3066cl.h();
            if (h3 == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", h3);
            return new S0.e(27, zg, new C3067cm(((C3263gK) c3128du.f30647u).b(), h3));
        } catch (GeneralSecurityException unused) {
            return zg;
        }
    }

    public static C2944aN l(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new C2944aN(cls.getSimpleName(), 0) : new C2944aN(cls.getSimpleName(), 1);
    }

    public static int m(byte[] bArr, int i, CK ck) {
        long j6 = bArr[i];
        int i4 = i + 1;
        if (j6 >= 0) {
            ck.f24862b = j6;
            return i4;
        }
        int i6 = i + 2;
        byte b9 = bArr[i4];
        long j9 = (j6 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i9 = 7;
        while (b9 < 0) {
            int i10 = i6 + 1;
            i9 += 7;
            j9 |= (r10 & Byte.MAX_VALUE) << i9;
            b9 = bArr[i6];
            i6 = i10;
        }
        ck.f24862b = j9;
        return i6;
    }

    public static C3902sE n(int i) {
        int i4 = i - 2;
        if (i4 == 0) {
            return C3902sE.f34677c;
        }
        if (i4 == 1) {
            return C3902sE.f34678d;
        }
        if (i4 == 2) {
            return C3902sE.f34679e;
        }
        if (i4 == 3) {
            return C3902sE.f34680f;
        }
        if (i4 == 4) {
            return C3902sE.f34681g;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i4)));
    }

    public static int o(int i, byte[] bArr) {
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i9 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i9 << 16);
    }

    public static C3956tE p(int i) {
        int i4 = i - 2;
        if (i4 == 0) {
            return C3956tE.f35015c;
        }
        if (i4 == 1) {
            return C3956tE.f35016d;
        }
        if (i4 == 2) {
            return C3956tE.f35017e;
        }
        if (i4 == 3) {
            return C3956tE.f35018f;
        }
        if (i4 == 4) {
            return C3956tE.f35019g;
        }
        if (i4 == 5) {
            return C3956tE.f35020h;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i4)));
    }

    public static int q(C3956tE c3956tE) {
        if (c3956tE.equals(C3956tE.f35015c)) {
            return 2;
        }
        if (c3956tE.equals(C3956tE.f35016d)) {
            return 3;
        }
        if (c3956tE.equals(C3956tE.f35017e)) {
            return 4;
        }
        if (c3956tE.equals(C3956tE.f35018f)) {
            return 5;
        }
        if (c3956tE.equals(C3956tE.f35019g)) {
            return 6;
        }
        if (c3956tE.equals(C3956tE.f35020h)) {
            return 7;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(c3956tE.f35038b));
    }

    public static long r(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int s(byte[] bArr, int i, CK ck) {
        int a9 = a(bArr, i, ck);
        int i4 = ck.f24861a;
        if (i4 < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            ck.f24863c = "";
            return a9;
        }
        ck.f24863c = RL.c(bArr, a9, i4);
        return a9 + i4;
    }

    public static int t(byte[] bArr, int i, CK ck) {
        int a9 = a(bArr, i, ck);
        int i4 = ck.f24861a;
        if (i4 < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - a9) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            ck.f24863c = JK.f26428u;
            return a9;
        }
        ck.f24863c = JK.s(bArr, a9, i4);
        return a9 + i4;
    }

    public static int u(Object obj, DL dl, byte[] bArr, int i, int i4, CK ck) {
        int i6 = i + 1;
        int i9 = bArr[i];
        if (i9 < 0) {
            i6 = h(i9, bArr, i6, ck);
            i9 = ck.f24861a;
        }
        int i10 = i6;
        if (i9 < 0 || i9 > i4 - i10) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = ck.f24864d + 1;
        ck.f24864d = i11;
        B(i11);
        int i12 = i10 + i9;
        dl.f(obj, bArr, i10, i12, ck);
        ck.f24864d--;
        ck.f24863c = obj;
        return i12;
    }

    public static int v(Object obj, DL dl, byte[] bArr, int i, int i4, int i6, CK ck) {
        int i9 = ck.f24864d + 1;
        ck.f24864d = i9;
        B(i9);
        int y7 = ((C3855rL) dl).y(obj, bArr, i, i4, i6, ck);
        ck.f24864d--;
        ck.f24863c = obj;
        return y7;
    }

    public static int w(int i, byte[] bArr, int i4, int i6, InterfaceC3049cL interfaceC3049cL, CK ck) {
        WK wk = (WK) interfaceC3049cL;
        int a9 = a(bArr, i4, ck);
        wk.e(ck.f24861a);
        while (a9 < i6) {
            int a10 = a(bArr, a9, ck);
            if (i != ck.f24861a) {
                break;
            }
            a9 = a(bArr, a10, ck);
            wk.e(ck.f24861a);
        }
        return a9;
    }

    public static int x(byte[] bArr, int i, InterfaceC3049cL interfaceC3049cL, CK ck) {
        WK wk = (WK) interfaceC3049cL;
        int a9 = a(bArr, i, ck);
        int i4 = ck.f24861a;
        if (i4 < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - a9) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = i4 + a9;
        while (a9 < i6) {
            a9 = a(bArr, a9, ck);
            wk.e(ck.f24861a);
        }
        if (a9 == i6) {
            return a9;
        }
        throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int y(DL dl, int i, byte[] bArr, int i4, int i6, InterfaceC3049cL interfaceC3049cL, CK ck) {
        VK c9 = dl.c();
        DL dl2 = dl;
        byte[] bArr2 = bArr;
        int i9 = i6;
        CK ck2 = ck;
        int u6 = u(c9, dl2, bArr2, i4, i9, ck2);
        dl2.g(c9);
        ck2.f24863c = c9;
        interfaceC3049cL.add(c9);
        while (u6 < i9) {
            CK ck3 = ck2;
            int i10 = i9;
            int a9 = a(bArr2, u6, ck3);
            if (i != ck3.f24861a) {
                break;
            }
            byte[] bArr3 = bArr2;
            DL dl3 = dl2;
            VK c10 = dl3.c();
            u6 = u(c10, dl3, bArr3, a9, i10, ck3);
            dl2 = dl3;
            bArr2 = bArr3;
            i9 = i10;
            ck2 = ck3;
            dl2.g(c10);
            ck2.f24863c = c10;
            interfaceC3049cL.add(c10);
        }
        return u6;
    }

    public static int z(int i, byte[] bArr, int i4, int i6, LL ll, CK ck) {
        if ((i >>> 3) == 0) {
            throw new C3318hL("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i & 7;
        if (i9 == 0) {
            int m9 = m(bArr, i4, ck);
            ll.d(i, Long.valueOf(ck.f24862b));
            return m9;
        }
        if (i9 == 1) {
            ll.d(i, Long.valueOf(r(i4, bArr)));
            return i4 + 8;
        }
        if (i9 == 2) {
            int a9 = a(bArr, i4, ck);
            int i10 = ck.f24861a;
            if (i10 < 0) {
                throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i10 > bArr.length - a9) {
                throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i10 == 0) {
                ll.d(i, JK.f26428u);
            } else {
                ll.d(i, JK.s(bArr, a9, i10));
            }
            return a9 + i10;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new C3318hL("Protocol message contained an invalid tag (zero).");
            }
            ll.d(i, Integer.valueOf(o(i4, bArr)));
            return i4 + 4;
        }
        int i11 = (i & (-8)) | 4;
        LL a10 = LL.a();
        int i12 = ck.f24864d + 1;
        ck.f24864d = i12;
        B(i12);
        int i13 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int a11 = a(bArr, i4, ck);
            int i14 = ck.f24861a;
            if (i14 == i11) {
                i13 = i14;
                i4 = a11;
                break;
            }
            i4 = z(i14, bArr, a11, i6, a10, ck);
            i13 = i14;
        }
        ck.f24864d--;
        if (i4 > i6 || i13 != i11) {
            throw new C3318hL("Failed to parse the message.");
        }
        ll.d(i, a10);
        return i4;
    }

    public final void f(String str) {
        switch (this.f29820n) {
            case 0:
                String str2 = (String) this.f29821u;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                Log.d("isoparser", sb.toString());
                break;
            default:
                ((Logger) this.f29821u).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
