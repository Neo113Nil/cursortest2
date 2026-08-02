package io.appmetrica.analytics.impl;

import defpackage.evu0;
import defpackage.jl40;
import io.appmetrica.analytics.FeaturesResult;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0533mc implements StartupParamsCallback {
    public final IParamsCallback a;

    public C0533mc(IParamsCallback iParamsCallback) {
        this.a = iParamsCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r8 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IParamsCallback.Result a(StartupParamsCallback.Result result) {
        Map f;
        Map f2;
        Boolean bool;
        String id;
        String id2;
        String id3;
        String str = result.deviceId;
        String str2 = result.uuid;
        String parameterForKey = result.parameterForKey(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL);
        String parameterForKey2 = result.parameterForKey(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL);
        String str3 = result.deviceIdHash;
        StartupParamsItem startupParamsItem = result.parameters.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (startupParamsItem != null && (id3 = startupParamsItem.getId()) != null) {
            if (evu0.J(id3)) {
                id3 = null;
            }
            if (id3 != null) {
                f = Vc.a(id3);
            }
        }
        f = kotlin.collections.b.f();
        StartupParamsItem startupParamsItem2 = result.parameters.get("appmetrica_custom_sdk_hosts");
        if (startupParamsItem2 != null && (id2 = startupParamsItem2.getId()) != null) {
            if (evu0.J(id2)) {
                id2 = null;
            }
            if (id2 != null) {
                f2 = Vc.b(id2);
            }
        }
        f2 = kotlin.collections.b.f();
        Map map = f2;
        StartupParamsItem startupParamsItem3 = result.parameters.get(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED);
        if (startupParamsItem3 != null && (id = startupParamsItem3.getId()) != null) {
            int hashCode = id.hashCode();
            if (hashCode != 3569038) {
                if (hashCode == 97196323 && id.equals("false")) {
                    bool = Boolean.FALSE;
                }
            } else if (id.equals("true")) {
                bool = Boolean.TRUE;
            }
            return new IParamsCallback.Result(str, str2, parameterForKey, parameterForKey2, str3, f, map, new FeaturesResult(bool));
        }
        bool = null;
        return new IParamsCallback.Result(str, str2, parameterForKey, parameterForKey2, str3, f, map, new FeaturesResult(bool));
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        this.a.onReceive(result != null ? a(result) : null);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        IParamsCallback.Reason reason2;
        IParamsCallback iParamsCallback = this.a;
        if (jl40.l(reason, StartupParamsCallback.Reason.UNKNOWN)) {
            reason2 = IParamsCallback.Reason.UNKNOWN;
        } else if (jl40.l(reason, StartupParamsCallback.Reason.NETWORK)) {
            reason2 = IParamsCallback.Reason.NETWORK;
        } else if (jl40.l(reason, StartupParamsCallback.Reason.INVALID_RESPONSE)) {
            reason2 = IParamsCallback.Reason.INVALID_RESPONSE;
        } else {
            String str = reason.value;
            IParamsCallback.Reason reason3 = IParamsCallback.Reason.INCONSISTENT_CLIDS;
            reason2 = jl40.l(str, reason3.toString()) ? reason3 : IParamsCallback.Reason.UNKNOWN;
        }
        iParamsCallback.onRequestError(reason2, result != null ? a(result) : null);
    }
}
