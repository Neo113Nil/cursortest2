package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.e;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.CashLikeAccount;
import com.yandex.go.payments.data.model.response.ComplementWallet;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.JazzcashWallet;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.SbpToken;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.TransportExternalPaymentMethod;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.data.model.response.y1;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.exceptions.EbsVerificationEbsException;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes6.dex */
public abstract class sa91 {
    public static final lv90 a(k2a0 k2a0Var) {
        e4a0 e4a0Var;
        kv90 kv90Var = lv90.Companion;
        if (k2a0Var instanceof Card) {
            e4a0Var = PaymentMethod$Type.CARD;
        } else if (k2a0Var instanceof CashLikeAccount) {
            e4a0Var = PaymentMethod$Type.CASH_LIKE;
        } else if (k2a0Var instanceof CorpAccount) {
            e4a0Var = PaymentMethod$Type.CORP;
        } else if (k2a0Var instanceof DeliveryPaymentMethod) {
            e4a0Var = PaymentMethod$Type.CARGO_CORP;
        } else if (k2a0Var instanceof PersonalAccount) {
            e4a0Var = PaymentMethod$Type.PERSONAL_WALLET;
        } else if (k2a0Var instanceof SbpToken) {
            e4a0Var = PaymentMethod$Type.SBP_TOKEN;
        } else if (k2a0Var instanceof SharedAccount) {
            e4a0Var = PaymentMethod$Type.SHARED;
        } else if (k2a0Var instanceof YbWallet) {
            e4a0Var = PaymentMethod$Type.YB_WALLET;
        } else if (k2a0Var instanceof y1) {
            e4a0Var = PaymentMethod$Type.YANGO_PAY;
        } else if (k2a0Var instanceof MBankAccount) {
            e4a0Var = PaymentMethod$Type.MBANK_ACCOUNT;
        } else if (k2a0Var instanceof YapeToken) {
            e4a0Var = PaymentMethod$Type.YAPE_TOKEN;
        } else if (k2a0Var instanceof NequiToken) {
            e4a0Var = PaymentMethod$Type.NEQUI_TOKEN;
        } else if (k2a0Var instanceof FastshiftAccount) {
            e4a0Var = PaymentMethod$Type.FASTSHIFT_ACCOUNT;
        } else if (k2a0Var instanceof JazzcashWallet) {
            e4a0Var = PaymentMethod$Type.JAZZCASH_WALLET;
        } else if (k2a0Var instanceof SbpBindToken) {
            e4a0Var = PaymentMethod$Type.SBP_BIND_TOKEN;
        } else if (k2a0Var instanceof Kaspi) {
            e4a0Var = PaymentMethod$Type.KASPI;
        } else if (k2a0Var instanceof ComplementWallet) {
            e4a0Var = ((ComplementWallet) k2a0Var).getB();
            if (e4a0Var == null) {
                e4a0Var = e4a0.R3;
            }
        } else {
            if (!(k2a0Var instanceof TransportExternalPaymentMethod)) {
                w511.b();
                return null;
            }
            e4a0Var = PaymentMethod$Type.TRANSPORT_EXTERNAL;
        }
        String a = k2a0Var.getA();
        kv90Var.getClass();
        return kv90.a(e4a0Var, a, null);
    }

    public static final f530 b(f530 f530Var, e eVar, Orientation orientation, wls wlsVar) {
        return f530Var.k(new cam(eVar, wlsVar, orientation));
    }

    public static final boolean c(Exception exc) {
        return (exc instanceof EbsException) && scc.g(EbsException.EBS_010108_CODE, EbsException.EBS_010110_CODE, EbsException.EBS_010107_CODE, "EBS-010119", "EBS-010120").contains(((EbsException) exc).getErrorCode());
    }

    public static final boolean d(Exception exc) {
        return (exc instanceof EbsVerificationEbsException) && scc.g("EBS-010304", "EBS-010121").contains(((EbsVerificationEbsException) exc).getErrorCode());
    }
}
