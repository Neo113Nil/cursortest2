package defpackage;

/* loaded from: classes.dex */
public final class y8h implements szh {
    public szh[] a;

    @Override // defpackage.szh
    public final ejn a(Class cls) {
        for (szh szhVar : this.a) {
            if (szhVar.b(cls)) {
                return szhVar.a(cls);
            }
        }
        qq6.d("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.szh
    public final boolean b(Class cls) {
        for (szh szhVar : this.a) {
            if (szhVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
