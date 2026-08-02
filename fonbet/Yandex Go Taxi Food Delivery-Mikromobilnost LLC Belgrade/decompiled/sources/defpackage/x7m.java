package defpackage;

/* loaded from: classes9.dex */
public final class x7m implements fse {
    public final /* synthetic */ fse a;
    public final Throwable b;

    public x7m(fse fseVar, Throwable th) {
        this.a = fseVar;
        this.b = th;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return this.a.fold(obj, wlsVar);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return this.a.get(eseVar);
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return this.a.minusKey(eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return this.a.plus(fseVar);
    }
}
