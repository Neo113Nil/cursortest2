package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class j4 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k4 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(k4 k4Var, long j, Continuation continuation) {
        super(2, continuation);
        this.d = k4Var;
        this.e = j;
    }

    public static final String a() {
        return "Requesting data flush from automatic sync policy";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j4 j4Var = new j4(this.d, this.e, continuation);
        j4Var.c = obj;
        return j4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r4, r14) == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineScope coroutineScope = (CoroutineScope) this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long j2 = this.d.g;
            long j3 = this.e;
            this.c = coroutineScope;
            this.a = j2;
            this.b = 1;
            if (JobKt.delay(j3, this) != coroutineSingletons) {
                j = j2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.a;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.a;
            SafeTrace.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, k4.m, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(13), 12, (Object) null);
            Braze.INSTANCE.getInstance(this.d.a).requestImmediateDataFlush();
            if (JobKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
            this.c = coroutineScope;
            this.a = j;
            this.b = 2;
        }
        Braze.INSTANCE.getInstance(this.d.a).requestImmediateDataFlush();
        if (JobKt.isActive(coroutineScope)) {
        }
    }
}
