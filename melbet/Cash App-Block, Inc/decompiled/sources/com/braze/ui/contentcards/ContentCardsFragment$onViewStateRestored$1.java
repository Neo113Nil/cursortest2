package com.braze.ui.contentcards;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import java.util.ArrayList;
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
@DebugMetadata(c = "com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1", f = "ContentCardsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ContentCardsFragment$onViewStateRestored$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $savedInstanceState;
    int label;
    final /* synthetic */ ContentCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$onViewStateRestored$1(Bundle bundle, ContentCardsFragment contentCardsFragment, Continuation<? super ContentCardsFragment$onViewStateRestored$1> continuation) {
        super(2, continuation);
        this.$savedInstanceState = bundle;
        this.this$0 = contentCardsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentCardsFragment$onViewStateRestored$1(this.$savedInstanceState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContentCardsFragment$onViewStateRestored$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList<String> stringArrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.$savedInstanceState;
        Parcelable parcelable = i >= 33 ? (Parcelable) bundle.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", Parcelable.class) : bundle.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY");
        RecyclerView contentCardsRecyclerView = this.this$0.getContentCardsRecyclerView();
        if (contentCardsRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = contentCardsRecyclerView.mLayout;
            if (parcelable != null && layoutManager != null) {
                layoutManager.onRestoreInstanceState(parcelable);
            }
        }
        ContentCardAdapter contentCardAdapter = this.this$0.cardAdapter;
        if (contentCardAdapter != null && (stringArrayList = this.$savedInstanceState.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")) != null) {
            contentCardAdapter.setImpressedCardIds(stringArrayList);
        }
        return Unit.INSTANCE;
    }
}
