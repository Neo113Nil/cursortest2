package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.core.view.ContentInfoCompat;

/* loaded from: classes3.dex */
public final class PlayerId {
    public static final PlayerId PRELOAD;
    public final ContentInfoCompat.Compat31Impl logSessionIdApi31;
    public final String name;

    static {
        new PlayerId("");
        PRELOAD = new PlayerId("preload");
    }

    public PlayerId(String str) {
        this.name = str;
        this.logSessionIdApi31 = Build.VERSION.SDK_INT >= 31 ? new ContentInfoCompat.Compat31Impl() : null;
    }

    public final synchronized LogSessionId getLogSessionId() {
        ContentInfoCompat.Compat31Impl compat31Impl;
        compat31Impl = this.logSessionIdApi31;
        compat31Impl.getClass();
        return (LogSessionId) compat31Impl.mWrapped;
    }
}
