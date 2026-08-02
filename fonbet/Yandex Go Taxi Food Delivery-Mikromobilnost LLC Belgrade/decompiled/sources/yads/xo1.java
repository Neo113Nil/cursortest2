package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.a;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class xo1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ yo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo1(a aVar, Context context, yo yoVar, Continuation continuation) {
        super(2, continuation);
        this.c = aVar;
        this.d = context;
        this.e = yoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xo1(this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((xo1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r0 == r2) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List<mr1> list;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.c;
        Context context = this.d;
        yo yoVar = this.e;
        this.b = 1;
        AtomicBoolean atomicBoolean = a.g;
        aVar.getClass();
        if (a.g.getAndSet(false)) {
            aVar.b.getClass();
            qr1 qr1Var = yoVar.c;
            if (qr1Var == null || (list2 = qr1Var.c) == null) {
                list = EmptyList.a;
            } else {
                list = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ycc.r(((hr1) it.next()).c, list);
                }
            }
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (mr1 mr1Var : list) {
                aVar.c.getClass();
                arrayList.add(new zp1(mr1Var.b, mr1Var.c, null, null, null, null, null, null));
            }
            obj2 = jl40.O(new bp1(aVar.e.a(arrayList), aVar, context, null), this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj2 != coroutineSingletons2) {
                obj2 = zy11Var;
            }
        }
        obj2 = zy11Var;
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
