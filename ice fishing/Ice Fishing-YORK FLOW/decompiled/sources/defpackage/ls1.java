package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ls1 extends android.graphics.drawable.RippleDrawable {
    public boolean QiMR8OkAhezm;
    public final boolean WDYagTQQm9ns;
    public defpackage.pf oh71FJcDz6S2;

    public ls1(boolean z) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.WDYagTQQm9ns = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
        if (!this.WDYagTQQm9ns) {
            this.QiMR8OkAhezm = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.QiMR8OkAhezm = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.QiMR8OkAhezm;
    }
}
