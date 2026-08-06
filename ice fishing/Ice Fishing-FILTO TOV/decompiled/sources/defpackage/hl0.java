package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hl0 {
    public final Runnable GWasM1elztuh;
    public final m71 Yi7zF1RB1 = new m71(new o1(8, this));

    public hl0(Runnable runnable) {
        this.GWasM1elztuh = runnable;
    }

    public final rx0 GWasM1elztuh() {
        return ((fl0) this.Yi7zF1RB1.getValue()).X1lG3V04pd;
    }

    public final void Yi7zF1RB1(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        GWasM1elztuh().OOA6hdeuvCS(new yk0(onBackInvokedDispatcher, 0), 1);
        GWasM1elztuh().OOA6hdeuvCS(new yk0(onBackInvokedDispatcher, 1000000), 0);
    }
}
