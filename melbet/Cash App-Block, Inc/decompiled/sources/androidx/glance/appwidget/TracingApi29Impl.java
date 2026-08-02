package androidx.glance.appwidget;

import android.os.Trace;

/* loaded from: classes3.dex */
public final class TracingApi29Impl {
    public static final TracingApi29Impl INSTANCE = new TracingApi29Impl();

    public final void beginAsyncSection(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public final void endAsyncSection(String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
