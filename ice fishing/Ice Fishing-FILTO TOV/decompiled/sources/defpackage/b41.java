package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b41 extends ru0 implements lv {
    public long[] AvO7iQsrTN;
    public final /* synthetic */ c41 E7jCp8Ls;
    public int JFJ3QoxA;
    public int encWxUiV2;
    public int mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(c41 c41Var, vg vgVar) {
        super(vgVar);
        this.E7jCp8Ls = c41Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((b41) uFEq9NpZ((vg) obj2, (w01) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        w01 w01Var;
        long[] jArr;
        int length;
        int i;
        w01 w01Var2;
        int i2;
        w01 w01Var3;
        int i3;
        c41 c41Var = this.E7jCp8Ls;
        long j = c41Var.OOA6hdeuvCS;
        long j2 = c41Var.AvO7iQsrTN;
        long j3 = c41Var.EljAMC1QTz;
        int i4 = this.JFJ3QoxA;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i4 == 0) {
            o50.A1EKNP6CxJ(obj);
            w01Var = (w01) this.rQPn8YBR;
            jArr = c41Var.encWxUiV2;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                w01Var2 = w01Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return kc1.GWasM1elztuh;
        }
        if (i4 == 1) {
            length = this.mOu10nynGul;
            int i5 = this.encWxUiV2;
            jArr = this.AvO7iQsrTN;
            w01Var = (w01) this.rQPn8YBR;
            o50.A1EKNP6CxJ(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.encWxUiV2;
                w01Var3 = (w01) this.rQPn8YBR;
                o50.A1EKNP6CxJ(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.rQPn8YBR = w01Var3;
                        this.AvO7iQsrTN = null;
                        this.encWxUiV2 = i3;
                        this.JFJ3QoxA = 3;
                        w01Var3.Yi7zF1RB1(this, l);
                        return qhVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return kc1.GWasM1elztuh;
            }
            i2 = this.encWxUiV2;
            w01Var2 = (w01) this.rQPn8YBR;
            o50.A1EKNP6CxJ(obj);
            i2++;
            if (i2 >= 64) {
                w01Var = w01Var2;
                if (j != 0) {
                    w01Var3 = w01Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return kc1.GWasM1elztuh;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.rQPn8YBR = w01Var2;
                this.AvO7iQsrTN = null;
                this.encWxUiV2 = i2;
                this.JFJ3QoxA = 2;
                w01Var2.Yi7zF1RB1(this, l2);
                return qhVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.rQPn8YBR = w01Var;
            this.AvO7iQsrTN = jArr;
            this.encWxUiV2 = i;
            this.mOu10nynGul = length;
            this.JFJ3QoxA = 1;
            w01Var.Yi7zF1RB1(this, l3);
            return qhVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        b41 b41Var = new b41(this.E7jCp8Ls, vgVar);
        b41Var.rQPn8YBR = obj;
        return b41Var;
    }
}
