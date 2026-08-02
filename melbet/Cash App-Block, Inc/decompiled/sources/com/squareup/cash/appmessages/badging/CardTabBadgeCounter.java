package com.squareup.cash.appmessages.badging;

import androidx.room.util.DBUtil;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.db.InlineMessageQueries$inlineMessagesByPriority$2;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.badging.db.BadgeCountQueries$ForGroupQuery;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AppMessageV_2Api;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class CardTabBadgeCounter implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final RealAppMessageManager appMessageManager;
    public final CashAccountDatabaseImpl cashDatabase;
    public final FeatureFlagManager featureFlagManager;
    public final InlineMessage.Placement inlineMessagePlacement;
    public final CoroutineContext ioDispatcher;
    public final PopupMessage.Placement popupMessagePlacement;
    public final HalfSheetMessage.Placement sheetMessagePlacement;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardTabBadgeCounter(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, FeatureFlagManager featureFlagManager, RealAppMessageManager realAppMessageManager, int i) {
        this(PopupMessage.Placement.CARD_TAB, null, HalfSheetMessage.Placement.CARD_TAB, 2);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this(PopupMessage.Placement.ACTIVITY_TAB, InlineMessage.Placement.ACTIVITY_TAB, null, 4);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
            case 2:
                this(PopupMessage.Placement.BALANCE_TAB, null, HalfSheetMessage.Placement.BALANCE_TAB, 2);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
            case 3:
                this(PopupMessage.Placement.BITCOIN_TAB, null, null, 6);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
            case 4:
                this(PopupMessage.Placement.INVESTING_TAB, null, null, 6);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
            case 5:
                this(PopupMessage.Placement.OFFERS_TAB, null, null, 6);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
            case 6:
                this(PopupMessage.Placement.PAYMENT_PAD_TAB, null, HalfSheetMessage.Placement.PAYMENT_PAD_TAB, 2);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
            case 7:
                this(null, InlineMessage.Placement.PROFILE_SCREEN, null, 5);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
            default:
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.featureFlagManager = featureFlagManager;
                this.appMessageManager = realAppMessageManager;
                break;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Flow appLockMonitor$special$$inlined$map$2;
        Flow appLockMonitor$special$$inlined$map$22;
        Flow appLockMonitor$special$$inlined$map$23;
        Flow appLockMonitor$special$$inlined$map$24;
        Flow appLockMonitor$special$$inlined$map$25;
        Flow appLockMonitor$special$$inlined$map$26;
        int i = 2;
        int i2 = 19;
        PopupMessage.Placement placement = this.popupMessagePlacement;
        if (placement != null) {
            LocalTabContentQueries localTabContentQueries = getCashDatabase().popupMessageQueries;
            localTabContentQueries.getClass();
            appLockMonitor$special$$inlined$map$2 = DBUtil.mapToOne(DBUtil.toFlow(new BadgeCountQueries$ForGroupQuery(localTabContentQueries, placement, new SvgDecoder$$ExternalSyntheticLambda0(12), i)), getIoDispatcher());
        } else {
            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new Long(0L), i2);
        }
        final byte b = 0;
        Continuation continuation2 = null;
        if (placement != null) {
            final FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(getCashDatabase().popupMessageQueries.popupMessagesByPriority()), getIoDispatcher());
            appLockMonitor$special$$inlined$map$22 = new Flow() { // from class: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1

                /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes5.dex */
                public final class AnonymousClass2 implements FlowCollector {
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;
                    public final /* synthetic */ CardTabBadgeCounter this$0;

                    /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
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

                    public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, CardTabBadgeCounter cardTabBadgeCounter, int i) {
                        this.$r8$classId = i;
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = cardTabBadgeCounter;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
                    
                        if (r10 == r1.inlineMessagePlacement) goto L46;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountMarketing.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountTransactional.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1;
                        int i2;
                        com.squareup.cash.appmessages.db.InlineMessage inlineMessage;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1;
                        int i3;
                        int i4 = this.$r8$classId;
                        CardTabBadgeCounter cardTabBadgeCounter = this.this$0;
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        com.squareup.cash.appmessages.db.PopupMessage popupMessage = null;
                        switch (i4) {
                            case 0:
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i5 = anonymousClass1.label;
                                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                                        Object obj2 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            SafeTrace.throwOnFailure(obj2);
                                            com.squareup.cash.appmessages.db.PopupMessage popupMessage2 = (com.squareup.cash.appmessages.db.PopupMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (popupMessage2 != null && popupMessage2.isBadged && popupMessage2.placement == cardTabBadgeCounter.popupMessagePlacement) {
                                                popupMessage = popupMessage2;
                                            }
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(popupMessage, anonymousClass1) == coroutineSingletons) {
                                                break;
                                            }
                                        } else if (i != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj2);
                                        }
                                        break;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                break;
                            case 1:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) continuation;
                                    int i6 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                        Object obj3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                        if (i2 != 0) {
                                            SafeTrace.throwOnFailure(obj3);
                                            com.squareup.cash.appmessages.db.InlineMessage inlineMessage2 = (com.squareup.cash.appmessages.db.InlineMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (inlineMessage2 != null) {
                                                if (inlineMessage2.isBadged) {
                                                    InlineMessage.Placement placement = inlineMessage2.placement;
                                                    inlineMessage = inlineMessage2;
                                                    break;
                                                }
                                                inlineMessage = 0;
                                                if (inlineMessage != 0) {
                                                    MessageType messageType = inlineMessage.messageType;
                                                    switch (messageType == null ? -1 : AppMessageBadgeCounter$WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()]) {
                                                        case -1:
                                                            popupMessage = inlineMessage;
                                                            break;
                                                        case 0:
                                                        default:
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            break;
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            break;
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                            break;
                                                    }
                                                }
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) == coroutineSingletons3) {
                                                break;
                                            }
                                        } else if (i2 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj3);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1(this, continuation);
                                Object obj32 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                if (i2 != 0) {
                                }
                            default:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) continuation;
                                    int i7 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                        Object obj4 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                        if (i3 != 0) {
                                            SafeTrace.throwOnFailure(obj4);
                                            SheetMessage sheetMessage = (SheetMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (sheetMessage != 0 && sheetMessage.is_badged && sheetMessage.message_format.placement == cardTabBadgeCounter.sheetMessagePlacement) {
                                                popupMessage = sheetMessage;
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) == coroutineSingletons4) {
                                                break;
                                            }
                                        } else if (i3 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj4);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1(this, continuation);
                                Object obj42 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                if (i3 != 0) {
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation3) {
                    int i3 = b;
                    CardTabBadgeCounter cardTabBadgeCounter = this;
                    FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = mapToList;
                    switch (i3) {
                        case 0:
                            Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 0), continuation3);
                            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 1:
                            Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 1), continuation3);
                            if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 2:
                            Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new CashCdpConfigProvider$1$2(10, flowCollector2, cardTabBadgeCounter), continuation3);
                            if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object collect4 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 2), continuation3);
                            if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        } else {
            appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(continuation2, i2);
        }
        final int i3 = 1;
        InlineMessage.Placement placement2 = this.inlineMessagePlacement;
        if (placement2 != null) {
            LocalTabContentQueries localTabContentQueries2 = getCashDatabase().inlineMessageQueries;
            localTabContentQueries2.getClass();
            appLockMonitor$special$$inlined$map$23 = DBUtil.mapToOne(DBUtil.toFlow(new BadgeCountQueries$ForGroupQuery(localTabContentQueries2, placement2, new SvgDecoder$$ExternalSyntheticLambda0(11), i3)), getIoDispatcher());
        } else {
            appLockMonitor$special$$inlined$map$23 = new AppLockMonitor$special$$inlined$map$2(new Long(0L), i2);
        }
        if (placement2 != null) {
            LocalTabContentQueries localTabContentQueries3 = getCashDatabase().inlineMessageQueries;
            localTabContentQueries3.getClass();
            InlineMessageQueries$inlineMessagesByPriority$2 inlineMessageQueries$inlineMessagesByPriority$2 = InlineMessageQueries$inlineMessagesByPriority$2.INSTANCE;
            SqlDriver sqlDriver = localTabContentQueries3.driver;
            CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(localTabContentQueries3, b);
            sqlDriver.getClass();
            final FlowQuery$mapToList$$inlined$map$1 mapToList2 = DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-13036269, new String[]{"inlineMessage"}, sqlDriver, "InlineMessage.sq", "inlineMessagesByPriority", "SELECT inlineMessage.messageToken, inlineMessage.campaignToken, inlineMessage.isBadged, inlineMessage.placement, inlineMessage.image, inlineMessage.title, inlineMessage.subtitle, inlineMessage.primaryNavigationAction, inlineMessage.secondaryNavigationAction, inlineMessage.cannotBeDismissed, inlineMessage.animation, inlineMessage.priority, inlineMessage.messageType, inlineMessage.expiresAtUtc\nFROM inlineMessage\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC", cashApp$$ExternalSyntheticLambda2)), getIoDispatcher());
            appLockMonitor$special$$inlined$map$24 = new Flow() { // from class: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1

                /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes5.dex */
                public final class AnonymousClass2 implements FlowCollector {
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;
                    public final /* synthetic */ CardTabBadgeCounter this$0;

                    /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
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

                    public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, CardTabBadgeCounter cardTabBadgeCounter, int i) {
                        this.$r8$classId = i;
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = cardTabBadgeCounter;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
                    
                        if (r10 == r1.inlineMessagePlacement) goto L46;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountMarketing.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountTransactional.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1;
                        int i2;
                        com.squareup.cash.appmessages.db.InlineMessage inlineMessage;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1;
                        int i3;
                        int i4 = this.$r8$classId;
                        CardTabBadgeCounter cardTabBadgeCounter = this.this$0;
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        com.squareup.cash.appmessages.db.PopupMessage popupMessage = null;
                        switch (i4) {
                            case 0:
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i5 = anonymousClass1.label;
                                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                                        Object obj22 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            SafeTrace.throwOnFailure(obj22);
                                            com.squareup.cash.appmessages.db.PopupMessage popupMessage2 = (com.squareup.cash.appmessages.db.PopupMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (popupMessage2 != null && popupMessage2.isBadged && popupMessage2.placement == cardTabBadgeCounter.popupMessagePlacement) {
                                                popupMessage = popupMessage2;
                                            }
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(popupMessage, anonymousClass1) == coroutineSingletons2) {
                                                break;
                                            }
                                        } else if (i != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj22);
                                        }
                                        break;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj222 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                break;
                            case 1:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) continuation;
                                    int i6 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                        Object obj32 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                        if (i2 != 0) {
                                            SafeTrace.throwOnFailure(obj32);
                                            com.squareup.cash.appmessages.db.InlineMessage inlineMessage2 = (com.squareup.cash.appmessages.db.InlineMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (inlineMessage2 != null) {
                                                if (inlineMessage2.isBadged) {
                                                    InlineMessage.Placement placement = inlineMessage2.placement;
                                                    inlineMessage = inlineMessage2;
                                                    break;
                                                }
                                                inlineMessage = 0;
                                                if (inlineMessage != 0) {
                                                    MessageType messageType = inlineMessage.messageType;
                                                    switch (messageType == null ? -1 : AppMessageBadgeCounter$WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()]) {
                                                        case -1:
                                                            popupMessage = inlineMessage;
                                                            break;
                                                        case 0:
                                                        default:
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            break;
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            break;
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                            break;
                                                    }
                                                }
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) == coroutineSingletons32) {
                                                break;
                                            }
                                        } else if (i2 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj32);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1(this, continuation);
                                Object obj322 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                if (i2 != 0) {
                                }
                            default:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) continuation;
                                    int i7 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                        Object obj42 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                        if (i3 != 0) {
                                            SafeTrace.throwOnFailure(obj42);
                                            SheetMessage sheetMessage = (SheetMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (sheetMessage != 0 && sheetMessage.is_badged && sheetMessage.message_format.placement == cardTabBadgeCounter.sheetMessagePlacement) {
                                                popupMessage = sheetMessage;
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) == coroutineSingletons42) {
                                                break;
                                            }
                                        } else if (i3 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj42);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1(this, continuation);
                                Object obj422 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                CoroutineSingletons coroutineSingletons422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                if (i3 != 0) {
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation3) {
                    int i32 = i3;
                    CardTabBadgeCounter cardTabBadgeCounter = this;
                    FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = mapToList2;
                    switch (i32) {
                        case 0:
                            Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 0), continuation3);
                            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 1:
                            Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 1), continuation3);
                            if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 2:
                            Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new CashCdpConfigProvider$1$2(10, flowCollector2, cardTabBadgeCounter), continuation3);
                            if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object collect4 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 2), continuation3);
                            if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        } else {
            appLockMonitor$special$$inlined$map$24 = new AppLockMonitor$special$$inlined$map$2(continuation2, i2);
        }
        HalfSheetMessage.Placement placement3 = this.sheetMessagePlacement;
        if (placement3 != null) {
            final FlowQuery$mapToList$$inlined$map$1 mapToList3 = DBUtil.mapToList(DBUtil.toFlow(getCashDatabase().sheetMessageQueries.sheetMessagesByPriority()), getIoDispatcher());
            final int i4 = 2;
            appLockMonitor$special$$inlined$map$25 = new Flow() { // from class: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1

                /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes5.dex */
                public final class AnonymousClass2 implements FlowCollector {
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;
                    public final /* synthetic */ CardTabBadgeCounter this$0;

                    /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
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

                    public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, CardTabBadgeCounter cardTabBadgeCounter, int i) {
                        this.$r8$classId = i;
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = cardTabBadgeCounter;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
                    
                        if (r10 == r1.inlineMessagePlacement) goto L46;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountMarketing.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountTransactional.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1;
                        int i2;
                        com.squareup.cash.appmessages.db.InlineMessage inlineMessage;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1;
                        int i3;
                        int i4 = this.$r8$classId;
                        CardTabBadgeCounter cardTabBadgeCounter = this.this$0;
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        com.squareup.cash.appmessages.db.PopupMessage popupMessage = null;
                        switch (i4) {
                            case 0:
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i5 = anonymousClass1.label;
                                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                                        Object obj222 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            SafeTrace.throwOnFailure(obj222);
                                            com.squareup.cash.appmessages.db.PopupMessage popupMessage2 = (com.squareup.cash.appmessages.db.PopupMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (popupMessage2 != null && popupMessage2.isBadged && popupMessage2.placement == cardTabBadgeCounter.popupMessagePlacement) {
                                                popupMessage = popupMessage2;
                                            }
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(popupMessage, anonymousClass1) == coroutineSingletons22) {
                                                break;
                                            }
                                        } else if (i != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj222);
                                        }
                                        break;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj2222 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                break;
                            case 1:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) continuation;
                                    int i6 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                        Object obj322 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                        if (i2 != 0) {
                                            SafeTrace.throwOnFailure(obj322);
                                            com.squareup.cash.appmessages.db.InlineMessage inlineMessage2 = (com.squareup.cash.appmessages.db.InlineMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (inlineMessage2 != null) {
                                                if (inlineMessage2.isBadged) {
                                                    InlineMessage.Placement placement = inlineMessage2.placement;
                                                    inlineMessage = inlineMessage2;
                                                    break;
                                                }
                                                inlineMessage = 0;
                                                if (inlineMessage != 0) {
                                                    MessageType messageType = inlineMessage.messageType;
                                                    switch (messageType == null ? -1 : AppMessageBadgeCounter$WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()]) {
                                                        case -1:
                                                            popupMessage = inlineMessage;
                                                            break;
                                                        case 0:
                                                        default:
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            break;
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            break;
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                            break;
                                                    }
                                                }
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) == coroutineSingletons322) {
                                                break;
                                            }
                                        } else if (i2 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj322);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1(this, continuation);
                                Object obj3222 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons3222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                if (i2 != 0) {
                                }
                            default:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) continuation;
                                    int i7 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                        Object obj422 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                        CoroutineSingletons coroutineSingletons422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                        if (i3 != 0) {
                                            SafeTrace.throwOnFailure(obj422);
                                            SheetMessage sheetMessage = (SheetMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (sheetMessage != 0 && sheetMessage.is_badged && sheetMessage.message_format.placement == cardTabBadgeCounter.sheetMessagePlacement) {
                                                popupMessage = sheetMessage;
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) == coroutineSingletons422) {
                                                break;
                                            }
                                        } else if (i3 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj422);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1(this, continuation);
                                Object obj4222 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                CoroutineSingletons coroutineSingletons4222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                if (i3 != 0) {
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation3) {
                    int i32 = i4;
                    CardTabBadgeCounter cardTabBadgeCounter = this;
                    FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = mapToList3;
                    switch (i32) {
                        case 0:
                            Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 0), continuation3);
                            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 1:
                            Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 1), continuation3);
                            if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 2:
                            Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new CashCdpConfigProvider$1$2(10, flowCollector2, cardTabBadgeCounter), continuation3);
                            if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object collect4 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 2), continuation3);
                            if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        } else {
            appLockMonitor$special$$inlined$map$25 = new AppLockMonitor$special$$inlined$map$2(new Long(0L), i2);
        }
        if (placement3 != null) {
            final FlowQuery$mapToList$$inlined$map$1 mapToList4 = DBUtil.mapToList(DBUtil.toFlow(getCashDatabase().sheetMessageQueries.sheetMessagesByPriority()), getIoDispatcher());
            final int i5 = 3;
            appLockMonitor$special$$inlined$map$26 = new Flow() { // from class: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1

                /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes5.dex */
                public final class AnonymousClass2 implements FlowCollector {
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;
                    public final /* synthetic */ CardTabBadgeCounter this$0;

                    /* renamed from: com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
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

                    public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, CardTabBadgeCounter cardTabBadgeCounter, int i) {
                        this.$r8$classId = i;
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = cardTabBadgeCounter;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
                    
                        if (r10 == r1.inlineMessagePlacement) goto L46;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountMarketing.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
                    
                        if (((com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r1.getFeatureFlagManager()).currentValue(com.squareup.cash.featureflags.AmplitudeExperiments$MobileBadgingActivityMessageCountTransactional.INSTANCE)).enabled() == false) goto L58;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1;
                        int i2;
                        com.squareup.cash.appmessages.db.InlineMessage inlineMessage;
                        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1;
                        int i3;
                        int i4 = this.$r8$classId;
                        CardTabBadgeCounter cardTabBadgeCounter = this.this$0;
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        com.squareup.cash.appmessages.db.PopupMessage popupMessage = null;
                        switch (i4) {
                            case 0:
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i5 = anonymousClass1.label;
                                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                                        Object obj2222 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            SafeTrace.throwOnFailure(obj2222);
                                            com.squareup.cash.appmessages.db.PopupMessage popupMessage2 = (com.squareup.cash.appmessages.db.PopupMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (popupMessage2 != null && popupMessage2.isBadged && popupMessage2.placement == cardTabBadgeCounter.popupMessagePlacement) {
                                                popupMessage = popupMessage2;
                                            }
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(popupMessage, anonymousClass1) == coroutineSingletons222) {
                                                break;
                                            }
                                        } else if (i != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj2222);
                                        }
                                        break;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22222 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                break;
                            case 1:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) continuation;
                                    int i6 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                        Object obj3222 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons3222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                        if (i2 != 0) {
                                            SafeTrace.throwOnFailure(obj3222);
                                            com.squareup.cash.appmessages.db.InlineMessage inlineMessage2 = (com.squareup.cash.appmessages.db.InlineMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (inlineMessage2 != null) {
                                                if (inlineMessage2.isBadged) {
                                                    InlineMessage.Placement placement = inlineMessage2.placement;
                                                    inlineMessage = inlineMessage2;
                                                    break;
                                                }
                                                inlineMessage = 0;
                                                if (inlineMessage != 0) {
                                                    MessageType messageType = inlineMessage.messageType;
                                                    switch (messageType == null ? -1 : AppMessageBadgeCounter$WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()]) {
                                                        case -1:
                                                            popupMessage = inlineMessage;
                                                            break;
                                                        case 0:
                                                        default:
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            break;
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            break;
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                            break;
                                                    }
                                                }
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1) == coroutineSingletons3222) {
                                                break;
                                            }
                                        } else if (i2 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj3222);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1(this, continuation);
                                Object obj32222 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons32222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i2 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$2$2$1.label;
                                if (i2 != 0) {
                                }
                            default:
                                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) {
                                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) continuation;
                                    int i7 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                        Object obj4222 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                        CoroutineSingletons coroutineSingletons4222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                        if (i3 != 0) {
                                            SafeTrace.throwOnFailure(obj4222);
                                            SheetMessage sheetMessage = (SheetMessage) CollectionsKt.firstOrNull((List) obj);
                                            if (sheetMessage != 0 && sheetMessage.is_badged && sheetMessage.message_format.placement == cardTabBadgeCounter.sheetMessagePlacement) {
                                                popupMessage = sheetMessage;
                                            }
                                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label = 1;
                                            if (flowCollector.emit(popupMessage, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1) == coroutineSingletons4222) {
                                                break;
                                            }
                                        } else if (i3 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj4222);
                                        }
                                        break;
                                    }
                                }
                                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1(this, continuation);
                                Object obj42222 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.result;
                                CoroutineSingletons coroutineSingletons42222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i3 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$4$2$1.label;
                                if (i3 != 0) {
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation3) {
                    int i32 = i5;
                    CardTabBadgeCounter cardTabBadgeCounter = this;
                    FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = mapToList4;
                    switch (i32) {
                        case 0:
                            Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 0), continuation3);
                            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 1:
                            Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 1), continuation3);
                            if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        case 2:
                            Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new CashCdpConfigProvider$1$2(10, flowCollector2, cardTabBadgeCounter), continuation3);
                            if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object collect4 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, cardTabBadgeCounter, 2), continuation3);
                            if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        } else {
            appLockMonitor$special$$inlined$map$26 = new AppLockMonitor$special$$inlined$map$2(continuation2, i2);
        }
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) getFeatureFlagManager()).peekCurrentValue(LaunchDarklyFeatureFlags$AppMessageV_2Api.INSTANCE)).enabled()) {
            Object collect = FlowKt.combine(appLockMonitor$special$$inlined$map$22, appLockMonitor$special$$inlined$map$24, appLockMonitor$special$$inlined$map$26, new AppMessageBadgeCounter$collect$2(this, continuation2, b)).collect(flowCollector, continuation);
            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
        }
        Object collect2 = FlowKt.combine(appLockMonitor$special$$inlined$map$2, appLockMonitor$special$$inlined$map$23, appLockMonitor$special$$inlined$map$25, new AppMessageBadgeCounter$collect$3(4, null)).collect(flowCollector, continuation);
        return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : Unit.INSTANCE;
    }

    public final RealAppMessageManager getAppMessageManager() {
        switch (this.$r8$classId) {
        }
        return this.appMessageManager;
    }

    public final CashAccountDatabaseImpl getCashDatabase() {
        switch (this.$r8$classId) {
        }
        return this.cashDatabase;
    }

    public final FeatureFlagManager getFeatureFlagManager() {
        switch (this.$r8$classId) {
        }
        return this.featureFlagManager;
    }

    public final CoroutineContext getIoDispatcher() {
        switch (this.$r8$classId) {
        }
        return this.ioDispatcher;
    }

    public CardTabBadgeCounter(PopupMessage.Placement placement, InlineMessage.Placement placement2, HalfSheetMessage.Placement placement3, int i) {
        placement = (i & 1) != 0 ? null : placement;
        placement2 = (i & 2) != 0 ? null : placement2;
        placement3 = (i & 4) != 0 ? null : placement3;
        this.popupMessagePlacement = placement;
        this.inlineMessagePlacement = placement2;
        this.sheetMessagePlacement = placement3;
    }
}
