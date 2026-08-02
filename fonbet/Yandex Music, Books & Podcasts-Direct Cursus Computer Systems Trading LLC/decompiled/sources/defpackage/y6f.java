package defpackage;

/* loaded from: classes5.dex */
public final class y6f implements t9f {
    public static final y6f a = new y6f();
    public static final ohp b = avf.y("kotlinx.serialization.json.JsonPrimitive", csm.j, new mhp[0]);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        w4f f = ltg.r(eg7Var).f();
        if (f instanceof v6f) {
            return (v6f) f;
        }
        throw ghh.j("Unexpected JSON element, expected JsonPrimitive, had " + ern.a(f.getClass()), f.toString(), -1);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v6f v6fVar = (v6f) obj;
        l6bVar.getClass();
        v6fVar.getClass();
        ltg.s(l6bVar);
        if (v6fVar instanceof m5f) {
            l6bVar.v(n5f.a, m5f.INSTANCE);
        } else {
            l6bVar.v(k5f.a, (j5f) v6fVar);
        }
    }
}
