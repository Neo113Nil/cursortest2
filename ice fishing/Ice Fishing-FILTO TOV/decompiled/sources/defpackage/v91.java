package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v91 extends bb {
    public final o1 CMh55RymNfS;
    public hv YXi2hvwn7WL;
    public boolean z19UFEN2I;

    public v91(final boolean z, tf0 tf0Var, boolean z2, ov0 ov0Var, final hv hvVar) {
        super(tf0Var, null, false, z2, ov0Var, new wu() { // from class: u91
            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                hv.this.mOu10nynGul(Boolean.valueOf(!z));
                return kc1.GWasM1elztuh;
            }
        });
        this.z19UFEN2I = z;
        this.YXi2hvwn7WL = hvVar;
        this.CMh55RymNfS = new o1(22, this);
    }

    @Override // defpackage.bb
    public final void Hc2GqxcqBiX(l01 l01Var) {
        p0 p0Var;
        AutofillValue forToggle;
        w91 w91Var = this.z19UFEN2I ? w91.OOA6hdeuvCS : w91.EljAMC1QTz;
        u40[] u40VarArr = j01.GWasM1elztuh;
        k01 k01Var = h01.A1EKNP6CxJ;
        u40[] u40VarArr2 = j01.GWasM1elztuh;
        u40 u40Var = u40VarArr2[26];
        l01Var.GWasM1elztuh(k01Var, w91Var);
        x xVar = b9xEq24R1.WRKkgoJXwDn;
        k01 k01Var2 = h01.mE4lRynR;
        u40 u40Var2 = u40VarArr2[9];
        l01Var.GWasM1elztuh(k01Var2, xVar);
        boolean z = this.z19UFEN2I;
        if (Build.VERSION.SDK_INT >= 26) {
            forToggle = AutofillValue.forToggle(z);
            p0Var = new p0(forToggle);
        } else {
            p0Var = null;
        }
        if (p0Var != null) {
            k01 k01Var3 = h01.jivtDDk9H;
            u40 u40Var3 = u40VarArr2[10];
            l01Var.GWasM1elztuh(k01Var3, p0Var);
        }
        l01Var.GWasM1elztuh(yz0.encWxUiV2, new VeqTn1PQw7(null, new E7jCp8Ls(22, l01Var)));
    }
}
