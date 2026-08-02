package defpackage;

import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.yandex.go.design.compose.spinner.SpinnerState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xpt0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SpinnerState.values().length];
        try {
            iArr[SpinnerState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpinnerState.DONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpinnerState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SpinnerSize.values().length];
        try {
            iArr2[SpinnerSize.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SpinnerSize.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SpinnerSize.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
