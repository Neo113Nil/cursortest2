package defpackage;

/* loaded from: classes5.dex */
public final class cqe implements t9f {
    public static final cqe a = new cqe();
    public static final gsm b = new gsm("kotlin.Int", csm.g);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Integer.valueOf(eg7Var.h());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        int intValue = ((Number) obj).intValue();
        l6bVar.getClass();
        l6bVar.C(intValue);
    }
}
