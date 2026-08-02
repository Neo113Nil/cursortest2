package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class haw extends aur implements Function2 {
    public int j;
    public final /* synthetic */ iaw k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haw(iaw iawVar, boolean z, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.k = iawVar;
        this.l = z;
        this.m = j;
        this.n = j2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new haw(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((haw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        iaw iawVar = this.k;
        if (i == 0) {
            qgg.h0(obj);
            gm5 gm5Var = iawVar.v;
            this.j = 1;
            obj = gm5Var.s(this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        oxs oxsVar = this.l ? ((fts) obj).e : null;
        ncl nclVar = iawVar.m;
        if (nclVar != null) {
            nclVar.q0(oxsVar, this.m, this.n);
        }
        return Unit.a;
    }
}
