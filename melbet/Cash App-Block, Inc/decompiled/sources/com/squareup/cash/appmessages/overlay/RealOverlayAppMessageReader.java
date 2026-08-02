package com.squareup.cash.appmessages.overlay;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zzd;
import com.google.zxing.Result;
import com.squareup.cash.appmessages.db.FullScreenMessage;
import com.squareup.cash.appmessages.db.FullScreenMessageQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.appmessages.db.FullScreenMessageQueries$fullScreenMessagesByPriority$2;
import com.squareup.cash.appmessages.db.PopupMessage;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.overlay.OverlayAppMessageToken;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealOverlayAppMessageReader {
    public final CashAccountDatabaseImpl db;
    public final Result displayedPlacements = new Result(new LinkedHashSet());
    public final CoroutineContext ioDispatcher;

    public final class MessageSearchResult {
        public final Instant insertedAtUtc;
        public final OverlayAppMessagePlacement placement;
        public final int priority;
        public final OverlayAppMessageToken token;

        public MessageSearchResult(OverlayAppMessageToken overlayAppMessageToken, OverlayAppMessagePlacement overlayAppMessagePlacement, Instant instant, int i) {
            instant.getClass();
            this.token = overlayAppMessageToken;
            this.placement = overlayAppMessagePlacement;
            this.insertedAtUtc = instant;
            this.priority = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageSearchResult)) {
                return false;
            }
            MessageSearchResult messageSearchResult = (MessageSearchResult) obj;
            return this.token.equals(messageSearchResult.token) && this.placement == messageSearchResult.placement && Intrinsics.areEqual(this.insertedAtUtc, messageSearchResult.insertedAtUtc) && this.priority == messageSearchResult.priority;
        }

        public final int hashCode() {
            return Integer.hashCode(this.priority) + ((this.insertedAtUtc.hashCode() + ((this.placement.hashCode() + (this.token.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "MessageSearchResult(token=" + this.token + ", placement=" + this.placement + ", insertedAtUtc=" + this.insertedAtUtc + ", priority=" + this.priority + ")";
        }
    }

    public RealOverlayAppMessageReader(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.db = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r8.access(r2, r3) == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        if (r2 == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r2 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pendingMessageFor(OverlayAppMessagePlacement overlayAppMessagePlacement, ContinuationImpl continuationImpl) {
        RealOverlayAppMessageReader$pendingMessageFor$1 realOverlayAppMessageReader$pendingMessageFor$1;
        int i;
        MessageSearchResult messageSearchResult;
        final OverlayAppMessagePlacement overlayAppMessagePlacement2 = overlayAppMessagePlacement;
        if (continuationImpl instanceof RealOverlayAppMessageReader$pendingMessageFor$1) {
            realOverlayAppMessageReader$pendingMessageFor$1 = (RealOverlayAppMessageReader$pendingMessageFor$1) continuationImpl;
            int i2 = realOverlayAppMessageReader$pendingMessageFor$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOverlayAppMessageReader$pendingMessageFor$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOverlayAppMessageReader$pendingMessageFor$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOverlayAppMessageReader$pendingMessageFor$1.label;
                final int i3 = 0;
                final int i4 = 1;
                Result result = this.displayedPlacements;
                int i5 = 4;
                Continuation continuation = null;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        realOverlayAppMessageReader$pendingMessageFor$1.L$0 = overlayAppMessagePlacement2;
                        realOverlayAppMessageReader$pendingMessageFor$1.label = 1;
                        obj = result.access(new Function1() { // from class: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                boolean add;
                                int i6 = i4;
                                OverlayAppMessagePlacement overlayAppMessagePlacement3 = overlayAppMessagePlacement2;
                                Set set = (Set) obj2;
                                switch (i6) {
                                    case 0:
                                        set.getClass();
                                        add = set.add(overlayAppMessagePlacement3);
                                        break;
                                    default:
                                        set.getClass();
                                        add = !set.contains(overlayAppMessagePlacement3);
                                        break;
                                }
                                return Boolean.valueOf(add);
                            }
                        }, realOverlayAppMessageReader$pendingMessageFor$1);
                        break;
                    case 1:
                        overlayAppMessagePlacement2 = realOverlayAppMessageReader$pendingMessageFor$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        final int i6 = 2;
                        if (!((Boolean) obj).booleanValue()) {
                            realOverlayAppMessageReader$pendingMessageFor$1.L$0 = null;
                            realOverlayAppMessageReader$pendingMessageFor$1.label = 2;
                            JobKt.awaitCancellation(realOverlayAppMessageReader$pendingMessageFor$1);
                            return coroutineSingletons;
                        }
                        CashAccountDatabaseImpl cashAccountDatabaseImpl = this.db;
                        SafeFlow flow = DBUtil.toFlow(cashAccountDatabaseImpl.sheetMessageQueries.sheetMessagesByPriority());
                        CoroutineContext coroutineContext = this.ioDispatcher;
                        final FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(flow, coroutineContext);
                        Flow flow2 = new Flow() { // from class: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1

                            /* renamed from: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1$2, reason: invalid class name */
                            public final class AnonymousClass2 implements FlowCollector {
                                public final /* synthetic */ OverlayAppMessagePlacement $placement$inlined;
                                public final /* synthetic */ int $r8$classId;
                                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                                /* renamed from: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1$2$1, reason: invalid class name */
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

                                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, OverlayAppMessagePlacement overlayAppMessagePlacement, int i) {
                                    this.$r8$classId = i;
                                    this.$this_unsafeFlow = flowCollector;
                                    this.$placement$inlined = overlayAppMessagePlacement;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
                                /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
                                /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
                                /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
                                /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    int i;
                                    RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1;
                                    int i2;
                                    RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1;
                                    int i3;
                                    int i4 = this.$r8$classId;
                                    OverlayAppMessagePlacement overlayAppMessagePlacement = this.$placement$inlined;
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    RealOverlayAppMessageReader.MessageSearchResult messageSearchResult = null;
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
                                                        SheetMessage sheetMessage = (SheetMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (sheetMessage != null) {
                                                            zzd zzdVar = OverlayAppMessagePlacement.Companion;
                                                            HalfSheetMessage.Placement placement = sheetMessage.message_format.placement;
                                                            placement.getClass();
                                                            zzdVar.getClass();
                                                            if (zzd.valueOf(placement) != overlayAppMessagePlacement) {
                                                                sheetMessage = null;
                                                            }
                                                            if (sheetMessage != null) {
                                                                String str = sheetMessage.message_token;
                                                                str.getClass();
                                                                OverlayAppMessageToken.SheetToken sheetToken = new OverlayAppMessageToken.SheetToken(str);
                                                                HalfSheetMessage.Placement placement2 = sheetMessage.message_format.placement;
                                                                placement2.getClass();
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(sheetToken, zzd.valueOf(placement2), sheetMessage.inserted_at_utc, sheetMessage.priority);
                                                            }
                                                        }
                                                        anonymousClass1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, anonymousClass1) == coroutineSingletons) {
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
                                        case 1:
                                            if (continuation instanceof RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) {
                                                realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 = (RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) continuation;
                                                int i6 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                                if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                    realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                                    Object obj3 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.result;
                                                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i2 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                                    if (i2 != 0) {
                                                        SafeTrace.throwOnFailure(obj3);
                                                        PopupMessage popupMessage = (PopupMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (popupMessage != null) {
                                                            zzd zzdVar2 = OverlayAppMessagePlacement.Companion;
                                                            PopupMessage.Placement placement3 = popupMessage.placement;
                                                            placement3.getClass();
                                                            zzdVar2.getClass();
                                                            if (zzd.valueOf(placement3) != overlayAppMessagePlacement) {
                                                                popupMessage = null;
                                                            }
                                                            if (popupMessage != null) {
                                                                OverlayAppMessageToken.PopupToken popupToken = new OverlayAppMessageToken.PopupToken(popupMessage.messageToken);
                                                                PopupMessage.Placement placement4 = popupMessage.placement;
                                                                placement4.getClass();
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(popupToken, zzd.valueOf(placement4), popupMessage.insertedAtUtc, popupMessage.priority);
                                                            }
                                                        }
                                                        realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) == coroutineSingletons3) {
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
                                            realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 = new RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1(this, continuation);
                                            Object obj32 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.result;
                                            CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i2 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                            if (i2 != 0) {
                                            }
                                        default:
                                            if (continuation instanceof RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) {
                                                realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 = (RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) continuation;
                                                int i7 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                                if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                                    realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                                    Object obj4 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.result;
                                                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i3 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                                    if (i3 != 0) {
                                                        SafeTrace.throwOnFailure(obj4);
                                                        FullScreenMessage fullScreenMessage = (FullScreenMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (fullScreenMessage != null) {
                                                            zzd zzdVar3 = OverlayAppMessagePlacement.Companion;
                                                            FullScreenMessage.Placement placement5 = fullScreenMessage.placement;
                                                            zzdVar3.getClass();
                                                            int i8 = placement5 == null ? -1 : OverlayAppMessagePlacement$Companion$WhenMappings.$EnumSwitchMapping$2[placement5.ordinal()];
                                                            if ((i8 != 1 ? i8 != 2 ? OverlayAppMessagePlacement.MoneyTab : OverlayAppMessagePlacement.PaymentPadTab : OverlayAppMessagePlacement.MoneyTab) != overlayAppMessagePlacement) {
                                                                fullScreenMessage = null;
                                                            }
                                                            if (fullScreenMessage != null) {
                                                                OverlayAppMessageToken.FullScreenToken fullScreenToken = new OverlayAppMessageToken.FullScreenToken(fullScreenMessage.messageToken);
                                                                FullScreenMessage.Placement placement6 = fullScreenMessage.placement;
                                                                int i9 = placement6 != null ? OverlayAppMessagePlacement$Companion$WhenMappings.$EnumSwitchMapping$2[placement6.ordinal()] : -1;
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(fullScreenToken, i9 != 1 ? i9 != 2 ? OverlayAppMessagePlacement.MoneyTab : OverlayAppMessagePlacement.PaymentPadTab : OverlayAppMessagePlacement.MoneyTab, fullScreenMessage.insertedAtUtc, fullScreenMessage.priority);
                                                            }
                                                        }
                                                        realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) == coroutineSingletons4) {
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
                                            realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 = new RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1(this, continuation);
                                            Object obj42 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.result;
                                            CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i3 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                            if (i3 != 0) {
                                            }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                                int i7 = i3;
                                OverlayAppMessagePlacement overlayAppMessagePlacement3 = overlayAppMessagePlacement2;
                                FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = mapToList;
                                switch (i7) {
                                    case 0:
                                        Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 0), continuation2);
                                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    case 1:
                                        Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 1), continuation2);
                                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    default:
                                        Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 2), continuation2);
                                        if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        final FlowQuery$mapToList$$inlined$map$1 mapToList2 = DBUtil.mapToList(DBUtil.toFlow(cashAccountDatabaseImpl.popupMessageQueries.popupMessagesByPriority()), coroutineContext);
                        Flow flow3 = new Flow() { // from class: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1

                            /* renamed from: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1$2, reason: invalid class name */
                            public final class AnonymousClass2 implements FlowCollector {
                                public final /* synthetic */ OverlayAppMessagePlacement $placement$inlined;
                                public final /* synthetic */ int $r8$classId;
                                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                                /* renamed from: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1$2$1, reason: invalid class name */
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

                                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, OverlayAppMessagePlacement overlayAppMessagePlacement, int i) {
                                    this.$r8$classId = i;
                                    this.$this_unsafeFlow = flowCollector;
                                    this.$placement$inlined = overlayAppMessagePlacement;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
                                /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
                                /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
                                /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
                                /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    int i;
                                    RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1;
                                    int i2;
                                    RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1;
                                    int i3;
                                    int i4 = this.$r8$classId;
                                    OverlayAppMessagePlacement overlayAppMessagePlacement = this.$placement$inlined;
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    RealOverlayAppMessageReader.MessageSearchResult messageSearchResult = null;
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
                                                        SheetMessage sheetMessage = (SheetMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (sheetMessage != null) {
                                                            zzd zzdVar = OverlayAppMessagePlacement.Companion;
                                                            HalfSheetMessage.Placement placement = sheetMessage.message_format.placement;
                                                            placement.getClass();
                                                            zzdVar.getClass();
                                                            if (zzd.valueOf(placement) != overlayAppMessagePlacement) {
                                                                sheetMessage = null;
                                                            }
                                                            if (sheetMessage != null) {
                                                                String str = sheetMessage.message_token;
                                                                str.getClass();
                                                                OverlayAppMessageToken.SheetToken sheetToken = new OverlayAppMessageToken.SheetToken(str);
                                                                HalfSheetMessage.Placement placement2 = sheetMessage.message_format.placement;
                                                                placement2.getClass();
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(sheetToken, zzd.valueOf(placement2), sheetMessage.inserted_at_utc, sheetMessage.priority);
                                                            }
                                                        }
                                                        anonymousClass1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, anonymousClass1) == coroutineSingletons2) {
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
                                        case 1:
                                            if (continuation instanceof RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) {
                                                realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 = (RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) continuation;
                                                int i6 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                                if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                    realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                                    Object obj32 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.result;
                                                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i2 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                                    if (i2 != 0) {
                                                        SafeTrace.throwOnFailure(obj32);
                                                        com.squareup.cash.appmessages.db.PopupMessage popupMessage = (com.squareup.cash.appmessages.db.PopupMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (popupMessage != null) {
                                                            zzd zzdVar2 = OverlayAppMessagePlacement.Companion;
                                                            PopupMessage.Placement placement3 = popupMessage.placement;
                                                            placement3.getClass();
                                                            zzdVar2.getClass();
                                                            if (zzd.valueOf(placement3) != overlayAppMessagePlacement) {
                                                                popupMessage = null;
                                                            }
                                                            if (popupMessage != null) {
                                                                OverlayAppMessageToken.PopupToken popupToken = new OverlayAppMessageToken.PopupToken(popupMessage.messageToken);
                                                                PopupMessage.Placement placement4 = popupMessage.placement;
                                                                placement4.getClass();
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(popupToken, zzd.valueOf(placement4), popupMessage.insertedAtUtc, popupMessage.priority);
                                                            }
                                                        }
                                                        realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) == coroutineSingletons32) {
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
                                            realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 = new RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1(this, continuation);
                                            Object obj322 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.result;
                                            CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i2 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                            if (i2 != 0) {
                                            }
                                        default:
                                            if (continuation instanceof RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) {
                                                realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 = (RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) continuation;
                                                int i7 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                                if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                                    realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                                    Object obj42 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.result;
                                                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i3 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                                    if (i3 != 0) {
                                                        SafeTrace.throwOnFailure(obj42);
                                                        com.squareup.cash.appmessages.db.FullScreenMessage fullScreenMessage = (com.squareup.cash.appmessages.db.FullScreenMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (fullScreenMessage != null) {
                                                            zzd zzdVar3 = OverlayAppMessagePlacement.Companion;
                                                            FullScreenMessage.Placement placement5 = fullScreenMessage.placement;
                                                            zzdVar3.getClass();
                                                            int i8 = placement5 == null ? -1 : OverlayAppMessagePlacement$Companion$WhenMappings.$EnumSwitchMapping$2[placement5.ordinal()];
                                                            if ((i8 != 1 ? i8 != 2 ? OverlayAppMessagePlacement.MoneyTab : OverlayAppMessagePlacement.PaymentPadTab : OverlayAppMessagePlacement.MoneyTab) != overlayAppMessagePlacement) {
                                                                fullScreenMessage = null;
                                                            }
                                                            if (fullScreenMessage != null) {
                                                                OverlayAppMessageToken.FullScreenToken fullScreenToken = new OverlayAppMessageToken.FullScreenToken(fullScreenMessage.messageToken);
                                                                FullScreenMessage.Placement placement6 = fullScreenMessage.placement;
                                                                int i9 = placement6 != null ? OverlayAppMessagePlacement$Companion$WhenMappings.$EnumSwitchMapping$2[placement6.ordinal()] : -1;
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(fullScreenToken, i9 != 1 ? i9 != 2 ? OverlayAppMessagePlacement.MoneyTab : OverlayAppMessagePlacement.PaymentPadTab : OverlayAppMessagePlacement.MoneyTab, fullScreenMessage.insertedAtUtc, fullScreenMessage.priority);
                                                            }
                                                        }
                                                        realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) == coroutineSingletons42) {
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
                                            realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 = new RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1(this, continuation);
                                            Object obj422 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.result;
                                            CoroutineSingletons coroutineSingletons422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i3 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                            if (i3 != 0) {
                                            }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                                int i7 = i4;
                                OverlayAppMessagePlacement overlayAppMessagePlacement3 = overlayAppMessagePlacement2;
                                FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = mapToList2;
                                switch (i7) {
                                    case 0:
                                        Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 0), continuation2);
                                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    case 1:
                                        Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 1), continuation2);
                                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    default:
                                        Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 2), continuation2);
                                        if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        LocalTabContentQueries localTabContentQueries = cashAccountDatabaseImpl.fullScreenMessageQueries;
                        localTabContentQueries.getClass();
                        FullScreenMessageQueries$fullScreenMessagesByPriority$2 fullScreenMessageQueries$fullScreenMessagesByPriority$2 = FullScreenMessageQueries$fullScreenMessagesByPriority$2.INSTANCE;
                        SqlDriver sqlDriver = localTabContentQueries.driver;
                        FullScreenMessageQueries$$ExternalSyntheticLambda5 fullScreenMessageQueries$$ExternalSyntheticLambda5 = new FullScreenMessageQueries$$ExternalSyntheticLambda5(localTabContentQueries, i4);
                        sqlDriver.getClass();
                        final FlowQuery$mapToList$$inlined$map$1 mapToList3 = DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-1000043181, new String[]{"fullScreenMessage"}, sqlDriver, "FullScreenMessage.sq", "fullScreenMessagesByPriority", "SELECT fullScreenMessage.messageToken, fullScreenMessage.campaignToken, fullScreenMessage.isBadged, fullScreenMessage.video, fullScreenMessage.primaryAction, fullScreenMessage.secondaryAction, fullScreenMessage.primaryActionColor, fullScreenMessage.secondaryActionColor, fullScreenMessage.priority, fullScreenMessage.insertedAtUtc, fullScreenMessage.placement, fullScreenMessage.expiresAtUtc\nFROM fullScreenMessage\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC", fullScreenMessageQueries$$ExternalSyntheticLambda5)), coroutineContext);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.combine(flow2, flow3, new Flow() { // from class: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1

                            /* renamed from: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1$2, reason: invalid class name */
                            public final class AnonymousClass2 implements FlowCollector {
                                public final /* synthetic */ OverlayAppMessagePlacement $placement$inlined;
                                public final /* synthetic */ int $r8$classId;
                                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                                /* renamed from: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$1$2$1, reason: invalid class name */
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

                                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, OverlayAppMessagePlacement overlayAppMessagePlacement, int i) {
                                    this.$r8$classId = i;
                                    this.$this_unsafeFlow = flowCollector;
                                    this.$placement$inlined = overlayAppMessagePlacement;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
                                /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
                                /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
                                /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
                                /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    int i;
                                    RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1;
                                    int i2;
                                    RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1;
                                    int i3;
                                    int i4 = this.$r8$classId;
                                    OverlayAppMessagePlacement overlayAppMessagePlacement = this.$placement$inlined;
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    RealOverlayAppMessageReader.MessageSearchResult messageSearchResult = null;
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
                                                        SheetMessage sheetMessage = (SheetMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (sheetMessage != null) {
                                                            zzd zzdVar = OverlayAppMessagePlacement.Companion;
                                                            HalfSheetMessage.Placement placement = sheetMessage.message_format.placement;
                                                            placement.getClass();
                                                            zzdVar.getClass();
                                                            if (zzd.valueOf(placement) != overlayAppMessagePlacement) {
                                                                sheetMessage = null;
                                                            }
                                                            if (sheetMessage != null) {
                                                                String str = sheetMessage.message_token;
                                                                str.getClass();
                                                                OverlayAppMessageToken.SheetToken sheetToken = new OverlayAppMessageToken.SheetToken(str);
                                                                HalfSheetMessage.Placement placement2 = sheetMessage.message_format.placement;
                                                                placement2.getClass();
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(sheetToken, zzd.valueOf(placement2), sheetMessage.inserted_at_utc, sheetMessage.priority);
                                                            }
                                                        }
                                                        anonymousClass1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, anonymousClass1) == coroutineSingletons22) {
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
                                        case 1:
                                            if (continuation instanceof RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) {
                                                realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 = (RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) continuation;
                                                int i6 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                                if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                    realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                                    Object obj322 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.result;
                                                    CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i2 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                                    if (i2 != 0) {
                                                        SafeTrace.throwOnFailure(obj322);
                                                        com.squareup.cash.appmessages.db.PopupMessage popupMessage = (com.squareup.cash.appmessages.db.PopupMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (popupMessage != null) {
                                                            zzd zzdVar2 = OverlayAppMessagePlacement.Companion;
                                                            PopupMessage.Placement placement3 = popupMessage.placement;
                                                            placement3.getClass();
                                                            zzdVar2.getClass();
                                                            if (zzd.valueOf(placement3) != overlayAppMessagePlacement) {
                                                                popupMessage = null;
                                                            }
                                                            if (popupMessage != null) {
                                                                OverlayAppMessageToken.PopupToken popupToken = new OverlayAppMessageToken.PopupToken(popupMessage.messageToken);
                                                                PopupMessage.Placement placement4 = popupMessage.placement;
                                                                placement4.getClass();
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(popupToken, zzd.valueOf(placement4), popupMessage.insertedAtUtc, popupMessage.priority);
                                                            }
                                                        }
                                                        realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1) == coroutineSingletons322) {
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
                                            realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1 = new RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1(this, continuation);
                                            Object obj3222 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.result;
                                            CoroutineSingletons coroutineSingletons3222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i2 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$2$2$1.label;
                                            if (i2 != 0) {
                                            }
                                        default:
                                            if (continuation instanceof RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) {
                                                realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 = (RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) continuation;
                                                int i7 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                                if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                                    realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                                    Object obj422 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.result;
                                                    CoroutineSingletons coroutineSingletons422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i3 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                                    if (i3 != 0) {
                                                        SafeTrace.throwOnFailure(obj422);
                                                        com.squareup.cash.appmessages.db.FullScreenMessage fullScreenMessage = (com.squareup.cash.appmessages.db.FullScreenMessage) CollectionsKt.firstOrNull((List) obj);
                                                        if (fullScreenMessage != null) {
                                                            zzd zzdVar3 = OverlayAppMessagePlacement.Companion;
                                                            FullScreenMessage.Placement placement5 = fullScreenMessage.placement;
                                                            zzdVar3.getClass();
                                                            int i8 = placement5 == null ? -1 : OverlayAppMessagePlacement$Companion$WhenMappings.$EnumSwitchMapping$2[placement5.ordinal()];
                                                            if ((i8 != 1 ? i8 != 2 ? OverlayAppMessagePlacement.MoneyTab : OverlayAppMessagePlacement.PaymentPadTab : OverlayAppMessagePlacement.MoneyTab) != overlayAppMessagePlacement) {
                                                                fullScreenMessage = null;
                                                            }
                                                            if (fullScreenMessage != null) {
                                                                OverlayAppMessageToken.FullScreenToken fullScreenToken = new OverlayAppMessageToken.FullScreenToken(fullScreenMessage.messageToken);
                                                                FullScreenMessage.Placement placement6 = fullScreenMessage.placement;
                                                                int i9 = placement6 != null ? OverlayAppMessagePlacement$Companion$WhenMappings.$EnumSwitchMapping$2[placement6.ordinal()] : -1;
                                                                messageSearchResult = new RealOverlayAppMessageReader.MessageSearchResult(fullScreenToken, i9 != 1 ? i9 != 2 ? OverlayAppMessagePlacement.MoneyTab : OverlayAppMessagePlacement.PaymentPadTab : OverlayAppMessagePlacement.MoneyTab, fullScreenMessage.insertedAtUtc, fullScreenMessage.priority);
                                                            }
                                                        }
                                                        realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label = 1;
                                                        if (flowCollector.emit(messageSearchResult, realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1) == coroutineSingletons422) {
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
                                            realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1 = new RealOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1(this, continuation);
                                            Object obj4222 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.result;
                                            CoroutineSingletons coroutineSingletons4222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i3 = realOverlayAppMessageReader$pendingMessageFor$$inlined$map$3$2$1.label;
                                            if (i3 != 0) {
                                            }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                                int i7 = i6;
                                OverlayAppMessagePlacement overlayAppMessagePlacement3 = overlayAppMessagePlacement2;
                                FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = mapToList3;
                                switch (i7) {
                                    case 0:
                                        Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 0), continuation2);
                                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    case 1:
                                        Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 1), continuation2);
                                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    default:
                                        Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, overlayAppMessagePlacement3, 2), continuation2);
                                        if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new AnchoredDraggableKt$snapTo$2(i5, continuation, i6)), 24);
                        realOverlayAppMessageReader$pendingMessageFor$1.L$0 = overlayAppMessagePlacement2;
                        realOverlayAppMessageReader$pendingMessageFor$1.label = 3;
                        obj = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, realOverlayAppMessageReader$pendingMessageFor$1);
                        break;
                    case 2:
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    case 3:
                        OverlayAppMessagePlacement overlayAppMessagePlacement3 = realOverlayAppMessageReader$pendingMessageFor$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        overlayAppMessagePlacement2 = overlayAppMessagePlacement3;
                        MessageSearchResult messageSearchResult2 = (MessageSearchResult) obj;
                        realOverlayAppMessageReader$pendingMessageFor$1.L$0 = overlayAppMessagePlacement2;
                        realOverlayAppMessageReader$pendingMessageFor$1.L$4 = messageSearchResult2;
                        realOverlayAppMessageReader$pendingMessageFor$1.label = 4;
                        Object access = result.access(new Function1() { // from class: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                boolean add;
                                int i62 = i4;
                                OverlayAppMessagePlacement overlayAppMessagePlacement32 = overlayAppMessagePlacement2;
                                Set set = (Set) obj2;
                                switch (i62) {
                                    case 0:
                                        set.getClass();
                                        add = set.add(overlayAppMessagePlacement32);
                                        break;
                                    default:
                                        set.getClass();
                                        add = !set.contains(overlayAppMessagePlacement32);
                                        break;
                                }
                                return Boolean.valueOf(add);
                            }
                        }, realOverlayAppMessageReader$pendingMessageFor$1);
                        if (access != coroutineSingletons) {
                            obj = access;
                            messageSearchResult = messageSearchResult2;
                            if (!((Boolean) obj).booleanValue()) {
                                Function1 function1 = new Function1() { // from class: com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        boolean add;
                                        int i62 = i3;
                                        OverlayAppMessagePlacement overlayAppMessagePlacement32 = overlayAppMessagePlacement2;
                                        Set set = (Set) obj2;
                                        switch (i62) {
                                            case 0:
                                                set.getClass();
                                                add = set.add(overlayAppMessagePlacement32);
                                                break;
                                            default:
                                                set.getClass();
                                                add = !set.contains(overlayAppMessagePlacement32);
                                                break;
                                        }
                                        return Boolean.valueOf(add);
                                    }
                                };
                                realOverlayAppMessageReader$pendingMessageFor$1.L$0 = null;
                                realOverlayAppMessageReader$pendingMessageFor$1.L$4 = messageSearchResult;
                                realOverlayAppMessageReader$pendingMessageFor$1.label = 5;
                                break;
                            } else {
                                realOverlayAppMessageReader$pendingMessageFor$1.L$0 = null;
                                realOverlayAppMessageReader$pendingMessageFor$1.L$4 = null;
                                realOverlayAppMessageReader$pendingMessageFor$1.label = 6;
                                JobKt.awaitCancellation(realOverlayAppMessageReader$pendingMessageFor$1);
                                return coroutineSingletons;
                            }
                        }
                        return coroutineSingletons;
                    case 4:
                        messageSearchResult = realOverlayAppMessageReader$pendingMessageFor$1.L$4;
                        overlayAppMessagePlacement2 = realOverlayAppMessageReader$pendingMessageFor$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 5:
                        messageSearchResult = realOverlayAppMessageReader$pendingMessageFor$1.L$4;
                        SafeTrace.throwOnFailure(obj);
                        return messageSearchResult.token;
                    case 6:
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realOverlayAppMessageReader$pendingMessageFor$1 = new RealOverlayAppMessageReader$pendingMessageFor$1(this, continuationImpl);
        Object obj2 = realOverlayAppMessageReader$pendingMessageFor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOverlayAppMessageReader$pendingMessageFor$1.label;
        final int i32 = 0;
        final int i42 = 1;
        Result result2 = this.displayedPlacements;
        int i52 = 4;
        Continuation continuation2 = null;
        switch (i) {
        }
    }
}
