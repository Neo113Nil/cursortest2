package defpackage;

import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffView$LayoutConfig$Appearance;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffView$LayoutConfig$WidthSpec;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class v5p0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersTariffView$LayoutConfig$Appearance.values().length];
        try {
            iArr[ScootersTariffView$LayoutConfig$Appearance.AS_SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersTariffView$LayoutConfig$Appearance.AS_ONE_OF_MANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersTariffView$LayoutConfig$WidthSpec.values().length];
        try {
            iArr2[ScootersTariffView$LayoutConfig$WidthSpec.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScootersTariffView$LayoutConfig$WidthSpec.HALF.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScootersTariffView$LayoutConfig$WidthSpec.BY_CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
