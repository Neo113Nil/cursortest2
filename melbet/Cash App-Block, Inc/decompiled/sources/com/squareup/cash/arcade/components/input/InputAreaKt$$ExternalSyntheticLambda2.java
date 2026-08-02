package com.squareup.cash.arcade.components.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final /* synthetic */ class InputAreaKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KeyboardOptions f$0;

    public /* synthetic */ InputAreaKt$$ExternalSyntheticLambda2(KeyboardOptions keyboardOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = keyboardOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        KeyboardOptions keyboardOptions = this.f$0;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                semanticsPropertyReceiver.getClass();
                int i2 = keyboardOptions.capitalization;
                SemanticsPropertyKey semanticsPropertyKey = InputAreaKt.InputAreaKeyboardCapitalizationSemanticsKey;
                KProperty[] kPropertyArr = InputAreaKt.$$delegatedProperties;
                KProperty kProperty = kPropertyArr[0];
                KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i2);
                semanticsPropertyKey.getClass();
                semanticsPropertyReceiver.set(semanticsPropertyKey, keyboardCapitalization);
                int i3 = keyboardOptions.keyboardType;
                SemanticsPropertyKey semanticsPropertyKey2 = InputAreaKt.InputAreaKeyboardTypeSemanticsKey;
                KProperty kProperty2 = kPropertyArr[1];
                KeyboardType keyboardType = new KeyboardType(i3);
                semanticsPropertyKey2.getClass();
                semanticsPropertyReceiver.set(semanticsPropertyKey2, keyboardType);
                break;
            default:
                semanticsPropertyReceiver.getClass();
                int i4 = keyboardOptions.capitalization;
                SemanticsPropertyKey semanticsPropertyKey3 = InputFieldKt.KeyboardCapitalizationSemanticsKey;
                KProperty[] kPropertyArr2 = InputFieldKt.$$delegatedProperties;
                KProperty kProperty3 = kPropertyArr2[0];
                KeyboardCapitalization keyboardCapitalization2 = new KeyboardCapitalization(i4);
                semanticsPropertyKey3.getClass();
                semanticsPropertyReceiver.set(semanticsPropertyKey3, keyboardCapitalization2);
                int i5 = keyboardOptions.keyboardType;
                SemanticsPropertyKey semanticsPropertyKey4 = InputFieldKt.KeyboardTypeSemanticsKey;
                KProperty kProperty4 = kPropertyArr2[1];
                KeyboardType keyboardType2 = new KeyboardType(i5);
                semanticsPropertyKey4.getClass();
                semanticsPropertyReceiver.set(semanticsPropertyKey4, keyboardType2);
                break;
        }
        return Unit.INSTANCE;
    }
}
