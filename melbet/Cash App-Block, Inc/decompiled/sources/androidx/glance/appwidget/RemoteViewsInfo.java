package androidx.glance.appwidget;

import android.widget.RemoteViews;

/* loaded from: classes3.dex */
public final class RemoteViewsInfo {
    public final RemoteViews remoteViews;
    public final InsertedViewInfo view;

    public RemoteViewsInfo(RemoteViews remoteViews, InsertedViewInfo insertedViewInfo) {
        this.remoteViews = remoteViews;
        this.view = insertedViewInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteViewsInfo)) {
            return false;
        }
        RemoteViewsInfo remoteViewsInfo = (RemoteViewsInfo) obj;
        return this.remoteViews.equals(remoteViewsInfo.remoteViews) && this.view.equals(remoteViewsInfo.view);
    }

    public final int hashCode() {
        return this.view.hashCode() + (this.remoteViews.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.remoteViews + ", view=" + this.view + ')';
    }
}
