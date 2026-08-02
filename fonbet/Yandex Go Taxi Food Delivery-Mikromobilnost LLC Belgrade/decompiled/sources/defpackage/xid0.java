package defpackage;

import com.yandex.go.payments.plus.domain.c;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class xid0 implements ffa0 {
    public final c a;
    public final k29 b;
    public final String c;

    public xid0(c cVar, k29 k29Var, String str) {
        this.a = cVar;
        this.b = k29Var;
        this.c = str;
    }

    @Override // defpackage.ffa0
    public final void a(iba0 iba0Var, a4m a4mVar, ak80 ak80Var) {
        i29 i29Var = (i29) this.b.a.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        i29Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        i29Var.a.a("CashbackCard.SelectCreditCard", hashMap, 1, new HashMap());
        ak80Var.invoke();
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        if (lea0Var instanceof fl8) {
            this.a.c.a.l(vez0.d0(lea0Var));
        } else {
            jst.e.q("Unexpected option type: " + lea0Var);
        }
    }
}
