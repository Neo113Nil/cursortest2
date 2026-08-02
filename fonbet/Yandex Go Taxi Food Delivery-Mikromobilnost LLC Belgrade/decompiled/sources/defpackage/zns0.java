package defpackage;

import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class zns0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NavigationDirection.values().length];
        try {
            iArr[NavigationDirection.FORWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigationDirection.BACKWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
