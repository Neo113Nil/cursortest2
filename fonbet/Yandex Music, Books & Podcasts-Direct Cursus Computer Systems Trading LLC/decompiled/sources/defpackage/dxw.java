package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class dxw extends tmd {
    public final omd b;

    public dxw(omd omdVar) {
        this.b = omdVar;
    }

    @Override // defpackage.tmd
    public final void a() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.tmd
    public final gr2 b(gr2 gr2Var) {
        gr2Var.k();
        omd omdVar = this.b;
        umd umdVar = omdVar.j;
        umdVar.getClass();
        pxw pxwVar = new pxw(new zxw(gr2Var), umdVar.i.get(), omdVar);
        fsn fsnVar = umdVar.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(4, pxwVar));
        return gr2Var;
    }

    @Override // defpackage.tmd
    public final Looper c() {
        return this.b.f;
    }
}
