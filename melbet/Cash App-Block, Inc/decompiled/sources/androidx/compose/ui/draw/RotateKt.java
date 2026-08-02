package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.StackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.StackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinRoundUpsCardUpsellScreen;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.screens.PaidInBitcoinCardUpsellScreen;
import com.squareup.cash.cdf.crypto.CryptoAllocatePayrollStart;
import com.squareup.cash.cdf.crypto.CryptoStackStart;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.receiveasbitcoin.ReceiveP2PAsBitcoinState;
import com.squareup.cash.featureflags.AmplitudeExperiments$FpBitcoinGrowToolsManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.protovalidation.IllegalArgumentCountException;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.protos.cash.postcard.CashAppCard;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.KClass;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class RotateKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object handleStackingToolsPaidInBitcoinNavigation(PaidInBitcoinState paidInBitcoinState, BetterNavigator.ScreenNavigator screenNavigator, RealPaidInBitcoinNavigator realPaidInBitcoinNavigator, Analytics analytics, CryptoStackStart.EntryPoint entryPoint, FeatureFlagManager featureFlagManager, RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker, ContinuationImpl continuationImpl) {
        StackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1 stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1;
        int i;
        PaidInBitcoinState paidInBitcoinState2;
        boolean z;
        if (continuationImpl instanceof StackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1) {
            stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1 = (StackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1) continuationImpl;
            int i2 = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z2 = paidInBitcoinState.hasDirectDepositAccount;
                    boolean z3 = paidInBitcoinState.paidInBitcoinEnabled;
                    CashAppCard.PhysicalCardOrderState physicalCardOrderState = paidInBitcoinState.cardState;
                    boolean z4 = (z2 || physicalCardOrderState == CashAppCard.PhysicalCardOrderState.ACTIVATED) && z3;
                    ScaleKt.trackStackingToolStartEvent(analytics, BitcoinStackingToolsInfoScreen.Type.PAID_IN_BITCOIN, entryPoint, Boolean.valueOf(z4));
                    if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$FpBitcoinGrowToolsManager.INSTANCE)).enabled()) {
                        if ((paidInBitcoinState.hasDirectDepositAccount || physicalCardOrderState == CashAppCard.PhysicalCardOrderState.ACTIVATED) && z3) {
                            Integer num = paidInBitcoinState.allocationBps;
                            realPaidInBitcoinNavigator.navigateToLandingScreen(num != null ? num.intValue() : 0, new BitcoinHome(null, null, null, null, 15));
                        } else {
                            onboardPaidInBitcoin(paidInBitcoinState, screenNavigator, realPaidInBitcoinNavigator);
                        }
                        return Unit.INSTANCE;
                    }
                    GrowToolsManagerScreen.Origin origin = GrowToolsManagerScreen.Origin.BITCOIN;
                    GrowToolsManagerScreen.InvestmentType investmentType = GrowToolsManagerScreen.InvestmentType.DIRECT_DEPOSIT;
                    stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.L$0 = paidInBitcoinState;
                    stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.L$1 = screenNavigator;
                    stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.L$2 = realPaidInBitcoinNavigator;
                    stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.Z$0 = z4;
                    stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.label = 1;
                    Object hasTracked = realGrowToolsManagerViewAppearanceTracker.hasTracked(origin, investmentType, stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1);
                    if (hasTracked == obj2) {
                        return obj2;
                    }
                    paidInBitcoinState2 = paidInBitcoinState;
                    z = z4;
                    obj = hasTracked;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.Z$0;
                    realPaidInBitcoinNavigator = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.L$2;
                    screenNavigator = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.L$1;
                    paidInBitcoinState2 = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!z || booleanValue) {
                    screenNavigator.goTo(new GrowToolsManagerScreen.ManageDirectDepositScreen(GrowToolsManagerScreen.Origin.BITCOIN));
                } else {
                    onboardPaidInBitcoin(paidInBitcoinState2, screenNavigator, realPaidInBitcoinNavigator);
                }
                return Unit.INSTANCE;
            }
        }
        stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1 = new StackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1(continuationImpl);
        Object obj3 = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        if (z) {
        }
        screenNavigator.goTo(new GrowToolsManagerScreen.ManageDirectDepositScreen(GrowToolsManagerScreen.Origin.BITCOIN));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object handleStackingToolsReceiveAsBitcoinNavigation(ReceiveP2PAsBitcoinState receiveP2PAsBitcoinState, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, CryptoStackStart.EntryPoint entryPoint, RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker, ContinuationImpl continuationImpl) {
        StackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1 stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1;
        int i;
        boolean z;
        if (continuationImpl instanceof StackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1) {
            stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1 = (StackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1) continuationImpl;
            int i2 = stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    z = (receiveP2PAsBitcoinState instanceof ReceiveP2PAsBitcoinState.Active) || (receiveP2PAsBitcoinState instanceof ReceiveP2PAsBitcoinState.Paused);
                    ScaleKt.trackStackingToolStartEvent(analytics, BitcoinStackingToolsInfoScreen.Type.RECEIVE_P2P_AS_BITCOIN, entryPoint, Boolean.valueOf(z));
                    GrowToolsManagerScreen.Origin origin = GrowToolsManagerScreen.Origin.BITCOIN;
                    GrowToolsManagerScreen.InvestmentType investmentType = GrowToolsManagerScreen.InvestmentType.RECEIVE_P2P_AS_BITCOIN;
                    stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.L$1 = screenNavigator;
                    stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.Z$0 = z;
                    stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.label = 1;
                    obj = realGrowToolsManagerViewAppearanceTracker.hasTracked(origin, investmentType, stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.Z$0;
                    screenNavigator = stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!z || booleanValue) {
                    screenNavigator.goTo(new GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen(GrowToolsManagerScreen.Origin.BITCOIN));
                } else {
                    screenNavigator.goTo(new BitcoinStackingToolsInfoScreen(BitcoinStackingToolsInfoScreen.Type.RECEIVE_P2P_AS_BITCOIN));
                }
                return Unit.INSTANCE;
            }
        }
        stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1 = new StackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1(continuationImpl);
        Object obj3 = stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        if (z) {
        }
        screenNavigator.goTo(new GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen(GrowToolsManagerScreen.Origin.BITCOIN));
        return Unit.INSTANCE;
    }

    public static final void onboardBitcoinRoundUps(Navigator navigator, boolean z) {
        navigator.getClass();
        if (z) {
            navigator.goTo(new BitcoinStackingToolsInfoScreen(BitcoinStackingToolsInfoScreen.Type.ROUND_UPS));
        } else {
            navigator.goTo(BitcoinRoundUpsCardUpsellScreen.INSTANCE);
        }
    }

    public static final void onboardPaidInBitcoin(PaidInBitcoinState paidInBitcoinState, Navigator navigator, RealPaidInBitcoinNavigator realPaidInBitcoinNavigator) {
        CashAppCard.PhysicalCardOrderState physicalCardOrderState;
        CashAppCard.PhysicalCardOrderState physicalCardOrderState2;
        paidInBitcoinState.getClass();
        navigator.getClass();
        realPaidInBitcoinNavigator.getClass();
        if (paidInBitcoinState.hasDirectDepositAccount || (physicalCardOrderState = paidInBitcoinState.cardState) == (physicalCardOrderState2 = CashAppCard.PhysicalCardOrderState.ACTIVATED)) {
            navigator.goTo(new BitcoinStackingToolsInfoScreen(BitcoinStackingToolsInfoScreen.Type.PAID_IN_BITCOIN));
        } else {
            if (physicalCardOrderState == physicalCardOrderState2) {
                navigator.goTo(new BitcoinStackingToolsInfoScreen(BitcoinStackingToolsInfoScreen.Type.PAID_IN_BITCOIN));
                return;
            }
            realPaidInBitcoinNavigator.analytics.track(new CryptoAllocatePayrollStart(0, physicalCardOrderState == CashAppCard.PhysicalCardOrderState.PENDING_ACTIVATION ? CryptoAllocatePayrollStart.AllocatePayrollStateType.CARD_NOT_ACTIVATED : CryptoAllocatePayrollStart.AllocatePayrollStateType.NO_CARD), null);
            realPaidInBitcoinNavigator.navigator.goTo(PaidInBitcoinCardUpsellScreen.INSTANCE);
        }
    }

    public static final Modifier rotate(Modifier modifier, float f) {
        return f == RecyclerView.DECELERATION_RATE ? modifier : ColorKt.m687graphicsLayer_6ThJ44$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, null, 524031);
    }

    public static final ProtoParsingError toProtoParsingExceptionFor(Exception exc, KClass kClass, ProtoParsingError.Factory factory, String str) {
        Pair pair;
        factory.getClass();
        if (exc instanceof ProtoParsingError) {
            return (ProtoParsingError) exc;
        }
        if (exc instanceof IllegalArgumentException) {
            ProtoParsingError.ErrorType errorType = ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING;
            String message = exc.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            pair = new Pair(errorType, message);
        } else {
            pair = exc instanceof IllegalArgumentCountException ? new Pair(ProtoParsingError.ErrorType.REQUIRED_FIELD_COUNT_MISSING, ((IllegalArgumentCountException) exc).field) : new Pair(null, null);
        }
        ProtoParsingError.ErrorType errorType2 = (ProtoParsingError.ErrorType) pair.first;
        String str2 = (String) pair.second;
        if (str == null) {
            str = kClass != null ? String.valueOf(kClass.getSimpleName()) : null;
            if (str == null) {
                str = "Unknown";
            }
        }
        return factory.create(str, errorType2, str2, exc);
    }
}
