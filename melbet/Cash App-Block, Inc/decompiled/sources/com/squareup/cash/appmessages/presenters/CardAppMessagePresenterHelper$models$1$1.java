package com.squareup.cash.appmessages.presenters;

import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
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
public final class CardAppMessagePresenterHelper$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $events;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardAppMessagePresenterHelper$models$1$1(CardStudioPresenter cardStudioPresenter, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = cardStudioPresenter;
        this.$events = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        Flow flow = this.$events;
        switch (i) {
            case 0:
                return new CardAppMessagePresenterHelper$models$1$1(cardStudioPresenter, flow, continuation);
            case 1:
                return new CardAppMessagePresenterHelper$models$1$1(flow, cardStudioPresenter, continuation, 1);
            default:
                return new CardAppMessagePresenterHelper$models$1$1(flow, cardStudioPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardAppMessagePresenterHelper$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final CardStudioPresenter cardStudioPresenter = this.this$0;
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
                    Object coroutineScope = JobKt.coroutineScope(new SetNameViewKt$SetName$2$1(cardStudioPresenter, flow, continuation, 6), this);
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
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$processEvents$2$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i6 = i5;
                            CardStudioPresenter cardStudioPresenter2 = cardStudioPresenter;
                            switch (i6) {
                                case 0:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    if (appMessageActionTaken.shouldDismissMessage) {
                                        ((LocalTabContentQueries) cardStudioPresenter2.appConfig).delete(appMessageActionTaken.messageToken);
                                    }
                                    ((GrpcMethod) cardStudioPresenter2.analytics).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter2.appConfig;
                                    String str = appMessageViewed.messageToken;
                                    localTabContentQueries.getClass();
                                    str.getClass();
                                    localTabContentQueries.driver.execute(-191003090, "UPDATE cardMessage\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 19));
                                    localTabContentQueries.notifyQueries(-191003090, new CardMessageQueries$$ExternalSyntheticLambda7(0));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(cardStudioPresenter2, appMessageViewed, null, 9), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(new CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, cardStudioPresenter, 3), 18), this);
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
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$processEvents$2$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            int i62 = i2;
                            CardStudioPresenter cardStudioPresenter2 = cardStudioPresenter;
                            switch (i62) {
                                case 0:
                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                                    if (appMessageActionTaken.shouldDismissMessage) {
                                        ((LocalTabContentQueries) cardStudioPresenter2.appConfig).delete(appMessageActionTaken.messageToken);
                                    }
                                    ((GrpcMethod) cardStudioPresenter2.analytics).perform(appMessageActionTaken);
                                    break;
                                default:
                                    AppMessageViewEvent.AppMessageViewed appMessageViewed = (AppMessageViewEvent.AppMessageViewed) obj3;
                                    LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter2.appConfig;
                                    String str = appMessageViewed.messageToken;
                                    localTabContentQueries.getClass();
                                    str.getClass();
                                    localTabContentQueries.driver.execute(-191003090, "UPDATE cardMessage\nSET isBadged = 0\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 19));
                                    localTabContentQueries.notifyQueries(-191003090, new CardMessageQueries$$ExternalSyntheticLambda7(0));
                                    Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new PagingDataPresenter$collectFrom$2(cardStudioPresenter2, appMessageViewed, null, 9), continuation2, 3);
                                    if (retryWhenRetryable$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect2 = flow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(new CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector2, cardStudioPresenter, 4), 19), this);
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
    public /* synthetic */ CardAppMessagePresenterHelper$models$1$1(Flow flow, CardStudioPresenter cardStudioPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$events = flow;
        this.this$0 = cardStudioPresenter;
    }
}
