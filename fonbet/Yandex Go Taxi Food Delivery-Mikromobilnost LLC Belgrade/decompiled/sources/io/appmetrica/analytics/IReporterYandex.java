package io.appmetrica.analytics;

import java.util.Map;

/* loaded from: classes9.dex */
public interface IReporterYandex extends IReporter, ReporterYandexExtension {
    void reportDiagnosticEvent(String str, String str2);

    void reportDiagnosticEvent(String str, Map<String, Object> map);

    void reportDiagnosticStatboxEvent(String str, String str2);

    void reportStatboxEvent(String str, String str2);

    void reportStatboxEvent(String str, Map<String, Object> map);

    void reportUserInfoEvent(UserInfo userInfo);

    void setUserInfo(UserInfo userInfo);
}
