package com.squareup.cash.pools.views.animation;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AvatarLayoutAnimationStateHolder$animateIn$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ AvatarLayoutAnimationStateHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarLayoutAnimationStateHolder$animateIn$2(AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = avatarLayoutAnimationStateHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                AvatarLayoutAnimationStateHolder$animateIn$2 avatarLayoutAnimationStateHolder$animateIn$2 = new AvatarLayoutAnimationStateHolder$animateIn$2(this.this$0, continuation, 0);
                avatarLayoutAnimationStateHolder$animateIn$2.L$0 = obj;
                return avatarLayoutAnimationStateHolder$animateIn$2;
            default:
                AvatarLayoutAnimationStateHolder$animateIn$2 avatarLayoutAnimationStateHolder$animateIn$22 = new AvatarLayoutAnimationStateHolder$animateIn$2(this.this$0, continuation, 1);
                avatarLayoutAnimationStateHolder$animateIn$22.L$0 = obj;
                return avatarLayoutAnimationStateHolder$animateIn$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AvatarLayoutAnimationStateHolder$animateIn$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge.AnonymousClass1(this.this$0, (Continuation) null, 2), 3);
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder = this.this$0;
                int i = avatarLayoutAnimationStateHolder.index;
                long j = i * 8;
                int i2 = i == 0 ? EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE : EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE;
                JobKt.launch$default(coroutineScope2, null, null, new AvatarLayoutAnimationStateHolder$animateOut$2$1(avatarLayoutAnimationStateHolder, j, i2, null, 0), 3);
                return JobKt.launch$default(coroutineScope2, null, null, new AvatarLayoutAnimationStateHolder$animateOut$2$1(this.this$0, j, i2, null, 1), 3);
        }
    }
}
