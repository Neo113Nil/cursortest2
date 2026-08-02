package androidx.glance.appwidget;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class Tracing {
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    public static void endGlanceAppWidgetUpdate() {
        if (enabled.get()) {
            TracingApi29Impl.INSTANCE.endAsyncSection("GlanceAppWidget::update", 0);
        }
    }
}
