package defpackage;

import android.util.Log;
import com.kolosta.rejin.jilosa.presentation.ui.SauceBenchFragment;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class mj implements ok {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno = 1;
    public final /* synthetic */ Object wxUZMvaN;

    public /* synthetic */ mj(ut utVar, au auVar, nj njVar, li liVar) {
        this.MdtA4re8 = auVar;
        this.wxUZMvaN = liVar;
    }

    @Override // defpackage.ok
    public final Object qoPGr6Ce() {
        switch (this.NCTxEWno) {
            case 0:
                au auVar = (au) this.MdtA4re8;
                li liVar = (li) this.wxUZMvaN;
                for (ut utVar : (Iterable) auVar.P7K7Inc8.NCTxEWno.Qr9iLBAD()) {
                    if (nj.ygLcUYwZ()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + utVar + " due to fragment " + liVar + " viewmodel being cleared");
                    }
                    auVar.MdtA4re8(utVar);
                }
                return xe0.qoPGr6Ce;
            case 1:
                au auVar2 = (au) this.MdtA4re8;
                ut utVar2 = (ut) this.wxUZMvaN;
                synchronized (auVar2.qoPGr6Ce) {
                    try {
                        x90 x90Var = auVar2.NCTxEWno;
                        Iterable iterable = (Iterable) x90Var.Qr9iLBAD();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (fn.qoPGr6Ce((ut) obj, utVar2)) {
                                x90Var.eVhOlqcC(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        x90Var.eVhOlqcC(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return xe0.qoPGr6Ce;
            default:
                ((SauceBenchFragment) this.MdtA4re8).N8VPGzVC((kb0) this.wxUZMvaN);
                return xe0.qoPGr6Ce;
        }
    }

    public /* synthetic */ mj(au auVar, ut utVar, boolean z) {
        this.MdtA4re8 = auVar;
        this.wxUZMvaN = utVar;
    }

    public /* synthetic */ mj(SauceBenchFragment sauceBenchFragment, kb0 kb0Var) {
        this.MdtA4re8 = sauceBenchFragment;
        this.wxUZMvaN = kb0Var;
    }
}
