package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes.dex */
public final class a implements StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f2717a;

    public a(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2717a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        String str;
        if (result == null || (str = result.deviceId) == null) {
            str = "";
        }
        this.f2717a.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f2717a.onError(reason.value);
    }
}
