package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class y1f {
    public static long k = -1;
    public static Handler l;
    public final WeakReference a;
    public final Choreographer b;
    public final mkk c;
    public final ArrayList d;
    public final Window e;
    public long f;
    public long g;
    public long h;
    public final lvc i;
    public final x1f j;

    /* JADX WARN: Type inference failed for: r4v4, types: [x1f] */
    public y1f(final w1f w1fVar, View view, Window window) {
        window.getClass();
        this.a = new WeakReference(view);
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.getClass();
        this.b = choreographer;
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new mkk();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        this.c = (mkk) tag;
        this.d = new ArrayList();
        this.e = window;
        this.i = new lvc(this.d);
        this.j = new Window.OnFrameMetricsAvailableListener() { // from class: x1f
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                frameMetrics.getClass();
                y1f y1fVar = y1f.this;
                long max = Math.max(y1fVar.c(frameMetrics), y1fVar.h);
                if (max < y1fVar.g || max == y1fVar.f) {
                    return;
                }
                float a = y1fVar.a(frameMetrics);
                w1f w1fVar2 = w1fVar;
                lvc b = y1fVar.b(max, (long) (a * w1fVar2.a), frameMetrics);
                b.getClass();
                nmc nmcVar = (nmc) ((lum) ((h5n) w1fVar2.b).b).b;
                nmcVar.b++;
                if (b.d) {
                    nmcVar.c++;
                }
                nmcVar.a = Math.max(nmcVar.a, b.c);
                y1fVar.f = max;
            }
        };
    }

    public static bw7 d(Window window) {
        bw7 bw7Var = (bw7) window.getDecorView().getTag(R.id.metricsDelegator);
        if (bw7Var != null) {
            return bw7Var;
        }
        bw7 bw7Var2 = new bw7(new ArrayList());
        if (l == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            l = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(bw7Var2, l);
        window.getDecorView().setTag(R.id.metricsDelegator, bw7Var2);
        return bw7Var2;
    }

    public static void e(Window window, x1f x1fVar) {
        bw7 bw7Var = (bw7) window.getDecorView().getTag(R.id.metricsDelegator);
        if (bw7Var != null) {
            x1fVar.getClass();
            synchronized (bw7Var) {
                try {
                    if (bw7Var.b) {
                        bw7Var.d.add(x1fVar);
                    } else {
                        boolean isEmpty = bw7Var.a.isEmpty();
                        bw7Var.a.remove(x1fVar);
                        if (!isEmpty && bw7Var.a.isEmpty()) {
                            window.removeOnFrameMetricsAvailableListener(bw7Var);
                            window.getDecorView().setTag(R.id.metricsDelegator, null);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public long a(FrameMetrics frameMetrics) {
        View view = (View) this.a.get();
        Field field = dw7.a;
        if (k < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                context.getClass();
                window = ((Activity) context).getWindow();
            }
            float f = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f = refreshRate;
            }
            k = (long) ((1000 / f) * 1000000);
        }
        return k;
    }

    public lvc b(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.h = j + metric;
        xdh xdhVar = this.c.a;
        if (xdhVar != null) {
            xdhVar.j(this.d);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        lvc lvcVar = this.i;
        lvcVar.b = j;
        lvcVar.c = metric;
        lvcVar.d = z;
        lvcVar.e = metric2;
        return lvcVar;
    }

    public long c(FrameMetrics frameMetrics) {
        Object obj = dw7.a.get(this.b);
        obj.getClass();
        return ((Long) obj).longValue();
    }

    public final void f(boolean z) {
        synchronized (this.e) {
            try {
                if (!z) {
                    e(this.e, this.j);
                    this.g = 0L;
                } else if (this.g == 0) {
                    bw7 d = d(this.e);
                    x1f x1fVar = this.j;
                    x1fVar.getClass();
                    synchronized (d) {
                        try {
                            if (d.b) {
                                d.c.add(x1fVar);
                            } else {
                                d.a.add(x1fVar);
                            }
                        } finally {
                        }
                    }
                    this.g = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
