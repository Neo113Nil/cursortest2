package yads;

import android.content.Context;
import defpackage.a271;
import defpackage.t881;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class pf2 extends SuspendLambda implements wls {
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ t881 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ xz f;
    public final /* synthetic */ a271 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf2(long j, Context context, List list, Continuation continuation, xz xzVar, t881 t881Var, a271 a271Var) {
        super(2, continuation);
        this.c = list;
        this.d = t881Var;
        this.e = context;
        this.f = xzVar;
        this.g = a271Var;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        List list = this.c;
        t881 t881Var = this.d;
        pf2 pf2Var = new pf2(this.h, this.e, list, continuation, this.f, t881Var, this.g);
        pf2Var.b = obj;
        return pf2Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((pf2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        tse tseVar = (tse) this.b;
        List<mr1> list = this.c;
        t881 t881Var = this.d;
        Context context = this.e;
        xz xzVar = this.f;
        a271 a271Var = this.g;
        long j = this.h;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (mr1 mr1Var : list) {
            t881Var.getClass();
            arrayList.add(tje.h(tseVar, null, null, new mf2(t881Var, mr1Var, context, xzVar, j, a271Var, null), 3));
        }
        return arrayList;
    }
}
