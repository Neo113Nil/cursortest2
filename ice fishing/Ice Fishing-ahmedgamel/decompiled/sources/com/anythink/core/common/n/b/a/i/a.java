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
    public static final String f16143a = "publicsuffixes.gz";

    /* renamed from: e, reason: collision with root package name */
    private static final byte f16147e = 33;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f16149g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final CountDownLatch f16150h = new CountDownLatch(1);
    private byte[] i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f16151j;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f16144b = {42};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f16145c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f16146d = {"*"};

    /* renamed from: f, reason: collision with root package name */
    private static final a f16148f = new a();

    public static a a() {
        return f16148f;
    }

    private void b() {
        boolean z6 = false;
        while (true) {
            try {
                try {
                    c();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z6 = true;
                } catch (IOException e9) {
                    c.e().a(5, "Failed to read public suffix list", e9);
                    if (!z6) {
                        return;
                    }
                }
            } finally {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private void c() {
        InputStream resourceAsStream = a.class.getResourceAsStream(f16143a);
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
                this.f16151j = bArr2;
            }
            this.f16150h.countDown();
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
        if (this.f16149g.get() || !this.f16149g.compareAndSet(false, true)) {
            try {
                this.f16150h.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z6 = false;
            while (true) {
                try {
                    try {
                        try {
                            c();
                            break;
                        } finally {
                            if (z6) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } catch (IOException e9) {
                        c.e().a(5, "Failed to read public suffix list", e9);
                        if (z6) {
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z6 = true;
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
        int i6 = 0;
        while (true) {
            str = null;
            if (i6 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.i, bArr, i6);
            if (str2 != null) {
                break;
            }
            i6++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i9 = 0; i9 < bArr2.length - 1; i9++) {
                bArr2[i9] = f16144b;
                str3 = a(this.i, bArr2, i9);
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
                String a9 = a(this.f16151j, bArr, i);
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
            return f16146d;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = f16145c;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = f16145c;
        }
        return strArr2.length > strArr3.length ? strArr2 : strArr3;
    }

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i4;
        boolean z6;
        int i6;
        int i9;
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = (i10 + length) / 2;
            while (i11 >= 0 && bArr[i11] != 10) {
                i11--;
            }
            int i12 = i11 + 1;
            int i13 = 1;
            while (true) {
                i4 = i12 + i13;
                if (bArr[i4] == 10) {
                    break;
                }
                i13++;
            }
            int i14 = i4 - i12;
            int i15 = i;
            boolean z9 = false;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (z9) {
                    i6 = 46;
                    z6 = false;
                } else {
                    z6 = z9;
                    i6 = bArr2[i15][i16] & 255;
                }
                i9 = i6 - (bArr[i12 + i17] & 255);
                if (i9 != 0) {
                    break;
                }
                i17++;
                i16++;
                if (i17 == i14) {
                    break;
                }
                if (bArr2[i15].length != i16) {
                    z9 = z6;
                } else {
                    if (i15 == bArr2.length - 1) {
                        break;
                    }
                    i15++;
                    i16 = -1;
                    z9 = true;
                }
            }
            if (i9 >= 0) {
                if (i9 <= 0) {
                    int i18 = i14 - i17;
                    int length2 = bArr2[i15].length - i16;
                    while (true) {
                        i15++;
                        if (i15 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i18) {
                        if (length2 <= i18) {
                            return new String(bArr, i12, i14, StandardCharsets.UTF_8);
                        }
                    }
                }
                i10 = i4 + 1;
            }
            length = i11;
        }
        return null;
    }

    private void a(byte[] bArr, byte[] bArr2) {
        this.i = bArr;
        this.f16151j = bArr2;
        this.f16149g.set(true);
        this.f16150h.countDown();
    }
}
