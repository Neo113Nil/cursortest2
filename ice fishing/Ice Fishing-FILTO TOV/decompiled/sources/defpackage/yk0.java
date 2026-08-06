package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yk0 extends zi0 {
    public boolean EljAMC1QTz;
    public final OnBackInvokedCallback OOA6hdeuvCS;
    public final OnBackInvokedDispatcher X1lG3V04pd;
    public final int xqGvceK5x;

    public yk0(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.X1lG3V04pd = onBackInvokedDispatcher;
        this.xqGvceK5x = i;
        this.OOA6hdeuvCS = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: zk0
            public final void onBackInvoked() {
                yk0.this.GWasM1elztuh();
            }
        } : new al0(this);
    }

    @Override // defpackage.zi0
    public final void Yi7zF1RB1(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.OOA6hdeuvCS;
        if (z && !this.EljAMC1QTz) {
            this.X1lG3V04pd.registerOnBackInvokedCallback(this.xqGvceK5x, onBackInvokedCallback);
            this.EljAMC1QTz = true;
        } else {
            if (z || !this.EljAMC1QTz) {
                return;
            }
            this.X1lG3V04pd.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.EljAMC1QTz = false;
        }
    }
}
