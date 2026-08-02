package defpackage;

import com.yandex.go.taxi.order.queue.presentation.QueueInitialState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class qkg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QueueInitialState.values().length];
        try {
            iArr[QueueInitialState.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QueueInitialState.CONFIRM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QueueInitialState.UPDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[QueueInitialState.CONFIRM_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
