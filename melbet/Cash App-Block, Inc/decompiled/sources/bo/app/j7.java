package bo.app;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class j7 extends SuspendLambda implements Function2 {
    public Mutex a;
    public m7 b;
    public String c;
    public long d;
    public int e;
    public final /* synthetic */ m7 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(m7 m7Var, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.f = m7Var;
        this.g = str;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j7(this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m7 m7Var;
        Mutex mutex;
        String str;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            m7Var = this.f;
            Mutex mutex2 = m7Var.b;
            String str2 = this.g;
            long j2 = this.h;
            this.a = mutex2;
            this.b = m7Var;
            this.c = str2;
            this.d = j2;
            this.e = 1;
            if (mutex2.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutex2;
            str = str2;
            j = j2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.d;
            str = this.c;
            m7Var = this.b;
            mutex = this.a;
            SafeTrace.throwOnFailure(obj);
        }
        try {
            Map a = m7Var.a();
            a.put(str, new Long(j));
            m7.a(m7Var, a);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
