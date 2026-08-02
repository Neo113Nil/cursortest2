package defpackage;

/* loaded from: classes3.dex */
public final class qi01 extends zij {
    public static final qi01 a = new qi01();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        ary aryVar;
        if (!(obj instanceof bry) || !(obj2 instanceof bry)) {
            return obj.equals(obj2);
        }
        ary aryVar2 = ((bry) obj).a;
        return (aryVar2 == null || (aryVar = ((bry) obj2).a) == null) ? jl40.l(aryVar2, ((bry) obj2).a) : jl40.l(aryVar2.a.getPartnerId(), aryVar.a.getPartnerId());
    }

    @Override // defpackage.zij
    public final Object c(Object obj, Object obj2) {
        return zy11.a;
    }
}
