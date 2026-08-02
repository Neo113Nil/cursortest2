package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ModalAction$ModalType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class s9x0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TapAction$ModalAction$ModalType.values().length];
        try {
            iArr[TapAction$ModalAction$ModalType.OVER_MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TapAction$ModalAction$ModalType.OVER_CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TapAction$ModalAction$ModalType.OVER_FORM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
