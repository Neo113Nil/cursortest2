package defpackage;

import com.yandex.go.loyalty.impl.common.data.c;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class qyw {
    public final c a;

    public qyw(c cVar) {
        this.a = cVar;
    }

    public final boolean a(lea0 lea0Var) {
        Object obj;
        if ((lea0Var instanceof fl8) || (lea0Var instanceof bjm0) || (lea0Var instanceof a000) || (lea0Var instanceof ep51) || (lea0Var instanceof um50) || (lea0Var instanceof p1c) || (lea0Var instanceof vbn) || (lea0Var instanceof mcp) || (lea0Var instanceof d111)) {
            return true;
        }
        if (lea0Var instanceof wxc) {
            wxc wxcVar = (wxc) lea0Var;
            Iterator it = this.a.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((evz) obj).getId(), wxcVar.a)) {
                    break;
                }
            }
            evz evzVar = (evz) obj;
            if (evzVar instanceof tz5) {
                return true;
            }
            if ((evzVar instanceof t5d0) || evzVar == null) {
                return false;
            }
            w511.b();
            return false;
        }
        if ((lea0Var instanceof u19) || (lea0Var instanceof t19) || (lea0Var instanceof jve) || (lea0Var instanceof yhi) || (lea0Var instanceof ivt) || (lea0Var instanceof v7x) || (lea0Var instanceof qgx) || (lea0Var instanceof h8b0) || (lea0Var instanceof cfm0) || (lea0Var instanceof snr0) || (lea0Var instanceof h211) || (lea0Var instanceof jo51) || (lea0Var instanceof yy51)) {
            return false;
        }
        w511.b();
        return false;
    }
}
