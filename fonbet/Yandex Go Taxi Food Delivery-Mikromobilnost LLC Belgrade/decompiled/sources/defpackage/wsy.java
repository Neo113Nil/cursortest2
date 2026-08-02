package defpackage;

/* loaded from: classes3.dex */
public final class wsy extends zij {
    public static final wsy a = new wsy();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        if (!(obj instanceof bj01) || !(obj2 instanceof bj01)) {
            return obj.equals(obj2);
        }
        ury uryVar = ((bj01) obj).a;
        if (uryVar instanceof wi01) {
            ury uryVar2 = ((bj01) obj2).a;
            if (uryVar2 instanceof wi01) {
                return jl40.l(((wi01) uryVar).a.getAction(), ((wi01) uryVar2).a.getAction());
            }
        }
        return jl40.l(uryVar, ((bj01) obj2).a);
    }

    @Override // defpackage.zij
    public final Object c(Object obj, Object obj2) {
        return zy11.a;
    }
}
