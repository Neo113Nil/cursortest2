package ru.yandex.taxi.masstransit.overlay.icons;

import ru.yandex.taxi.masstransit.model.VariantStyle;
import ru.yandex.taxi.masstransit.overlay.icons.VehicleIconView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[VariantStyle.VariantType.values().length];
        try {
            iArr[VariantStyle.VariantType.VEHICLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VariantStyle.VariantType.MARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VariantStyle.VariantType.DOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VariantStyle.VariantType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[VehicleIconView.LabelDirection.values().length];
        try {
            iArr2[VehicleIconView.LabelDirection.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[VehicleIconView.LabelDirection.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[VehicleIconView.LabelDirection.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[VehicleIconView.LabelDirection.UP.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
