package io.appmetrica.analytics;

/* loaded from: classes9.dex */
public interface ReporterYandexExtension {
    void reportRtmError(RtmErrorEvent rtmErrorEvent);

    void reportRtmEvent(RtmClientEvent rtmClientEvent);

    void reportRtmException(String str, String str2);

    void reportRtmException(String str, Throwable th);

    void updateRtmConfig(RtmConfig rtmConfig);
}
