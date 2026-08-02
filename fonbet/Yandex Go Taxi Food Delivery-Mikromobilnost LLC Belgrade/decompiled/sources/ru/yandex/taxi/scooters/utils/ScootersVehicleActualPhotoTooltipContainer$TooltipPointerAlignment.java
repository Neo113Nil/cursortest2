package ru.yandex.taxi.scooters.utils;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/scooters/utils/ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment", "", "Lru/yandex/taxi/scooters/utils/ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment;", "START", "END", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment[] $VALUES;
    public static final ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment END;
    public static final ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment START;

    static {
        ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment = new ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment("START", 0);
        START = scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment;
        ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment2 = new ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment("END", 1);
        END = scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment2;
        ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment[] scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignmentArr = {scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment, scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment2};
        $VALUES = scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignmentArr;
        $ENTRIES = a.a(scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignmentArr);
    }

    public static ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment valueOf(String str) {
        return (ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment) Enum.valueOf(ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment.class, str);
    }

    public static ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment[] values() {
        return (ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment[]) $VALUES.clone();
    }
}
