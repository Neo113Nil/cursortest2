package com.google.crypto.tink.subtle;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.prf.AesCmacPrfKey;
import com.google.crypto.tink.prf.Prf;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.presenters.InstrumentUtilsKt$WhenMappings;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.util.cash.Bps;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;
import javax.crypto.Mac;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class PrfAesCmac implements Prf {
    public static Prf create(AesCmacPrfKey aesCmacPrfKey) {
        WireAdapter wireAdapter = aesCmacPrfKey.keyBytes;
        com.google.crypto.tink.prf.internal.PrfAesCmac prfAesCmac = new com.google.crypto.tink.prf.internal.PrfAesCmac(((com.google.crypto.tink.util.Bytes) wireAdapter.adapter).toByteArray());
        try {
            Provider providerOrNull = ConscryptUtil.providerOrNull();
            if (providerOrNull == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerOrNull);
            return new BinaryBitmap(8, prfAesCmac, new BinaryBitmap(((com.google.crypto.tink.util.Bytes) wireAdapter.adapter).toByteArray(), providerOrNull));
        } catch (GeneralSecurityException unused) {
            return prfAesCmac;
        }
    }

    public static final String getCreditCardFee(Money money, MoneyFormatter moneyFormatter, AndroidStringManager androidStringManager) {
        if (money == null) {
            return null;
        }
        if (Moneys.amount(money) <= 0) {
            return androidStringManager.get(R.string.payment_instrument_no_fee);
        }
        String format2 = moneyFormatter.format(money);
        format2.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.payment_instrument_fee)).format(new Object[]{format2});
        format3.getClass();
        return format3;
    }

    public static final boolean hasExceededCashBalance(BalanceSnapshot balanceSnapshot, Money money, List list) {
        Long l = balanceSnapshot.balance.amount;
        long j = 0;
        long longValue = l != null ? l.longValue() : 0L;
        Integer valueOf = Integer.valueOf(list.size());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 1;
        Long l2 = money.amount;
        if (l2 != null) {
            l2.getClass();
            j = l2.longValue() * intValue;
        }
        return j > longValue;
    }

    public static final KClassImpl toKClassImpl(ClassDescriptor classDescriptor) {
        Class javaClass = UtilKt.toJavaClass(classDescriptor);
        KClassImpl kClassImpl = (KClassImpl) (javaClass != null ? Reflection.factory.getOrCreateKotlinClass(javaClass) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        f$$ExternalSyntheticLambda0.m$2(classDescriptor.getContainingDeclaration(), "Type parameter container is not resolved: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SelectPaymentInstrumentViewModel.PaymentInstrument toPaymentInstrument(SelectPaymentInstrumentOption selectPaymentInstrumentOption, Money money, List list, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        int i;
        String str;
        String str2;
        InstrumentAvatarViewModel.FallbackIcon card;
        Resources resources = androidStringManager.resources;
        selectPaymentInstrumentOption.getClass();
        money.getClass();
        list.getClass();
        if (selectPaymentInstrumentOption instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
            SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance existingCashBalance = (SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) selectPaymentInstrumentOption;
            BalanceSnapshot balanceSnapshot = existingCashBalance.balance;
            balanceSnapshot.getClass();
            Money money2 = balanceSnapshot.balance;
            String str3 = androidStringManager.get(R.string.send_payment_cash_balance);
            String format2 = factory.create(MoneyFormatterConfig.STANDARD).format(new Money(money2.amount, money2.currency_code, 4));
            format2.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.money_balance)).format(new Object[]{format2});
            format3.getClass();
            return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance(str3, format3, existingCashBalance.enabled, balanceSnapshot, null, null, (32 & 64) != 0 ? null : hasExceededCashBalance(balanceSnapshot, money, list) ? androidStringManager.get(R.string.amount_exceeded_message) : null, (128 & 32) != 0 ? null : new InstrumentAvatarViewModel(null, new InstrumentAvatarViewModel.FallbackIcon.Balance(money2.currency_code), !hasExceededCashBalance(balanceSnapshot, money, list)));
        }
        if (!(selectPaymentInstrumentOption instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
            if (!(selectPaymentInstrumentOption instanceof SelectPaymentInstrumentOption.NewInstrument)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            CashInstrumentType cashInstrumentType = ((SelectPaymentInstrumentOption.NewInstrument) selectPaymentInstrumentOption).f1147type;
            String format4 = Bps.DISPLAY_FORMAT.format(Float.valueOf(r0.creditCardBps / 100.0f));
            format4.getClass();
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.payment_instrument_fee)).format(new Object[]{format4});
            format5.getClass();
            int[] iArr = InstrumentUtilsKt$WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[cashInstrumentType.ordinal()]) {
                case 1:
                    i = R.string.profile_debit_card;
                    break;
                case 2:
                    i = R.string.profile_credit_card;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    ZslControlImpl$$ExternalSyntheticLambda1.m(cashInstrumentType, "Can't select ");
                    return null;
                case 9:
                    Path$$ExternalSyntheticBUOutline0.m$1(cashInstrumentType, "Unexpected instrument type ");
                    return null;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            return new SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument(androidStringManager.get(i), iArr[cashInstrumentType.ordinal()] == 2 ? format5 : null, cashInstrumentType, (32 & 8) != 0 ? null : new InstrumentAvatarViewModel(null, InstrumentAvatarViewModel.FallbackIcon.Add.INSTANCE, true), (32 & 16) != 0 ? null : format5, null, true);
        }
        MoneyFormatter create = factory.create(MoneyFormatterConfig.COMPACT);
        SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument = (SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) selectPaymentInstrumentOption;
        Instrument instrument = existingInstrument.instrument;
        String selectionString = GoogleMapKt.selectionString(instrument, androidStringManager);
        CashInstrumentType cashInstrumentType2 = instrument.cashInstrumentType;
        switch (InstrumentUtilsKt$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType2.ordinal()]) {
            case 1:
                str = instrument.bankName;
                str2 = str;
                Instrument instrument2 = existingInstrument.instrument;
                Money money3 = existingInstrument.creditCardFee;
                String creditCardFee = getCreditCardFee(money3, create, androidStringManager);
                String str4 = instrument.detailIconUrl;
                InstrumentAvatarViewModel.Image image = str4 == null ? new InstrumentAvatarViewModel.Image(str4, str4) : null;
                if (cashInstrumentType2 != CashInstrumentType.GOOGLE_PAY) {
                    card = InstrumentAvatarViewModel.FallbackIcon.GooglePayIcon.INSTANCE;
                } else {
                    InstrumentType instrumentType = instrument.cardBrand;
                    card = instrumentType != null ? new InstrumentAvatarViewModel.FallbackIcon.Card(instrumentType) : InstrumentAvatarViewModel.FallbackIcon.Bank.INSTANCE;
                }
                return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument(selectionString, str2, true, instrument2, money3, (128 & 32) == 0 ? null : new InstrumentAvatarViewModel(image, card, true), (128 & 64) == 0 ? null : creditCardFee, null);
            case 2:
                str = getCreditCardFee(existingInstrument.creditCardFee, create, androidStringManager);
                str2 = str;
                Instrument instrument22 = existingInstrument.instrument;
                Money money32 = existingInstrument.creditCardFee;
                String creditCardFee2 = getCreditCardFee(money32, create, androidStringManager);
                String str42 = instrument.detailIconUrl;
                if (str42 == null) {
                }
                if (cashInstrumentType2 != CashInstrumentType.GOOGLE_PAY) {
                }
                return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument(selectionString, str2, true, instrument22, money32, (128 & 32) == 0 ? null : new InstrumentAvatarViewModel(image, card, true), (128 & 64) == 0 ? null : creditCardFee2, null);
            case 3:
                str = androidStringManager.get(R.string.google_pay_subtitle);
                str2 = str;
                Instrument instrument222 = existingInstrument.instrument;
                Money money322 = existingInstrument.creditCardFee;
                String creditCardFee22 = getCreditCardFee(money322, create, androidStringManager);
                String str422 = instrument.detailIconUrl;
                if (str422 == null) {
                }
                if (cashInstrumentType2 != CashInstrumentType.GOOGLE_PAY) {
                }
                return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument(selectionString, str2, true, instrument222, money322, (128 & 32) == 0 ? null : new InstrumentAvatarViewModel(image, card, true), (128 & 64) == 0 ? null : creditCardFee22, null);
            case 4:
            case 5:
            case 6:
            case 7:
                str2 = null;
                Instrument instrument2222 = existingInstrument.instrument;
                Money money3222 = existingInstrument.creditCardFee;
                String creditCardFee222 = getCreditCardFee(money3222, create, androidStringManager);
                String str4222 = instrument.detailIconUrl;
                if (str4222 == null) {
                }
                if (cashInstrumentType2 != CashInstrumentType.GOOGLE_PAY) {
                }
                return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument(selectionString, str2, true, instrument2222, money3222, (128 & 32) == 0 ? null : new InstrumentAvatarViewModel(image, card, true), (128 & 64) == 0 ? null : creditCardFee222, null);
            case 8:
            case 9:
                Path$$ExternalSyntheticBUOutline0.m$1(cashInstrumentType2, "Unexpected instrument type ");
                return null;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
