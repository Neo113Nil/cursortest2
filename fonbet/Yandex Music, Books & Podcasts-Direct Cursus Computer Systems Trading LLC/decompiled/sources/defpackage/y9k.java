package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y9k implements b66 {
    public final yjo a;
    public final String b;
    public final ezc c;
    public final jyr d = btf.b(new d1j(9, this));

    /* JADX WARN: Multi-variable type inference failed */
    public y9k(yjo yjoVar, String str, Function2 function2) {
        this.a = yjoVar;
        this.b = str;
        this.c = (ezc) function2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        jyr jyrVar = this.d;
        if (jyrVar.isInitialized()) {
            ((xjo) jyrVar.getValue()).close();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ezc, kotlin.jvm.functions.Function2] */
    @Override // defpackage.b66
    public final Object d0(boolean z, Function2 function2, cg6 cg6Var) {
        x9k x9kVar = (x9k) cg6Var.getContext().get(x9k.b);
        w9k w9kVar = x9kVar != null ? x9kVar.a : null;
        if (w9kVar != null) {
            return function2.invoke(w9kVar, cg6Var);
        }
        w9k w9kVar2 = new w9k(this.c, (xjo) this.d.getValue());
        return x97.V(new x9k(w9kVar2), new h1j(function2, w9kVar2, (Continuation) null), cg6Var);
    }
}
