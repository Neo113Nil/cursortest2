package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ug5 implements lk5 {
    public final xdr a;
    public final fkn b;

    public ug5() {
        xdr a = ydr.a(sg5.a);
        this.a = a;
        this.b = new fkn(a);
    }

    public final void a(Function1 function1) {
        xdr xdrVar;
        Object value;
        do {
            xdrVar = this.a;
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, function1.invoke(value)));
    }
}
