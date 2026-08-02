package androidx.compose.foundation.gestures;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ScrollableNode$setScrollSemanticsActions$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ float $x;
    public final /* synthetic */ float $y;
    public int label;
    public final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$1$1(ScrollableNode scrollableNode, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scrollableNode;
        this.$x = f;
        this.$y = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollableNode$setScrollSemanticsActions$1$1(this.this$0, this.$x, this.$y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$setScrollSemanticsActions$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
            long floatToRawIntBits = (Float.floatToRawIntBits(this.$x) << 32) | (Float.floatToRawIntBits(this.$y) & BodyPartID.bodyIdMax);
            this.label = 1;
            if (ScrollableKt.m240access$semanticsScrollByd4ec7I(scrollingLogic, floatToRawIntBits, this) == coroutineSingletons) {
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
