package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class qmj extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ umj m;
    public rjc n;
    public x66 o;
    public umj p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmj(Continuation continuation, umj umjVar) {
        super(3, continuation);
        this.m = umjVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qmj qmjVar = new qmj((Continuation) obj3, this.m);
        qmjVar.k = (rjc) obj;
        qmjVar.l = obj2;
        return qmjVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        if (defpackage.zsd.e0(r8, r10, r9) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r10 == r0) goto L27;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar;
        x66 x66Var;
        umj umjVar;
        pjc pjcVar;
        boolean z;
        int i;
        nm6 nm6Var = nm6.a;
        int i2 = this.j;
        boolean z2 = false;
        if (i2 == 0) {
            qgg.h0(obj);
            rjcVar = this.k;
            Pair pair = (Pair) this.l;
            x66Var = (x66) pair.a;
            ?? booleanValue = ((Boolean) pair.b).booleanValue();
            if (x66Var.a) {
                pjcVar = z4b.a;
                this.k = null;
                this.l = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.j = 2;
            } else {
                jyr jyrVar = dvu.e;
                boolean d = kwl.d();
                umjVar = this.m;
                z = booleanValue;
                if (d) {
                    c72 c72Var = (c72) umjVar.l.getValue();
                    this.k = null;
                    this.l = null;
                    this.n = rjcVar;
                    this.o = x66Var;
                    this.p = umjVar;
                    this.q = booleanValue;
                    this.j = 1;
                    obj = ((z22) c72Var).b(this);
                    i = booleanValue;
                }
                umjVar.getClass();
                pjcVar = new fs(15, umj.J(z, x66Var, z2));
                this.k = null;
                this.l = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.j = 2;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.q;
            umjVar = this.p;
            x66Var = this.o;
            rjcVar = this.n;
            qgg.h0(obj);
            i = i3;
        }
        boolean z3 = i != 0;
        z = z3;
        if (!((Boolean) obj).booleanValue()) {
            z2 = true;
            z = z3;
        }
        umjVar.getClass();
        pjcVar = new fs(15, umj.J(z, x66Var, z2));
        this.k = null;
        this.l = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.j = 2;
    }
}
