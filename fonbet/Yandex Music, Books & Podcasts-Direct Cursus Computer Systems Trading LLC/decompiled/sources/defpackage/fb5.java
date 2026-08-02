package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fb5 extends aur implements Function2 {
    public long j;
    public long k;
    public int l;
    public final /* synthetic */ gb5 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb5(gb5 gb5Var, long j, Continuation continuation) {
        super(2, continuation);
        this.m = gb5Var;
        this.n = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new fb5(this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fb5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (defpackage.y2x.o(r5 - r7, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (defpackage.y2x.o(40, r11) == r0) goto L19;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long a;
        long j;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        gb5 gb5Var = this.m;
        if (i == 0) {
            qgg.h0(obj);
            aeu aeuVar = (aeu) men.t(gb5Var, es5.s);
            aeuVar.getClass();
            a = aeuVar.a();
            j = 40;
            this.j = 40L;
            this.k = a;
            this.l = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                gb5Var.v.invoke();
                return Unit.a;
            }
            a = this.k;
            j = this.j;
            qgg.h0(obj);
        }
        db5 db5Var = (db5) gb5Var.X.e(this.n);
        if (db5Var != null) {
            db5Var.b = true;
        }
        this.l = 2;
    }
}
