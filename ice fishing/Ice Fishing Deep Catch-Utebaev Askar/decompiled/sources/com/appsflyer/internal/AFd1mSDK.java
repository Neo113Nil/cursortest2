package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1mSDK<T> {
    public final Function0<T> getCurrencyIso4217Code;

    /* JADX WARN: Multi-variable type inference failed */
    public AFd1mSDK(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getCurrencyIso4217Code = function0;
    }
}
