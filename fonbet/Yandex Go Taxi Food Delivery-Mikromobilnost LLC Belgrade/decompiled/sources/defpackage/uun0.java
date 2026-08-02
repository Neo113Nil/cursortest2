package defpackage;

import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class uun0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.values().length];
        try {
            iArr[ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.PROVIDER_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
