package defpackage;

/* loaded from: classes3.dex */
public final class ws3 extends zij {
    public static final ws3 a = new ws3();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        return ((obj instanceof ks3) && (obj2 instanceof ks3)) ? jl40.l(((ks3) obj).a, ((ks3) obj2).a) : obj.equals(obj2);
    }

    @Override // defpackage.zij
    public final Object c(Object obj, Object obj2) {
        return zy11.a;
    }
}
