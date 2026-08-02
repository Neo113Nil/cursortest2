package defpackage;

/* loaded from: classes5.dex */
public final class let implements t9f {
    public static final let a = new let();
    public static final ome b;

    static {
        ope.a.getClass();
        b = n7w.s(cqe.a, "kotlin.UInt");
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return new het(eg7Var.j(b).h());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        int i = ((het) obj).a;
        l6bVar.getClass();
        l6bVar.i(b).C(i);
    }
}
