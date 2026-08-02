package androidx.fragment.app;

import android.view.View;
import defpackage.dzf;
import defpackage.kyf;
import defpackage.uyf;

/* loaded from: classes.dex */
public final class m implements uyf {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        View view;
        if (kyfVar != kyf.ON_STOP || (view = this.a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
