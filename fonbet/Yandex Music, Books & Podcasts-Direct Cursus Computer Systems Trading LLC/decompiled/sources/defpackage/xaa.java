package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class xaa {
    public static final String c = "Downloading:".concat("DownloadLimitControl");
    public final AtomicReference a;
    public final xdr b;

    public xaa() {
        gld.e(dm6.b);
        this.a = new AtomicReference(null);
        this.b = ydr.a(nhr.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ohr ohrVar, cg6 cg6Var) {
        waa waaVar;
        int i;
        qhr qhrVar;
        if (cg6Var instanceof waa) {
            waaVar = (waa) cg6Var;
            int i2 = waaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                waaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = waaVar.j;
                nm6 nm6Var = nm6.a;
                i = waaVar.l;
                xdr xdrVar = this.b;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    Long l = (Long) this.a.get();
                    if (l == null) {
                        xdrVar.getClass();
                        xdrVar.m(null, nhr.a);
                        return Boolean.FALSE;
                    }
                    mn7 mn7Var = dm6.b;
                    n71 n71Var = new n71(this, l, ohrVar, continuation, 9);
                    waaVar.l = 1;
                    obj = x97.V(mn7Var, n71Var, waaVar);
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
                qhrVar = (qhr) obj;
                xdrVar.l(qhrVar);
                if (qhrVar instanceof mhr) {
                    return Boolean.FALSE;
                }
                mhr mhrVar = (mhr) qhrVar;
                long j = mhrVar.b;
                long j2 = mhrVar.a;
                StringBuilder l2 = tlm.l(j, "Storage limit exceeded: available=", ", limit=");
                l2.append(j2);
                ssg.a(3, c, l2.toString(), null);
                return Boolean.TRUE;
            }
        }
        waaVar = new waa(this, cg6Var);
        Object obj2 = waaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = waaVar.l;
        xdr xdrVar2 = this.b;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        qhrVar = (qhr) obj2;
        xdrVar2.l(qhrVar);
        if (qhrVar instanceof mhr) {
        }
    }
}
