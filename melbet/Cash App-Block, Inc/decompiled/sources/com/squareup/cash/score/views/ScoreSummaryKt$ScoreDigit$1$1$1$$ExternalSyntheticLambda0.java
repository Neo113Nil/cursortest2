package com.squareup.cash.score.views;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes8.dex */
public final /* synthetic */ class ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$FloatRef f$0;
    public final /* synthetic */ ScrollScope f$1;

    public /* synthetic */ ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0(int i, ScrollScope scrollScope, Ref$FloatRef ref$FloatRef) {
        this.$r8$classId = i;
        this.f$0 = ref$FloatRef;
        this.f$1 = scrollScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ScrollScope scrollScope = this.f$1;
        Ref$FloatRef ref$FloatRef = this.f$0;
        float floatValue = ((Float) obj).floatValue();
        ((Float) obj2).getClass();
        switch (i) {
            case 0:
                float f = ref$FloatRef.element;
                ref$FloatRef.element = scrollScope.scrollBy(floatValue - f) + f;
                break;
            default:
                float f2 = ref$FloatRef.element;
                ref$FloatRef.element = scrollScope.scrollBy(floatValue - f2) + f2;
                break;
        }
        return Unit.INSTANCE;
    }
}
