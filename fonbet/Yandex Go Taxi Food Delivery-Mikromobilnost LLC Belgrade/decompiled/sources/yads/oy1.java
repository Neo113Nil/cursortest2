package yads;

import defpackage.ck61;
import defpackage.d881;
import defpackage.fo71;
import defpackage.jx71;
import defpackage.qb71;
import defpackage.tse;
import defpackage.w381;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class oy1 extends SuspendLambda implements wls {
    public final /* synthetic */ w381 b;
    public final /* synthetic */ d881 c;
    public final /* synthetic */ qb71 d;
    public final /* synthetic */ ck61 e;
    public final /* synthetic */ fo71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy1(w381 w381Var, d881 d881Var, qb71 qb71Var, ck61 ck61Var, fo71 fo71Var, Continuation continuation) {
        super(2, continuation);
        this.b = w381Var;
        this.c = d881Var;
        this.d = qb71Var;
        this.e = ck61Var;
        this.f = fo71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new oy1(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        oy1 oy1Var = (oy1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        oy1Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        new jx71(this.b, this.c, this.d, this.e, this.f).run();
        return zy11.a;
    }
}
