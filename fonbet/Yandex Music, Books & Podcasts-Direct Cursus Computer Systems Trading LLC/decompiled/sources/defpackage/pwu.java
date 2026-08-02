package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class pwu implements owu {
    public final nwu a;
    public final Function1 b;
    public final boolean c;

    public pwu(k6l k6lVar, nwu nwuVar, Function1 function1) {
        k6lVar.getClass();
        this.a = nwuVar;
        this.b = function1;
        this.c = ((Boolean) k6lVar.a().invoke()).booleanValue();
    }

    @Override // defpackage.owu
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.owu
    public final void b(qmu qmuVar) {
        qmuVar.getClass();
        if (qmuVar == qmu.b) {
            return;
        }
        String t = weo.t();
        nwu nwuVar = this.a;
        if (nwuVar != null) {
            nwuVar.O(qmuVar.a());
        }
        e(t);
        Function1 function1 = this.b;
        if (function1 != null) {
            function1.invoke(t);
        }
    }

    @Override // defpackage.owu
    public final void d() {
        nwu nwuVar = this.a;
        if (nwuVar != null) {
            nwuVar.d();
        }
    }

    public abstract void e(String str);
}
