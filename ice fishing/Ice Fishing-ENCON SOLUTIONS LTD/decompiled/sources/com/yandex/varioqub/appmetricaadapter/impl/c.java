package com.yandex.varioqub.appmetricaadapter.impl;

import a.AbstractC0083a;
import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class c implements d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(context, new a(adapterIdentifiersCallback), AbstractC0083a.m(StartupParamsCallback.APPMETRICA_DEVICE_ID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void b(LinkedHashMap linkedHashMap) {
        AppMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void c(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(context, new b(adapterIdentifiersCallback), AbstractC0083a.m(StartupParamsCallback.APPMETRICA_UUID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(byte[] bArr) {
        ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
