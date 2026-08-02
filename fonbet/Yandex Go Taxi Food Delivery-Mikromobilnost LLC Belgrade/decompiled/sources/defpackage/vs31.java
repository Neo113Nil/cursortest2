package defpackage;

import android.view.View;

/* loaded from: classes10.dex */
public final class vs31 extends ws31 {
    public final float[] g = new float[1];
    public c7e h;

    @Override // defpackage.yhx
    public final void c(c7e c7eVar) {
        this.h = c7eVar;
    }

    @Override // defpackage.ws31
    public final void f(float f, View view) {
        float a = a(f);
        float[] fArr = this.g;
        fArr[0] = a;
        klf.b(this.h, view, fArr);
    }
}
