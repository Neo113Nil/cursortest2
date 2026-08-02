package defpackage;

/* loaded from: classes5.dex */
public final class wm3 implements t9f {
    public static final wm3 a = new wm3();
    public static final gsm b = new gsm("kotlin.Byte", csm.c);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Byte.valueOf(eg7Var.E());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        l6bVar.getClass();
        l6bVar.h(byteValue);
    }
}
