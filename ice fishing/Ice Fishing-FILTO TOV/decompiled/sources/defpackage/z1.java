package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z1 implements qe1 {
    public final ViewConfiguration GWasM1elztuh;

    public z1(ViewConfiguration viewConfiguration) {
        this.GWasM1elztuh = viewConfiguration;
    }

    @Override // defpackage.qe1
    public final float GWasM1elztuh() {
        return this.GWasM1elztuh.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.qe1
    public final float Yi7zF1RB1() {
        return this.GWasM1elztuh.getScaledTouchSlop();
    }
}
