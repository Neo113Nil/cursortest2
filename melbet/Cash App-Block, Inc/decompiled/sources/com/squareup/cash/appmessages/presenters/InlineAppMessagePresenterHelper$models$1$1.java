package com.squareup.cash.appmessages.presenters;

import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.appmessages.treehouse.AndroidAppMessagingService;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class InlineAppMessagePresenterHelper$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $events;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineAppMessagePresenterHelper$models$1$1(DisclosurePresenter disclosurePresenter, Flow flow, Continuation continuation) {
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
                return new InlineAppMessagePresenterHelper$models$1$1(disclosurePresenter, flow, continuation);
            case 1:
                return new InlineAppMessagePresenterHelper$models$1$1(flow, disclosurePresenter, continuation, 1);
            default:
                return new InlineAppMessagePresenterHelper$models$1$1(flow, disclosurePresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InlineAppMessagePresenterHelper$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final DisclosurePresenter disclosurePresenter = this.this$0;
        Flow flow = this.$events;
        Continuation continuation = null;
        final int i2 = 1;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object coroutineScope = JobKt.coroutineScope(new SetNameViewKt$SetName$2$1(disclosurePresenter, flow, continuation, 7), this);
                    if (coroutineScope != obj2) {
                        coroutineScope = Unit.INSTANCE;
                    }
                    if (coroutineScope == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final int i5 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$processEvents$2$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i6 = i5;
                            DisclosurePresenter disclosurePresenter2 = disclosurePresenter;
                            switch (i6) {
                                case 0:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    if (appMessageActionTaken.shouldDismissMessage) {
                                        ((AndroidAppMessagingService) disclosurePresenter2.appService).notifyBuffer.mo1159trySendJP2dKIU(Boolean.FALSE);
                                        ((LocalTabContentQueries) disclosurePresenter2.args).delete(appMessageActionTaken.messageToken);
                                        disclosurePresenter2.navigator = null;
                                    }
                                    ((GrpcMethod) disclosurePresenter2.launcher).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) disclosurePresenter2.args;
                                    String str = appMessageViewed.messageToken;
                                    localTabContentQueries.getClass();
                                    str.getClass();
                                    localTabContentQueries.driver.execute(-1945626825, "UPDATE inlineMessage\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 23));
                                    localTabContentQueries.notifyQueries(-1945626825, new CardMessageQueries$$ExternalSyntheticLambda7(10));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(disclosurePresenter2, appMessageViewed, null, 10), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(new InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, disclosurePresenter, 1), 22), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$processEvents$2$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i62 = i2;
                            DisclosurePresenter disclosurePresenter2 = disclosurePresenter;
                            switch (i62) {
                                case 0:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    if (appMessageActionTaken.shouldDismissMessage) {
                                        ((AndroidAppMessagingService) disclosurePresenter2.appService).notifyBuffer.mo1159trySendJP2dKIU(Boolean.FALSE);
                                        ((LocalTabContentQueries) disclosurePresenter2.args).delete(appMessageActionTaken.messageToken);
                                        disclosurePresenter2.navigator = null;
                                    }
                                    ((GrpcMethod) disclosurePresenter2.launcher).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) disclosurePresenter2.args;
                                    String str = appMessageViewed.messageToken;
                                    localTabContentQueries.getClass();
                                    str.getClass();
                                    localTabContentQueries.driver.execute(-1945626825, "UPDATE inlineMessage\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 23));
                                    localTabContentQueries.notifyQueries(-1945626825, new CardMessageQueries$$ExternalSyntheticLambda7(10));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(disclosurePresenter2, appMessageViewed, null, 10), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect2 = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(new InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector2, disclosurePresenter, 2), 23), this);
                    if (collect2 != coroutineSingletons2) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons2) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons2) {
                        break;
                    }
                } else if (i6 != 1) {
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
    public /* synthetic */ InlineAppMessagePresenterHelper$models$1$1(Flow flow, DisclosurePresenter disclosurePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$events = flow;
        this.this$0 = disclosurePresenter;
    }
}
