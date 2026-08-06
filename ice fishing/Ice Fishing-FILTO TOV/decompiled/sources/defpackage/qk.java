package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qk implements zx0 {
    public final /* synthetic */ rk GWasM1elztuh;

    public qk(rk rkVar) {
        this.GWasM1elztuh = rkVar;
    }

    @Override // defpackage.zx0
    public final float GWasM1elztuh(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        rk rkVar = this.GWasM1elztuh;
        float floatValue = ((Number) rkVar.GWasM1elztuh.mOu10nynGul(Float.valueOf(f))).floatValue();
        rkVar.OOA6hdeuvCS.setValue(Boolean.valueOf(floatValue > 0.0f));
        rkVar.EljAMC1QTz.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
