package androidx.glance.appwidget;

import android.widget.RemoteViews;

/* loaded from: classes3.dex */
public final class LayoutSelectionApi31Impl {
    public static final LayoutSelectionApi31Impl INSTANCE = new LayoutSelectionApi31Impl();

    public final RemoteViews remoteViews(String str, int i, int i2) {
        return new RemoteViews(str, i, i2);
    }
}
