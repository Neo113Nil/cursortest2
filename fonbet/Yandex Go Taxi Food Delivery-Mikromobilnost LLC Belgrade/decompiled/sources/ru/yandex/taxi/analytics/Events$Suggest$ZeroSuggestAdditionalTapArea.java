package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea", "", "Lru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea;", "", "tapArea", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ITEM", "TRAIL", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Events$Suggest$ZeroSuggestAdditionalTapArea {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Events$Suggest$ZeroSuggestAdditionalTapArea[] $VALUES;
    public static final Events$Suggest$ZeroSuggestAdditionalTapArea ITEM;
    public static final Events$Suggest$ZeroSuggestAdditionalTapArea TRAIL;
    private final String tapArea;

    static {
        Events$Suggest$ZeroSuggestAdditionalTapArea events$Suggest$ZeroSuggestAdditionalTapArea = new Events$Suggest$ZeroSuggestAdditionalTapArea("ITEM", 0, "item");
        ITEM = events$Suggest$ZeroSuggestAdditionalTapArea;
        Events$Suggest$ZeroSuggestAdditionalTapArea events$Suggest$ZeroSuggestAdditionalTapArea2 = new Events$Suggest$ZeroSuggestAdditionalTapArea("TRAIL", 1, "trail");
        TRAIL = events$Suggest$ZeroSuggestAdditionalTapArea2;
        Events$Suggest$ZeroSuggestAdditionalTapArea[] events$Suggest$ZeroSuggestAdditionalTapAreaArr = {events$Suggest$ZeroSuggestAdditionalTapArea, events$Suggest$ZeroSuggestAdditionalTapArea2};
        $VALUES = events$Suggest$ZeroSuggestAdditionalTapAreaArr;
        $ENTRIES = a.a(events$Suggest$ZeroSuggestAdditionalTapAreaArr);
    }

    public Events$Suggest$ZeroSuggestAdditionalTapArea(String str, int i, String str2) {
        this.tapArea = str2;
    }

    public static Events$Suggest$ZeroSuggestAdditionalTapArea valueOf(String str) {
        return (Events$Suggest$ZeroSuggestAdditionalTapArea) Enum.valueOf(Events$Suggest$ZeroSuggestAdditionalTapArea.class, str);
    }

    public static Events$Suggest$ZeroSuggestAdditionalTapArea[] values() {
        return (Events$Suggest$ZeroSuggestAdditionalTapArea[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTapArea() {
        return this.tapArea;
    }
}
