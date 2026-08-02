package defpackage;

import com.yandex.go.dto.response.UnavailabilityAction$OpenSummaryAddress;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class vox0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UnavailabilityAction$OpenSummaryAddress.FocusField.values().length];
        try {
            iArr[UnavailabilityAction$OpenSummaryAddress.FocusField.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UnavailabilityAction$OpenSummaryAddress.FocusField.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UnavailabilityAction$OpenSummaryAddress.FocusField.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
