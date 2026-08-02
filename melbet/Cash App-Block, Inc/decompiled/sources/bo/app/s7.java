package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class s7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ t7 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Function0 function0, t7 t7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = function0;
        this.c = t7Var;
        this.d = str;
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to ", str);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        s7 s7Var = new s7(this.b, this.c, this.d, continuation);
        s7Var.a = obj;
        return s7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        try {
            this.b.invoke();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new o6$$ExternalSyntheticLambda2(this.d, 22), 4, (Object) null);
            this.c.a(e);
        }
        return Unit.INSTANCE;
    }
}
