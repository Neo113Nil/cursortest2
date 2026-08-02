package defpackage;

/* loaded from: classes5.dex */
public final class yet implements t9f {
    public static final yet a = new yet();
    public static final ome b;

    static {
        ldq.a.getClass();
        b = n7w.s(mdq.a, "kotlin.UShort");
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return new uet(eg7Var.j(b).o());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        short s = ((uet) obj).a;
        l6bVar.getClass();
        l6bVar.i(b).w(s);
    }
}
