package defpackage;

/* loaded from: classes5.dex */
public final class n5f implements t9f {
    public static final n5f a = new n5f();
    public static final ohp b = avf.y("kotlinx.serialization.json.JsonNull", thp.b, new mhp[0]);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        ltg.r(eg7Var);
        if (eg7Var.C()) {
            throw new u4f("Expected 'null' literal");
        }
        eg7Var.i();
        return m5f.INSTANCE;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        ((m5f) obj).getClass();
        ltg.s(l6bVar);
        l6bVar.u();
    }
}
