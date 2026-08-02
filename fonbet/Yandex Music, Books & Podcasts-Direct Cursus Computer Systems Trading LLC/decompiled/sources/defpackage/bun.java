package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class bun extends aur implements Function1 {
    public int j;
    public final /* synthetic */ fk0 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bun(fk0 fk0Var, long j, long j2, Continuation continuation) {
        super(1, continuation);
        this.k = fk0Var;
        this.l = j;
        this.m = j2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new bun(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((bun) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (defpackage.fk0.c(r9.k, r6, r7, null, r9, 12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (defpackage.fk0.c(r11.k, r6, r7, null, r9, 12) == r0) goto L15;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bun bunVar;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            d85 d85Var = new d85(this.l);
            act S = weo.S(0, 0, nya.d, 3);
            this.j = 1;
            bunVar = this;
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
            bunVar = this;
        }
        d85 d85Var2 = new d85(bunVar.m);
        act S2 = weo.S(0, 300, nya.d, 1);
        bunVar.j = 2;
    }
}
