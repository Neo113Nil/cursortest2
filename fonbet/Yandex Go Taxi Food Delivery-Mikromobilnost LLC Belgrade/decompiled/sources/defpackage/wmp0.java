package defpackage;

import com.yandex.go.yb.api.domain.model.YbActivationStatus;
import com.yandex.go.yb.domain.model.YbSdkEnvironment;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class wmp0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[YbSdkEnvironment.values().length];
        try {
            iArr[YbSdkEnvironment.DEV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbSdkEnvironment.PROD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[YbActivationStatus.values().length];
        try {
            iArr2[YbActivationStatus.WAITING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[YbActivationStatus.ACTIVATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[YbActivationStatus.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
