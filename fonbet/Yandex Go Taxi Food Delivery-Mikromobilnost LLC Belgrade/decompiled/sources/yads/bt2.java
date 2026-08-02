package yads;

import android.content.SharedPreferences;
import defpackage.fh71;
import defpackage.s881;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class bt2 extends SuspendLambda implements wls {
    public final /* synthetic */ fh71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt2(fh71 fh71Var, Continuation continuation) {
        super(2, continuation);
        this.b = fh71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new bt2(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        bt2 bt2Var = new bt2(this.b, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bt2Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        ((SharedPreferences) s881.a(this.b.h, "YadPreferenceFile").d.getValue()).getAll();
        return zy11.a;
    }
}
