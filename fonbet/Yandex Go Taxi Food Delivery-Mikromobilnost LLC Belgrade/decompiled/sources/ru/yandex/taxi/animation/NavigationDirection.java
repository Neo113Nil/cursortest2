package ru.yandex.taxi.animation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/animation/NavigationDirection;", "", "FORWARD", "BACKWARD", "NO_ANIMATE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NavigationDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigationDirection[] $VALUES;
    public static final NavigationDirection BACKWARD;
    public static final NavigationDirection FORWARD;
    public static final NavigationDirection NO_ANIMATE;

    static {
        NavigationDirection navigationDirection = new NavigationDirection("FORWARD", 0);
        FORWARD = navigationDirection;
        NavigationDirection navigationDirection2 = new NavigationDirection("BACKWARD", 1);
        BACKWARD = navigationDirection2;
        NavigationDirection navigationDirection3 = new NavigationDirection("NO_ANIMATE", 2);
        NO_ANIMATE = navigationDirection3;
        NavigationDirection[] navigationDirectionArr = {navigationDirection, navigationDirection2, navigationDirection3};
        $VALUES = navigationDirectionArr;
        $ENTRIES = a.a(navigationDirectionArr);
    }

    public static NavigationDirection valueOf(String str) {
        return (NavigationDirection) Enum.valueOf(NavigationDirection.class, str);
    }

    public static NavigationDirection[] values() {
        return (NavigationDirection[]) $VALUES.clone();
    }
}
