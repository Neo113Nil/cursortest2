package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lc implements pw {
    public final /* synthetic */ nc qoPGr6Ce;

    public lc(nc ncVar) {
        this.qoPGr6Ce = ncVar;
    }

    @Override // defpackage.pw
    public final void qoPGr6Ce(Object obj) {
        if (((vo) obj) != null) {
            nc ncVar = this.qoPGr6Ce;
            if (ncVar.Sjrx9cEN) {
                View Xkz7p5xa = ncVar.Xkz7p5xa();
                if (Xkz7p5xa.getParent() != null) {
                    m1.Ey6iv0m0("DialogFragment can not be attached to a container view");
                    return;
                }
                if (ncVar.QT4Tf9Dt != null) {
                    if (ej.ytu5o6f4(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + ncVar.QT4Tf9Dt);
                    }
                    ncVar.QT4Tf9Dt.setContentView(Xkz7p5xa);
                }
            }
        }
    }
}
