package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class qzf0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SubscriptionConfiguration.Subscription.PaymentMethod.values().length];
        try {
            iArr[SubscriptionConfiguration.Subscription.PaymentMethod.NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionConfiguration.Subscription.PaymentMethod.IN_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionConfiguration.Subscription.PaymentMethod.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PurchaseTypeDto.values().length];
        try {
            iArr2[PurchaseTypeDto.HOST.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PurchaseTypeDto.DEPRECATED_HOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PurchaseTypeDto.INAPP.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PurchaseTypeDto.NATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PurchaseTypeDto.WEB.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PurchaseTypeDto.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[PlusPaySdkAdapter$CompositeOffer.StructureType.values().length];
        try {
            iArr3[PlusPaySdkAdapter$CompositeOffer.StructureType.TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[PlusPaySdkAdapter$CompositeOffer.StructureType.OPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[PlusPaySdkAdapter$CompositeOffer.StructureType.COMPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        c = iArr3;
    }
}
