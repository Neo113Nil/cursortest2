package yads;

import android.content.Context;
import defpackage.is71;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* loaded from: classes7.dex */
public final class nc extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(Context context, Continuation continuation) {
        super(2, continuation);
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new nc(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new nc(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        is71 is71Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Context context = this.c;
        is71 is71Var2 = is71.e;
        if (is71Var2 == null) {
            synchronized (is71.d) {
                is71Var = is71.e;
                if (is71Var == null) {
                    is71Var = new is71(context);
                    is71.e = is71Var;
                }
            }
            is71Var2 = is71Var;
        }
        this.b = 1;
        Object w = a.w(((Number) is71Var2.b.a.getValue()).longValue(), new lc(is71Var2, null), this);
        return w == coroutineSingletons ? coroutineSingletons : w;
    }
}
