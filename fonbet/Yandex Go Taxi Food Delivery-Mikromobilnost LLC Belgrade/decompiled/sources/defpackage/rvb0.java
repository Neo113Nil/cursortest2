package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinCollider$PlacedLabel;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class rvb0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PinCollider$PlacedLabel.values().length];
        try {
            iArr[PinCollider$PlacedLabel.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinCollider$PlacedLabel.LABEL_S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinCollider$PlacedLabel.LABEL_M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PinState.values().length];
        try {
            iArr2[PinState.ICON_LABEL_S.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PinState.ICON_LABEL_M.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
