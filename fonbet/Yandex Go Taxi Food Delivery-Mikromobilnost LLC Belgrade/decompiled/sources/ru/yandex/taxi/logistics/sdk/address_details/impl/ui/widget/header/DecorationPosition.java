package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.header;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/address_details/impl/ui/widget/header/DecorationPosition;", "", "START", "END", "sdk-address-details"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DecorationPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DecorationPosition[] $VALUES;
    public static final DecorationPosition END;
    public static final DecorationPosition START;

    static {
        DecorationPosition decorationPosition = new DecorationPosition("START", 0);
        START = decorationPosition;
        DecorationPosition decorationPosition2 = new DecorationPosition("END", 1);
        END = decorationPosition2;
        DecorationPosition[] decorationPositionArr = {decorationPosition, decorationPosition2};
        $VALUES = decorationPositionArr;
        $ENTRIES = kotlin.enums.a.a(decorationPositionArr);
    }

    public static DecorationPosition valueOf(String str) {
        return (DecorationPosition) Enum.valueOf(DecorationPosition.class, str);
    }

    public static DecorationPosition[] values() {
        return (DecorationPosition[]) $VALUES.clone();
    }
}
