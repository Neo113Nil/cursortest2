package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class bdc {
    public final ddc a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public bdc(ddc ddcVar) {
        this.a = ddcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(bdc bdcVar, String str, cg6 cg6Var) {
        adc adcVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof adc) {
            adcVar = (adc) cg6Var;
            int i2 = adcVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adcVar.l = i2 - Integer.MIN_VALUE;
                Object obj = adcVar.j;
                nm6 nm6Var = nm6.a;
                i = adcVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ddc ddcVar = bdcVar.a;
                    adcVar.l = 1;
                    obj = x97.V(dm6.b, new fzb(ddcVar, str, continuation, 5), adcVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return (String) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        adcVar = new adc(bdcVar, cg6Var);
        Object obj2 = adcVar.j;
        nm6 nm6Var2 = nm6.a;
        i = adcVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
