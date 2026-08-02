package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class v781 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public v781(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v781.class != obj.getClass()) {
            return false;
        }
        v781 v781Var = (v781) obj;
        return this.a == v781Var.a && this.c == v781Var.c && this.d == v781Var.d && Arrays.equals(this.b, v781Var.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
