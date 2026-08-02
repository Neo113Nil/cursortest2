package io.appmetrica.analytics.push.provider.api;

/* loaded from: classes9.dex */
public interface PushServiceController {
    PushServiceExecutionRestrictions getExecutionRestrictions();

    String getToken();

    String getTransportId();

    boolean register();

    boolean shouldSendToken(String str);
}
