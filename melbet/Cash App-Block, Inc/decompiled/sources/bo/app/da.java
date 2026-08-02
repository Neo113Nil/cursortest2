package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class da extends SuspendLambda implements Function2 {
    public final /* synthetic */ InAppMessageBase a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(InAppMessageBase inAppMessageBase, Continuation continuation) {
        super(2, continuation);
        this.a = inAppMessageBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new da(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new da(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        a9 brazeManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        atomicBoolean = this.a.clickLogged;
        if (atomicBoolean.get() && (brazeManager = this.a.getBrazeManager()) != null) {
            ((e2) brazeManager).d.b(new hg(new fa(this.a.getTriggerId())), hg.class);
        }
        return Unit.INSTANCE;
    }
}
