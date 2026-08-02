package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class t8u extends aur implements Function2 {
    public int j;
    public final /* synthetic */ fvf k;
    public final /* synthetic */ float l;
    public final /* synthetic */ uqn m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8u(fvf fvfVar, float f, uqn uqnVar, float f2, Continuation continuation) {
        super(2, continuation);
        this.k = fvfVar;
        this.l = f;
        this.m = uqnVar;
        this.n = f2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new t8u(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t8u) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (defpackage.neg.B(r2, r9, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        fvf fvfVar = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            Object a = fvfVar.a(hqi.a, new db(2, 14, null), this);
            if (a != nm6Var) {
                a = Unit.a;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        float f = this.l * (-1);
        uqn uqnVar = this.m;
        float c = (1 - yhn.c(Math.abs(uqnVar.a / this.n), 0.0f, 1.0f)) * f;
        uqnVar.a += c;
        this.j = 2;
    }
}
