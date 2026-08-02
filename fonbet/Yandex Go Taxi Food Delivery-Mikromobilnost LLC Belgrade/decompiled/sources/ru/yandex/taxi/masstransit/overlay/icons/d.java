package ru.yandex.taxi.masstransit.overlay.icons;

import ru.yandex.taxi.masstransit.overlay.icons.VehicleIconView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VehicleIconView.LabelDirection.values().length];
        try {
            iArr[VehicleIconView.LabelDirection.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VehicleIconView.LabelDirection.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VehicleIconView.LabelDirection.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VehicleIconView.LabelDirection.RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
