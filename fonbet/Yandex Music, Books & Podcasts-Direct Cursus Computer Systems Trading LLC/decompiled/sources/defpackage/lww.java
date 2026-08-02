package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lww extends lxw {
    public final WeakReference h;

    public lww(nww nwwVar) {
        this.h = new WeakReference(nwwVar);
    }

    @Override // defpackage.lxw
    public final void S0(myw mywVar) {
        nww nwwVar = (nww) this.h.get();
        if (nwwVar == null) {
            return;
        }
        xww xwwVar = nwwVar.a;
        jww jwwVar = new jww(nwwVar, nwwVar, mywVar);
        sww swwVar = xwwVar.k;
        swwVar.sendMessage(swwVar.obtainMessage(1, jwwVar));
    }
}
