package bo.app;

import android.content.BroadcastReceiver;
import android.content.Intent;
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
public final class h4 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k4 b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ BroadcastReceiver.PendingResult d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(k4 k4Var, Intent intent, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.b = k4Var;
        this.c = intent;
        this.d = pendingResult;
    }

    public static final String a() {
        return "Retrieving connectivity event data in background";
    }

    public static final String b() {
        return "Failed to process connectivity event.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h4 h4Var = new h4(this.b, this.c, this.d, continuation);
        h4Var.a = obj;
        return h4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(23), 6, (Object) null);
        try {
            k4 k4Var = this.b;
            cb cbVar = k4Var.j;
            k4Var.j = com.braze.support.b.a(this.c, k4Var.i);
            k4 k4Var2 = this.b;
            cb cbVar2 = k4Var2.j;
            if (cbVar != cbVar2) {
                k4Var2.b.b(new db(cbVar, cbVar2), db.class);
            }
            this.b.b();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new g$$ExternalSyntheticLambda0(24), 4, (Object) null);
            k4 k4Var3 = this.b;
            k4Var3.a(k4Var3.b, e);
        }
        this.d.finish();
        return Unit.INSTANCE;
    }
}
