package defpackage;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class ebu implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ gbu b;

    public ebu(gbu gbuVar, DisplayManager displayManager) {
        this.b = gbuVar;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            gbu.a(this.b, this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
