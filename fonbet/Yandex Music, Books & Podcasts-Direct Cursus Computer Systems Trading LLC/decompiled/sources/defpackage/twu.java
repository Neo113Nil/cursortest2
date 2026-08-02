package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class twu extends pwu {
    public final List d;
    public final pfn e;
    public final kxi f;
    public final Function0 g;
    public final qwu h;
    public final jyr i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twu(mm6 mm6Var, kxi kxiVar, k6l k6lVar, pfn pfnVar, nwu nwuVar, qwu qwuVar, uwu uwuVar, List list, Function0 function0, Function1 function1) {
        super(k6lVar, nwuVar, function1);
        list.getClass();
        kxiVar.getClass();
        function0.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        qwuVar.getClass();
        mm6Var.getClass();
        this.d = list;
        this.e = pfnVar;
        this.f = kxiVar;
        this.g = function0;
        this.h = qwuVar;
        this.i = btf.b(new ftr(10, uwuVar, this, mm6Var));
    }

    @Override // defpackage.owu
    public final vdr c() {
        return (vdr) this.i.getValue();
    }

    @Override // defpackage.pwu
    public final void e(String str) {
        str.getClass();
        this.h.a(o8g.E(this.d), this.f, (x5l) this.g.invoke(), this.e);
    }
}
