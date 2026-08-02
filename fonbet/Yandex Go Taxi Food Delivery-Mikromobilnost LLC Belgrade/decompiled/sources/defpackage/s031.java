package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s031 implements u031 {
    public final hfb A;
    public final rvz0 a;
    public final TransferResultPageEntity b;
    public final TransferResultPageEntity c;
    public final UnconditionalLimitWidgetEntity w;
    public final String x;
    public final rr51 y;
    public final p39 z;

    public s031(rvz0 rvz0Var, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity, String str, rr51 rr51Var, p39 p39Var, hfb hfbVar) {
        this.a = rvz0Var;
        this.b = transferResultPageEntity;
        this.c = transferResultPageEntity2;
        this.w = unconditionalLimitWidgetEntity;
        this.x = str;
        this.y = rr51Var;
        this.z = p39Var;
        this.A = hfbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s031)) {
            return false;
        }
        s031 s031Var = (s031) obj;
        return jl40.l(this.a, s031Var.a) && jl40.l(this.b, s031Var.b) && jl40.l(this.c, s031Var.c) && jl40.l(this.w, s031Var.w) && jl40.l(this.x, s031Var.x) && jl40.l(this.y, s031Var.y) && jl40.l(this.z, s031Var.z) && jl40.l(this.A, s031Var.A);
    }

    public final int hashCode() {
        rvz0 rvz0Var = this.a;
        int hashCode = (this.b.hashCode() + ((rvz0Var == null ? 0 : rvz0Var.hashCode()) * 31)) * 31;
        TransferResultPageEntity transferResultPageEntity = this.c;
        int hashCode2 = (hashCode + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.w;
        int b = unr0.b((hashCode2 + (unconditionalLimitWidgetEntity == null ? 0 : unconditionalLimitWidgetEntity.hashCode())) * 31, 31, this.x);
        rr51 rr51Var = this.y;
        int hashCode3 = (b + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        p39 p39Var = this.z;
        int hashCode4 = (hashCode3 + (p39Var == null ? 0 : p39Var.hashCode())) * 31;
        hfb hfbVar = this.A;
        return hashCode4 + (hfbVar != null ? hfbVar.hashCode() : 0);
    }

    public final String toString() {
        return "TransferAllowed(tooltip=" + this.a + ", resultPage=" + this.b + ", timeoutResultPage=" + this.c + ", widget=" + this.w + ", checkId=" + this.x + ", shutterPayload=" + this.y + ", cashback=" + this.z + ", crossBorderData=" + this.A + Extension.C_BRAKE;
    }
}
