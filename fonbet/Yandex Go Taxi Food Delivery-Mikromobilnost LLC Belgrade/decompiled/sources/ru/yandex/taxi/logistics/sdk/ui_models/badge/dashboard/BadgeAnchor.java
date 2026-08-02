package ru.yandex.taxi.logistics.sdk.ui_models.badge.dashboard;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui_models/badge/dashboard/BadgeAnchor;", "", "UPPER_RIGHT", "LOWER_RIGHT", "UPPER_LEFT", "LOWER_LEFT", "sdk-ui-models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BadgeAnchor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BadgeAnchor[] $VALUES;
    public static final BadgeAnchor LOWER_LEFT;
    public static final BadgeAnchor LOWER_RIGHT;
    public static final BadgeAnchor UPPER_LEFT;
    public static final BadgeAnchor UPPER_RIGHT;

    static {
        BadgeAnchor badgeAnchor = new BadgeAnchor("UPPER_RIGHT", 0);
        UPPER_RIGHT = badgeAnchor;
        BadgeAnchor badgeAnchor2 = new BadgeAnchor("LOWER_RIGHT", 1);
        LOWER_RIGHT = badgeAnchor2;
        BadgeAnchor badgeAnchor3 = new BadgeAnchor("UPPER_LEFT", 2);
        UPPER_LEFT = badgeAnchor3;
        BadgeAnchor badgeAnchor4 = new BadgeAnchor("LOWER_LEFT", 3);
        LOWER_LEFT = badgeAnchor4;
        BadgeAnchor[] badgeAnchorArr = {badgeAnchor, badgeAnchor2, badgeAnchor3, badgeAnchor4};
        $VALUES = badgeAnchorArr;
        $ENTRIES = a.a(badgeAnchorArr);
    }

    public static BadgeAnchor valueOf(String str) {
        return (BadgeAnchor) Enum.valueOf(BadgeAnchor.class, str);
    }

    public static BadgeAnchor[] values() {
        return (BadgeAnchor[]) $VALUES.clone();
    }
}
