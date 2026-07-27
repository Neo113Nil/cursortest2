package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class HK implements Closeable, Flushable {

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f25350C = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f25351D = new String[128];

    /* renamed from: A, reason: collision with root package name */
    public int f25352A;

    /* renamed from: B, reason: collision with root package name */
    public String f25353B;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.fragment.app.Y f25354n;

    /* renamed from: u, reason: collision with root package name */
    public int[] f25355u;

    /* renamed from: v, reason: collision with root package name */
    public int f25356v;

    /* renamed from: w, reason: collision with root package name */
    public final C3898sK f25357w;

    /* renamed from: x, reason: collision with root package name */
    public final String f25358x;

    /* renamed from: y, reason: collision with root package name */
    public final String f25359y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f25360z;

    static {
        for (int i = 0; i <= 31; i++) {
            f25351D[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f25351D;
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

    public HK(androidx.fragment.app.Y y6) {
        int[] iArr = new int[32];
        this.f25355u = iArr;
        boolean z8 = false;
        this.f25356v = 0;
        if (iArr.length == 0) {
            this.f25355u = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f25355u;
        int i = this.f25356v;
        this.f25356v = i + 1;
        iArr2[i] = 6;
        this.f25352A = 2;
        this.f25354n = y6;
        C3898sK c3898sK = C3898sK.f34228d;
        Objects.requireNonNull(c3898sK);
        this.f25357w = c3898sK;
        this.f25359y = ",";
        boolean z9 = c3898sK.f34231c;
        String str = c3898sK.f34229a;
        if (z9) {
            this.f25358x = ": ";
            if (str.isEmpty()) {
                this.f25359y = ", ";
            }
        } else {
            this.f25358x = ":";
        }
        if (str.isEmpty() && c3898sK.f34230b.isEmpty()) {
            z8 = true;
        }
        this.f25360z = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(String str) {
        int i;
        String str2;
        androidx.fragment.app.Y y6 = this.f25354n;
        y6.write(34);
        int length = str.length();
        int i4 = 0;
        while (i < length) {
            int i9 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = f25351D[charAt];
                i = str2 == null ? i9 : 0;
                if (i4 < i) {
                    y6.write(str, i4, i - i4);
                }
                y6.write(str2);
                i4 = i9;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i4 < i) {
                }
                y6.write(str2);
                i4 = i9;
            }
        }
        if (i4 < length) {
            y6.write(str, i4, length - i4);
        }
        y6.write(34);
    }

    public final void B() {
        if (this.f25360z) {
            return;
        }
        C3898sK c3898sK = this.f25357w;
        String str = c3898sK.f34229a;
        androidx.fragment.app.Y y6 = this.f25354n;
        y6.write(str);
        int i = this.f25356v;
        for (int i4 = 1; i4 < i; i4++) {
            y6.write(c3898sK.f34230b);
        }
    }

    public final void C() {
        int j9 = j();
        if (j9 == 1) {
            this.f25355u[this.f25356v - 1] = 2;
            B();
            return;
        }
        androidx.fragment.app.Y y6 = this.f25354n;
        if (j9 == 2) {
            y6.append((CharSequence) this.f25359y);
            B();
        } else {
            if (j9 == 4) {
                y6.append((CharSequence) this.f25358x);
                this.f25355u[this.f25356v - 1] = 5;
                return;
            }
            if (j9 != 6) {
                if (j9 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f25352A != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f25355u[this.f25356v - 1] = 7;
        }
    }

    public final void b() {
        if (this.f25353B != null) {
            z();
        }
        C();
        this.f25354n.write("null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25354n.getClass();
        int i = this.f25356v;
        if (i > 1 || (i == 1 && this.f25355u[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f25356v = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f25356v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f25354n.getClass();
    }

    public final void g(int i, int i4, char c4) {
        int j9 = j();
        if (j9 != i4 && j9 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f25353B;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f25356v--;
        if (j9 == i4) {
            B();
        }
        this.f25354n.write(c4);
    }

    public final int j() {
        int i = this.f25356v;
        if (i != 0) {
            return this.f25355u[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void z() {
        if (this.f25353B != null) {
            int j9 = j();
            if (j9 == 5) {
                this.f25354n.write(this.f25359y);
            } else if (j9 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            B();
            this.f25355u[this.f25356v - 1] = 4;
            A(this.f25353B);
            this.f25353B = null;
        }
    }
}
