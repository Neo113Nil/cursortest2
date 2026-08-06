package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qc1 extends RippleDrawable {
    public boolean AvO7iQsrTN;
    public yb EljAMC1QTz;
    public final boolean OOA6hdeuvCS;

    public qc1(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.OOA6hdeuvCS = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.OOA6hdeuvCS) {
            this.AvO7iQsrTN = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.AvO7iQsrTN = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.AvO7iQsrTN;
    }
}
