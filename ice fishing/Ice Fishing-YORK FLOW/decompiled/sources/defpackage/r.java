package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r implements java.lang.Runnable {
    public final /* synthetic */ defpackage.u WDYagTQQm9ns;

    public r(defpackage.u uVar) {
        this.WDYagTQQm9ns = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        defpackage.u uVar = this.WDYagTQQm9ns;
        uVar.removeCallbacks(this);
        android.view.MotionEvent motionEvent = uVar.TlJvUa0ZXCBu;
        if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
            return;
        }
        int i = 7;
        if (actionMasked != 7 && actionMasked != 9) {
            i = 2;
        }
        uVar.IBvW5fLsPuHy(motionEvent, i, uVar.ZEXjjCYihNTt, false);
    }
}
