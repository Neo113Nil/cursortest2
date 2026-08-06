package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ce extends ru0 implements lv {
    public int AvO7iQsrTN;
    public final /* synthetic */ de E7jCp8Ls;
    public int JFJ3QoxA;
    public int encWxUiV2;
    public int mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(de deVar, vg vgVar) {
        super(vgVar);
        this.E7jCp8Ls = deVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((ce) uFEq9NpZ((vg) obj2, (w01) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        w01 w01Var;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        de deVar = this.E7jCp8Ls;
        ag0 ag0Var = deVar.OOA6hdeuvCS;
        qf0 qf0Var = deVar.AvO7iQsrTN;
        int i6 = this.JFJ3QoxA;
        if (i6 == 0) {
            o50.A1EKNP6CxJ(obj);
            w01Var = (w01) this.rQPn8YBR;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.mOu10nynGul;
            i2 = this.encWxUiV2;
            i3 = this.AvO7iQsrTN;
            w01Var = (w01) this.rQPn8YBR;
            o50.A1EKNP6CxJ(obj);
        }
        if (i3 >= Math.min(deVar.encWxUiV2 + 10, qf0Var.Yi7zF1RB1)) {
            return kc1.GWasM1elztuh;
        }
        int i7 = i3 + 1;
        int Yi7zF1RB1 = qf0Var.Yi7zF1RB1(i3);
        switch (Yi7zF1RB1) {
            case 0:
                str = "up";
                break;
            case 1:
                Object EljAMC1QTz = ag0Var.EljAMC1QTz(i2);
                i2++;
                str = "down " + EljAMC1QTz;
                break;
            case 2:
                str = "remove " + qf0Var.Yi7zF1RB1(i7) + ' ' + qf0Var.Yi7zF1RB1(i3 + 2);
                i7 = i3 + 3;
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                str = "move " + qf0Var.Yi7zF1RB1(i7) + ' ' + qf0Var.Yi7zF1RB1(i3 + 2) + ' ' + qf0Var.Yi7zF1RB1(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int Yi7zF1RB12 = qf0Var.Yi7zF1RB1(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + Yi7zF1RB12 + ' ' + ag0Var.EljAMC1QTz(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int Yi7zF1RB13 = qf0Var.Yi7zF1RB1(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + Yi7zF1RB13 + ' ' + ag0Var.EljAMC1QTz(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                Object EljAMC1QTz2 = ag0Var.EljAMC1QTz(i2);
                EljAMC1QTz2.getClass();
                fb1.XnEVoBF0td1l(2, EljAMC1QTz2);
                i2 += 2;
                str = "apply " + ((lv) EljAMC1QTz2);
                break;
            case 8:
                str = "reuse " + deVar.EljAMC1QTz.EljAMC1QTz(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = mr0.AvO7iQsrTN("unknown op: ", Yi7zF1RB1);
                break;
        }
        this.rQPn8YBR = w01Var;
        this.AvO7iQsrTN = i7;
        this.encWxUiV2 = i2;
        this.mOu10nynGul = i;
        this.JFJ3QoxA = 1;
        w01Var.Yi7zF1RB1(this, i3 + ": " + str);
        return qh.OOA6hdeuvCS;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        ce ceVar = new ce(this.E7jCp8Ls, vgVar);
        ceVar.rQPn8YBR = obj;
        return ceVar;
    }
}
