package androidx.glance.appwidget.translators;

import android.os.Build;
import android.widget.RemoteViews;

/* loaded from: classes3.dex */
public final class TextTranslatorApi31Impl {
    public static final TextTranslatorApi31Impl INSTANCE = new TextTranslatorApi31Impl();

    public final void setTextViewGravity(RemoteViews remoteViews, int i, int i2) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setInt(i, "setGravity", i2);
            return;
        }
        throw new IllegalArgumentException(("setGravity is only available on SDK 31 and higher").toString());
    }
}
