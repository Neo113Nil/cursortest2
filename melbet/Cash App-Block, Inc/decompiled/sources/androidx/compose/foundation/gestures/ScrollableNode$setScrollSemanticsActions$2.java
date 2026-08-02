package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements Function2 {
    public /* synthetic */ long J$0;
    public int label;
    public final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(ScrollableNode scrollableNode, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scrollableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, continuation);
        scrollableNode$setScrollSemanticsActions$2.J$0 = ((Offset) obj).packedValue;
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Offset) obj).packedValue;
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, (Continuation) obj2);
        scrollableNode$setScrollSemanticsActions$2.J$0 = j;
        return scrollableNode$setScrollSemanticsActions$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        long j = this.J$0;
        ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
        this.label = 1;
        Object m240access$semanticsScrollByd4ec7I = ScrollableKt.m240access$semanticsScrollByd4ec7I(scrollingLogic, j, this);
        return m240access$semanticsScrollByd4ec7I == coroutineSingletons ? coroutineSingletons : m240access$semanticsScrollByd4ec7I;
    }
}
