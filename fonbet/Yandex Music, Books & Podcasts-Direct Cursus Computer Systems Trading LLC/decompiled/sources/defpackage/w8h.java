package defpackage;

/* loaded from: classes3.dex */
public final class w8h implements qzh {
    public qzh[] a;

    @Override // defpackage.qzh
    public final cjn a(Class cls) {
        for (qzh qzhVar : this.a) {
            if (qzhVar.b(cls)) {
                return qzhVar.a(cls);
            }
        }
        qq6.d("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.qzh
    public final boolean b(Class cls) {
        for (qzh qzhVar : this.a) {
            if (qzhVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
