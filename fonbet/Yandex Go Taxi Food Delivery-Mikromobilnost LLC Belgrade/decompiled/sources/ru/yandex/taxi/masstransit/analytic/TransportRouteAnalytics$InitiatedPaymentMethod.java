package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$InitiatedPaymentMethod", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$InitiatedPaymentMethod;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "YandexCard", "SbpToken", "Card", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$InitiatedPaymentMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$InitiatedPaymentMethod[] $VALUES;
    public static final TransportRouteAnalytics$InitiatedPaymentMethod Card;
    public static final TransportRouteAnalytics$InitiatedPaymentMethod SbpToken;
    public static final TransportRouteAnalytics$InitiatedPaymentMethod YandexCard;
    private final String eventValue;

    static {
        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod = new TransportRouteAnalytics$InitiatedPaymentMethod("YandexCard", 0, "yandex_card");
        YandexCard = transportRouteAnalytics$InitiatedPaymentMethod;
        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod2 = new TransportRouteAnalytics$InitiatedPaymentMethod("SbpToken", 1, "sbp_token");
        SbpToken = transportRouteAnalytics$InitiatedPaymentMethod2;
        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod3 = new TransportRouteAnalytics$InitiatedPaymentMethod("Card", 2, "card");
        Card = transportRouteAnalytics$InitiatedPaymentMethod3;
        TransportRouteAnalytics$InitiatedPaymentMethod[] transportRouteAnalytics$InitiatedPaymentMethodArr = {transportRouteAnalytics$InitiatedPaymentMethod, transportRouteAnalytics$InitiatedPaymentMethod2, transportRouteAnalytics$InitiatedPaymentMethod3};
        $VALUES = transportRouteAnalytics$InitiatedPaymentMethodArr;
        $ENTRIES = a.a(transportRouteAnalytics$InitiatedPaymentMethodArr);
    }

    public TransportRouteAnalytics$InitiatedPaymentMethod(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$InitiatedPaymentMethod valueOf(String str) {
        return (TransportRouteAnalytics$InitiatedPaymentMethod) Enum.valueOf(TransportRouteAnalytics$InitiatedPaymentMethod.class, str);
    }

    public static TransportRouteAnalytics$InitiatedPaymentMethod[] values() {
        return (TransportRouteAnalytics$InitiatedPaymentMethod[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
