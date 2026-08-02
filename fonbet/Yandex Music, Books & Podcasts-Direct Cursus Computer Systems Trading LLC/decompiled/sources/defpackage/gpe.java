package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class gpe extends zrm {
    public int[] a;
    public int b;

    @Override // defpackage.zrm
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.zrm
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

    @Override // defpackage.zrm
    public final int d() {
        return this.b;
    }
}
