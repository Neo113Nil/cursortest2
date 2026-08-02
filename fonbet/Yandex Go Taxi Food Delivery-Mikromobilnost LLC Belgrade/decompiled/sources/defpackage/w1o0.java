package defpackage;

import com.yandex.go.scooters.domain.ScootersBeginnerInteractor$ShowForBeginner;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class w1o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersBeginnerInteractor$ShowForBeginner.values().length];
        try {
            iArr[ScootersBeginnerInteractor$ShowForBeginner.SHOW_ONBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersBeginnerInteractor$ShowForBeginner.SHOW_AGREEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersBeginnerInteractor$ShowForBeginner.SHOW_ONBOARDING_AND_AGREEMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersBeginnerInteractor$ShowForBeginner.NOTHING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
