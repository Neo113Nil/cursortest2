package defpackage;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class yi9 {
    public char[] a;
    public int b;
    public int c;
    public int d;

    public yi9(int i) {
        this.a = new char[32];
        this.b = 32;
    }

    public final char a(int i) {
        if (i < this.d) {
            return this.a[i];
        }
        return (char) 0;
    }

    public final void b(char c) {
        int i = this.d;
        int i2 = this.b;
        if (i == i2) {
            int i3 = i2 * 2;
            this.b = i3;
            this.a = Arrays.copyOf(this.a, i3);
        }
        char[] cArr = this.a;
        int i4 = this.d;
        this.d = i4 + 1;
        cArr[i4] = c;
        this.c = (this.c * 31) + c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yi9)) {
            return false;
        }
        int i = this.d;
        yi9 yi9Var = (yi9) obj;
        if (i != yi9Var.d || this.c != yi9Var.c) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] != yi9Var.a[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(this.a[i2]);
        }
        return sb.toString();
    }

    public yi9() {
        this(0);
    }
}
