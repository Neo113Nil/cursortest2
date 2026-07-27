package com.appsflyer.internal;

import java.util.Locale;

/* loaded from: classes4.dex */
public enum AFi1wSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
