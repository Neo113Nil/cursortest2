package defpackage;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class tqn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersIgnitionExperiment.Ui.InfoItem.ActionType.values().length];
        try {
            iArr[ScootersIgnitionExperiment.Ui.InfoItem.ActionType.NO_ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersIgnitionExperiment.Ui.InfoItem.ActionType.PROMOTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersIgnitionExperiment.Ui.InfoItem.ActionType.LEGAL_TERMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersIgnitionExperiment.Ui.InfoItem.ActionType.BETA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
