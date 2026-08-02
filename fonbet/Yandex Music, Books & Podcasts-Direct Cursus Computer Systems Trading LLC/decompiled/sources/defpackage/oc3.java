package defpackage;

/* loaded from: classes5.dex */
public final class oc3 implements t9f {
    public static final oc3 a = new oc3();
    public static final gsm b = new gsm("kotlin.Boolean", csm.b);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Boolean.valueOf(eg7Var.t());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        l6bVar.getClass();
        l6bVar.x(booleanValue);
    }
}
