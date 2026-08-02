package defpackage;

import com.yandex.go.payments.data.model.YbCardDto;
import com.yandex.go.payments.payment.YbWalletPayment$YandexType;

/* loaded from: classes13.dex */
public abstract class tq51 {
    public static final YbWalletPayment$YandexType a(YbCardDto.YbCardType ybCardType) {
        int i = sq51.a[ybCardType.ordinal()];
        if (i == 1) {
            return YbWalletPayment$YandexType.PRO;
        }
        if (i == 2) {
            return YbWalletPayment$YandexType.PAY;
        }
        if (i == 3) {
            return YbWalletPayment$YandexType.SPLIT;
        }
        if (i == 4) {
            return null;
        }
        w511.b();
        return null;
    }
}
