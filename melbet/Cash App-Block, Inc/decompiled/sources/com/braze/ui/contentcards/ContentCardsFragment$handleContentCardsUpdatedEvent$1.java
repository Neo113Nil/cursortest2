package com.braze.ui.contentcards;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.events.ContentCardsUpdatedEvent;
import com.plaid.internal.EnumC0170g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1", f = "ContentCardsFragment.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ContentCardsFragment$handleContentCardsUpdatedEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContentCardsUpdatedEvent $event;
    int label;
    final /* synthetic */ ContentCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$handleContentCardsUpdatedEvent$1(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent contentCardsUpdatedEvent, Continuation<? super ContentCardsFragment$handleContentCardsUpdatedEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = contentCardsFragment;
        this.$event = contentCardsUpdatedEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContentCardsFragment$handleContentCardsUpdatedEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ContentCardsFragment contentCardsFragment = this.this$0;
            ContentCardsUpdatedEvent contentCardsUpdatedEvent = this.$event;
            this.label = 1;
            if (contentCardsFragment.contentCardsUpdate(contentCardsUpdatedEvent, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
