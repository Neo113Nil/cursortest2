package com.google.android.datatransport;

import android.text.PrecomputedText;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class WinterFlowRendererUtility {
    public static /* bridge */ /* synthetic */ boolean WinterFlowSingletonPlatform(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean WinterFlowVariableBandwidth(Object obj) {
        return obj instanceof DisplayCutout;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout WinterFlowVariableVersionControl(Object obj) {
        return (DisplayCutout) obj;
    }
}
