package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bb1 extends ab1 {
    public final /* synthetic */ int encWxUiV2;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.encWxUiV2) {
            case 0:
                int i = this.AvO7iQsrTN;
                this.AvO7iQsrTN = i + 2;
                Object[] objArr = this.OOA6hdeuvCS;
                return new lc0(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.AvO7iQsrTN;
                this.AvO7iQsrTN = i2 + 2;
                return this.OOA6hdeuvCS[i2];
            default:
                int i3 = this.AvO7iQsrTN;
                this.AvO7iQsrTN = i3 + 2;
                return this.OOA6hdeuvCS[i3 + 1];
        }
    }
}
