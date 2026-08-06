package defpackage;

/* loaded from: classes.dex */
public final class uk1 extends android.graphics.drawable.RippleDrawable {
    public java.lang.Integer AARZUJiTa;
    public boolean EXtogiMhuM;
    public final boolean adDC3e2L;
    public defpackage.ae xiZrDbcSW0;

    public uk1(boolean z) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.adDC3e2L = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
        if (!this.adDC3e2L) {
            this.EXtogiMhuM = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.EXtogiMhuM = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.EXtogiMhuM;
    }
}
