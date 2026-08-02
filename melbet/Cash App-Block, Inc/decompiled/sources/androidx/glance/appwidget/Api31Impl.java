package androidx.glance.appwidget;

import android.util.SizeF;
import android.widget.RemoteViews;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Api31Impl {
    public static final Api31Impl INSTANCE = new Api31Impl();

    public final RemoteViews createRemoteViews(Map<SizeF, ? extends RemoteViews> map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }
}
