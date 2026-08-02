package com.squareup.cash.api;

import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.boost.backend.RealBoostSyncer;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RewardsData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealServiceContextManager$consumeResponseContext$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Exception $callSiteError;
    public final /* synthetic */ RequestContext $request;
    public final /* synthetic */ String $requestType;
    public final /* synthetic */ ResponseContext $responseContext;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealServiceContextManager this$0;

    /* renamed from: com.squareup.cash.api.RealServiceContextManager$consumeResponseContext$2$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ ResponseContext $responseContext;
        public int label;
        public final /* synthetic */ RealServiceContextManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(ResponseContext responseContext, RealServiceContextManager realServiceContextManager, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$responseContext = responseContext;
            this.this$0 = realServiceContextManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            RealServiceContextManager realServiceContextManager = this.this$0;
            ResponseContext responseContext = this.$responseContext;
            switch (i) {
                case 0:
                    return new AnonymousClass2(responseContext, realServiceContextManager, continuation, 0);
                case 1:
                    return new AnonymousClass2(responseContext, realServiceContextManager, continuation, 1);
                default:
                    return new AnonymousClass2(responseContext, realServiceContextManager, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            RealServiceContextManager realServiceContextManager = this.this$0;
            ResponseContext responseContext = this.$responseContext;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DirectDepositAccount directDepositAccount = responseContext.direct_deposit_account;
                        if (directDepositAccount != null) {
                            RealDemandDepositAccountManager realDemandDepositAccountManager = (RealDemandDepositAccountManager) realServiceContextManager.demandDepositAccountManager.getValue();
                            this.label = 1;
                            if (realDemandDepositAccountManager.updateDemandDepositAccount(directDepositAccount) == coroutineSingletons) {
                                break;
                            }
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RewardsData rewardsData = responseContext.rewards_data;
                        if (rewardsData != null) {
                            BoostSyncer boostSyncer = (BoostSyncer) realServiceContextManager.boostSyncer.getValue();
                            this.label = 1;
                            if (((RealBoostSyncer) boostSyncer).processNewBoostsData(rewardsData, this) == coroutineSingletons2) {
                                break;
                            }
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        String str = responseContext.profile_token;
                        if (str != null) {
                            RealProfileSyncer realProfileSyncer = (RealProfileSyncer) realServiceContextManager.profileSyncer.getValue();
                            Profile profile = responseContext.profile;
                            profile.getClass();
                            this.label = 1;
                            if (realProfileSyncer.updateProfile(profile, str, this) == coroutineSingletons3) {
                                break;
                            }
                        }
                    } else if (i4 != 1) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealServiceContextManager$consumeResponseContext$2(RealServiceContextManager realServiceContextManager, RequestContext requestContext, ResponseContext responseContext, String str, Exception exc, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realServiceContextManager;
        this.$request = requestContext;
        this.$responseContext = responseContext;
        this.$requestType = str;
        this.$callSiteError = exc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealServiceContextManager$consumeResponseContext$2 realServiceContextManager$consumeResponseContext$2 = new RealServiceContextManager$consumeResponseContext$2(this.this$0, this.$request, this.$responseContext, this.$requestType, this.$callSiteError, continuation);
        realServiceContextManager$consumeResponseContext$2.L$0 = obj;
        return realServiceContextManager$consumeResponseContext$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealServiceContextManager$consumeResponseContext$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        RealServiceContextManager realServiceContextManager = this.this$0;
        RequestContext requestContext = this.$request;
        ResponseContext responseContext = this.$responseContext;
        String str = this.$requestType;
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new FlowQuery$asFlow$1(realServiceContextManager, requestContext, responseContext, str, null, 5), 3);
        ResponseContext responseContext2 = this.$responseContext;
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass2(responseContext2, realServiceContextManager, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass2(responseContext2, realServiceContextManager, continuation, 1), 3);
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass2(responseContext2, realServiceContextManager, continuation, 2), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealGcmRegistrar$unregister$2(responseContext2, realServiceContextManager, null, 9), 3);
        return JobKt.launch$default(coroutineScope, null, null, new FlowQuery$asFlow$1(realServiceContextManager, this.$responseContext, str, this.$callSiteError, null, 6), 3);
    }
}
