package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o5 extends aur implements Function2 {
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pqm m;
    public final /* synthetic */ long n;
    public final /* synthetic */ uoi o;
    public final /* synthetic */ s5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(pqm pqmVar, long j, uoi uoiVar, s5 s5Var, Continuation continuation) {
        super(2, continuation);
        this.m = pqmVar;
        this.n = j;
        this.o = uoiVar;
        this.p = s5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        o5 o5Var = new o5(this.m, this.n, this.o, this.p, continuation);
        o5Var.l = obj;
        return o5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (r15.a(r2, r17) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r15.a(r3, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
    
        if (r3 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rqm rqmVar;
        r2f y;
        Object h;
        boolean z;
        sqm sqmVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        s5 s5Var = this.p;
        uoi uoiVar = this.o;
        if (i == 0) {
            qgg.h0(obj);
            rqmVar = null;
            y = x97.y((mm6) this.l, null, null, new n5(s5Var, this.n, this.o, (Continuation) null, 0), 3);
            this.l = y;
            this.k = 1;
            h = this.m.h(this);
        } else if (i == 1) {
            y = (r2f) this.l;
            qgg.h0(obj);
            rqmVar = null;
            h = obj;
        } else {
            if (i == 2) {
                z = this.j;
                qgg.h0(obj);
                rqmVar = null;
                if (z) {
                    rqm rqmVar2 = new rqm(this.n);
                    sqm sqmVar2 = new sqm(rqmVar2);
                    this.l = sqmVar2;
                    this.k = 3;
                    if (uoiVar.a(rqmVar2, this) != nm6Var) {
                        sqmVar = sqmVar2;
                        this.l = rqmVar;
                        this.k = 4;
                    }
                    return nm6Var;
                }
                s5Var.z = rqmVar;
                return Unit.a;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rqmVar = null;
                s5Var.z = rqmVar;
                return Unit.a;
            }
            sqmVar = (sqm) this.l;
            qgg.h0(obj);
            rqmVar = null;
            this.l = rqmVar;
            this.k = 4;
        }
        boolean booleanValue = ((Boolean) h).booleanValue();
        if (!y.b()) {
            rqm rqmVar3 = s5Var.z;
            if (rqmVar3 != null) {
                tre sqmVar3 = booleanValue ? new sqm(rqmVar3) : new qqm(rqmVar3);
                this.l = rqmVar;
                this.k = 5;
            }
            s5Var.z = rqmVar;
            return Unit.a;
        }
        this.l = rqmVar;
        this.j = booleanValue;
        this.k = 2;
        if (saf.C(y, this) != nm6Var) {
            z = booleanValue;
            if (z) {
            }
            s5Var.z = rqmVar;
            return Unit.a;
        }
        return nm6Var;
    }
}
