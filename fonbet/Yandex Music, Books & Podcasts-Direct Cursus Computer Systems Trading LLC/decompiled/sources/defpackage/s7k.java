package defpackage;

import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes5.dex */
public final class s7k implements t9f {
    public final u76 a;

    public s7k() {
        u76 u76Var = new u76();
        u76Var.b = new q7k();
        u76Var.a = new ConcurrentLinkedDeque();
        this.a = u76Var;
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        throw new IllegalStateException("ParsingContext is fake serializer");
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        throw new IllegalStateException("ParsingContext is fake serializer");
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        throw new IllegalStateException("ParsingContext is fake serializer");
    }
}
