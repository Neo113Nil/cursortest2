package com.squareup.cash.appmessages.presenters;

import androidx.camera.core.impl.DynamicRanges;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.db.TooltipMessage;
import com.squareup.cash.appmessages.db.TooltipMessageQueries$firstMessage$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes.dex */
public final class RealTooltipAppMessagePresenter implements MoleculePresenter {
    public final GrpcMethod actionPerformer;
    public final Analytics analytics;
    public final RealAppMessageManager appMessageManager;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final MoneybotFlagsHelper moneybotFlagsHelper;
    public final KeyValue moneybotTooltipViewed;
    public final AppMessageClientService service;
    public final AndroidStringManager stringManager;
    public final LocalTabContentQueries tooltipMessageQueries;

    public RealTooltipAppMessagePresenter(RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, CashAccountDatabaseImpl cashAccountDatabaseImpl, AppMessageClientService appMessageClientService, Analytics analytics, AndroidClock androidClock, RealAppMessageManager realAppMessageManager, AndroidStringManager androidStringManager, RealSessionFlags realSessionFlags, MoneybotFlagsHelper moneybotFlagsHelper, KeyValue keyValue, CoroutineContext coroutineContext, Navigator navigator) {
        navigator.getClass();
        this.service = appMessageClientService;
        this.analytics = analytics;
        this.clock = androidClock;
        this.appMessageManager = realAppMessageManager;
        this.stringManager = androidStringManager;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.moneybotTooltipViewed = keyValue;
        this.ioDispatcher = coroutineContext;
        this.tooltipMessageQueries = cashAccountDatabaseImpl.tooltipMessageQueries;
        this.actionPerformer = realAppMessageActionPerformer$Factory$Impl.create$1(navigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1671342781);
        Object rememberedValue = gapComposer.rememberedValue();
        MoneybotFlagsHelper moneybotFlagsHelper = this.moneybotFlagsHelper;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = moneybotFlagsHelper.moneybotEnabled();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Boolean bool = Boolean.FALSE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, bool, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = moneybotFlagsHelper.moneybotHomeEnabled();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, bool, null, gapComposer, 48, 2);
        boolean changed = gapComposer.changed(((Boolean) collectAsState.getValue()).booleanValue()) | gapComposer.changed(((Boolean) collectAsState2.getValue()).booleanValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        short s = 0;
        if (changed || rememberedValue3 == neverEqualPolicy) {
            final boolean booleanValue = ((Boolean) collectAsState.getValue()).booleanValue();
            final boolean booleanValue2 = ((Boolean) collectAsState2.getValue()).booleanValue();
            LocalTabContentQueries localTabContentQueries = this.tooltipMessageQueries;
            localTabContentQueries.getClass();
            TooltipMessageQueries$firstMessage$2 tooltipMessageQueries$firstMessage$2 = TooltipMessageQueries$firstMessage$2.INSTANCE;
            SqlDriver sqlDriver = localTabContentQueries.driver;
            CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(localTabContentQueries, s);
            sqlDriver.getClass();
            final FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-297824878, new String[]{"tooltipMessage"}, sqlDriver, "TooltipMessage.sq", "firstMessage", "SELECT tooltipMessage.messageToken, tooltipMessage.campaignToken, tooltipMessage.isBadged, tooltipMessage.placement, tooltipMessage.arrowPosition, tooltipMessage.tooltip, tooltipMessage.priority, tooltipMessage.expiresAtUtc FROM tooltipMessage\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC\nLIMIT 1", cashApp$$ExternalSyntheticLambda2)), this.ioDispatcher);
            Flow flow2 = new Flow() { // from class: com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter$generateModel$$inlined$map$1

                /* renamed from: com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter$generateModel$$inlined$map$1$2, reason: invalid class name */
                public final class AnonymousClass2 implements FlowCollector {
                    public final /* synthetic */ boolean $moneybotEnabled$inlined;
                    public final /* synthetic */ boolean $moneybotHomeEnabled$inlined;
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;
                    public final /* synthetic */ RealTooltipAppMessagePresenter this$0;

                    /* renamed from: com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter$generateModel$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
                        public int I$0;
                        public FlowCollector L$4;
                        public int label;
                        public /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= PKIFailureInfo.systemUnavail;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, RealTooltipAppMessagePresenter realTooltipAppMessagePresenter, boolean z, boolean z2) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = realTooltipAppMessagePresenter;
                        this.$moneybotEnabled$inlined = z;
                        this.$moneybotHomeEnabled$inlined = z2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:30:0x0162, code lost:
                    
                        if (r10.emit(r5, r2) != r3) goto L41;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x0164, code lost:
                    
                        return r3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
                    
                        if (r1 == r3) goto L40;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Object obj2;
                        int i;
                        int i2;
                        FlowCollector flowCollector;
                        TooltipAppMessageViewModel ready;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i3 = anonymousClass1.label;
                            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                                anonymousClass1.label = i3 - PKIFailureInfo.systemUnavail;
                                obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                TooltipAppMessageViewModel tooltipAppMessageViewModel = TooltipAppMessageViewModel.Loading.INSTANCE;
                                RealTooltipAppMessagePresenter realTooltipAppMessagePresenter = this.this$0;
                                if (i != 0) {
                                    SafeTrace.throwOnFailure(obj2);
                                    TooltipMessage tooltipMessage = (TooltipMessage) obj;
                                    i2 = 0;
                                    flowCollector = this.$this_unsafeFlow;
                                    if (tooltipMessage == null) {
                                        KeyValue keyValue = realTooltipAppMessagePresenter.moneybotTooltipViewed;
                                        anonymousClass1.L$4 = flowCollector;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        obj2 = keyValue.get(anonymousClass1);
                                    } else {
                                        StateBindingsKt asTooltip = DynamicRanges.asTooltip(tooltipMessage);
                                        if (asTooltip instanceof Tooltip$ValidTooltip) {
                                            Tooltip$ValidTooltip tooltip$ValidTooltip = (Tooltip$ValidTooltip) asTooltip;
                                            ready = new TooltipAppMessageViewModel.Ready(tooltip$ValidTooltip.getMessageToken(), tooltip$ValidTooltip.getText(), tooltip$ValidTooltip.getPlacement(), tooltip$ValidTooltip.getArrowPosition(), tooltip$ValidTooltip.getTooltipType(), new TooltipAppMessageViewEvent.TargetClicked(new AppMessageViewEvent.AppMessageActionTaken(tooltip$ValidTooltip.getMessageToken(), tooltip$ValidTooltip.getUrlToOpen(), false, null, 12)), new TooltipAppMessageViewEvent.TooltipClicked(new AppMessageViewEvent.AppMessageActionTaken(tooltip$ValidTooltip.getMessageToken(), tooltip$ValidTooltip.getUrlToOpen(), false, null, 12)), new TooltipAppMessageViewEvent.TooltipDismissed(new AppMessageViewEvent.AppMessageActionTaken(tooltip$ValidTooltip.getMessageToken(), tooltip$ValidTooltip.getUrlToOpen(), false, null, 12)), new TooltipAppMessageViewEvent.TooltipViewed(tooltip$ValidTooltip.getMessageToken()), false);
                                            tooltipAppMessageViewModel = ready;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = i2;
                                            anonymousClass1.label = 2;
                                        } else {
                                            if (!asTooltip.equals(Tooltip$InvalidTooltip.INSTANCE)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = i2;
                                            anonymousClass1.label = 2;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        if (i == 2) {
                                            SafeTrace.throwOnFailure(obj2);
                                            return Unit.INSTANCE;
                                        }
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    i2 = anonymousClass1.I$0;
                                    flowCollector = anonymousClass1.L$4;
                                    SafeTrace.throwOnFailure(obj2);
                                }
                                if (!((Boolean) obj2).booleanValue()) {
                                    boolean z = this.$moneybotEnabled$inlined;
                                    boolean z2 = this.$moneybotHomeEnabled$inlined;
                                    if (z || z2) {
                                        ready = new TooltipAppMessageViewModel.Ready("moneybot-tooltip", realTooltipAppMessagePresenter.stringManager.get(R.string.moneybot_tooltip_text), TooltipAppMessageViewModel.Ready.Placement.MoneybotToolbarMenuItem, TooltipAppMessageViewModel.Ready.ArrowPosition.TopLeft, z2 ? TooltipAppMessageViewModel.Ready.TooltipType.TOOLBAR_MONEYBOT_MENU_ITEM_HOME : TooltipAppMessageViewModel.Ready.TooltipType.TOOLBAR_MONEYBOT_MENU_ITEM, new TooltipAppMessageViewEvent.TargetClicked(new AppMessageViewEvent.AppMessageActionTaken("moneybot-tooltip", null, false, null, 12), true), new TooltipAppMessageViewEvent.TooltipClicked(new AppMessageViewEvent.AppMessageActionTaken("moneybot-tooltip", null, false, null, 12), true), new TooltipAppMessageViewEvent.TooltipDismissed(new AppMessageViewEvent.AppMessageActionTaken("moneybot-tooltip", null, false, null, 12), true), new TooltipAppMessageViewEvent.TooltipViewed("moneybot-tooltip", true), true);
                                        tooltipAppMessageViewModel = ready;
                                    }
                                }
                                anonymousClass1.L$4 = null;
                                anonymousClass1.I$0 = i2;
                                anonymousClass1.label = 2;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        TooltipAppMessageViewModel tooltipAppMessageViewModel2 = TooltipAppMessageViewModel.Loading.INSTANCE;
                        RealTooltipAppMessagePresenter realTooltipAppMessagePresenter2 = this.this$0;
                        if (i != 0) {
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                        anonymousClass1.L$4 = null;
                        anonymousClass1.I$0 = i2;
                        anonymousClass1.label = 2;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object collect = FlowQuery$mapToList$$inlined$map$1.this.collect(new AnonymousClass2(flowCollector, this, booleanValue, booleanValue2), continuation);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(flow2);
            rememberedValue3 = flow2;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, TooltipAppMessageViewModel.Loading.INSTANCE, null, gapComposer, 0, 2);
        TooltipAppMessageViewModel tooltipAppMessageViewModel = (TooltipAppMessageViewModel) collectAsState3.getValue();
        boolean changed2 = gapComposer.changed(collectAsState3) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new RealGcmRegistrar$unregister$2(this, collectAsState3, continuation, 12);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, tooltipAppMessageViewModel, (Function2) rememberedValue4);
        Updater.LaunchedEffect(gapComposer, flow, new DataStoreImpl$data$1(flow, continuation, this, 19));
        TooltipAppMessageViewModel tooltipAppMessageViewModel2 = (TooltipAppMessageViewModel) collectAsState3.getValue();
        gapComposer.end(false);
        return tooltipAppMessageViewModel2;
    }
}
