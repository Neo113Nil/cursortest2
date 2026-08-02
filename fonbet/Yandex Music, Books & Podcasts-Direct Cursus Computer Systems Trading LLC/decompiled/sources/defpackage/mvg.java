package defpackage;

/* loaded from: classes5.dex */
public final class mvg implements t9f {
    public static final mvg a = new mvg();
    public static final gsm b = new gsm("kotlin.Long", csm.h);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return Long.valueOf(eg7Var.l());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        long longValue = ((Number) obj).longValue();
        l6bVar.getClass();
        l6bVar.r(longValue);
    }
}
