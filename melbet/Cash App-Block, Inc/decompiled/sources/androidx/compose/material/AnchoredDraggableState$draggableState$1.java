package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {
    public final SliderState$dragScope$1 dragScope;
    public final /* synthetic */ AnchoredDraggableState this$0;

    public AnchoredDraggableState$draggableState$1(AnchoredDraggableState anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
        this.dragScope = new SliderState$dragScope$1(anchoredDraggableState, 2);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object anchoredDrag = this.this$0.anchoredDrag(mutatePriority, new CachedPagingDataKt$cachedIn$2(this, function2, (Continuation) null), continuation);
        return anchoredDrag == CoroutineSingletons.COROUTINE_SUSPENDED ? anchoredDrag : Unit.INSTANCE;
    }
}
