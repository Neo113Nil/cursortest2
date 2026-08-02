package com.fidesmo.sec.delivery.models;

import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\"\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u0005*\u00020\n\u001a\n\u0010\u0010\u001a\u00020\u0005*\u00020\n¨\u0006\u0011"}, d2 = {"matchPattern", "", "cardNumber", "", "pattern", "", "matchRange", "range", "Lkotlin/Pair;", "validateSchemeFromCcn", "Lcom/fidesmo/sec/delivery/models/CardScheme;", "card", "Lcom/fidesmo/sec/delivery/models/PaymentCard;", "getPaymentCardType", "Lcom/fidesmo/sec/delivery/models/PaymentCardType;", "maxPanLengthForScheme", "numSpacesForPanPresentation", "sec-client-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentCardKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardScheme.values().length];
            try {
                iArr[CardScheme.MAESTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardScheme.VISA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardScheme.MASTERCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardScheme.AMEX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardScheme.DINERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardScheme.JCB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardScheme.DISCOVER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CardScheme.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PaymentCardType getPaymentCardType(CardScheme cardScheme) {
        cardScheme.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()]) {
            case 1:
                return new PaymentCardType(new Pair[]{new Pair(56, 69), new Pair(50, null)}, 12, 19);
            case 2:
                return new PaymentCardType(new Pair[]{new Pair(4, null)}, 13, 19);
            case 3:
                return new PaymentCardType(new Pair[]{new Pair(2221, 2720), new Pair(51, 55)}, 16, 16);
            case 4:
                return new PaymentCardType(new Pair[]{new Pair(34, null), new Pair(37, null)}, 15, 15);
            case 5:
                return new PaymentCardType(new Pair[]{new Pair(Integer.valueOf(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE), Integer.valueOf(EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE)), new Pair(36, null), new Pair(38, null)}, 14, 14);
            case 6:
                return new PaymentCardType(new Pair[]{new Pair(Integer.valueOf(Constants.ID_STARZ), null), new Pair(1800, null), new Pair(35, null)}, 15, 16);
            case 7:
                return new PaymentCardType(new Pair[]{new Pair(6011, null), new Pair(65, null)}, 16, 16);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
            case 8:
                return null;
        }
    }

    public static final boolean matchPattern(String str, int i) {
        str.getClass();
        int length = String.valueOf(i).length();
        if (str.length() < length) {
            return false;
        }
        return Integer.parseInt(str.substring(0, length)) == i;
    }

    public static final boolean matchRange(String str, Pair<Integer, Integer> pair) {
        str.getClass();
        pair.getClass();
        int length = String.valueOf(((Number) pair.first).intValue()).length();
        if (str.length() < length) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(0, length));
            if (parseInt >= ((Number) pair.first).intValue()) {
                if (parseInt <= ((Number) pair.second).intValue()) {
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }

    public static final int maxPanLengthForScheme(CardScheme cardScheme) {
        cardScheme.getClass();
        PaymentCardType paymentCardType = getPaymentCardType(cardScheme);
        if (paymentCardType != null) {
            return paymentCardType.getMaxLength();
        }
        return 16;
    }

    public static final int numSpacesForPanPresentation(CardScheme cardScheme) {
        cardScheme.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
        return (i == 1 || i == 2) ? 4 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardScheme validateSchemeFromCcn(PaymentCard paymentCard) {
        PaymentCardType paymentCardType = getPaymentCardType(paymentCard.getScheme());
        return paymentCardType == null ? CardScheme.UNKNOWN : (paymentCard.getCardNumber().length() < paymentCardType.getMinLength() || paymentCard.getCardNumber().length() > paymentCardType.getMaxLength()) ? CardScheme.UNKNOWN : paymentCard.getScheme();
    }
}
