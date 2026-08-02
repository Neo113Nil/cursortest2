package defpackage;

import com.yandex.plus.core.graphql.type.INVOICE_STATUS;
import com.yandex.plus.pay.repository.api.model.invoice.Invoice$Payment$ErrorStatusCode;
import com.yandex.plus.pay.repository.api.model.invoice.Invoice$Status;
import com.yandex.plus.pay.repository.api.model.offers.Price;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class xxw {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static kxw a(lxw lxwVar) {
        Invoice$Status invoice$Status;
        exw exwVar;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode;
        String obj;
        String str = lxwVar.a;
        INVOICE_STATUS invoice_status = lxwVar.b;
        switch (invoice_status == null ? -1 : wxw.a[invoice_status.ordinal()]) {
            case -1:
            case 11:
            case 12:
            case 13:
                invoice$Status = Invoice$Status.UNKNOWN;
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                invoice$Status = Invoice$Status.CANCELLED;
                break;
            case 2:
                invoice$Status = Invoice$Status.CREATED;
                break;
            case 3:
                invoice$Status = Invoice$Status.CREATED_LEGACY;
                break;
            case 4:
                invoice$Status = Invoice$Status.FAILED;
                break;
            case 5:
                invoice$Status = Invoice$Status.PROVISION_SCHEDULED;
                break;
            case 6:
                invoice$Status = Invoice$Status.SCHEDULED;
                break;
            case 7:
                invoice$Status = Invoice$Status.STARTED;
                break;
            case 8:
                invoice$Status = Invoice$Status.SUCCESS;
                break;
            case 9:
                invoice$Status = Invoice$Status.WAIT_FOR_3DS;
                break;
            case 10:
                invoice$Status = Invoice$Status.WAIT_FOR_NOTIFICATION;
                break;
        }
        String str2 = lxwVar.d;
        ayw aywVar = lxwVar.e.b;
        Price price = new Price(new BigDecimal(aywVar.b.toString()), aywVar.a.toString());
        fxw fxwVar = lxwVar.f;
        if (fxwVar != null) {
            yxw yxwVar = fxwVar.b;
            String str3 = yxwVar.a;
            Object obj2 = yxwVar.b;
            if (obj2 != null && (obj = obj2.toString()) != null) {
                switch (obj.hashCode()) {
                    case -1562584233:
                        if (obj.equals("limit_exceeded")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.LIMIT_EXCEEDED;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case -1528707547:
                        if (obj.equals("authorization_reject")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.AUTH_REJECT;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case -1285802717:
                        if (obj.equals("timeout_no_success")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.TIMEOUT_NO_SUCCESS;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case -1090411399:
                        if (obj.equals("operation_cancelled")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.OPERATION_CANCELLED;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 178503720:
                        if (obj.equals("payment_timeout")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.PAYMENT_TIMEOUT;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 420012126:
                        if (obj.equals("invalid_xrf_token")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.INVALID_XRF_TOKEN;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 675222369:
                        if (obj.equals("fail_3ds")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.FAIL_3DS;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 954870900:
                        if (obj.equals("restricted_card")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.RESTRICTED_CARD;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 1125016188:
                        if (obj.equals("blacklisted")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.BLACKLISTED;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 1436957674:
                        if (obj.equals("expired_card")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.EXPIRED_CARD;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 1635433643:
                        if (obj.equals("not_enough_funds")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.NOT_ENOUGH_FUNDS;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 2043678173:
                        if (obj.equals("user_cancelled")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.USER_CANCELLED;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    case 2078196747:
                        if (obj.equals("transaction_not_permitted")) {
                            invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.TRANSACTION_NOT_PERMITTED;
                            break;
                        }
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                    default:
                        invoice$Payment$ErrorStatusCode = Invoice$Payment$ErrorStatusCode.UNEXPECTED;
                        break;
                }
            } else {
                invoice$Payment$ErrorStatusCode = null;
            }
            String obj3 = yxwVar.d.toString();
            String str4 = yxwVar.c;
            if (str4 == null) {
                str4 = "";
            }
            exwVar = new exw(str3, invoice$Payment$ErrorStatusCode, obj3, str4);
        } else {
            exwVar = null;
        }
        ayw aywVar2 = lxwVar.g.b;
        Price price2 = new Price(new BigDecimal(aywVar2.b.toString()), aywVar2.a.toString());
        String str5 = lxwVar.c;
        cxw cxwVar = lxwVar.h;
        gxw gxwVar = new gxw(cxwVar.b, cxwVar.a);
        jxw jxwVar = lxwVar.i;
        return new kxw(str, invoice$Status, str2, price, exwVar, price2, str5, gxwVar, jxwVar != null ? new ixw(jxwVar.a, jxwVar.b) : null);
    }
}
