package com.google.crypto.tink.subtle;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.instruments.backend.api.Instruments$WhenMappings;
import com.squareup.cash.instruments.backend.api.PaymentInstrument;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class Hkdf {
    public static final ArrayList allowedExternalInstruments(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = Instruments$WhenMappings.$EnumSwitchMapping$0[((Instrument) obj).cashInstrumentType.ordinal()];
            if (i != 1 && i != 2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static byte[] computeEciesHkdfSymmetricKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, byte[] bArr4, int i) {
        byte[] concat = Bytes.concat(bArr, bArr2);
        Mac mac = (Mac) EngineFactory.MAC.policy.getInstance(str);
        if (i > mac.getMacLength() * 255) {
            a$$ExternalSyntheticBUOutline0.m$6("size too large");
            return null;
        }
        if (bArr3 == null || bArr3.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr3, str));
        }
        byte[] bArr5 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(concat), str));
        byte[] bArr6 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr6);
            mac.update(bArr4);
            mac.update((byte) i2);
            bArr6 = mac.doFinal();
            if (bArr6.length + i3 >= i) {
                System.arraycopy(bArr6, 0, bArr5, i3, i - i3);
                return bArr5;
            }
            System.arraycopy(bArr6, 0, bArr5, i3, bArr6.length);
            i3 += bArr6.length;
            i2++;
        }
    }

    public static final Instrument findInstrument(List list, CashInstrumentType cashInstrumentType) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Instrument) obj).cashInstrumentType == cashInstrumentType) {
                break;
            }
        }
        return (Instrument) obj;
    }

    public static final PaymentInstrument instrumentForCashPayment(BalanceSnapshot balanceSnapshot, List list, Money money, long j) {
        list.getClass();
        money.getClass();
        ArrayList allowedExternalInstruments = allowedExternalInstruments(list);
        if (balanceSnapshot == null || balanceSnapshot.balance.currency_code != money.currency_code) {
            balanceSnapshot = null;
        }
        int size = allowedExternalInstruments.size() + (balanceSnapshot != null ? 1 : 0);
        if (size <= 2 && (balanceSnapshot != null || size != 2)) {
            Instrument findInstrument = findInstrument(allowedExternalInstruments, CashInstrumentType.DEBIT_CARD);
            Instrument findInstrument2 = j == 0 ? findInstrument(allowedExternalInstruments, CashInstrumentType.CREDIT_CARD) : null;
            if (balanceSnapshot != null && Moneys.compareTo(balanceSnapshot.balance, money) >= 0) {
                return new PaymentInstrument.BalancePaymentInstrument(balanceSnapshot);
            }
            if (findInstrument != null) {
                return new PaymentInstrument.ExternalPaymentInstrument(findInstrument);
            }
            if (findInstrument2 != null) {
                return new PaymentInstrument.ExternalPaymentInstrument(findInstrument2);
            }
        }
        return null;
    }

    public static final PaymentInstrument instrumentTokenForBillPayment(BalanceSnapshot balanceSnapshot, Money money, List list) {
        list.getClass();
        money.getClass();
        ArrayList allowedExternalInstruments = allowedExternalInstruments(list);
        if (balanceSnapshot == null || balanceSnapshot.balance.currency_code != money.currency_code) {
            balanceSnapshot = null;
        }
        Instrument findInstrument = findInstrument(allowedExternalInstruments, CashInstrumentType.DEBIT_CARD);
        if (findInstrument(allowedExternalInstruments, CashInstrumentType.CREDIT_CARD) == null) {
            if (balanceSnapshot != null && Moneys.compareTo(balanceSnapshot.balance, money) >= 0) {
                return new PaymentInstrument.BalancePaymentInstrument(balanceSnapshot);
            }
            if (findInstrument != null) {
                return new PaymentInstrument.ExternalPaymentInstrument(findInstrument);
            }
        }
        return null;
    }

    public static final boolean needToSelectInstrumentForCash(BalanceSnapshot balanceSnapshot, List list, Money money, long j) {
        list.getClass();
        money.getClass();
        return instrumentForCashPayment(balanceSnapshot, list, money, j) == null;
    }

    public static final String token(PaymentInstrument paymentInstrument) {
        if (paymentInstrument instanceof PaymentInstrument.BalancePaymentInstrument) {
            return ((PaymentInstrument.BalancePaymentInstrument) paymentInstrument).balanceSnapshot.token;
        }
        if (paymentInstrument instanceof PaymentInstrument.ExternalPaymentInstrument) {
            return ((PaymentInstrument.ExternalPaymentInstrument) paymentInstrument).instrument.token;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public abstract String asString();
}
