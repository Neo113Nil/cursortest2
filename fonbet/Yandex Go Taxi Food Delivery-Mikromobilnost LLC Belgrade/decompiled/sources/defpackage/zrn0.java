package defpackage;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class zrn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.values().length];
        try {
            iArr[ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.PROMOTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.START_RIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
