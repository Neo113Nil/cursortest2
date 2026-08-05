package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tf0 {
    public int MdtA4re8;
    public int NCTxEWno;
    public int VgvYg0wo;
    public int qoPGr6Ce;
    public int wxUZMvaN;

    public final boolean qoPGr6Ce() {
        int i = this.qoPGr6Ce;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.wxUZMvaN;
            int i4 = this.NCTxEWno;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.wxUZMvaN;
            int i6 = this.MdtA4re8;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.VgvYg0wo;
            int i8 = this.NCTxEWno;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.VgvYg0wo;
            int i10 = this.MdtA4re8;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if (((i2 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }
}
