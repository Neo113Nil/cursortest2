package com.yandex.passport.data.exceptions;

import com.yandex.passport.common.network.BackendError;

/* loaded from: classes4.dex */
public final class a extends h {
    public final BackendError a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BackendError backendError) {
        super(backendError.toString());
        backendError.getClass();
        this.a = backendError;
    }
}
