package defpackage;

/* loaded from: classes5.dex */
public final class zic implements t9f {
    public static final zic a = new zic();
    public static final gsm b = new gsm("kotlin.Float", csm.f);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Float.valueOf(eg7Var.p());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        l6bVar.getClass();
        l6bVar.y(floatValue);
    }
}
