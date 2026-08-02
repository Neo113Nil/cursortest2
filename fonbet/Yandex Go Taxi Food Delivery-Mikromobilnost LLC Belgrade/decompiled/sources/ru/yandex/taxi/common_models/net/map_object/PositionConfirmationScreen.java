package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ude0;
import defpackage.yud0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/PositionConfirmationScreen;", "", "Companion", "ude0", "MAIN", "SUMMARY", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PositionConfirmationScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PositionConfirmationScreen[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ude0 Companion;
    public static final PositionConfirmationScreen MAIN;
    public static final PositionConfirmationScreen SUMMARY;

    static {
        PositionConfirmationScreen positionConfirmationScreen = new PositionConfirmationScreen("MAIN", 0);
        MAIN = positionConfirmationScreen;
        PositionConfirmationScreen positionConfirmationScreen2 = new PositionConfirmationScreen("SUMMARY", 1);
        SUMMARY = positionConfirmationScreen2;
        PositionConfirmationScreen[] positionConfirmationScreenArr = {positionConfirmationScreen, positionConfirmationScreen2};
        $VALUES = positionConfirmationScreenArr;
        $ENTRIES = kotlin.enums.a.a(positionConfirmationScreenArr);
        Companion = new ude0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(28));
    }

    public static PositionConfirmationScreen valueOf(String str) {
        return (PositionConfirmationScreen) Enum.valueOf(PositionConfirmationScreen.class, str);
    }

    public static PositionConfirmationScreen[] values() {
        return (PositionConfirmationScreen[]) $VALUES.clone();
    }
}
