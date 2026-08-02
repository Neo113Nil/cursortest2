package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.CardNetwork;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class w6q0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardNetwork.values().length];
        try {
            iArr[CardNetwork.MIR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardNetwork.MASTERCARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardNetwork.UNIONPAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardNetwork.VISA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
