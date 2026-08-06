package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ c OOA6hdeuvCS;

    public a(c cVar) {
        this.OOA6hdeuvCS = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        c cVar = this.OOA6hdeuvCS;
        cVar.removeCallbacks(this);
        MotionEvent motionEvent = cVar.cTIXpaxc;
        if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
            return;
        }
        int i = 7;
        if (actionMasked != 7 && actionMasked != 9) {
            i = 2;
        }
        cVar.eUH21U3apd(motionEvent, i, cVar.bCsSzSHkbaQ, false);
    }
}
