package androidx.glance.appwidget;

import android.widget.RemoteViews;

/* loaded from: classes3.dex */
public final class RemoteViewsTranslatorApi31Impl {
    public static final RemoteViewsTranslatorApi31Impl INSTANCE = new RemoteViewsTranslatorApi31Impl();

    public final void addChildView(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        remoteViews.addStableView(i, remoteViews2, i2);
    }
}
