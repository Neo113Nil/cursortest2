package defpackage;

/* loaded from: classes5.dex */
public final class mdq implements t9f {
    public static final mdq a = new mdq();
    public static final gsm b = new gsm("kotlin.Short", csm.i);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Short.valueOf(eg7Var.o());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        l6bVar.getClass();
        l6bVar.w(shortValue);
    }
}
