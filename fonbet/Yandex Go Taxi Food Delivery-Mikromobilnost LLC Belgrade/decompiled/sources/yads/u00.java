package yads;

import android.content.Context;
import defpackage.du71;
import defpackage.fe81;
import defpackage.fp71;
import defpackage.g271;
import defpackage.gh61;
import defpackage.gn61;
import defpackage.n291;
import defpackage.nl61;
import defpackage.nn81;
import defpackage.s421;
import defpackage.tse;
import defpackage.uq81;
import defpackage.wha1;
import defpackage.wls;
import defpackage.xrr;
import defpackage.zy11;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class u00 extends SuspendLambda implements wls {
    public final /* synthetic */ uq81 b;
    public final /* synthetic */ nl61 c;
    public final /* synthetic */ gn61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u00(uq81 uq81Var, nl61 nl61Var, gn61 gn61Var, Continuation continuation) {
        super(2, continuation);
        this.b = uq81Var;
        this.c = nl61Var;
        this.d = gn61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u00(this.b, this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        u00 u00Var = (u00) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        u00Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        uq81 uq81Var = this.b;
        Context context = uq81Var.b;
        Context context2 = uq81Var.a.a;
        gh61 gh61Var = new gh61(context, wha1.c(context2, context2));
        fp71 fp71Var = this.b.d;
        nl61 nl61Var = this.c;
        t32 t32Var = t32.c;
        gn61 gn61Var = this.d;
        fp71Var.getClass();
        nn81 nn81Var = new nn81((Context) fp71Var.x, (n291) fp71Var.a, new g271(nl61Var, t32Var, gh61Var), fp71Var, (xz) fp71Var.b);
        ((CopyOnWriteArrayList) fp71Var.c).add(nn81Var);
        s421 s421Var = nn81Var.b.Q;
        s421Var.x = gn61Var;
        ((xrr) s421Var.w).e(gn61Var, null, null);
        du71 du71Var = nn81Var.b;
        nl61 nl61Var2 = du71Var.P.a;
        du71Var.b.b(f5.e, null);
        du71Var.T.b(kc1.b, du71Var);
        fe81 fe81Var = du71Var.c;
        du71Var.P.getClass();
        fe81Var.j = 1;
        du71Var.c.a(nl61Var2.a);
        fe81 fe81Var2 = du71Var.c;
        fe81Var2.f = du71Var.P.b;
        fe81Var2.m = nl61Var2.d;
        synchronized (du71Var) {
            du71Var.k(nl61Var2);
        }
        return zy11.a;
    }
}
