package androidx.glance.appwidget;

import android.os.Build;
import android.widget.RemoteViews;
import androidx.glance.unit.Dimension;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ApplyModifiersApi31Impl {
    public static final ApplyModifiersApi31Impl INSTANCE = new ApplyModifiersApi31Impl();

    public final void applyRoundedCorners(RemoteViews remoteViews, int i, Dimension dimension) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) "setClipToOutline is only available on SDK 31 and higher");
            return;
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (dimension instanceof Dimension.Dp) {
            remoteViews.setViewOutlinePreferredRadius(i, 8.0f, 1);
        } else {
            a$$ExternalSyntheticBUOutline0.m(dimension.getClass().getCanonicalName(), "Rounded corners should not be ");
        }
    }

    public final void setViewHeight(RemoteViews remoteViews, int i, Dimension dimension) {
        if (dimension instanceof Dimension.Wrap) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (dimension instanceof Dimension.Expand) {
            remoteViews.setViewLayoutHeight(i, RecyclerView.DECELERATION_RATE, 0);
            return;
        }
        if (dimension instanceof Dimension.Dp) {
            remoteViews.setViewLayoutHeight(i, 8.0f, 1);
        } else if (Intrinsics.areEqual(dimension, Dimension.Fill.INSTANCE)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public final void setViewWidth(RemoteViews remoteViews, int i, Dimension dimension) {
        if (dimension instanceof Dimension.Wrap) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (dimension instanceof Dimension.Expand) {
            remoteViews.setViewLayoutWidth(i, RecyclerView.DECELERATION_RATE, 0);
            return;
        }
        if (dimension instanceof Dimension.Dp) {
            remoteViews.setViewLayoutWidth(i, 8.0f, 1);
        } else if (Intrinsics.areEqual(dimension, Dimension.Fill.INSTANCE)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
