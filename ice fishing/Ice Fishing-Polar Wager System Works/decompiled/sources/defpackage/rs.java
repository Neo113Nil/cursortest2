package defpackage;

/* loaded from: classes.dex */
public final class rs extends defpackage.s21 {
    public final /* synthetic */ defpackage.ss DFo87pBq1E5;

    public rs(defpackage.ss ssVar) {
        this.DFo87pBq1E5 = ssVar;
    }

    @Override // defpackage.s21
    public final void XZx205DYe(defpackage.y yVar) {
        defpackage.ss ssVar = this.DFo87pBq1E5;
        ssVar.r1MBDhnF = yVar;
        defpackage.y yVar2 = ssVar.r1MBDhnF;
        defpackage.ws wsVar = ssVar.IHQe1A4L2xu;
        ssVar.oh6vYeIP = new defpackage.v5(yVar2, wsVar.AARZUJiTa, wsVar.riuEU0zW4, android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.ct.IHQe1A4L2xu() : defpackage.mj1.v5iciZok());
        defpackage.ws wsVar2 = ssVar.IHQe1A4L2xu;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        wsVar2.IHQe1A4L2xu.writeLock().lock();
        try {
            wsVar2.r1MBDhnF = 1;
            arrayList.addAll(wsVar2.oh6vYeIP);
            wsVar2.oh6vYeIP.clear();
            wsVar2.IHQe1A4L2xu.writeLock().unlock();
            wsVar2.F7NU4MC0GW.post(new defpackage.us(arrayList, wsVar2.r1MBDhnF, null));
        } catch (java.lang.Throwable th) {
            wsVar2.IHQe1A4L2xu.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.s21
    public final void wll2JLbTBC2(java.lang.Throwable th) {
        this.DFo87pBq1E5.IHQe1A4L2xu.F7NU4MC0GW(th);
    }
}
