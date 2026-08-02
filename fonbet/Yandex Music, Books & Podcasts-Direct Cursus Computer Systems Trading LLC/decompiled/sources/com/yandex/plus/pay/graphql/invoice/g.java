package com.yandex.plus.pay.graphql.invoice;

import com.yandex.plus.core.graphql.fragment.c9;
import com.yandex.plus.core.graphql.fragment.e9;
import com.yandex.plus.core.graphql.fragment.q8;
import com.yandex.plus.core.graphql.fragment.s8;
import com.yandex.plus.core.graphql.fragment.u8;
import com.yandex.plus.core.graphql.fragment.v8;
import com.yandex.plus.core.graphql.type.w;
import com.yandex.plus.pay.repository.api.model.offers.n0;
import defpackage.b6e;
import java.math.BigDecimal;

/* loaded from: classes5.dex */
public final class g {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.yandex.plus.pay.repository.api.model.invoice.f a(v8 v8Var) {
        com.yandex.plus.pay.repository.api.model.invoice.d dVar;
        com.yandex.plus.pay.repository.api.model.invoice.b bVar;
        com.yandex.plus.pay.repository.api.model.invoice.a aVar;
        String obj;
        String str = v8Var.a;
        w wVar = v8Var.b;
        switch (wVar == null ? -1 : f.a[wVar.ordinal()]) {
            case -1:
            case 11:
            case 12:
            case 13:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.k;
                break;
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.a;
                break;
            case 2:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.b;
                break;
            case 3:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.c;
                break;
            case 4:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.d;
                break;
            case 5:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.e;
                break;
            case 6:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.f;
                break;
            case 7:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.g;
                break;
            case 8:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.h;
                break;
            case 9:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.i;
                break;
            case 10:
                dVar = com.yandex.plus.pay.repository.api.model.invoice.d.j;
                break;
        }
        String str2 = v8Var.d;
        e9 e9Var = v8Var.e.b;
        String bigDecimal = e9Var.b.toString();
        bigDecimal.getClass();
        n0 n0Var = new n0(new BigDecimal(bigDecimal), e9Var.a.toString());
        s8 s8Var = v8Var.f;
        if (s8Var != null) {
            c9 c9Var = s8Var.b;
            String str3 = c9Var.a;
            Object obj2 = c9Var.b;
            if (obj2 != null && (obj = obj2.toString()) != null) {
                switch (obj.hashCode()) {
                    case -1562584233:
                        if (obj.equals("limit_exceeded")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.m;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case -1528707547:
                        if (obj.equals("authorization_reject")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.j;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case -1285802717:
                        if (obj.equals("timeout_no_success")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.k;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case -1090411399:
                        if (obj.equals("operation_cancelled")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.i;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 178503720:
                        if (obj.equals("payment_timeout")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.a;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 420012126:
                        if (obj.equals("invalid_xrf_token")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.h;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 675222369:
                        if (obj.equals("fail_3ds")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.f;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 954870900:
                        if (obj.equals("restricted_card")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.e;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 1125016188:
                        if (obj.equals("blacklisted")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.b;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 1436957674:
                        if (obj.equals("expired_card")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.c;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 1635433643:
                        if (obj.equals("not_enough_funds")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.g;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 2043678173:
                        if (obj.equals("user_cancelled")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.d;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    case 2078196747:
                        if (obj.equals("transaction_not_permitted")) {
                            aVar = com.yandex.plus.pay.repository.api.model.invoice.a.l;
                            break;
                        }
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                    default:
                        aVar = com.yandex.plus.pay.repository.api.model.invoice.a.n;
                        break;
                }
            } else {
                aVar = null;
            }
            String obj3 = c9Var.d.toString();
            String str4 = c9Var.c;
            if (str4 == null) {
                str4 = "";
            }
            bVar = new com.yandex.plus.pay.repository.api.model.invoice.b(str3, aVar, obj3, str4);
        } else {
            bVar = null;
        }
        e9 e9Var2 = v8Var.g.b;
        String bigDecimal2 = e9Var2.b.toString();
        bigDecimal2.getClass();
        n0 n0Var2 = new n0(new BigDecimal(bigDecimal2), e9Var2.a.toString());
        String str5 = v8Var.c;
        q8 q8Var = v8Var.h;
        com.yandex.plus.pay.repository.api.model.invoice.c cVar = new com.yandex.plus.pay.repository.api.model.invoice.c(q8Var.b, q8Var.a);
        u8 u8Var = v8Var.i;
        return new com.yandex.plus.pay.repository.api.model.invoice.f(str, dVar, str2, n0Var, bVar, n0Var2, str5, cVar, u8Var != null ? new com.yandex.plus.pay.repository.api.model.invoice.e(u8Var.a, u8Var.b) : null);
    }
}
