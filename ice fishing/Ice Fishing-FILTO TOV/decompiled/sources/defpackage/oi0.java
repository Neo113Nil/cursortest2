package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oi0 extends d71 implements lv {
    public final /* synthetic */ yf0 E7jCp8Ls;
    public final /* synthetic */ hi0 JFJ3QoxA;
    public final /* synthetic */ m51 XnEVoBF0td1l;
    public final /* synthetic */ qa1 mOu10nynGul;
    public final /* synthetic */ fh0 rQPn8YBR;
    public final /* synthetic */ zd uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(qa1 qa1Var, hi0 hi0Var, fh0 fh0Var, yf0 yf0Var, m51 m51Var, zd zdVar, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = qa1Var;
        this.JFJ3QoxA = hi0Var;
        this.rQPn8YBR = fh0Var;
        this.E7jCp8Ls = yf0Var;
        this.XnEVoBF0td1l = m51Var;
        this.uFEq9NpZ = zdVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        oi0 oi0Var = (oi0) uFEq9NpZ((vg) obj2, (ph) obj);
        kc1 kc1Var = kc1.GWasM1elztuh;
        oi0Var.WIEu4Ya2g8(kc1Var);
        return kc1Var;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        o50.A1EKNP6CxJ(obj);
        qa1 qa1Var = this.mOu10nynGul;
        Object EljAMC1QTz = qa1Var.GWasM1elztuh.EljAMC1QTz();
        fo0 fo0Var = qa1Var.xqGvceK5x;
        if (o30.rQPn8YBR(EljAMC1QTz, fo0Var.getValue()) && (this.JFJ3QoxA.Yi7zF1RB1.AvO7iQsrTN() == null || o30.rQPn8YBR(fo0Var.getValue(), this.rQPn8YBR))) {
            Iterator it = ((List) this.XnEVoBF0td1l.getValue()).iterator();
            while (it.hasNext()) {
                this.uFEq9NpZ.Yi7zF1RB1().X1lG3V04pd((fh0) it.next());
            }
            yf0 yf0Var = this.E7jCp8Ls;
            long[] jArr = yf0Var.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = yf0Var.Yi7zF1RB1[i4];
                                float f = yf0Var.X1lG3V04pd[i4];
                                if (!o30.rQPn8YBR((String) obj2, ((fh0) fo0Var.getValue()).JFJ3QoxA)) {
                                    yf0Var.OOA6hdeuvCS--;
                                    long[] jArr2 = yf0Var.GWasM1elztuh;
                                    int i5 = yf0Var.xqGvceK5x;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    yf0Var.Yi7zF1RB1[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        return new oi0(this.mOu10nynGul, this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, vgVar);
    }
}
