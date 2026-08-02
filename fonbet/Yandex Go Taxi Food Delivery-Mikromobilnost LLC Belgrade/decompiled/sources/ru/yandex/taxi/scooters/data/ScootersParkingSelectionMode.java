package ru.yandex.taxi.scooters.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersParkingSelectionMode;", "", "", "modeName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FINISH_RIDE_NEAREST", "PRESELECTED", "FIX", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersParkingSelectionMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersParkingSelectionMode[] $VALUES;
    public static final ScootersParkingSelectionMode FINISH_RIDE_NEAREST;
    public static final ScootersParkingSelectionMode FIX;
    public static final ScootersParkingSelectionMode PRESELECTED;
    private final String modeName;

    static {
        ScootersParkingSelectionMode scootersParkingSelectionMode = new ScootersParkingSelectionMode("FINISH_RIDE_NEAREST", 0, "finish_ride_nearest");
        FINISH_RIDE_NEAREST = scootersParkingSelectionMode;
        ScootersParkingSelectionMode scootersParkingSelectionMode2 = new ScootersParkingSelectionMode("PRESELECTED", 1, "preselected");
        PRESELECTED = scootersParkingSelectionMode2;
        ScootersParkingSelectionMode scootersParkingSelectionMode3 = new ScootersParkingSelectionMode("FIX", 2, "fix");
        FIX = scootersParkingSelectionMode3;
        ScootersParkingSelectionMode[] scootersParkingSelectionModeArr = {scootersParkingSelectionMode, scootersParkingSelectionMode2, scootersParkingSelectionMode3};
        $VALUES = scootersParkingSelectionModeArr;
        $ENTRIES = kotlin.enums.a.a(scootersParkingSelectionModeArr);
    }

    public ScootersParkingSelectionMode(String str, int i, String str2) {
        this.modeName = str2;
    }

    public static ScootersParkingSelectionMode valueOf(String str) {
        return (ScootersParkingSelectionMode) Enum.valueOf(ScootersParkingSelectionMode.class, str);
    }

    public static ScootersParkingSelectionMode[] values() {
        return (ScootersParkingSelectionMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getModeName() {
        return this.modeName;
    }
}
