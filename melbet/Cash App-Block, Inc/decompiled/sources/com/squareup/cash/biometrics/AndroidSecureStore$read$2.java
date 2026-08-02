package com.squareup.cash.biometrics;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.compose.material.SwipeableState$animateTo$2;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.google.mlkit.vision.text.zza;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.banking.presenters.BalanceHomePresenter;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsQrCodeModel;
import com.squareup.cash.bitcoin.presenters.MoveBitcoinPresenter;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsInfoPresenter;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.deposits.RealLightningInvoiceGenerator;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.EarnerEnrollmentSuccessBlockerPresenter;
import com.squareup.cash.blockers.presenters.InstrumentSelectionBlockerPresenter$models$1$5$1;
import com.squareup.cash.blockers.presenters.PasscodePresenter;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$1$2;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$2$1$1;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter;
import com.squareup.cash.blockers.presenters.SetPinPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.crypto.CryptoDepositCreateInvoice;
import com.squareup.cash.cdf.crypto.CryptoDepositStart;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.cash.crypto.amount.CryptoCurrency;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsAvailability;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.offers.presenters.OffersAnalyticsKt;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.screens.Back;
import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Request;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Response;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker;
import com.squareup.util.android.Emails;
import com.squareup.util.android.PhoneNumbers;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.Key;
import java.security.PrivateKey;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.sync.MutexImpl;
import okhttp3.ConnectionPool;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class AndroidSecureStore$read$2 extends SuspendLambda implements Function2 {
    public Object $key;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSecureStore$read$2(RealBoostSelector realBoostSelector, String str, String str2, Function1 function1, BlockersData.MoneybotContext moneybotContext, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 29;
        this.L$0 = realBoostSelector;
        this.L$2 = str;
        this.$key = str2;
        this.L$1 = function1;
        this.this$0 = moneybotContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new AndroidSecureStore$read$2((AndroidSecureStore) obj2, (String) this.$key, continuation);
            case 1:
                AndroidSecureStore$read$2 androidSecureStore$read$2 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (AfterpayAppletPurchasesEmbeddedPresenter) obj2, (UiCallbackModel) this.L$2, (UiCallbackModel) this.$key, 1);
                androidSecureStore$read$2.L$0 = obj;
                return androidSecureStore$read$2;
            case 2:
                AndroidSecureStore$read$2 androidSecureStore$read$22 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (CoroutineScope) obj2, (LocalCashBalancePresenter) this.L$2, (MutableState) this.$key, 2);
                androidSecureStore$read$22.L$0 = obj;
                return androidSecureStore$read$22;
            case 3:
                AndroidSecureStore$read$2 androidSecureStore$read$23 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (TapToPayPresenter) obj2, (MutableState) this.L$2, (State) this.$key, 3);
                androidSecureStore$read$23.L$0 = obj;
                return androidSecureStore$read$23;
            case 4:
                AndroidSecureStore$read$2 androidSecureStore$read$24 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (BalanceHomePresenter) obj2, (State) this.L$2, (State) this.$key, 4);
                androidSecureStore$read$24.L$0 = obj;
                return androidSecureStore$read$24;
            case 5:
                AndroidSecureStore$read$2 androidSecureStore$read$25 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (LocalHomePresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 5);
                androidSecureStore$read$25.L$0 = obj;
                return androidSecureStore$read$25;
            case 6:
                AndroidSecureStore$read$2 androidSecureStore$read$26 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (BenefitsHomePresenter) obj2, (MutableState) this.L$2, (State) this.$key, 6);
                androidSecureStore$read$26.L$0 = obj;
                return androidSecureStore$read$26;
            case 7:
                AndroidSecureStore$read$2 androidSecureStore$read$27 = new AndroidSecureStore$read$2((AndroidBiometrics) this.L$1, (Activity) obj2, (Biometrics$Info) this.L$2, (AndroidSecureValue) this.$key, continuation, 7);
                androidSecureStore$read$27.L$0 = obj;
                return androidSecureStore$read$27;
            case 8:
                return new AndroidSecureStore$read$2((TapToPayPresenter) this.L$0, (MutableState) this.L$1, (MutableState) obj2, (MutableState) this.L$2, (MutableState) this.$key, continuation, 8);
            case 9:
                AndroidSecureStore$read$2 androidSecureStore$read$28 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (MutableSharedFlow) obj2, (MoveBitcoinPresenter) this.L$2, (MutableState) this.$key, 9);
                androidSecureStore$read$28.L$0 = obj;
                return androidSecureStore$read$28;
            case 10:
                AndroidSecureStore$read$2 androidSecureStore$read$29 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (PoolsListPresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 10);
                androidSecureStore$read$29.L$0 = obj;
                return androidSecureStore$read$29;
            case 11:
                AndroidSecureStore$read$2 androidSecureStore$read$210 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (MutableState) obj2, (MutableState) this.L$2, (StuckPlayerDetector) this.$key, 11);
                androidSecureStore$read$210.L$0 = obj;
                return androidSecureStore$read$210;
            case 12:
                AndroidSecureStore$read$2 androidSecureStore$read$211 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (MutableState) obj2, (State) this.L$2, (HCaptcha) this.$key, 12);
                androidSecureStore$read$211.L$0 = obj;
                return androidSecureStore$read$211;
            case 13:
                AndroidSecureStore$read$2 androidSecureStore$read$212 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (RealBugReportSenderFactory) obj2, (BetterNavigator.ScreenNavigator) this.L$2, (State) this.$key, 13);
                androidSecureStore$read$212.L$0 = obj;
                return androidSecureStore$read$212;
            case 14:
                AndroidSecureStore$read$2 androidSecureStore$read$213 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (LocalHomePresenter) obj2, (State) this.L$2, (State) this.$key, 14);
                androidSecureStore$read$213.L$0 = obj;
                return androidSecureStore$read$213;
            case 15:
                AndroidSecureStore$read$2 androidSecureStore$read$214 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (BitcoinStackingToolsInfoPresenter) obj2, (State) this.L$2, (MutableState) this.$key, 15);
                androidSecureStore$read$214.L$0 = obj;
                return androidSecureStore$read$214;
            case 16:
                return new AndroidSecureStore$read$2((BitcoinStackingToolsPresenter) this.L$0, (BetterNavigator.ScreenNavigator) this.L$1, (RealRouter) obj2, (State) this.L$2, (State) this.$key, continuation, 16);
            case 17:
                AndroidSecureStore$read$2 androidSecureStore$read$215 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (DisclosurePresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 17);
                androidSecureStore$read$215.L$0 = obj;
                return androidSecureStore$read$215;
            case 18:
                AndroidSecureStore$read$2 androidSecureStore$read$216 = new AndroidSecureStore$read$2((CashMapViewEvent.MapMovementFinished) this.L$1, continuation, (BitcoinMapPresenter) obj2, (MutableState) this.L$2);
                androidSecureStore$read$216.L$0 = obj;
                return androidSecureStore$read$216;
            case 19:
                AndroidSecureStore$read$2 androidSecureStore$read$217 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (LocalPosCheckInPresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 19);
                androidSecureStore$read$217.L$0 = obj;
                return androidSecureStore$read$217;
            case 20:
                return new AndroidSecureStore$read$2((List) this.L$0, (BitcoinTransferPresenter) this.L$1, (BitcoinTransferScreen.SavedState) obj2, (CurrencyCode) this.L$2, (CryptoBalance$BitcoinBalance) this.$key, continuation, 20);
            case 21:
                AndroidSecureStore$read$2 androidSecureStore$read$218 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (DisclosurePresenter) obj2, (StableCoroutineScope) this.L$2, (MutableState) this.$key, 21);
                androidSecureStore$read$218.L$0 = obj;
                return androidSecureStore$read$218;
            case 22:
                AndroidSecureStore$read$2 androidSecureStore$read$219 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (EarnerEnrollmentSuccessBlockerPresenter) obj2, (String) this.L$2, (EarnerEnrollmentSuccessBlocker.Action) this.$key, 22);
                androidSecureStore$read$219.L$0 = obj;
                return androidSecureStore$read$219;
            case 23:
                return new AndroidSecureStore$read$2((DisclosurePresenter) this.L$0, (InstrumentSelectionViewEvent) this.L$1, (MutableState) obj2, (MutableState) this.L$2, (MutableState) this.$key, continuation, 23);
            case 24:
                AndroidSecureStore$read$2 androidSecureStore$read$220 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (PasscodePresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 24);
                androidSecureStore$read$220.L$0 = obj;
                return androidSecureStore$read$220;
            case 25:
                AndroidSecureStore$read$2 androidSecureStore$read$221 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (ReferralCodePresenter) obj2, (MutableSharedFlow) this.L$2, (State) this.$key, 25);
                androidSecureStore$read$221.L$0 = obj;
                return androidSecureStore$read$221;
            case 26:
                AndroidSecureStore$read$2 androidSecureStore$read$222 = new AndroidSecureStore$read$2((ReferralCodePresenter) this.L$1, (ReferralCodeViewEvent) obj2, (MutableSharedFlow) this.L$2, (State) this.$key, continuation, 26);
                androidSecureStore$read$222.L$0 = obj;
                return androidSecureStore$read$222;
            case 27:
                AndroidSecureStore$read$2 androidSecureStore$read$223 = new AndroidSecureStore$read$2((Versioned) this.L$1, continuation, (RegisterAliasPresenter) obj2, (Function1) this.L$2, (MutableState) this.$key, 27);
                androidSecureStore$read$223.L$0 = obj;
                return androidSecureStore$read$223;
            case 28:
                AndroidSecureStore$read$2 androidSecureStore$read$224 = new AndroidSecureStore$read$2((Flow) this.L$1, continuation, (SetPinPresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 28);
                androidSecureStore$read$224.L$0 = obj;
                return androidSecureStore$read$224;
            default:
                return new AndroidSecureStore$read$2((RealBoostSelector) this.L$0, (String) this.L$2, (String) this.$key, (Function1) this.L$1, (BlockersData.MoneybotContext) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((AndroidSecureStore$read$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x0760, code lost:
    
        if (kotlin.TuplesKt.awaitClose(r13, new dev.chrisbanes.haze.HazeStyleKt$$ExternalSyntheticLambda0(7), r19) == r0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x074f, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r1, r9, r19) == r0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a6, code lost:
    
        if (r0.join(r19) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
    
        if (r0.join(r19) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        if (r2.join(r19) == r1) goto L68;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutexImpl mutexImpl;
        String str;
        ByteString byteString;
        Object generateLightningInvoice;
        Object access$loadLocations;
        MutableState mutableState;
        Pair pair;
        int i = this.$r8$classId;
        Biometrics$AuthenticationStatus.BiometricsEnrolled biometricsEnrolled = Biometrics$AuthenticationStatus.BiometricsEnrolled.INSTANCE;
        Object obj2 = this.this$0;
        int i2 = 1;
        switch (i) {
            case 0:
                AndroidSecureStore androidSecureStore = (AndroidSecureStore) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!(androidSecureStore.crypto instanceof AndroidSecureStore$Crypto$Ready) || !androidSecureStore.biometrics.getAuthenticationStatusForAuthenticator(15).equals(biometricsEnrolled)) {
                            return null;
                        }
                        mutexImpl = androidSecureStore.dataLock;
                        String str2 = (String) this.$key;
                        this.L$0 = mutexImpl;
                        this.L$1 = androidSecureStore;
                        this.L$2 = str2;
                        this.label = 1;
                        if (mutexImpl.lock(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = str2;
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) this.L$2;
                        androidSecureStore = (AndroidSecureStore) this.L$1;
                        mutexImpl = (MutexImpl) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    try {
                        ConnectionPool connectionPool = androidSecureStore.storage;
                        PlatformKt platformKt = androidSecureStore.crypto;
                        str.getClass();
                        String string2 = ((SharedPreferences) connectionPool.delegate).getString(str, null);
                        if (string2 != null) {
                            ByteString.Companion companion = ByteString.Companion;
                            byteString = ByteString.Companion.decodeBase64(string2);
                        } else {
                            byteString = null;
                        }
                        if (byteString == null) {
                            return null;
                        }
                        AndroidSecureStore.access$prepareKeyStore(androidSecureStore, (AndroidSecureStore$Crypto$Ready) platformKt);
                        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                        cipher.getClass();
                        Key key = ((AndroidSecureStore$Crypto$Ready) platformKt).keyStore.getKey("cash-key", null);
                        cipher.init(2, key instanceof PrivateKey ? (PrivateKey) key : null);
                        AndroidSecureValue androidSecureValue = new AndroidSecureValue(byteString, cipher);
                        mutexImpl.unlock(null);
                        return androidSecureValue;
                    } finally {
                        mutexImpl.unlock(null);
                    }
                } catch (Exception e) {
                    Timber.Forest.e(e);
                    return null;
                }
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope, (AfterpayAppletPurchasesEmbeddedPresenter) obj2, (UiCallbackModel) this.L$2, (UiCallbackModel) this.$key, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    SwipeableState$animateTo$2 swipeableState$animateTo$2 = new SwipeableState$animateTo$2(coroutineScope2, (CoroutineScope) obj2, (LocalCashBalancePresenter) this.L$2, (MutableState) this.$key, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(swipeableState$animateTo$2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    SwipeableState$animateTo$2 swipeableState$animateTo$22 = new SwipeableState$animateTo$2(coroutineScope3, (TapToPayPresenter) obj2, (MutableState) this.L$2, (State) this.$key, 20);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(swipeableState$animateTo$22, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.L$1;
                    SwipeableState$animateTo$2 swipeableState$animateTo$23 = new SwipeableState$animateTo$2(coroutineScope4, (BalanceHomePresenter) obj2, (State) this.L$2, (State) this.$key, 21);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(swipeableState$animateTo$23, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$32 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope5, (LocalHomePresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 12);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(datePickerKt$updateDisplayedMonth$32, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$33 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope6, (BenefitsHomePresenter) obj2, (MutableState) this.L$2, (State) this.$key, 14);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(datePickerKt$updateDisplayedMonth$33, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                AndroidBiometrics androidBiometrics = (AndroidBiometrics) this.L$1;
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    androidBiometrics.getAuthenticationStatusForAuthenticator(15).equals(biometricsEnrolled);
                    CoroutineContext coroutineContext = androidBiometrics.uiDispatcher;
                    NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(23, obj2, (Object) androidBiometrics, (Object) producerScope, this.L$2, this.$key, (Continuation) null, false);
                    this.L$0 = producerScope;
                    this.label = 1;
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.L$0 = null;
                this.label = 2;
                break;
            case 8:
                MutableState mutableState2 = (MutableState) this.$key;
                MutableState mutableState3 = (MutableState) this.L$1;
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) this.L$0;
                Analytics analytics = (Analytics) tapToPayPresenter.deviceIntegrityAttester;
                MutableState mutableState4 = (MutableState) this.L$2;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((BitcoinDepositsQrCodeModel) mutableState3.getValue()) == null) {
                        ((MutableState) obj2).setValue(new QrCodeModel((String) null, 4, true));
                        Long l = ((BitcoinAmountPickerResult) mutableState4.getValue()).bitcoinAmount.amount;
                        l.getClass();
                        long longValue = l.longValue();
                        zza zzaVar = CryptoCurrency.Companion;
                        CryptoAmount cryptoAmount = new CryptoAmount(longValue);
                        int ordinal = ((BitcoinDepositsScreen) tapToPayPresenter.tapToPayErrorReporter).origin.ordinal();
                        analytics.track(new CryptoDepositStart(ordinal != 0 ? ordinal != 2 ? ordinal != 4 ? null : CryptoDepositStart.CryptoDepositStartSource.ACCOUNT : CryptoDepositStart.CryptoDepositStartSource.MAIN_PAYMENT_PAD : CryptoDepositStart.CryptoDepositStartSource.BITCOIN_APPLET_RECEIVE), null);
                        RealLightningInvoiceGenerator realLightningInvoiceGenerator = (RealLightningInvoiceGenerator) tapToPayPresenter.tapToPayActionManager;
                        GenerateLightningInvoice$Request generateLightningInvoice$Request = new GenerateLightningInvoice$Request(cryptoAmount, ((BitcoinAmountPickerResult) mutableState4.getValue()).note);
                        this.label = 1;
                        generateLightningInvoice = realLightningInvoiceGenerator.generateLightningInvoice(generateLightningInvoice$Request, this);
                        if (generateLightningInvoice == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                generateLightningInvoice = obj;
                ApiResult apiResult = (ApiResult) generateLightningInvoice;
                if (apiResult instanceof ApiResult.Success) {
                    GenerateLightningInvoice$Response generateLightningInvoice$Response = (GenerateLightningInvoice$Response) ((ApiResult.Success) apiResult).response;
                    String str3 = generateLightningInvoice$Response.qr_code_url;
                    str3.getClass();
                    mutableState3.setValue(new BitcoinDepositsQrCodeModel(str3, OffersAnalyticsKt.toBitcoinInvoice(generateLightningInvoice$Response), generateLightningInvoice$Response.share_url));
                    Money money = ((BitcoinAmountPickerResult) mutableState4.getValue()).bitcoinAmount;
                    String str4 = ((BitcoinAmountPickerResult) mutableState4.getValue()).note;
                    Long l2 = money.amount;
                    if (str4 == null) {
                        str4 = "";
                    }
                    analytics.track(new CryptoDepositCreateInvoice(Boolean.valueOf(!StringsKt.isBlank(StringsKt.trim(str4).toString())), l2), null);
                    mutableState2.setValue(Boolean.FALSE);
                } else {
                    mutableState2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$1;
                    SwipeableState$animateTo$2 swipeableState$animateTo$24 = new SwipeableState$animateTo$2(coroutineScope7, (MutableSharedFlow) obj2, (MoveBitcoinPresenter) this.L$2, (MutableState) this.$key, 27);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(swipeableState$animateTo$24, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.L$1;
                    SwipeableState$animateTo$2 swipeableState$animateTo$25 = new SwipeableState$animateTo$2(coroutineScope8, (PoolsListPresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 28);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(swipeableState$animateTo$25, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.L$1;
                    SwipeableState$animateTo$2 swipeableState$animateTo$26 = new SwipeableState$animateTo$2(coroutineScope9, (MutableState) obj2, (MutableState) this.L$2, (StuckPlayerDetector) this.$key, 29);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(swipeableState$animateTo$26, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.L$1;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$1 = new SsnPresenter$models$$inlined$CollectEffect$1$1(coroutineScope10, (MutableState) obj2, (State) this.L$2, (HCaptcha) this.$key, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(ssnPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$34 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope11, (RealBugReportSenderFactory) obj2, (BetterNavigator.ScreenNavigator) this.L$2, (State) this.$key, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow11.collect(datePickerKt$updateDisplayedMonth$34, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.L$1;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$12 = new SsnPresenter$models$$inlined$CollectEffect$1$1(coroutineScope12, (LocalHomePresenter) obj2, (State) this.L$2, (State) this.$key, 3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow12.collect(ssnPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$35 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope13, (BitcoinStackingToolsInfoPresenter) obj2, (State) this.L$2, (MutableState) this.$key, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow13.collect(datePickerKt$updateDisplayedMonth$35, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter = (BitcoinStackingToolsPresenter) this.L$0;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.L$1;
                    RealRouter realRouter = (RealRouter) obj2;
                    BitcoinRoundUpsAvailability bitcoinRoundUpsAvailability = (BitcoinRoundUpsAvailability) ((State) this.L$2).getValue();
                    boolean booleanValue = ((Boolean) ((State) this.$key).getValue()).booleanValue();
                    this.label = 1;
                    if (BitcoinStackingToolsPresenter.access$roundupsClick(bitcoinStackingToolsPresenter, screenNavigator, realRouter, bitcoinRoundUpsAvailability, booleanValue, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$36 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope14, (DisclosurePresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 20);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow14.collect(datePickerKt$updateDisplayedMonth$36, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashMapViewEvent.MapMovementFinished mapMovementFinished = (CashMapViewEvent.MapMovementFinished) this.L$1;
                    MutableState mutableState5 = (MutableState) this.L$2;
                    this.L$0 = null;
                    this.$key = mutableState5;
                    this.label = 1;
                    access$loadLocations = BitcoinMapPresenter.access$loadLocations((BitcoinMapPresenter) obj2, mapMovementFinished, this);
                    if (access$loadLocations == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                    mutableState = mutableState5;
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.$key;
                    SafeTrace.throwOnFailure(obj);
                    access$loadLocations = obj;
                }
                mutableState.setValue((List) access$loadLocations);
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.L$1;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$13 = new SsnPresenter$models$$inlined$CollectEffect$1$1(coroutineScope15, (LocalPosCheckInPresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow15.collect(ssnPresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object first = CollectionsKt.first((List) this.L$0);
                    first.getClass();
                    AmountSelection.TradeAll tradeAll = (AmountSelection.TradeAll) first;
                    CurrencyCode currencyCode = (CurrencyCode) this.L$2;
                    CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) this.$key;
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.label = 1;
                    if (BitcoinTransferPresenter.access$handleSubmit((BitcoinTransferPresenter) this.L$1, tradeAll.amount, (BitcoinTransferScreen.SavedState) obj2, tradeAll, currencyCode, cryptoBalance$BitcoinBalance, null, null, null, emptyList, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.L$1;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$14 = new SsnPresenter$models$$inlined$CollectEffect$1$1(coroutineScope16, (DisclosurePresenter) obj2, (StableCoroutineScope) this.L$2, (MutableState) this.$key, 9);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow16.collect(ssnPresenter$models$$inlined$CollectEffect$1$14, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.L$1;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$15 = new SsnPresenter$models$$inlined$CollectEffect$1$1(coroutineScope17, (EarnerEnrollmentSuccessBlockerPresenter) obj2, (String) this.L$2, (EarnerEnrollmentSuccessBlocker.Action) this.$key, 10);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow17.collect(ssnPresenter$models$$inlined$CollectEffect$1$15, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.L$0;
                    RealBlockersHelper realBlockersHelper = (RealBlockersHelper) disclosurePresenter.args;
                    InstrumentSelectionViewEvent instrumentSelectionViewEvent = (InstrumentSelectionViewEvent) this.L$1;
                    BlockerAction blockerAction = ((InstrumentSelectionViewEvent.InstrumentDetailActionRequested) instrumentSelectionViewEvent).blockerAction;
                    BlockersScreens.InstrumentSelectionScreen instrumentSelectionScreen = (BlockersScreens.InstrumentSelectionScreen) disclosurePresenter.appService;
                    InstrumentSelectionBlockerPresenter$models$1$5$1 instrumentSelectionBlockerPresenter$models$1$5$1 = new InstrumentSelectionBlockerPresenter$models$1$5$1(disclosurePresenter, instrumentSelectionViewEvent, (MutableState) obj2, (MutableState) this.L$2, (MutableState) this.$key, null);
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, instrumentSelectionScreen, null, null, false, null, instrumentSelectionBlockerPresenter$models$1$5$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$37 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope18, (PasscodePresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 23);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow18.collect(datePickerKt$updateDisplayedMonth$37, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow19 = (Flow) this.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$38 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope19, (ReferralCodePresenter) obj2, (MutableSharedFlow) this.L$2, (State) this.$key, 24);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow19.collect(datePickerKt$updateDisplayedMonth$38, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                ReferralCodePresenter referralCodePresenter = (ReferralCodePresenter) this.L$1;
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.L$2;
                CoroutineScope coroutineScope20 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                Continuation continuation = null;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope20, null, null, new ReferralCodePresenter$models$2$1$1(mutableSharedFlow, continuation, r9), 3);
                    this.L$0 = coroutineScope20;
                    this.label = 1;
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 == 2 || i29 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                int intValue = ((Number) ((State) this.$key).getValue()).intValue();
                CharSequence charSequence = ((ReferralCodeViewEvent.CodeInputChanged) ((ReferralCodeViewEvent) obj2)).codeInput;
                if ((charSequence.length() >= intValue ? 1 : 0) != 0) {
                    StandaloneCoroutine launch$default2 = JobKt.launch$default(coroutineScope20, null, null, new PasscodePresenter$models$1$2(referralCodePresenter, charSequence, mutableSharedFlow, continuation, 18), 3);
                    this.L$0 = null;
                    this.label = 3;
                    break;
                } else {
                    StandaloneCoroutine launch$default3 = JobKt.launch$default(coroutineScope20, null, null, new ReferralCodePresenter$models$2$1$1(mutableSharedFlow, continuation, i2), 3);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                }
            case 27:
                MutableState mutableState6 = (MutableState) this.$key;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RegisterAliasPresenter.SubmittedAlias submittedAlias = (RegisterAliasPresenter.SubmittedAlias) ((Versioned) this.L$1).value;
                    String str5 = submittedAlias.alias;
                    SignalsContext signalsContext = submittedAlias.signalsContext;
                    int ordinal2 = ((RegisterAliasViewModel) mutableState6.getValue()).mode.ordinal();
                    if (ordinal2 == 0) {
                        pair = new Pair(AliasRegistrar$Args.DeliveryMechanism.SMS, PhoneNumbers.normalize(str5, "US", true));
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        pair = new Pair(AliasRegistrar$Args.DeliveryMechanism.EMAIL, str5 != null ? Emails.normalize(str5) : null);
                    }
                    AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = (AliasRegistrar$Args.DeliveryMechanism) pair.first;
                    String str6 = (String) pair.second;
                    if (str6 != null) {
                        ((RegisterAliasViewModel) mutableState6.getValue()).getClass();
                        Function1 function1 = (Function1) this.L$2;
                        this.L$0 = null;
                        this.label = 1;
                        if (RegisterAliasPresenter.access$register((RegisterAliasPresenter) obj2, str6, signalsContext, deliveryMechanism, function1, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    } else {
                        mutableState6.setValue(RegisterAliasViewModel.copy$default((RegisterAliasViewModel) mutableState6.getValue(), null, null, null, false, false, true, null, false, false, 1047551));
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope21 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow20 = (Flow) this.L$1;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$16 = new SsnPresenter$models$$inlined$CollectEffect$1$1(coroutineScope21, (SetPinPresenter) obj2, (MutableState) this.L$2, (MutableState) this.$key, 19);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow20.collect(ssnPresenter$models$$inlined$CollectEffect$1$16, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBoostSelector realBoostSelector = (RealBoostSelector) this.L$0;
                    String str7 = (String) this.L$2;
                    this.label = 1;
                    if (realBoostSelector.updateBoostMultiSelectInternal(Back.INSTANCE, str7, null, (String) this.$key, OfferUpdateType.ADD, str7, (Function1) this.L$1, (BlockersData.MoneybotContext) obj2, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSecureStore$read$2(AndroidSecureStore androidSecureStore, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = androidSecureStore;
        this.$key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSecureStore$read$2(CashMapViewEvent.MapMovementFinished mapMovementFinished, Continuation continuation, BitcoinMapPresenter bitcoinMapPresenter, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.L$1 = mapMovementFinished;
        this.this$0 = bitcoinMapPresenter;
        this.L$2 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidSecureStore$read$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.L$1 = obj2;
        this.this$0 = obj3;
        this.L$2 = obj4;
        this.$key = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidSecureStore$read$2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
        this.L$2 = obj3;
        this.$key = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidSecureStore$read$2(Object obj, Continuation continuation, Object obj2, Object obj3, Object obj4, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
        this.L$2 = obj3;
        this.$key = obj4;
    }
}
