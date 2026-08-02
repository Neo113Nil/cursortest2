package com.squareup.cash.shopping.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealRecentSearchManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1(RealRecentSearchManager realRecentSearchManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realRecentSearchManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1(this.this$0, continuation, 0);
            default:
                return new RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1(this.this$0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealRecentSearchManager realRecentSearchManager = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext = JobKt.withContext(realRecentSearchManager.ioDispatcher, new ChatInputView$Content$1$1$1(realRecentSearchManager, continuation, 7), this);
                    return withContext == coroutineSingletons ? coroutineSingletons : withContext;
                }
                if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext2 = JobKt.withContext(realRecentSearchManager.ioDispatcher, new ShoppingWebBridge$loadUrl$1(realRecentSearchManager, (Continuation) null, 8), this);
                    return withContext2 == coroutineSingletons2 ? coroutineSingletons2 : withContext2;
                }
                if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
