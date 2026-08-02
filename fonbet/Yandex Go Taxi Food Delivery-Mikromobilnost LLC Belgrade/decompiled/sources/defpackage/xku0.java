package defpackage;

import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.YbWallet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class xku0 {
    public final fga0 a;
    public final drd b;
    public final lz90 c;

    public xku0(fga0 fga0Var, drd drdVar, lz90 lz90Var) {
        this.a = fga0Var;
        this.b = drdVar;
        this.c = lz90Var;
    }

    public final fl8 a(String str) {
        Card g = this.a.g(str);
        if (g != null) {
            return this.c.a(g, true);
        }
        return null;
    }

    public final yy51 b(String str) {
        Object obj;
        Iterator it = this.a.b.g().g.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((YbWallet) obj).getA(), str)) {
                break;
            }
        }
        YbWallet ybWallet = (YbWallet) obj;
        if (ybWallet != null) {
            return this.c.n(ybWallet);
        }
        return null;
    }
}
