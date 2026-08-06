package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qp0 extends WdrkLMV3xh {
    public final op0 AvO7iQsrTN;
    public int JFJ3QoxA;
    public int encWxUiV2;
    public ya1 mOu10nynGul;

    public qp0(op0 op0Var, int i) {
        super(i, op0Var.E7jCp8Ls);
        this.AvO7iQsrTN = op0Var;
        this.encWxUiV2 = op0Var.EljAMC1QTz();
        this.JFJ3QoxA = -1;
        Yi7zF1RB1();
    }

    public final void GWasM1elztuh() {
        if (this.encWxUiV2 != this.AvO7iQsrTN.EljAMC1QTz()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void Yi7zF1RB1() {
        op0 op0Var = this.AvO7iQsrTN;
        Object[] objArr = op0Var.JFJ3QoxA;
        if (objArr == null) {
            this.mOu10nynGul = null;
            return;
        }
        int i = (op0Var.E7jCp8Ls - 1) & (-32);
        int i2 = this.OOA6hdeuvCS;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (op0Var.encWxUiV2 / 5) + 1;
        ya1 ya1Var = this.mOu10nynGul;
        if (ya1Var == null) {
            this.mOu10nynGul = new ya1(objArr, i2, i, i3);
            return;
        }
        ya1Var.OOA6hdeuvCS = i2;
        ya1Var.EljAMC1QTz = i;
        ya1Var.AvO7iQsrTN = i3;
        if (ya1Var.encWxUiV2.length < i3) {
            ya1Var.encWxUiV2 = new Object[i3];
        }
        ya1Var.encWxUiV2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        ya1Var.mOu10nynGul = r0;
        ya1Var.Yi7zF1RB1(i2 - r0, 1);
    }

    @Override // defpackage.WdrkLMV3xh, java.util.ListIterator
    public final void add(Object obj) {
        GWasM1elztuh();
        int i = this.OOA6hdeuvCS;
        op0 op0Var = this.AvO7iQsrTN;
        op0Var.add(i, obj);
        this.OOA6hdeuvCS++;
        this.EljAMC1QTz = op0Var.GWasM1elztuh();
        this.encWxUiV2 = op0Var.EljAMC1QTz();
        this.JFJ3QoxA = -1;
        Yi7zF1RB1();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        GWasM1elztuh();
        if (!hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        int i = this.OOA6hdeuvCS;
        this.JFJ3QoxA = i;
        ya1 ya1Var = this.mOu10nynGul;
        op0 op0Var = this.AvO7iQsrTN;
        if (ya1Var == null) {
            Object[] objArr = op0Var.rQPn8YBR;
            this.OOA6hdeuvCS = i + 1;
            return objArr[i];
        }
        if (ya1Var.hasNext()) {
            this.OOA6hdeuvCS++;
            return ya1Var.next();
        }
        Object[] objArr2 = op0Var.rQPn8YBR;
        int i2 = this.OOA6hdeuvCS;
        this.OOA6hdeuvCS = i2 + 1;
        return objArr2[i2 - ya1Var.EljAMC1QTz];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        GWasM1elztuh();
        if (!hasPrevious()) {
            o4.E7jCp8Ls();
            return null;
        }
        int i = this.OOA6hdeuvCS;
        this.JFJ3QoxA = i - 1;
        ya1 ya1Var = this.mOu10nynGul;
        op0 op0Var = this.AvO7iQsrTN;
        if (ya1Var == null) {
            Object[] objArr = op0Var.rQPn8YBR;
            int i2 = i - 1;
            this.OOA6hdeuvCS = i2;
            return objArr[i2];
        }
        int i3 = ya1Var.EljAMC1QTz;
        if (i <= i3) {
            this.OOA6hdeuvCS = i - 1;
            return ya1Var.previous();
        }
        Object[] objArr2 = op0Var.rQPn8YBR;
        int i4 = i - 1;
        this.OOA6hdeuvCS = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.WdrkLMV3xh, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        GWasM1elztuh();
        int i = this.JFJ3QoxA;
        if (i == -1) {
            throw new IllegalStateException();
        }
        op0 op0Var = this.AvO7iQsrTN;
        op0Var.Yi7zF1RB1(i);
        int i2 = this.JFJ3QoxA;
        if (i2 < this.OOA6hdeuvCS) {
            this.OOA6hdeuvCS = i2;
        }
        this.EljAMC1QTz = op0Var.GWasM1elztuh();
        this.encWxUiV2 = op0Var.EljAMC1QTz();
        this.JFJ3QoxA = -1;
        Yi7zF1RB1();
    }

    @Override // defpackage.WdrkLMV3xh, java.util.ListIterator
    public final void set(Object obj) {
        GWasM1elztuh();
        int i = this.JFJ3QoxA;
        if (i == -1) {
            throw new IllegalStateException();
        }
        op0 op0Var = this.AvO7iQsrTN;
        op0Var.set(i, obj);
        this.encWxUiV2 = op0Var.EljAMC1QTz();
        Yi7zF1RB1();
    }
}
