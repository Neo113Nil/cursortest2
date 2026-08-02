package ru.yandex.taxi.scooters.data.model;

import defpackage.cao;
import defpackage.gsq0;
import defpackage.hjo;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/data/model/EvolveState;", "", "Companion", "hjo", "RESERVATION", "PARKING", "RIDING", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EvolveState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvolveState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final hjo Companion;
    public static final EvolveState PARKING;
    public static final EvolveState RESERVATION;
    public static final EvolveState RIDING;

    static {
        EvolveState evolveState = new EvolveState("RESERVATION", 0);
        RESERVATION = evolveState;
        EvolveState evolveState2 = new EvolveState("PARKING", 1);
        PARKING = evolveState2;
        EvolveState evolveState3 = new EvolveState("RIDING", 2);
        RIDING = evolveState3;
        EvolveState[] evolveStateArr = {evolveState, evolveState2, evolveState3};
        $VALUES = evolveStateArr;
        $ENTRIES = a.a(evolveStateArr);
        Companion = new hjo();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cao(12));
    }

    public static EvolveState valueOf(String str) {
        return (EvolveState) Enum.valueOf(EvolveState.class, str);
    }

    public static EvolveState[] values() {
        return (EvolveState[]) $VALUES.clone();
    }
}
