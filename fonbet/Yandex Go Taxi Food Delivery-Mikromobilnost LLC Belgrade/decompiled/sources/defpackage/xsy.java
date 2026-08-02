package defpackage;

/* loaded from: classes3.dex */
public final class xsy extends zij {
    public static final xsy a = new xsy();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        return ((obj instanceof uty) && (obj2 instanceof uty)) ? jl40.l(((uty) obj).a, ((uty) obj2).a) : obj.equals(obj2);
    }

    @Override // defpackage.zij
    public final Object c(Object obj, Object obj2) {
        return zy11.a;
    }
}
