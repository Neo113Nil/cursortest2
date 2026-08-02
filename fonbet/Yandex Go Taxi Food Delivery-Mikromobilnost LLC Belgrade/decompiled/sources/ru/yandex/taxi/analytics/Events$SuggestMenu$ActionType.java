package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/analytics/Events$SuggestMenu$ActionType", "", "Lru/yandex/taxi/analytics/Events$SuggestMenu$ActionType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SELECT", "SAVE_TO_FAVORITES", "SELECT_ON_MAP", "CHANGE_ADDRESS", "SHARE_ADDRESS", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Events$SuggestMenu$ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Events$SuggestMenu$ActionType[] $VALUES;
    public static final Events$SuggestMenu$ActionType CHANGE_ADDRESS;
    public static final Events$SuggestMenu$ActionType SAVE_TO_FAVORITES;
    public static final Events$SuggestMenu$ActionType SELECT;
    public static final Events$SuggestMenu$ActionType SELECT_ON_MAP;
    public static final Events$SuggestMenu$ActionType SHARE_ADDRESS;
    private final String value;

    static {
        Events$SuggestMenu$ActionType events$SuggestMenu$ActionType = new Events$SuggestMenu$ActionType("SELECT", 0, "select");
        SELECT = events$SuggestMenu$ActionType;
        Events$SuggestMenu$ActionType events$SuggestMenu$ActionType2 = new Events$SuggestMenu$ActionType("SAVE_TO_FAVORITES", 1, "saveToFavorites");
        SAVE_TO_FAVORITES = events$SuggestMenu$ActionType2;
        Events$SuggestMenu$ActionType events$SuggestMenu$ActionType3 = new Events$SuggestMenu$ActionType("SELECT_ON_MAP", 2, "selectOnMap");
        SELECT_ON_MAP = events$SuggestMenu$ActionType3;
        Events$SuggestMenu$ActionType events$SuggestMenu$ActionType4 = new Events$SuggestMenu$ActionType("CHANGE_ADDRESS", 3, "change");
        CHANGE_ADDRESS = events$SuggestMenu$ActionType4;
        Events$SuggestMenu$ActionType events$SuggestMenu$ActionType5 = new Events$SuggestMenu$ActionType("SHARE_ADDRESS", 4, "share");
        SHARE_ADDRESS = events$SuggestMenu$ActionType5;
        Events$SuggestMenu$ActionType[] events$SuggestMenu$ActionTypeArr = {events$SuggestMenu$ActionType, events$SuggestMenu$ActionType2, events$SuggestMenu$ActionType3, events$SuggestMenu$ActionType4, events$SuggestMenu$ActionType5};
        $VALUES = events$SuggestMenu$ActionTypeArr;
        $ENTRIES = a.a(events$SuggestMenu$ActionTypeArr);
    }

    public Events$SuggestMenu$ActionType(String str, int i, String str2) {
        this.value = str2;
    }

    public static Events$SuggestMenu$ActionType valueOf(String str) {
        return (Events$SuggestMenu$ActionType) Enum.valueOf(Events$SuggestMenu$ActionType.class, str);
    }

    public static Events$SuggestMenu$ActionType[] values() {
        return (Events$SuggestMenu$ActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
