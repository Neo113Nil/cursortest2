package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class cet extends zrm {
    public byte[] a;
    public int b;

    @Override // defpackage.zrm
    public final Object a() {
        return new bet(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.zrm
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.zrm
    public final int d() {
        return this.b;
    }
}
