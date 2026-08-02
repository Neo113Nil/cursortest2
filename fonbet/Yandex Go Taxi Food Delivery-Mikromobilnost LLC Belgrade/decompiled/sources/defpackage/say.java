package defpackage;

import com.yandex.pay.OrderId;
import com.yandex.pay.YPayResult;
import com.yandex.pay.payment.Metadata;
import com.yandex.pay.payment.YPayResult;

/* loaded from: classes2.dex */
public abstract class say {
    public static final YPayResult a(com.yandex.pay.payment.YPayResult yPayResult) {
        if (yPayResult instanceof YPayResult.Success) {
            YPayResult.Success success = (YPayResult.Success) yPayResult;
            OrderId orderId = new OrderId(success.getOrderId().getValue());
            Metadata metadata = success.getMetadata();
            return new YPayResult.Success(orderId, metadata != null ? new com.yandex.pay.Metadata(metadata.getValue()) : null);
        }
        if (yPayResult instanceof YPayResult.Failure) {
            YPayResult.Failure failure = (YPayResult.Failure) yPayResult;
            String errorMsg = failure.getErrorMsg();
            Metadata metadata2 = failure.getMetadata();
            return new YPayResult.Failure(errorMsg, metadata2 != null ? new com.yandex.pay.Metadata(metadata2.getValue()) : null);
        }
        if (yPayResult.equals(YPayResult.Cancelled.INSTANCE)) {
            return YPayResult.Cancelled.INSTANCE;
        }
        w511.b();
        return null;
    }
}
