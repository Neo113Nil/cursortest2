package defpackage;

import com.yandex.go.payments.data.model.response.YbWallet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class zy51 {
    public final fga0 a;

    public zy51(fga0 fga0Var) {
        this.a = fga0Var;
    }

    public final YbWallet a(String str) {
        Object obj;
        Iterator it = this.a.b.g().g.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((YbWallet) obj).e(), str)) {
                break;
            }
        }
        return (YbWallet) obj;
    }
}
