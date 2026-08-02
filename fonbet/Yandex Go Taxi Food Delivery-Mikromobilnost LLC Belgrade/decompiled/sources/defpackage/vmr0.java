package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes15.dex */
public final class vmr0 {
    public final wmr0 a;

    public static final class a {
    }

    public vmr0(int i) {
        ydz.a();
        this.a = new wmr0((int) ((Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) * 0.2d));
    }

    public vmr0() {
        this(0);
    }
}
