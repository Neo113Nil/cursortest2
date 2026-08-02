package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import yads.tj0;

/* loaded from: classes7.dex */
public final class xl81 {
    public final tj0 a;

    public xl81() {
        int maxMemory = ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) / 8;
        this.a = new tj0(maxMemory > 10240 ? 10240 : maxMemory);
    }
}
