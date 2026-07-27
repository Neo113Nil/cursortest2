package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class C0 implements H2 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24002n;

    /* renamed from: u, reason: collision with root package name */
    public int f24003u;

    /* renamed from: v, reason: collision with root package name */
    public int f24004v;

    /* renamed from: w, reason: collision with root package name */
    public int f24005w;

    /* renamed from: x, reason: collision with root package name */
    public int f24006x;

    /* renamed from: y, reason: collision with root package name */
    public Object f24007y;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
    
        if (r5.h(1) > 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b A[Catch: RuntimeException -> 0x024f, TryCatch #0 {RuntimeException -> 0x024f, blocks: (B:3:0x0009, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0083, B:18:0x00c9, B:20:0x00d7, B:22:0x00e5, B:24:0x010d, B:26:0x0113, B:28:0x0124, B:30:0x012d, B:32:0x0135, B:34:0x0146, B:36:0x0153, B:38:0x0164, B:40:0x016a, B:42:0x017b, B:44:0x0181, B:46:0x0192, B:48:0x019a, B:50:0x01a4, B:52:0x01a7, B:55:0x01a9, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d1, B:64:0x01de, B:66:0x01e4, B:68:0x01e9, B:69:0x01ec, B:72:0x01f7, B:73:0x01fe, B:76:0x0205, B:78:0x020b, B:80:0x0217, B:87:0x023a, B:90:0x0245, B:94:0x0236, B:99:0x01d8), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0217 A[Catch: RuntimeException -> 0x024f, TryCatch #0 {RuntimeException -> 0x024f, blocks: (B:3:0x0009, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0083, B:18:0x00c9, B:20:0x00d7, B:22:0x00e5, B:24:0x010d, B:26:0x0113, B:28:0x0124, B:30:0x012d, B:32:0x0135, B:34:0x0146, B:36:0x0153, B:38:0x0164, B:40:0x016a, B:42:0x017b, B:44:0x0181, B:46:0x0192, B:48:0x019a, B:50:0x01a4, B:52:0x01a7, B:55:0x01a9, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d1, B:64:0x01de, B:66:0x01e4, B:68:0x01e9, B:69:0x01ec, B:72:0x01f7, B:73:0x01fe, B:76:0x0205, B:78:0x020b, B:80:0x0217, B:87:0x023a, B:90:0x0245, B:94:0x0236, B:99:0x01d8), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0 d(byte[] bArr) {
        int i;
        int i6;
        int h9;
        try {
            C4233yr c4233yr = new C4233yr(bArr, bArr.length);
            c4233yr.e();
            int h10 = c4233yr.h(7);
            if (h10 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(h10).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(h10);
                AbstractC2968bG.y("Av1Config", sb.toString());
                return null;
            }
            int h11 = c4233yr.h(3);
            int h12 = c4233yr.h(5);
            boolean g4 = c4233yr.g();
            int i9 = c4233yr.g() ? true != c4233yr.g() ? 10 : 12 : 8;
            c4233yr.f(13);
            Object[] objArr = {Integer.valueOf(h12)};
            String str = AbstractC3159eu.f29993a;
            Locale locale = Locale.US;
            String format = String.format(locale, "%02d", objArr);
            String str2 = true != g4 ? "M" : "H";
            String format2 = String.format(locale, "%02d", Integer.valueOf(i9));
            StringBuilder sb2 = new StringBuilder(String.valueOf(h11).length() + 6 + format.length() + 2 + format2.length());
            sb2.append("av01.");
            sb2.append(h11);
            sb2.append(com.anythink.core.common.d.j.f12378z);
            sb2.append(format);
            sb2.append(str2);
            sb2.append(com.anythink.core.common.d.j.f12378z);
            sb2.append(format2);
            String sb3 = sb2.toString();
            if (c4233yr.b() <= 0) {
                return new C0(sb3, i9, -1, -1, -1);
            }
            c4233yr.e();
            int h13 = c4233yr.h(4);
            if (h13 != 1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(h13).length() + 22);
                sb4.append("Unsupported obu_type: ");
                sb4.append(h13);
                AbstractC2968bG.t("Av1Config", sb4.toString());
                return new C0(sb3, i9, -1, -1, -1);
            }
            if (c4233yr.g()) {
                AbstractC2968bG.t("Av1Config", "Unsupported obu_extension_flag");
                return new C0(sb3, i9, -1, -1, -1);
            }
            boolean g9 = c4233yr.g();
            c4233yr.e();
            if (g9 && c4233yr.h(8) > 127) {
                AbstractC2968bG.t("Av1Config", "Excessive obu_size");
                return new C0(sb3, i9, -1, -1, -1);
            }
            int h14 = c4233yr.h(3);
            c4233yr.e();
            if (c4233yr.g()) {
                AbstractC2968bG.t("Av1Config", "Unsupported reduced_still_picture_header");
                return new C0(sb3, i9, -1, -1, -1);
            }
            if (c4233yr.g()) {
                AbstractC2968bG.t("Av1Config", "Unsupported timing_info_present_flag");
                return new C0(sb3, i9, -1, -1, -1);
            }
            if (c4233yr.g()) {
                AbstractC2968bG.t("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new C0(sb3, i9, -1, -1, -1);
            }
            int h15 = c4233yr.h(5);
            boolean z3 = false;
            for (int i10 = 0; i10 <= h15; i10++) {
                c4233yr.f(12);
                if (c4233yr.h(5) > 7) {
                    c4233yr.e();
                }
            }
            int h16 = c4233yr.h(4);
            int h17 = c4233yr.h(4);
            c4233yr.f(h16 + 1);
            c4233yr.f(h17 + 1);
            if (c4233yr.g()) {
                i = 7;
                c4233yr.f(7);
            } else {
                i = 7;
            }
            c4233yr.f(i);
            boolean g10 = c4233yr.g();
            if (g10) {
                c4233yr.f(2);
            }
            if (!c4233yr.g()) {
            }
            if (!c4233yr.g()) {
                c4233yr.f(1);
            }
            if (g10) {
                c4233yr.f(3);
            }
            c4233yr.f(3);
            boolean g11 = c4233yr.g();
            if (h14 == 2) {
                if (g11) {
                    c4233yr.e();
                }
            } else if (h14 == 1) {
                if (c4233yr.g()) {
                    return new C0(sb3, i9, -1, -1, -1);
                }
                int h18 = c4233yr.h(8);
                int h19 = c4233yr.h(8);
                int h20 = c4233yr.h(8);
                if (!z3 && h18 == 1) {
                    if (h19 == 13) {
                        if (h20 == 0) {
                            h18 = 1;
                            h9 = 1;
                            i6 = 13;
                            return new C0(sb3, i9, KJ.b(h18), h9 == 1 ? 1 : 2, KJ.c(i6));
                        }
                        h18 = 1;
                        i6 = 13;
                        h9 = c4233yr.h(1);
                        return new C0(sb3, i9, KJ.b(h18), h9 == 1 ? 1 : 2, KJ.c(i6));
                    }
                    h18 = 1;
                }
                i6 = h19;
                h9 = c4233yr.h(1);
                return new C0(sb3, i9, KJ.b(h18), h9 == 1 ? 1 : 2, KJ.c(i6));
            }
            if (c4233yr.g()) {
                z3 = true;
            }
            if (c4233yr.g()) {
            }
        } catch (RuntimeException e9) {
            throw U4.a(e9, "Error parsing AV1 config");
        }
    }

    public Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = ((LinkedHashMap) this.f24007y).get(obj);
                if (obj2 != null) {
                    this.f24005w++;
                    return obj2;
                }
                this.f24006x++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f24003u++;
                put = ((LinkedHashMap) this.f24007y).put(obj, obj2);
                if (put != null) {
                    this.f24003u--;
                }
            } finally {
            }
        }
        int i = this.f24004v;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f24003u < 0 || (((LinkedHashMap) this.f24007y).isEmpty() && this.f24003u != 0)) {
                        break;
                    }
                    if (this.f24003u <= i || ((LinkedHashMap) this.f24007y).isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) ((LinkedHashMap) this.f24007y).entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    ((LinkedHashMap) this.f24007y).remove(key);
                    this.f24003u--;
                } finally {
                }
            }
        }
        return put;
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int c() {
        return this.f24003u;
    }

    public void e() {
        int i = this.f24006x + 1;
        this.f24006x = i;
        if (i == 8) {
            this.f24006x = 0;
            int i6 = this.f24005w;
            this.f24005w = i6 + (true == o(i6 + 1) ? 2 : 1);
        }
        p();
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int f() {
        return -1;
    }

    public long g() {
        int i = this.f24005w;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f24007y;
        int i6 = this.f24003u;
        long j6 = jArr[i6];
        this.f24003u = this.f24006x & (i6 + 1);
        this.f24005w = i - 1;
        return j6;
    }

    public void h(int i) {
        int i6 = this.f24005w;
        int i9 = i / 8;
        int i10 = i6 + i9;
        this.f24005w = i10;
        int i11 = (i - (i9 * 8)) + this.f24006x;
        this.f24006x = i11;
        if (i11 > 7) {
            this.f24005w = i10 + 1;
            this.f24006x = i11 - 8;
        }
        while (true) {
            i6++;
            if (i6 > this.f24005w) {
                p();
                return;
            } else if (o(i6)) {
                this.f24005w++;
                i6 += 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int i() {
        Cr cr = (Cr) this.f24007y;
        int i = this.f24004v;
        if (i == 8) {
            return cr.K();
        }
        if (i == 16) {
            return cr.L();
        }
        int i6 = this.f24005w;
        this.f24005w = i6 + 1;
        if (i6 % 2 != 0) {
            return this.f24006x & 15;
        }
        int K7 = cr.K();
        this.f24006x = K7;
        return (K7 & 240) >> 4;
    }

    public boolean j(int i) {
        int i6;
        int i9 = this.f24005w;
        int i10 = i / 8;
        int i11 = i9 + i10;
        int i12 = (this.f24006x + i) - (i10 * 8);
        if (i12 > 7) {
            i11++;
            i12 -= 8;
        }
        while (true) {
            i9++;
            i6 = this.f24003u;
            if (i9 > i11 || i11 > i6) {
                break;
            }
            if (o(i9)) {
                i11++;
                i9 += 2;
            }
        }
        if (i11 >= i6) {
            return i11 == i6 && i12 == 0;
        }
        return true;
    }

    public boolean k() {
        int i = ((byte[]) this.f24007y)[this.f24005w] & (128 >> this.f24006x);
        e();
        return i != 0;
    }

    public int l(int i) {
        int i6;
        byte[] bArr;
        this.f24006x += i;
        int i9 = 0;
        while (true) {
            i6 = this.f24006x;
            bArr = (byte[]) this.f24007y;
            if (i6 <= 8) {
                break;
            }
            int i10 = i6 - 8;
            this.f24006x = i10;
            int i11 = this.f24005w;
            i9 |= (bArr[i11] & 255) << i10;
            if (true != o(i11 + 1)) {
                r3 = 1;
            }
            this.f24005w = i11 + r3;
        }
        int i12 = this.f24005w;
        int i13 = i9 | ((bArr[i12] & 255) >> (8 - i6));
        int i14 = 32 - i;
        if (i6 == 8) {
            this.f24006x = 0;
            this.f24005w = i12 + (true != o(i12 + 1) ? 1 : 2);
        }
        int i15 = ((-1) >>> i14) & i13;
        p();
        return i15;
    }

    public int m() {
        int n9 = n();
        int i = n9 % 2;
        return ((n9 + 1) / 2) * (i == 0 ? -1 : 1);
    }

    public int n() {
        int i = 0;
        while (!k()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? l(i) : 0);
    }

    public boolean o(int i) {
        int i6 = i - 2;
        if (this.f24004v > i6 || i >= this.f24003u) {
            return false;
        }
        byte[] bArr = (byte[]) this.f24007y;
        return bArr[i] == 3 && bArr[i6] == 0 && bArr[i + (-1)] == 0;
    }

    public void p() {
        int i;
        int i6 = this.f24005w;
        boolean z3 = false;
        if (i6 >= 0 && (i6 < (i = this.f24003u) || (i6 == i && this.f24006x == 0))) {
            z3 = true;
        }
        AbstractC2772Sd.H(z3);
    }

    public synchronized String toString() {
        String str;
        switch (this.f24002n) {
            case 4:
                synchronized (this) {
                    try {
                        int i = this.f24005w;
                        int i6 = this.f24006x;
                        int i9 = i + i6;
                        int i10 = i9 != 0 ? (i * 100) / i9 : 0;
                        Locale locale = Locale.US;
                        str = "LruCache[maxSize=" + this.f24004v + ",hits=" + i + ",misses=" + i6 + ",hitRate=" + i10 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C0(String str, int i, int i6, int i9, int i10) {
        this.f24002n = 0;
        this.f24003u = i;
        this.f24007y = str;
        this.f24004v = i6;
        this.f24005w = i9;
        this.f24006x = i10;
    }

    public C0(Zw zw) {
        this.f24002n = 1;
        Cr cr = zw.f28980c;
        this.f24007y = cr;
        cr.E(12);
        this.f24004v = cr.h() & com.anythink.basead.exoplayer.k.p.f8473b;
        this.f24003u = cr.h();
    }

    public C0(byte[] bArr, int i, int i6) {
        this.f24002n = 3;
        this.f24007y = bArr;
        this.f24004v = i;
        this.f24005w = i;
        this.f24003u = i6;
        this.f24006x = 0;
        p();
    }

    public C0(int i) {
        this.f24002n = 4;
        if (i > 0) {
            this.f24004v = i;
            this.f24007y = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
