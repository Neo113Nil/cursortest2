package defpackage;

import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wpy {
    public final RebindPaymentMethodStatusEntity a;
    public final String b;

    public wpy(RebindPaymentMethodStatusEntity rebindPaymentMethodStatusEntity, String str) {
        this.a = rebindPaymentMethodStatusEntity;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpy)) {
            return false;
        }
        wpy wpyVar = (wpy) obj;
        return this.a == wpyVar.a && jl40.l(this.b, wpyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LinkedPaymentEntity(status=" + this.a + ", paymentId=" + this.b + Extension.C_BRAKE;
    }
}
