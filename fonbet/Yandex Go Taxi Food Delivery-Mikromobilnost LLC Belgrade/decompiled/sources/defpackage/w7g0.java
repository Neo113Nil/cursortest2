package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.presentation.AmountScreenStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class w7g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AmountScreenStatus.values().length];
        try {
            iArr[AmountScreenStatus.SELECT_AGREEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AmountScreenStatus.EDIT_AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
