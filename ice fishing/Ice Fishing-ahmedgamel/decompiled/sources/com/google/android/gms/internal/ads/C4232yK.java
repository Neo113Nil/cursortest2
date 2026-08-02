package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.yK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4232yK implements Closeable, Flushable {

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f35923C = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f35924D = new String[128];

    /* renamed from: A, reason: collision with root package name */
    public int f35925A;

    /* renamed from: B, reason: collision with root package name */
    public String f35926B;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.fragment.app.Y f35927n;

    /* renamed from: u, reason: collision with root package name */
    public int[] f35928u;

    /* renamed from: v, reason: collision with root package name */
    public int f35929v;

    /* renamed from: w, reason: collision with root package name */
    public final C3423jK f35930w;

    /* renamed from: x, reason: collision with root package name */
    public final String f35931x;

    /* renamed from: y, reason: collision with root package name */
    public final String f35932y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f35933z;

    static {
        for (int i = 0; i <= 31; i++) {
            f35924D[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f35924D;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C4232yK(androidx.fragment.app.Y y7) {
        int[] iArr = new int[32];
        this.f35928u = iArr;
        boolean z6 = false;
        this.f35929v = 0;
        if (iArr.length == 0) {
            this.f35928u = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f35928u;
        int i = this.f35929v;
        this.f35929v = i + 1;
        iArr2[i] = 6;
        this.f35925A = 2;
        this.f35927n = y7;
        C3423jK c3423jK = C3423jK.f32013d;
        Objects.requireNonNull(c3423jK);
        this.f35930w = c3423jK;
        this.f35932y = ",";
        boolean z9 = c3423jK.f32016c;
        String str = c3423jK.f32014a;
        if (z9) {
            this.f35931x = ": ";
            if (str.isEmpty()) {
                this.f35932y = ", ";
            }
        } else {
            this.f35931x = ":";
        }
        if (str.isEmpty() && c3423jK.f32015b.isEmpty()) {
            z6 = true;
        }
        this.f35933z = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(String str) {
        int i;
        String str2;
        androidx.fragment.app.Y y7 = this.f35927n;
        y7.write(34);
        int length = str.length();
        int i4 = 0;
        while (i < length) {
            int i6 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = f35924D[charAt];
                i = str2 == null ? i6 : 0;
                if (i4 < i) {
                    y7.write(str, i4, i - i4);
                }
                y7.write(str2);
                i4 = i6;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i4 < i) {
                }
                y7.write(str2);
                i4 = i6;
            }
        }
        if (i4 < length) {
            y7.write(str, i4, length - i4);
        }
        y7.write(34);
    }

    public final void B() {
        if (this.f35933z) {
            return;
        }
        C3423jK c3423jK = this.f35930w;
        String str = c3423jK.f32014a;
        androidx.fragment.app.Y y7 = this.f35927n;
        y7.write(str);
        int i = this.f35929v;
        for (int i4 = 1; i4 < i; i4++) {
            y7.write(c3423jK.f32015b);
        }
    }

    public final void C() {
        int j6 = j();
        if (j6 == 1) {
            this.f35928u[this.f35929v - 1] = 2;
            B();
            return;
        }
        androidx.fragment.app.Y y7 = this.f35927n;
        if (j6 == 2) {
            y7.append((CharSequence) this.f35932y);
            B();
        } else {
            if (j6 == 4) {
                y7.append((CharSequence) this.f35931x);
                this.f35928u[this.f35929v - 1] = 5;
                return;
            }
            if (j6 != 6) {
                if (j6 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f35925A != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f35928u[this.f35929v - 1] = 7;
        }
    }

    public final void b() {
        if (this.f35926B != null) {
            z();
        }
        C();
        this.f35927n.write("null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35927n.getClass();
        int i = this.f35929v;
        if (i > 1 || (i == 1 && this.f35928u[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f35929v = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f35929v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f35927n.getClass();
    }

    public final void i(int i, int i4, char c9) {
        int j6 = j();
        if (j6 != i4 && j6 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f35926B;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f35929v--;
        if (j6 == i4) {
            B();
        }
        this.f35927n.write(c9);
    }

    public final int j() {
        int i = this.f35929v;
        if (i != 0) {
            return this.f35928u[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void z() {
        if (this.f35926B != null) {
            int j6 = j();
            if (j6 == 5) {
                this.f35927n.write(this.f35932y);
            } else if (j6 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            B();
            this.f35928u[this.f35929v - 1] = 4;
            A(this.f35926B);
            this.f35926B = null;
        }
    }
}
