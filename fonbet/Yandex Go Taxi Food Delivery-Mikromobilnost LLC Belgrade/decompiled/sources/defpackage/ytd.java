package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ytd implements jc70, dse {
    public static final kl40 b = new kl40(19);
    public final bts a;

    public ytd(bts btsVar) {
        this.a = btsVar;
    }

    @Override // defpackage.jc70
    public final boolean b() {
        return this.a.C;
    }

    @Override // defpackage.jc70
    public final List e(Integer num) {
        return this.a.J();
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final /* bridge */ dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return b;
    }

    @Override // defpackage.fse
    public final /* bridge */ fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }
}
