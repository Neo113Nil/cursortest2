package defpackage;

import com.yandex.plus.pay.internal.feature.payment.inapp.google.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class slc implements rjc {
    public final /* synthetic */ g a;
    public final /* synthetic */ rjc b;

    public slc(g gVar, rjc rjcVar) {
        this.a = gVar;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        rlc rlcVar;
        Object obj2;
        int i;
        slc slcVar;
        if (continuation instanceof rlc) {
            rlcVar = (rlc) continuation;
            int i2 = rlcVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rlcVar.l = i2 - Integer.MIN_VALUE;
                obj2 = rlcVar.k;
                nm6 nm6Var = nm6.a;
                i = rlcVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    rlcVar.j = this;
                    rlcVar.l = 1;
                    obj2 = this.a.invoke(this.b, obj, rlcVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    slcVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slcVar = rlcVar.j;
                    qgg.h0(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    throw new p2(slcVar);
                }
                return Unit.a;
            }
        }
        rlcVar = new rlc(this, continuation);
        obj2 = rlcVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rlcVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
