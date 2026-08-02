package com.squareup.cash.instruments.presenters;

import com.google.crypto.tink.subtle.X25519;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.TransferOptionPickerDisplayIcon;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelectedOption;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class TransferOptionPickerResolver {
    public final MoneyFormatter moneyFormatter;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferOptions.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TransferOptions transferOptions = TransferOptions.CashBalance;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TransferOptions transferOptions2 = TransferOptions.CashBalance;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TransferOptions transferOptions3 = TransferOptions.CashBalance;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TransferOptions transferOptions4 = TransferOptions.CashBalance;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TransferOptions transferOptions5 = TransferOptions.CashBalance;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TransferOptions transferOptions6 = TransferOptions.CashBalance;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[CashInstrumentType.values().length];
            try {
                iArr2[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public TransferOptionPickerResolver(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public static ArrayList forType(List list, CashInstrumentType cashInstrumentType) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Instrument) obj).cashInstrumentType == cashInstrumentType) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    public final ArrayList resolve(Money money, List list, BalanceSnapshot balanceSnapshot, List list2, List list3, List list4, Money money2, boolean z) {
        ResolvedTransferOption resolvedTransferOption;
        ?? listOfNotNull;
        ArrayList arrayList;
        TransferOptionPickerResolver transferOptionPickerResolver = this;
        List list5 = list2;
        money.getClass();
        list5.getClass();
        list3.getClass();
        list4.getClass();
        List<String> list6 = list4;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
        for (String str : list6) {
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        Set set = CollectionsKt.toSet(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((TransferOptions) it.next()).ordinal();
            String str2 = null;
            InstrumentCellViewModel.Accessory.Radio radio = InstrumentCellViewModel.Accessory.Radio.INSTANCE;
            MoneyFormatter moneyFormatter = transferOptionPickerResolver.moneyFormatter;
            AndroidStringManager androidStringManager = transferOptionPickerResolver.stringManager;
            switch (ordinal) {
                case 0:
                    if (balanceSnapshot != null) {
                        TransferOptionPickerSelection transferOptionPickerSelection = new TransferOptionPickerSelection(TransferOptions.CashBalance, balanceSnapshot.token);
                        String str3 = androidStringManager.get(R.string.send_payment_cash_balance);
                        Money money3 = balanceSnapshot.balance;
                        String format2 = moneyFormatter.format(money3);
                        resolvedTransferOption = new ResolvedTransferOption(transferOptionPickerSelection, new TransferOptionPickerSelectedOption(transferOptionPickerSelection, str3, TransferOptionPickerDisplayIcon.CashBalance.INSTANCE, format2, balanceSnapshot.balance), new InstrumentCellViewModel(str3, format2, money2 != null ? Moneys.compareTo(money3, money2) >= 0 : true, CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.LocalIcon(Icons.CurrencyUsd24, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24)), radio, null, null, null, null, 480));
                    } else {
                        resolvedTransferOption = null;
                    }
                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(resolvedTransferOption);
                    continue;
                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) listOfNotNull, arrayList3);
                    transferOptionPickerResolver = this;
                    list5 = list2;
                    i = 10;
                case 1:
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : list3) {
                        if (obj instanceof SavingsFolder.GoalFolder) {
                            arrayList4.add(obj);
                        }
                    }
                    listOfNotNull = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        SavingsFolder.GoalFolder goalFolder = (SavingsFolder.GoalFolder) it2.next();
                        TransferOptions transferOptions = TransferOptions.SavingsGoal;
                        String str4 = goalFolder.token;
                        Float f = goalFolder.progress;
                        String str5 = goalFolder.iconId;
                        String str6 = goalFolder.label;
                        TransferOptionPickerSelection transferOptionPickerSelection2 = new TransferOptionPickerSelection(transferOptions, str4);
                        Money money4 = goalFolder.balance;
                        String format3 = moneyFormatter.format(money4);
                        listOfNotNull.add(new ResolvedTransferOption(transferOptionPickerSelection2, new TransferOptionPickerSelectedOption(transferOptionPickerSelection2, str6, new TransferOptionPickerDisplayIcon.Savings(f, str5), format3, goalFolder.balance), new InstrumentCellViewModel(str6, format3, money2 == null || Moneys.compareTo(money4, money2) >= 0, CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.Savings(f, str5)), radio, null, null, null, null, 480)));
                    }
                    continue;
                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) listOfNotNull, arrayList3);
                    transferOptionPickerResolver = this;
                    list5 = list2;
                    i = 10;
                    break;
                case 2:
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : list3) {
                        if (obj2 instanceof SavingsFolder.GeneralFolder) {
                            arrayList5.add(obj2);
                        }
                    }
                    listOfNotNull = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, i));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        SavingsFolder.GeneralFolder generalFolder = (SavingsFolder.GeneralFolder) it3.next();
                        TransferOptionPickerSelection transferOptionPickerSelection3 = new TransferOptionPickerSelection(TransferOptions.SavingsGeneral, str2);
                        String str7 = generalFolder.label;
                        String str8 = generalFolder.iconId;
                        Money money5 = generalFolder.balance;
                        if (str7 == null) {
                            str7 = androidStringManager.get(R.string.transfer_option_picker_general_savings);
                        }
                        String str9 = str7;
                        String format4 = moneyFormatter.format(money5);
                        listOfNotNull.add(new ResolvedTransferOption(transferOptionPickerSelection3, new TransferOptionPickerSelectedOption(transferOptionPickerSelection3, str9, new TransferOptionPickerDisplayIcon.Savings(null, str8), format4, generalFolder.balance), new InstrumentCellViewModel(str9, format4, money2 != null ? Moneys.compareTo(money5, money2) >= 0 : true, CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.Savings(null, str8)), radio, null, null, null, null, 480)));
                        moneyFormatter = moneyFormatter;
                        androidStringManager = androidStringManager;
                        str2 = null;
                    }
                    continue;
                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) listOfNotNull, arrayList3);
                    transferOptionPickerResolver = this;
                    list5 = list2;
                    i = 10;
                case 3:
                    ArrayList forType = forType(list5, CashInstrumentType.DEBIT_CARD);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(forType, i));
                    Iterator it4 = forType.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(transferOptionPickerResolver.toTransferOption((Instrument) it4.next(), TransferOptions.DebitCard));
                    }
                    break;
                case 4:
                    ArrayList forType2 = forType(list5, CashInstrumentType.CREDIT_CARD);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(forType2, i));
                    Iterator it5 = forType2.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(transferOptionPickerResolver.toTransferOption((Instrument) it5.next(), TransferOptions.CreditCard));
                    }
                    break;
                case 5:
                    ArrayList forType3 = forType(list5, CashInstrumentType.BANK_ACCOUNT);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(forType3, i));
                    Iterator it6 = forType3.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(transferOptionPickerResolver.toTransferOption((Instrument) it6.next(), TransferOptions.BankAccount));
                    }
                    break;
                case 6:
                    if (z && forType(list5, CashInstrumentType.DEBIT_CARD).isEmpty()) {
                        TransferOptionPickerSelection transferOptionPickerSelection4 = new TransferOptionPickerSelection(TransferOptions.LinkDebit, null);
                        String str10 = androidStringManager.get(R.string.transfer_option_picker_link_debit_card);
                        listOfNotNull = CollectionsKt__CollectionsJVMKt.listOf(new ResolvedTransferOption(transferOptionPickerSelection4, new TransferOptionPickerSelectedOption(transferOptionPickerSelection4, str10, (TransferOptionPickerDisplayIcon.Instrument) null, (String) null, 24), new InstrumentCellViewModel(str10, null, true, CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.LocalIcon(Icons.Add24, InstrumentIcon.LocalIcon.IconTint.SUBTLE, InstrumentIcon.LocalIcon.IconBackground.SUBTLE, null, null, 24)), null, null, null, null, null, 480)));
                        continue;
                    } else {
                        listOfNotNull = EmptyList.INSTANCE;
                    }
                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) listOfNotNull, arrayList3);
                    transferOptionPickerResolver = this;
                    list5 = list2;
                    i = 10;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            listOfNotNull = arrayList;
            CollectionsKt__MutableCollectionsKt.addAll((Iterable) listOfNotNull, arrayList3);
            transferOptionPickerResolver = this;
            list5 = list2;
            i = 10;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            Object next = it7.next();
            String optionValue = X25519.getOptionValue(((ResolvedTransferOption) next).selectedOption.selection);
            Locale locale2 = Locale.US;
            locale2.getClass();
            String lowerCase2 = optionValue.toLowerCase(locale2);
            lowerCase2.getClass();
            if (!set.contains(lowerCase2)) {
                arrayList6.add(next);
            }
        }
        return arrayList6;
    }

    public final ResolvedTransferOption toTransferOption(Instrument instrument, TransferOptions transferOptions) {
        String selectionString;
        TransferOptionPickerSelection transferOptionPickerSelection = new TransferOptionPickerSelection(transferOptions, instrument.token);
        CashInstrumentType cashInstrumentType = instrument.cashInstrumentType;
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i = iArr[cashInstrumentType.ordinal()];
        AndroidStringManager androidStringManager = this.stringManager;
        if (i == 1) {
            selectionString = instrument.displayName;
            selectionString.getClass();
        } else {
            selectionString = GoogleMapKt.selectionString(instrument, androidStringManager);
        }
        String str = selectionString;
        String str2 = iArr[cashInstrumentType.ordinal()] == 1 ? androidStringManager.get(R.string.payment_instrument_no_fee) : instrument.bankName;
        return new ResolvedTransferOption(transferOptionPickerSelection, new TransferOptionPickerSelectedOption(transferOptionPickerSelection, str, new TransferOptionPickerDisplayIcon.Instrument(instrument), cashInstrumentType == CashInstrumentType.DEBIT_CARD ? str2 : null, 16), new InstrumentCellViewModel(str, str2, true, CollectionsKt__CollectionsJVMKt.listOf(GoogleMapKt.instrumentIcon$default(instrument, null, null, 7)), InstrumentCellViewModel.Accessory.Radio.INSTANCE, null, null, null, null, 480));
    }
}
