package ru.yandex.tankerapp.models.results;

import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.jl40;
import defpackage.ysq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/tankerapp/models/results/PaymentKitDataResult;", "Landroid/os/Parcelable;", "T", "Ljava/io/Serializable;", Constants.KEY_DATA, "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", ACSPConstants.STATUS, "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Landroid/os/Parcelable;Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "Landroid/os/Parcelable;", "a", "()Landroid/os/Parcelable;", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "c", "()Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "b", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitDataResult<T extends Parcelable> implements Serializable {

    @ysq0(Constants.KEY_DATA)
    private final T data;

    @ysq0("error")
    private final PaymentKitError error;

    @ysq0(ACSPConstants.STATUS)
    private final PaymentKitStatusResult status;

    public PaymentKitDataResult(T t, PaymentKitStatusResult paymentKitStatusResult, PaymentKitError paymentKitError) {
        this.data = t;
        this.status = paymentKitStatusResult;
        this.error = paymentKitError;
    }

    /* renamed from: a, reason: from getter */
    public final Parcelable getData() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final PaymentKitError getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final PaymentKitStatusResult getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitDataResult)) {
            return false;
        }
        PaymentKitDataResult paymentKitDataResult = (PaymentKitDataResult) obj;
        return jl40.l(this.data, paymentKitDataResult.data) && this.status == paymentKitDataResult.status && jl40.l(this.error, paymentKitDataResult.error);
    }

    public final int hashCode() {
        T t = this.data;
        int hashCode = (this.status.hashCode() + ((t == null ? 0 : t.hashCode()) * 31)) * 31;
        PaymentKitError paymentKitError = this.error;
        return hashCode + (paymentKitError != null ? paymentKitError.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentKitDataResult(data=" + this.data + ", status=" + this.status + ", error=" + this.error + Extension.C_BRAKE;
    }
}
