package ru.yandex.taxi.deeplinks;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/deeplinks/DeeplinkSource;", "", "", "isInternal", "Z", "a", "()Z", "PUSH", "TOTW_COMMUNICATIONS", "PLACES", "UNSPECIFIED", "deeplinks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeeplinkSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeeplinkSource[] $VALUES;
    public static final DeeplinkSource PLACES;
    public static final DeeplinkSource PUSH;
    public static final DeeplinkSource TOTW_COMMUNICATIONS;
    public static final DeeplinkSource UNSPECIFIED;
    private final boolean isInternal;

    static {
        DeeplinkSource deeplinkSource = new DeeplinkSource("PUSH", 0, true);
        PUSH = deeplinkSource;
        DeeplinkSource deeplinkSource2 = new DeeplinkSource("TOTW_COMMUNICATIONS", 1, true);
        TOTW_COMMUNICATIONS = deeplinkSource2;
        DeeplinkSource deeplinkSource3 = new DeeplinkSource("PLACES", 2, true);
        PLACES = deeplinkSource3;
        DeeplinkSource deeplinkSource4 = new DeeplinkSource("UNSPECIFIED", 3, false);
        UNSPECIFIED = deeplinkSource4;
        DeeplinkSource[] deeplinkSourceArr = {deeplinkSource, deeplinkSource2, deeplinkSource3, deeplinkSource4};
        $VALUES = deeplinkSourceArr;
        $ENTRIES = kotlin.enums.a.a(deeplinkSourceArr);
    }

    public DeeplinkSource(String str, int i, boolean z) {
        this.isInternal = z;
    }

    public static DeeplinkSource valueOf(String str) {
        return (DeeplinkSource) Enum.valueOf(DeeplinkSource.class, str);
    }

    public static DeeplinkSource[] values() {
        return (DeeplinkSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsInternal() {
        return this.isInternal;
    }
}
