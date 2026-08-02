package com.squareup.cash.onboarding.accountpicker.presenters;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes7.dex */
public final class AccountPickerParsingErrorFactory implements ProtoParsingError.Factory {
    public static final AccountPickerParsingErrorFactory INSTANCE = new AccountPickerParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new AccountPickerProtoParsingError(str, errorType, str2, exc, "AccountPicker");
    }
}
