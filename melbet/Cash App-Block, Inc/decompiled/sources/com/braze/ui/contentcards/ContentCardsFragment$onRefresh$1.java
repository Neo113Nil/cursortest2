package com.braze.ui.contentcards;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1", f = "ContentCardsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ContentCardsFragment$onRefresh$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ContentCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$onRefresh$1(ContentCardsFragment contentCardsFragment, Continuation<? super ContentCardsFragment$onRefresh$1> continuation) {
        super(1, continuation);
        this.this$0 = contentCardsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ContentCardsFragment$onRefresh$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((ContentCardsFragment$onRefresh$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        SwipeRefreshLayout contentCardsSwipeLayout = this.this$0.getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout != null) {
            contentCardsSwipeLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }
}
