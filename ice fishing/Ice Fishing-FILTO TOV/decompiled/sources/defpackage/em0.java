package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class em0 extends tm0 {
    public static final em0 X1lG3V04pd = new em0(1, 0, 2);

    @Override // defpackage.tm0
    public final void GWasM1elztuh(nb nbVar, m4 m4Var, c31 c31Var, au0 au0Var, um0 um0Var) {
        int[] iArr;
        lx lxVar;
        int X1lG3V04pd2;
        int Yi7zF1RB1 = nbVar.Yi7zF1RB1(0);
        if (c31Var.uFEq9NpZ != 0) {
            we.GWasM1elztuh("Cannot move a group while inserting");
        }
        if (Yi7zF1RB1 < 0) {
            we.GWasM1elztuh("Parameter offset is out of bounds");
        }
        if (Yi7zF1RB1 == 0) {
            return;
        }
        int i = c31Var.jivtDDk9H;
        int i2 = c31Var.cilMamHF;
        int i3 = c31Var.Y6hRI1cF8;
        int i4 = i;
        while (true) {
            iArr = c31Var.Yi7zF1RB1;
            if (Yi7zF1RB1 <= 0) {
                break;
            }
            i4 += iArr[(c31Var.Mjvvu5DE(i4) * 5) + 3];
            if (i4 > i3) {
                we.GWasM1elztuh("Parameter offset is out of bounds");
            }
            Yi7zF1RB1--;
        }
        int i5 = iArr[(c31Var.Mjvvu5DE(i4) * 5) + 3];
        int AvO7iQsrTN = c31Var.AvO7iQsrTN(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(c31Var.jivtDDk9H));
        int AvO7iQsrTN2 = c31Var.AvO7iQsrTN(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(i4));
        int i6 = i4 + i5;
        int AvO7iQsrTN3 = c31Var.AvO7iQsrTN(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(i6));
        int i7 = AvO7iQsrTN3 - AvO7iQsrTN2;
        c31Var.WdrkLMV3xh(i7, Math.max(c31Var.jivtDDk9H - 1, 0));
        c31Var.lv06NcmrQ(i5);
        int[] iArr2 = c31Var.Yi7zF1RB1;
        int Mjvvu5DE = c31Var.Mjvvu5DE(i6) * 5;
        d5.MjxSquD6Av(iArr2, iArr2, c31Var.Mjvvu5DE(i) * 5, Mjvvu5DE, (i5 * 5) + Mjvvu5DE);
        if (i7 > 0) {
            Object[] objArr = c31Var.X1lG3V04pd;
            int encWxUiV2 = c31Var.encWxUiV2(AvO7iQsrTN2 + i7);
            System.arraycopy(objArr, encWxUiV2, objArr, AvO7iQsrTN, c31Var.encWxUiV2(AvO7iQsrTN3 + i7) - encWxUiV2);
        }
        int i8 = AvO7iQsrTN2 + i7;
        int i9 = i8 - AvO7iQsrTN;
        int i10 = c31Var.rQPn8YBR;
        int i11 = c31Var.E7jCp8Ls;
        int length = c31Var.X1lG3V04pd.length;
        int i12 = c31Var.XnEVoBF0td1l;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int Mjvvu5DE2 = c31Var.Mjvvu5DE(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(Mjvvu5DE2 * 5) + 4] = c31.mOu10nynGul(c31.mOu10nynGul(c31Var.AvO7iQsrTN(iArr2, Mjvvu5DE2) - i15, i12 < Mjvvu5DE2 ? 0 : i10, i11, length), c31Var.rQPn8YBR, c31Var.E7jCp8Ls, c31Var.X1lG3V04pd.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int WIEu4Ya2g8 = c31Var.WIEu4Ya2g8();
        int GWasM1elztuh = b31.GWasM1elztuh(c31Var.xqGvceK5x, i6, WIEu4Ya2g8);
        ArrayList arrayList = new ArrayList();
        if (GWasM1elztuh >= 0) {
            while (GWasM1elztuh < c31Var.xqGvceK5x.size() && (X1lG3V04pd2 = c31Var.X1lG3V04pd((lxVar = (lx) c31Var.xqGvceK5x.get(GWasM1elztuh)))) >= i6 && X1lG3V04pd2 < i16) {
                arrayList.add(lxVar);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            lx lxVar2 = (lx) arrayList.get(i18);
            int X1lG3V04pd3 = c31Var.X1lG3V04pd(lxVar2) + i17;
            if (X1lG3V04pd3 >= c31Var.AvO7iQsrTN) {
                lxVar2.GWasM1elztuh = -(WIEu4Ya2g8 - X1lG3V04pd3);
            } else {
                lxVar2.GWasM1elztuh = X1lG3V04pd3;
            }
            c31Var.xqGvceK5x.add(b31.GWasM1elztuh(c31Var.xqGvceK5x, X1lG3V04pd3, WIEu4Ya2g8), lxVar2);
        }
        if (c31Var.A1EKNP6CxJ(i6, i5)) {
            we.GWasM1elztuh("Unexpectedly removed anchors");
        }
        c31Var.XnEVoBF0td1l(i2, c31Var.Y6hRI1cF8, i);
        if (i7 > 0) {
            c31Var.MZhzXH72(i8, i7, i6 - 1);
        }
    }
}
