package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fgh implements rjc {
    public final /* synthetic */ rjc a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public fgh(rjc rjcVar, boolean z, boolean z2) {
        this.a = rjcVar;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        egh eghVar;
        int i;
        if (continuation instanceof egh) {
            eghVar = (egh) continuation;
            int i2 = eghVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eghVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = eghVar.j;
                nm6 nm6Var = nm6.a;
                i = eghVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    j1g j1gVar = (j1g) obj;
                    cgh cghVar = new cgh(new uwd(j1gVar == j1g.a), j1gVar, this.b, this.c);
                    eghVar.k = 1;
                    if (this.a.emit(cghVar, eghVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        eghVar = new egh(this, continuation);
        Object obj22 = eghVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eghVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }
}
