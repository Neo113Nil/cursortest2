package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class wet extends zrm {
    public short[] a;
    public int b;

    @Override // defpackage.zrm
    public final Object a() {
        return new vet(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.zrm
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

    @Override // defpackage.zrm
    public final int d() {
        return this.b;
    }
}
