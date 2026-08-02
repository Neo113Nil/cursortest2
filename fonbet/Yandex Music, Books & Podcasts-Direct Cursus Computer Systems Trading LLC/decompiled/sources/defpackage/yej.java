package defpackage;

/* loaded from: classes5.dex */
public final class yej implements t9f {
    public static final yej a = new yej();
    public static final xej b = xej.a;

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        throw new zhp("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        ((Void) obj).getClass();
        throw new zhp("'kotlin.Nothing' cannot be serialized");
    }
}
