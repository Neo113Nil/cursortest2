package defpackage;

import ru.yandex.taxi.masstransit.model.StopSelectionStage;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class r340 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StopSelectionStage.values().length];
        try {
            iArr[StopSelectionStage.SELECT_STARTING_STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StopSelectionStage.SELECT_DESTINATION_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
