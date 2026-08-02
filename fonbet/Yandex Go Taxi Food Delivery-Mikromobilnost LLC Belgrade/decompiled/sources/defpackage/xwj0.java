package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class xwj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayWebSuccessScreenParams.PageTheme.values().length];
        try {
            iArr[PlusPayWebSuccessScreenParams.PageTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayWebSuccessScreenParams.PageTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
