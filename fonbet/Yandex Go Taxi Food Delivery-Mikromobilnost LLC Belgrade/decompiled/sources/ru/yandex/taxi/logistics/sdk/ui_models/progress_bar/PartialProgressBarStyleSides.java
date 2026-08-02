package ru.yandex.taxi.logistics.sdk.ui_models.progress_bar;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui_models/progress_bar/PartialProgressBarStyleSides;", "", "ROUNDED", "SQUARE", "sdk-ui-models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartialProgressBarStyleSides {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PartialProgressBarStyleSides[] $VALUES;
    public static final PartialProgressBarStyleSides ROUNDED;
    public static final PartialProgressBarStyleSides SQUARE;

    static {
        PartialProgressBarStyleSides partialProgressBarStyleSides = new PartialProgressBarStyleSides("ROUNDED", 0);
        ROUNDED = partialProgressBarStyleSides;
        PartialProgressBarStyleSides partialProgressBarStyleSides2 = new PartialProgressBarStyleSides("SQUARE", 1);
        SQUARE = partialProgressBarStyleSides2;
        PartialProgressBarStyleSides[] partialProgressBarStyleSidesArr = {partialProgressBarStyleSides, partialProgressBarStyleSides2};
        $VALUES = partialProgressBarStyleSidesArr;
        $ENTRIES = a.a(partialProgressBarStyleSidesArr);
    }

    public static PartialProgressBarStyleSides valueOf(String str) {
        return (PartialProgressBarStyleSides) Enum.valueOf(PartialProgressBarStyleSides.class, str);
    }

    public static PartialProgressBarStyleSides[] values() {
        return (PartialProgressBarStyleSides[]) $VALUES.clone();
    }
}
