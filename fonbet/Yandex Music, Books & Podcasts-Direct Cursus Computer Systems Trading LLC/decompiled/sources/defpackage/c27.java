package defpackage;

import android.os.CountDownTimer;
import java.util.Date;

/* loaded from: classes4.dex */
public final class c27 extends bfu {
    public final dn9 k;
    public final g0c l;
    public final o6c m;
    public final sdk n;
    public kpo s;
    public mfk t;
    public CountDownTimer y;
    public final voi o = new voi();
    public final qc9 p = new qc9(new v07(1, this));
    public boolean q = true;
    public final x0q r = y0q.b(1, 1, null, 4);
    public final voi u = new voi();
    public final voi v = new voi(v17.b);
    public final efo w = new efo(20, this);
    public final ix6 x = new ix6(22, this);

    public c27(dn9 dn9Var, g0c g0cVar, o6c o6cVar, sdk sdkVar) {
        this.k = dn9Var;
        this.l = g0cVar;
        this.m = o6cVar;
        this.n = sdkVar;
    }

    public final String G() {
        kpo kpoVar = this.s;
        String str = kpoVar != null ? kpoVar.c : null;
        return str == null ? "" : str;
    }

    public final void H(Long l) {
        Long valueOf = l != null ? Long.valueOf(l.longValue() - (new Date().getTime() / 1000)) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        if (longValue <= 0) {
            this.v.m(v17.c);
            return;
        }
        long j = (longValue + 1) * 1000;
        CountDownTimer countDownTimer = this.y;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.y = new b27(j, this, 0).start();
    }

    public final void J(String str) {
        jpo jpoVar;
        qne Z0 = gut.Z0(G());
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(Z0);
        kpo kpoVar = this.s;
        if (kpoVar == null || (jpoVar = kpoVar.a) == null) {
            return;
        }
        w03 w03Var = ((tdk) this.n).h;
        mfk mfkVar = this.t;
        String str2 = mfkVar != null ? mfkVar.a : null;
        if (str2 == null) {
            str2 = "";
        }
        w03Var.f(str2, G(), str, jpoVar, this.w);
    }
}
