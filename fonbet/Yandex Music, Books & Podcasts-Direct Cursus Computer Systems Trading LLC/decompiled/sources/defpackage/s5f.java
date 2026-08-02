package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class s5f implements t9f {
    public static final s5f a = new s5f();
    public static final r5f b = r5f.b;

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        ltg.r(eg7Var);
        ff7.N(ekr.a);
        return new q5f((Map) ff7.o(tkr.a, z4f.a).deserialize(eg7Var));
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q5f q5fVar = (q5f) obj;
        l6bVar.getClass();
        q5fVar.getClass();
        ltg.s(l6bVar);
        ff7.N(ekr.a);
        ff7.o(tkr.a, z4f.a).serialize(l6bVar, q5fVar);
    }
}
