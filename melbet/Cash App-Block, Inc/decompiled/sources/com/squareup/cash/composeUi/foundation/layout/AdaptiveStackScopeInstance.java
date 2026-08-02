package com.squareup.cash.composeUi.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class AdaptiveStackScopeInstance implements AdaptiveStackScope {
    public static final AdaptiveStackScopeInstance INSTANCE = new AdaptiveStackScopeInstance();

    @Override // com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope
    public final Modifier divider() {
        return RulerKt.layoutId(Modifier.Companion.$$INSTANCE, "dividerId");
    }

    @Override // com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope
    public final Modifier horizontalWeight(Modifier modifier, float f) {
        modifier.getClass();
        if (f > 0.0d) {
            return modifier.then(new AdaptiveStackLayoutWeightElement(f));
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f, "invalid weight ", "; must be greater than zero"));
        return null;
    }
}
