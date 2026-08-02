package ru.yandex.taxi.design.sourcedestination;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/design/sourcedestination/DestinationTrailMode;", "", JCP.RAW_PREFIX, "ADD_DESTINATION", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DestinationTrailMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DestinationTrailMode[] $VALUES;
    public static final DestinationTrailMode ADD_DESTINATION;
    public static final DestinationTrailMode NONE;

    static {
        DestinationTrailMode destinationTrailMode = new DestinationTrailMode(JCP.RAW_PREFIX, 0);
        NONE = destinationTrailMode;
        DestinationTrailMode destinationTrailMode2 = new DestinationTrailMode("ADD_DESTINATION", 1);
        ADD_DESTINATION = destinationTrailMode2;
        DestinationTrailMode[] destinationTrailModeArr = {destinationTrailMode, destinationTrailMode2};
        $VALUES = destinationTrailModeArr;
        $ENTRIES = a.a(destinationTrailModeArr);
    }

    public static DestinationTrailMode valueOf(String str) {
        return (DestinationTrailMode) Enum.valueOf(DestinationTrailMode.class, str);
    }

    public static DestinationTrailMode[] values() {
        return (DestinationTrailMode[]) $VALUES.clone();
    }
}
