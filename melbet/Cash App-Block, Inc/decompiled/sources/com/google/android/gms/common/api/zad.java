package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes4.dex */
public final class zad extends BasePendingResult {
    public final Status zae;

    public zad(Status status) {
        super(null);
        this.zae = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return this.zae;
    }
}
