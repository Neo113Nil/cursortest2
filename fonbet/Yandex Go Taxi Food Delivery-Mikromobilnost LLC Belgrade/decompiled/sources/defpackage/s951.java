package defpackage;

import androidx.work.WorkInfo$State;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class s951 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WorkInfo$State.values().length];
        try {
            iArr[WorkInfo$State.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WorkInfo$State.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WorkInfo$State.BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
