package defpackage;

import com.yandex.go.zone.dto.objects.PopupUiControl;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xt6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PopupUiControl.OpenSummaryAddress.FocusField.values().length];
        try {
            iArr[PopupUiControl.OpenSummaryAddress.FocusField.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PopupUiControl.OpenSummaryAddress.FocusField.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PopupUiControl.OpenSummaryAddress.FocusField.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
