package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.a;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class bp1 extends SuspendLambda implements wls {
    public /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp1(ArrayList arrayList, a aVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.c = arrayList;
        this.d = aVar;
        this.e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        bp1 bp1Var = new bp1(this.c, this.d, this.e, continuation);
        bp1Var.b = obj;
        return bp1Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        bp1 bp1Var = (bp1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bp1Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        tse tseVar = (tse) this.b;
        ArrayList arrayList = this.c;
        a aVar = this.d;
        Context context = this.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tje.N(tseVar, null, null, new ap1(aVar, context, (zp1) it.next(), null), 3);
        }
        return zy11.a;
    }
}
