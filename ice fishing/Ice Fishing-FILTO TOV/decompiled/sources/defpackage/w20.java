package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w20 extends q20 {
    public boolean AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final int OOA6hdeuvCS;
    public int encWxUiV2;

    public w20(int i, int i2, int i3) {
        this.OOA6hdeuvCS = i3;
        this.EljAMC1QTz = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.AvO7iQsrTN = z;
        this.encWxUiV2 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.q20
    public final int nextInt() {
        int i = this.encWxUiV2;
        if (i != this.EljAMC1QTz) {
            this.encWxUiV2 = this.OOA6hdeuvCS + i;
            return i;
        }
        if (this.AvO7iQsrTN) {
            this.AvO7iQsrTN = false;
            return i;
        }
        o4.E7jCp8Ls();
        return 0;
    }
}
