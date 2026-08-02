package ru.yandex.taxi.ui.api.car;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/ui/api/car/CarIconPart$Layer", "", "Lru/yandex/taxi/ui/api/car/CarIconPart$Layer;", "MASK", "SHADOW", "WARM_LIGHT", "SOFT_LIGHT", "HARD_LIGHT", "GLOSSY", "DETAILS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CarIconPart$Layer {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CarIconPart$Layer[] $VALUES;
    public static final CarIconPart$Layer DETAILS;
    public static final CarIconPart$Layer GLOSSY;
    public static final CarIconPart$Layer HARD_LIGHT;
    public static final CarIconPart$Layer MASK;
    public static final CarIconPart$Layer SHADOW;
    public static final CarIconPart$Layer SOFT_LIGHT;
    public static final CarIconPart$Layer WARM_LIGHT;

    static {
        CarIconPart$Layer carIconPart$Layer = new CarIconPart$Layer("MASK", 0);
        MASK = carIconPart$Layer;
        CarIconPart$Layer carIconPart$Layer2 = new CarIconPart$Layer("SHADOW", 1);
        SHADOW = carIconPart$Layer2;
        CarIconPart$Layer carIconPart$Layer3 = new CarIconPart$Layer("WARM_LIGHT", 2);
        WARM_LIGHT = carIconPart$Layer3;
        CarIconPart$Layer carIconPart$Layer4 = new CarIconPart$Layer("SOFT_LIGHT", 3);
        SOFT_LIGHT = carIconPart$Layer4;
        CarIconPart$Layer carIconPart$Layer5 = new CarIconPart$Layer("HARD_LIGHT", 4);
        HARD_LIGHT = carIconPart$Layer5;
        CarIconPart$Layer carIconPart$Layer6 = new CarIconPart$Layer("GLOSSY", 5);
        GLOSSY = carIconPart$Layer6;
        CarIconPart$Layer carIconPart$Layer7 = new CarIconPart$Layer("DETAILS", 6);
        DETAILS = carIconPart$Layer7;
        CarIconPart$Layer[] carIconPart$LayerArr = {carIconPart$Layer, carIconPart$Layer2, carIconPart$Layer3, carIconPart$Layer4, carIconPart$Layer5, carIconPart$Layer6, carIconPart$Layer7};
        $VALUES = carIconPart$LayerArr;
        $ENTRIES = a.a(carIconPart$LayerArr);
    }

    public static CarIconPart$Layer valueOf(String str) {
        return (CarIconPart$Layer) Enum.valueOf(CarIconPart$Layer.class, str);
    }

    public static CarIconPart$Layer[] values() {
        return (CarIconPart$Layer[]) $VALUES.clone();
    }
}
