package defpackage;

/* loaded from: classes3.dex */
public final class x8h implements rzh {
    public rzh[] a;

    @Override // defpackage.rzh
    public final djn a(Class cls) {
        for (rzh rzhVar : this.a) {
            if (rzhVar.b(cls)) {
                return rzhVar.a(cls);
            }
        }
        qq6.d("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.rzh
    public final boolean b(Class cls) {
        for (rzh rzhVar : this.a) {
            if (rzhVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
