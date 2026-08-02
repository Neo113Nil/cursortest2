package defpackage;

import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.HashMap;
import ru.yandex.taxi.preorder.extraphone.e;

/* loaded from: classes5.dex */
public final class w4p {
    public final d800 a;
    public final e b;
    public final jdj c;
    public final rv70 d;
    public final u1n e;

    public w4p(d800 d800Var, e eVar, jdj jdjVar, rv70 rv70Var, u1n u1nVar) {
        this.a = d800Var;
        this.b = eVar;
        this.c = jdjVar;
        this.d = rv70Var;
        this.e = u1nVar;
    }

    public final void a() {
        ExtraContactPhonesRules extraContactPhonesRules;
        pex0 m = ((k) this.b.a).m();
        if (m == null || (extraContactPhonesRules = m.W) == null) {
            extraContactPhonesRules = ExtraContactPhonesRules.f;
        }
        this.a.a(new tfb0(extraContactPhonesRules.e.a, null, null, null, false, null, null, 262142), this.c, new kv8(6, this), this.d);
        b1 b1Var = (b1) this.e.c;
        b1Var.getClass();
        b1Var.a.a("ExtraPhoneContact.Shown", new HashMap(), 1, new HashMap());
    }
}
