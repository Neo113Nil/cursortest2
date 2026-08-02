package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.Braze;
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
public final class y0 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Braze d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(boolean z, Braze braze, Object obj, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.c = z;
        this.d = braze;
        this.e = obj;
        this.f = function2;
        this.g = function0;
    }

    public static final String a(Function0 function0) {
        return Boxes$$ExternalSyntheticOutline1.m("Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > ", function0.invoke());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y0 y0Var = new y0(this.c, this.d, this.e, this.f, this.g, continuation);
        y0Var.b = obj;
        return y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        if (this.c && this.d.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new y0$$ExternalSyntheticLambda0(0, this.g), 6, (Object) null);
            return this.e;
        }
        Function2 function2 = this.f;
        this.b = null;
        this.a = 1;
        Object invoke = function2.invoke(coroutineScope, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
