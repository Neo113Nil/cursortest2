package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vx40 extends u5w {
    public vx40(int i) {
        this.a = i == 0 ? i6w.a : new int[i];
    }

    public final void c(int i) {
        d(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            xva1.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            f73.d(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            xva1.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public vx40() {
        this((Object) null);
    }

    public /* synthetic */ vx40(Object obj) {
        this(16);
    }
}
