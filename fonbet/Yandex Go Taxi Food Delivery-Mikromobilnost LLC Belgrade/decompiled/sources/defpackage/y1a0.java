package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y1a0 implements z1a0 {
    public final MoneyEntity a;
    public final SubscriptionInfoEntity b;
    public final String c;
    public final String d;

    public y1a0(MoneyEntity moneyEntity, SubscriptionInfoEntity subscriptionInfoEntity, String str, String str2) {
        this.a = moneyEntity;
        this.b = subscriptionInfoEntity;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1a0)) {
            return false;
        }
        y1a0 y1a0Var = (y1a0) obj;
        return jl40.l(this.a, y1a0Var.a) && this.b.equals(y1a0Var.b) && jl40.l(this.c, y1a0Var.c) && jl40.l(this.d, y1a0Var.d);
    }

    public final int hashCode() {
        MoneyEntity moneyEntity = this.a;
        int b = unr0.b((this.b.hashCode() + ((moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31)) * 31, 31, this.c);
        String str = this.d;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subscription(money=");
        sb.append(this.a);
        sb.append(", subscriptionInfo=");
        sb.append(this.b);
        sb.append(", qrcLink=");
        return g8e.r(sb, this.c, ", redirectLink=", this.d, Extension.C_BRAKE);
    }
}
