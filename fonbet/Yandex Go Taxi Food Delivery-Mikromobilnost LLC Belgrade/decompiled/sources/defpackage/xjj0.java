package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class xjj0 {
    public final wiq0 a;

    public xjj0(wiq0 wiq0Var) {
        this.a = wiq0Var;
    }

    public final String a(String str) {
        pex0 m = ((k) this.a).m();
        if (m == null) {
            return "";
        }
        qze0 qze0Var = m.m;
        String str2 = (String) (qze0Var != null ? qze0Var.k : new tpj0(b.f())).a.get(str);
        return str2 == null ? "" : str2;
    }
}
