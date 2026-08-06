package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cp extends vc0 {
    public final /* synthetic */ dp cilMamHF;

    public cp(dp dpVar) {
        this.cilMamHF = dpVar;
    }

    @Override // defpackage.vc0
    public final void M3K9sHhK(Throwable th) {
        this.cilMamHF.GWasM1elztuh.xqGvceK5x(th);
    }

    @Override // defpackage.vc0
    public final void k8h8IjolWQ(rx0 rx0Var) {
        dp dpVar = this.cilMamHF;
        dpVar.X1lG3V04pd = rx0Var;
        rx0 rx0Var2 = dpVar.X1lG3V04pd;
        gp gpVar = dpVar.GWasM1elztuh;
        dpVar.Yi7zF1RB1 = new f4(rx0Var2, gpVar.AvO7iQsrTN, gpVar.mOu10nynGul, Build.VERSION.SDK_INT >= 34 ? np.GWasM1elztuh() : rj0.WdrkLMV3xh());
        gp gpVar2 = dpVar.GWasM1elztuh;
        ArrayList arrayList = new ArrayList();
        gpVar2.GWasM1elztuh.writeLock().lock();
        try {
            gpVar2.X1lG3V04pd = 1;
            arrayList.addAll(gpVar2.Yi7zF1RB1);
            gpVar2.Yi7zF1RB1.clear();
            gpVar2.GWasM1elztuh.writeLock().unlock();
            gpVar2.xqGvceK5x.post(new ep(arrayList, gpVar2.X1lG3V04pd, null));
        } catch (Throwable th) {
            gpVar2.GWasM1elztuh.writeLock().unlock();
            throw th;
        }
    }
}
