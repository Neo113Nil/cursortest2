package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ygLcUYwZ extends lDXGDhIF implements RandomAccess {
    public final int MdtA4re8;
    public final lDXGDhIF NCTxEWno;
    public final int wxUZMvaN;

    public ygLcUYwZ(lDXGDhIF ldxgdhif, int i, int i2) {
        this.NCTxEWno = ldxgdhif;
        this.MdtA4re8 = i;
        ej0.VgvYg0wo(i, i2, ldxgdhif.qoPGr6Ce());
        this.wxUZMvaN = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.wxUZMvaN;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return this.NCTxEWno.get(this.MdtA4re8 + i);
    }

    @Override // defpackage.Qr9iLBAD
    public final int qoPGr6Ce() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.lDXGDhIF, java.util.List
    public final List subList(int i, int i2) {
        ej0.VgvYg0wo(i, i2, this.wxUZMvaN);
        int i3 = this.MdtA4re8;
        return new ygLcUYwZ(this.NCTxEWno, i + i3, i3 + i2);
    }
}
