package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class yo9 extends h29 {
    public final /* synthetic */ v1s j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo9(v1s v1sVar, int i, int i2, gc8 gc8Var) {
        super(gc8Var);
        this.j = v1sVar;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.h29, defpackage.n7w
    public final void U(Throwable th) {
        super.U(th);
        this.j.n(null, 0, 0);
    }

    @Override // defpackage.er2
    public final void i0(Bitmap bitmap, t33 t33Var) {
        this.j.n(bitmap, this.k, this.l);
    }

    @Override // defpackage.er2
    public final void j0(Drawable drawable, t33 t33Var) {
        i0(vq2.N(drawable, 0, 0, 7), t33Var);
    }
}
