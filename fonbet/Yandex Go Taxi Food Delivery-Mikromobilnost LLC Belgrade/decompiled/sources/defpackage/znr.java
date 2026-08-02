package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class znr extends b2f0 {
    public float[] a;
    public int b;

    public znr(float[] fArr) {
        this.a = fArr;
        this.b = fArr.length;
        b(10);
    }

    @Override // defpackage.b2f0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.b2f0
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.b2f0
    public final int d() {
        return this.b;
    }

    public final void e(float f) {
        b(d() + 1);
        float[] fArr = this.a;
        int i = this.b;
        this.b = i + 1;
        fArr[i] = f;
    }
}
