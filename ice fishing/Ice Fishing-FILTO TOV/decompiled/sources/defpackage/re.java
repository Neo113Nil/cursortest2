package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class re implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ se OOA6hdeuvCS;

    public re(se seVar) {
        this.OOA6hdeuvCS = seVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.OOA6hdeuvCS.xqGvceK5x(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        se seVar = this.OOA6hdeuvCS;
        seVar.EljAMC1QTz.GWasM1elztuh.clear();
        j6IIN2O8eOU j6iin2o8eou = seVar.AvO7iQsrTN;
        synchronized (j6iin2o8eou) {
            ((rf0) j6iin2o8eou.EljAMC1QTz).X1lG3V04pd();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        se seVar = this.OOA6hdeuvCS;
        seVar.EljAMC1QTz.GWasM1elztuh.clear();
        j6IIN2O8eOU j6iin2o8eou = seVar.AvO7iQsrTN;
        synchronized (j6iin2o8eou) {
            ((rf0) j6iin2o8eou.EljAMC1QTz).X1lG3V04pd();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.OOA6hdeuvCS.mE4lRynR.GWasM1elztuh.setValue(Boolean.valueOf(z));
    }
}
