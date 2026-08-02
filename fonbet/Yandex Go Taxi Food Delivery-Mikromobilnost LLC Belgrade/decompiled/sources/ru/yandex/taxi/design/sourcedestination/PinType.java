package ru.yandex.taxi.design.sourcedestination;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/design/sourcedestination/PinType;", "", "SIMPLE", "PICKER", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PinType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinType[] $VALUES;
    public static final PinType PICKER;
    public static final PinType SIMPLE;

    static {
        PinType pinType = new PinType("SIMPLE", 0);
        SIMPLE = pinType;
        PinType pinType2 = new PinType("PICKER", 1);
        PICKER = pinType2;
        PinType[] pinTypeArr = {pinType, pinType2};
        $VALUES = pinTypeArr;
        $ENTRIES = a.a(pinTypeArr);
    }

    public static PinType valueOf(String str) {
        return (PinType) Enum.valueOf(PinType.class, str);
    }

    public static PinType[] values() {
        return (PinType[]) $VALUES.clone();
    }
}
