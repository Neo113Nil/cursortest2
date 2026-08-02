package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class rr11 extends b2f0 {
    public short[] a;
    public int b;

    public rr11(short[] sArr) {
        this.a = sArr;
        this.b = sArr.length;
        b(10);
    }

    @Override // defpackage.b2f0
    public final Object a() {
        return new qr11(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.b2f0
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.b2f0
    public final int d() {
        return this.b;
    }

    public final void e(short s) {
        b(d() + 1);
        short[] sArr = this.a;
        int i = this.b;
        this.b = i + 1;
        sArr[i] = s;
    }
}
