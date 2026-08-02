package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class ut3 extends ixf {
    public final Typeface d;
    public final tt3 e;
    public boolean f;

    public ut3(tt3 tt3Var, Typeface typeface) {
        this.d = typeface;
        this.e = tt3Var;
    }

    @Override // defpackage.ixf
    public final void C(int i) {
        if (this.f) {
            return;
        }
        this.e.s(this.d);
    }

    @Override // defpackage.ixf
    public final void D(Typeface typeface, boolean z) {
        if (this.f) {
            return;
        }
        this.e.s(typeface);
    }
}
