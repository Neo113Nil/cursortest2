package com.squareup.cash.mri.android;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"com/squareup/cash/mri/android/SafeSignalCollector$InProgressException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/squareup/cash/mri/android/SafeSignalCollector$SignalException;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SafeSignalCollector$InProgressException extends RuntimeException implements SafeSignalCollector$SignalException {
    public final String signalName;

    public SafeSignalCollector$InProgressException(String str) {
        super(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Signal ", str, " is already in progress"));
        this.signalName = str;
    }

    @Override // com.squareup.cash.mri.android.SafeSignalCollector$SignalException
    public final String getSignalName() {
        return this.signalName;
    }
}
