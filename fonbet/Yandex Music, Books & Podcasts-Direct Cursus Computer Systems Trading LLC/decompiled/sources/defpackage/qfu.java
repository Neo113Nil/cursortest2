package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class qfu extends tfu {
    public float[] g;
    public p86 h;

    @Override // defpackage.tfu
    public final void c(p86 p86Var) {
        this.h = p86Var;
    }

    @Override // defpackage.tfu
    public final void d(View view, float f) {
        float[] fArr = this.g;
        fArr[0] = a(f);
        xp3.c0(this.h, view, fArr);
    }
}
