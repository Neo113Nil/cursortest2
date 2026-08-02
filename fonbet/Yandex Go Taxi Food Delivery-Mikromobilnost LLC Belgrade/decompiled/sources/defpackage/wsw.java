package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wsw {
    public final PaymentProviderEntity a;
    public final cuw b;
    public final PageHeaderEntity c;

    public wsw(PaymentProviderEntity paymentProviderEntity, cuw cuwVar, PageHeaderEntity pageHeaderEntity) {
        this.a = paymentProviderEntity;
        this.b = cuwVar;
        this.c = pageHeaderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsw)) {
            return false;
        }
        wsw wswVar = (wsw) obj;
        return this.a.equals(wswVar.a) && this.b.equals(wswVar.b) && this.c.equals(wswVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InternetPaymentFormInputEntity(provider=" + this.a + ", inputField=" + this.b + ", header=" + this.c + Extension.C_BRAKE;
    }
}
