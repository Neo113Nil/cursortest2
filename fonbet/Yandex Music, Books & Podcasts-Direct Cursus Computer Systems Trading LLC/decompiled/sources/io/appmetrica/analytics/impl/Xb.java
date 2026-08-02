package io.appmetrica.analytics.impl;

import com.connectsdk.service.airplay.PListParser;
import defpackage.e5b;
import io.appmetrica.analytics.FeaturesResult;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Xb implements StartupParamsCallback {
    public final IParamsCallback a;

    public Xb(@NotNull IParamsCallback iParamsCallback) {
        this.a = iParamsCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r8 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IParamsCallback.Result a(StartupParamsCallback.Result result) {
        Map map;
        Map map2;
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
            if (StringsKt.U(id3)) {
                id3 = null;
            }
            if (id3 != null) {
                map = Fc.a(id3);
            }
        }
        map = e5b.a;
        map.getClass();
        StartupParamsItem startupParamsItem2 = result.parameters.get("appmetrica_custom_sdk_hosts");
        if (startupParamsItem2 != null && (id2 = startupParamsItem2.getId()) != null) {
            if (StringsKt.U(id2)) {
                id2 = null;
            }
            if (id2 != null) {
                map2 = Fc.b(id2);
            }
        }
        map2 = e5b.a;
        map2.getClass();
        Map map3 = map2;
        StartupParamsItem startupParamsItem3 = result.parameters.get(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED);
        if (startupParamsItem3 != null && (id = startupParamsItem3.getId()) != null) {
            int hashCode = id.hashCode();
            if (hashCode != 3569038) {
                if (hashCode == 97196323 && id.equals(PListParser.TAG_FALSE)) {
                    bool = Boolean.FALSE;
                }
            } else if (id.equals(PListParser.TAG_TRUE)) {
                bool = Boolean.TRUE;
            }
            return new IParamsCallback.Result(str, str2, parameterForKey, parameterForKey2, str3, map, map3, new FeaturesResult(bool));
        }
        bool = null;
        return new IParamsCallback.Result(str, str2, parameterForKey, parameterForKey2, str3, map, map3, new FeaturesResult(bool));
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        this.a.onReceive(result != null ? a(result) : null);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(@NotNull StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        IParamsCallback.Reason reason2;
        IParamsCallback iParamsCallback = this.a;
        if (Intrinsics.d(reason, StartupParamsCallback.Reason.UNKNOWN)) {
            reason2 = IParamsCallback.Reason.UNKNOWN;
        } else if (Intrinsics.d(reason, StartupParamsCallback.Reason.NETWORK)) {
            reason2 = IParamsCallback.Reason.NETWORK;
        } else if (Intrinsics.d(reason, StartupParamsCallback.Reason.INVALID_RESPONSE)) {
            reason2 = IParamsCallback.Reason.INVALID_RESPONSE;
        } else {
            String str = reason.value;
            IParamsCallback.Reason reason3 = IParamsCallback.Reason.INCONSISTENT_CLIDS;
            reason2 = Intrinsics.d(str, reason3.toString()) ? reason3 : IParamsCallback.Reason.UNKNOWN;
        }
        iParamsCallback.onRequestError(reason2, result != null ? a(result) : null);
    }
}
