package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class qvb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinState.values().length];
        try {
            iArr[PinState.DUST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinState.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinState.CLUSTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinState.SUPERCLUSTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
