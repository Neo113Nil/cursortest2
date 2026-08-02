package defpackage;

import com.yandex.fintechsdk.data.payment.method.api.model.TokenizeMethod;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xnz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TokenizeMethod.values().length];
        try {
            iArr[TokenizeMethod.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
