package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda87 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidPathMeasure f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ State f$2;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda87(AndroidPathMeasure androidPathMeasure, float f, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = androidPathMeasure;
        this.f$1 = f;
        this.f$2 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        State state = this.f$2;
        float f = this.f$1;
        AndroidPathMeasure androidPathMeasure = this.f$0;
        switch (i) {
            case 0:
                AndroidPath Path = AndroidPath_androidKt.Path();
                androidPathMeasure.getSegment(((ClosedFloatRange) ((ClosedFloatingPointRange) state.getValue()))._start * f, ((ClosedFloatRange) ((ClosedFloatingPointRange) state.getValue()))._endInclusive * f, Path);
                return Path;
            default:
                AndroidPath Path2 = AndroidPath_androidKt.Path();
                androidPathMeasure.getSegment(((ClosedFloatRange) ((ClosedFloatingPointRange) state.getValue()))._start * f, ((ClosedFloatRange) ((ClosedFloatingPointRange) state.getValue()))._endInclusive * f, Path2);
                return Path2;
        }
    }
}
