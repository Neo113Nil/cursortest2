package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class t5s extends s5s {
    public final p370 e;
    public final z5s f;

    public t5s(p370 p370Var, z5s z5sVar) {
        this.e = p370Var;
        this.f = z5sVar;
    }

    @Override // defpackage.lhh, defpackage.elb0
    public final void b(mkb0 mkb0Var, okb0 okb0Var) {
        super.b(mkb0Var, okb0Var);
        if (mkb0Var instanceof lkb0) {
            l(okb0Var);
        }
    }

    @Override // defpackage.lhh, defpackage.elb0
    public final void e(ikb0 ikb0Var, okb0 okb0Var) {
        super.e(ikb0Var, okb0Var);
        if (ikb0Var instanceof lkb0) {
            l(okb0Var);
        }
    }

    @Override // defpackage.lhh, defpackage.elb0
    public final void g(String str, okb0 okb0Var) {
        super.g(str, okb0Var);
        l(okb0Var);
    }

    @Override // defpackage.s5s
    public final void i(yzj0 yzj0Var, List list) {
        h(new r5s(yzj0Var), list, false);
    }

    @Override // defpackage.s5s
    public final n1f j(c0k0 c0k0Var) {
        return new n1f(12, this.b, c0k0Var);
    }

    @Override // defpackage.s5s
    public final void k(c0k0 c0k0Var) {
        p370 p370Var = this.e;
        j6s b = ((p6s) p370Var.w).b();
        List n = b == null ? null : p370Var.n(c0k0Var, b);
        if (n == null) {
            return;
        }
        h(new r5s(c0k0Var), n, true);
    }

    public final void l(okb0 okb0Var) {
        Iterable iterable = (Iterable) ((Map) this.b.a.getValue()).getOrDefault(okb0Var, EmptyList.a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof lkb0) {
                arrayList.add(obj);
            }
        }
        if (okb0Var instanceof r5s) {
            this.f.a(((r5s) okb0Var).a, new z41(arrayList));
        }
    }
}
