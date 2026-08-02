package com.squareup.cash;

import android.app.Activity;
import android.os.Build;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.media3.extractor.mkv.Sniffer;
import app.cash.api.ApiResult;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.primitives.Location;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.views.pos.TransitionStep;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.RealImageLoader$execute$result$1;
import com.fillr.e;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.android.gms.maps.zzai;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.jwk.KeyUse;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.DeviceMetrics;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticAttachments;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda4;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.values.RecentMoneybotSession;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AppContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AttachmentIdentifier;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.BugReportService;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportRequest;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CustomerContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.DeviceContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.FeatureContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.MoneybotContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.Platform;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.DirectoryServer;
import com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.Serializable;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.json.JSONObject;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class RealBugReportSender$submitBugReport$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $deviceMetrics;
    public final /* synthetic */ Object $diagnosticContext;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $report;
    public final /* synthetic */ Object $reportingEmail;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBugReportSender$submitBugReport$2(Object obj, MutableState mutableState, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.L$5 = mutableState;
        this.L$1 = obj2;
        this.L$2 = obj3;
        this.L$3 = obj4;
        this.L$6 = obj5;
        this.$reportingEmail = obj6;
        this.this$0 = obj7;
        this.$report = obj8;
        this.$diagnosticContext = obj9;
        this.$deviceMetrics = obj10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r14 > r1.longValue()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$transfer$BitcoinTransferPresenter$models$7$1(Object obj) {
        BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) this.L$0;
        MutableState mutableState = (MutableState) this.L$5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long j = ((BitcoinTransferViewEvent.AmountEntered) mutableState.getValue()).amountCents;
            BitcoinTransferScreen.SavedState savedState = (BitcoinTransferScreen.SavedState) ((State) this.L$1).getValue();
            AmountSelection amountSelection = (AmountSelection) ((MutableState) this.L$2).getValue();
            CurrencyCode currencyCode = (CurrencyCode) ((MutableState) this.L$3).getValue();
            currencyCode.getClass();
            CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) ((MutableState) this.L$6).getValue();
            cryptoBalance$BitcoinBalance.getClass();
            Instrument instrument = (Instrument) ((State) this.$reportingEmail).getValue();
            if (instrument != null) {
                State state = (State) this.this$0;
                if (bitcoinTransferPresenter.buyInstrumentSelectionEnabled) {
                    BitcoinTransferScreen bitcoinTransferScreen = bitcoinTransferPresenter.args;
                    if (bitcoinTransferScreen.isBuy && (bitcoinTransferScreen.orderType instanceof BitcoinTransferScreen.OrderType.Standard)) {
                        long j2 = ((BitcoinTransferViewEvent.AmountEntered) mutableState.getValue()).amountCents;
                        Money money = (Money) state.getValue();
                        money.getClass();
                        Long l = money.amount;
                        l.getClass();
                    }
                }
            }
            instrument = null;
            BalanceSnapshot balanceSnapshot = (BalanceSnapshot) ((MutableState) this.$report).getValue();
            Money money2 = balanceSnapshot != null ? balanceSnapshot.balance : null;
            RestrictedBalance restrictedBalance = (RestrictedBalance) ((MutableState) this.$diagnosticContext).getValue();
            Money money3 = restrictedBalance != null ? restrictedBalance.amount : null;
            List list = (List) ((MutableState) this.$deviceMetrics).getValue();
            this.label = 1;
            if (BitcoinTransferPresenter.access$handleSubmit(bitcoinTransferPresenter, j, savedState, amountSelection, currencyCode, cryptoBalance$BitcoinBalance, instrument, money2, money3, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$transfers$presenters$AddMoneyPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$5;
            ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$1 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (CurrencyCode) this.L$1, (AddMoneyPresenter) this.L$2, (MutableState) this.L$3, (MutableState) this.L$6, (MutableState) this.$reportingEmail, (State) this.this$0, (MutableState) this.$report, (MutableState) this.$diagnosticContext, (MutableState) this.$deviceMetrics);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(articlePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3(Object obj) {
        State state = (State) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CardRegistry.SharedCardTransitionState sharedCardTransitionState = state != null ? (CardRegistry.SharedCardTransitionState) state.getValue() : null;
            boolean areEqual = Intrinsics.areEqual(sharedCardTransitionState, (CardRegistry.SharedCardTransitionState) this.L$5);
            if (state != null && sharedCardTransitionState != null && !areEqual) {
                return Unit.INSTANCE;
            }
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            SafeFlow snapshotFlow = Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda4((CardWobbleState) this.L$1, (MutableState) this.L$2, (MutableState) this.L$3, (MutableState) this.L$6, (MutableState) this.$reportingEmail, (MutableState) this.this$0, (MutableState) this.$report));
            CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2 coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2 = new CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2(ref$BooleanRef, (CardScene) this.$diagnosticContext, ref$ObjectRef, ref$ObjectRef2, ref$BooleanRef2, (Ref$BooleanRef) this.$deviceMetrics, null);
            this.L$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(snapshotFlow, coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$deviceMetrics;
        Object obj3 = this.$diagnosticContext;
        Object obj4 = this.$reportingEmail;
        Object obj5 = this.$report;
        Object obj6 = this.this$0;
        switch (i) {
            case 0:
                return new RealBugReportSender$submitBugReport$2((RealBugReportSender) obj6, (BugReport) obj5, (DiagnosticContext) obj3, (DeviceMetrics) obj2, (String) obj4, continuation);
            case 1:
                RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$2 = new RealBugReportSender$submitBugReport$2((Flow) this.L$5, continuation, (LocalOrderStatusPresenter) this.L$1, (Location.LocationSummary) this.L$2, (LocalAddress) this.L$3, (String) this.L$6, (MutableState) obj4, (MutableState) obj6, (State) obj5, (MutableState) obj3, (MutableState) obj2, 1);
                realBugReportSender$submitBugReport$2.L$0 = obj;
                return realBugReportSender$submitBugReport$2;
            case 2:
                return new RealBugReportSender$submitBugReport$2((LocalPosBrandOnboardingViewModel) this.L$0, (MutableState) this.L$5, (CoroutineScope) this.L$1, (Animatable) this.L$2, (Animatable) this.L$3, (Animatable) this.L$6, (Animatable) obj4, (Animatable) obj6, (Animatable) obj5, (Animatable) obj3, (Animatable) obj2, continuation, 2);
            case 3:
                return new RealBugReportSender$submitBugReport$2((BitcoinTransferPresenter) this.L$0, (MutableState) this.L$5, (State) this.L$1, (MutableState) this.L$2, (MutableState) this.L$3, (MutableState) this.L$6, (State) obj4, (State) obj6, (MutableState) obj5, (MutableState) obj3, (MutableState) obj2, continuation, 3);
            case 4:
                RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$22 = new RealBugReportSender$submitBugReport$2((Flow) this.L$5, continuation, (ChannelListPresenter) this.L$1, (MutableState) this.L$2, (String) this.L$6, (NotificationChannelId) this.L$3, (MutableState) obj4, (MutableState) obj6, (MutableState) obj5, (MutableState) obj3, (State) obj2);
                realBugReportSender$submitBugReport$22.L$0 = obj;
                return realBugReportSender$submitBugReport$22;
            case 5:
                RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$23 = new RealBugReportSender$submitBugReport$2((Flow) this.L$5, continuation, (ShoppingWebPresenter) this.L$1, (MutableState) this.L$2, (MutableState) this.L$3, (MutableState) this.L$6, (MutableState) obj4, (MutableState) obj6, (MutableState) obj5, (MutableState) obj3, (MutableState) obj2, 5);
                realBugReportSender$submitBugReport$23.L$0 = obj;
                return realBugReportSender$submitBugReport$23;
            case 6:
                RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$24 = new RealBugReportSender$submitBugReport$2((Flow) this.L$5, continuation, (CurrencyCode) this.L$1, (AddMoneyPresenter) this.L$2, (MutableState) this.L$3, (MutableState) this.L$6, (MutableState) obj4, (State) obj6, (MutableState) obj5, (MutableState) obj3, (MutableState) obj2, 6);
                realBugReportSender$submitBugReport$24.L$0 = obj;
                return realBugReportSender$submitBugReport$24;
            case 7:
                RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$25 = new RealBugReportSender$submitBugReport$2((CardRegistry.SharedCardTransitionState) this.L$5, (CardWobbleState) this.L$1, (MutableState) this.L$2, (MutableState) this.L$3, (MutableState) this.L$6, (MutableState) obj4, (MutableState) obj6, (MutableState) obj5, (CardScene) obj3, (Ref$BooleanRef) obj2, continuation);
                realBugReportSender$submitBugReport$25.L$0 = obj;
                return realBugReportSender$submitBugReport$25;
            default:
                RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$26 = new RealBugReportSender$submitBugReport$2((SdkTransactionId) this.L$2, (zzai) obj6, (PublicKey) obj5, (String) obj4, (String) obj3, (PublicKey) obj2, continuation);
                realBugReportSender$submitBugReport$26.L$1 = obj;
                return realBugReportSender$submitBugReport$26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((RealBugReportSender$submitBugReport$2) create((State) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealBugReportSender$submitBugReport$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:167|(2:169|(2:171|(2:173|(4:175|176|177|(4:179|(1:181)|(1:183)(1:188)|(2:185|186)(1:187))(2:189|190))(2:191|192))(19:193|194|(1:196)(1:244)|197|198|199|(1:201)(1:243)|202|(1:242)(1:206)|207|(2:209|(2:211|(2:213|(2:215|(2:217|(2:219|(1:221)(1:235))(1:236))(1:237))(1:238))(1:239))(1:240))(1:241)|222|223|(1:225)(1:234)|(1:227)(1:233)|228|(4:232|176|177|(0)(0))|230|231))(1:245))(14:388|(4:391|(3:393|394|395)(1:397)|396|389)|398|399|(6:402|(1:418)(2:406|(2:416|414)(1:408))|409|(1:415)(3:411|412|413)|414|400)|420|421|(2:424|422)|425|(10:427|(1:429)(1:445)|430|(1:432)|433|(1:435)|436|(1:438)|439|(1:441))(1:446)|442|(1:444)|230|231)|246|247|248|(1:250)(2:314|(1:316)(35:317|318|319|320|(23:323|324|325|326|327|328|329|330|331|332|333|334|(6:337|338|339|341|(9:343|(1:345)(1:363)|346|(2:357|358)|348|(1:350)|351|(2:353|354)(1:356)|355)(2:364|365)|335)|367|(0)(0)|346|(0)|348|(0)|351|(0)(0)|355|321)|379|380|362|(1:313)|257|(2:258|(2:260|(1:309))(2:311|312))|265|(3:269|(1:271)(2:304|(1:306)(1:307))|(1:273))|308|(1:276)(1:303)|277|(1:279)(1:302)|(7:281|(2:284|282)|285|286|(3:288|(3:291|(2:293|(4:295|(18:297|194|(0)(0)|197|198|199|(0)(0)|202|(1:204)|242|207|(0)(0)|222|223|(0)(0)|(0)(0)|228|(0))|230|231))(1:298)|289)|299)|300|(0))|301|198|199|(0)(0)|202|(0)|242|207|(0)(0)|222|223|(0)(0)|(0)(0)|228|(0)|230|231))|251|(1:253)|313|257|(3:258|(0)(0)|309)|265|(4:267|269|(0)(0)|(0))|308|(0)(0)|277|(0)(0)|(0)|301|198|199|(0)(0)|202|(0)|242|207|(0)(0)|222|223|(0)(0)|(0)(0)|228|(0)|230|231) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x047c, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r3, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0455, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r11, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0409, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r8, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03e3, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r11, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x033f, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r3, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0380, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r7, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03bb, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r3, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0434, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r11, r48) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0934, code lost:
    
        if (r0.length() > 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x070c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x070d, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        if (r1 == r12) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07b6 A[Catch: Exception -> 0x07d0, TRY_ENTER, TryCatch #1 {Exception -> 0x07d0, blocks: (B:334:0x078e, B:335:0x07a0, B:337:0x07a6, B:345:0x07b6, B:363:0x07c4), top: B:333:0x078e }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0824 A[Catch: Exception -> 0x0817, TryCatch #7 {Exception -> 0x0817, blocks: (B:346:0x07d2, B:358:0x07fd, B:348:0x081a, B:350:0x0824, B:351:0x083d, B:353:0x0847, B:355:0x0860, B:370:0x07d0, B:380:0x0870), top: B:357:0x07fd }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0847 A[Catch: Exception -> 0x0817, TryCatch #7 {Exception -> 0x0817, blocks: (B:346:0x07d2, B:358:0x07fd, B:348:0x081a, B:350:0x0824, B:351:0x083d, B:353:0x0847, B:355:0x0860, B:370:0x07d0, B:380:0x0870), top: B:357:0x07fd }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0860 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07c4 A[Catch: Exception -> 0x07d0, TRY_LEAVE, TryCatch #1 {Exception -> 0x07d0, blocks: (B:334:0x078e, B:335:0x07a0, B:337:0x07a6, B:345:0x07b6, B:363:0x07c4), top: B:333:0x078e }] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v101 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v74, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v76, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v99 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EmptyList emptyList;
        Object withContext;
        ArrayList arrayList;
        List list;
        boolean z;
        String obj3;
        Collection collection;
        ArrayList arrayList2;
        Collection collection2;
        List list2;
        Object obj4;
        Object obj5;
        Pair pair;
        Pair pair2;
        ArrayList plus;
        ListIterator listIterator;
        boolean z2;
        Object obj6;
        BugsnagClient.Breadcrumb breadcrumb;
        String str;
        MainActivity mainActivity;
        MoneybotContext moneybotContext;
        Object obj7;
        List list3;
        String str2;
        AttachmentIdentifier attachmentIdentifier;
        Iterator it;
        String str3;
        Object obj8;
        Object obj9;
        Object obj10;
        Locale locale;
        Iterator it2;
        Date date;
        Pair pair3;
        String str4;
        Object createBugReport;
        Collection collection3;
        List list4;
        Country country;
        ApiResult apiResult;
        RealBugReportSender realBugReportSender;
        CoroutineStart coroutineStart;
        int i;
        ?? r5;
        int i2;
        ?? r52;
        int i3;
        ?? r53;
        ?? r54;
        ?? r55;
        int i4;
        ?? r56;
        Object failure;
        String str5;
        Object obj11;
        Object obj12;
        Object deviceDataJson$3ds2sdk_release;
        PublicKey publicKey;
        TextSetter textSetter;
        String str6;
        String str7;
        int i5 = this.$r8$classId;
        Object obj13 = this.$deviceMetrics;
        Object obj14 = this.this$0;
        Object obj15 = this.$diagnosticContext;
        Object obj16 = this.$reportingEmail;
        Object obj17 = this.$report;
        switch (i5) {
            case 0:
                DiagnosticContext diagnosticContext = (DiagnosticContext) obj15;
                BugReport bugReport = (BugReport) obj17;
                RealBugReportSender realBugReportSender2 = (RealBugReportSender) obj14;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List breadcrumbs = realBugReportSender2.bugsnagClient.getBreadcrumbs();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj18 : breadcrumbs) {
                        if (((BugsnagClient.Breadcrumb) obj18).f1174type == BugsnagClient.BreadcrumbType.NAVIGATION) {
                            arrayList3.add(obj18);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        BugsnagClient.Breadcrumb breadcrumb2 = (BugsnagClient.Breadcrumb) next;
                        Object obj19 = breadcrumb2.metadata.get("screen");
                        if (obj19 == null || (obj3 = obj19.toString()) == null) {
                            z = true;
                        } else {
                            z = true;
                            if (StringsKt.contains((CharSequence) obj3, (CharSequence) "BugReporting", true)) {
                            }
                        }
                        if (!StringsKt.contains(breadcrumb2.message, "BugReporting", z)) {
                            arrayList4.add(next);
                        }
                    }
                    List list5 = bugReport.screenshots;
                    list5.getClass();
                    List<Screenshot> list6 = list5;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                    for (Screenshot screenshot : list6) {
                        arrayList5.add(new AttachmentIdentifier(UUID.randomUUID().toString()));
                    }
                    if (diagnosticContext != null) {
                        DiagnosticAttachments diagnosticAttachments = bugReport.diagnosticAttachments;
                        ?? arrayList6 = new ArrayList();
                        if (diagnosticAttachments.includeViewHierarchy) {
                            obj2 = obj13;
                            arrayList6.add(new AttachmentIdentifier("view_hierarchy_" + UUID.randomUUID()));
                        } else {
                            obj2 = obj13;
                        }
                        if (diagnosticAttachments.includeBackStack) {
                            arrayList6.add(new AttachmentIdentifier("back_stack_" + UUID.randomUUID()));
                        }
                        if (diagnosticAttachments.includeDatabase) {
                            arrayList6.add(new AttachmentIdentifier("database_" + UUID.randomUUID()));
                        }
                        if (diagnosticAttachments.includePreferences) {
                            arrayList6.add(new AttachmentIdentifier("preferences_" + UUID.randomUUID()));
                        }
                        emptyList = arrayList6;
                        if (diagnosticAttachments.includeSamEligibility) {
                            arrayList6.add(new AttachmentIdentifier("sam_eligibility_" + UUID.randomUUID()));
                            emptyList = arrayList6;
                        }
                    } else {
                        obj2 = obj13;
                        emptyList = EmptyList.INSTANCE;
                    }
                    TemporaryStorage temporaryStorage = realBugReportSender2.tempStorage;
                    this.L$0 = arrayList4;
                    this.L$1 = arrayList5;
                    this.L$2 = emptyList;
                    this.L$3 = arrayList4;
                    this.label = 1;
                    withContext = JobKt.withContext(temporaryStorage.ioDispatcher, new TemporaryStorage$getDir$2(temporaryStorage, null, 0), this);
                    if (withContext != coroutineSingletons) {
                        arrayList = arrayList4;
                        list = emptyList;
                        arrayList2 = arrayList4;
                        collection = arrayList5;
                    }
                    return coroutineSingletons;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pair3 = (Pair) ((Serializable) this.L$3);
                        List list7 = (List) this.L$2;
                        Collection collection4 = (List) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        collection3 = collection4;
                        list4 = list7;
                        obj5 = obj17;
                        createBugReport = obj;
                        Pair pair4 = pair3;
                        apiResult = (ApiResult) createBugReport;
                        if (apiResult instanceof ApiResult.Success) {
                            Timber.Forest.e("Unknown error creating bug report: " + apiResult, new Object[0]);
                            return apiResult;
                        }
                        if (!bugReport.screenshots.isEmpty()) {
                            CoroutineScope coroutineScope = realBugReportSender2.scope;
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            JobKt.launch$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new zzmo(realBugReportSender2, (ApiResult.Success) apiResult, (BugReport) obj5, collection3, null, 17), 2);
                        }
                        if (diagnosticContext != null) {
                            CoroutineScope coroutineScope2 = realBugReportSender2.scope;
                            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                            realBugReportSender = realBugReportSender2;
                            coroutineStart = null;
                            i = 2;
                            JobKt.launch$default(coroutineScope2, DefaultIoScheduler.INSTANCE, null, new RealImageLoader$execute$result$1(realBugReportSender, (ApiResult.Success) apiResult, (BugReport) obj5, diagnosticContext, list4, null, 20), 2);
                        } else {
                            realBugReportSender = realBugReportSender2;
                            coroutineStart = null;
                            i = 2;
                        }
                        if (pair4 == null) {
                            return apiResult;
                        }
                        CoroutineScope coroutineScope3 = realBugReportSender.scope;
                        DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                        JobKt.launch$default(coroutineScope3, DefaultIoScheduler.INSTANCE, coroutineStart, new RealImageLoader$execute$2(realBugReportSender, (ApiResult.Success) apiResult, pair4, coroutineStart, 29), i);
                        return apiResult;
                    }
                    str = (String) this.L$6;
                    plus = (ArrayList) this.L$5;
                    pair2 = (Pair) ((Serializable) this.L$3);
                    list3 = (List) this.L$2;
                    collection2 = (List) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj13;
                    obj4 = obj16;
                    obj5 = obj17;
                    obj7 = obj;
                    RecentMoneybotSession recentMoneybotSession = (RecentMoneybotSession) obj7;
                    moneybotContext = new MoneybotContext(recentMoneybotSession == null ? recentMoneybotSession.sessionId : null, ByteString.EMPTY);
                    list2 = list3;
                    String str8 = str;
                    ArrayList arrayList7 = plus;
                    pair3 = pair2;
                    String str9 = bugReport.title;
                    SessionManager sessionManager = realBugReportSender2.sessionManager;
                    SessionManager sessionManager2 = realBugReportSender2.sessionManager;
                    str4 = bugReport.description;
                    StringBuilder sb = new StringBuilder();
                    if (StringsKt.isBlank(str4)) {
                        sb.append(str4);
                    } else {
                        sb.append("No description provided");
                    }
                    String appTokenOrNull = PlatformKt.appTokenOrNull(sessionManager);
                    sb.append("\n\nCrashes: https://app.bugsnag.com/square-inc/cash-android/errors?filters[event.since][0]=7d&filters[user.id][0][type]=eq");
                    sb.append("&filters[user.id][0][value]=" + appTokenOrNull + "&sort=last_seen");
                    sb.append("\n\n");
                    String sb2 = sb.toString();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = realBugReportSender2.cashDatabase;
                    String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager2);
                    Profile profile = (Profile) cashAccountDatabaseImpl.profileQueries.select$2().executeAsOneOrNull();
                    String obj20 = (profile != null || (country = profile.country_code) == null) ? null : country.toString();
                    ByteString byteString = ByteString.EMPTY;
                    CustomerContext customerContext = new CustomerContext(activeAccountTokenOrNull, obj20, byteString);
                    AppContext appContext = new AppContext(PlatformKt.appTokenOrNull(sessionManager2), realBugReportSender2.endpoint, "5.58.0", "5580007", "production_release", str8, byteString);
                    DeviceMetrics deviceMetrics = (DeviceMetrics) obj2;
                    deviceMetrics.getClass();
                    Platform platform = Platform.PLATFORM_ANDROID;
                    String str10 = Build.VERSION.RELEASE;
                    String str11 = Build.MANUFACTURER;
                    String str12 = Build.MODEL;
                    Integer valueOf = Integer.valueOf(deviceMetrics.widthPixels);
                    Integer valueOf2 = Integer.valueOf(deviceMetrics.heightPixels);
                    int i7 = deviceMetrics.densityDpi;
                    String str13 = (String) obj4;
                    CreateBugReportRequest createBugReportRequest = new CreateBugReportRequest(str9, sb2, arrayList7, customerContext, appContext, new DeviceContext(platform, str10, str11, str12, valueOf, valueOf2, Integer.valueOf(i7), i7 == 120 ? i7 != 160 ? i7 != 213 ? i7 != 240 ? i7 != 320 ? i7 != 480 ? i7 != 640 ? String.valueOf(i7) : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "tvdpi" : "mdpi" : "ldpi", Locale.getDefault().toString(), byteString), StringsKt.isBlank(str13) ? str13 : null, moneybotContext == null ? new FeatureContext(moneybotContext, byteString) : null, byteString);
                    BugReportService bugReportService = realBugReportSender2.bugReportService;
                    this.L$0 = null;
                    this.L$1 = (List) collection2;
                    this.L$2 = list2;
                    this.L$3 = pair3;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 3;
                    createBugReport = bugReportService.createBugReport(createBugReportRequest, this);
                    if (createBugReport != coroutineSingletons) {
                        collection3 = collection2;
                        list4 = list2;
                        Pair pair42 = pair3;
                        apiResult = (ApiResult) createBugReport;
                        if (apiResult instanceof ApiResult.Success) {
                        }
                    }
                    return coroutineSingletons;
                }
                ?? r0 = (List) ((Serializable) this.L$3);
                list = (List) this.L$2;
                Collection collection5 = (List) this.L$1;
                arrayList = (ArrayList) this.L$0;
                SafeTrace.throwOnFailure(obj);
                obj2 = obj13;
                withContext = obj;
                arrayList2 = r0;
                collection = collection5;
                collection2 = collection;
                File file = (File) withContext;
                arrayList2.getClass();
                if (file == null) {
                    Timber.Forest.w("No cache directory available for navigation breadcrumbs", new Object[0]);
                } else {
                    if (!arrayList2.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("=== Navigation Breadcrumbs ===");
                        sb3.append('\n');
                        ArrayList arrayList8 = arrayList2;
                        list2 = list;
                        try {
                            sb3.append("Captured: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US).format(new Date()));
                            sb3.append('\n');
                            sb3.append('\n');
                            Iterator it4 = arrayList8.iterator();
                            while (it4.hasNext()) {
                                BugsnagClient.Breadcrumb breadcrumb3 = (BugsnagClient.Breadcrumb) it4.next();
                                try {
                                    it = it4;
                                } catch (Exception unused) {
                                    it = it4;
                                }
                                try {
                                    locale = Locale.US;
                                    obj4 = obj16;
                                } catch (Exception unused2) {
                                    obj4 = obj16;
                                    obj5 = obj17;
                                    str3 = breadcrumb3.timestamp;
                                    sb3.append("[" + str3 + "] " + breadcrumb3.message);
                                    sb3.append('\n');
                                    obj8 = breadcrumb3.metadata.get("screen");
                                    if (obj8 != null) {
                                    }
                                    obj9 = breadcrumb3.metadata.get("screenId");
                                    if (obj9 != null) {
                                    }
                                    obj10 = breadcrumb3.metadata.get("initiator");
                                    if (obj10 != null) {
                                    }
                                    sb3.append('\n');
                                    it4 = it;
                                    obj16 = obj4;
                                    obj17 = obj5;
                                }
                                try {
                                    obj5 = obj17;
                                    try {
                                        it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new SimpleDateFormat[]{new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale)}).iterator();
                                        date = null;
                                    } catch (Exception unused3) {
                                        str3 = breadcrumb3.timestamp;
                                        sb3.append("[" + str3 + "] " + breadcrumb3.message);
                                        sb3.append('\n');
                                        obj8 = breadcrumb3.metadata.get("screen");
                                        if (obj8 != null) {
                                        }
                                        obj9 = breadcrumb3.metadata.get("screenId");
                                        if (obj9 != null) {
                                        }
                                        obj10 = breadcrumb3.metadata.get("initiator");
                                        if (obj10 != null) {
                                        }
                                        sb3.append('\n');
                                        it4 = it;
                                        obj16 = obj4;
                                        obj17 = obj5;
                                    }
                                } catch (Exception unused4) {
                                    obj5 = obj17;
                                    str3 = breadcrumb3.timestamp;
                                    sb3.append("[" + str3 + "] " + breadcrumb3.message);
                                    sb3.append('\n');
                                    obj8 = breadcrumb3.metadata.get("screen");
                                    if (obj8 != null) {
                                    }
                                    obj9 = breadcrumb3.metadata.get("screenId");
                                    if (obj9 != null) {
                                    }
                                    obj10 = breadcrumb3.metadata.get("initiator");
                                    if (obj10 != null) {
                                    }
                                    sb3.append('\n');
                                    it4 = it;
                                    obj16 = obj4;
                                    obj17 = obj5;
                                }
                                while (it2.hasNext()) {
                                    try {
                                        date = ((SimpleDateFormat) it2.next()).parse(breadcrumb3.timestamp);
                                    } catch (Exception unused5) {
                                    }
                                    if (date != null) {
                                        str3 = date == null ? new SimpleDateFormat("HH:mm:ss", Locale.US).format(date) : breadcrumb3.timestamp;
                                        sb3.append("[" + str3 + "] " + breadcrumb3.message);
                                        sb3.append('\n');
                                        obj8 = breadcrumb3.metadata.get("screen");
                                        if (obj8 != null) {
                                            try {
                                                sb3.append("  Screen: " + obj8);
                                                sb3.append('\n');
                                            } catch (Exception e) {
                                                e = e;
                                                Timber.Forest.e("Failed to create navigation breadcrumbs file", new Object[0], e);
                                                pair = null;
                                                pair2 = pair;
                                                if (pair2 != null) {
                                                }
                                                Iterable iterable = EmptyList.INSTANCE;
                                                plus = CollectionsKt.plus(iterable, (Collection) CollectionsKt.plus((Iterable) list2, collection2));
                                                arrayList.getClass();
                                                listIterator = arrayList.listIterator(arrayList.size());
                                                while (true) {
                                                    if (listIterator.hasPrevious()) {
                                                    }
                                                }
                                                breadcrumb = (BugsnagClient.Breadcrumb) obj6;
                                                if (breadcrumb != null) {
                                                }
                                                str = null;
                                                if (diagnosticContext == null) {
                                                }
                                                if (!(r4 instanceof MainActivity)) {
                                                }
                                                if (mainActivity != null) {
                                                }
                                                moneybotContext = null;
                                                String str82 = str;
                                                ArrayList arrayList72 = plus;
                                                pair3 = pair2;
                                                String str92 = bugReport.title;
                                                SessionManager sessionManager3 = realBugReportSender2.sessionManager;
                                                SessionManager sessionManager22 = realBugReportSender2.sessionManager;
                                                str4 = bugReport.description;
                                                StringBuilder sb4 = new StringBuilder();
                                                if (StringsKt.isBlank(str4)) {
                                                }
                                                String appTokenOrNull2 = PlatformKt.appTokenOrNull(sessionManager3);
                                                sb4.append("\n\nCrashes: https://app.bugsnag.com/square-inc/cash-android/errors?filters[event.since][0]=7d&filters[user.id][0][type]=eq");
                                                sb4.append("&filters[user.id][0][value]=" + appTokenOrNull2 + "&sort=last_seen");
                                                sb4.append("\n\n");
                                                String sb22 = sb4.toString();
                                                CashAccountDatabaseImpl cashAccountDatabaseImpl2 = realBugReportSender2.cashDatabase;
                                                String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(sessionManager22);
                                                Profile profile2 = (Profile) cashAccountDatabaseImpl2.profileQueries.select$2().executeAsOneOrNull();
                                                if (profile2 != null) {
                                                }
                                                ByteString byteString2 = ByteString.EMPTY;
                                                CustomerContext customerContext2 = new CustomerContext(activeAccountTokenOrNull2, obj20, byteString2);
                                                AppContext appContext2 = new AppContext(PlatformKt.appTokenOrNull(sessionManager22), realBugReportSender2.endpoint, "5.58.0", "5580007", "production_release", str82, byteString2);
                                                DeviceMetrics deviceMetrics2 = (DeviceMetrics) obj2;
                                                deviceMetrics2.getClass();
                                                Platform platform2 = Platform.PLATFORM_ANDROID;
                                                String str102 = Build.VERSION.RELEASE;
                                                String str112 = Build.MANUFACTURER;
                                                String str122 = Build.MODEL;
                                                Integer valueOf3 = Integer.valueOf(deviceMetrics2.widthPixels);
                                                Integer valueOf22 = Integer.valueOf(deviceMetrics2.heightPixels);
                                                int i72 = deviceMetrics2.densityDpi;
                                                String str132 = (String) obj4;
                                                CreateBugReportRequest createBugReportRequest2 = new CreateBugReportRequest(str92, sb22, arrayList72, customerContext2, appContext2, new DeviceContext(platform2, str102, str112, str122, valueOf3, valueOf22, Integer.valueOf(i72), i72 == 120 ? i72 != 160 ? i72 != 213 ? i72 != 240 ? i72 != 320 ? i72 != 480 ? i72 != 640 ? String.valueOf(i72) : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "tvdpi" : "mdpi" : "ldpi", Locale.getDefault().toString(), byteString2), StringsKt.isBlank(str132) ? str132 : null, moneybotContext == null ? new FeatureContext(moneybotContext, byteString2) : null, byteString2);
                                                BugReportService bugReportService2 = realBugReportSender2.bugReportService;
                                                this.L$0 = null;
                                                this.L$1 = (List) collection2;
                                                this.L$2 = list2;
                                                this.L$3 = pair3;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.label = 3;
                                                createBugReport = bugReportService2.createBugReport(createBugReportRequest2, this);
                                                if (createBugReport != coroutineSingletons) {
                                                }
                                                return coroutineSingletons;
                                            }
                                        }
                                        obj9 = breadcrumb3.metadata.get("screenId");
                                        if (obj9 != null) {
                                            sb3.append("  Screen ID: " + obj9);
                                            sb3.append('\n');
                                        }
                                        obj10 = breadcrumb3.metadata.get("initiator");
                                        if (obj10 != null) {
                                            sb3.append("  Initiator: " + obj10);
                                            sb3.append('\n');
                                        }
                                        sb3.append('\n');
                                        it4 = it;
                                        obj16 = obj4;
                                        obj17 = obj5;
                                    }
                                }
                                if (date == null) {
                                }
                                sb3.append("[" + str3 + "] " + breadcrumb3.message);
                                sb3.append('\n');
                                obj8 = breadcrumb3.metadata.get("screen");
                                if (obj8 != null) {
                                }
                                obj9 = breadcrumb3.metadata.get("screenId");
                                if (obj9 != null) {
                                }
                                obj10 = breadcrumb3.metadata.get("initiator");
                                if (obj10 != null) {
                                }
                                sb3.append('\n');
                                it4 = it;
                                obj16 = obj4;
                                obj17 = obj5;
                            }
                            obj4 = obj16;
                            obj5 = obj17;
                            String sb5 = sb3.toString();
                            File file2 = new File(file, "navigation_breadcrumbs.txt");
                            FilesKt__FileReadWriteKt.writeText$default(file2, sb5);
                            pair = new Pair(file2, new AttachmentIdentifier("navigation_breadcrumbs_" + UUID.randomUUID()));
                        } catch (Exception e2) {
                            e = e2;
                            obj4 = obj16;
                            obj5 = obj17;
                            Timber.Forest.e("Failed to create navigation breadcrumbs file", new Object[0], e);
                            pair = null;
                            pair2 = pair;
                            if (pair2 != null) {
                            }
                            Iterable iterable2 = EmptyList.INSTANCE;
                            plus = CollectionsKt.plus(iterable2, (Collection) CollectionsKt.plus((Iterable) list2, collection2));
                            arrayList.getClass();
                            listIterator = arrayList.listIterator(arrayList.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                }
                            }
                            breadcrumb = (BugsnagClient.Breadcrumb) obj6;
                            if (breadcrumb != null) {
                            }
                            str = null;
                            if (diagnosticContext == null) {
                            }
                            if (!(r4 instanceof MainActivity)) {
                            }
                            if (mainActivity != null) {
                            }
                            moneybotContext = null;
                            String str822 = str;
                            ArrayList arrayList722 = plus;
                            pair3 = pair2;
                            String str922 = bugReport.title;
                            SessionManager sessionManager32 = realBugReportSender2.sessionManager;
                            SessionManager sessionManager222 = realBugReportSender2.sessionManager;
                            str4 = bugReport.description;
                            StringBuilder sb42 = new StringBuilder();
                            if (StringsKt.isBlank(str4)) {
                            }
                            String appTokenOrNull22 = PlatformKt.appTokenOrNull(sessionManager32);
                            sb42.append("\n\nCrashes: https://app.bugsnag.com/square-inc/cash-android/errors?filters[event.since][0]=7d&filters[user.id][0][type]=eq");
                            sb42.append("&filters[user.id][0][value]=" + appTokenOrNull22 + "&sort=last_seen");
                            sb42.append("\n\n");
                            String sb222 = sb42.toString();
                            CashAccountDatabaseImpl cashAccountDatabaseImpl22 = realBugReportSender2.cashDatabase;
                            String activeAccountTokenOrNull22 = PlatformKt.activeAccountTokenOrNull(sessionManager222);
                            Profile profile22 = (Profile) cashAccountDatabaseImpl22.profileQueries.select$2().executeAsOneOrNull();
                            if (profile22 != null) {
                            }
                            ByteString byteString22 = ByteString.EMPTY;
                            CustomerContext customerContext22 = new CustomerContext(activeAccountTokenOrNull22, obj20, byteString22);
                            AppContext appContext22 = new AppContext(PlatformKt.appTokenOrNull(sessionManager222), realBugReportSender2.endpoint, "5.58.0", "5580007", "production_release", str822, byteString22);
                            DeviceMetrics deviceMetrics22 = (DeviceMetrics) obj2;
                            deviceMetrics22.getClass();
                            Platform platform22 = Platform.PLATFORM_ANDROID;
                            String str1022 = Build.VERSION.RELEASE;
                            String str1122 = Build.MANUFACTURER;
                            String str1222 = Build.MODEL;
                            Integer valueOf32 = Integer.valueOf(deviceMetrics22.widthPixels);
                            Integer valueOf222 = Integer.valueOf(deviceMetrics22.heightPixels);
                            int i722 = deviceMetrics22.densityDpi;
                            String str1322 = (String) obj4;
                            CreateBugReportRequest createBugReportRequest22 = new CreateBugReportRequest(str922, sb222, arrayList722, customerContext22, appContext22, new DeviceContext(platform22, str1022, str1122, str1222, valueOf32, valueOf222, Integer.valueOf(i722), i722 == 120 ? i722 != 160 ? i722 != 213 ? i722 != 240 ? i722 != 320 ? i722 != 480 ? i722 != 640 ? String.valueOf(i722) : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "tvdpi" : "mdpi" : "ldpi", Locale.getDefault().toString(), byteString22), StringsKt.isBlank(str1322) ? str1322 : null, moneybotContext == null ? new FeatureContext(moneybotContext, byteString22) : null, byteString22);
                            BugReportService bugReportService22 = realBugReportSender2.bugReportService;
                            this.L$0 = null;
                            this.L$1 = (List) collection2;
                            this.L$2 = list2;
                            this.L$3 = pair3;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.label = 3;
                            createBugReport = bugReportService22.createBugReport(createBugReportRequest22, this);
                            if (createBugReport != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        pair2 = pair;
                        if (pair2 != null || (attachmentIdentifier = (AttachmentIdentifier) pair2.second) == null || (iterable2 = CollectionsKt__CollectionsJVMKt.listOf(attachmentIdentifier)) == null) {
                            Iterable iterable22 = EmptyList.INSTANCE;
                        }
                        plus = CollectionsKt.plus(iterable22, (Collection) CollectionsKt.plus((Iterable) list2, collection2));
                        arrayList.getClass();
                        listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                z2 = false;
                                obj6 = null;
                            } else {
                                obj6 = listIterator.previous();
                                BugsnagClient.Breadcrumb breadcrumb4 = (BugsnagClient.Breadcrumb) obj6;
                                z2 = false;
                                if (!StringsKt__StringsJVMKt.startsWith(breadcrumb4.message, "Show full screen:", false) && !StringsKt__StringsJVMKt.startsWith(breadcrumb4.message, "Show overlay:", false)) {
                                }
                            }
                        }
                        breadcrumb = (BugsnagClient.Breadcrumb) obj6;
                        if (breadcrumb != null && (str2 = breadcrumb.message) != null) {
                            str = !StringsKt__StringsJVMKt.startsWith(str2, "Show full screen:", z2) ? StringsKt.trim(StringsKt.removePrefix("Show full screen:", str2)).toString() : StringsKt__StringsJVMKt.startsWith(str2, "Show overlay:", z2) ? StringsKt.trim(StringsKt.removePrefix("Show overlay:", str2)).toString() : null;
                            if (str != null) {
                                break;
                            }
                        }
                        str = null;
                        Activity activity = diagnosticContext == null ? diagnosticContext.context : null;
                        mainActivity = !(activity instanceof MainActivity) ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            e eVar = realBugReportSender2.backStackDumper;
                            Collection<BackStack$ScreenEntry> dumpBackStack = mainActivity.dumpBackStack();
                            ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dumpBackStack, 10));
                            for (BackStack$ScreenEntry backStack$ScreenEntry : dumpBackStack) {
                                arrayList9.add(backStack$ScreenEntry.args.getClass() + "@" + backStack$ScreenEntry.args.hashCode() + "\n");
                            }
                            if (!arrayList9.isEmpty()) {
                                Iterator it5 = arrayList9.iterator();
                                while (it5.hasNext()) {
                                    if (StringsKt.contains((CharSequence) it5.next(), (CharSequence) "MoneybotChat", true)) {
                                        if (mainActivity != null) {
                                            KeyValue keyValue = realBugReportSender2.recentMoneybotSession;
                                            this.L$0 = null;
                                            this.L$1 = (List) collection2;
                                            this.L$2 = list2;
                                            this.L$3 = pair2;
                                            this.L$5 = plus;
                                            this.L$6 = str;
                                            this.label = 2;
                                            obj7 = keyValue.get(this);
                                            if (obj7 != coroutineSingletons) {
                                                list3 = list2;
                                                RecentMoneybotSession recentMoneybotSession2 = (RecentMoneybotSession) obj7;
                                                moneybotContext = new MoneybotContext(recentMoneybotSession2 == null ? recentMoneybotSession2.sessionId : null, ByteString.EMPTY);
                                                list2 = list3;
                                                String str8222 = str;
                                                ArrayList arrayList7222 = plus;
                                                pair3 = pair2;
                                                String str9222 = bugReport.title;
                                                SessionManager sessionManager322 = realBugReportSender2.sessionManager;
                                                SessionManager sessionManager2222 = realBugReportSender2.sessionManager;
                                                str4 = bugReport.description;
                                                StringBuilder sb422 = new StringBuilder();
                                                if (StringsKt.isBlank(str4)) {
                                                }
                                                String appTokenOrNull222 = PlatformKt.appTokenOrNull(sessionManager322);
                                                sb422.append("\n\nCrashes: https://app.bugsnag.com/square-inc/cash-android/errors?filters[event.since][0]=7d&filters[user.id][0][type]=eq");
                                                sb422.append("&filters[user.id][0][value]=" + appTokenOrNull222 + "&sort=last_seen");
                                                sb422.append("\n\n");
                                                String sb2222 = sb422.toString();
                                                CashAccountDatabaseImpl cashAccountDatabaseImpl222 = realBugReportSender2.cashDatabase;
                                                String activeAccountTokenOrNull222 = PlatformKt.activeAccountTokenOrNull(sessionManager2222);
                                                Profile profile222 = (Profile) cashAccountDatabaseImpl222.profileQueries.select$2().executeAsOneOrNull();
                                                if (profile222 != null) {
                                                }
                                                ByteString byteString222 = ByteString.EMPTY;
                                                CustomerContext customerContext222 = new CustomerContext(activeAccountTokenOrNull222, obj20, byteString222);
                                                AppContext appContext222 = new AppContext(PlatformKt.appTokenOrNull(sessionManager2222), realBugReportSender2.endpoint, "5.58.0", "5580007", "production_release", str8222, byteString222);
                                                DeviceMetrics deviceMetrics222 = (DeviceMetrics) obj2;
                                                deviceMetrics222.getClass();
                                                Platform platform222 = Platform.PLATFORM_ANDROID;
                                                String str10222 = Build.VERSION.RELEASE;
                                                String str11222 = Build.MANUFACTURER;
                                                String str12222 = Build.MODEL;
                                                Integer valueOf322 = Integer.valueOf(deviceMetrics222.widthPixels);
                                                Integer valueOf2222 = Integer.valueOf(deviceMetrics222.heightPixels);
                                                int i7222 = deviceMetrics222.densityDpi;
                                                String str13222 = (String) obj4;
                                                CreateBugReportRequest createBugReportRequest222 = new CreateBugReportRequest(str9222, sb2222, arrayList7222, customerContext222, appContext222, new DeviceContext(platform222, str10222, str11222, str12222, valueOf322, valueOf2222, Integer.valueOf(i7222), i7222 == 120 ? i7222 != 160 ? i7222 != 213 ? i7222 != 240 ? i7222 != 320 ? i7222 != 480 ? i7222 != 640 ? String.valueOf(i7222) : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "tvdpi" : "mdpi" : "ldpi", Locale.getDefault().toString(), byteString222), StringsKt.isBlank(str13222) ? str13222 : null, moneybotContext == null ? new FeatureContext(moneybotContext, byteString222) : null, byteString222);
                                                BugReportService bugReportService222 = realBugReportSender2.bugReportService;
                                                this.L$0 = null;
                                                this.L$1 = (List) collection2;
                                                this.L$2 = list2;
                                                this.L$3 = pair3;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.label = 3;
                                                createBugReport = bugReportService222.createBugReport(createBugReportRequest222, this);
                                                if (createBugReport != coroutineSingletons) {
                                                }
                                            }
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            }
                            mainActivity = null;
                            if (mainActivity != null) {
                            }
                        }
                        moneybotContext = null;
                        String str82222 = str;
                        ArrayList arrayList72222 = plus;
                        pair3 = pair2;
                        String str92222 = bugReport.title;
                        SessionManager sessionManager3222 = realBugReportSender2.sessionManager;
                        SessionManager sessionManager22222 = realBugReportSender2.sessionManager;
                        str4 = bugReport.description;
                        StringBuilder sb4222 = new StringBuilder();
                        if (StringsKt.isBlank(str4)) {
                        }
                        String appTokenOrNull2222 = PlatformKt.appTokenOrNull(sessionManager3222);
                        sb4222.append("\n\nCrashes: https://app.bugsnag.com/square-inc/cash-android/errors?filters[event.since][0]=7d&filters[user.id][0][type]=eq");
                        sb4222.append("&filters[user.id][0][value]=" + appTokenOrNull2222 + "&sort=last_seen");
                        sb4222.append("\n\n");
                        String sb22222 = sb4222.toString();
                        CashAccountDatabaseImpl cashAccountDatabaseImpl2222 = realBugReportSender2.cashDatabase;
                        String activeAccountTokenOrNull2222 = PlatformKt.activeAccountTokenOrNull(sessionManager22222);
                        Profile profile2222 = (Profile) cashAccountDatabaseImpl2222.profileQueries.select$2().executeAsOneOrNull();
                        if (profile2222 != null) {
                        }
                        ByteString byteString2222 = ByteString.EMPTY;
                        CustomerContext customerContext2222 = new CustomerContext(activeAccountTokenOrNull2222, obj20, byteString2222);
                        AppContext appContext2222 = new AppContext(PlatformKt.appTokenOrNull(sessionManager22222), realBugReportSender2.endpoint, "5.58.0", "5580007", "production_release", str82222, byteString2222);
                        DeviceMetrics deviceMetrics2222 = (DeviceMetrics) obj2;
                        deviceMetrics2222.getClass();
                        Platform platform2222 = Platform.PLATFORM_ANDROID;
                        String str102222 = Build.VERSION.RELEASE;
                        String str112222 = Build.MANUFACTURER;
                        String str122222 = Build.MODEL;
                        Integer valueOf3222 = Integer.valueOf(deviceMetrics2222.widthPixels);
                        Integer valueOf22222 = Integer.valueOf(deviceMetrics2222.heightPixels);
                        int i72222 = deviceMetrics2222.densityDpi;
                        String str132222 = (String) obj4;
                        CreateBugReportRequest createBugReportRequest2222 = new CreateBugReportRequest(str92222, sb22222, arrayList72222, customerContext2222, appContext2222, new DeviceContext(platform2222, str102222, str112222, str122222, valueOf3222, valueOf22222, Integer.valueOf(i72222), i72222 == 120 ? i72222 != 160 ? i72222 != 213 ? i72222 != 240 ? i72222 != 320 ? i72222 != 480 ? i72222 != 640 ? String.valueOf(i72222) : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "tvdpi" : "mdpi" : "ldpi", Locale.getDefault().toString(), byteString2222), StringsKt.isBlank(str132222) ? str132222 : null, moneybotContext == null ? new FeatureContext(moneybotContext, byteString2222) : null, byteString2222);
                        BugReportService bugReportService2222 = realBugReportSender2.bugReportService;
                        this.L$0 = null;
                        this.L$1 = (List) collection2;
                        this.L$2 = list2;
                        this.L$3 = pair3;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 3;
                        createBugReport = bugReportService2222.createBugReport(createBugReportRequest2222, this);
                        if (createBugReport != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    Timber.Forest.w("No navigation breadcrumbs to attach", new Object[0]);
                }
                list2 = list;
                obj4 = obj16;
                obj5 = obj17;
                pair2 = null;
                if (pair2 != null) {
                }
                Iterable iterable222 = EmptyList.INSTANCE;
                plus = CollectionsKt.plus(iterable222, (Collection) CollectionsKt.plus((Iterable) list2, collection2));
                arrayList.getClass();
                listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                    }
                }
                breadcrumb = (BugsnagClient.Breadcrumb) obj6;
                if (breadcrumb != null) {
                    if (!StringsKt__StringsJVMKt.startsWith(str2, "Show full screen:", z2)) {
                    }
                    if (str != null) {
                    }
                }
                str = null;
                if (diagnosticContext == null) {
                }
                if (!(activity instanceof MainActivity)) {
                }
                if (mainActivity != null) {
                }
                moneybotContext = null;
                String str822222 = str;
                ArrayList arrayList722222 = plus;
                pair3 = pair2;
                String str922222 = bugReport.title;
                SessionManager sessionManager32222 = realBugReportSender2.sessionManager;
                SessionManager sessionManager222222 = realBugReportSender2.sessionManager;
                str4 = bugReport.description;
                StringBuilder sb42222 = new StringBuilder();
                if (StringsKt.isBlank(str4)) {
                }
                String appTokenOrNull22222 = PlatformKt.appTokenOrNull(sessionManager32222);
                sb42222.append("\n\nCrashes: https://app.bugsnag.com/square-inc/cash-android/errors?filters[event.since][0]=7d&filters[user.id][0][type]=eq");
                sb42222.append("&filters[user.id][0][value]=" + appTokenOrNull22222 + "&sort=last_seen");
                sb42222.append("\n\n");
                String sb222222 = sb42222.toString();
                CashAccountDatabaseImpl cashAccountDatabaseImpl22222 = realBugReportSender2.cashDatabase;
                String activeAccountTokenOrNull22222 = PlatformKt.activeAccountTokenOrNull(sessionManager222222);
                Profile profile22222 = (Profile) cashAccountDatabaseImpl22222.profileQueries.select$2().executeAsOneOrNull();
                if (profile22222 != null) {
                }
                ByteString byteString22222 = ByteString.EMPTY;
                CustomerContext customerContext22222 = new CustomerContext(activeAccountTokenOrNull22222, obj20, byteString22222);
                AppContext appContext22222 = new AppContext(PlatformKt.appTokenOrNull(sessionManager222222), realBugReportSender2.endpoint, "5.58.0", "5580007", "production_release", str822222, byteString22222);
                DeviceMetrics deviceMetrics22222 = (DeviceMetrics) obj2;
                deviceMetrics22222.getClass();
                Platform platform22222 = Platform.PLATFORM_ANDROID;
                String str1022222 = Build.VERSION.RELEASE;
                String str1122222 = Build.MANUFACTURER;
                String str1222222 = Build.MODEL;
                Integer valueOf32222 = Integer.valueOf(deviceMetrics22222.widthPixels);
                Integer valueOf222222 = Integer.valueOf(deviceMetrics22222.heightPixels);
                int i722222 = deviceMetrics22222.densityDpi;
                String str1322222 = (String) obj4;
                CreateBugReportRequest createBugReportRequest22222 = new CreateBugReportRequest(str922222, sb222222, arrayList722222, customerContext22222, appContext22222, new DeviceContext(platform22222, str1022222, str1122222, str1222222, valueOf32222, valueOf222222, Integer.valueOf(i722222), i722222 == 120 ? i722222 != 160 ? i722222 != 213 ? i722222 != 240 ? i722222 != 320 ? i722222 != 480 ? i722222 != 640 ? String.valueOf(i722222) : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "tvdpi" : "mdpi" : "ldpi", Locale.getDefault().toString(), byteString22222), StringsKt.isBlank(str1322222) ? str1322222 : null, moneybotContext == null ? new FeatureContext(moneybotContext, byteString22222) : null, byteString22222);
                BugReportService bugReportService22222 = realBugReportSender2.bugReportService;
                this.L$0 = null;
                this.L$1 = (List) collection2;
                this.L$2 = list2;
                this.L$3 = pair3;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
                createBugReport = bugReportService22222.createBugReport(createBugReportRequest22222, this);
                if (createBugReport != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 1:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$5;
                    ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$1 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope4, (LocalOrderStatusPresenter) this.L$1, (Location.LocationSummary) this.L$2, (LocalAddress) this.L$3, (String) this.L$6, (MutableState) obj16, (MutableState) obj14, (State) obj17, (MutableState) obj15, (MutableState) obj13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(articlePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                Animatable animatable = (Animatable) obj15;
                Animatable animatable2 = (Animatable) obj17;
                Animatable animatable3 = (Animatable) obj14;
                Animatable animatable4 = (Animatable) obj16;
                Animatable animatable5 = (Animatable) this.L$6;
                Animatable animatable6 = (Animatable) this.L$3;
                Animatable animatable7 = (Animatable) this.L$2;
                MutableState mutableState = (MutableState) this.L$5;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        TransitionStep transitionStep = (TransitionStep) mutableState.getValue();
                        if (!(transitionStep instanceof TransitionStep.InitialStep)) {
                            if (!(transitionStep instanceof TransitionStep.BrandCardStep)) {
                                r5 = 0;
                                boolean z3 = false;
                                i2 = 3;
                                if (!(transitionStep instanceof TransitionStep.BrandCardWithAllTextsStep)) {
                                    if (!(transitionStep instanceof TransitionStep.LocalCashCardStep)) {
                                        if (!(transitionStep instanceof TransitionStep.LegalConsentStep)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    Duration.Companion companion = Duration.Companion;
                                    long duration = DurationKt.toDuration(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, DurationUnit.MILLISECONDS);
                                    this.label = 6;
                                    break;
                                } else {
                                    JobKt.launch$default(coroutineScope5, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable7, z3 ? 1 : 0, 2), 3);
                                    Duration.Companion companion2 = Duration.Companion;
                                    long duration2 = DurationKt.toDuration(800, DurationUnit.MILLISECONDS);
                                    this.label = 3;
                                    break;
                                }
                            } else {
                                r52 = 0;
                                i3 = 3;
                                JobKt.launch$default(coroutineScope5, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable7, false ? 1 : 0, 2), 3);
                                Duration.Companion companion3 = Duration.Companion;
                                long duration3 = DurationKt.toDuration(800, DurationUnit.MILLISECONDS);
                                this.label = 2;
                                break;
                            }
                        } else {
                            long j = ((TransitionStep.InitialStep) transitionStep).delay;
                            this.label = 1;
                            break;
                        }
                        return coroutineSingletons3;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel = (LocalPosBrandOnboardingViewModel) this.L$0;
                        LocalPosBrandOnboardingViewModel.CardModel cardModel = localPosBrandOnboardingViewModel instanceof LocalPosBrandOnboardingViewModel.CardModel ? (LocalPosBrandOnboardingViewModel.CardModel) localPosBrandOnboardingViewModel : null;
                        mutableState.setValue((cardModel != null ? cardModel.flipDelay : null) == null ? TransitionStep.BrandCardWithAllTextsStep.INSTANCE : TransitionStep.BrandCardStep.INSTANCE);
                        return Unit.INSTANCE;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        r52 = 0;
                        i3 = 3;
                        JobKt.launch$default(coroutineScope5, r52, r52, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable6, r52, 7), i3);
                        JobKt.launch$default(coroutineScope5, r52, r52, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable5, r52, 8), i3);
                        mutableState.setValue(TransitionStep.LocalCashCardStep.INSTANCE);
                        return Unit.INSTANCE;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        r5 = 0;
                        i2 = 3;
                        JobKt.launch$default(coroutineScope5, r5, r5, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable6, r5, 7), i2);
                        JobKt.launch$default(coroutineScope5, r5, r5, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable5, r5, 8), i2);
                        Duration.Companion companion4 = Duration.Companion;
                        long duration4 = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
                        this.label = 4;
                        r53 = r5;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        r53 = 0;
                        i2 = 3;
                        JobKt.launch$default(coroutineScope5, r53, r53, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable4, r53, 5), i2);
                        JobKt.launch$default(coroutineScope5, r53, r53, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable3, r53, 6), i2);
                        Duration.Companion companion5 = Duration.Companion;
                        long duration5 = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
                        this.label = 5;
                        r54 = r53;
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        r54 = 0;
                        i2 = 3;
                        JobKt.launch$default(coroutineScope5, r54, r54, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable2, r54, i2), i2);
                        JobKt.launch$default(coroutineScope5, r54, r54, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable, r54, 4), i2);
                        return Unit.INSTANCE;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        r55 = 0;
                        i4 = 3;
                        JobKt.launch$default(coroutineScope5, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj13, false ? 1 : 0, 1), 3);
                        Duration.Companion companion6 = Duration.Companion;
                        long duration6 = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
                        this.label = 7;
                        break;
                    case 7:
                        SafeTrace.throwOnFailure(obj);
                        r55 = 0;
                        i4 = 3;
                        JobKt.launch$default(coroutineScope5, r55, r55, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable4, r55, 5), i4);
                        JobKt.launch$default(coroutineScope5, r55, r55, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable3, r55, 6), i4);
                        Duration.Companion companion7 = Duration.Companion;
                        long duration7 = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
                        this.label = 8;
                        r56 = r55;
                        break;
                    case 8:
                        SafeTrace.throwOnFailure(obj);
                        r56 = 0;
                        i4 = 3;
                        JobKt.launch$default(coroutineScope5, r56, r56, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable2, r56, i4), i4);
                        JobKt.launch$default(coroutineScope5, r56, r56, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable, r56, 4), i4);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 3:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$transfer$BitcoinTransferPresenter$models$7$1(obj);
            case 4:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$5;
                    ShoppingWebPresenter$models$$inlined$CollectEffect$1$1 shoppingWebPresenter$models$$inlined$CollectEffect$1$1 = new ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(coroutineScope6, (ChannelListPresenter) this.L$1, (MutableState) this.L$2, (String) this.L$6, (NotificationChannelId) this.L$3, (MutableState) obj16, (MutableState) obj14, (MutableState) obj17, (MutableState) obj15, (State) obj13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(shoppingWebPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$5;
                    ShoppingWebPresenter$models$$inlined$CollectEffect$1$1 shoppingWebPresenter$models$$inlined$CollectEffect$1$12 = new ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(coroutineScope7, (ShoppingWebPresenter) this.L$1, (MutableState) this.L$2, (MutableState) this.L$3, (MutableState) this.L$6, (MutableState) obj16, (MutableState) obj14, (MutableState) obj17, (MutableState) obj15, (MutableState) obj13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(shoppingWebPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                return invokeSuspend$com$squareup$cash$transfers$presenters$AddMoneyPresenter$models$$inlined$CollectEffect$1(obj);
            case 7:
                return invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3(obj);
            default:
                String str14 = (String) obj16;
                String str15 = (String) obj15;
                SdkTransactionId sdkTransactionId = (SdkTransactionId) this.L$2;
                zzai zzaiVar = (zzai) obj14;
                Object obj21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                try {
                } catch (Throwable th) {
                    Result.Companion companion8 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PublicKey publicKey2 = (PublicKey) obj13;
                    Result.Companion companion9 = Result.Companion;
                    TextSetter textSetter2 = (TextSetter) zzaiVar.zza;
                    this.L$1 = null;
                    this.L$0 = publicKey2;
                    this.L$6 = str15;
                    this.L$3 = str14;
                    this.L$5 = textSetter2;
                    this.label = 1;
                    deviceDataJson$3ds2sdk_release = zzaiVar.deviceDataJson$3ds2sdk_release(sdkTransactionId, this);
                    if (deviceDataJson$3ds2sdk_release == obj21) {
                        return obj21;
                    }
                    publicKey = publicKey2;
                    textSetter = textSetter2;
                    str6 = str15;
                    str7 = str14;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sdkTransactionId = (SdkTransactionId) ((Serializable) this.L$3);
                        str5 = (String) this.L$6;
                        SafeTrace.throwOnFailure(obj);
                        obj11 = obj;
                        String str16 = str5;
                        SdkTransactionId sdkTransactionId2 = sdkTransactionId;
                        String str17 = ((AppInfo) obj11).sdkAppId;
                        String str18 = (String) zzaiVar.zzc;
                        PublicKey publicKey3 = (PublicKey) obj17;
                        str15.getClass();
                        Iterator it6 = DirectoryServer.$ENTRIES.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj12 = it6.next();
                                if (((DirectoryServer) obj12).ids.contains(str15)) {
                                }
                            } else {
                                obj12 = null;
                            }
                        }
                        DirectoryServer directoryServer = (DirectoryServer) obj12;
                        KeyUse keyUse = directoryServer != null ? directoryServer.keyUse : KeyUse.SIGNATURE;
                        publicKey3.getClass();
                        Curve curve = Curve.P_256;
                        ECPublicKey eCPublicKey = (ECPublicKey) publicKey3;
                        Base64URL encodeCoordinate = ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX());
                        Base64URL encodeCoordinate2 = ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY());
                        Objects.requireNonNull(curve, "The curve must not be null");
                        try {
                            ECKey eCKey = new ECKey(curve, encodeCoordinate, encodeCoordinate2, keyUse, null, null, (str14 == null || StringsKt.isBlank(str14)) ? null : str14, null, null, null, null, null, null, null, null);
                            List list8 = eCKey.x5c;
                            String jSONString = JSONObjectUtils.toJSONString(new ECKey(eCKey.crv, eCKey.x, eCKey.y, eCKey.use, eCKey.ops, eCKey.alg, eCKey.kid, eCKey.x5u, eCKey.x5t, eCKey.x5t256, list8 != null ? Collections.unmodifiableList(list8) : null, eCKey.exp, eCKey.nbf, eCKey.iat, eCKey.revocation).toJSONObject());
                            jSONString.getClass();
                            ((MessageVersionRegistry) zzaiVar.zzb).getClass();
                            obj21 = new AuthenticationRequestParameters(str16, sdkTransactionId2, str17, str18, jSONString, "2.2.0");
                            return obj21;
                        } catch (IllegalArgumentException e3) {
                            a$$ExternalSyntheticBUOutline0.m(e3.getMessage(), e3);
                            return null;
                        }
                    }
                    textSetter = (TextSetter) this.L$5;
                    str7 = (String) ((Serializable) this.L$3);
                    String str19 = (String) this.L$6;
                    PublicKey publicKey4 = (PublicKey) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    publicKey = publicKey4;
                    str6 = str19;
                    deviceDataJson$3ds2sdk_release = obj;
                }
                String jSONObject = ((JSONObject) deviceDataJson$3ds2sdk_release).toString();
                jSONObject.getClass();
                failure = textSetter.encrypt(jSONObject, publicKey, str6, str7);
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) zzaiVar.zzd;
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=", str15, "\n                    keyId=", str14, "\n                    sdkTransactionId=");
                    m.append(sdkTransactionId);
                    m.append("\n                    ");
                    defaultErrorReporter.reportError(new RuntimeException(StringsKt__IndentKt.replaceIndent(m.toString()), m4120exceptionOrNullimpl));
                }
                Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl2 != null) {
                    throw new SDKRuntimeException(m4120exceptionOrNullimpl2);
                }
                str5 = (String) failure;
                Sniffer sniffer = (Sniffer) zzaiVar.zad;
                this.L$1 = null;
                this.L$0 = null;
                this.L$6 = str5;
                this.L$3 = sdkTransactionId;
                this.L$5 = null;
                this.label = 2;
                obj11 = sniffer.get(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBugReportSender$submitBugReport$2(CardRegistry.SharedCardTransitionState sharedCardTransitionState, CardWobbleState cardWobbleState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, CardScene cardScene, Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.L$5 = sharedCardTransitionState;
        this.L$1 = cardWobbleState;
        this.L$2 = mutableState;
        this.L$3 = mutableState2;
        this.L$6 = mutableState3;
        this.$reportingEmail = mutableState4;
        this.this$0 = mutableState5;
        this.$report = mutableState6;
        this.$diagnosticContext = cardScene;
        this.$deviceMetrics = ref$BooleanRef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBugReportSender$submitBugReport$2(SdkTransactionId sdkTransactionId, zzai zzaiVar, PublicKey publicKey, String str, String str2, PublicKey publicKey2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.L$2 = sdkTransactionId;
        this.this$0 = zzaiVar;
        this.$report = publicKey;
        this.$reportingEmail = str;
        this.$diagnosticContext = str2;
        this.$deviceMetrics = publicKey2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBugReportSender$submitBugReport$2(RealBugReportSender realBugReportSender, BugReport bugReport, DiagnosticContext diagnosticContext, DeviceMetrics deviceMetrics, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = realBugReportSender;
        this.$report = bugReport;
        this.$diagnosticContext = diagnosticContext;
        this.$deviceMetrics = deviceMetrics;
        this.$reportingEmail = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBugReportSender$submitBugReport$2(Flow flow, Continuation continuation, ChannelListPresenter channelListPresenter, MutableState mutableState, String str, NotificationChannelId notificationChannelId, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, State state) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.L$5 = flow;
        this.L$1 = channelListPresenter;
        this.L$2 = mutableState;
        this.L$6 = str;
        this.L$3 = notificationChannelId;
        this.$reportingEmail = mutableState2;
        this.this$0 = mutableState3;
        this.$report = mutableState4;
        this.$diagnosticContext = mutableState5;
        this.$deviceMetrics = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBugReportSender$submitBugReport$2(Flow flow, Continuation continuation, Object obj, Object obj2, Object obj3, Object obj4, MutableState mutableState, State state, State state2, MutableState mutableState2, MutableState mutableState3, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$5 = flow;
        this.L$1 = obj;
        this.L$2 = obj2;
        this.L$3 = obj3;
        this.L$6 = obj4;
        this.$reportingEmail = mutableState;
        this.this$0 = state;
        this.$report = state2;
        this.$diagnosticContext = mutableState2;
        this.$deviceMetrics = mutableState3;
    }
}
