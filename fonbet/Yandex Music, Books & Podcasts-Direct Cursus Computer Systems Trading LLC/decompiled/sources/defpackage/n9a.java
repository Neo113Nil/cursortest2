package defpackage;

/* loaded from: classes5.dex */
public final class n9a implements t9f {
    public static final n9a a = new n9a();
    public static final gsm b = new gsm("kotlin.Double", csm.e);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Double.valueOf(eg7Var.r());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        l6bVar.getClass();
        l6bVar.f(doubleValue);
    }
}
