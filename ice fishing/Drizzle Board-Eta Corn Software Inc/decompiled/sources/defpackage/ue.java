package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ue extends ra {
    public final /* synthetic */ ve FySoLYna;

    public ue(ve veVar) {
        this.FySoLYna = veVar;
    }

    @Override // defpackage.ra
    public final void DK9slbsy(VZZbw3BB vZZbw3BB) {
        ve veVar = this.FySoLYna;
        veVar.MdtA4re8 = vZZbw3BB;
        VZZbw3BB vZZbw3BB2 = veVar.MdtA4re8;
        ze zeVar = veVar.qoPGr6Ce;
        veVar.NCTxEWno = new f0(vZZbw3BB2, zeVar.b2ZJblxo, zeVar.jb9XjC4I, Build.VERSION.SDK_INT >= 34 ? ef.qoPGr6Ce() : fn.sjUBp5pO());
        ze zeVar2 = veVar.qoPGr6Ce;
        ArrayList arrayList = new ArrayList();
        zeVar2.qoPGr6Ce.writeLock().lock();
        try {
            zeVar2.MdtA4re8 = 1;
            arrayList.addAll(zeVar2.NCTxEWno);
            zeVar2.NCTxEWno.clear();
            zeVar2.qoPGr6Ce.writeLock().unlock();
            zeVar2.wxUZMvaN.post(new g3(arrayList, zeVar2.MdtA4re8, (Throwable) null));
        } catch (Throwable th) {
            zeVar2.qoPGr6Ce.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.ra
    public final void WYNAV5pd(Throwable th) {
        this.FySoLYna.qoPGr6Ce.wxUZMvaN(th);
    }
}
