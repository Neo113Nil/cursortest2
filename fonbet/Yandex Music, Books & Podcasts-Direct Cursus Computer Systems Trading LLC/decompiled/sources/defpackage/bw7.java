package defpackage;

import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class bw7 implements Window.OnFrameMetricsAvailableListener {
    public final ArrayList a;
    public boolean b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public bw7(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        View decorView;
        synchronized (this) {
            try {
                this.b = true;
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i);
                }
                if (!this.c.isEmpty()) {
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        this.a.add((Window.OnFrameMetricsAvailableListener) it2.next());
                    }
                    this.c.clear();
                }
                if (!this.d.isEmpty()) {
                    boolean isEmpty = this.a.isEmpty();
                    Iterator it3 = this.d.iterator();
                    while (it3.hasNext()) {
                        this.a.remove((Window.OnFrameMetricsAvailableListener) it3.next());
                    }
                    this.d.clear();
                    if (!isEmpty && this.a.isEmpty()) {
                        if (window != null) {
                            window.removeOnFrameMetricsAvailableListener(this);
                        }
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setTag(R.id.metricsDelegator, null);
                        }
                    }
                }
                this.b = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.getClass();
            ViewParent parent = decorView2.getParent();
            while (parent instanceof View) {
                decorView2 = parent;
                parent = decorView2.getParent();
            }
            Object tag = decorView2.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new mkk();
                decorView2.setTag(R.id.metricsStateHolder, tag);
            }
            xdh xdhVar = ((mkk) tag).a;
            if (xdhVar != null) {
                synchronized (((ArrayList) xdhVar.b)) {
                    try {
                        int size = ((ArrayList) xdhVar.b).size() - 1;
                        if (-1 < size) {
                            if (((ArrayList) xdhVar.b).get(size) != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
