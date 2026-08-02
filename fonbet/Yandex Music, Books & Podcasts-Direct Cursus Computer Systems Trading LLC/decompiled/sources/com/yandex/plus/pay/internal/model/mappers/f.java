package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.b6e;

/* loaded from: classes5.dex */
public final class f {
    public final PlusPayInvoice a(com.yandex.plus.pay.repository.api.model.invoice.f fVar) {
        PlusPayInvoice.Status status;
        PlusPayInvoice.Payment payment;
        PlusPayInvoice.Payment.ErrorStatusCode errorStatusCode;
        fVar.getClass();
        String str = fVar.a;
        switch (fVar.b.ordinal()) {
            case 0:
                status = PlusPayInvoice.Status.CANCELLED;
                break;
            case 1:
                status = PlusPayInvoice.Status.CREATED;
                break;
            case 2:
                status = PlusPayInvoice.Status.CREATED_LEGACY;
                break;
            case 3:
                status = PlusPayInvoice.Status.FAILED;
                break;
            case 4:
                status = PlusPayInvoice.Status.PROVISION_SCHEDULED;
                break;
            case 5:
                status = PlusPayInvoice.Status.SCHEDULED;
                break;
            case 6:
                status = PlusPayInvoice.Status.STARTED;
                break;
            case 7:
                status = PlusPayInvoice.Status.SUCCESS;
                break;
            case 8:
                status = PlusPayInvoice.Status.WAIT_FOR_3DS;
                break;
            case 9:
                status = PlusPayInvoice.Status.WAIT_FOR_NOTIFICATION;
                break;
            case 10:
                status = PlusPayInvoice.Status.UNKNOWN;
                break;
            default:
                b6e.s();
                return null;
        }
        String str2 = fVar.c;
        PlusPayPrice a = i.a(fVar.d);
        com.yandex.plus.pay.repository.api.model.invoice.b bVar = fVar.e;
        if (bVar != null) {
            String str3 = bVar.a;
            com.yandex.plus.pay.repository.api.model.invoice.a aVar = bVar.b;
            if (aVar != null) {
                switch (aVar.ordinal()) {
                    case 0:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.PAYMENT_TIMEOUT;
                        break;
                    case 1:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.BLACKLISTED;
                        break;
                    case 2:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.EXPIRED_CARD;
                        break;
                    case 3:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.USER_CANCELLED;
                        break;
                    case 4:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.RESTRICTED_CARD;
                        break;
                    case 5:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.FAIL_3DS;
                        break;
                    case 6:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.NOT_ENOUGH_FUNDS;
                        break;
                    case 7:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.INVALID_XRF_TOKEN;
                        break;
                    case 8:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.OPERATION_CANCELLED;
                        break;
                    case 9:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.AUTH_REJECT;
                        break;
                    case 10:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.TIMEOUT_NO_SUCCESS;
                        break;
                    case 11:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.TRANSACTION_NOT_PERMITTED;
                        break;
                    case 12:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.LIMIT_EXCEEDED;
                        break;
                    case 13:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.UNEXPECTED;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
            } else {
                errorStatusCode = null;
            }
            payment = new PlusPayInvoice.Payment(str3, errorStatusCode, bVar.c, bVar.d);
        } else {
            payment = null;
        }
        PlusPayPrice a2 = i.a(fVar.f);
        PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams = null;
        String str4 = fVar.g;
        com.yandex.plus.pay.repository.api.model.invoice.c cVar = fVar.h;
        PlusPayInvoice.Status status2 = status;
        PlusPayInvoice.Payment payment2 = payment;
        PlusPayInvoice.PollingConfiguration pollingConfiguration = new PlusPayInvoice.PollingConfiguration(cVar.a, cVar.b);
        com.yandex.plus.pay.repository.api.model.invoice.e eVar = fVar.i;
        if (eVar != null) {
            webWidgetQrCodeParams = new PlusPayInvoice.WebWidgetQrCodeParams(eVar.a, eVar.b);
        }
        return new PlusPayInvoice(str, status2, str2, a, payment2, a2, str4, pollingConfiguration, webWidgetQrCodeParams);
    }
}
