package defpackage;

import com.yandex.go.yb.data.model.YbCardStatusNotification$YbCardStatus;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class rq51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbCardStatusNotification$YbCardStatus.values().length];
        try {
            iArr[YbCardStatusNotification$YbCardStatus.OPENED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbCardStatusNotification$YbCardStatus.PROCCESING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
