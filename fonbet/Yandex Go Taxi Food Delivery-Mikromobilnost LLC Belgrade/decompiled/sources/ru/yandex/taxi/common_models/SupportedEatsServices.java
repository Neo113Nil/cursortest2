package ru.yandex.taxi.common_models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/common_models/SupportedEatsServices;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "EATS", "GROCERY", "PHARMACY", "SHOP", "CORP_FOOD", "MARKET", "MARKET_VIEWER", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SupportedEatsServices {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportedEatsServices[] $VALUES;
    public static final SupportedEatsServices CORP_FOOD;
    public static final SupportedEatsServices EATS;
    public static final SupportedEatsServices GROCERY;
    public static final SupportedEatsServices MARKET;
    public static final SupportedEatsServices MARKET_VIEWER;
    public static final SupportedEatsServices PHARMACY;
    public static final SupportedEatsServices SHOP;
    private final String key;

    static {
        SupportedEatsServices supportedEatsServices = new SupportedEatsServices("EATS", 0, "eats");
        EATS = supportedEatsServices;
        SupportedEatsServices supportedEatsServices2 = new SupportedEatsServices("GROCERY", 1, "grocery");
        GROCERY = supportedEatsServices2;
        SupportedEatsServices supportedEatsServices3 = new SupportedEatsServices("PHARMACY", 2, "pharmacy");
        PHARMACY = supportedEatsServices3;
        SupportedEatsServices supportedEatsServices4 = new SupportedEatsServices("SHOP", 3, "shop");
        SHOP = supportedEatsServices4;
        SupportedEatsServices supportedEatsServices5 = new SupportedEatsServices("CORP_FOOD", 4, "corp_food");
        CORP_FOOD = supportedEatsServices5;
        SupportedEatsServices supportedEatsServices6 = new SupportedEatsServices("MARKET", 5, "market");
        MARKET = supportedEatsServices6;
        SupportedEatsServices supportedEatsServices7 = new SupportedEatsServices("MARKET_VIEWER", 6, "market_viewer");
        MARKET_VIEWER = supportedEatsServices7;
        SupportedEatsServices[] supportedEatsServicesArr = {supportedEatsServices, supportedEatsServices2, supportedEatsServices3, supportedEatsServices4, supportedEatsServices5, supportedEatsServices6, supportedEatsServices7};
        $VALUES = supportedEatsServicesArr;
        $ENTRIES = a.a(supportedEatsServicesArr);
    }

    public SupportedEatsServices(String str, int i, String str2) {
        this.key = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SupportedEatsServices valueOf(String str) {
        return (SupportedEatsServices) Enum.valueOf(SupportedEatsServices.class, str);
    }

    public static SupportedEatsServices[] values() {
        return (SupportedEatsServices[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
