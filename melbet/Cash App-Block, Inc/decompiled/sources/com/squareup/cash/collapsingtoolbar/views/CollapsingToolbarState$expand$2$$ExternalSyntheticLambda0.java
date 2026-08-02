package com.squareup.cash.collapsingtoolbar.views;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes6.dex */
public final /* synthetic */ class CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollScope f$0;
    public final /* synthetic */ Ref$FloatRef f$1;

    public /* synthetic */ CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0(int i, ScrollScope scrollScope, Ref$FloatRef ref$FloatRef) {
        this.$r8$classId = i;
        this.f$0 = scrollScope;
        this.f$1 = ref$FloatRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Ref$FloatRef ref$FloatRef = this.f$1;
        ScrollScope scrollScope = this.f$0;
        AnimationScope animationScope = (AnimationScope) obj;
        switch (i) {
            case 0:
                scrollScope.scrollBy(((Number) animationScope.value$delegate.getValue()).floatValue() - ref$FloatRef.element);
                ref$FloatRef.element = ((Number) animationScope.value$delegate.getValue()).floatValue();
                break;
            default:
                scrollScope.scrollBy(((Number) animationScope.value$delegate.getValue()).floatValue() - ref$FloatRef.element);
                ref$FloatRef.element = ((Number) animationScope.value$delegate.getValue()).floatValue();
                break;
        }
        return Unit.INSTANCE;
    }
}
