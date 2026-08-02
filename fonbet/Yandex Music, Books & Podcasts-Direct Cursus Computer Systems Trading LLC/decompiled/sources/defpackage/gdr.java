package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class gdr extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ int l;
    public final /* synthetic */ hdr m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdr(hdr hdrVar, Continuation continuation) {
        super(3, continuation);
        this.m = hdrVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        gdr gdrVar = new gdr(this.m, (Continuation) obj3);
        gdrVar.k = (rjc) obj;
        gdrVar.l = intValue;
        return gdrVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r0.emit(r12, r11) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (defpackage.y2x.o(r1, r11) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0.emit(r12, r11) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r12.emit(r0, r11) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar;
        hdr hdrVar = this.m;
        long j = hdrVar.b;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar2 = this.k;
            if (this.l > 0) {
                kbq kbqVar = kbq.a;
                this.j = 1;
            } else {
                long j2 = hdrVar.a;
                this.k = rjcVar2;
                this.j = 2;
                if (y2x.o(j2, this) != nm6Var) {
                    rjcVar = rjcVar2;
                    if (j > 0) {
                    }
                    kbq kbqVar2 = kbq.c;
                    this.k = null;
                    this.j = 5;
                }
            }
            return nm6Var;
        }
        if (i != 1) {
            if (i == 2) {
                rjcVar = this.k;
                qgg.h0(obj);
                if (j > 0) {
                    kbq kbqVar3 = kbq.b;
                    this.k = rjcVar;
                    this.j = 3;
                }
                kbq kbqVar22 = kbq.c;
                this.k = null;
                this.j = 5;
            } else if (i == 3) {
                rjcVar = this.k;
                qgg.h0(obj);
                this.k = rjcVar;
                this.j = 4;
            } else if (i == 4) {
                rjcVar = this.k;
                qgg.h0(obj);
                kbq kbqVar222 = kbq.c;
                this.k = null;
                this.j = 5;
            } else if (i != 5) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        qgg.h0(obj);
        return Unit.a;
    }
}
