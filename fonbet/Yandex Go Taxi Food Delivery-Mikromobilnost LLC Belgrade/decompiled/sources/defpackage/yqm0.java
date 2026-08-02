package defpackage;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class yqm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersPassesFromScreen.values().length];
        try {
            iArr[ScootersPassesFromScreen.DISCOVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPassesFromScreen.OFFER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersPassesFromScreen.CHARGERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
