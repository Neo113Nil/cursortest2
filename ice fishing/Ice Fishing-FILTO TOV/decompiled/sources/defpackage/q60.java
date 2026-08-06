package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q60 implements cd0 {
    public final /* synthetic */ int GWasM1elztuh;
    public final /* synthetic */ cd0 OOA6hdeuvCS;
    public final /* synthetic */ v60 X1lG3V04pd;
    public final /* synthetic */ cd0 Yi7zF1RB1;
    public final /* synthetic */ int xqGvceK5x;

    public /* synthetic */ q60(cd0 cd0Var, v60 v60Var, int i, cd0 cd0Var2, int i2) {
        this.GWasM1elztuh = i2;
        this.X1lG3V04pd = v60Var;
        this.xqGvceK5x = i;
        this.OOA6hdeuvCS = cd0Var2;
        this.Yi7zF1RB1 = cd0Var;
    }

    @Override // defpackage.cd0
    public final Map GWasM1elztuh() {
        switch (this.GWasM1elztuh) {
        }
        return this.Yi7zF1RB1.GWasM1elztuh();
    }

    @Override // defpackage.cd0
    public final int OOA6hdeuvCS() {
        switch (this.GWasM1elztuh) {
        }
        return this.Yi7zF1RB1.OOA6hdeuvCS();
    }

    @Override // defpackage.cd0
    public final int X1lG3V04pd() {
        switch (this.GWasM1elztuh) {
        }
        return this.Yi7zF1RB1.X1lG3V04pd();
    }

    @Override // defpackage.cd0
    public final void Yi7zF1RB1() {
        int i;
        int i2 = this.GWasM1elztuh;
        cd0 cd0Var = this.OOA6hdeuvCS;
        int i3 = this.xqGvceK5x;
        v60 v60Var = this.X1lG3V04pd;
        switch (i2) {
            case 0:
                v60Var.mOu10nynGul = i3;
                cd0Var.Yi7zF1RB1();
                rg0 rg0Var = v60Var.YmKjaVtbfp5Z;
                hg0 hg0Var = v60Var.WIEu4Ya2g8;
                long[] jArr = hg0Var.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = hg0Var.Yi7zF1RB1[i8];
                                    m61 m61Var = (m61) hg0Var.X1lG3V04pd[i8];
                                    int mOu10nynGul = rg0Var.mOu10nynGul(obj);
                                    if (mOu10nynGul < 0 || mOu10nynGul >= v60Var.mOu10nynGul) {
                                        if (mOu10nynGul >= 0) {
                                            Object obj2 = rj0.E7jCp8Ls;
                                            i = i5;
                                            Object[] objArr = rg0Var.OOA6hdeuvCS;
                                            Object obj3 = objArr[mOu10nynGul];
                                            objArr[mOu10nynGul] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (v60Var.uFEq9NpZ.Yi7zF1RB1(obj)) {
                                            m61Var.GWasM1elztuh();
                                        }
                                        hg0Var.E7jCp8Ls(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                v60Var.AvO7iQsrTN(v60Var.encWxUiV2);
                break;
            default:
                v60Var.encWxUiV2 = i3;
                cd0Var.Yi7zF1RB1();
                if (v60Var.OOA6hdeuvCS.E7jCp8Ls == null) {
                    v60Var.AvO7iQsrTN(v60Var.encWxUiV2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cd0
    public final hv xqGvceK5x() {
        switch (this.GWasM1elztuh) {
        }
        return this.Yi7zF1RB1.xqGvceK5x();
    }
}
