package defpackage;

import androidx.room.coroutines.f;

/* loaded from: classes10.dex */
public final class u4e implements dse {
    public final ese a;
    public final f b;

    public u4e(ese eseVar, f fVar) {
        this.a = eseVar;
        this.b = fVar;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return this.a;
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }
}
