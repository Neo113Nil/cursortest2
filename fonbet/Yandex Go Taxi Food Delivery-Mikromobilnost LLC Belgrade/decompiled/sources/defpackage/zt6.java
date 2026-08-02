package defpackage;

import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.PopupUiControl;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class zt6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BulletsOrderPopup.HeaderAppearance.Type.values().length];
        try {
            iArr[BulletsOrderPopup.HeaderAppearance.Type.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BulletsOrderPopup.HeaderAppearance.Type.PROMINENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PopupUiControl.PopupUiControlType.values().length];
        try {
            iArr2[PopupUiControl.PopupUiControlType.BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PopupUiControl.PopupUiControlType.SLIDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
