package defpackage;

/* loaded from: classes3.dex */
public final class hre extends wqe {
    public static final hre a = new hre();

    @Override // defpackage.wqe
    public final void a(int i, Object obj) {
        ((ext) obj).i(Long.valueOf(i));
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Object d = ((ext) obj).d();
        d.getClass();
        return Integer.valueOf((int) ((Long) d).longValue());
    }
}
