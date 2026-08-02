package bo.app;

import com.braze.BrazeUser;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class c3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ BrazeUser b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.b = brazeUser;
        this.c = str;
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Successfully set LINE ID: ", str, ".");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c3 c3Var = new c3(this.b, this.c, continuation);
        c3Var.a = obj;
        return c3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        xgVar = this.b.userCache;
        String str = this.c;
        synchronized (xgVar) {
            xgVar.c("native_line_id", str);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(this.c, 3), 6, (Object) null);
        return Unit.INSTANCE;
    }
}
