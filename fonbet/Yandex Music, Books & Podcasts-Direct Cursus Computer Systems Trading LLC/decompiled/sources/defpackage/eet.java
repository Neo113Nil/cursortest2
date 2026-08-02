package defpackage;

/* loaded from: classes5.dex */
public final class eet implements t9f {
    public static final eet a = new eet();
    public static final ome b;

    static {
        um3.a.getClass();
        b = n7w.s(wm3.a, "kotlin.UByte");
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return new aet(eg7Var.j(b).E());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        byte b2 = ((aet) obj).a;
        l6bVar.getClass();
        l6bVar.i(b).h(b2);
    }
}
