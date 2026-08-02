package defpackage;

import android.content.Context;
import com.yandex.go.modals.progress.api.CircularProgressRouter$Payload;
import com.yandex.go.modals.progress.impl.ui.CircularProgressModalView;

/* loaded from: classes12.dex */
public final class svb extends m230 implements tvb {
    public final Context E;
    public final w030 F;
    public boolean G;
    public CircularProgressModalView H;

    public svb(w030 w030Var, Context context) {
        super(null);
        this.E = context;
        this.F = w030Var;
        this.G = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        this.H = null;
        super.H((CircularProgressRouter$Payload) obj);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final void R(u45 u45Var) {
        this.G = false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        CircularProgressRouter$Payload circularProgressRouter$Payload = (CircularProgressRouter$Payload) obj;
        mh2 mh2Var = kl40.b;
        if (this.G) {
            int i = rvb.a[circularProgressRouter$Payload.a.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    mh2Var = lh2.c;
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    mh2Var = xpb1.w;
                }
            }
        }
        circularProgressRouter$Payload.getClass();
        CircularProgressModalView circularProgressModalView = new CircularProgressModalView(this.E, mh2Var, !circularProgressRouter$Payload.b, false);
        this.G = false;
        this.H = circularProgressModalView;
        return circularProgressModalView;
    }

    public final void T(sls slsVar) {
        CircularProgressModalView circularProgressModalView = this.H;
        if (circularProgressModalView != null) {
            circularProgressModalView.setOnDetachAfterShownAction(slsVar);
        }
        i();
        if (circularProgressModalView == null) {
            slsVar.invoke();
        }
    }
}
