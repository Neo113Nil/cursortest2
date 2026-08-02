package com.squareup.cash.arcade.components;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class SearchBarKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldState f$0;

    public /* synthetic */ SearchBarKt$$ExternalSyntheticLambda1(int i, TextFieldState textFieldState) {
        this.$r8$classId = i;
        this.f$0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CharSequence charSequence;
        int i = this.$r8$classId;
        TextFieldState textFieldState = this.f$0;
        switch (i) {
            case 0:
                TextFieldStateKt.clearText(textFieldState);
                return Unit.INSTANCE;
            case 1:
                return textFieldState.getValue$foundation().text.toString();
            case 2:
                return textFieldState.getValue$foundation().text.toString();
            case 3:
                return textFieldState.getValue$foundation().text;
            case 4:
                return textFieldState.getValue$foundation().text;
            case 5:
                return textFieldState.getValue$foundation().text;
            case 6:
                return textFieldState.getValue$foundation().text;
            case 7:
                return Boolean.valueOf(textFieldState.getValue$foundation().text.length() == 0);
            case 8:
                return textFieldState.getValue$foundation().text;
            case 9:
                return textFieldState.getValue$foundation().text;
            case 10:
                return textFieldState.getValue$foundation().text;
            case 11:
                return textFieldState.getValue$foundation().text.toString();
            case 12:
                return textFieldState.getValue$foundation().text;
            case 13:
                return textFieldState.getValue$foundation().text;
            case 14:
                return textFieldState.getValue$foundation().text;
            case 15:
                return textFieldState.getValue$foundation().text.toString();
            case 16:
                TextFieldBuffer startEdit = textFieldState.startEdit();
                try {
                    startEdit.replace(0, textFieldState.getValue$foundation().text.length(), "");
                    textFieldState.commitEdit(startEdit);
                    textFieldState.finishEditing();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    textFieldState.finishEditing();
                    throw th;
                }
            case 17:
                TextFieldStateKt.clearText(textFieldState);
                return Unit.INSTANCE;
            case 18:
                TextFieldStateKt.clearText(textFieldState);
                return Unit.INSTANCE;
            case 19:
                return textFieldState.getValue$foundation().text;
            default:
                return Boolean.valueOf((textFieldState == null || (charSequence = textFieldState.getValue$foundation().text) == null || !(StringsKt.isBlank(charSequence) ^ true)) ? false : true);
        }
    }
}
