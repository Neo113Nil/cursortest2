package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements Function2 {
    final /* synthetic */ View $this_allViews;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation continuation) {
        super(2, continuation);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, continuation);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewKt$allViews$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SequenceScope sequenceScope = (SequenceScope) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = sequenceScope;
            this.label = 1;
            sequenceScope.yield(view, this);
            return coroutineSingletons;
        }
        if (i == 1) {
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
            View view2 = this.$this_allViews;
            if (view2 instanceof ViewGroup) {
                this.L$0 = null;
                this.label = 2;
                sequenceScope2.getClass();
                Object yieldAll = sequenceScope2.yieldAll(new TreeIterator(new ViewGroupKt$iterator$1((ViewGroup) view2)), this);
                if (yieldAll != coroutineSingletons) {
                    yieldAll = Unit.INSTANCE;
                }
                if (yieldAll == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
