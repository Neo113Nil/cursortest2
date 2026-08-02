package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.a;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class ap1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ zp1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap1(a aVar, Context context, zp1 zp1Var, Continuation continuation) {
        super(2, continuation);
        this.c = aVar;
        this.d = context;
        this.e = zp1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ap1(this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ap1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            a aVar = this.c;
            Context context = this.d;
            zp1 zp1Var = this.e;
            this.b = 1;
            AtomicBoolean atomicBoolean = a.g;
            if (aVar.a(context, zp1Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
