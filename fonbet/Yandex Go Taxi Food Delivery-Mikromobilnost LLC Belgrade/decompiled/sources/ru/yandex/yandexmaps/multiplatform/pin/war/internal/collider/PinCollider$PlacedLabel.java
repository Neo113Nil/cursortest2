package ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/yandexmaps/multiplatform/pin/war/internal/collider/PinCollider$PlacedLabel", "", "Lru/yandex/yandexmaps/multiplatform/pin/war/internal/collider/PinCollider$PlacedLabel;", JCP.RAW_PREFIX, "LABEL_S", "LABEL_M", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinCollider$PlacedLabel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinCollider$PlacedLabel[] $VALUES;
    public static final PinCollider$PlacedLabel LABEL_M;
    public static final PinCollider$PlacedLabel LABEL_S;
    public static final PinCollider$PlacedLabel NONE;

    static {
        PinCollider$PlacedLabel pinCollider$PlacedLabel = new PinCollider$PlacedLabel(JCP.RAW_PREFIX, 0);
        NONE = pinCollider$PlacedLabel;
        PinCollider$PlacedLabel pinCollider$PlacedLabel2 = new PinCollider$PlacedLabel("LABEL_S", 1);
        LABEL_S = pinCollider$PlacedLabel2;
        PinCollider$PlacedLabel pinCollider$PlacedLabel3 = new PinCollider$PlacedLabel("LABEL_M", 2);
        LABEL_M = pinCollider$PlacedLabel3;
        PinCollider$PlacedLabel[] pinCollider$PlacedLabelArr = {pinCollider$PlacedLabel, pinCollider$PlacedLabel2, pinCollider$PlacedLabel3};
        $VALUES = pinCollider$PlacedLabelArr;
        $ENTRIES = kotlin.enums.a.a(pinCollider$PlacedLabelArr);
    }

    public static PinCollider$PlacedLabel valueOf(String str) {
        return (PinCollider$PlacedLabel) Enum.valueOf(PinCollider$PlacedLabel.class, str);
    }

    public static PinCollider$PlacedLabel[] values() {
        return (PinCollider$PlacedLabel[]) $VALUES.clone();
    }
}
