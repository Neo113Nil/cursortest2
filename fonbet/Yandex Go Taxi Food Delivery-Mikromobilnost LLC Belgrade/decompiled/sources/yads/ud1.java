package yads;

import android.content.Context;
import defpackage.rl81;
import defpackage.uh61;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class ud1 extends SuspendLambda implements wls {
    public final /* synthetic */ uh61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(uh61 uh61Var, Continuation continuation) {
        super(2, continuation);
        this.b = uh61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ud1(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new ud1(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        uh61 uh61Var = this.b;
        rl81 rl81Var = uh61Var.c;
        Context context = uh61Var.a;
        rl81Var.getClass();
        File a = rl81.a(context, "mobileads-script-cache");
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }
}
