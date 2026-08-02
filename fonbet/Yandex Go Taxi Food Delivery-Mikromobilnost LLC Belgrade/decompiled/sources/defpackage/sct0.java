package defpackage;

import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class sct0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NewbiesRedesignPointsABExperiment.SummaryAddressStyle.values().length];
        try {
            iArr[NewbiesRedesignPointsABExperiment.SummaryAddressStyle.ONLY_CITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NewbiesRedesignPointsABExperiment.SummaryAddressStyle.CITY_WITH_ADDRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NewbiesRedesignPointsABExperiment.SummaryAddressStyle.CITY_WITH_ADDRESS_REVERSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
