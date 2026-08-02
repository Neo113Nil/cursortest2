package bo.app;

import com.braze.BrazeUser;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class t2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BrazeUser a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(BrazeUser brazeUser, String str, Object obj, Continuation continuation) {
        super(2, continuation);
        this.a = brazeUser;
        this.b = str;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t2(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        xgVar = this.a.userCache;
        String str = this.b;
        Object obj2 = this.c;
        synchronized (xgVar) {
            str.getClass();
            obj2.getClass();
            xgVar.a(str, obj2);
        }
        return Unit.INSTANCE;
    }
}
