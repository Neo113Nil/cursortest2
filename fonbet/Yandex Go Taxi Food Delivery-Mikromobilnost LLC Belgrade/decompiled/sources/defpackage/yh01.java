package defpackage;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class yh01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferRequirementExperiment.Card.FirstSelectableDate.values().length];
        try {
            iArr[TransferRequirementExperiment.Card.FirstSelectableDate.TODAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferRequirementExperiment.Card.FirstSelectableDate.YESTERDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
