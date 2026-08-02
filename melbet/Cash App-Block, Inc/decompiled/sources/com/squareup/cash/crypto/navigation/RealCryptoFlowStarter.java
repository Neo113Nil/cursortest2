package com.squareup.cash.crypto.navigation;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.zipline.internal.JsonEngineKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.primitives.BitcoinFeature;
import com.squareup.cash.crypto.scenarioplans.models.CryptoOnboardingScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.InitiateBitcoinExchangeScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.InitiateBitcoinWithdrawalScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.InitiateStablecoinWithdrawalScenarioPlanInput;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.protos.cash.cryptoinvestflow.service.CashInInstrument;
import com.squareup.protos.cash.cryptoinvestflow.service.CashInInstrumentType;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest$Amount$AllSourceAmount;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest$Amount$SourceAmount;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest$Amount$TargetAmount;
import com.squareup.protos.cash.cryptoinvestflow.service.UserInteractionContext;
import com.squareup.protos.cash.investautomator.api.flows.InitiateRoundUpOnboardingFlowParameters;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investautomator.model.Automation$AllocationStrategy$Type$RoundUp;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealCryptoFlowStarter implements CryptoFlowStarter {
    public final RealBitcoinConfigRepo bitcoinConfigRepo;
    public final FlowStarter flowStarter;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealCryptoFlowStarter(RealBitcoinConfigRepo realBitcoinConfigRepo, FlowStarter flowStarter) {
        this.bitcoinConfigRepo = realBitcoinConfigRepo;
        this.flowStarter = flowStarter;
    }

    public static void initiateBitcoinExchange(ExchangeRequest exchangeRequest, BitcoinExchangeType bitcoinExchangeType, Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        ExchangeRequest copy$default;
        ExchangeRequest copy$default2 = ExchangeRequest.copy$default(exchangeRequest, bitcoinExchangeType.getSourceCurrency(), bitcoinExchangeType.getTargetCurrency(), null, null, null, null, new UserInteractionContext(UserInteractionContext.Applet.BTC), null, null, 7164);
        JsonEngineKt jsonEngineKt = null;
        if (bitcoinExchangeType instanceof BitcoinExchangeType.BuyBitcoin) {
            Long l = ((BitcoinExchangeType.BuyBitcoin) bitcoinExchangeType).money.amount;
            copy$default = ExchangeRequest.copy$default(copy$default2, null, null, l != null ? new ExchangeRequest$Amount$SourceAmount(l.longValue()) : null, null, null, null, null, null, null, 8187);
        } else if (bitcoinExchangeType instanceof BitcoinExchangeType.SellAllBitcoin) {
            copy$default = ExchangeRequest.copy$default(copy$default2, null, null, new ExchangeRequest$Amount$AllSourceAmount(true), null, null, null, null, null, null, 8187);
        } else if (bitcoinExchangeType instanceof BitcoinExchangeType.SellBitcoin) {
            Long l2 = ((BitcoinExchangeType.SellBitcoin) bitcoinExchangeType).money.amount;
            copy$default = ExchangeRequest.copy$default(copy$default2, null, null, l2 != null ? new ExchangeRequest$Amount$TargetAmount(l2.longValue()) : null, null, null, null, null, null, null, 8187);
        } else {
            if (!(bitcoinExchangeType instanceof BitcoinExchangeType.ConvertToBitcoin)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType convertToBitcoinType = ((BitcoinExchangeType.ConvertToBitcoin) bitcoinExchangeType).f1118type;
            if (convertToBitcoinType instanceof BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertSome) {
                Long l3 = ((BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertSome) convertToBitcoinType).money.amount;
                if (l3 != null) {
                    jsonEngineKt = new ExchangeRequest$Amount$SourceAmount(l3.longValue());
                }
            } else {
                if (!(convertToBitcoinType instanceof BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertAll)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                jsonEngineKt = new ExchangeRequest$Amount$AllSourceAmount(true);
            }
            copy$default = ExchangeRequest.copy$default(copy$default2, null, null, jsonEngineKt, null, null, null, null, null, null, 8187);
        }
        screenNavigator.goTo(new ScenarioPlanScreens.ScenarioPlanLoadingScreen(ScenarioPlans.INITIATE_BITCOIN_EXCHANGE, new InitiateBitcoinExchangeScenarioPlanInput(copy$default, bitcoinExchangeType), screen, ColorModel.Bitcoin.INSTANCE));
    }

    public final Unit initiateCryptoPayment(CryptoPayment cryptoPayment, Screen screen, Navigator navigator) {
        navigator.goTo(new ScenarioPlanScreens.ScenarioPlanLoadingScreen(ScenarioPlans.INITIATE_BITCOIN_WITHDRAWAL, new InitiateBitcoinWithdrawalScenarioPlanInput(cryptoPayment), screen, ColorModel.Bitcoin.INSTANCE));
        return Unit.INSTANCE;
    }

    public final Unit initiateStablecoinPayment(SolanaAddress solanaAddress, Money money, String str, String str2, Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screenNavigator.goTo(new ScenarioPlanScreens.ScenarioPlanLoadingScreen(ScenarioPlans.INITIATE_STABLECOIN_WITHDRAWAL, new InitiateStablecoinWithdrawalScenarioPlanInput(solanaAddress, null, str, str2, money, null, 34), screen, new ColorModel.Accented(new Color(new Color.ModeVariant("#2775CA", null, null, null, null, 30, null), new Color.ModeVariant("#2775CA", null, null, null, null, 30, null), 4))));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startBitcoinRoundUpsEnrollment(BetterNavigator.ScreenNavigator screenNavigator, ContinuationImpl continuationImpl) {
        RealCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1 realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1;
        int i;
        BetterNavigator.ScreenNavigator screenNavigator2;
        if (continuationImpl instanceof RealCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1) {
            realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1 = (RealCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1) continuationImpl;
            int i2 = realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDisclosureProvider$special$$inlined$map$1 realDisclosureProvider$special$$inlined$map$1 = this.bitcoinConfigRepo.bitcoinInvestmentEntityToken;
                    realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.L$1 = screenNavigator;
                    realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.label = 1;
                    obj = FlowKt.first(realDisclosureProvider$special$$inlined$map$1, realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    screenNavigator2 = screenNavigator;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    screenNavigator2 = realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                Flow$Type flow$Type = Flow$Type.ROUND_UP_ONBOARDING;
                FeeType.Companion companion = Automation.AutomationStatus.Companion;
                RetailerType.Companion companion2 = Automation.AutomationTrigger.Companion;
                Automation.AllocationStrategy allocationStrategy = new Automation.AllocationStrategy(new Automation$AllocationStrategy$Type$RoundUp(new Automation.AllocationStrategy.RoundUp(new Integer(1))));
                ContactAliasType.Companion companion3 = Automation.AutomationTarget.Type.Companion;
                screenNavigator2.goTo(FlowStarter.startPlasmaFlowWithParams$default(this.flowStarter, flow$Type, new InitiateRoundUpOnboardingFlowParameters(null, new Automation(allocationStrategy, new Automation.AutomationTarget((String) obj)), Boolean.TRUE, ByteString.EMPTY), new BitcoinHome(null, null, null, null, 15), null, null, null, ColorModel.Bitcoin.INSTANCE, 888));
                return Unit.INSTANCE;
            }
        }
        realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1 = new RealCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1(this, continuationImpl);
        Object obj2 = realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1.label;
        if (i != 0) {
        }
        Flow$Type flow$Type2 = Flow$Type.ROUND_UP_ONBOARDING;
        FeeType.Companion companion4 = Automation.AutomationStatus.Companion;
        RetailerType.Companion companion22 = Automation.AutomationTrigger.Companion;
        Automation.AllocationStrategy allocationStrategy2 = new Automation.AllocationStrategy(new Automation$AllocationStrategy$Type$RoundUp(new Automation.AllocationStrategy.RoundUp(new Integer(1))));
        ContactAliasType.Companion companion32 = Automation.AutomationTarget.Type.Companion;
        screenNavigator2.goTo(FlowStarter.startPlasmaFlowWithParams$default(this.flowStarter, flow$Type2, new InitiateRoundUpOnboardingFlowParameters(null, new Automation(allocationStrategy2, new Automation.AutomationTarget((String) obj2)), Boolean.TRUE, ByteString.EMPTY), new BitcoinHome(null, null, null, null, 15), null, null, null, ColorModel.Bitcoin.INSTANCE, 888));
        return Unit.INSTANCE;
    }

    public final void startCryptoIdvFlow(BitcoinHome bitcoinHome, BetterNavigator.ScreenNavigator screenNavigator, BitcoinFeature bitcoinFeature) {
        screenNavigator.goTo(new ScenarioPlanScreens.ScenarioPlanLoadingScreen(ScenarioPlans.CRYPTO_ONBOARDING, new CryptoOnboardingScenarioPlanInput(bitcoinFeature), bitcoinHome, ColorModel.Bitcoin.INSTANCE));
    }

    public final Unit initiateBitcoinExchange(Screen screen, BetterNavigator.ScreenNavigator screenNavigator, BitcoinExchangeType bitcoinExchangeType, String str, String str2, Instrument instrument, Money money, Order.RecurringSchedule recurringSchedule) {
        CashInInstrument cashInInstrument;
        CashInInstrumentType cashInInstrumentType;
        if (instrument != null) {
            CashInstrumentType cashInstrumentType = instrument.cashInstrumentType;
            String str3 = instrument.token;
            String str4 = instrument.displayNameCompact;
            int i = WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
            if (i == 1) {
                cashInInstrumentType = CashInInstrumentType.DEBIT_CARD;
            } else if (i == 2) {
                cashInInstrumentType = CashInInstrumentType.BANK_ACCOUNT;
            } else {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(cashInstrumentType, "Unsupported instrument type for exchange request: ");
                return null;
            }
            cashInInstrument = new CashInInstrument(str3, str4, cashInInstrumentType, money, ByteString.EMPTY);
        } else {
            cashInInstrument = null;
        }
        initiateBitcoinExchange(new ExchangeRequest(null, null, null, str, str2, null, recurringSchedule, null, cashInInstrument, 5607), bitcoinExchangeType, screen, screenNavigator);
        return Unit.INSTANCE;
    }
}
