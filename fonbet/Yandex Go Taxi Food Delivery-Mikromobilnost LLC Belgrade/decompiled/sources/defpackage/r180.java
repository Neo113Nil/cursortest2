package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class r180 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.SEARCH.ordinal()] = 1;
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
        try {
            iArr[DriveState.CHECK_IN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
