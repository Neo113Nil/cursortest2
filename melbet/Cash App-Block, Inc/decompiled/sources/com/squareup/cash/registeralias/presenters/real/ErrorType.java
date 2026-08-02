package com.squareup.cash.registeralias.presenters.real;

import com.squareup.cash.cdf.account.AccountSignInReceiveError;
import com.squareup.cash.cdf.alias.AliasRegisterReceiveError;

/* loaded from: classes7.dex */
public enum ErrorType {
    INVALID_ALIAS(AccountSignInReceiveError.ErrorType.INVALID_ALIAS, AliasRegisterReceiveError.ErrorType.INVALID_ALIAS),
    TOO_MANY_REQUESTS(AccountSignInReceiveError.ErrorType.TOO_MANY_REQUESTS, AliasRegisterReceiveError.ErrorType.TOO_MANY_REQUESTS),
    DUPLICATE_ALIAS(AccountSignInReceiveError.ErrorType.DUPLICATE_ALIAS, AliasRegisterReceiveError.ErrorType.DUPLICATE_ALIAS),
    FAILURE(AccountSignInReceiveError.ErrorType.FAILURE, AliasRegisterReceiveError.ErrorType.FAILURE);

    public final AliasRegisterReceiveError.ErrorType registerType;
    public final AccountSignInReceiveError.ErrorType signInType;

    ErrorType(AccountSignInReceiveError.ErrorType errorType, AliasRegisterReceiveError.ErrorType errorType2) {
        this.signInType = errorType;
        this.registerType = errorType2;
    }

    public final AliasRegisterReceiveError.ErrorType getRegisterType() {
        return this.registerType;
    }

    public final AccountSignInReceiveError.ErrorType getSignInType() {
        return this.signInType;
    }
}
