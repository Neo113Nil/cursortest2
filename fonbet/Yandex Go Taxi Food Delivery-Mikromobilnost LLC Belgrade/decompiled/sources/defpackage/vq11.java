package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class vq11 extends b2f0 {
    public int[] a;
    public int b;

    public vq11(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
        b(10);
    }

    @Override // defpackage.b2f0
    public final Object a() {
        return new uq11(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.b2f0
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.b2f0
    public final int d() {
        return this.b;
    }

    public final void e(int i) {
        b(d() + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }
}
