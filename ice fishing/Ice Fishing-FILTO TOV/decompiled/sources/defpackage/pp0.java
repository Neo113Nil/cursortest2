package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pp0 extends WdrkLMV3xh {
    public final Object[] AvO7iQsrTN;
    public final ya1 encWxUiV2;

    public pp0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.AvO7iQsrTN = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.encWxUiV2 = new ya1(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        ya1 ya1Var = this.encWxUiV2;
        if (ya1Var.hasNext()) {
            this.OOA6hdeuvCS++;
            return ya1Var.next();
        }
        int i = this.OOA6hdeuvCS;
        this.OOA6hdeuvCS = i + 1;
        return this.AvO7iQsrTN[i - ya1Var.EljAMC1QTz];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            o4.E7jCp8Ls();
            return null;
        }
        int i = this.OOA6hdeuvCS;
        ya1 ya1Var = this.encWxUiV2;
        int i2 = ya1Var.EljAMC1QTz;
        if (i <= i2) {
            this.OOA6hdeuvCS = i - 1;
            return ya1Var.previous();
        }
        int i3 = i - 1;
        this.OOA6hdeuvCS = i3;
        return this.AvO7iQsrTN[i3 - i2];
    }
}
