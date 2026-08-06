package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class eu extends defpackage.ma0 {
    public final /* synthetic */ defpackage.fu Hx18F4M3RgD4;

    public eu(defpackage.fu fuVar) {
        this.Hx18F4M3RgD4 = fuVar;
    }

    @Override // defpackage.ma0
    public final void OcTWLQzke1i2(java.lang.Throwable th) {
        this.Hx18F4M3RgD4.ZpBGe2uQfcn8.oh71FJcDz6S2(th);
    }

    @Override // defpackage.ma0
    public final void blKFvluuDQOf(defpackage.s81 s81Var) {
        defpackage.fu fuVar = this.Hx18F4M3RgD4;
        fuVar.fWTAfUmVKrZq = s81Var;
        defpackage.s81 s81Var2 = fuVar.fWTAfUmVKrZq;
        defpackage.ju juVar = fuVar.ZpBGe2uQfcn8;
        fuVar.giKS3J6vZuNy = new defpackage.a7(s81Var2, juVar.QiMR8OkAhezm, juVar.e6mdH7fiFuta, android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.ou.ZpBGe2uQfcn8() : defpackage.ok0.qjMheFZ0l9kA());
        defpackage.ju juVar2 = fuVar.ZpBGe2uQfcn8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        juVar2.ZpBGe2uQfcn8.writeLock().lock();
        try {
            juVar2.fWTAfUmVKrZq = 1;
            arrayList.addAll(juVar2.giKS3J6vZuNy);
            juVar2.giKS3J6vZuNy.clear();
            juVar2.ZpBGe2uQfcn8.writeLock().unlock();
            juVar2.JhCgjQRTAOCT.post(new defpackage.wc(arrayList, juVar2.fWTAfUmVKrZq, null));
        } catch (java.lang.Throwable th) {
            juVar2.ZpBGe2uQfcn8.writeLock().unlock();
            throw th;
        }
    }
}
