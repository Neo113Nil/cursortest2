package ru.yandex.taxi.delivery.models.data.experiment;

import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.oau0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/delivery/models/data/experiment/StepType;", "", "Companion", "oau0", "SOURCE", "DESTINATION", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StepType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StepType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final oau0 Companion;
    public static final StepType DESTINATION;
    public static final StepType SOURCE;

    static {
        StepType stepType = new StepType("SOURCE", 0);
        SOURCE = stepType;
        StepType stepType2 = new StepType("DESTINATION", 1);
        DESTINATION = stepType2;
        StepType[] stepTypeArr = {stepType, stepType2};
        $VALUES = stepTypeArr;
        $ENTRIES = a.a(stepTypeArr);
        Companion = new oau0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(10));
    }

    public static StepType valueOf(String str) {
        return (StepType) Enum.valueOf(StepType.class, str);
    }

    public static StepType[] values() {
        return (StepType[]) $VALUES.clone();
    }
}
