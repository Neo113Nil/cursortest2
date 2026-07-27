package com.anythink.core.common.n.b.a.i;

import com.anythink.core.common.n.b.a.g.c;
import com.anythink.core.common.n.c.e;
import com.anythink.core.common.n.c.l;
import com.anythink.core.common.n.c.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15514a = "publicsuffixes.gz";

    /* renamed from: e, reason: collision with root package name */
    private static final byte f15518e = 33;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f15520g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final CountDownLatch f15521h = new CountDownLatch(1);
    private byte[] i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f15522j;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f15515b = {42};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f15516c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f15517d = {"*"};

    /* renamed from: f, reason: collision with root package name */
    private static final a f15519f = new a();

    public static a a() {
        return f15519f;
    }

    private void b() {
        boolean z8 = false;
        while (true) {
            try {
                try {
                    c();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z8 = true;
                } catch (IOException e6) {
                    c.e().a(5, "Failed to read public suffix list", e6);
                    if (!z8) {
                        return;
                    }
                }
            } finally {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private void c() {
        InputStream resourceAsStream = a.class.getResourceAsStream(f15514a);
        if (resourceAsStream == null) {
            return;
        }
        e a9 = n.a(new l(n.a(resourceAsStream)));
        try {
            byte[] bArr = new byte[a9.m()];
            a9.b(bArr);
            byte[] bArr2 = new byte[a9.m()];
            a9.b(bArr2);
            a9.close();
            synchronized (this) {
                this.i = bArr;
                this.f15522j = bArr2;
            }
            this.f15521h.countDown();
        } catch (Throwable th) {
            try {
                a9.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String a(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] a9 = a(split);
        if (split.length == a9.length && a9[0].charAt(0) != '!') {
            return null;
        }
        if (a9[0].charAt(0) == '!') {
            length = split.length;
            length2 = a9.length;
        } else {
            length = split.length;
            length2 = a9.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i = length - length2; i < split2.length; i++) {
            sb.append(split2[i]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String[] a(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (this.f15520g.get() || !this.f15520g.compareAndSet(false, true)) {
            try {
                this.f15521h.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z8 = false;
            while (true) {
                try {
                    try {
                        try {
                            c();
                            break;
                        } finally {
                            if (z8) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } catch (IOException e6) {
                        c.e().a(5, "Failed to read public suffix list", e6);
                        if (z8) {
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z8 = true;
                }
            }
        }
        synchronized (this) {
            if (this.i == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            bArr[i4] = strArr[i4].getBytes(StandardCharsets.UTF_8);
        }
        int i9 = 0;
        while (true) {
            str = null;
            if (i9 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.i, bArr, i9);
            if (str2 != null) {
                break;
            }
            i9++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i10 = 0; i10 < bArr2.length - 1; i10++) {
                bArr2[i10] = f15515b;
                str3 = a(this.i, bArr2, i10);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String a9 = a(this.f15522j, bArr, i);
                if (a9 != null) {
                    str = a9;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return f15517d;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = f15516c;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = f15516c;
        }
        return strArr2.length > strArr3.length ? strArr2 : strArr3;
    }

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i4;
        boolean z8;
        int i9;
        int i10;
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = (i11 + length) / 2;
            while (i12 >= 0 && bArr[i12] != 10) {
                i12--;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i4 = i13 + i14;
                if (bArr[i4] == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i4 - i13;
            int i16 = i;
            boolean z9 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z9) {
                    i9 = 46;
                    z8 = false;
                } else {
                    z8 = z9;
                    i9 = bArr2[i16][i17] & 255;
                }
                i10 = i9 - (bArr[i13 + i18] & 255);
                if (i10 != 0) {
                    break;
                }
                i18++;
                i17++;
                if (i18 == i15) {
                    break;
                }
                if (bArr2[i16].length != i17) {
                    z9 = z8;
                } else {
                    if (i16 == bArr2.length - 1) {
                        break;
                    }
                    i16++;
                    i17 = -1;
                    z9 = true;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i19 = i15 - i18;
                    int length2 = bArr2[i16].length - i17;
                    while (true) {
                        i16++;
                        if (i16 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i19) {
                        if (length2 <= i19) {
                            return new String(bArr, i13, i15, StandardCharsets.UTF_8);
                        }
                    }
                }
                i11 = i4 + 1;
            }
            length = i12;
        }
        return null;
    }

    private void a(byte[] bArr, byte[] bArr2) {
        this.i = bArr;
        this.f15522j = bArr2;
        this.f15520g.set(true);
        this.f15521h.countDown();
    }
}
