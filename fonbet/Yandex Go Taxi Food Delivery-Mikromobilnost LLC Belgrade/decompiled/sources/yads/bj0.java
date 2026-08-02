package yads;

import com.yandex.go.places.complaint.impl.ui.ComplaintNotification;
import defpackage.e471;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.wls;
import defpackage.yma1;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* loaded from: classes7.dex */
public final class bj0 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ e471 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(e471 e471Var, Continuation continuation) {
        super(2, continuation);
        this.c = e471Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new bj0(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new bj0(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        e471 e471Var = this.c;
        AtomicBoolean atomicBoolean = e471.e;
        e471Var.getClass();
        ListBuilder a = rcc.a();
        String a2 = yma1.a(e471Var.c.a(e471Var.b));
        if (a2 != null) {
            a.add(a2);
        }
        ListBuilder j = a.j();
        if (!j.isEmpty()) {
            e471 e471Var2 = this.c;
            this.b = 1;
            e471Var2.getClass();
            Object u = a.u(ComplaintNotification.DURATION, new dj0(j, e471Var2, null), this);
            if (u != coroutineSingletons) {
                u = zy11Var;
            }
            if (u == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
