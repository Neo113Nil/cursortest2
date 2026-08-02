package yads;

import android.content.Context;
import defpackage.ei71;
import defpackage.fe81;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.rx71;
import defpackage.sjh;
import defpackage.tg81;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v881;
import defpackage.wls;
import defpackage.z081;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class m32 extends SuspendLambda implements wls {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rx71 d;
    public final /* synthetic */ fe81 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ tg81 g;
    public final /* synthetic */ v881 h;
    public final /* synthetic */ z081 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m32(rx71 rx71Var, fe81 fe81Var, Context context, tg81 tg81Var, v881 v881Var, z081 z081Var, Continuation continuation) {
        super(2, continuation);
        this.d = rx71Var;
        this.e = fe81Var;
        this.f = context;
        this.g = tg81Var;
        this.h = v881Var;
        this.i = z081Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        m32 m32Var = new m32(this.d, this.e, this.f, this.g, this.h, this.i, continuation);
        m32Var.c = obj;
        return m32Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((m32) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                b.b(obj);
                rx71 rx71Var = this.d;
                fe81 fe81Var = this.e;
                Context context = this.f;
                tg81 tg81Var = this.g;
                v881 v881Var = this.h;
                z081 z081Var = this.i;
                ei71 ei71Var = rx71Var.b;
                this.b = 1;
                ei71Var.getClass();
                sjh sjhVar = uyj.a;
                obj = tje.k0(mdh.b, new i32(fe81Var, ei71Var, context, tg81Var, z081Var, v881Var, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            failure = (tg81) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
