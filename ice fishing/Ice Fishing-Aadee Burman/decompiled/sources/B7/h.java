package B7;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public abstract class h extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public h(int i, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // B7.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.f38718a.getClass();
        String a9 = t.a(this);
        kotlin.jvm.internal.h.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
