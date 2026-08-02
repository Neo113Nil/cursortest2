package com.squareup.cash.pools.views;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PoolDetailsViewKt$ProgressContent$1$5$1$1 implements Function1 {
    public static final PoolDetailsViewKt$ProgressContent$1$5$1$1 INSTANCE = new PoolDetailsViewKt$ProgressContent$1$5$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstrainScope constrainScope = (ConstrainScope) obj;
        constrainScope.getClass();
        Recorder.AnonymousClass4 anonymousClass4 = constrainScope.top;
        ConstrainedLayoutReference constrainedLayoutReference = constrainScope.parent;
        Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference.top, RecyclerView.DECELERATION_RATE, 6);
        ConstrainScope.centerHorizontallyTo$default(constrainScope, constrainedLayoutReference);
        return Unit.INSTANCE;
    }
}
