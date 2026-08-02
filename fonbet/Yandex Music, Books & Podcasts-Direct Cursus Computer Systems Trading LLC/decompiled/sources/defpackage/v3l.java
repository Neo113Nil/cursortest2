package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class v3l extends aur implements Function2 {
    public qqi j;
    public x3l k;
    public g4q l;
    public tqn m;
    public g4q n;
    public boolean o;
    public int p;
    public final /* synthetic */ x3l q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ g4q s;
    public final /* synthetic */ tqn t;
    public final /* synthetic */ g4q u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3l(x3l x3lVar, boolean z, g4q g4qVar, tqn tqnVar, g4q g4qVar2, Continuation continuation) {
        super(2, continuation);
        this.q = x3lVar;
        this.r = z;
        this.s = g4qVar;
        this.t = tqnVar;
        this.u = g4qVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new v3l(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v3l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        x3l x3lVar;
        qqi qqiVar;
        g4q g4qVar;
        g4q g4qVar2;
        tqn tqnVar;
        boolean z;
        nm6 nm6Var = nm6.a;
        int i = this.p;
        if (i == 0) {
            qgg.h0(obj);
            x3lVar = this.q;
            qqiVar = x3lVar.h;
            this.j = qqiVar;
            this.k = x3lVar;
            g4qVar = this.s;
            this.l = g4qVar;
            tqn tqnVar2 = this.t;
            this.m = tqnVar2;
            g4qVar2 = this.u;
            this.n = g4qVar2;
            boolean z2 = this.r;
            this.o = z2;
            this.p = 1;
            if (qqiVar.a(this) == nm6Var) {
                return nm6Var;
            }
            tqnVar = tqnVar2;
            z = z2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.o;
            g4qVar2 = this.n;
            tqnVar = this.m;
            g4qVar = this.l;
            x3lVar = this.k;
            qqiVar = this.j;
            qgg.h0(obj);
        }
        try {
            ssg.a(4, x3l.i, "do switch queue: " + g4qVar2 + " -> " + g4qVar, null);
            (z ? x3lVar.c : x3lVar.a).l(g4qVar);
            tqnVar.a = false;
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
    }
}
