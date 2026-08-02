package ru.yandex.taxi.messenger.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/messenger/domain/WebMessengerAnalyticsFacade$Service", "", "Lru/yandex/taxi/messenger/domain/WebMessengerAnalyticsFacade$Service;", "TAXI", "MARKETPLACE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebMessengerAnalyticsFacade$Service {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebMessengerAnalyticsFacade$Service[] $VALUES;
    public static final WebMessengerAnalyticsFacade$Service MARKETPLACE;
    public static final WebMessengerAnalyticsFacade$Service TAXI;

    static {
        WebMessengerAnalyticsFacade$Service webMessengerAnalyticsFacade$Service = new WebMessengerAnalyticsFacade$Service("TAXI", 0);
        TAXI = webMessengerAnalyticsFacade$Service;
        WebMessengerAnalyticsFacade$Service webMessengerAnalyticsFacade$Service2 = new WebMessengerAnalyticsFacade$Service("MARKETPLACE", 1);
        MARKETPLACE = webMessengerAnalyticsFacade$Service2;
        WebMessengerAnalyticsFacade$Service[] webMessengerAnalyticsFacade$ServiceArr = {webMessengerAnalyticsFacade$Service, webMessengerAnalyticsFacade$Service2};
        $VALUES = webMessengerAnalyticsFacade$ServiceArr;
        $ENTRIES = kotlin.enums.a.a(webMessengerAnalyticsFacade$ServiceArr);
    }

    public static WebMessengerAnalyticsFacade$Service valueOf(String str) {
        return (WebMessengerAnalyticsFacade$Service) Enum.valueOf(WebMessengerAnalyticsFacade$Service.class, str);
    }

    public static WebMessengerAnalyticsFacade$Service[] values() {
        return (WebMessengerAnalyticsFacade$Service[]) $VALUES.clone();
    }
}
