package ru.yandex.taxi.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/plaque/api/models/PlaqueModel$TabletPlaqueModel$Notification$Position", "", "Lru/yandex/taxi/plaque/api/models/PlaqueModel$TabletPlaqueModel$Notification$Position;", "LEFT", "RIGHT", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaqueModel$TabletPlaqueModel$Notification$Position {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaqueModel$TabletPlaqueModel$Notification$Position[] $VALUES;
    public static final PlaqueModel$TabletPlaqueModel$Notification$Position LEFT;
    public static final PlaqueModel$TabletPlaqueModel$Notification$Position RIGHT;

    static {
        PlaqueModel$TabletPlaqueModel$Notification$Position plaqueModel$TabletPlaqueModel$Notification$Position = new PlaqueModel$TabletPlaqueModel$Notification$Position("LEFT", 0);
        LEFT = plaqueModel$TabletPlaqueModel$Notification$Position;
        PlaqueModel$TabletPlaqueModel$Notification$Position plaqueModel$TabletPlaqueModel$Notification$Position2 = new PlaqueModel$TabletPlaqueModel$Notification$Position("RIGHT", 1);
        RIGHT = plaqueModel$TabletPlaqueModel$Notification$Position2;
        PlaqueModel$TabletPlaqueModel$Notification$Position[] plaqueModel$TabletPlaqueModel$Notification$PositionArr = {plaqueModel$TabletPlaqueModel$Notification$Position, plaqueModel$TabletPlaqueModel$Notification$Position2};
        $VALUES = plaqueModel$TabletPlaqueModel$Notification$PositionArr;
        $ENTRIES = a.a(plaqueModel$TabletPlaqueModel$Notification$PositionArr);
    }

    public static PlaqueModel$TabletPlaqueModel$Notification$Position valueOf(String str) {
        return (PlaqueModel$TabletPlaqueModel$Notification$Position) Enum.valueOf(PlaqueModel$TabletPlaqueModel$Notification$Position.class, str);
    }

    public static PlaqueModel$TabletPlaqueModel$Notification$Position[] values() {
        return (PlaqueModel$TabletPlaqueModel$Notification$Position[]) $VALUES.clone();
    }
}
