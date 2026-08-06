package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bs0 implements t90 {
    public static final bs0 XnEVoBF0td1l = new bs0();
    public int EljAMC1QTz;
    public int OOA6hdeuvCS;
    public Handler mOu10nynGul;
    public boolean AvO7iQsrTN = true;
    public boolean encWxUiV2 = true;
    public final w90 JFJ3QoxA = new w90(this, true);
    public final uFEq9NpZ rQPn8YBR = new uFEq9NpZ(7, this);
    public final j6IIN2O8eOU E7jCp8Ls = new j6IIN2O8eOU(22, this);

    @Override // defpackage.t90
    public final w90 AvO7iQsrTN() {
        return this.JFJ3QoxA;
    }

    public final void GWasM1elztuh() {
        int i = this.EljAMC1QTz + 1;
        this.EljAMC1QTz = i;
        if (i == 1) {
            if (this.AvO7iQsrTN) {
                this.JFJ3QoxA.xqGvceK5x(l90.ON_RESUME);
                this.AvO7iQsrTN = false;
            } else {
                Handler handler = this.mOu10nynGul;
                handler.getClass();
                handler.removeCallbacks(this.rQPn8YBR);
            }
        }
    }
}
