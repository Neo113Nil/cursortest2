package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y0 extends w60 {
    public final /* synthetic */ int GWasM1elztuh;

    public /* synthetic */ y0(int i) {
        this.GWasM1elztuh = i;
    }

    @Override // defpackage.w60
    public final void mOu10nynGul(g90 g90Var, String str) {
        switch (this.GWasM1elztuh) {
            case 0:
                int ordinal = g90Var.ordinal();
                if (ordinal == 0) {
                    Log.d("[Koin]", str);
                    break;
                } else if (ordinal == 1) {
                    Log.i("[Koin]", str);
                    break;
                } else if (ordinal == 2) {
                    Log.w("[Koin]", str);
                    break;
                } else if (ordinal == 3) {
                    Log.e("[Koin]", str);
                    break;
                } else {
                    Log.e("[Koin]", str);
                    break;
                }
        }
    }

    private final void k8h8IjolWQ(g90 g90Var, String str) {
    }
}
