package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/analytics/Events$Summary$SummaryState", "", "Lru/yandex/taxi/analytics/Events$Summary$SummaryState;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "COLLAPSED", "EXPANDED", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Events$Summary$SummaryState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Events$Summary$SummaryState[] $VALUES;
    public static final Events$Summary$SummaryState COLLAPSED;
    public static final Events$Summary$SummaryState EXPANDED;
    private final String value;

    static {
        Events$Summary$SummaryState events$Summary$SummaryState = new Events$Summary$SummaryState("COLLAPSED", 0, "collapsed");
        COLLAPSED = events$Summary$SummaryState;
        Events$Summary$SummaryState events$Summary$SummaryState2 = new Events$Summary$SummaryState("EXPANDED", 1, "expanded");
        EXPANDED = events$Summary$SummaryState2;
        Events$Summary$SummaryState[] events$Summary$SummaryStateArr = {events$Summary$SummaryState, events$Summary$SummaryState2};
        $VALUES = events$Summary$SummaryStateArr;
        $ENTRIES = a.a(events$Summary$SummaryStateArr);
    }

    public Events$Summary$SummaryState(String str, int i, String str2) {
        this.value = str2;
    }

    public static Events$Summary$SummaryState valueOf(String str) {
        return (Events$Summary$SummaryState) Enum.valueOf(Events$Summary$SummaryState.class, str);
    }

    public static Events$Summary$SummaryState[] values() {
        return (Events$Summary$SummaryState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
