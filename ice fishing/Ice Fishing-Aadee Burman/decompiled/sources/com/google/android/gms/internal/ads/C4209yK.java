package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.yK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4209yK implements Closeable, Flushable {

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f35137C = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f35138D = new String[128];

    /* renamed from: A, reason: collision with root package name */
    public int f35139A;

    /* renamed from: B, reason: collision with root package name */
    public String f35140B;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.fragment.app.Y f35141n;

    /* renamed from: u, reason: collision with root package name */
    public int[] f35142u;

    /* renamed from: v, reason: collision with root package name */
    public int f35143v;

    /* renamed from: w, reason: collision with root package name */
    public final C3400jK f35144w;

    /* renamed from: x, reason: collision with root package name */
    public final String f35145x;

    /* renamed from: y, reason: collision with root package name */
    public final String f35146y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f35147z;

    static {
        for (int i = 0; i <= 31; i++) {
            f35138D[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f35138D;
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

    public C4209yK(androidx.fragment.app.Y y7) {
        int[] iArr = new int[32];
        this.f35142u = iArr;
        boolean z3 = false;
        this.f35143v = 0;
        if (iArr.length == 0) {
            this.f35142u = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f35142u;
        int i = this.f35143v;
        this.f35143v = i + 1;
        iArr2[i] = 6;
        this.f35139A = 2;
        this.f35141n = y7;
        C3400jK c3400jK = C3400jK.f31226d;
        Objects.requireNonNull(c3400jK);
        this.f35144w = c3400jK;
        this.f35146y = ",";
        boolean z6 = c3400jK.f31229c;
        String str = c3400jK.f31227a;
        if (z6) {
            this.f35145x = ": ";
            if (str.isEmpty()) {
                this.f35146y = ", ";
            }
        } else {
            this.f35145x = ":";
        }
        if (str.isEmpty() && c3400jK.f31228b.isEmpty()) {
            z3 = true;
        }
        this.f35147z = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(String str) {
        int i;
        String str2;
        androidx.fragment.app.Y y7 = this.f35141n;
        y7.write(34);
        int length = str.length();
        int i6 = 0;
        while (i < length) {
            int i9 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = f35138D[charAt];
                i = str2 == null ? i9 : 0;
                if (i6 < i) {
                    y7.write(str, i6, i - i6);
                }
                y7.write(str2);
                i6 = i9;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i6 < i) {
                }
                y7.write(str2);
                i6 = i9;
            }
        }
        if (i6 < length) {
            y7.write(str, i6, length - i6);
        }
        y7.write(34);
    }

    public final void B() {
        if (this.f35147z) {
            return;
        }
        C3400jK c3400jK = this.f35144w;
        String str = c3400jK.f31227a;
        androidx.fragment.app.Y y7 = this.f35141n;
        y7.write(str);
        int i = this.f35143v;
        for (int i6 = 1; i6 < i; i6++) {
            y7.write(c3400jK.f31228b);
        }
    }

    public final void C() {
        int j6 = j();
        if (j6 == 1) {
            this.f35142u[this.f35143v - 1] = 2;
            B();
            return;
        }
        androidx.fragment.app.Y y7 = this.f35141n;
        if (j6 == 2) {
            y7.append((CharSequence) this.f35146y);
            B();
        } else {
            if (j6 == 4) {
                y7.append((CharSequence) this.f35145x);
                this.f35142u[this.f35143v - 1] = 5;
                return;
            }
            if (j6 != 6) {
                if (j6 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f35139A != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f35142u[this.f35143v - 1] = 7;
        }
    }

    public final void b() {
        if (this.f35140B != null) {
            z();
        }
        C();
        this.f35141n.write("null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35141n.getClass();
        int i = this.f35143v;
        if (i > 1 || (i == 1 && this.f35142u[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f35143v = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f35143v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f35141n.getClass();
    }

    public final void i(int i, int i6, char c9) {
        int j6 = j();
        if (j6 != i6 && j6 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f35140B;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f35143v--;
        if (j6 == i6) {
            B();
        }
        this.f35141n.write(c9);
    }

    public final int j() {
        int i = this.f35143v;
        if (i != 0) {
            return this.f35142u[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void z() {
        if (this.f35140B != null) {
            int j6 = j();
            if (j6 == 5) {
                this.f35141n.write(this.f35146y);
            } else if (j6 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            B();
            this.f35142u[this.f35143v - 1] = 4;
            A(this.f35140B);
            this.f35140B = null;
        }
    }
}
