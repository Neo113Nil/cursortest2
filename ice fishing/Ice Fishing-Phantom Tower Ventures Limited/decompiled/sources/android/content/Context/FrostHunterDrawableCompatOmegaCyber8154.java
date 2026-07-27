package android.content.Context;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawableCompatOmegaCyber8154 extends CharacterStyle {
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterDrawableCompatOmegaCyber8154(boolean z, boolean z2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = z;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.FrostHunterAlphaAnimationNeoCosmos5761);
        textPaint.setStrikeThruText(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }
}
