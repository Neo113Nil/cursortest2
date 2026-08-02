package defpackage;

/* loaded from: classes5.dex */
public final class ie4 implements t9f {
    public static final ie4 a = new ie4();
    public static final gsm b = new gsm("kotlin.Char", csm.d);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Character.valueOf(eg7Var.u());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        char charValue = ((Character) obj).charValue();
        l6bVar.getClass();
        l6bVar.z(charValue);
    }
}
