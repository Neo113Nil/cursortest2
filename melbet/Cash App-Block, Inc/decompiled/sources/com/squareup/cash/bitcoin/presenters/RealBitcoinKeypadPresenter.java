package com.squareup.cash.bitcoin.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadError$MaxLimitError;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class RealBitcoinKeypadPresenter {
    public final RealBitcoinFormatter bitcoinFormatter;
    public final MoneyFormatter moneyFormatter;
    public final MoneyFormatter noSymbolMoneyFormatter;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealBitcoinKeypadPresenter(RealBitcoinFormatter realBitcoinFormatter, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        this.bitcoinFormatter = realBitcoinFormatter;
        this.stringManager = androidStringManager;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.noSymbolMoneyFormatter = factory.createNoSymbolCompact();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BitcoinKeypadModel buildViewModel(BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State) {
        String str;
        String str2;
        AndroidTileMode_androidKt androidTileMode_androidKt;
        FormattedResource formattedResource;
        String str3;
        FormattedResource formattedResource2;
        Money money = bitcoinKeypadStateStore$State.valuePerBitcoin;
        Money money2 = bitcoinKeypadStateStore$State.lightningDepositLimitUsd;
        Money money3 = bitcoinKeypadStateStore$State.availableBalance;
        Resources resources = this.stringManager.resources;
        boolean z = bitcoinKeypadStateStore$State.ignoreIfNotReady;
        Money money4 = bitcoinKeypadStateStore$State.transferAmount;
        BitcoinDisplayUnits bitcoinDisplayUnits = bitcoinKeypadStateStore$State.displayUnits;
        if (!z && !bitcoinKeypadStateStore$State.isReady()) {
            a$$ExternalSyntheticBUOutline0.m$1("State must be ready");
            return null;
        }
        bitcoinDisplayUnits.getClass();
        money3.getClass();
        RealBitcoinFormatter realBitcoinFormatter = this.bitcoinFormatter;
        String format2 = realBitcoinFormatter.format(bitcoinDisplayUnits, money3, true, false);
        money4.getClass();
        CurrencyCode currencyCode = money4.currency_code;
        currencyCode.getClass();
        boolean z2 = Moneys.compareTo(bitcoinKeypadStateStore$State.getBitcoinAmount(), money3) > 0;
        boolean z3 = bitcoinKeypadStateStore$State.useSendVerbInLimitMessages;
        Money money5 = bitcoinKeypadStateStore$State.minimumWithdrawalLimit;
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        if (!z2) {
            if (Moneys.compareTo(bitcoinKeypadStateStore$State.getBitcoinAmount(), (money == null || money2 == null) ? null : Moneys.convertBitcoinEquivalentAmount(money2, money)) <= 0) {
                if (Moneys.compareTo(bitcoinKeypadStateStore$State.getBitcoinAmount(), money5) < 0) {
                    money5.getClass();
                    String format3 = realBitcoinFormatter.format(bitcoinDisplayUnits, money5, true, false);
                    if (z3) {
                        format3.getClass();
                        formattedResource2 = new FormattedResource(R.string.transfer_btc_min_send_subtitle, new Object[]{format3});
                    } else {
                        format3.getClass();
                        formattedResource2 = new FormattedResource(R.string.transfer_btc_min_subtitle, new Object[]{format3});
                    }
                    final String string2 = Countries.getString(resources, formattedResource2);
                    androidTileMode_androidKt = new AndroidTileMode_androidKt(string2) { // from class: com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadError$MinLimitError
                        public final String message;

                        {
                            string2.getClass();
                            this.message = string2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof BitcoinKeypadError$MinLimitError) && Intrinsics.areEqual(this.message, ((BitcoinKeypadError$MinLimitError) obj).message);
                        }

                        @Override // androidx.compose.ui.graphics.AndroidTileMode_androidKt
                        public final String getMessage() {
                            return this.message;
                        }

                        public final int hashCode() {
                            return this.message.hashCode();
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MinLimitError(message=", this.message, ")");
                        }
                    };
                    format2.getClass();
                    resources.getClass();
                    String format4 = new MessageFormat(resources.getString(R.string.transfer_btc_subtitle)).format(new Object[]{format2});
                    format4.getClass();
                    BitcoinDisplayUnits bitcoinDisplayUnits2 = currencyCode != CurrencyCode.BTC ? bitcoinDisplayUnits : null;
                    str3 = bitcoinKeypadStateStore$State.transferRawAmount;
                    if (str3 == null) {
                        CurrencyCode currencyCode2 = money4.currency_code;
                        currencyCode2.getClass();
                        String format5 = WhenMappings.$EnumSwitchMapping$0[currencyCode2.ordinal()] == 1 ? realBitcoinFormatter.format(bitcoinDisplayUnits, money4, false, false) : this.noSymbolMoneyFormatter.format(money4);
                        StringBuilder sb = new StringBuilder();
                        int length = format5.length();
                        for (int i = 0; i < length; i++) {
                            char charAt = format5.charAt(i);
                            if (charAt != ',') {
                                sb.append(charAt);
                            }
                        }
                        str3 = sb.toString();
                    }
                    String str4 = str3;
                    Money convertedAmount = bitcoinKeypadStateStore$State.getConvertedAmount();
                    CurrencyCode currencyCode3 = convertedAmount.currency_code;
                    currencyCode3.getClass();
                    return new BitcoinKeypadModel(format4, bitcoinDisplayUnits2, money4, str4, WhenMappings.$EnumSwitchMapping$0[currencyCode3.ordinal()] != 1 ? realBitcoinFormatter.format(bitcoinDisplayUnits, convertedAmount, true, false) : moneyFormatter.format(convertedAmount), androidTileMode_androidKt);
                }
                androidTileMode_androidKt = null;
                format2.getClass();
                resources.getClass();
                String format42 = new MessageFormat(resources.getString(R.string.transfer_btc_subtitle)).format(new Object[]{format2});
                format42.getClass();
                if (currencyCode != CurrencyCode.BTC) {
                }
                str3 = bitcoinKeypadStateStore$State.transferRawAmount;
                if (str3 == null) {
                }
                String str42 = str3;
                Money convertedAmount2 = bitcoinKeypadStateStore$State.getConvertedAmount();
                CurrencyCode currencyCode32 = convertedAmount2.currency_code;
                currencyCode32.getClass();
                if (WhenMappings.$EnumSwitchMapping$0[currencyCode32.ordinal()] != 1) {
                }
                return new BitcoinKeypadModel(format42, bitcoinDisplayUnits2, money4, str42, WhenMappings.$EnumSwitchMapping$0[currencyCode32.ordinal()] != 1 ? realBitcoinFormatter.format(bitcoinDisplayUnits, convertedAmount2, true, false) : moneyFormatter.format(convertedAmount2), androidTileMode_androidKt);
            }
        }
        if (Moneys.compareTo(bitcoinKeypadStateStore$State.getBitcoinAmount(), money3) > 0) {
            if (z3) {
                format2.getClass();
                formattedResource = new FormattedResource(R.string.transfer_btc_max_send_subtitle, new Object[]{format2});
            } else {
                format2.getClass();
                formattedResource = new FormattedResource(R.string.transfer_btc_max_subtitle, new Object[]{format2});
            }
            str = Countries.getString(resources, formattedResource);
        } else {
            str = null;
        }
        if (Moneys.compareTo(bitcoinKeypadStateStore$State.getBitcoinAmount(), (money == null || money2 == null) ? null : Moneys.convertBitcoinEquivalentAmount(money2, money)) <= 0 || money2 == null) {
            str2 = null;
        } else {
            String format6 = moneyFormatter.format(money2);
            format6.getClass();
            resources.getClass();
            str2 = new MessageFormat(resources.getString(R.string.weekly_limit)).format(new Object[]{format6});
            str2.getClass();
        }
        BitcoinKeypadError$MaxLimitError bitcoinKeypadError$MaxLimitError = new BitcoinKeypadError$MaxLimitError(str, str2);
        if (str2 != null || str != null) {
            androidTileMode_androidKt = bitcoinKeypadError$MaxLimitError;
            format2.getClass();
            resources.getClass();
            String format422 = new MessageFormat(resources.getString(R.string.transfer_btc_subtitle)).format(new Object[]{format2});
            format422.getClass();
            if (currencyCode != CurrencyCode.BTC) {
            }
            str3 = bitcoinKeypadStateStore$State.transferRawAmount;
            if (str3 == null) {
            }
            String str422 = str3;
            Money convertedAmount22 = bitcoinKeypadStateStore$State.getConvertedAmount();
            CurrencyCode currencyCode322 = convertedAmount22.currency_code;
            currencyCode322.getClass();
            if (WhenMappings.$EnumSwitchMapping$0[currencyCode322.ordinal()] != 1) {
            }
            return new BitcoinKeypadModel(format422, bitcoinDisplayUnits2, money4, str422, WhenMappings.$EnumSwitchMapping$0[currencyCode322.ordinal()] != 1 ? realBitcoinFormatter.format(bitcoinDisplayUnits, convertedAmount22, true, false) : moneyFormatter.format(convertedAmount22), androidTileMode_androidKt);
        }
        androidTileMode_androidKt = null;
        format2.getClass();
        resources.getClass();
        String format4222 = new MessageFormat(resources.getString(R.string.transfer_btc_subtitle)).format(new Object[]{format2});
        format4222.getClass();
        if (currencyCode != CurrencyCode.BTC) {
        }
        str3 = bitcoinKeypadStateStore$State.transferRawAmount;
        if (str3 == null) {
        }
        String str4222 = str3;
        Money convertedAmount222 = bitcoinKeypadStateStore$State.getConvertedAmount();
        CurrencyCode currencyCode3222 = convertedAmount222.currency_code;
        currencyCode3222.getClass();
        if (WhenMappings.$EnumSwitchMapping$0[currencyCode3222.ordinal()] != 1) {
        }
        return new BitcoinKeypadModel(format4222, bitcoinDisplayUnits2, money4, str4222, WhenMappings.$EnumSwitchMapping$0[currencyCode3222.ordinal()] != 1 ? realBitcoinFormatter.format(bitcoinDisplayUnits, convertedAmount222, true, false) : moneyFormatter.format(convertedAmount222), androidTileMode_androidKt);
    }
}
