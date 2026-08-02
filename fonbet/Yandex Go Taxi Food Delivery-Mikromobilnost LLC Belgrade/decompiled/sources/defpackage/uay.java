package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.RequisiteTarget;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;

/* loaded from: classes3.dex */
public final class uay extends n15 {
    public final n4u0 x;
    public final TransferRequisiteScreenParams y;

    public uay(n4u0 n4u0Var, eg01 eg01Var, TransferRequisiteScreenParams transferRequisiteScreenParams, crj0 crj0Var) {
        super(0, n4u0Var, eg01Var, crj0Var);
        this.x = n4u0Var;
        this.y = transferRequisiteScreenParams;
    }

    @Override // defpackage.n15
    public final TransferRequisiteResultEntity g() {
        Boolean bool;
        n4u0 n4u0Var = this.x;
        dh90 dh90Var = ((zq01) n4u0Var.getValue()).a;
        ch90 ch90Var = dh90Var instanceof ch90 ? (ch90) dh90Var : null;
        if (ch90Var != null) {
            yg90 yg90Var = ch90Var.a;
            tq01 b = ((zq01) n4u0Var.getValue()).b();
            qq01 qq01Var = b instanceof qq01 ? (qq01) b : null;
            if (qq01Var != null) {
                String b2 = dtb1.b(qq01Var, ItemType.ACCOUNT_NUMBER);
                String b3 = dtb1.b(qq01Var, ItemType.BIC);
                String b4 = dtb1.b(qq01Var, ItemType.PAYMENT_PURPOSE);
                String b5 = dtb1.b(qq01Var, ItemType.INN);
                RequisiteTarget requisiteTarget = new RequisiteTarget(yg90Var.a, yg90Var.b);
                String b6 = dtb1.b(qq01Var, ItemType.BENEFICIARY_NAME);
                Object obj = qq01Var.b.get(ItemType.VAT);
                xqj0 xqj0Var = obj instanceof xqj0 ? (xqj0) obj : null;
                if (xqj0Var != null && (bool = xqj0Var.b) != null) {
                    boolean booleanValue = bool.booleanValue();
                    RequisitesLegalTransferPayloadEntity legalValidation = this.y.getRequisitePayload().getLegalValidation();
                    return new TransferRequisiteResultEntity.Legal(b5, b6, booleanValue, b2, b3, b4, requisiteTarget, legalValidation != null ? legalValidation.getDivkitWidget() : null);
                }
                x4c.g("[requisites] no chip selected on button click", null, null, null, 14);
            }
        }
        return null;
    }

    @Override // defpackage.n15
    public final boolean i(vqj0 vqj0Var) {
        return false;
    }
}
