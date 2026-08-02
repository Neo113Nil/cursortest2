package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class noa extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ uoi l;
    public final /* synthetic */ aqi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noa(uoi uoiVar, aqi aqiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = uoiVar;
        this.m = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new noa(this.l, this.m, continuation, 0);
            case 1:
                return new noa(this.l, this.m, continuation, 1);
            default:
                return new noa(this.l, this.m, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((noa) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList q = su4.q(obj);
                x0q x0qVar = this.l.a;
                moa moaVar = new moa(q, this.m, 0);
                this.k = 1;
                x0qVar.collect(moaVar, this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList q2 = su4.q(obj);
                x0q x0qVar2 = this.l.a;
                moa moaVar2 = new moa(q2, this.m, 1);
                this.k = 1;
                x0qVar2.collect(moaVar2, this);
                return nm6Var2;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList q3 = su4.q(obj);
                x0q x0qVar3 = this.l.a;
                moa moaVar3 = new moa(q3, this.m, 2);
                this.k = 1;
                x0qVar3.collect(moaVar3, this);
                return nm6Var3;
        }
    }
}
