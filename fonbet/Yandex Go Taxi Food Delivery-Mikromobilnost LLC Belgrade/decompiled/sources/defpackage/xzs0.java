package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class xzs0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.TRANSPORTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveState.DRIVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DriveState.WAITING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
