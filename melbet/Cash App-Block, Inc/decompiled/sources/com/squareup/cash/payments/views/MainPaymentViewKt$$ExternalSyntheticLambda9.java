package com.squareup.cash.payments.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ MutableState f$2;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda9(String str, Function1 function1, MutableState mutableState) {
        this.f$1 = str;
        this.f$0 = function1;
        this.f$2 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$2;
        Function1 function1 = this.f$0;
        String str = this.f$1;
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        switch (i) {
            case 0:
                textFieldValue.getClass();
                mutableState.setValue(textFieldValue);
                function1.invoke(new MainPaymentViewEvent.SearchTextChanged(StringsKt.removePrefix(str, textFieldValue.annotatedString.text)));
                break;
            default:
                textFieldValue.getClass();
                mutableState.setValue(textFieldValue);
                AnnotatedString annotatedString = textFieldValue.annotatedString;
                if (!Intrinsics.areEqual(str, annotatedString.text)) {
                    function1.invoke(annotatedString.text);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda9(Function1 function1, String str, MutableState mutableState) {
        this.f$0 = function1;
        this.f$1 = str;
        this.f$2 = mutableState;
    }
}
