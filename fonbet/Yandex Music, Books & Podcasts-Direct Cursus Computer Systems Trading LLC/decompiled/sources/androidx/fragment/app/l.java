package androidx.fragment.app;

import android.view.View;
import defpackage.eta;
import defpackage.ltc;
import defpackage.xq0;

/* loaded from: classes.dex */
public final class l extends ltc {
    public final /* synthetic */ o a;

    public l(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.ltc
    public final View b(int i) {
        o oVar = this.a;
        View view = oVar.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        xq0.q(eta.f("Fragment ", oVar, " does not have a view"));
        return null;
    }

    @Override // defpackage.ltc
    public final boolean c() {
        return this.a.mView != null;
    }
}
