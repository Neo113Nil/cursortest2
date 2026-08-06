package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class wDCmwMuMZmB extends vv implements wu {
    public final /* synthetic */ int E7jCp8Ls;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wDCmwMuMZmB(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.E7jCp8Ls = i4;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        ContentCaptureSession GWasM1elztuh;
        xj0 xj0Var;
        int i = this.E7jCp8Ls;
        int i2 = 2;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    dcDmLGVhzWm.EljAMC1QTz(view);
                }
                if (i3 < 29 || (GWasM1elztuh = a4.GWasM1elztuh(view)) == null) {
                    return null;
                }
                return new d(i2, GWasM1elztuh, view);
            case 1:
                ht htVar = (ht) obj;
                ig0 ig0Var = htVar.X1lG3V04pd;
                ig0 ig0Var2 = htVar.xqGvceK5x;
                nt ntVar = htVar.GWasM1elztuh;
                rt EljAMC1QTz = ntVar.EljAMC1QTz();
                if (EljAMC1QTz == null) {
                    Object[] objArr = ig0Var2.Yi7zF1RB1;
                    long[] jArr = ig0Var2.GWasM1elztuh;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        ((g6) objArr[(i4 << 3) + i6]).sb9fmtV8A();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                }
                            }
                            if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                } else if (EljAMC1QTz.Mjvvu5DE) {
                    if (ig0Var.X1lG3V04pd(EljAMC1QTz)) {
                        EljAMC1QTz.fX9rg6CD();
                    }
                    EljAMC1QTz.bfDgRvRIg();
                    if (!EljAMC1QTz.OOA6hdeuvCS.Mjvvu5DE) {
                        t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                    }
                    he0 he0Var = EljAMC1QTz.OOA6hdeuvCS;
                    g60 eUH21U3apd = vc0.eUH21U3apd(EljAMC1QTz);
                    int i7 = 0;
                    while (eUH21U3apd != null) {
                        if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 5120) != 0) {
                            while (he0Var != null) {
                                int i8 = he0Var.AvO7iQsrTN;
                                if ((i8 & 5120) != 0) {
                                    if ((i8 & 1024) != 0) {
                                        i7++;
                                    }
                                    if ((he0Var instanceof g6) && ig0Var2.X1lG3V04pd(he0Var)) {
                                        if (i7 <= 1) {
                                            ((g6) he0Var).sb9fmtV8A();
                                            throw null;
                                        }
                                        ((g6) he0Var).sb9fmtV8A();
                                        throw null;
                                    }
                                }
                                he0Var = he0Var.mOu10nynGul;
                            }
                        }
                        eUH21U3apd = eUH21U3apd.cilMamHF();
                        he0Var = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
                    }
                    Object[] objArr2 = ig0Var2.Yi7zF1RB1;
                    long[] jArr2 = ig0Var2.GWasM1elztuh;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j2 = jArr2[i9];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((j2 & 255) < 128) {
                                        ((g6) objArr2[(i9 << 3) + i11]).sb9fmtV8A();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i9 != length2) {
                                i9++;
                            }
                        }
                    }
                }
                if (ntVar.EljAMC1QTz() == null || ntVar.X1lG3V04pd.bfDgRvRIg() == qt.AvO7iQsrTN) {
                    ntVar.X1lG3V04pd();
                }
                ig0Var.Yi7zF1RB1();
                ig0Var2.Yi7zF1RB1();
                htVar.OOA6hdeuvCS = false;
                return kc1.GWasM1elztuh;
            default:
                return Boolean.valueOf(((ut) obj).arNh8D4Z5gB.d5idzIhj55b(7));
        }
    }
}
