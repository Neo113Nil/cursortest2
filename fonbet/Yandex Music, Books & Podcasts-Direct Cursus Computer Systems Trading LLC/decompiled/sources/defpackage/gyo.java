package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gyo extends aur implements Function2 {
    public iyo j;
    public wqn k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ iyo o;
    public final /* synthetic */ wqn p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyo(iyo iyoVar, wqn wqnVar, long j, Continuation continuation) {
        super(2, continuation);
        this.o = iyoVar;
        this.p = wqnVar;
        this.q = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        gyo gyoVar = new gyo(this.o, this.p, this.q, continuation);
        gyoVar.n = obj;
        return gyoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gyo) create((hyo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        iyo iyoVar;
        wqn wqnVar;
        long j;
        iyo iyoVar2;
        nm6 nm6Var = nm6.a;
        int i = this.m;
        if (i == 0) {
            qgg.h0(obj);
            hyo hyoVar = (hyo) this.n;
            iyoVar = this.o;
            n90 n90Var = new n90(1, iyoVar, hyoVar);
            jic jicVar = iyoVar.c;
            wqnVar = this.p;
            long j2 = wqnVar.a;
            bxj bxjVar = iyoVar.d;
            bxj bxjVar2 = bxj.b;
            long j3 = this.q;
            float c = iyoVar.c(bxjVar == bxjVar2 ? yzt.b(j3) : yzt.c(j3));
            this.n = iyoVar;
            this.j = iyoVar;
            this.k = wqnVar;
            this.l = j2;
            this.m = 1;
            obj = jicVar.a(n90Var, c, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            j = j2;
            iyoVar2 = iyoVar;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.l;
            wqnVar = this.k;
            iyoVar = this.j;
            iyoVar2 = (iyo) this.n;
            qgg.h0(obj);
        }
        float c2 = iyoVar2.c(((Number) obj).floatValue());
        wqnVar.a = iyoVar.d == bxj.b ? yzt.a(c2, 0.0f, 2, j) : yzt.a(0.0f, c2, 1, j);
        return Unit.a;
    }
}
