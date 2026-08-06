package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ly extends EdgeEffect {
    public final float GWasM1elztuh;
    public float Yi7zF1RB1;

    public ly(Context context) {
        super(context);
        this.GWasM1elztuh = vc0.OOA6hdeuvCS(context).OOA6hdeuvCS * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.Yi7zF1RB1 = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.Yi7zF1RB1 = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.Yi7zF1RB1 = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.Yi7zF1RB1 = 0.0f;
        super.onPull(f);
    }
}
