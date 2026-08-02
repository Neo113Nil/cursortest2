package bo.app;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class bd extends SuspendLambda implements Function2 {
    public final /* synthetic */ cd a;
    public final /* synthetic */ id b;
    public final /* synthetic */ dd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(cd cdVar, id idVar, dd ddVar, Continuation continuation) {
        super(2, continuation);
        this.a = cdVar;
        this.b = idVar;
        this.c = ddVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new bd(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bd) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        cd cdVar = this.a;
        new l2(this.b, cdVar.a, cdVar.b, cdVar.c, cdVar.f, cdVar.d, cdVar.e, cdVar.g, this.c).c();
        return Unit.INSTANCE;
    }
}
