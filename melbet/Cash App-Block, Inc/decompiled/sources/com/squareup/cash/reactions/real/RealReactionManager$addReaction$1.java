package com.squareup.cash.reactions.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewEmojiReaction;
import com.squareup.cash.cdf.activityrecord.EmojiReactionEntryPoint;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.app.AddReactionRequest;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealReactionManager$addReaction$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $entryPoint;
    public final /* synthetic */ boolean $isTreehouse;
    public final /* synthetic */ Function0 $onComplete;
    public final /* synthetic */ String $paymentToken;
    public final /* synthetic */ String $paymentType;
    public final /* synthetic */ String $reaction;
    public int label;
    public final /* synthetic */ RealReactionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealReactionManager$addReaction$1(RealReactionManager realReactionManager, String str, String str2, String str3, String str4, boolean z, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realReactionManager;
        this.$paymentType = str;
        this.$paymentToken = str2;
        this.$reaction = str3;
        this.$entryPoint = str4;
        this.$isTreehouse = z;
        this.$onComplete = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealReactionManager$addReaction$1(this.this$0, this.$paymentType, this.$paymentToken, this.$reaction, this.$entryPoint, this.$isTreehouse, this.$onComplete, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealReactionManager$addReaction$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object addReaction;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = this.$reaction;
        String str2 = this.$paymentToken;
        RealReactionManager realReactionManager = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AppService appService = realReactionManager.appService;
            AddReactionRequest addReactionRequest = new AddReactionRequest(new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(str2), null, null, null, null, null, null, 8175), new Reaction(Reaction.Type.EMOJI, str, 28));
            this.label = 1;
            addReaction = appService.addReaction(this.$paymentType, addReactionRequest, this);
            if (addReaction == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            addReaction = obj;
        }
        ApiResult apiResult = (ApiResult) addReaction;
        if (apiResult instanceof ApiResult.Success) {
            Analytics analytics = realReactionManager.analytics;
            String str3 = this.$entryPoint;
            analytics.track(new ActivityRecordViewEmojiReaction(str, str3 != null ? EmojiReactionEntryPoint.valueOf(str3) : null, Boolean.valueOf(this.$isTreehouse)), null);
        } else {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Timber.Forest.e("Failed to add reaction.", new Object[0]);
        }
        realReactionManager.pending.remove(str2);
        Function0 function0 = this.$onComplete;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
