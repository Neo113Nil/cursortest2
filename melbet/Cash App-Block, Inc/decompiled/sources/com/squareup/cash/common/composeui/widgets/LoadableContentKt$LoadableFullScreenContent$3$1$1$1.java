package com.squareup.cash.common.composeui.widgets;

import androidx.constraintlayout.compose.ConstrainScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class LoadableContentKt$LoadableFullScreenContent$3$1$1$1 implements Function1 {
    public static final LoadableContentKt$LoadableFullScreenContent$3$1$1$1 INSTANCE = new LoadableContentKt$LoadableFullScreenContent$3$1$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstrainScope constrainScope = (ConstrainScope) obj;
        constrainScope.getClass();
        constrainScope.centerTo(constrainScope.parent);
        return Unit.INSTANCE;
    }
}
