package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class w780 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
