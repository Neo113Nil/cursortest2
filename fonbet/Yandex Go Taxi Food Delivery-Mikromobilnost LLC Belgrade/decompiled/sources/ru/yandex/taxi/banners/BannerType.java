package ru.yandex.taxi.banners;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/banners/BannerType;", "", "FULLSCREEN", "CARD", "NOTIFICATION", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BannerType[] $VALUES;
    public static final BannerType CARD;
    public static final BannerType FULLSCREEN;
    public static final BannerType NOTIFICATION;

    static {
        BannerType bannerType = new BannerType("FULLSCREEN", 0);
        FULLSCREEN = bannerType;
        BannerType bannerType2 = new BannerType("CARD", 1);
        CARD = bannerType2;
        BannerType bannerType3 = new BannerType("NOTIFICATION", 2);
        NOTIFICATION = bannerType3;
        BannerType[] bannerTypeArr = {bannerType, bannerType2, bannerType3};
        $VALUES = bannerTypeArr;
        $ENTRIES = kotlin.enums.a.a(bannerTypeArr);
    }

    public static BannerType valueOf(String str) {
        return (BannerType) Enum.valueOf(BannerType.class, str);
    }

    public static BannerType[] values() {
        return (BannerType[]) $VALUES.clone();
    }
}
