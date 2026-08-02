package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class m8a extends zrm {
    public double[] a;
    public int b;

    @Override // defpackage.zrm
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.zrm
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.zrm
    public final int d() {
        return this.b;
    }
}
