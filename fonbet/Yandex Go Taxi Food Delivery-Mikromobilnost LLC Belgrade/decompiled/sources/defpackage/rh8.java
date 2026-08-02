package defpackage;

import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class rh8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TextFieldNameForAnalytics.values().length];
        try {
            iArr[TextFieldNameForAnalytics.CARD_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldNameForAnalytics.EXPIRATION_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextFieldNameForAnalytics.CVN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextFieldNameForAnalytics.EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TextFieldNameForAnalytics.SCANNER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[CardInputMode.values().length];
        try {
            iArr2[CardInputMode.BindOnly.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CardInputMode.PayAndBind.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
