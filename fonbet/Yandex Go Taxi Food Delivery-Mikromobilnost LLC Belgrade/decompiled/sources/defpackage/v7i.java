package defpackage;

import ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition;
import ru.yandex.taxi.delivery.models.data.experiment.StepType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class v7i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SkipAlertCondition.values().length];
        try {
            iArr[SkipAlertCondition.REQUIREMENT_NOT_SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SkipAlertCondition.NEVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SkipAlertCondition.ALWAYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[StepType.values().length];
        try {
            iArr2[StepType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[StepType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
