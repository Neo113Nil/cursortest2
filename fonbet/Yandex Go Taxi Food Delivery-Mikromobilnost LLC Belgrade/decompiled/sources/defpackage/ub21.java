package defpackage;

/* loaded from: classes2.dex */
public final class ub21 extends zij {
    public static final ub21 a = new ub21();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return ((tb21) obj).equals((tb21) obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        return ((tb21) obj).a.hashCode() == ((tb21) obj2).a.hashCode();
    }
}
