package com.squareup.cash.blockers.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import com.squareup.cash.scrubbing.DateScrubber;
import com.squareup.cash.scrubbing.DateScrubberKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class BirthdayViewKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DateScrubber f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ BirthdayViewKt$$ExternalSyntheticLambda9(DateScrubber dateScrubber, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = dateScrubber;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        DateScrubber dateScrubber = this.f$0;
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        switch (i) {
            case 0:
                textFieldValue.getClass();
                mutableState.setValue(DateScrubberKt.scrub(dateScrubber, (TextFieldValue) mutableState.getValue(), textFieldValue));
                break;
            default:
                textFieldValue.getClass();
                mutableState.setValue(DateScrubberKt.scrub(dateScrubber, (TextFieldValue) mutableState.getValue(), textFieldValue));
                break;
        }
        return Unit.INSTANCE;
    }
}
