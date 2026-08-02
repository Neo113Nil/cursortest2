package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import com.yandex.go.payments.paymentlist.ui.PlusOption$TrailMode;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class zca0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentOptionState.values().length];
        try {
            iArr[PaymentOptionState.SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentOptionState.UNSELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentOptionState.CLICKABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentOptionState.DELETABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentOptionState.DELETABLE_WITH_EDIT_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentOptionState.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusOption$TrailMode.values().length];
        try {
            iArr2[PlusOption$TrailMode.TOGGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PlusOption$TrailMode.ARROW.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
