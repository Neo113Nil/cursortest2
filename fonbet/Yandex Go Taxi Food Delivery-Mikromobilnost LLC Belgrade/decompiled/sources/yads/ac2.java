package yads;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.appset.c;
import com.google.android.gms.tasks.zzw;
import defpackage.dtx0;
import defpackage.dvw;
import defpackage.em91;
import defpackage.ep61;
import defpackage.j18;
import defpackage.ji41;
import defpackage.mc3;
import defpackage.ny61;
import defpackage.qsb1;
import defpackage.rfw0;
import defpackage.tbb1;
import defpackage.udq0;
import defpackage.va90;
import defpackage.wls;
import defpackage.ysx0;
import defpackage.zsx0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class ac2 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ ep61 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac2(ep61 ep61Var, Continuation continuation) {
        super(2, continuation);
        this.c = ep61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ac2(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new ac2(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzw o;
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
        ep61 ep61Var = this.c;
        this.b = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        try {
            rfw0 rfw0Var = new rfw0(ep61Var.a.getApplicationContext());
            tbb1 tbb1Var = (tbb1) rfw0Var.a;
            if (tbb1Var.l.d(tbb1Var.k, 212800000) == 0) {
                ysx0 a = zsx0.a();
                a.c = new Feature[]{em91.a};
                a.a = new c(tbb1Var);
                a.b = false;
                a.d = 27601;
                o = tbb1Var.d(0, a.a());
            } else {
                o = udq0.o(new ApiException(new Status(17)));
            }
            va90 va90Var = new va90(rfw0Var);
            o.getClass();
            qsb1 qsb1Var = dtx0.a;
            zzw zzwVar = (zzw) o.i(qsb1Var, va90Var);
            zzwVar.g(qsb1Var, new ji41(14, new yb2(j18Var)));
            zzwVar.d(new mc3(j18Var, 6));
        } catch (Throwable unused) {
            j18Var.E(null, null);
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
