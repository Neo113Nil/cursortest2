package defpackage;

/* loaded from: classes5.dex */
public final class tkr implements t9f {
    public static final tkr a = new tkr();
    public static final gsm b = new gsm("kotlin.String", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return eg7Var.A();
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        String str = (String) obj;
        l6bVar.getClass();
        str.getClass();
        l6bVar.E(str);
    }
}
