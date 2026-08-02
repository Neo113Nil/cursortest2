package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.fillr.e0;
import com.google.zxing.BinaryBitmap;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$models$2$1$1;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenter;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.applet.toolbar.RealBitcoinHomeToolbarPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinPeriodSelectionScreen;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmDialogPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmSheetPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionDialogActionPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionUtilKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewEvent;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.crypto.CryptoStablecoinDepositStart;
import com.squareup.cash.cdf.crypto.CryptoStackStart;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvest;
import com.squareup.cash.crypto.backend.receiveasbitcoin.ReceiveP2PAsBitcoinState;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworksResult;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetDateRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$SetDateRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AmountBlockerPresenter$models$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $helpAction;
    public Object $isLoading$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public /* synthetic */ Object this$0;

    /* renamed from: com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ MutableState $isLoading$delegate;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ AmountBlockerPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AmountBlockerPresenter amountBlockerPresenter, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.this$0 = amountBlockerPresenter;
            this.$isLoading$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$isLoading$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                this.$isLoading$delegate.setValue(Boolean.TRUE);
                this.L$0 = null;
                this.label = 1;
                if (AmountBlockerPresenter.access$handleHelpSubmission(this.this$0, submitAction, this) == coroutineSingletons) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountBlockerPresenter$models$1$2(MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$isLoading$delegate = mutableState;
        this.$helpAction = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$helpAction;
        switch (i) {
            case 0:
                return new AmountBlockerPresenter$models$1$2((AmountBlockerPresenter) this.this$0, (BlockerAction) obj2, (MutableState) this.$isLoading$delegate, continuation, 0);
            case 1:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$2 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (BitcoinHomePresenter) this.$isLoading$delegate, 1);
                amountBlockerPresenter$models$1$2.this$0 = obj;
                return amountBlockerPresenter$models$1$2;
            case 2:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$22 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (RealRouter) this.$isLoading$delegate, 2);
                amountBlockerPresenter$models$1$22.this$0 = obj;
                return amountBlockerPresenter$models$1$22;
            case 3:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$23 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (BinaryBitmap) this.$isLoading$delegate, 3);
                amountBlockerPresenter$models$1$23.this$0 = obj;
                return amountBlockerPresenter$models$1$23;
            case 4:
                return new AmountBlockerPresenter$models$1$2((e0) this.this$0, (MutableState) obj2, continuation, 4);
            case 5:
                return new AmountBlockerPresenter$models$1$2((BitcoinStackingToolsPresenter) this.this$0, (BitcoinInboundNavigator) obj2, (State) this.$isLoading$delegate, continuation, 5);
            case 6:
                return new AmountBlockerPresenter$models$1$2((BetterNavigator.ScreenNavigator) this.this$0, (BitcoinStackingToolsPresenter) obj2, (State) this.$isLoading$delegate, continuation, 6);
            case 7:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$24 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (RealBitcoinHomeToolbarPresenter) this.$isLoading$delegate, 7);
                amountBlockerPresenter$models$1$24.this$0 = obj;
                return amountBlockerPresenter$models$1$24;
            case 8:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$25 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (CardStudioPresenter) this.$isLoading$delegate, 8);
                amountBlockerPresenter$models$1$25.this$0 = obj;
                return amountBlockerPresenter$models$1$25;
            case 9:
                return new AmountBlockerPresenter$models$1$2((MoleculePresenter) this.this$0, (MutableState) this.$isLoading$delegate, (MutableState) obj2, continuation, 9);
            case 10:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$26 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (DisclosurePresenter) this.$isLoading$delegate, 10);
                amountBlockerPresenter$models$1$26.this$0 = obj;
                return amountBlockerPresenter$models$1$26;
            case 11:
                return new AmountBlockerPresenter$models$1$2((DisclosurePresenter) this.this$0, (MutableState) obj2, continuation, 11);
            case 12:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$27 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (ErrorPresenter) this.$isLoading$delegate, 12);
                amountBlockerPresenter$models$1$27.this$0 = obj;
                return amountBlockerPresenter$models$1$27;
            case 13:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$28 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (ErrorPresenter) this.$isLoading$delegate, 13);
                amountBlockerPresenter$models$1$28.this$0 = obj;
                return amountBlockerPresenter$models$1$28;
            case 14:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$29 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (LocalPosCheckInPresenter) this.$isLoading$delegate, 14);
                amountBlockerPresenter$models$1$29.this$0 = obj;
                return amountBlockerPresenter$models$1$29;
            case 15:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$210 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (NetEarningsInfoSheetPresenter) this.$isLoading$delegate, 15);
                amountBlockerPresenter$models$1$210.this$0 = obj;
                return amountBlockerPresenter$models$1$210;
            case 16:
                return new AmountBlockerPresenter$models$1$2((LocalPosCheckInPresenter) this.this$0, (SolanaAddress) obj2, (Ref$ObjectRef) this.$isLoading$delegate, continuation, 16);
            case 17:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$211 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (MusicPresenter) this.$isLoading$delegate, 17);
                amountBlockerPresenter$models$1$211.this$0 = obj;
                return amountBlockerPresenter$models$1$211;
            case 18:
                return new AmountBlockerPresenter$models$1$2((MoleculePresenter) this.this$0, (MutableState) this.$isLoading$delegate, (MutableState) obj2, continuation, 18);
            case 19:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$212 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (DisclosurePresenter) this.$isLoading$delegate, 19);
                amountBlockerPresenter$models$1$212.this$0 = obj;
                return amountBlockerPresenter$models$1$212;
            case 20:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$213 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (CardStudioPresenter) this.$isLoading$delegate, 20);
                amountBlockerPresenter$models$1$213.this$0 = obj;
                return amountBlockerPresenter$models$1$213;
            case 21:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$214 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (CardStudioUndoDialogPresenter) this.$isLoading$delegate, 21);
                amountBlockerPresenter$models$1$214.this$0 = obj;
                return amountBlockerPresenter$models$1$214;
            case 22:
                return new AmountBlockerPresenter$models$1$2((BitcoinTransferViewModel) this.this$0, (RealSheetState) obj2, (MutableState) this.$isLoading$delegate, continuation, 22);
            case 23:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$215 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (BlockerActionConfirmDialogPresenter) this.$isLoading$delegate, 23);
                amountBlockerPresenter$models$1$215.this$0 = obj;
                return amountBlockerPresenter$models$1$215;
            case 24:
                return new AmountBlockerPresenter$models$1$2((BlockerActionConfirmSheetPresenter) this.this$0, (SubmitFormRequest) obj2, (MutableState) this.$isLoading$delegate, continuation, 24);
            case 25:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$216 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (BlockerActionDialogActionPresenter) this.$isLoading$delegate, 25);
                amountBlockerPresenter$models$1$216.this$0 = obj;
                return amountBlockerPresenter$models$1$216;
            case 26:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$217 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (ErrorPresenter) this.$isLoading$delegate, 26);
                amountBlockerPresenter$models$1$217.this$0 = obj;
                return amountBlockerPresenter$models$1$217;
            case 27:
                AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$218 = new AmountBlockerPresenter$models$1$2((Flow) obj2, continuation, (AddAliasPresenter) this.$isLoading$delegate, 27);
                amountBlockerPresenter$models$1$218.this$0 = obj;
                return amountBlockerPresenter$models$1$218;
            case 28:
                return new AmountBlockerPresenter$models$1$2((RealMultiBlockerFacilitator) this.this$0, (BinaryBitmap) obj2, (SetDateRequest) this.$isLoading$delegate, continuation, 28);
            default:
                return new AmountBlockerPresenter$models$1$2((AtmPickerAmountBlockerPresenter) this.this$0, (AtmPickerAmountBlockerViewEvent) obj2, (MutableState) this.$isLoading$delegate, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AmountBlockerPresenter$models$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:369:0x0713, code lost:
    
        if (r0.set(r2, r24) == r1) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06fe, code lost:
    
        if (r3 == r1) goto L315;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        Object obj2;
        Object awaitInternal;
        MutableState mutableState2;
        Object depositOptions;
        Object resolve;
        Object submitBlocker;
        int i = this.$r8$classId;
        int i2 = 10;
        int i3 = 11;
        int i4 = 2;
        int i5 = 4;
        Object obj3 = this.$helpAction;
        int i6 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AmountBlockerPresenter amountBlockerPresenter = (AmountBlockerPresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper = amountBlockerPresenter.blockersHelper;
                    BlockerAction blockerAction = (BlockerAction) obj3;
                    BlockersScreens.AmountScreen amountScreen = amountBlockerPresenter.args;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(amountBlockerPresenter, (MutableState) this.$isLoading$delegate, null);
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, amountScreen, null, null, false, null, anonymousClass1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$1 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope, (BitcoinHomePresenter) this.$isLoading$delegate, 18);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$1, this) == coroutineSingletons2) {
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
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$12 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope2, (RealRouter) this.$isLoading$delegate, 20);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$12, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$13 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope3, (BinaryBitmap) this.$isLoading$delegate, 21);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$13, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                KeyValue keyValue = (KeyValue) ((e0) this.this$0).c;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) obj3;
                    this.$isLoading$delegate = mutableState;
                    this.label = 1;
                    obj2 = keyValue.get(this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.$isLoading$delegate;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                }
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                mutableState.setValue(bool);
                Boolean bool2 = Boolean.FALSE;
                this.$isLoading$delegate = null;
                this.label = 2;
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = ((BitcoinStackingToolsPresenter) this.this$0).analytics;
                    BitcoinStackingToolsInfoScreen.Type type2 = BitcoinStackingToolsInfoScreen.Type.AUTO_INVEST;
                    CryptoStackStart.EntryPoint entryPoint = CryptoStackStart.EntryPoint.APPLET;
                    CryptoAutoInvest cryptoAutoInvest = (CryptoAutoInvest) ((State) this.$isLoading$delegate).getValue();
                    ScaleKt.trackStackingToolStartEvent(analytics, type2, entryPoint, Boolean.valueOf((cryptoAutoInvest != null ? cryptoAutoInvest.recurringId : null) != null));
                    this.label = 1;
                    if (((RealBitcoinInboundNavigator) ((BitcoinInboundNavigator) obj3)).showAutoInvest(this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReceiveP2PAsBitcoinState receiveP2PAsBitcoinState = (ReceiveP2PAsBitcoinState) ((State) this.$isLoading$delegate).getValue();
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.this$0;
                    BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter = (BitcoinStackingToolsPresenter) obj3;
                    Analytics analytics2 = bitcoinStackingToolsPresenter.analytics;
                    CryptoStackStart.EntryPoint entryPoint2 = CryptoStackStart.EntryPoint.APPLET;
                    RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker = bitcoinStackingToolsPresenter.growToolsManagerViewAppearanceTracker;
                    this.label = 1;
                    if (RotateKt.handleStackingToolsReceiveAsBitcoinNavigation(receiveP2PAsBitcoinState, screenNavigator, analytics2, entryPoint2, realGrowToolsManagerViewAppearanceTracker, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(i4, coroutineScope4, (RealBitcoinHomeToolbarPresenter) this.$isLoading$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(passcodeViewKt$Passcode$3$1$1$1$2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$14 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope5, (CardStudioPresenter) this.$isLoading$delegate, 22);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$14, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((MutableState) this.$isLoading$delegate).setValue(Boolean.TRUE);
                    MusicPresenter musicPresenter = (MusicPresenter) this.this$0;
                    String str = (String) ((MutableState) obj3).getValue();
                    this.label = 1;
                    BitcoinPeriodSelectionScreen bitcoinPeriodSelectionScreen = (BitcoinPeriodSelectionScreen) musicPresenter.args;
                    Screen screen = bitcoinPeriodSelectionScreen.exitScreen;
                    CurrencyCode currencyCode = bitcoinPeriodSelectionScreen.currencyCode;
                    BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                    BitcoinExchangeType bitcoinExchangeType = bitcoinPeriodSelectionScreen.exchangeType;
                    BitcoinTransferScreen.OrderType.CustomOrder customOrder = bitcoinPeriodSelectionScreen.customOrder;
                    RealCryptoFlowStarter.initiateBitcoinExchange(new ExchangeRequest(null, null, null, bitcoinPeriodSelectionScreen.balanceToken, null, new Order.CustomOrderConfiguration(new Money(new Long(customOrder.currentUsdPerBtc), currencyCode, 4), new Money(new Long(customOrder.targetUsdPerBtc), currencyCode, 4), str, ByteString.EMPTY), null, null, null, 7927), bitcoinExchangeType, screen, screenNavigator2);
                    if (Unit.INSTANCE == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$15 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope6, (DisclosurePresenter) this.$isLoading$delegate, 23);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$15, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = (MutableState) obj3;
                    CompletableDeferredImpl sync = ((RealClientSyncer) ((DisclosurePresenter) this.this$0).appService).sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                    this.$isLoading$delegate = mutableState3;
                    this.label = 1;
                    awaitInternal = sync.awaitInternal(this);
                    if (awaitInternal == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                    mutableState2 = mutableState3;
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState2 = (MutableState) this.$isLoading$delegate;
                    SafeTrace.throwOnFailure(obj);
                    awaitInternal = obj;
                }
                mutableState2.setValue((ClientSyncer$Result) awaitInternal);
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$16 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope7, (ErrorPresenter) this.$isLoading$delegate, 24);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$16, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$17 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope8, (ErrorPresenter) this.$isLoading$delegate, 25);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$17, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$22 = new PasscodeViewKt$Passcode$3$1$1$1$2(i5, coroutineScope9, (LocalPosCheckInPresenter) this.$isLoading$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(passcodeViewKt$Passcode$3$1$1$1$22, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$18 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope10, (NetEarningsInfoSheetPresenter) this.$isLoading$delegate, 26);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$18, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) localPosCheckInPresenter.store;
                    SolanaAddress solanaAddress = (SolanaAddress) obj3;
                    Money money = new Money(new Long(((ParcelableSnapshotMutableLongState) ((Ref$ObjectRef) this.$isLoading$delegate).element).getLongValue()), CurrencyCode.USD, 4);
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                    this.label = 1;
                    if (((RealCryptoFlowStarter) cryptoFlowStarter).initiateStablecoinPayment(solanaAddress, money, null, null, PaymentScreens$HomeScreens$Home.INSTANCE, screenNavigator3) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$19 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope11, (MusicPresenter) this.$isLoading$delegate, 27);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$19, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                MutableState mutableState4 = (MutableState) obj3;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.this$0;
                StablecoinDepositOptionsScreen stablecoinDepositOptionsScreen = (StablecoinDepositOptionsScreen) cardStudioPresenter.cardStudioQueries;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((Analytics) cardStudioPresenter.analytics).track(new CryptoStablecoinDepositStart(), null);
                    boolean z = stablecoinDepositOptionsScreen.askedQuestion == null;
                    StablecoinNetworkRepo stablecoinNetworkRepo = (StablecoinNetworkRepo) cardStudioPresenter.appConfig;
                    this.label = 1;
                    depositOptions = stablecoinNetworkRepo.getDepositOptions(z, this);
                    if (depositOptions == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    depositOptions = obj;
                }
                StablecoinNetworksResult stablecoinNetworksResult = (StablecoinNetworksResult) depositOptions;
                if (stablecoinNetworksResult instanceof StablecoinNetworksResult.Success) {
                    MutableState mutableState5 = (MutableState) this.$isLoading$delegate;
                    List list = ((StablecoinNetworksResult.Success) stablecoinNetworksResult).options;
                    mutableState5.setValue(list);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        StablecoinNetwork stablecoinNetwork = ((StablecoinDepositOption) it.next()).network;
                        stablecoinNetwork.getClass();
                        arrayList.add(new StablecoinDepositOptionsViewModel.NetworkRow(stablecoinNetwork, new StackedAvatarViewModel.Avatar(null, StringsKt___StringsKt.firstOrNull(stablecoinNetwork.chainName), null, new Image(stablecoinNetwork.chainIconLightUrl, stablecoinNetwork.chainIconDarkUrl, 4), null, null, null, null, false, false, null, false, null, null, 131061)));
                    }
                    mutableState4.setValue(new StablecoinDepositOptionsViewModel.Loaded(arrayList));
                } else if (stablecoinNetworksResult instanceof StablecoinNetworksResult.NeedsPlasmaFlow) {
                    Screen screen2 = stablecoinDepositOptionsScreen.exitScreen;
                    if (screen2 == null) {
                        screen2 = new MoneyTabScreen(null);
                    }
                    ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(((BlockersDataNavigator) cardStudioPresenter.ioContext).getNext(stablecoinDepositOptionsScreen, OtelConventions.startPlasmaClientScenarioFlow((FlowStarter) cardStudioPresenter.args, screen2, ((StablecoinNetworksResult.NeedsPlasmaFlow) stablecoinNetworksResult).responseContext, null)));
                } else {
                    if (!(stablecoinNetworksResult instanceof StablecoinNetworksResult.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState4.setValue(StablecoinDepositOptionsViewModel.Error.INSTANCE);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$23 = new PasscodeViewKt$Passcode$3$1$1$1$2(i2, coroutineScope12, (DisclosurePresenter) this.$isLoading$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(passcodeViewKt$Passcode$3$1$1$1$23, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$24 = new PasscodeViewKt$Passcode$3$1$1$1$2(i3, coroutineScope13, (CardStudioPresenter) this.$isLoading$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(passcodeViewKt$Passcode$3$1$1$1$24, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$110 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope14, (CardStudioUndoDialogPresenter) this.$isLoading$delegate, 28);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$110, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) this.$isLoading$delegate).getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    if (((BitcoinTransferViewModel) this.this$0) instanceof BitcoinTransferViewModel.Content.FullScreenContent) {
                        this.label = 1;
                        if (((RealSheetState) obj3).expand(this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$25 = new PasscodeViewKt$Passcode$3$1$1$1$2(13, coroutineScope15, (BlockerActionConfirmDialogPresenter) this.$isLoading$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(passcodeViewKt$Passcode$3$1$1$1$25, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter = (BlockerActionConfirmSheetPresenter) this.this$0;
                BlockersScreens.BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen = blockerActionConfirmSheetPresenter.args;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = blockerActionConfirmSheetPresenter.blockerResolver;
                    SubmitFormRequest submitFormRequest = (SubmitFormRequest) obj3;
                    SubmitFormRequest submitFormRequest2 = new SubmitFormRequest(blockerActionConfirmSheetScreen.blockersData.requestContext, submitFormRequest.action_id, submitFormRequest.results, 8);
                    this.label = 1;
                    resolve = multiBlockerFacilitator$Resolver.resolve(submitFormRequest2, this);
                    if (resolve == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    resolve = obj;
                }
                ApiResult apiResult = (ApiResult) resolve;
                if (apiResult != null) {
                    MutableState mutableState6 = (MutableState) this.$isLoading$delegate;
                    BetterNavigator.ScreenNavigator screenNavigator4 = blockerActionConfirmSheetPresenter.navigator;
                    boolean z2 = blockerActionConfirmSheetScreen.showSuccessAnimation;
                    BlockersData blockersData = blockerActionConfirmSheetScreen.blockersData;
                    if (!z2) {
                        BlockerActionUtilKt.handleSubmitFormResponseContext(apiResult, blockerActionConfirmSheetScreen, blockersData, screenNavigator4, blockerActionConfirmSheetPresenter.blockersDataNavigator);
                    } else if (apiResult instanceof ApiResult.Success) {
                        mutableState6.setValue((ApiResult.Success) apiResult);
                    } else {
                        screenNavigator4.goTo(new FailureMessageBlockerScreen(blockersData, null, null, 6));
                    }
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$111 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope16, (BlockerActionDialogActionPresenter) this.$isLoading$delegate, 29);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(bitcoinDepositsPresenter$models$2$1$111, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$1 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope17, (ErrorPresenter) this.$isLoading$delegate, i6);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(clientScenarioLauncherPresenter$models$1$1$1, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$12 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope18, (AddAliasPresenter) this.$isLoading$delegate, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(clientScenarioLauncherPresenter$models$1$1$12, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                BlockersScreens blockersScreens = (BlockersScreens) ((BinaryBitmap) obj3).binarizer;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((RealMultiBlockerFacilitator) this.this$0).franklinAppService;
                    ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                    if (clientScenario == null) {
                        clientScenario = ClientScenario.PLASMA;
                    }
                    String str2 = blockersScreens.getBlockersData().flowToken;
                    String str3 = blockersScreens.getBlockersData().blockerId;
                    str3.getClass();
                    SetDateRequest setDateRequest = (SetDateRequest) this.$isLoading$delegate;
                    SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                    builder.blocker_descriptor_id = str3;
                    builder.request = new SubmitBlockerRequest$Request$Request$SetDateRequest(setDateRequest);
                    SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                    this.label = 1;
                    submitBlocker = appService.submitBlocker(clientScenario, str2, submitBlockerRequest, this);
                    if (submitBlocker == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    submitBlocker = obj;
                }
                ApiResult apiResult2 = (ApiResult) submitBlocker;
                if (apiResult2 instanceof ApiResult.Success) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) apiResult2).response;
                    ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                    return Matcher$$ExternalSyntheticOutline0.m(mergeResponseContexts, mergeResponseContexts);
                }
                if (apiResult2 instanceof ApiResult.Failure) {
                    return apiResult2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((MutableState) this.$isLoading$delegate).setValue(Boolean.TRUE);
                    AtmPickerAmountBlockerPresenter atmPickerAmountBlockerPresenter = (AtmPickerAmountBlockerPresenter) this.this$0;
                    Money money2 = ((AtmPickerAmountBlockerViewEvent.ConfirmKeypadAmount) ((AtmPickerAmountBlockerViewEvent) obj3)).amount;
                    this.label = 1;
                    if (AtmPickerAmountBlockerPresenter.access$submitAmount(atmPickerAmountBlockerPresenter, money2, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountBlockerPresenter$models$1$2(Object obj, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$helpAction = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountBlockerPresenter$models$1$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$helpAction = obj2;
        this.$isLoading$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountBlockerPresenter$models$1$2(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$helpAction = flow;
        this.$isLoading$delegate = obj;
    }
}
