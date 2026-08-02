package yads;

import defpackage.nm81;
import defpackage.to71;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class k72 extends SuspendLambda implements wls {
    public final /* synthetic */ to71 b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ nm81 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k72(to71 to71Var, CountDownLatch countDownLatch, ArrayList arrayList, nm81 nm81Var, Continuation continuation) {
        super(2, continuation);
        this.b = to71Var;
        this.c = countDownLatch;
        this.d = arrayList;
        this.e = nm81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k72(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((k72) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JSONArray jSONArray;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        to71 to71Var = this.b;
        CountDownLatch countDownLatch = this.c;
        ArrayList arrayList = this.d;
        nm81 nm81Var = this.e;
        to71Var.getClass();
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            nm81Var.a.set(true);
            synchronized (to71Var.b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
