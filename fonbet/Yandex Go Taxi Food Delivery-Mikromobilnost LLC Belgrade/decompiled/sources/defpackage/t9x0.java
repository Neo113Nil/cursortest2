package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ArBoxesSmartCameraAction$Intent;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class t9x0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TapAction$ArBoxesSmartCameraAction$Intent.values().length];
        try {
            iArr[TapAction$ArBoxesSmartCameraAction$Intent.ROTATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TapAction$ArBoxesSmartCameraAction$Intent.RESET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
