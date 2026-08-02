package com.squareup.cash.amountslider.presenters;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes5.dex */
public final class RealAmountSelectorPresenter implements AmountSelectorPresenter {
    public static final MathContext TWO_DIGIT_CONTEXT = new MathContext(2, RoundingMode.HALF_UP);
    public final MoneyFormatter moneyFormatter;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public RealAmountSelectorPresenter(AndroidStringManager androidStringManager, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, SyncValueReader syncValueReader, LocalizedMoneyFormatter.Factory factory) {
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public final List toAmounts(TradeType tradeType, String str, Long l, CurrencyCode currencyCode) {
        SyncValueSpec syncValueSpec;
        currencyCode.getClass();
        AndroidStringManager androidStringManager = this.stringManager;
        AmountSelection.TradeCustomize tradeCustomize = new AmountSelection.TradeCustomize(androidStringManager.get(R.string.amount_selection_customize), androidStringManager.get(R.string.content_description_more_options));
        int ordinal = tradeType.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            int ordinal2 = tradeType.ordinal();
            if (ordinal2 == 0) {
                syncValueSpec = AndroidSyncValueSpecs.BitcoinPurchaseAtmPicker;
            } else {
                if (ordinal2 != 1) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(tradeType, "No sync value type for ");
                    return null;
                }
                syncValueSpec = AndroidSyncValueSpecs.EquitiesPurchaseAtmPicker;
            }
            List list = (List) this.syncValueReader.getFirstValueOrDefault(syncValueSpec, null, new CardMessageQueries$$ExternalSyntheticLambda1(27)).getValue();
            if (list == null) {
                return CollectionsKt__CollectionsKt.listOf((Object[]) new AmountSelection[]{toTrade(100L, currencyCode), toTrade(1000L, currencyCode), toTrade(2000L, currencyCode), toTrade(5000L, currencyCode), toTrade(10000L, currencyCode), tradeCustomize});
            }
            List<Money> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Money money : list2) {
                Long l2 = money.amount;
                l2.getClass();
                arrayList.add(new AmountSelection.TradeSome(l2.longValue(), this.moneyFormatter.format(money)));
            }
            return CollectionsKt.plus((Collection) arrayList, (Object) tradeCustomize);
        }
        if (ordinal != 2 && ordinal != 3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        str.getClass();
        BigDecimal bigDecimal = new BigDecimal(str);
        l.getClass();
        BigDecimal valueOf = BigDecimal.valueOf(l.longValue());
        valueOf.getClass();
        BigDecimal multiply = bigDecimal.multiply(valueOf);
        multiply.getClass();
        long longValue = multiply.longValue();
        AmountSelection.TradeAll tradeAll = new AmountSelection.TradeAll(longValue, androidStringManager.get(tradeType == TradeType.SELL_BITCOIN ? R.string.amount_selection_all : R.string.amount_selection_sell_all), str, false);
        if (longValue < 200) {
            return CollectionsKt__CollectionsJVMKt.listOf(tradeAll);
        }
        if (longValue < 500) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new AmountSelection[]{toTrade(100L, currencyCode), tradeAll, tradeCustomize});
        }
        if (longValue < 600) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new AmountSelection[]{toTrade(100L, currencyCode), toTrade(200L, currencyCode), toTrade(300L, currencyCode), toTrade(400L, currencyCode), tradeAll, tradeCustomize});
        }
        Double[] dArr = {Double.valueOf(0.1d), Double.valueOf(0.25d), Double.valueOf(0.5d), Double.valueOf(0.75d)};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList2.add(Long.valueOf(new BigDecimal(longValue * dArr[i].doubleValue()).setScale(-2, RoundingMode.HALF_UP).round(TWO_DIGIT_CONTEXT).longValue()));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(toTrade(((Number) it.next()).longValue(), currencyCode));
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList3, (Object) tradeAll), (Object) tradeCustomize);
    }

    public final AmountSelection.TradeSome toTrade(long j, CurrencyCode currencyCode) {
        Money money = new Money(Long.valueOf(j), currencyCode, 4);
        Long l = money.amount;
        l.getClass();
        return new AmountSelection.TradeSome(l.longValue(), this.moneyFormatter.format(money));
    }
}
