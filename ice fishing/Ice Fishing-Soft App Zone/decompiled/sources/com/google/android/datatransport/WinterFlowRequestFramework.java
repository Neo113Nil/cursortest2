package com.google.android.datatransport;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestFramework extends CharacterStyle {
    public final boolean WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    public WinterFlowRequestFramework(boolean z, boolean z2) {
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.WinterFlowRouterStructure);
        textPaint.setStrikeThruText(this.WinterFlowHookDataSource);
    }
}
