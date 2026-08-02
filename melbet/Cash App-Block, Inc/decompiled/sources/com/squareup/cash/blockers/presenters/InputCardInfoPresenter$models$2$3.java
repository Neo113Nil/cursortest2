package com.squareup.cash.blockers.presenters;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.actions.presenters.BlockerActionUtilKt;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class InputCardInfoPresenter$models$2$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ InputCardInfoPresenter this$0;

    /* renamed from: com.squareup.cash.blockers.presenters.InputCardInfoPresenter$models$2$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ InputCardInfoPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InputCardInfoPresenter inputCardInfoPresenter, Continuation continuation) {
            super(2, continuation);
            this.this$0 = inputCardInfoPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InputCardInfoPresenter inputCardInfoPresenter = this.this$0;
            BlockersScreens.InputCardInfoScreen inputCardInfoScreen = inputCardInfoPresenter.args;
            BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = inputCardInfoPresenter.blockerResolver;
                SubmitFormRequest submitFormRequest = new SubmitFormRequest(inputCardInfoScreen.blockersData.requestContext, submitAction.id, EmptyList.INSTANCE, 8);
                this.L$0 = null;
                this.label = 1;
                obj = multiBlockerFacilitator$Resolver.resolve(submitFormRequest, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult != null) {
                BlockerActionUtilKt.handleSubmitFormResponseContext(apiResult, inputCardInfoScreen, inputCardInfoScreen.blockersData, inputCardInfoPresenter.navigator, inputCardInfoPresenter.blockersDataNavigator);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputCardInfoPresenter$models$2$3(InputCardInfoPresenter inputCardInfoPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = inputCardInfoPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InputCardInfoPresenter inputCardInfoPresenter = this.this$0;
        switch (i) {
            case 0:
                return new InputCardInfoPresenter$models$2$3(inputCardInfoPresenter, continuation, 0);
            default:
                return new InputCardInfoPresenter$models$2$3(inputCardInfoPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InputCardInfoPresenter$models$2$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        InputCardInfoPresenter inputCardInfoPresenter = this.this$0;
        switch (i) {
            case 0:
                BlockersScreens.InputCardInfoScreen inputCardInfoScreen = inputCardInfoPresenter.args;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper = inputCardInfoPresenter.blockersHelper;
                    BlockerAction blockerAction = inputCardInfoScreen.dismissAction;
                    blockerAction.getClass();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(inputCardInfoPresenter, null);
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, inputCardInfoScreen, null, null, false, null, anonymousClass1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl sync = inputCardInfoPresenter.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                    this.label = 1;
                    if (sync.awaitInternal(this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
