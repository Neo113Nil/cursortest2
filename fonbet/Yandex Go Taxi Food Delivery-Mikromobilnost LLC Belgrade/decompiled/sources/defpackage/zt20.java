package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zt20 {
    public final PaymentProviderEntity a;
    public final ArrayList b;
    public final PageHeaderEntity c;

    public zt20(PaymentProviderEntity paymentProviderEntity, ArrayList arrayList, PageHeaderEntity pageHeaderEntity) {
        this.a = paymentProviderEntity;
        this.b = arrayList;
        this.c = pageHeaderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt20)) {
            return false;
        }
        zt20 zt20Var = (zt20) obj;
        return jl40.l(this.a, zt20Var.a) && this.b.equals(zt20Var.b) && this.c.equals(zt20Var.c);
    }

    public final int hashCode() {
        PaymentProviderEntity paymentProviderEntity = this.a;
        return this.c.hashCode() + ly3.b((paymentProviderEntity == null ? 0 : paymentProviderEntity.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "MobileProvidersListEntity(suggestedProvider=" + this.a + ", providers=" + this.b + ", header=" + this.c + Extension.C_BRAKE;
    }
}
