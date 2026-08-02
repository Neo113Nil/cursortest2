package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class gzj implements ViewTreeObserver.OnPreDrawListener {
    public final oqj a;
    public final kqa b;

    public gzj(oqj oqjVar, kqa kqaVar) {
        this.a = oqjVar;
        this.b = kqaVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        oqj oqjVar = this.a;
        boolean onPreDraw = oqjVar.onPreDraw();
        ceg cegVar = (ceg) this.b;
        if (onPreDraw) {
            cegVar.b = 0;
            return true;
        }
        int i = cegVar.b;
        if (i < 3) {
            cegVar.b = i + 1;
            cegVar.u(oqjVar);
            return false;
        }
        if (i == 3) {
            cegVar.b = i + 1;
            cegVar.t(oqjVar);
        }
        return true;
    }
}
