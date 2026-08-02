package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class C0 implements H2 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24765n;

    /* renamed from: u, reason: collision with root package name */
    public int f24766u;

    /* renamed from: v, reason: collision with root package name */
    public int f24767v;

    /* renamed from: w, reason: collision with root package name */
    public int f24768w;

    /* renamed from: x, reason: collision with root package name */
    public int f24769x;

    /* renamed from: y, reason: collision with root package name */
    public Object f24770y;

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
        int i4;
        int h3;
        try {
            C4256yr c4256yr = new C4256yr(bArr, bArr.length);
            c4256yr.e();
            int h9 = c4256yr.h(7);
            if (h9 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(h9).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(h9);
                AbstractC2991bG.y("Av1Config", sb.toString());
                return null;
            }
            int h10 = c4256yr.h(3);
            int h11 = c4256yr.h(5);
            boolean g9 = c4256yr.g();
            int i6 = c4256yr.g() ? true != c4256yr.g() ? 10 : 12 : 8;
            c4256yr.f(13);
            Object[] objArr = {Integer.valueOf(h11)};
            String str = AbstractC3182eu.f30782a;
            Locale locale = Locale.US;
            String format = String.format(locale, "%02d", objArr);
            String str2 = true != g9 ? "M" : "H";
            String format2 = String.format(locale, "%02d", Integer.valueOf(i6));
            StringBuilder sb2 = new StringBuilder(String.valueOf(h10).length() + 6 + format.length() + 2 + format2.length());
            sb2.append("av01.");
            sb2.append(h10);
            sb2.append(com.anythink.core.common.d.j.f13164z);
            sb2.append(format);
            sb2.append(str2);
            sb2.append(com.anythink.core.common.d.j.f13164z);
            sb2.append(format2);
            String sb3 = sb2.toString();
            if (c4256yr.b() <= 0) {
                return new C0(sb3, i6, -1, -1, -1);
            }
            c4256yr.e();
            int h12 = c4256yr.h(4);
            if (h12 != 1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(h12).length() + 22);
                sb4.append("Unsupported obu_type: ");
                sb4.append(h12);
                AbstractC2991bG.t("Av1Config", sb4.toString());
                return new C0(sb3, i6, -1, -1, -1);
            }
            if (c4256yr.g()) {
                AbstractC2991bG.t("Av1Config", "Unsupported obu_extension_flag");
                return new C0(sb3, i6, -1, -1, -1);
            }
            boolean g10 = c4256yr.g();
            c4256yr.e();
            if (g10 && c4256yr.h(8) > 127) {
                AbstractC2991bG.t("Av1Config", "Excessive obu_size");
                return new C0(sb3, i6, -1, -1, -1);
            }
            int h13 = c4256yr.h(3);
            c4256yr.e();
            if (c4256yr.g()) {
                AbstractC2991bG.t("Av1Config", "Unsupported reduced_still_picture_header");
                return new C0(sb3, i6, -1, -1, -1);
            }
            if (c4256yr.g()) {
                AbstractC2991bG.t("Av1Config", "Unsupported timing_info_present_flag");
                return new C0(sb3, i6, -1, -1, -1);
            }
            if (c4256yr.g()) {
                AbstractC2991bG.t("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new C0(sb3, i6, -1, -1, -1);
            }
            int h14 = c4256yr.h(5);
            boolean z6 = false;
            for (int i9 = 0; i9 <= h14; i9++) {
                c4256yr.f(12);
                if (c4256yr.h(5) > 7) {
                    c4256yr.e();
                }
            }
            int h15 = c4256yr.h(4);
            int h16 = c4256yr.h(4);
            c4256yr.f(h15 + 1);
            c4256yr.f(h16 + 1);
            if (c4256yr.g()) {
                i = 7;
                c4256yr.f(7);
            } else {
                i = 7;
            }
            c4256yr.f(i);
            boolean g11 = c4256yr.g();
            if (g11) {
                c4256yr.f(2);
            }
            if (!c4256yr.g()) {
            }
            if (!c4256yr.g()) {
                c4256yr.f(1);
            }
            if (g11) {
                c4256yr.f(3);
            }
            c4256yr.f(3);
            boolean g12 = c4256yr.g();
            if (h13 == 2) {
                if (g12) {
                    c4256yr.e();
                }
            } else if (h13 == 1) {
                if (c4256yr.g()) {
                    return new C0(sb3, i6, -1, -1, -1);
                }
                int h17 = c4256yr.h(8);
                int h18 = c4256yr.h(8);
                int h19 = c4256yr.h(8);
                if (!z6 && h17 == 1) {
                    if (h18 == 13) {
                        if (h19 == 0) {
                            h17 = 1;
                            h3 = 1;
                            i4 = 13;
                            return new C0(sb3, i6, KJ.b(h17), h3 == 1 ? 1 : 2, KJ.c(i4));
                        }
                        h17 = 1;
                        i4 = 13;
                        h3 = c4256yr.h(1);
                        return new C0(sb3, i6, KJ.b(h17), h3 == 1 ? 1 : 2, KJ.c(i4));
                    }
                    h17 = 1;
                }
                i4 = h18;
                h3 = c4256yr.h(1);
                return new C0(sb3, i6, KJ.b(h17), h3 == 1 ? 1 : 2, KJ.c(i4));
            }
            if (c4256yr.g()) {
                z6 = true;
            }
            if (c4256yr.g()) {
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
                Object obj2 = ((LinkedHashMap) this.f24770y).get(obj);
                if (obj2 != null) {
                    this.f24768w++;
                    return obj2;
                }
                this.f24769x++;
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
                this.f24766u++;
                put = ((LinkedHashMap) this.f24770y).put(obj, obj2);
                if (put != null) {
                    this.f24766u--;
                }
            } finally {
            }
        }
        int i = this.f24767v;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f24766u < 0 || (((LinkedHashMap) this.f24770y).isEmpty() && this.f24766u != 0)) {
                        break;
                    }
                    if (this.f24766u <= i || ((LinkedHashMap) this.f24770y).isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) ((LinkedHashMap) this.f24770y).entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    ((LinkedHashMap) this.f24770y).remove(key);
                    this.f24766u--;
                } finally {
                }
            }
        }
        return put;
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int c() {
        return this.f24766u;
    }

    public void e() {
        int i = this.f24769x + 1;
        this.f24769x = i;
        if (i == 8) {
            this.f24769x = 0;
            int i4 = this.f24768w;
            this.f24768w = i4 + (true == o(i4 + 1) ? 2 : 1);
        }
        p();
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int f() {
        return -1;
    }

    public long g() {
        int i = this.f24768w;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f24770y;
        int i4 = this.f24766u;
        long j6 = jArr[i4];
        this.f24766u = this.f24769x & (i4 + 1);
        this.f24768w = i - 1;
        return j6;
    }

    public void h(int i) {
        int i4 = this.f24768w;
        int i6 = i / 8;
        int i9 = i4 + i6;
        this.f24768w = i9;
        int i10 = (i - (i6 * 8)) + this.f24769x;
        this.f24769x = i10;
        if (i10 > 7) {
            this.f24768w = i9 + 1;
            this.f24769x = i10 - 8;
        }
        while (true) {
            i4++;
            if (i4 > this.f24768w) {
                p();
                return;
            } else if (o(i4)) {
                this.f24768w++;
                i4 += 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.H2
    public int i() {
        Cr cr = (Cr) this.f24770y;
        int i = this.f24767v;
        if (i == 8) {
            return cr.K();
        }
        if (i == 16) {
            return cr.L();
        }
        int i4 = this.f24768w;
        this.f24768w = i4 + 1;
        if (i4 % 2 != 0) {
            return this.f24769x & 15;
        }
        int K7 = cr.K();
        this.f24769x = K7;
        return (K7 & 240) >> 4;
    }

    public boolean j(int i) {
        int i4;
        int i6 = this.f24768w;
        int i9 = i / 8;
        int i10 = i6 + i9;
        int i11 = (this.f24769x + i) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i6++;
            i4 = this.f24766u;
            if (i6 > i10 || i10 > i4) {
                break;
            }
            if (o(i6)) {
                i10++;
                i6 += 2;
            }
        }
        if (i10 >= i4) {
            return i10 == i4 && i11 == 0;
        }
        return true;
    }

    public boolean k() {
        int i = ((byte[]) this.f24770y)[this.f24768w] & (128 >> this.f24769x);
        e();
        return i != 0;
    }

    public int l(int i) {
        int i4;
        byte[] bArr;
        this.f24769x += i;
        int i6 = 0;
        while (true) {
            i4 = this.f24769x;
            bArr = (byte[]) this.f24770y;
            if (i4 <= 8) {
                break;
            }
            int i9 = i4 - 8;
            this.f24769x = i9;
            int i10 = this.f24768w;
            i6 |= (bArr[i10] & 255) << i9;
            if (true != o(i10 + 1)) {
                r3 = 1;
            }
            this.f24768w = i10 + r3;
        }
        int i11 = this.f24768w;
        int i12 = i6 | ((bArr[i11] & 255) >> (8 - i4));
        int i13 = 32 - i;
        if (i4 == 8) {
            this.f24769x = 0;
            this.f24768w = i11 + (true != o(i11 + 1) ? 1 : 2);
        }
        int i14 = ((-1) >>> i13) & i12;
        p();
        return i14;
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
        int i4 = i - 2;
        if (this.f24767v > i4 || i >= this.f24766u) {
            return false;
        }
        byte[] bArr = (byte[]) this.f24770y;
        return bArr[i] == 3 && bArr[i4] == 0 && bArr[i + (-1)] == 0;
    }

    public void p() {
        int i;
        int i4 = this.f24768w;
        boolean z6 = false;
        if (i4 >= 0 && (i4 < (i = this.f24766u) || (i4 == i && this.f24769x == 0))) {
            z6 = true;
        }
        AbstractC2792Sd.H(z6);
    }

    public synchronized String toString() {
        String str;
        switch (this.f24765n) {
            case 4:
                synchronized (this) {
                    try {
                        int i = this.f24768w;
                        int i4 = this.f24769x;
                        int i6 = i + i4;
                        int i9 = i6 != 0 ? (i * 100) / i6 : 0;
                        Locale locale = Locale.US;
                        str = "LruCache[maxSize=" + this.f24767v + ",hits=" + i + ",misses=" + i4 + ",hitRate=" + i9 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C0(String str, int i, int i4, int i6, int i9) {
        this.f24765n = 0;
        this.f24766u = i;
        this.f24770y = str;
        this.f24767v = i4;
        this.f24768w = i6;
        this.f24769x = i9;
    }

    public C0(Zw zw) {
        this.f24765n = 1;
        Cr cr = zw.f29750c;
        this.f24770y = cr;
        cr.E(12);
        this.f24767v = cr.h() & com.anythink.basead.exoplayer.k.p.f9259b;
        this.f24766u = cr.h();
    }

    public C0(byte[] bArr, int i, int i4) {
        this.f24765n = 3;
        this.f24770y = bArr;
        this.f24767v = i;
        this.f24768w = i;
        this.f24766u = i4;
        this.f24769x = 0;
        p();
    }

    public C0(int i) {
        this.f24765n = 4;
        if (i > 0) {
            this.f24767v = i;
            this.f24770y = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
