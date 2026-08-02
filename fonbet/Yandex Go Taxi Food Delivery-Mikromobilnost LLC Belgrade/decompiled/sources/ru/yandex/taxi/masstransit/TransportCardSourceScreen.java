package ru.yandex.taxi.masstransit;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/TransportCardSourceScreen;", "", "MAIN", "VERTICAL", "HUB", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportCardSourceScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportCardSourceScreen[] $VALUES;
    public static final TransportCardSourceScreen HUB;
    public static final TransportCardSourceScreen MAIN;
    public static final TransportCardSourceScreen VERTICAL;

    static {
        TransportCardSourceScreen transportCardSourceScreen = new TransportCardSourceScreen("MAIN", 0);
        MAIN = transportCardSourceScreen;
        TransportCardSourceScreen transportCardSourceScreen2 = new TransportCardSourceScreen("VERTICAL", 1);
        VERTICAL = transportCardSourceScreen2;
        TransportCardSourceScreen transportCardSourceScreen3 = new TransportCardSourceScreen("HUB", 2);
        HUB = transportCardSourceScreen3;
        TransportCardSourceScreen[] transportCardSourceScreenArr = {transportCardSourceScreen, transportCardSourceScreen2, transportCardSourceScreen3};
        $VALUES = transportCardSourceScreenArr;
        $ENTRIES = kotlin.enums.a.a(transportCardSourceScreenArr);
    }

    public static TransportCardSourceScreen valueOf(String str) {
        return (TransportCardSourceScreen) Enum.valueOf(TransportCardSourceScreen.class, str);
    }

    public static TransportCardSourceScreen[] values() {
        return (TransportCardSourceScreen[]) $VALUES.clone();
    }
}
