package ru.yandex.taxi.communications.stories.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/stories/data/StoriesState;", "", "GONE", "AT_TOP", "AT_BOTTOM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StoriesState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StoriesState[] $VALUES;
    public static final StoriesState AT_BOTTOM;
    public static final StoriesState AT_TOP;
    public static final StoriesState GONE;

    static {
        StoriesState storiesState = new StoriesState("GONE", 0);
        GONE = storiesState;
        StoriesState storiesState2 = new StoriesState("AT_TOP", 1);
        AT_TOP = storiesState2;
        StoriesState storiesState3 = new StoriesState("AT_BOTTOM", 2);
        AT_BOTTOM = storiesState3;
        StoriesState[] storiesStateArr = {storiesState, storiesState2, storiesState3};
        $VALUES = storiesStateArr;
        $ENTRIES = a.a(storiesStateArr);
    }

    public static StoriesState valueOf(String str) {
        return (StoriesState) Enum.valueOf(StoriesState.class, str);
    }

    public static StoriesState[] values() {
        return (StoriesState[]) $VALUES.clone();
    }
}
