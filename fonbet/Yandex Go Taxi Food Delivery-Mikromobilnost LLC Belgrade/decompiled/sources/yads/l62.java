package yads;

import defpackage.gwk0;
import defpackage.i581;
import defpackage.ny61;
import defpackage.qr71;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* loaded from: classes7.dex */
public final class l62 extends SuspendLambda implements wls {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ qr71 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l62(List list, qr71 qr71Var, Continuation continuation) {
        super(2, continuation);
        this.d = list;
        this.e = qr71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        l62 l62Var = new l62(this.d, this.e, continuation);
        l62Var.c = obj;
        return l62Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((l62) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.c;
            List<i581> list = this.d;
            qr71 qr71Var = this.e;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (i581 i581Var : list) {
                arrayList.add(i581Var.b.a ? tje.h(tseVar, null, null, new k62(qr71Var, i581Var, null), 3) : gwk0.a(Collections.singletonList(i581Var)));
            }
            this.b = 1;
            obj = a.b(arrayList, this);
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
        return tcc.o((Iterable) obj);
    }
}
