package com.squareup.cash.portfolio.graphs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.style.TextIndentKt;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.pools.presenters.PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.BigDecimalsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.UuidKt;
import kotlinx.coroutines.flow.Flow;
import okio.AsyncTimeout;

/* loaded from: classes6.dex */
public final class RealInvestingCryptoGraphHeaderPresenter implements MoleculePresenter {
    public final Flow activityFlow;
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public final RealCryptoValueRepo cryptoValueRepo;
    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 currencyCode;
    public final CurrencyConverter$Factory currencyConverterFactory;
    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 graphModelObservable;
    public final MoneyFormatter moneyFormatter;
    public final AndroidStringManager stringManager;
    public final MoneyFormatter titleFormatter;
    public final Money unitCurrency;

    public final class State {
        public final Money balance;
        public final Money convertedBalance;
        public final RealCurrencyConverter fiatCurrencyConverter;
        public final InvestingGraphContentModel graphModel;
        public final boolean hasActivity;
        public final HistoricalRange historicalRange;
        public final InvestingGraphContentModel.Point scrubPoint;
        public final Money unitPrice;

        public State(HistoricalRange historicalRange, InvestingGraphContentModel.Point point, RealCurrencyConverter realCurrencyConverter, Money money, Money money2, boolean z, Money money3, InvestingGraphContentModel investingGraphContentModel) {
            this.historicalRange = historicalRange;
            this.scrubPoint = point;
            this.fiatCurrencyConverter = realCurrencyConverter;
            this.balance = money;
            this.convertedBalance = money2;
            this.hasActivity = z;
            this.unitPrice = money3;
            this.graphModel = investingGraphContentModel;
        }

        public static State copy$default(State state, HistoricalRange historicalRange, InvestingGraphContentModel.Point point, RealCurrencyConverter realCurrencyConverter, Money money, Money money2, boolean z, Money money3, InvestingGraphContentModel investingGraphContentModel, int i) {
            if ((i & 1) != 0) {
                historicalRange = state.historicalRange;
            }
            HistoricalRange historicalRange2 = historicalRange;
            if ((i & 2) != 0) {
                point = state.scrubPoint;
            }
            InvestingGraphContentModel.Point point2 = point;
            if ((i & 4) != 0) {
                realCurrencyConverter = state.fiatCurrencyConverter;
            }
            RealCurrencyConverter realCurrencyConverter2 = realCurrencyConverter;
            if ((i & 8) != 0) {
                money = state.balance;
            }
            Money money4 = money;
            if ((i & 16) != 0) {
                money2 = state.convertedBalance;
            }
            Money money5 = money2;
            if ((i & 32) != 0) {
                z = state.hasActivity;
            }
            boolean z2 = z;
            Money money6 = (i & 64) != 0 ? state.unitPrice : money3;
            InvestingGraphContentModel investingGraphContentModel2 = (i & 128) != 0 ? state.graphModel : investingGraphContentModel;
            state.getClass();
            return new State(historicalRange2, point2, realCurrencyConverter2, money4, money5, z2, money6, investingGraphContentModel2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.historicalRange == state.historicalRange && Intrinsics.areEqual(this.scrubPoint, state.scrubPoint) && Intrinsics.areEqual(this.fiatCurrencyConverter, state.fiatCurrencyConverter) && Intrinsics.areEqual(this.balance, state.balance) && Intrinsics.areEqual(this.convertedBalance, state.convertedBalance) && this.hasActivity == state.hasActivity && Intrinsics.areEqual(this.unitPrice, state.unitPrice) && Intrinsics.areEqual(this.graphModel, state.graphModel);
        }

        public final int hashCode() {
            HistoricalRange historicalRange = this.historicalRange;
            int hashCode = (historicalRange == null ? 0 : historicalRange.hashCode()) * 31;
            InvestingGraphContentModel.Point point = this.scrubPoint;
            int hashCode2 = (hashCode + (point == null ? 0 : point.hashCode())) * 31;
            RealCurrencyConverter realCurrencyConverter = this.fiatCurrencyConverter;
            int hashCode3 = (hashCode2 + (realCurrencyConverter == null ? 0 : realCurrencyConverter.hashCode())) * 31;
            Money money = this.balance;
            int hashCode4 = (hashCode3 + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.convertedBalance;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (money2 == null ? 0 : money2.hashCode())) * 31, 31, this.hasActivity);
            Money money3 = this.unitPrice;
            int hashCode5 = (m + (money3 == null ? 0 : money3.hashCode())) * 31;
            InvestingGraphContentModel investingGraphContentModel = this.graphModel;
            return hashCode5 + (investingGraphContentModel != null ? investingGraphContentModel.hashCode() : 0);
        }

        public final String toString() {
            return "State(historicalRange=" + this.historicalRange + ", scrubPoint=" + this.scrubPoint + ", fiatCurrencyConverter=" + this.fiatCurrencyConverter + ", balance=" + this.balance + ", convertedBalance=" + this.convertedBalance + ", hasActivity=" + this.hasActivity + ", unitPrice=" + this.unitPrice + ", graphModel=" + this.graphModel + ")";
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoricalRange.values().length];
            try {
                AsyncTimeout.Companion companion = HistoricalRange.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AsyncTimeout.Companion companion2 = HistoricalRange.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AsyncTimeout.Companion companion3 = HistoricalRange.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AsyncTimeout.Companion companion4 = HistoricalRange.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AsyncTimeout.Companion companion5 = HistoricalRange.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealInvestingCryptoGraphHeaderPresenter(CurrencyConverter$Factory currencyConverter$Factory, AndroidStringManager androidStringManager, RealCryptoBalanceRepo realCryptoBalanceRepo, RealCryptoValueRepo realCryptoValueRepo, RealJurisdictionConfigManager realJurisdictionConfigManager, LocalizedMoneyFormatter.Factory factory, RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1, Flow flow, Money money) {
        this.currencyConverterFactory = currencyConverter$Factory;
        this.stringManager = androidStringManager;
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.cryptoValueRepo = realCryptoValueRepo;
        this.graphModelObservable = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
        this.activityFlow = flow;
        this.unitCurrency = money;
        this.titleFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.moneyFormatter = factory.createSymbolAndCode();
        this.currencyCode = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(realJurisdictionConfigManager.select(), 16), 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        RealInvestingCryptoGraphHeaderPresenter realInvestingCryptoGraphHeaderPresenter;
        Long l;
        BigDecimal bigDecimal;
        String str;
        boolean z;
        String concat;
        InvestingCryptoImage investingCryptoImage;
        TextIndentKt investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
        CurrencyCode currencyCode;
        List points;
        float f;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-921654004);
        Object rememberedValue = gapComposer.rememberedValue();
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.cryptoValueRepo.valuePerBitcoin(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(new State(null, null, null, null, null, false, null, null));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new AndroidFileSaver$save$2((Object) this, (Object) mutableState, (Continuation) (objArr == true ? 1 : 0), 10);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        CurrencyCode currencyCode2 = this.unitCurrency.currency_code;
        if (currencyCode2 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, currencyCode2, new RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1(currencyCode2, objArr5 == true ? 1 : 0, this, mutableState, 0));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Money money = ((State) mutableState.getValue()).balance;
        if (money != null) {
            gapComposer.startReplaceGroup(-1106477359);
            realInvestingCryptoGraphHeaderPresenter = this;
            Updater.LaunchedEffect(gapComposer, money, new RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1(money, objArr4 == true ? 1 : 0, realInvestingCryptoGraphHeaderPresenter, mutableState, 1));
            gapComposer.end(false);
        } else {
            realInvestingCryptoGraphHeaderPresenter = this;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        RealCurrencyConverter realCurrencyConverter = ((State) mutableState.getValue()).fiatCurrencyConverter;
        Money money2 = ((State) mutableState.getValue()).balance;
        if (realCurrencyConverter == null || money2 == null) {
            gapComposer.startReplaceGroup(-1383879796);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1383927846);
            Updater.LaunchedEffect(realCurrencyConverter, money2, new PhonePlansHomePresenter$models$1$1(realCurrencyConverter, money2, null, mutableState), gapComposer);
            gapComposer.end(false);
        }
        Money money3 = (Money) collectAsState.getValue();
        if (money3 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, money3, new AndroidFileSaver$save$2((Object) money3, (Continuation) (objArr3 == true ? 1 : 0), (Object) mutableState, 9));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(6, mutableState, objArr2 == true ? 1 : 0, flow));
        State state = (State) mutableState.getValue();
        InvestingGraphContentModel investingGraphContentModel = state.graphModel;
        boolean z2 = state.hasActivity;
        Money money4 = state.convertedBalance;
        Money money5 = state.unitPrice;
        if (investingGraphContentModel == null || (points = investingGraphContentModel.getPoints()) == null || !(!points.isEmpty())) {
            l = money5 != null ? money5.amount : null;
            bigDecimal = null;
        } else {
            InvestingGraphContentModel.Loaded loaded = investingGraphContentModel instanceof InvestingGraphContentModel.Loaded ? (InvestingGraphContentModel.Loaded) investingGraphContentModel : null;
            Long l2 = loaded != null ? loaded.firstTickY : null;
            Number number = money5 != null ? money5.amount : null;
            InvestingGraphContentModel.Point point = state.scrubPoint;
            if (point != null) {
                f = point.y;
            } else {
                if (number == null) {
                    f = ((InvestingGraphContentModel.Point) CollectionsKt.last(investingGraphContentModel.getPoints())).y;
                }
                long longValue = number.longValue();
                l = Long.valueOf(longValue);
                bigDecimal = UuidKt.movement(true, longValue, l2 == null ? l2.longValue() : (long) ((InvestingGraphContentModel.Point) CollectionsKt.first(investingGraphContentModel.getPoints())).y);
            }
            number = Float.valueOf(f);
            long longValue2 = number.longValue();
            l = Long.valueOf(longValue2);
            bigDecimal = UuidKt.movement(true, longValue2, l2 == null ? l2.longValue() : (long) ((InvestingGraphContentModel.Point) CollectionsKt.first(investingGraphContentModel.getPoints())).y);
        }
        if (l != null) {
            long longValue3 = l.longValue();
            if (money4 != null && (currencyCode = money4.currency_code) != null) {
                str = realInvestingCryptoGraphHeaderPresenter.moneyFormatter.format(new Money(Long.valueOf(longValue3), currencyCode, 4));
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                if (z2) {
                    str3 = str;
                } else {
                    String format2 = money4 != null ? realInvestingCryptoGraphHeaderPresenter.titleFormatter.format(money4) : null;
                    if (format2 != null) {
                        str3 = format2;
                    }
                }
                z = (investingGraphContentModel == null ? investingGraphContentModel.getAccentColor() : null) instanceof InvestingGraphContentModel$AccentColorType$StaleData;
                InvestingHomePortfolioHeaderContentModel.TitleColorType titleColorType = !z ? InvestingHomePortfolioHeaderContentModel.TitleColorType.STALE : InvestingHomePortfolioHeaderContentModel.TitleColorType.UP_TO_DATE;
                Money money6 = state.balance;
                if (z) {
                    if (bigDecimal == null) {
                        concat = null;
                    } else {
                        BigDecimal abs = bigDecimal.abs();
                        abs.getClass();
                        concat = BigDecimalsKt.toPrettyString(abs, false).concat("%");
                    }
                    if (bigDecimal != null) {
                        InvestingCryptoImage.Companion.getClass();
                        investingCryptoImage = zza.icon(bigDecimal);
                    } else {
                        investingCryptoImage = null;
                    }
                    String str4 = z2 ? str : null;
                    HistoricalRange historicalRange = state.historicalRange;
                    int i2 = historicalRange == null ? -1 : WhenMappings.$EnumSwitchMapping$0[historicalRange.ordinal()];
                    AndroidStringManager androidStringManager = realInvestingCryptoGraphHeaderPresenter.stringManager;
                    if (i2 == 1) {
                        str2 = androidStringManager.get(R.string.portfolio_value_today);
                    } else if (i2 == 2) {
                        str2 = androidStringManager.get(R.string.portfolio_value_past_week);
                    } else if (i2 == 3) {
                        str2 = androidStringManager.get(R.string.portfolio_value_past_month);
                    } else if (i2 == 4) {
                        str2 = androidStringManager.get(R.string.portfolio_value_past_year);
                    } else if (i2 == 5) {
                        str2 = androidStringManager.get(R.string.portfolio_value_all);
                    }
                    investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData = new InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData(str4, investingCryptoImage, concat, str2, ColorModel.Bitcoin.INSTANCE);
                } else {
                    investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData = InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData.INSTANCE;
                }
                InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = new InvestingHomePortfolioHeaderContentModel(str3, titleColorType, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, money6);
                gapComposer.end(false);
                return investingHomePortfolioHeaderContentModel;
            }
        }
        str = null;
        String str32 = "";
        if (str == null) {
        }
        if (z2) {
        }
        z = (investingGraphContentModel == null ? investingGraphContentModel.getAccentColor() : null) instanceof InvestingGraphContentModel$AccentColorType$StaleData;
        if (!z) {
        }
        Money money62 = state.balance;
        if (z) {
        }
        InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel2 = new InvestingHomePortfolioHeaderContentModel(str32, titleColorType, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, money62);
        gapComposer.end(false);
        return investingHomePortfolioHeaderContentModel2;
    }
}
