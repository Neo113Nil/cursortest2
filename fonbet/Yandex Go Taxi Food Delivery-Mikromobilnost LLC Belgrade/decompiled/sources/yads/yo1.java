package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.a;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class yo1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ yo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(a aVar, Context context, yo yoVar, Continuation continuation) {
        super(2, continuation);
        this.c = aVar;
        this.d = context;
        this.e = yoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new yo1(this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((yo1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r7 == r8) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
        if (a.h.getAndSet(false)) {
            aVar.b.getClass();
            ArrayList arrayList = yoVar.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ycc.r(((z9) it.next()).c, arrayList2);
            }
            obj2 = jl40.O(new bp1(aVar.e.a(arrayList2), aVar, context, null), this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj2 != coroutineSingletons2) {
                obj2 = zy11Var;
            }
        }
        obj2 = zy11Var;
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
