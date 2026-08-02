package ru.yandex.taxi.layers.api;

import defpackage.fet0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t5u0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/layers/api/StateRequirementsFailedType;", "", "Companion", "t5u0", "SELECTED_SCOOTER_UNAVAILABLE", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StateRequirementsFailedType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StateRequirementsFailedType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final t5u0 Companion;
    public static final StateRequirementsFailedType SELECTED_SCOOTER_UNAVAILABLE;

    static {
        StateRequirementsFailedType stateRequirementsFailedType = new StateRequirementsFailedType("SELECTED_SCOOTER_UNAVAILABLE", 0);
        SELECTED_SCOOTER_UNAVAILABLE = stateRequirementsFailedType;
        StateRequirementsFailedType[] stateRequirementsFailedTypeArr = {stateRequirementsFailedType};
        $VALUES = stateRequirementsFailedTypeArr;
        $ENTRIES = a.a(stateRequirementsFailedTypeArr);
        Companion = new t5u0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(20));
    }

    public static StateRequirementsFailedType valueOf(String str) {
        return (StateRequirementsFailedType) Enum.valueOf(StateRequirementsFailedType.class, str);
    }

    public static StateRequirementsFailedType[] values() {
        return (StateRequirementsFailedType[]) $VALUES.clone();
    }
}
