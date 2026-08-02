package com.squareup.cash.account.presenters.documents;

import com.squareup.protos.cash.registrar.api.StatementType;
import okio.AsyncTimeout;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class AccountDocumentsPresenter$statementsViewModel$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[StatementType.values().length];
        try {
            AsyncTimeout.Companion companion = StatementType.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
