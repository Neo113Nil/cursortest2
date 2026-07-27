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
public final class C2921aN implements YG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29050n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29051u;

    public C2921aN(String str, int i) {
        this.f29050n = i;
        switch (i) {
            case 1:
                this.f29051u = Logger.getLogger(str);
                break;
            default:
                this.f29051u = str;
                break;
        }
    }

    public static int A(int i, byte[] bArr, int i6, int i9, CK ck) {
        if ((i >>> 3) == 0) {
            throw new C3295hL("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return m(bArr, i6, ck);
        }
        if (i10 == 1) {
            return i6 + 8;
        }
        if (i10 == 2) {
            return a(bArr, i6, ck) + ck.f24098a;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i6 + 4;
            }
            throw new C3295hL("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i & (-8)) | 4;
        int i12 = ck.f24101d + 1;
        ck.f24101d = i12;
        B(i12);
        int i13 = 0;
        while (i6 < i9) {
            i6 = a(bArr, i6, ck);
            i13 = ck.f24098a;
            if (i13 == i11) {
                break;
            }
            i6 = A(i13, bArr, i6, i9, ck);
        }
        ck.f24101d--;
        if (i6 > i9 || i13 != i11) {
            throw new C3295hL("Failed to parse the message.");
        }
        return i6;
    }

    public static void B(int i) {
        if (i >= 100) {
            throw new C3295hL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public static int a(byte[] bArr, int i, CK ck) {
        int i6 = i + 1;
        byte b9 = bArr[i];
        if (b9 < 0) {
            return h(b9, bArr, i6, ck);
        }
        ck.f24098a = b9;
        return i6;
    }

    public static AF b(S0.l lVar, InterfaceC3989uG interfaceC3989uG) {
        C3240gK i;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i6 = 0; i6 < ((List) lVar.f2797u).size(); i6++) {
            C3664oE O8 = lVar.O(i6);
            if (O8.f32879b.equals(C3556mE.f31925v)) {
                WC wc = O8.f32878a;
                if (wc instanceof AbstractC4203yE) {
                    i = ((AbstractC4203yE) wc).i();
                } else {
                    if (!(wc instanceof ZF)) {
                        String name = wc.getClass().getName();
                        String valueOf = String.valueOf(wc.b());
                        throw new GeneralSecurityException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    i = ((ZF) wc).i();
                }
                C4258zF c4258zF = new C4258zF((InterfaceC3394jE) interfaceC3989uG.d(O8), O8.f32880c);
                byte[] bArr = i.f30559a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(i)) {
                    arrayList = (List) hashMap.get(i);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(i, arrayList);
                }
                arrayList.add(c4258zF);
            }
        }
        if (((HashMap) lVar.f2798v).get(AbstractC2968bG.class) != null) {
            throw new ClassCastException();
        }
        lVar.N();
        return new AF(new C3720pG(hashMap));
    }

    public static C3240gK c(C3933tE c3933tE, Integer num) {
        if (c3933tE == C3933tE.f34232f) {
            if (num == null) {
                return AbstractC3344iG.f31018a;
            }
            throw new GeneralSecurityException("RAW output prefix type cannot have an id requirement");
        }
        String str = c3933tE.f34252b;
        if (num == null) {
            throw new GeneralSecurityException(D.y.s(new StringBuilder(str.length() + 40), "idRequirement must be non-null for ", str, " type"));
        }
        if (c3933tE == C3933tE.f34230d) {
            return AbstractC3344iG.b(num.intValue());
        }
        if (c3933tE == C3933tE.f34231e || c3933tE == C3933tE.f34233g) {
            return AbstractC3344iG.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(str));
    }

    public static Object e(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
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
        AbstractC2772Sd.A(j6 == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j6);
        long[] jArr3 = new long[i];
        int i6 = 0;
        for (long[] jArr4 : jArr) {
            int length = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i6, length);
            i6 += length;
        }
        return jArr3;
    }

    public static int h(int i, byte[] bArr, int i6, CK ck) {
        byte b9 = bArr[i6];
        int i9 = i6 + 1;
        int i10 = i & com.anythink.expressad.video.module.a.a.f21728R;
        if (b9 >= 0) {
            ck.f24098a = i10 | (b9 << 7);
            return i9;
        }
        int i11 = i10 | ((b9 & Byte.MAX_VALUE) << 7);
        int i12 = i6 + 2;
        byte b10 = bArr[i9];
        if (b10 >= 0) {
            ck.f24098a = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 14);
        int i14 = i6 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            ck.f24098a = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 21);
        int i16 = i6 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            ck.f24098a = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                ck.f24098a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int i(C3879sE c3879sE) {
        if (c3879sE.equals(C3879sE.f33909c)) {
            return 2;
        }
        if (c3879sE.equals(C3879sE.f33910d)) {
            return 3;
        }
        if (c3879sE.equals(C3879sE.f33911e)) {
            return 4;
        }
        if (c3879sE.equals(C3879sE.f33912f)) {
            return 5;
        }
        if (c3879sE.equals(C3879sE.f33913g)) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(c3879sE.f33928b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int j(boolean z3) {
        List supportedPerformancePoints;
        boolean covers;
        try {
            C3299hP c3299hP = new C3299hP();
            c3299hP.e(com.anythink.basead.exoplayer.k.o.f8451h);
            DP dp = new DP(c3299hP);
            if (dp.f24431o != null) {
                C3500lC b9 = WP.b(C3084dP.f29775z, dp, z3, false);
                for (int i = 0; i < b9.f31747w; i++) {
                    if (((OP) b9.get(i)).f26607d != null && (r2 = ((OP) b9.get(i)).f26607d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        P.e.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint c9 = P.e.c();
                        for (int i6 = 0; i6 < supportedPerformancePoints.size(); i6++) {
                            covers = P.e.e(supportedPerformancePoints.get(i6)).covers(c9);
                            if (covers) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (TP unused) {
        }
        return 0;
    }

    public static YG k(WG wg) {
        C3105du c3105du = wg.f28330c;
        ZG zg = new ZG(((C3240gK) c3105du.f29859u).b());
        try {
            Provider h9 = AbstractC3043cl.h();
            if (h9 == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", h9);
            return new S0.e(23, zg, new C2991bm(((C3240gK) c3105du.f29859u).b(), h9));
        } catch (GeneralSecurityException unused) {
            return zg;
        }
    }

    public static C2921aN l(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new C2921aN(cls.getSimpleName(), 0) : new C2921aN(cls.getSimpleName(), 1);
    }

    public static int m(byte[] bArr, int i, CK ck) {
        long j6 = bArr[i];
        int i6 = i + 1;
        if (j6 >= 0) {
            ck.f24099b = j6;
            return i6;
        }
        int i9 = i + 2;
        byte b9 = bArr[i6];
        long j9 = (j6 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b9 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j9 |= (r10 & Byte.MAX_VALUE) << i10;
            b9 = bArr[i9];
            i9 = i11;
        }
        ck.f24099b = j9;
        return i9;
    }

    public static C3879sE n(int i) {
        int i6 = i - 2;
        if (i6 == 0) {
            return C3879sE.f33909c;
        }
        if (i6 == 1) {
            return C3879sE.f33910d;
        }
        if (i6 == 2) {
            return C3879sE.f33911e;
        }
        if (i6 == 3) {
            return C3879sE.f33912f;
        }
        if (i6 == 4) {
            return C3879sE.f33913g;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i6)));
    }

    public static int o(int i, byte[] bArr) {
        int i6 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i9 << 8) | i6 | (i10 << 16);
    }

    public static C3933tE p(int i) {
        int i6 = i - 2;
        if (i6 == 0) {
            return C3933tE.f34229c;
        }
        if (i6 == 1) {
            return C3933tE.f34230d;
        }
        if (i6 == 2) {
            return C3933tE.f34231e;
        }
        if (i6 == 3) {
            return C3933tE.f34232f;
        }
        if (i6 == 4) {
            return C3933tE.f34233g;
        }
        if (i6 == 5) {
            return C3933tE.f34234h;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i6)));
    }

    public static int q(C3933tE c3933tE) {
        if (c3933tE.equals(C3933tE.f34229c)) {
            return 2;
        }
        if (c3933tE.equals(C3933tE.f34230d)) {
            return 3;
        }
        if (c3933tE.equals(C3933tE.f34231e)) {
            return 4;
        }
        if (c3933tE.equals(C3933tE.f34232f)) {
            return 5;
        }
        if (c3933tE.equals(C3933tE.f34233g)) {
            return 6;
        }
        if (c3933tE.equals(C3933tE.f34234h)) {
            return 7;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(c3933tE.f34252b));
    }

    public static long r(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int s(byte[] bArr, int i, CK ck) {
        int a9 = a(bArr, i, ck);
        int i6 = ck.f24098a;
        if (i6 < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 == 0) {
            ck.f24100c = "";
            return a9;
        }
        ck.f24100c = RL.c(bArr, a9, i6);
        return a9 + i6;
    }

    public static int t(byte[] bArr, int i, CK ck) {
        int a9 = a(bArr, i, ck);
        int i6 = ck.f24098a;
        if (i6 < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 > bArr.length - a9) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i6 == 0) {
            ck.f24100c = JK.f25675u;
            return a9;
        }
        ck.f24100c = JK.s(bArr, a9, i6);
        return a9 + i6;
    }

    public static int u(Object obj, DL dl, byte[] bArr, int i, int i6, CK ck) {
        int i9 = i + 1;
        int i10 = bArr[i];
        if (i10 < 0) {
            i9 = h(i10, bArr, i9, ck);
            i10 = ck.f24098a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i6 - i11) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = ck.f24101d + 1;
        ck.f24101d = i12;
        B(i12);
        int i13 = i11 + i10;
        dl.f(obj, bArr, i11, i13, ck);
        ck.f24101d--;
        ck.f24100c = obj;
        return i13;
    }

    public static int v(Object obj, DL dl, byte[] bArr, int i, int i6, int i9, CK ck) {
        int i10 = ck.f24101d + 1;
        ck.f24101d = i10;
        B(i10);
        int y7 = ((C3832rL) dl).y(obj, bArr, i, i6, i9, ck);
        ck.f24101d--;
        ck.f24100c = obj;
        return y7;
    }

    public static int w(int i, byte[] bArr, int i6, int i9, InterfaceC3026cL interfaceC3026cL, CK ck) {
        WK wk = (WK) interfaceC3026cL;
        int a9 = a(bArr, i6, ck);
        wk.e(ck.f24098a);
        while (a9 < i9) {
            int a10 = a(bArr, a9, ck);
            if (i != ck.f24098a) {
                break;
            }
            a9 = a(bArr, a10, ck);
            wk.e(ck.f24098a);
        }
        return a9;
    }

    public static int x(byte[] bArr, int i, InterfaceC3026cL interfaceC3026cL, CK ck) {
        WK wk = (WK) interfaceC3026cL;
        int a9 = a(bArr, i, ck);
        int i6 = ck.f24098a;
        if (i6 < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 > bArr.length - a9) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = i6 + a9;
        while (a9 < i9) {
            a9 = a(bArr, a9, ck);
            wk.e(ck.f24098a);
        }
        if (a9 == i9) {
            return a9;
        }
        throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int y(DL dl, int i, byte[] bArr, int i6, int i9, InterfaceC3026cL interfaceC3026cL, CK ck) {
        VK c9 = dl.c();
        DL dl2 = dl;
        byte[] bArr2 = bArr;
        int i10 = i9;
        CK ck2 = ck;
        int u3 = u(c9, dl2, bArr2, i6, i10, ck2);
        dl2.g(c9);
        ck2.f24100c = c9;
        interfaceC3026cL.add(c9);
        while (u3 < i10) {
            CK ck3 = ck2;
            int i11 = i10;
            int a9 = a(bArr2, u3, ck3);
            if (i != ck3.f24098a) {
                break;
            }
            byte[] bArr3 = bArr2;
            DL dl3 = dl2;
            VK c10 = dl3.c();
            u3 = u(c10, dl3, bArr3, a9, i11, ck3);
            dl2 = dl3;
            bArr2 = bArr3;
            i10 = i11;
            ck2 = ck3;
            dl2.g(c10);
            ck2.f24100c = c10;
            interfaceC3026cL.add(c10);
        }
        return u3;
    }

    public static int z(int i, byte[] bArr, int i6, int i9, LL ll, CK ck) {
        if ((i >>> 3) == 0) {
            throw new C3295hL("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int m4 = m(bArr, i6, ck);
            ll.d(i, Long.valueOf(ck.f24099b));
            return m4;
        }
        if (i10 == 1) {
            ll.d(i, Long.valueOf(r(i6, bArr)));
            return i6 + 8;
        }
        if (i10 == 2) {
            int a9 = a(bArr, i6, ck);
            int i11 = ck.f24098a;
            if (i11 < 0) {
                throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - a9) {
                throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                ll.d(i, JK.f25675u);
            } else {
                ll.d(i, JK.s(bArr, a9, i11));
            }
            return a9 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new C3295hL("Protocol message contained an invalid tag (zero).");
            }
            ll.d(i, Integer.valueOf(o(i6, bArr)));
            return i6 + 4;
        }
        int i12 = (i & (-8)) | 4;
        LL a10 = LL.a();
        int i13 = ck.f24101d + 1;
        ck.f24101d = i13;
        B(i13);
        int i14 = 0;
        while (true) {
            if (i6 >= i9) {
                break;
            }
            int a11 = a(bArr, i6, ck);
            int i15 = ck.f24098a;
            if (i15 == i12) {
                i14 = i15;
                i6 = a11;
                break;
            }
            i6 = z(i15, bArr, a11, i9, a10, ck);
            i14 = i15;
        }
        ck.f24101d--;
        if (i6 > i9 || i14 != i12) {
            throw new C3295hL("Failed to parse the message.");
        }
        ll.d(i, a10);
        return i6;
    }

    public final void f(String str) {
        switch (this.f29050n) {
            case 0:
                String str2 = (String) this.f29051u;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                Log.d("isoparser", sb.toString());
                break;
            default:
                ((Logger) this.f29051u).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
