package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dn extends cn {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public int VgvYg0wo;
    public boolean wxUZMvaN;

    public dn(int i, int i2, int i3) {
        this.NCTxEWno = i3;
        this.MdtA4re8 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.wxUZMvaN = z;
        this.VgvYg0wo = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.cn
    public final int nextInt() {
        int i = this.VgvYg0wo;
        if (i != this.MdtA4re8) {
            this.VgvYg0wo = this.NCTxEWno + i;
            return i;
        }
        if (!this.wxUZMvaN) {
            throw new NoSuchElementException();
        }
        this.wxUZMvaN = false;
        return i;
    }
}
