package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class qd4 extends zrm {
    public char[] a;
    public int b;

    @Override // defpackage.zrm
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.zrm
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.zrm
    public final int d() {
        return this.b;
    }
}
