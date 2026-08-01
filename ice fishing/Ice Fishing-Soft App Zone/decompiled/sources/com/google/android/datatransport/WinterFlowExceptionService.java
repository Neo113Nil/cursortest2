package com.google.android.datatransport;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionService extends RippleDrawable {
    public WinterFlowInheritanceSubsystem WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final boolean WinterFlowVariableVersionControl;

    public WinterFlowExceptionService(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.WinterFlowVariableVersionControl = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.WinterFlowVariableVersionControl) {
            this.WinterFlowUnitTestResponse = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.WinterFlowUnitTestResponse = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.WinterFlowUnitTestResponse;
    }
}
