package ru.yandex.taxi.masstransit.trains.search;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/trains/search/SuggestType;", "", "SOURCE", "DESTINATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuggestType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestType[] $VALUES;
    public static final SuggestType DESTINATION;
    public static final SuggestType SOURCE;

    static {
        SuggestType suggestType = new SuggestType("SOURCE", 0);
        SOURCE = suggestType;
        SuggestType suggestType2 = new SuggestType("DESTINATION", 1);
        DESTINATION = suggestType2;
        SuggestType[] suggestTypeArr = {suggestType, suggestType2};
        $VALUES = suggestTypeArr;
        $ENTRIES = kotlin.enums.a.a(suggestTypeArr);
    }

    public static SuggestType valueOf(String str) {
        return (SuggestType) Enum.valueOf(SuggestType.class, str);
    }

    public static SuggestType[] values() {
        return (SuggestType[]) $VALUES.clone();
    }
}
