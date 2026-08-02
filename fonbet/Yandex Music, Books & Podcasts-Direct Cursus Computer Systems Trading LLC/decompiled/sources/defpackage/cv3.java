package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class cv3 extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dv3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv3(dv3 dv3Var, Continuation continuation) {
        super(2, continuation);
        this.l = dv3Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        cv3 cv3Var = new cv3(this.l, continuation);
        cv3Var.k = obj;
        return cv3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cv3) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ltm ltmVar = (ltm) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            dv3 dv3Var = this.l;
            bv3 bv3Var = new bv3(dv3Var, ltmVar);
            IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
            int i2 = Build.VERSION.SDK_INT;
            Context context = dv3Var.a;
            if (i2 >= 33) {
                context.registerReceiver(bv3Var, intentFilter, 2);
            } else {
                etn.c0(context, bv3Var, intentFilter);
            }
            x97.y(ltmVar, dm6.b, null, new qi(dv3Var, ltmVar, (Continuation) null, 17), 2);
            ap1 ap1Var = new ap1(14, dv3Var, bv3Var);
            this.k = null;
            this.j = 1;
            if (y7g.q(ltmVar, ap1Var, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
