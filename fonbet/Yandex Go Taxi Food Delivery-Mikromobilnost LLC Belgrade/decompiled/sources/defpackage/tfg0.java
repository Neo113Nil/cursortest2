package defpackage;

/* loaded from: classes3.dex */
public final class tfg0 extends zij {
    public static final tfg0 a = new tfg0();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        if ((obj instanceof p0v0) && (obj2 instanceof p0v0)) {
            return jl40.l(((p0v0) obj).a, ((p0v0) obj2).a);
        }
        if ((obj instanceof llq0) && (obj2 instanceof llq0)) {
            return true;
        }
        return obj.equals(obj2);
    }
}
