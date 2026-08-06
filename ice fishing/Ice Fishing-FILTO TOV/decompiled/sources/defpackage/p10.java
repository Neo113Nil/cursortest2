package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p10 implements af1 {
    public final ye1[] GWasM1elztuh;

    public p10(ye1... ye1VarArr) {
        this.GWasM1elztuh = ye1VarArr;
    }

    @Override // defpackage.af1
    public final we1 Yi7zF1RB1(Class cls, of0 of0Var) {
        we1 we1Var;
        ye1 ye1Var;
        hv hvVar;
        va GWasM1elztuh = st0.GWasM1elztuh(cls);
        ye1[] ye1VarArr = this.GWasM1elztuh;
        ye1[] ye1VarArr2 = (ye1[]) Arrays.copyOf(ye1VarArr, ye1VarArr.length);
        int length = ye1VarArr2.length;
        int i = 0;
        while (true) {
            we1Var = null;
            if (i >= length) {
                ye1Var = null;
                break;
            }
            ye1Var = ye1VarArr2[i];
            if (ye1Var.GWasM1elztuh.equals(GWasM1elztuh)) {
                break;
            }
            i++;
        }
        if (ye1Var != null && (hvVar = ye1Var.Yi7zF1RB1) != null) {
            we1Var = (we1) hvVar.mOu10nynGul(of0Var);
        }
        if (we1Var != null) {
            return we1Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + GWasM1elztuh.GWasM1elztuh()).toString());
    }
}
