package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class dfj {
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, @NonNull CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
