package ru.yandex.taxi.messenger.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/messenger/analytics/WebMessengerAnalytics$Service", "", "Lru/yandex/taxi/messenger/analytics/WebMessengerAnalytics$Service;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Taxi", "Marketplace", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebMessengerAnalytics$Service {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebMessengerAnalytics$Service[] $VALUES;
    public static final WebMessengerAnalytics$Service Marketplace;
    public static final WebMessengerAnalytics$Service Taxi;
    private final String eventValue;

    static {
        WebMessengerAnalytics$Service webMessengerAnalytics$Service = new WebMessengerAnalytics$Service("Taxi", 0, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        Taxi = webMessengerAnalytics$Service;
        WebMessengerAnalytics$Service webMessengerAnalytics$Service2 = new WebMessengerAnalytics$Service("Marketplace", 1, "marketplace");
        Marketplace = webMessengerAnalytics$Service2;
        WebMessengerAnalytics$Service[] webMessengerAnalytics$ServiceArr = {webMessengerAnalytics$Service, webMessengerAnalytics$Service2};
        $VALUES = webMessengerAnalytics$ServiceArr;
        $ENTRIES = a.a(webMessengerAnalytics$ServiceArr);
    }

    public WebMessengerAnalytics$Service(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static WebMessengerAnalytics$Service valueOf(String str) {
        return (WebMessengerAnalytics$Service) Enum.valueOf(WebMessengerAnalytics$Service.class, str);
    }

    public static WebMessengerAnalytics$Service[] values() {
        return (WebMessengerAnalytics$Service[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
