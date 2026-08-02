package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ca extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ InAppMessageBase b;
    public final /* synthetic */ a9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(String str, InAppMessageBase inAppMessageBase, a9 a9Var, Continuation continuation) {
        super(2, continuation);
        this.a = str;
        this.b = inAppMessageBase;
        this.c = a9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ca(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ca) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        y8 m = k1.g.m(this.a, this.b.getMessageExtras());
        if (m != null) {
            ((e2) this.c).a(m);
        }
        return Unit.INSTANCE;
    }
}
