package ru.yandex.taxi.masstransit.trains.schedule.dto;

import defpackage.ez30;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z530;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/trains/schedule/dto/MtScheduleScenario;", "", "Companion", "ez30", "V1", "V2", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtScheduleScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtScheduleScenario[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ez30 Companion;
    public static final MtScheduleScenario UNKNOWN;
    public static final MtScheduleScenario V1;
    public static final MtScheduleScenario V2;

    static {
        MtScheduleScenario mtScheduleScenario = new MtScheduleScenario("V1", 0);
        V1 = mtScheduleScenario;
        MtScheduleScenario mtScheduleScenario2 = new MtScheduleScenario("V2", 1);
        V2 = mtScheduleScenario2;
        MtScheduleScenario mtScheduleScenario3 = new MtScheduleScenario("UNKNOWN", 2);
        UNKNOWN = mtScheduleScenario3;
        MtScheduleScenario[] mtScheduleScenarioArr = {mtScheduleScenario, mtScheduleScenario2, mtScheduleScenario3};
        $VALUES = mtScheduleScenarioArr;
        $ENTRIES = a.a(mtScheduleScenarioArr);
        Companion = new ez30();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(13));
    }

    public static MtScheduleScenario valueOf(String str) {
        return (MtScheduleScenario) Enum.valueOf(MtScheduleScenario.class, str);
    }

    public static MtScheduleScenario[] values() {
        return (MtScheduleScenario[]) $VALUES.clone();
    }
}
