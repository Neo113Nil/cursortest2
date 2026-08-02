package defpackage;

import ru.yandex.taxi.masstransit.design.Direction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class v140 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Direction.values().length];
        try {
            iArr[Direction.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Direction.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Direction.NOT_CHANGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
