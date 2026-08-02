package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferListItemData$PartnerWithAction$Status;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.domain.entities.PartnerWithActionEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wi01 extends aj01 {
    public final PartnerWithActionEntity a;
    public final TransferListItemData$PartnerWithAction$Status b;

    public wi01(PartnerWithActionEntity partnerWithActionEntity, TransferListItemData$PartnerWithAction$Status transferListItemData$PartnerWithAction$Status) {
        this.a = partnerWithActionEntity;
        this.b = transferListItemData$PartnerWithAction$Status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi01)) {
            return false;
        }
        wi01 wi01Var = (wi01) obj;
        return jl40.l(this.a, wi01Var.a) && this.b == wi01Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PartnerWithAction(partner=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
