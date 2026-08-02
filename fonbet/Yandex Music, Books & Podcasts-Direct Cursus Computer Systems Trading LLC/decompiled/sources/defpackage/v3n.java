package defpackage;

import com.connectsdk.service.DeviceService;
import defpackage.hmm;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v3n implements s3n {
    public final y60 a;
    public final mm6 b;
    public final fkn c;
    public final hmm.a d;
    public final hmm.a e;
    public final hmm.a f;
    public final hmm.a g;

    public v3n(cc7 cc7Var, uz1 uz1Var, y60 y60Var) {
        wb7 wb7Var;
        tf6 e = gld.e(dm6.a());
        this.a = y60Var;
        this.b = e;
        fkn fknVar = uz1Var.d;
        ail ailVar = new ail(12, fknVar, cc7Var);
        v02 v02Var = (v02) fknVar.a.getValue();
        if (v02Var != null) {
            wb7Var = ((dc7) cc7Var).c(String.valueOf(v02Var.a), "purchase_communication_funnel_tracker");
        } else {
            wb7Var = null;
        }
        this.c = zsd.F0(ailVar, e, lbq.a, wb7Var);
        this.d = new hmm.a("session_id");
        this.e = new hmm.a("step");
        this.f = new hmm.a("payment_result_step");
        this.g = new hmm.a("payment_result_failure_description");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q3n a(v3n v3nVar, hmm hmmVar) {
        String str;
        Object obj;
        String str2 = (String) hmmVar.a(v3nVar.d);
        w3n w3nVar = null;
        if (str2 != null && (str = (String) hmmVar.a(v3nVar.e)) != null) {
            r3n.e.getClass();
            Iterator it = r3n.q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((r3n) obj).a, str)) {
                    break;
                }
            }
            r3n r3nVar = (r3n) obj;
            if (r3nVar != null) {
                String str3 = (String) hmmVar.a(v3nVar.f);
                if (str3 != null) {
                    w3n.c.getClass();
                    Iterator it2 = w3n.h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((w3n) next).a.equals(str3)) {
                            w3nVar = next;
                            break;
                        }
                    }
                    w3nVar = w3nVar;
                }
                return new q3n(str2, r3nVar, w3nVar, (String) hmmVar.a(v3nVar.g));
            }
        }
        return null;
    }

    public static final void b(v3n v3nVar, lpi lpiVar, q3n q3nVar) {
        lpiVar.g(v3nVar.d, q3nVar.a);
        lpiVar.g(v3nVar.e, q3nVar.b.a);
        w3n w3nVar = q3nVar.c;
        hmm.a aVar = v3nVar.f;
        if (w3nVar == null) {
            lpiVar.f(aVar);
        } else {
            lpiVar.g(aVar, w3nVar.a);
        }
        String str = q3nVar.d;
        if (str != null) {
            lpiVar.g(v3nVar.g, str);
        }
    }

    public static void c(v3n v3nVar, r3n r3nVar) {
        Continuation continuation = null;
        x97.y(v3nVar.b, null, null, new c5l(v3nVar, r3nVar, continuation, continuation, 18), 3);
    }

    public final void d(String str, r3n r3nVar, r3n r3nVar2, String str2) {
        arf g = tlm.g(bwf.c);
        ((Map) g.getValue()).put("session_id", str);
        ((Map) g.getValue()).put("step", r3nVar.a);
        if (r3nVar2 != null) {
            ((Map) g.getValue()).put("prev_step", r3nVar2.a);
        }
        if (str2 != null) {
            ((Map) g.getValue()).put(DeviceService.KEY_DESC, str2);
        }
        tlm.o(this.a, "purchase_communication_funnel_tracker", g.isInitialized() ? (Map) g.getValue() : null);
    }
}
