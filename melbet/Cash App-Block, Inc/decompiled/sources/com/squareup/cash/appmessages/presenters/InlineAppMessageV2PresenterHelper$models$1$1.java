package com.squareup.cash.appmessages.presenters;

import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.appmessages.db.InlineMessageV2;
import com.squareup.cash.appmessages.db.InlineMessageV2Queries$$ExternalSyntheticLambda0;
import com.squareup.cash.appmessages.db.InlineMessageV2Queries$inlineMessageByMessageToken$2;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.GrpcMethod;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class InlineAppMessageV2PresenterHelper$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $events;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineAppMessageV2PresenterHelper$models$1$1(DisclosurePresenter disclosurePresenter, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = disclosurePresenter;
        this.$events = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        DisclosurePresenter disclosurePresenter = this.this$0;
        Flow flow = this.$events;
        switch (i) {
            case 0:
                return new InlineAppMessageV2PresenterHelper$models$1$1(disclosurePresenter, flow, continuation);
            case 1:
                return new InlineAppMessageV2PresenterHelper$models$1$1(flow, disclosurePresenter, continuation, 1);
            case 2:
                return new InlineAppMessageV2PresenterHelper$models$1$1(flow, disclosurePresenter, continuation, 2);
            case 3:
                return new InlineAppMessageV2PresenterHelper$models$1$1(flow, disclosurePresenter, continuation, 3);
            default:
                return new InlineAppMessageV2PresenterHelper$models$1$1(flow, disclosurePresenter, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InlineAppMessageV2PresenterHelper$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final int i2 = 3;
        final DisclosurePresenter disclosurePresenter = this.this$0;
        Flow flow = this.$events;
        Continuation continuation = null;
        final int i3 = 1;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object coroutineScope = JobKt.coroutineScope(new SetNameViewKt$SetName$2$1(disclosurePresenter, flow, continuation, 8), this);
                    if (coroutineScope != obj2) {
                        coroutineScope = Unit.INSTANCE;
                    }
                    if (coroutineScope == obj2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final int i6 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i7 = i6;
                            DisclosurePresenter disclosurePresenter2 = disclosurePresenter;
                            switch (i7) {
                                case 0:
                                    AppMessageViewEvent.AppMessageUndoDismiss appMessageUndoDismiss = (AppMessageViewEvent.AppMessageUndoDismiss) obj3;
                                    InlineMessageV2 inlineMessageV2 = (InlineMessageV2) disclosurePresenter2.args;
                                    if (Intrinsics.areEqual(inlineMessageV2 != null ? inlineMessageV2.messageToken : null, appMessageUndoDismiss.messageToken)) {
                                        LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        InlineMessageV2 inlineMessageV22 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV22.getClass();
                                        String str = inlineMessageV22.messageToken;
                                        InlineMessageV2 inlineMessageV23 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV23.getClass();
                                        String str2 = inlineMessageV23.campaignToken;
                                        InlineMessageV2 inlineMessageV24 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV24.getClass();
                                        boolean z = inlineMessageV24.isBadged;
                                        InlineMessageV2 inlineMessageV25 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV25.getClass();
                                        InlineV2Message.Placement placement = inlineMessageV25.placement;
                                        InlineMessageV2 inlineMessageV26 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV26.getClass();
                                        UiAvatar uiAvatar = inlineMessageV26.avatar;
                                        InlineMessageV2 inlineMessageV27 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV27.getClass();
                                        String str3 = inlineMessageV27.title;
                                        InlineMessageV2 inlineMessageV28 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV28.getClass();
                                        String str4 = inlineMessageV28.subtitle;
                                        InlineMessageV2 inlineMessageV29 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV29.getClass();
                                        String str5 = inlineMessageV29.url;
                                        InlineMessageV2 inlineMessageV210 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV210.getClass();
                                        Instant instant = inlineMessageV210.expiresAtUtc;
                                        InlineMessageV2 inlineMessageV211 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV211.getClass();
                                        localTabContentQueries.insert(inlineMessageV211.priority, placement, uiAvatar, str, str2, str3, str4, str5, instant, z);
                                        disclosurePresenter2.args = null;
                                    }
                                    break;
                                case 1:
                                    InlineAppMessageV2ViewModel.Ready ready = ((AppMessageViewEvent.AppMessageTemporarilyDismiss) obj3).inlineMessage;
                                    if (ready != null) {
                                        String str6 = ready.messageToken;
                                        LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        localTabContentQueries2.getClass();
                                        str6.getClass();
                                        InlineMessageV2Queries$inlineMessageByMessageToken$2 inlineMessageV2Queries$inlineMessageByMessageToken$2 = InlineMessageV2Queries$inlineMessageByMessageToken$2.INSTANCE;
                                        disclosurePresenter2.args = (InlineMessageV2) new RewardQueries.ForIdsQuery(localTabContentQueries2, str6, new InlineMessageV2Queries$$ExternalSyntheticLambda0(localTabContentQueries2, 1)).executeAsOneOrNull();
                                        localTabContentQueries2.delete(str6);
                                    }
                                    break;
                                case 2:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    boolean z2 = appMessageActionTaken.shouldDismissMessage;
                                    String str7 = appMessageActionTaken.messageToken;
                                    if (z2) {
                                        InlineMessageV2 inlineMessageV212 = (InlineMessageV2) disclosurePresenter2.args;
                                        if (Intrinsics.areEqual(inlineMessageV212 != null ? inlineMessageV212.messageToken : null, str7)) {
                                            disclosurePresenter2.args = null;
                                        }
                                        ((LocalTabContentQueries) disclosurePresenter2.launcher).delete(str7);
                                    }
                                    ((GrpcMethod) disclosurePresenter2.stringManager).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                    String str8 = appMessageViewed.messageToken;
                                    localTabContentQueries3.getClass();
                                    str8.getClass();
                                    localTabContentQueries3.driver.execute(-7061413, "UPDATE inlineMessageV2\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str8, 24));
                                    localTabContentQueries3.notifyQueries(-7061413, new CardMessageQueries$$ExternalSyntheticLambda7(13));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(disclosurePresenter2, appMessageViewed, null, 11), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, 25), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i72 = i3;
                            DisclosurePresenter disclosurePresenter2 = disclosurePresenter;
                            switch (i72) {
                                case 0:
                                    AppMessageViewEvent.AppMessageUndoDismiss appMessageUndoDismiss = (AppMessageViewEvent.AppMessageUndoDismiss) obj3;
                                    InlineMessageV2 inlineMessageV2 = (InlineMessageV2) disclosurePresenter2.args;
                                    if (Intrinsics.areEqual(inlineMessageV2 != null ? inlineMessageV2.messageToken : null, appMessageUndoDismiss.messageToken)) {
                                        LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        InlineMessageV2 inlineMessageV22 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV22.getClass();
                                        String str = inlineMessageV22.messageToken;
                                        InlineMessageV2 inlineMessageV23 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV23.getClass();
                                        String str2 = inlineMessageV23.campaignToken;
                                        InlineMessageV2 inlineMessageV24 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV24.getClass();
                                        boolean z = inlineMessageV24.isBadged;
                                        InlineMessageV2 inlineMessageV25 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV25.getClass();
                                        InlineV2Message.Placement placement = inlineMessageV25.placement;
                                        InlineMessageV2 inlineMessageV26 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV26.getClass();
                                        UiAvatar uiAvatar = inlineMessageV26.avatar;
                                        InlineMessageV2 inlineMessageV27 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV27.getClass();
                                        String str3 = inlineMessageV27.title;
                                        InlineMessageV2 inlineMessageV28 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV28.getClass();
                                        String str4 = inlineMessageV28.subtitle;
                                        InlineMessageV2 inlineMessageV29 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV29.getClass();
                                        String str5 = inlineMessageV29.url;
                                        InlineMessageV2 inlineMessageV210 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV210.getClass();
                                        Instant instant = inlineMessageV210.expiresAtUtc;
                                        InlineMessageV2 inlineMessageV211 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV211.getClass();
                                        localTabContentQueries.insert(inlineMessageV211.priority, placement, uiAvatar, str, str2, str3, str4, str5, instant, z);
                                        disclosurePresenter2.args = null;
                                    }
                                    break;
                                case 1:
                                    InlineAppMessageV2ViewModel.Ready ready = ((AppMessageViewEvent.AppMessageTemporarilyDismiss) obj3).inlineMessage;
                                    if (ready != null) {
                                        String str6 = ready.messageToken;
                                        LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        localTabContentQueries2.getClass();
                                        str6.getClass();
                                        InlineMessageV2Queries$inlineMessageByMessageToken$2 inlineMessageV2Queries$inlineMessageByMessageToken$2 = InlineMessageV2Queries$inlineMessageByMessageToken$2.INSTANCE;
                                        disclosurePresenter2.args = (InlineMessageV2) new RewardQueries.ForIdsQuery(localTabContentQueries2, str6, new InlineMessageV2Queries$$ExternalSyntheticLambda0(localTabContentQueries2, 1)).executeAsOneOrNull();
                                        localTabContentQueries2.delete(str6);
                                    }
                                    break;
                                case 2:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    boolean z2 = appMessageActionTaken.shouldDismissMessage;
                                    String str7 = appMessageActionTaken.messageToken;
                                    if (z2) {
                                        InlineMessageV2 inlineMessageV212 = (InlineMessageV2) disclosurePresenter2.args;
                                        if (Intrinsics.areEqual(inlineMessageV212 != null ? inlineMessageV212.messageToken : null, str7)) {
                                            disclosurePresenter2.args = null;
                                        }
                                        ((LocalTabContentQueries) disclosurePresenter2.launcher).delete(str7);
                                    }
                                    ((GrpcMethod) disclosurePresenter2.stringManager).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                    String str8 = appMessageViewed.messageToken;
                                    localTabContentQueries3.getClass();
                                    str8.getClass();
                                    localTabContentQueries3.driver.execute(-7061413, "UPDATE inlineMessageV2\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str8, 24));
                                    localTabContentQueries3.notifyQueries(-7061413, new CardMessageQueries$$ExternalSyntheticLambda7(13));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(disclosurePresenter2, appMessageViewed, null, 11), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect2 = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector2, disclosurePresenter, 3), 26), this);
                    if (collect2 != coroutineSingletons2) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons2) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons2) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final int i9 = 2;
                    FlowCollector flowCollector3 = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i72 = i9;
                            DisclosurePresenter disclosurePresenter2 = disclosurePresenter;
                            switch (i72) {
                                case 0:
                                    AppMessageViewEvent.AppMessageUndoDismiss appMessageUndoDismiss = (AppMessageViewEvent.AppMessageUndoDismiss) obj3;
                                    InlineMessageV2 inlineMessageV2 = (InlineMessageV2) disclosurePresenter2.args;
                                    if (Intrinsics.areEqual(inlineMessageV2 != null ? inlineMessageV2.messageToken : null, appMessageUndoDismiss.messageToken)) {
                                        LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        InlineMessageV2 inlineMessageV22 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV22.getClass();
                                        String str = inlineMessageV22.messageToken;
                                        InlineMessageV2 inlineMessageV23 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV23.getClass();
                                        String str2 = inlineMessageV23.campaignToken;
                                        InlineMessageV2 inlineMessageV24 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV24.getClass();
                                        boolean z = inlineMessageV24.isBadged;
                                        InlineMessageV2 inlineMessageV25 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV25.getClass();
                                        InlineV2Message.Placement placement = inlineMessageV25.placement;
                                        InlineMessageV2 inlineMessageV26 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV26.getClass();
                                        UiAvatar uiAvatar = inlineMessageV26.avatar;
                                        InlineMessageV2 inlineMessageV27 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV27.getClass();
                                        String str3 = inlineMessageV27.title;
                                        InlineMessageV2 inlineMessageV28 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV28.getClass();
                                        String str4 = inlineMessageV28.subtitle;
                                        InlineMessageV2 inlineMessageV29 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV29.getClass();
                                        String str5 = inlineMessageV29.url;
                                        InlineMessageV2 inlineMessageV210 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV210.getClass();
                                        Instant instant = inlineMessageV210.expiresAtUtc;
                                        InlineMessageV2 inlineMessageV211 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV211.getClass();
                                        localTabContentQueries.insert(inlineMessageV211.priority, placement, uiAvatar, str, str2, str3, str4, str5, instant, z);
                                        disclosurePresenter2.args = null;
                                    }
                                    break;
                                case 1:
                                    InlineAppMessageV2ViewModel.Ready ready = ((AppMessageViewEvent.AppMessageTemporarilyDismiss) obj3).inlineMessage;
                                    if (ready != null) {
                                        String str6 = ready.messageToken;
                                        LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        localTabContentQueries2.getClass();
                                        str6.getClass();
                                        InlineMessageV2Queries$inlineMessageByMessageToken$2 inlineMessageV2Queries$inlineMessageByMessageToken$2 = InlineMessageV2Queries$inlineMessageByMessageToken$2.INSTANCE;
                                        disclosurePresenter2.args = (InlineMessageV2) new RewardQueries.ForIdsQuery(localTabContentQueries2, str6, new InlineMessageV2Queries$$ExternalSyntheticLambda0(localTabContentQueries2, 1)).executeAsOneOrNull();
                                        localTabContentQueries2.delete(str6);
                                    }
                                    break;
                                case 2:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    boolean z2 = appMessageActionTaken.shouldDismissMessage;
                                    String str7 = appMessageActionTaken.messageToken;
                                    if (z2) {
                                        InlineMessageV2 inlineMessageV212 = (InlineMessageV2) disclosurePresenter2.args;
                                        if (Intrinsics.areEqual(inlineMessageV212 != null ? inlineMessageV212.messageToken : null, str7)) {
                                            disclosurePresenter2.args = null;
                                        }
                                        ((LocalTabContentQueries) disclosurePresenter2.launcher).delete(str7);
                                    }
                                    ((GrpcMethod) disclosurePresenter2.stringManager).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                    String str8 = appMessageViewed.messageToken;
                                    localTabContentQueries3.getClass();
                                    str8.getClass();
                                    localTabContentQueries3.driver.execute(-7061413, "UPDATE inlineMessageV2\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str8, 24));
                                    localTabContentQueries3.notifyQueries(-7061413, new CardMessageQueries$$ExternalSyntheticLambda7(13));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(disclosurePresenter2, appMessageViewed, null, 11), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect3 = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector3, disclosurePresenter, 4), 27), this);
                    if (collect3 != coroutineSingletons3) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 != coroutineSingletons3) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 == coroutineSingletons3) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector4 = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i72 = i2;
                            DisclosurePresenter disclosurePresenter2 = disclosurePresenter;
                            switch (i72) {
                                case 0:
                                    AppMessageViewEvent.AppMessageUndoDismiss appMessageUndoDismiss = (AppMessageViewEvent.AppMessageUndoDismiss) obj3;
                                    InlineMessageV2 inlineMessageV2 = (InlineMessageV2) disclosurePresenter2.args;
                                    if (Intrinsics.areEqual(inlineMessageV2 != null ? inlineMessageV2.messageToken : null, appMessageUndoDismiss.messageToken)) {
                                        LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        InlineMessageV2 inlineMessageV22 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV22.getClass();
                                        String str = inlineMessageV22.messageToken;
                                        InlineMessageV2 inlineMessageV23 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV23.getClass();
                                        String str2 = inlineMessageV23.campaignToken;
                                        InlineMessageV2 inlineMessageV24 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV24.getClass();
                                        boolean z = inlineMessageV24.isBadged;
                                        InlineMessageV2 inlineMessageV25 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV25.getClass();
                                        InlineV2Message.Placement placement = inlineMessageV25.placement;
                                        InlineMessageV2 inlineMessageV26 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV26.getClass();
                                        UiAvatar uiAvatar = inlineMessageV26.avatar;
                                        InlineMessageV2 inlineMessageV27 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV27.getClass();
                                        String str3 = inlineMessageV27.title;
                                        InlineMessageV2 inlineMessageV28 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV28.getClass();
                                        String str4 = inlineMessageV28.subtitle;
                                        InlineMessageV2 inlineMessageV29 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV29.getClass();
                                        String str5 = inlineMessageV29.url;
                                        InlineMessageV2 inlineMessageV210 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV210.getClass();
                                        Instant instant = inlineMessageV210.expiresAtUtc;
                                        InlineMessageV2 inlineMessageV211 = (InlineMessageV2) disclosurePresenter2.args;
                                        inlineMessageV211.getClass();
                                        localTabContentQueries.insert(inlineMessageV211.priority, placement, uiAvatar, str, str2, str3, str4, str5, instant, z);
                                        disclosurePresenter2.args = null;
                                    }
                                    break;
                                case 1:
                                    InlineAppMessageV2ViewModel.Ready ready = ((AppMessageViewEvent.AppMessageTemporarilyDismiss) obj3).inlineMessage;
                                    if (ready != null) {
                                        String str6 = ready.messageToken;
                                        LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                        localTabContentQueries2.getClass();
                                        str6.getClass();
                                        InlineMessageV2Queries$inlineMessageByMessageToken$2 inlineMessageV2Queries$inlineMessageByMessageToken$2 = InlineMessageV2Queries$inlineMessageByMessageToken$2.INSTANCE;
                                        disclosurePresenter2.args = (InlineMessageV2) new RewardQueries.ForIdsQuery(localTabContentQueries2, str6, new InlineMessageV2Queries$$ExternalSyntheticLambda0(localTabContentQueries2, 1)).executeAsOneOrNull();
                                        localTabContentQueries2.delete(str6);
                                    }
                                    break;
                                case 2:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    boolean z2 = appMessageActionTaken.shouldDismissMessage;
                                    String str7 = appMessageActionTaken.messageToken;
                                    if (z2) {
                                        InlineMessageV2 inlineMessageV212 = (InlineMessageV2) disclosurePresenter2.args;
                                        if (Intrinsics.areEqual(inlineMessageV212 != null ? inlineMessageV212.messageToken : null, str7)) {
                                            disclosurePresenter2.args = null;
                                        }
                                        ((LocalTabContentQueries) disclosurePresenter2.launcher).delete(str7);
                                    }
                                    ((GrpcMethod) disclosurePresenter2.stringManager).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) disclosurePresenter2.launcher;
                                    String str8 = appMessageViewed.messageToken;
                                    localTabContentQueries3.getClass();
                                    str8.getClass();
                                    localTabContentQueries3.driver.execute(-7061413, "UPDATE inlineMessageV2\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str8, 24));
                                    localTabContentQueries3.notifyQueries(-7061413, new CardMessageQueries$$ExternalSyntheticLambda7(13));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(disclosurePresenter2, appMessageViewed, null, 11), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect4 = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector4, disclosurePresenter, 5), 28), this);
                    if (collect4 != coroutineSingletons4) {
                        collect4 = Unit.INSTANCE;
                    }
                    if (collect4 != coroutineSingletons4) {
                        collect4 = Unit.INSTANCE;
                    }
                    if (collect4 == coroutineSingletons4) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InlineAppMessageV2PresenterHelper$models$1$1(Flow flow, DisclosurePresenter disclosurePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$events = flow;
        this.this$0 = disclosurePresenter;
    }
}
