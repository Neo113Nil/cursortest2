package ru.yandex.taxi.preorder.tollroad.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/preorder/tollroad/data/TollRoadDialogExperimentProvider$RoadMode", "", "Lru/yandex/taxi/preorder/tollroad/data/TollRoadDialogExperimentProvider$RoadMode;", "SINGLE_ROAD", "MULTIPLE_ROAD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadDialogExperimentProvider$RoadMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadDialogExperimentProvider$RoadMode[] $VALUES;
    public static final TollRoadDialogExperimentProvider$RoadMode MULTIPLE_ROAD;
    public static final TollRoadDialogExperimentProvider$RoadMode SINGLE_ROAD;

    static {
        TollRoadDialogExperimentProvider$RoadMode tollRoadDialogExperimentProvider$RoadMode = new TollRoadDialogExperimentProvider$RoadMode("SINGLE_ROAD", 0);
        SINGLE_ROAD = tollRoadDialogExperimentProvider$RoadMode;
        TollRoadDialogExperimentProvider$RoadMode tollRoadDialogExperimentProvider$RoadMode2 = new TollRoadDialogExperimentProvider$RoadMode("MULTIPLE_ROAD", 1);
        MULTIPLE_ROAD = tollRoadDialogExperimentProvider$RoadMode2;
        TollRoadDialogExperimentProvider$RoadMode[] tollRoadDialogExperimentProvider$RoadModeArr = {tollRoadDialogExperimentProvider$RoadMode, tollRoadDialogExperimentProvider$RoadMode2};
        $VALUES = tollRoadDialogExperimentProvider$RoadModeArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadDialogExperimentProvider$RoadModeArr);
    }

    public static TollRoadDialogExperimentProvider$RoadMode valueOf(String str) {
        return (TollRoadDialogExperimentProvider$RoadMode) Enum.valueOf(TollRoadDialogExperimentProvider$RoadMode.class, str);
    }

    public static TollRoadDialogExperimentProvider$RoadMode[] values() {
        return (TollRoadDialogExperimentProvider$RoadMode[]) $VALUES.clone();
    }
}
