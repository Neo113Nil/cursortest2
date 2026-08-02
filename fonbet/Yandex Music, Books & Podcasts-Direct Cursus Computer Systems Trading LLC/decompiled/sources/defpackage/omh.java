package defpackage;

import android.media.MediaDescription;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class omh {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
