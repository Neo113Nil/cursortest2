package defpackage;

import com.yandex.go.taxi.order.models.api.car.CopyInfoType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class s48 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CopyInfoType.values().length];
        try {
            iArr[CopyInfoType.CAR_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CopyInfoType.CAR_MARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CopyInfoType.CAR_NUMBER_AND_MARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
