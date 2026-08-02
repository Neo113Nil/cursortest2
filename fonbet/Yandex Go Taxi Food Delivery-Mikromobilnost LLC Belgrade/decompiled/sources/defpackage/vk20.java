package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class vk20 extends x5v {
    public final int b;
    public final int c;
    public final int w;
    public final int[] x;
    public final int[] y;

    public vk20(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.w = i3;
        this.x = iArr;
        this.y = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vk20.class != obj.getClass()) {
            return false;
        }
        vk20 vk20Var = (vk20) obj;
        return this.b == vk20Var.b && this.c == vk20Var.c && this.w == vk20Var.w && Arrays.equals(this.x, vk20Var.x) && Arrays.equals(this.y, vk20Var.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) + ((Arrays.hashCode(this.x) + ((((((527 + this.b) * 31) + this.c) * 31) + this.w) * 31)) * 31);
    }
}
