package i0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends RippleDrawable {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3004g;

    /* renamed from: h, reason: collision with root package name */
    public f1.q f3005h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f3006i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3007j;

    public w(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f3004g = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f3004g) {
            this.f3007j = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f3007j = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f3007j;
    }
}
