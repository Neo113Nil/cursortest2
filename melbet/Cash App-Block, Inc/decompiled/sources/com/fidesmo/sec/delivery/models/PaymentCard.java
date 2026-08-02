package com.fidesmo.sec.delivery.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0006\u0010!\u001a\u00020\u001eJ\b\u0010\"\u001a\u00020\u001eH\u0002J\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u001eJ\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0012\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016*\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/fidesmo/sec/delivery/models/PaymentCard;", "", "cardNumber", "", "expiryMonth", "", "expiryYear", "cvv", "(Ljava/lang/String;IILjava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCvv", "expiryDateString", "getExpiryDateString", "getExpiryMonth", "()I", "getExpiryYear", "scheme", "Lcom/fidesmo/sec/delivery/models/CardScheme;", "getScheme", "()Lcom/fidesmo/sec/delivery/models/CardScheme;", "addends", "", "input", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "isCardNumberValid", "isCvvValid", "isDateValid", "isMonthValid", "isValid", "isValidLuhn", "toString", "digits", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentCard {
    private final String cardNumber;
    private final String cvv;
    private final int expiryMonth;
    private final int expiryYear;

    public PaymentCard(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.cardNumber = str;
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.cvv = str2;
    }

    private final List<Integer> addends(String input) {
        List<Integer> digits = digits(input);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(digits, 10));
        int i = 0;
        for (Object obj : digits) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            if (((input.length() - i) + 1) % 2 != 0) {
                intValue = intValue >= 5 ? (intValue * 2) - 9 : intValue * 2;
            }
            arrayList.add(Integer.valueOf(intValue));
            i = i2;
        }
        return arrayList;
    }

    public static /* synthetic */ PaymentCard copy$default(PaymentCard paymentCard, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = paymentCard.cardNumber;
        }
        if ((i3 & 2) != 0) {
            i = paymentCard.expiryMonth;
        }
        if ((i3 & 4) != 0) {
            i2 = paymentCard.expiryYear;
        }
        if ((i3 & 8) != 0) {
            str2 = paymentCard.cvv;
        }
        return paymentCard.copy(str, i, i2, str2);
    }

    private final List<Integer> digits(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Integer.valueOf(Character.getNumericValue(str.charAt(i))));
        }
        return arrayList;
    }

    private final boolean isCvvValid() {
        CardScheme validateSchemeFromCcn;
        validateSchemeFromCcn = PaymentCardKt.validateSchemeFromCcn(this);
        return validateSchemeFromCcn == CardScheme.MAESTRO || this.cvv.length() == 3;
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    public final PaymentCard copy(String cardNumber, int expiryMonth, int expiryYear, String cvv) {
        cardNumber.getClass();
        cvv.getClass();
        return new PaymentCard(cardNumber, expiryMonth, expiryYear, cvv);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentCard)) {
            return false;
        }
        PaymentCard paymentCard = (PaymentCard) other;
        return Intrinsics.areEqual(this.cardNumber, paymentCard.cardNumber) && this.expiryMonth == paymentCard.expiryMonth && this.expiryYear == paymentCard.expiryYear && Intrinsics.areEqual(this.cvv, paymentCard.cvv);
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getExpiryDateString() {
        String valueOf = String.valueOf(this.expiryYear);
        if (valueOf.length() == 1) {
            valueOf = "0".concat(valueOf);
        }
        String valueOf2 = String.valueOf(this.expiryMonth);
        if (valueOf2.length() == 1) {
            valueOf2 = "0".concat(valueOf2);
        }
        return valueOf2.concat(valueOf);
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
        return this.expiryYear;
    }

    public final CardScheme getScheme() {
        Pair<Integer, Integer>[] ranges;
        if (this.cardNumber.length() < 4) {
            return CardScheme.UNKNOWN;
        }
        for (CardScheme cardScheme : CardScheme.values()) {
            PaymentCardType paymentCardType = PaymentCardKt.getPaymentCardType(cardScheme);
            if (paymentCardType == null || (ranges = paymentCardType.getRanges()) == null) {
                break;
            }
            for (Pair<Integer, Integer> pair : ranges) {
                Object obj = pair.second;
                String str = this.cardNumber;
                if (obj != null) {
                    if (PaymentCardKt.matchRange(str, pair)) {
                        return cardScheme;
                    }
                } else {
                    if (PaymentCardKt.matchPattern(str, ((Number) pair.first).intValue())) {
                        return cardScheme;
                    }
                }
            }
        }
        return CardScheme.UNKNOWN;
    }

    public int hashCode() {
        return this.cvv.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expiryYear, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expiryMonth, this.cardNumber.hashCode() * 31, 31), 31);
    }

    public final boolean isCardNumberValid() {
        CardScheme validateSchemeFromCcn;
        validateSchemeFromCcn = PaymentCardKt.validateSchemeFromCcn(this);
        if (validateSchemeFromCcn == CardScheme.UNKNOWN) {
            return false;
        }
        return isValidLuhn(this.cardNumber);
    }

    public final boolean isDateValid() {
        int i = this.expiryYear;
        if (1 > i || i >= 100) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.expiryYear + 2000, this.expiryMonth, 0);
        return calendar.after(Calendar.getInstance());
    }

    public final boolean isMonthValid() {
        int i = this.expiryMonth;
        return 1 <= i && i < 13;
    }

    public final boolean isValid() {
        return isCardNumberValid() && isDateValid() && isMonthValid() && isCvvValid();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isValidLuhn(String input) {
        input.getClass();
        int i = 0;
        while (true) {
            if (i >= input.length()) {
                if (input.length() <= 1 || CollectionsKt.sumOfInt(addends(input)) % 10 != 0) {
                    break;
                }
                return true;
            }
            if (!Character.isDigit(input.charAt(i))) {
                break;
            }
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentCard(cardNumber=");
        sb.append(this.cardNumber);
        sb.append(", expiryMonth=");
        sb.append(this.expiryMonth);
        sb.append(", expiryYear=");
        sb.append(this.expiryYear);
        sb.append(", cvv=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.cvv, ')');
    }
}
