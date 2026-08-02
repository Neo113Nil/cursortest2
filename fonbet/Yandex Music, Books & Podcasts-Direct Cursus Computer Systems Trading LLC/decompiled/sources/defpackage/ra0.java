package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ra0 extends aur implements ryc {
    public int j;
    public /* synthetic */ ca0 k;
    public /* synthetic */ ml7 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ja0 n;
    public final /* synthetic */ tm0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra0(ja0 ja0Var, tm0 tm0Var, Continuation continuation) {
        super(4, continuation);
        this.n = ja0Var;
        this.o = tm0Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ra0 ra0Var = new ra0(this.n, this.o, (Continuation) obj4);
        ra0Var.k = (ca0) obj;
        ra0Var.l = (ml7) obj2;
        ra0Var.m = obj3;
        return ra0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ca0 ca0Var = this.k;
        ml7 ml7Var = this.l;
        Object obj2 = this.m;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            ja0 ja0Var = this.n;
            float e = ja0Var.k.e();
            this.k = null;
            this.l = null;
            this.m = null;
            this.j = 1;
            if (a.c(ja0Var, e, ca0Var, ml7Var, obj2, this.o, this) == nm6Var) {
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
