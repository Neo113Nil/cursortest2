package defpackage;

import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersMobilityHubFinishResolution;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class u5o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersMobilityHubFinishResolution.values().length];
        try {
            iArr[ScootersMobilityHubFinishResolution.CONTINUE_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersMobilityHubFinishResolution.DISMISS_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
