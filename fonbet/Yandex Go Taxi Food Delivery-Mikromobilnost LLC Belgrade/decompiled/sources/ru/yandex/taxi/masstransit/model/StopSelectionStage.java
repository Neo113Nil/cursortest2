package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/model/StopSelectionStage;", "", "SELECT_STARTING_STOP", "SELECT_DESTINATION_STOP", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StopSelectionStage {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StopSelectionStage[] $VALUES;
    public static final StopSelectionStage SELECT_DESTINATION_STOP;
    public static final StopSelectionStage SELECT_STARTING_STOP;

    static {
        StopSelectionStage stopSelectionStage = new StopSelectionStage("SELECT_STARTING_STOP", 0);
        SELECT_STARTING_STOP = stopSelectionStage;
        StopSelectionStage stopSelectionStage2 = new StopSelectionStage("SELECT_DESTINATION_STOP", 1);
        SELECT_DESTINATION_STOP = stopSelectionStage2;
        StopSelectionStage[] stopSelectionStageArr = {stopSelectionStage, stopSelectionStage2};
        $VALUES = stopSelectionStageArr;
        $ENTRIES = kotlin.enums.a.a(stopSelectionStageArr);
    }

    public static StopSelectionStage valueOf(String str) {
        return (StopSelectionStage) Enum.valueOf(StopSelectionStage.class, str);
    }

    public static StopSelectionStage[] values() {
        return (StopSelectionStage[]) $VALUES.clone();
    }
}
