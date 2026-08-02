package com.squareup.cash.sheet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Transition;

/* loaded from: classes6.dex */
public final class SheetKt$TheSheet$visibilityScope$1$1$1 implements AnimatedVisibilityScope {
    public final /* synthetic */ Transition $it;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SheetKt$TheSheet$visibilityScope$1$1$1(Transition transition, int i) {
        this.$r8$classId = i;
        this.$it = transition;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final Transition getTransition() {
        int i = this.$r8$classId;
        return this.$it;
    }
}
