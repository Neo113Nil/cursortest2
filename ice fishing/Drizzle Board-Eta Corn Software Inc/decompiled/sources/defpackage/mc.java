package defpackage;

import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mc extends w30 {
    public final /* synthetic */ nc OxcuoDLp;
    public final /* synthetic */ ji sjUBp5pO;

    public mc(nc ncVar, ji jiVar) {
        this.OxcuoDLp = ncVar;
        this.sjUBp5pO = jiVar;
    }

    @Override // defpackage.w30
    public final View VhgXwMj9(int i) {
        ji jiVar = this.sjUBp5pO;
        if (jiVar.aZz0PFXp()) {
            return jiVar.VhgXwMj9(i);
        }
        o7 o7Var = this.OxcuoDLp.QT4Tf9Dt;
        if (o7Var != null) {
            return o7Var.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.w30
    public final boolean aZz0PFXp() {
        return this.sjUBp5pO.aZz0PFXp() || this.OxcuoDLp.uQ3KJUK5;
    }
}
