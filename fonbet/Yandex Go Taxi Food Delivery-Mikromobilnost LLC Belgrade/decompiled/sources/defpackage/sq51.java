package defpackage;

import com.yandex.go.payments.data.model.YbCardDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sq51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbCardDto.YbCardType.values().length];
        try {
            iArr[YbCardDto.YbCardType.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbCardDto.YbCardType.PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YbCardDto.YbCardType.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[YbCardDto.YbCardType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
