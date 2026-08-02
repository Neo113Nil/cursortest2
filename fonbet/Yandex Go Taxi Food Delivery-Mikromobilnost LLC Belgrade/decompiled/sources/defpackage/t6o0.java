package defpackage;

import ru.yandex.taxi.scooters.data.model.EvolveState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class t6o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EvolveState.values().length];
        try {
            iArr[EvolveState.PARKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EvolveState.RIDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EvolveState.RESERVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
