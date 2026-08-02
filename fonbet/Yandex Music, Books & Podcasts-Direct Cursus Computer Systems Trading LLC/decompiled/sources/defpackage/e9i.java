package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e9i extends qae {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public e9i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e9i.class != obj.getClass()) {
            return false;
        }
        e9i e9iVar = (e9i) obj;
        return this.b == e9iVar.b && this.c == e9iVar.c && this.d == e9iVar.d && Arrays.equals(this.e, e9iVar.e) && Arrays.equals(this.f, e9iVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
