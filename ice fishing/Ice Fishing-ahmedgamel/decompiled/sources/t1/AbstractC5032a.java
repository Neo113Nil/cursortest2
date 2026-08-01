package t1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5032a {
    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static AssetFileDescriptor b(ContentResolver contentResolver, Uri uri) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, com.anythink.expressad.foundation.d.d.bv, null);
    }
}
