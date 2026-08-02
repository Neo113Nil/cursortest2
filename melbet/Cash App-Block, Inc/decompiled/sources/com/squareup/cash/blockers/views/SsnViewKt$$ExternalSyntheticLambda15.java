package com.squareup.cash.blockers.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import com.squareup.cash.blockers.viewmodels.BirthdayEvent$Submit;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.blockers.viewmodels.SsnViewEvent;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda15 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TouchRecorder f$1;
    public final /* synthetic */ MutableState f$2;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda15(Function1 function1, TouchRecorder touchRecorder, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = touchRecorder;
        this.f$2 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String obj;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$2;
        TouchRecorder touchRecorder = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                String str = ((TextFieldValue) mutableState.getValue()).annotatedString.text;
                String str2 = "";
                if (str != null && (obj = str.toString()) != null) {
                    str2 = StringsKt__StringsJVMKt.replace$default(obj, "-", "");
                }
                function1.invoke(new SsnViewEvent.Next(str2, touchRecorder.getSignalsContext()));
                break;
            case 1:
                function1.invoke(new BirthdayEvent$Submit(((TextFieldValue) mutableState.getValue()).annotatedString.text, touchRecorder.getSignalsContext()));
                break;
            default:
                function1.invoke(new SetNameEvent.NameSubmitted(((TextFieldValue) mutableState.getValue()).annotatedString.text, touchRecorder.getSignalsContext()));
                break;
        }
        return Unit.INSTANCE;
    }
}
