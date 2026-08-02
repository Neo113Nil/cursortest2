package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class pgg extends aur implements Function2 {
    public mu7 j;
    public Object k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ aur q;
    public final /* synthetic */ aur r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pgg(long j, Function2 function2, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.o = j;
        this.p = function2;
        this.q = (aur) function1;
        this.r = (aur) function12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        pgg pggVar = new pgg(this.o, this.p, this.q, this.r, continuation);
        pggVar.n = obj;
        return pggVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pgg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(4:12|13|14|15))(1:21))(3:29|(1:31)|17)|22|23|24|(2:26|15)|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (r13 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        r0 = r13;
        r5 = r8;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long a;
        mu7 mu7Var;
        Object obj2;
        long j;
        mm6 mm6Var = (mm6) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.m;
        Function2 function2 = this.p;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            ou7 p = x97.p(mm6Var, null, null, new x77(this.q, null, 1), 3);
            gis.a.getClass();
            rdi.a.getClass();
            a = rdi.a();
            this.n = null;
            this.j = p;
            this.k = null;
            this.l = a;
            this.m = 1;
            Object invoke = this.r.invoke(this);
            if (invoke != nm6Var) {
                mu7Var = p;
                obj = invoke;
            }
            return nm6Var;
        }
        if (i == 1) {
            a = this.l;
            mu7 mu7Var2 = this.j;
            qgg.h0(obj);
            mu7Var = mu7Var2;
        } else {
            if (i != 2) {
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.k;
                qgg.h0(obj);
                function2.invoke(obj2, obj);
                return Unit.a;
            }
            j = this.l;
            obj2 = this.k;
            mu7Var = this.j;
            try {
                qgg.h0(obj);
            } catch (wis unused) {
                function2.invoke(obj2, null);
                this.n = null;
                this.j = null;
                this.k = obj2;
                this.l = j;
                this.m = 3;
                obj = mu7Var.H(this);
            }
            this.n = null;
            this.j = null;
            this.k = obj2;
            this.l = j;
            this.m = 3;
            obj = mu7Var.H(this);
        }
        kis kisVar = new kis(obj, fis.b(a), null);
        Object obj3 = kisVar.a;
        long j2 = kisVar.b;
        long n = nsa.n(this.o, j2);
        jmd jmdVar = new jmd(mu7Var, continuation, 18);
        this.n = null;
        this.j = mu7Var;
        this.k = obj3;
        this.l = j2;
        this.m = 2;
        if (tyf.K(n, jmdVar, this) != nm6Var) {
            obj2 = obj3;
            j = j2;
            this.n = null;
            this.j = null;
            this.k = obj2;
            this.l = j;
            this.m = 3;
            obj = mu7Var.H(this);
        }
        return nm6Var;
    }
}
