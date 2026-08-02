package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.feature.qr.payments.internal.domain.v2.result.Funding;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vzj0 {
    public final v1v0 a;
    public final String b;
    public final gc5 c;
    public final ActionButtonEntity d;
    public final Funding e;

    public vzj0(v1v0 v1v0Var, String str, gc5 gc5Var, ActionButtonEntity actionButtonEntity, Funding funding) {
        this.a = v1v0Var;
        this.b = str;
        this.c = gc5Var;
        this.d = actionButtonEntity;
        this.e = funding;
    }

    public static vzj0 a(vzj0 vzj0Var, v1v0 v1v0Var) {
        String str = vzj0Var.b;
        gc5 gc5Var = vzj0Var.c;
        ActionButtonEntity actionButtonEntity = vzj0Var.d;
        Funding funding = vzj0Var.e;
        vzj0Var.getClass();
        return new vzj0(v1v0Var, str, gc5Var, actionButtonEntity, funding);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzj0)) {
            return false;
        }
        vzj0 vzj0Var = (vzj0) obj;
        return jl40.l(this.a, vzj0Var.a) && jl40.l(this.b, vzj0Var.b) && jl40.l(this.c, vzj0Var.c) && jl40.l(this.d, vzj0Var.d) && this.e == vzj0Var.e;
    }

    public final int hashCode() {
        v1v0 v1v0Var = this.a;
        int hashCode = (v1v0Var == null ? 0 : v1v0Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        gc5 gc5Var = this.c;
        int hashCode3 = (hashCode2 + (gc5Var == null ? 0 : gc5Var.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity = this.d;
        int hashCode4 = (hashCode3 + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        Funding funding = this.e;
        return hashCode4 + (funding != null ? funding.hashCode() : 0);
    }

    public final String toString() {
        return "ResultPaymentSuccessStatusDataEntity(subscriptionWidget=" + this.a + ", redirectLink=" + this.b + ", divData=" + this.c + ", button=" + this.d + ", funding=" + this.e + Extension.C_BRAKE;
    }
}
