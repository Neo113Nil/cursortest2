package yads;

import android.content.Context;
import defpackage.a271;
import defpackage.ny61;
import defpackage.t881;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class nf2 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ t881 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ xz e;
    public final /* synthetic */ a271 f;
    public final /* synthetic */ List g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf2(long j, Context context, List list, Continuation continuation, xz xzVar, t881 t881Var, a271 a271Var) {
        super(2, continuation);
        this.c = t881Var;
        this.d = context;
        this.e = xzVar;
        this.f = a271Var;
        this.g = list;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        t881 t881Var = this.c;
        Context context = this.d;
        xz xzVar = this.e;
        a271 a271Var = this.f;
        return new nf2(this.h, context, this.g, continuation, xzVar, t881Var, a271Var);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((nf2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        t881 t881Var = this.c;
        Context context = this.d;
        xz xzVar = this.e;
        a271 a271Var = this.f;
        List list = this.g;
        long j = this.h;
        this.b = 1;
        Object a = t881.a(t881Var, context, xzVar, a271Var, list, j, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
