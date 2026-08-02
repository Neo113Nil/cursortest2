package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class nap extends aur implements Function2 {
    public long j;
    public int k;
    public final /* synthetic */ uol l;
    public final /* synthetic */ vx6 m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nap(uol uolVar, vx6 vx6Var, float f, Continuation continuation) {
        super(2, continuation);
        this.l = uolVar;
        this.m = vx6Var;
        this.n = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new nap(this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nap) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0033, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        long j;
        boolean z;
        q7q w;
        n7q n7qVar;
        mwk b;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        float f = this.n;
        Long l = null;
        Object[] objArr = 0;
        uol uolVar = this.l;
        if (i == 0) {
            qgg.h0(obj);
            this.k = 1;
            obj = uolVar.a(this);
        } else if (i == 1) {
            qgg.h0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
            j = this.j;
            qgg.h0(obj);
            if (((Boolean) obj).booleanValue()) {
                longValue = j;
                l = new Long((long) (longValue * f));
                j = longValue;
                if (l == null) {
                }
            } else {
                g4q g4qVar = (g4q) ((g4l) this.m.c).c.getValue();
                if (((g4qVar == null || (w = pcg.w(g4qVar)) == null || (n7qVar = w.a) == null || (b = n7qVar.b()) == null) ? null : b.a()) != null) {
                    l = new Long((long) (r13.e * f));
                }
                if (l == null) {
                    z = false;
                    return Boolean.valueOf(z);
                }
                long longValue2 = l.longValue();
                this.j = j;
                this.k = 3;
                obj = c9g.p(uolVar, longValue2, this);
            }
        }
        longValue = ((Number) obj).longValue();
        if (longValue == 0) {
            this.j = longValue;
            this.k = 2;
            obj = x97.V(dm6.b(), new d7i((cr) uolVar.a.a, objArr == true ? 1 : 0, 20), this);
            if (obj != nm6Var) {
                j = longValue;
                if (((Boolean) obj).booleanValue()) {
                }
            }
            return nm6Var;
        }
        l = new Long((long) (longValue * f));
        j = longValue;
        if (l == null) {
        }
    }
}
