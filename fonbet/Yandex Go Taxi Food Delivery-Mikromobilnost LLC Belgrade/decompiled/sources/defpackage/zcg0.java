package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.TryToRefreshEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zcg0 {
    public final TryToRefreshEntity.Header a;
    public final rbv b;
    public final Text c;
    public final Text d;
    public final ActionButtonEntity e;

    public zcg0(TryToRefreshEntity.Header header, rbv rbvVar, Text text, Text text2, ActionButtonEntity actionButtonEntity) {
        this.a = header;
        this.b = rbvVar;
        this.c = text;
        this.d = text2;
        this.e = actionButtonEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcg0)) {
            return false;
        }
        zcg0 zcg0Var = (zcg0) obj;
        return jl40.l(this.a, zcg0Var.a) && jl40.l(this.b, zcg0Var.b) && jl40.l(this.c, zcg0Var.c) && jl40.l(this.d, zcg0Var.d) && jl40.l(this.e, zcg0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        return this.e.hashCode() + n.c(this.d, n.c(this.c, (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrRefreshState(header=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        ly3.C(sb, this.c, ", description=", this.d, ", button=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
