package app.cash.copper;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public final class ContentResolverQuery {
    public final ContentResolver contentResolver;
    public final String[] projection;
    public final String selection;
    public final String[] selectionArgs;
    public final Uri uri;

    public ContentResolverQuery(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2) {
        contentResolver.getClass();
        uri.getClass();
        this.contentResolver = contentResolver;
        this.uri = uri;
        this.projection = strArr;
        this.selection = str;
        this.selectionArgs = strArr2;
    }

    public final Cursor run() {
        return this.contentResolver.query(this.uri, this.projection, this.selection, this.selectionArgs, null);
    }
}
