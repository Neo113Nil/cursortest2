package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.IAdvIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Zb implements StartupParamsCallback {
    public final IAdvIdentifiersCallback a;
    public final V b;

    public Zb(IAdvIdentifiersCallback iAdvIdentifiersCallback) {
        this(iAdvIdentifiersCallback, new V());
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        AdvIdentifiersResult advIdentifiersResult;
        Map<String, StartupParamsItem> map;
        IAdvIdentifiersCallback iAdvIdentifiersCallback = this.a;
        if (result == null || (map = result.parameters) == null) {
            AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
            advIdentifiersResult = new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, null), new AdvIdentifiersResult.AdvId(null, details, null), new AdvIdentifiersResult.AdvId(null, details, null));
        } else {
            StartupParamsItem startupParamsItem = map.get("appmetrica_google_adv_id");
            StartupParamsItem startupParamsItem2 = map.get("appmetrica_huawei_oaid");
            StartupParamsItem startupParamsItem3 = map.get("appmetrica_yandex_adv_id");
            this.b.getClass();
            advIdentifiersResult = new AdvIdentifiersResult(V.a(startupParamsItem), V.a(startupParamsItem2), V.a(startupParamsItem3));
        }
        iAdvIdentifiersCallback.onReceive(advIdentifiersResult);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        AdvIdentifiersResult advIdentifiersResult;
        Map<String, StartupParamsItem> map;
        IAdvIdentifiersCallback iAdvIdentifiersCallback = this.a;
        if (result == null || (map = result.parameters) == null) {
            AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
            advIdentifiersResult = new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, null), new AdvIdentifiersResult.AdvId(null, details, null), new AdvIdentifiersResult.AdvId(null, details, null));
        } else {
            StartupParamsItem startupParamsItem = map.get("appmetrica_google_adv_id");
            StartupParamsItem startupParamsItem2 = map.get("appmetrica_huawei_oaid");
            StartupParamsItem startupParamsItem3 = map.get("appmetrica_yandex_adv_id");
            this.b.getClass();
            advIdentifiersResult = new AdvIdentifiersResult(V.a(startupParamsItem), V.a(startupParamsItem2), V.a(startupParamsItem3));
        }
        iAdvIdentifiersCallback.onReceive(advIdentifiersResult);
    }

    public Zb(IAdvIdentifiersCallback iAdvIdentifiersCallback, V v) {
        this.a = iAdvIdentifiersCallback;
        this.b = v;
    }
}
