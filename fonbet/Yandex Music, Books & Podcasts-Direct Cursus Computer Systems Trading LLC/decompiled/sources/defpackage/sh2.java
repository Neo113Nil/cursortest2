package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sh2 extends aur implements ryc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ e6l l;
    public /* synthetic */ g4q m;

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sh2 sh2Var = new sh2(4, (Continuation) obj4);
        sh2Var.k = (rjc) obj;
        sh2Var.l = (e6l) obj2;
        sh2Var.m = (g4q) obj3;
        return sh2Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r0.emit(r9, r8) == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r0.emit(r9, r8) == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r0.emit(r9, r8) == r3) goto L36;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q7q w;
        rjc rjcVar = this.k;
        e6l e6lVar = this.l;
        g4q g4qVar = this.m;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            if (Intrinsics.d(e6lVar, b6l.a)) {
                Boolean bool = Boolean.FALSE;
                this.k = null;
                this.l = null;
                this.m = null;
                this.j = 1;
            } else if (e6lVar instanceof c6l) {
                if (g4qVar == null || !(((xdr) g4qVar.getState()).getValue() instanceof q7q)) {
                    Boolean bool2 = Boolean.FALSE;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.j = 2;
                }
            } else {
                if (!(e6lVar instanceof d6l)) {
                    b6e.s();
                    return null;
                }
                if (Intrinsics.d((g4qVar == null || (w = pcg.w(g4qVar)) == null) ? null : w.a, ((d6l) e6lVar).a)) {
                    Boolean bool3 = Boolean.TRUE;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.j = 3;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
