package defpackage;

import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ya5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SubscriptionButtonType.values().length];
        try {
            iArr[SubscriptionButtonType.f20native.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionButtonType.web.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SubscriptionPaymentMethod.values().length];
        try {
            iArr2[SubscriptionPaymentMethod.trust.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SubscriptionPaymentMethod.inApp.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[SubscriptionWidgetType.values().length];
        try {
            iArr3[SubscriptionWidgetType.nativeWidget.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[SubscriptionWidgetType.webWidget.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[SubscriptionWidgetType.host.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[SubscriptionWidgetType.acquisitionPlatform.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
