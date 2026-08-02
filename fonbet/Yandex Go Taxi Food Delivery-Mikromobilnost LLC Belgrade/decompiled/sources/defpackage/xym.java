package defpackage;

import com.yandex.go.due_timetable.experiment.model.TimetableMainAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xym {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimetableMainAction.values().length];
        try {
            iArr[TimetableMainAction.PROCEED_TO_SUMMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimetableMainAction.CONFIRM_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
