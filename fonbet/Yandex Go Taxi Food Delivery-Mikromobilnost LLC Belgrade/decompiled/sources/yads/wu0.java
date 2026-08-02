package yads;

import defpackage.aw81;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ud71;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* loaded from: classes7.dex */
public final class wu0 extends SuspendLambda implements wls {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ aw81 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(List list, aw81 aw81Var, Continuation continuation) {
        super(2, continuation);
        this.d = list;
        this.e = aw81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        wu0 wu0Var = new wu0(this.d, this.e, continuation);
        wu0Var.c = obj;
        return wu0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((wu0) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tse tseVar = (tse) this.c;
        List list = this.d;
        aw81 aw81Var = this.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new vu0(aw81Var, (ud71) it.next(), null), 3));
        }
        this.b = 1;
        Object b = a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
