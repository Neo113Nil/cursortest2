package androidx.metrics.performance;

import android.os.Handler;
import android.view.FrameMetrics;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class DelegatingFrameMetricsListener implements Window.OnFrameMetricsAvailableListener {
    public static Handler frameMetricsHandler;
    public final ArrayList delegates;

    public DelegatingFrameMetricsListener(ArrayList arrayList) {
        this.delegates = arrayList;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        synchronized (this) {
            Iterator it = this.delegates.iterator();
            while (it.hasNext()) {
                ((Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i);
            }
        }
    }
}
