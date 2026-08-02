package ru.yandex.taxi.carplates.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ij7;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.s68;
import defpackage.xn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/carplates/experiments/CarPlateAppearanceExperiment;", "Lxn11;", "Companion", "CarPlateUsage", "s68", "r68", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CarPlateAppearanceExperiment implements xn11 {
    public static final s68 Companion = new s68();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(19))};
    public static final CarPlateAppearanceExperiment e = new CarPlateAppearanceExperiment(0);
    public final boolean b;
    public final jsq0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/carplates/experiments/CarPlateAppearanceExperiment$CarPlateUsage;", "", "Companion", "ru/yandex/taxi/carplates/experiments/a", "ORDER_LIST_ITEM", "SINGLE_ORDER_CARD", "STATE_BAR", "CAR_MAP_OBJECT", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class CarPlateUsage {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CarPlateUsage[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final CarPlateUsage CAR_MAP_OBJECT;
        public static final a Companion;
        public static final CarPlateUsage ORDER_LIST_ITEM;
        public static final CarPlateUsage SINGLE_ORDER_CARD;
        public static final CarPlateUsage STATE_BAR;

        static {
            CarPlateUsage carPlateUsage = new CarPlateUsage("ORDER_LIST_ITEM", 0);
            ORDER_LIST_ITEM = carPlateUsage;
            CarPlateUsage carPlateUsage2 = new CarPlateUsage("SINGLE_ORDER_CARD", 1);
            SINGLE_ORDER_CARD = carPlateUsage2;
            CarPlateUsage carPlateUsage3 = new CarPlateUsage("STATE_BAR", 2);
            STATE_BAR = carPlateUsage3;
            CarPlateUsage carPlateUsage4 = new CarPlateUsage("CAR_MAP_OBJECT", 3);
            CAR_MAP_OBJECT = carPlateUsage4;
            CarPlateUsage[] carPlateUsageArr = {carPlateUsage, carPlateUsage2, carPlateUsage3, carPlateUsage4};
            $VALUES = carPlateUsageArr;
            $ENTRIES = kotlin.enums.a.a(carPlateUsageArr);
            Companion = new a();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(20));
        }

        public static CarPlateUsage valueOf(String str) {
            return (CarPlateUsage) Enum.valueOf(CarPlateUsage.class, str);
        }

        public static CarPlateUsage[] values() {
            return (CarPlateUsage[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CarPlateAppearanceExperiment(int i, boolean z, jsq0 jsq0Var) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = ksq0.a;
        } else {
            this.c = jsq0Var;
        }
    }

    public CarPlateAppearanceExperiment() {
        this(0);
    }

    public CarPlateAppearanceExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = jsq0Var;
    }
}
