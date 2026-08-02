package ru.yandex.taxi.logistics.childrouter.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/childrouter/api/Animation;", "", "COMMON", "SIDE_SLIDE", JCP.RAW_PREFIX, "sdk-delivery-child-router"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Animation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Animation[] $VALUES;
    public static final Animation COMMON;
    public static final Animation NONE;
    public static final Animation SIDE_SLIDE;

    static {
        Animation animation = new Animation("COMMON", 0);
        COMMON = animation;
        Animation animation2 = new Animation("SIDE_SLIDE", 1);
        SIDE_SLIDE = animation2;
        Animation animation3 = new Animation(JCP.RAW_PREFIX, 2);
        NONE = animation3;
        Animation[] animationArr = {animation, animation2, animation3};
        $VALUES = animationArr;
        $ENTRIES = a.a(animationArr);
    }

    public static Animation valueOf(String str) {
        return (Animation) Enum.valueOf(Animation.class, str);
    }

    public static Animation[] values() {
        return (Animation[]) $VALUES.clone();
    }
}
