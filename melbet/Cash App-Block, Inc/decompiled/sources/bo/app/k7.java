package bo.app;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class k7 extends SuspendLambda implements Function2 {
    public Mutex a;
    public m7 b;
    public String c;
    public int d;
    public final /* synthetic */ m7 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(m7 m7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.e = m7Var;
        this.f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k7(this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k7(this.e, this.f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m7 m7Var;
        Mutex mutex;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            m7Var = this.e;
            Mutex mutex2 = m7Var.b;
            String str2 = this.f;
            this.a = mutex2;
            this.b = m7Var;
            this.c = str2;
            this.d = 1;
            if (mutex2.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutex2;
            str = str2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.c;
            m7Var = this.b;
            mutex = this.a;
            SafeTrace.throwOnFailure(obj);
        }
        try {
            Map a = m7Var.a();
            a.remove(str);
            m7.a(m7Var, a);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
