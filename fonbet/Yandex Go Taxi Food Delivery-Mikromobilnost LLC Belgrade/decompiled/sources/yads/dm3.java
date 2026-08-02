package yads;

import android.content.Context;
import android.webkit.WebSettings;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class dm3 extends SuspendLambda implements wls {
    public /* synthetic */ Object b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm3(Context context, Continuation continuation) {
        super(2, continuation);
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        dm3 dm3Var = new dm3(this.c, continuation);
        dm3Var.b = obj;
        return dm3Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        dm3 dm3Var = new dm3(this.c, (Continuation) obj2);
        dm3Var.b = (tse) obj;
        return dm3Var.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        try {
            failure = WebSettings.getDefaultUserAgent(this.c.getApplicationContext());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
