package defpackage;

import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.PlusWebMessagesDiagnostic$MessagesSource;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.PlusWebViewDiagnostic$WebViewSource;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class s42 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[PlusSdkBrandType.values().length];
        try {
            iArr[PlusSdkBrandType.YANDEX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusSdkBrandType.YANGO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusWebViewDiagnostic$WebViewSource.values().length];
        try {
            iArr2[PlusWebViewDiagnostic$WebViewSource.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PlusWebViewDiagnostic$WebViewSource.STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlusWebViewDiagnostic$WebViewSource.SIMPLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlusWebViewDiagnostic$WebViewSource.SMART.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[PlusWebMessagesDiagnostic$MessagesSource.values().length];
        try {
            iArr3[PlusWebMessagesDiagnostic$MessagesSource.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[PlusWebMessagesDiagnostic$MessagesSource.STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[PlusWebMessagesDiagnostic$MessagesSource.SMART.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[PlusPaymentStat$Source.values().length];
        try {
            iArr4[PlusPaymentStat$Source.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[PlusPaymentStat$Source.STORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
    }
}
