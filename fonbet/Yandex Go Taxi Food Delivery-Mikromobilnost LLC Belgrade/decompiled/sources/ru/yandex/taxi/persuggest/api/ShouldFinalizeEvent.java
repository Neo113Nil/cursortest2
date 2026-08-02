package ru.yandex.taxi.persuggest.api;

import defpackage.b5s0;
import defpackage.dwq0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/persuggest/api/ShouldFinalizeEvent;", "", "Companion", "b5s0", "TARIFF_CHANGED", "REQUIREMENTS_CHANGES", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShouldFinalizeEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShouldFinalizeEvent[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final b5s0 Companion;
    public static final ShouldFinalizeEvent REQUIREMENTS_CHANGES;
    public static final ShouldFinalizeEvent TARIFF_CHANGED;

    static {
        ShouldFinalizeEvent shouldFinalizeEvent = new ShouldFinalizeEvent("TARIFF_CHANGED", 0);
        TARIFF_CHANGED = shouldFinalizeEvent;
        ShouldFinalizeEvent shouldFinalizeEvent2 = new ShouldFinalizeEvent("REQUIREMENTS_CHANGES", 1);
        REQUIREMENTS_CHANGES = shouldFinalizeEvent2;
        ShouldFinalizeEvent[] shouldFinalizeEventArr = {shouldFinalizeEvent, shouldFinalizeEvent2};
        $VALUES = shouldFinalizeEventArr;
        $ENTRIES = kotlin.enums.a.a(shouldFinalizeEventArr);
        Companion = new b5s0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(24));
    }

    public static ShouldFinalizeEvent valueOf(String str) {
        return (ShouldFinalizeEvent) Enum.valueOf(ShouldFinalizeEvent.class, str);
    }

    public static ShouldFinalizeEvent[] values() {
        return (ShouldFinalizeEvent[]) $VALUES.clone();
    }
}
