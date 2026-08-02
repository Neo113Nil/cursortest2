package com.squareup.cash.instruments.backend.real;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.utils.InstrumentUtils$WhenMappings;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.Orientation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class RealInstrumentSelectorManager {
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final AndroidStringManager stringManager;

    public RealInstrumentSelectorManager(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
        this.moneyFormatterFactory = factory;
    }

    public static boolean isOnlyCashBalanceAndAmountAboveBalance(BalanceSnapshot balanceSnapshot, Money money, int i) {
        Long l;
        if (balanceSnapshot == null) {
            return false;
        }
        long longValue = ((money == null || (l = money.amount) == null) ? 0L : l.longValue()) * i;
        Long l2 = balanceSnapshot.balance.amount;
        return longValue > (l2 != null ? l2.longValue() : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x009f, code lost:
    
        if (r4 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (r8 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InstrumentSelectionRowViewModel createInstrumentSelectionViewModel(String str, String str2, List list, InstrumentSelection instrumentSelection, CashInstrumentType cashInstrumentType, Orientation orientation, Profile profile, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, Boolean bool, Money money, boolean z, String str3, CurrencyCode currencyCode, boolean z2) {
        String str4;
        String str5;
        BalanceSnapshot balanceSnapshot2;
        Pair pair;
        boolean z3;
        SelectPaymentInstrumentOption.ExistingOption selectedInstrument;
        Money money2;
        Instrument instrument;
        String str6;
        str.getClass();
        list.getClass();
        orientation.getClass();
        money.getClass();
        InstrumentAvatarViewModel instrumentAvatarViewModel = null;
        if (orientation == Orientation.BILL || currencyCode == CurrencyCode.BTC || currencyCode == CurrencyCode.XUS) {
            return null;
        }
        int size = list.size();
        Integer valueOf = Integer.valueOf(size);
        if (size <= 0) {
            valueOf = null;
        }
        boolean isOnlyCashBalanceAndAmountAboveBalance = isOnlyCashBalanceAndAmountAboveBalance(balanceSnapshot, money, valueOf != null ? valueOf.intValue() : 1);
        LocalizedMoneyFormatter.Factory factory = this.moneyFormatterFactory;
        if (profile != null && balanceSnapshot != null && list2 != null && instrumentLinkingConfig != null && bool != null) {
            SelectPaymentInstrumentOption.ExistingOption selectedInstrument2 = GoogleMapKt.getSelectedInstrument(orientation, cashInstrumentType, instrumentSelection, GoogleMapKt.getExistingInstruments(list, profile, money, balanceSnapshot, list2, instrumentLinkingConfig, bool.booleanValue(), false));
            if (selectedInstrument2 != null) {
                if (selectedInstrument2 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                    MoneyFormatter create = factory.create(MoneyFormatterConfig.STANDARD);
                    Money money3 = ((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) selectedInstrument2).balance.balance;
                    str4 = create.format(new Money(money3.amount, money3.currency_code, 4));
                } else {
                    str4 = "";
                }
            }
            MoneyFormatter create2 = factory.create(MoneyFormatterConfig.STANDARD);
            Money money4 = balanceSnapshot.balance;
            str4 = create2.format(new Money(money4.amount, money4.currency_code, 4));
        }
        str4 = null;
        if (str4 == null) {
            str4 = "";
        }
        if (profile == null || list2 == null || instrumentLinkingConfig == null || bool == null) {
            str5 = null;
        } else {
            SelectPaymentInstrumentOption.ExistingOption selectedInstrument3 = GoogleMapKt.getSelectedInstrument(orientation, cashInstrumentType, instrumentSelection, GoogleMapKt.getExistingInstruments(list, profile, money, balanceSnapshot, list2, instrumentLinkingConfig, bool.booleanValue(), false));
            if (selectedInstrument3 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) {
                SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument = (SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) selectedInstrument3;
                Instrument instrument2 = existingInstrument.instrument;
                CashInstrumentType cashInstrumentType2 = instrument2 != null ? instrument2.cashInstrumentType : null;
                int i = cashInstrumentType2 == null ? -1 : InstrumentUtils$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType2.ordinal()];
                AndroidStringManager androidStringManager = this.stringManager;
                if (i == 1 || i == 2) {
                    String str7 = instrument2.bankName;
                    if (str7 == null || str7.length() <= 0) {
                        str6 = androidStringManager.get(R.string.linked_card);
                    } else {
                        str6 = instrument2.bankName;
                        str6.getClass();
                    }
                    String creditCardFee = GoogleMapKt.creditCardFee(existingInstrument, factory, androidStringManager);
                    if (creditCardFee != null) {
                        str6.getClass();
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        str5 = new MessageFormat(resources.getString(R.string.bank_name_with_fee)).format(new Object[]{str6, creditCardFee});
                        str5.getClass();
                    } else {
                        str5 = str6;
                    }
                } else if (i == 3) {
                    str5 = androidStringManager.get(R.string.linked_account);
                }
            }
            str5 = "";
        }
        String str8 = str5 != null ? str5 : "";
        if (profile != null && list2 != null && instrumentLinkingConfig != null && bool != null) {
            balanceSnapshot2 = balanceSnapshot;
            SelectPaymentInstrumentOption.ExistingOption selectedInstrument4 = GoogleMapKt.getSelectedInstrument(orientation, cashInstrumentType, instrumentSelection, GoogleMapKt.getExistingInstruments(list, profile, money, balanceSnapshot2, list2, instrumentLinkingConfig, bool.booleanValue(), false));
            if (selectedInstrument4 != null) {
                boolean z4 = selectedInstrument4 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance;
                Object obj = InstrumentAvatarViewModel.FallbackIcon.Bank.INSTANCE;
                if (z4) {
                    BalanceSnapshot balanceSnapshot3 = ((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) selectedInstrument4).balance;
                    if (balanceSnapshot3 != null) {
                        obj = new InstrumentAvatarViewModel.FallbackIcon.Balance(balanceSnapshot3.balance.currency_code);
                    }
                } else if ((selectedInstrument4 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) && (instrument = ((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) selectedInstrument4).instrument) != null) {
                    if (instrument.cashInstrumentType == CashInstrumentType.GOOGLE_PAY) {
                        obj = InstrumentAvatarViewModel.FallbackIcon.GooglePayIcon.INSTANCE;
                    } else {
                        InstrumentType instrumentType = instrument.cardBrand;
                        if (instrumentType != null) {
                            obj = new InstrumentAvatarViewModel.FallbackIcon.Card(instrumentType);
                        }
                    }
                }
                pair = new Pair(obj, (!z4 && (selectedInstrument4 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) ? ((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) selectedInstrument4).instrument.iconUrl : null);
            } else {
                Pair pair2 = new Pair(new InstrumentAvatarViewModel.FallbackIcon.Balance((balanceSnapshot2 == null || (money2 = balanceSnapshot2.balance) == null) ? null : money2.currency_code), null);
                if (isOnlyCashBalanceAndAmountAboveBalance) {
                    pair = pair2;
                }
            }
            CashInstrumentType type2 = (profile != null || list2 == null || instrumentLinkingConfig == null || bool == null || (selectedInstrument = GoogleMapKt.getSelectedInstrument(orientation, cashInstrumentType, instrumentSelection, GoogleMapKt.getExistingInstruments(list, profile, money, balanceSnapshot2, list2, instrumentLinkingConfig, bool.booleanValue(), false))) == null) ? null : selectedInstrument.getType();
            String concat = (str8.length() <= 0 && !z2) ? str.concat(":") : str;
            boolean z5 = list.isEmpty() && type2 != null;
            if (pair != null) {
                String str9 = (String) pair.second;
                instrumentAvatarViewModel = new InstrumentAvatarViewModel(str9 != null ? new InstrumentAvatarViewModel.Image(str9, str9) : null, (InstrumentAvatarViewModel.FallbackIcon) pair.first, true);
            }
            if (orientation == Orientation.CASH) {
                if (list2 != null) {
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext() && ((Instrument) it.next()).cashInstrumentType == CashInstrumentType.CASH_BALANCE) {
                        }
                    }
                }
                z3 = true;
            } else {
                z3 = false;
            }
            return new InstrumentSelectionRowViewModel(concat, str2, z, z5, instrumentAvatarViewModel, str4, str8, str3, z3, instrumentSelection, type2);
        }
        balanceSnapshot2 = balanceSnapshot;
        pair = null;
        if (profile != null) {
        }
        if (str8.length() <= 0) {
            if (list.isEmpty()) {
            }
            if (pair != null) {
            }
            if (orientation == Orientation.CASH) {
            }
            return new InstrumentSelectionRowViewModel(concat, str2, z, z5, instrumentAvatarViewModel, str4, str8, str3, z3, instrumentSelection, type2);
        }
        if (list.isEmpty()) {
        }
        if (pair != null) {
        }
        if (orientation == Orientation.CASH) {
        }
        return new InstrumentSelectionRowViewModel(concat, str2, z, z5, instrumentAvatarViewModel, str4, str8, str3, z3, instrumentSelection, type2);
    }

    public final String getToolbarCreditCardFee(Orientation orientation, List list, InstrumentSelection instrumentSelection, CashInstrumentType cashInstrumentType, Money money, Profile profile, List list2, InstrumentLinkingConfig instrumentLinkingConfig, Boolean bool, boolean z) {
        orientation.getClass();
        list.getClass();
        String str = null;
        if (profile != null && list2 != null && instrumentLinkingConfig != null && bool != null && money != null) {
            List existingInstruments = GoogleMapKt.getExistingInstruments(list, profile, money, (BalanceSnapshot) null, list2, instrumentLinkingConfig, bool.booleanValue(), z);
            existingInstruments.getClass();
            SelectPaymentInstrumentOption.ExistingOption normalizeInstrumentSelection$default = GoogleMapKt.normalizeInstrumentSelection$default(orientation, cashInstrumentType, instrumentSelection != null ? instrumentSelection.instrument_token : null, existingInstruments, 16);
            if (normalizeInstrumentSelection$default != null && (normalizeInstrumentSelection$default instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
                str = GoogleMapKt.creditCardFee((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) normalizeInstrumentSelection$default, this.moneyFormatterFactory, this.stringManager);
            }
        }
        return str == null ? "" : str;
    }

    public final String getToolbarSubtitle(Orientation orientation, List list, InstrumentSelection instrumentSelection, CashInstrumentType cashInstrumentType, Money money, Profile profile, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, Boolean bool, boolean z, boolean z2) {
        orientation.getClass();
        list.getClass();
        AndroidStringManager androidStringManager = this.stringManager;
        if (z2) {
            return androidStringManager.get(R.string.from_bitcoin_balance);
        }
        String str = null;
        if (profile != null && balanceSnapshot != null && list2 != null && instrumentLinkingConfig != null && bool != null && money != null) {
            List existingInstruments = GoogleMapKt.getExistingInstruments(list, profile, money, balanceSnapshot, list2, instrumentLinkingConfig, bool.booleanValue(), z);
            existingInstruments.getClass();
            SelectPaymentInstrumentOption.ExistingOption normalizeInstrumentSelection$default = GoogleMapKt.normalizeInstrumentSelection$default(orientation, cashInstrumentType, instrumentSelection != null ? instrumentSelection.instrument_token : null, existingInstruments, 16);
            String displayName = normalizeInstrumentSelection$default != null ? GoogleMapKt.displayName(normalizeInstrumentSelection$default, androidStringManager, orientation) : null;
            if (displayName == null) {
                String str2 = androidStringManager.get(R.string.send_payment_cash_balance);
                int size = list.size();
                Integer valueOf = Integer.valueOf(size);
                if (size <= 0) {
                    valueOf = null;
                }
                if (isOnlyCashBalanceAndAmountAboveBalance(balanceSnapshot, money, valueOf != null ? valueOf.intValue() : 1)) {
                    str = str2;
                }
            } else {
                str = displayName;
            }
        }
        return str == null ? "" : str;
    }
}
