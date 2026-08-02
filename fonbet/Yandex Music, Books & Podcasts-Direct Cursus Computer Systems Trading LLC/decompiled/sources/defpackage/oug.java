package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class oug extends zrm {
    public long[] a;
    public int b;

    @Override // defpackage.zrm
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.zrm
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.zrm
    public final int d() {
        return this.b;
    }
}
