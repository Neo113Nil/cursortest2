package defpackage;

/* loaded from: classes3.dex */
public final class r85 extends wqe {
    public static final r85 a = new r85();

    @Override // defpackage.wqe
    public final void a(int i, Object obj) {
        ((bxt) obj).i(new c85(i));
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Object d = ((bxt) obj).d();
        d.getClass();
        return Integer.valueOf(((c85) d).a);
    }
}
