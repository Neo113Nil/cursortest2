package defpackage;

/* loaded from: classes5.dex */
public final class ret implements t9f {
    public static final ret a = new ret();
    public static final ome b;

    static {
        tug.a.getClass();
        b = n7w.s(mvg.a, "kotlin.ULong");
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return new net(eg7Var.j(b).l());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        long j = ((net) obj).a;
        l6bVar.getClass();
        l6bVar.i(b).r(j);
    }
}
