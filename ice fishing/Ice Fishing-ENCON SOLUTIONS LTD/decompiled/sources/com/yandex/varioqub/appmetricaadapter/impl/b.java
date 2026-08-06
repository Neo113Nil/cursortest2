package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes.dex */
public final class b implements StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f2718a;

    public b(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2718a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        String str;
        if (result == null || (str = result.uuid) == null) {
            str = "";
        }
        this.f2718a.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f2718a.onError(reason.value);
    }
}
