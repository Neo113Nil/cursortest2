package yads;

import android.content.Context;
import defpackage.au71;
import defpackage.ck61;
import defpackage.ck81;
import defpackage.cr71;
import defpackage.fe81;
import defpackage.fo71;
import defpackage.jx71;
import defpackage.kn81;
import defpackage.nr41;
import defpackage.so61;
import defpackage.tg81;
import defpackage.tse;
import defpackage.v881;
import defpackage.vi71;
import defpackage.w381;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class ly1 extends SuspendLambda implements wls {
    public final /* synthetic */ w381 b;
    public final /* synthetic */ tg81 c;
    public final /* synthetic */ v881 d;
    public final /* synthetic */ jx71 e;
    public final /* synthetic */ au71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(w381 w381Var, tg81 tg81Var, v881 v881Var, jx71 jx71Var, au71 au71Var, Continuation continuation) {
        super(2, continuation);
        this.b = w381Var;
        this.c = tg81Var;
        this.d = v881Var;
        this.e = jx71Var;
        this.f = au71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ly1(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ly1 ly1Var = (ly1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ly1Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        w381 w381Var = this.b;
        cr71 cr71Var = w381Var.f;
        Context context = w381Var.e;
        tg81 tg81Var = this.c;
        v881 v881Var = this.d;
        ck61 ck61Var = this.e.c;
        fo71 fo71Var = this.f.a;
        ck81 ck81Var = (ck81) ((kn81) cr71Var.x).a.get(((fe81) cr71Var.b).f);
        if (ck81Var != null) {
            ck81Var.a(context, tg81Var, v881Var, (vi71) cr71Var.w, ck61Var, (nr41) cr71Var.c, fo71Var);
        } else {
            fo71Var.b(so61.a);
        }
        return zy11.a;
    }
}
