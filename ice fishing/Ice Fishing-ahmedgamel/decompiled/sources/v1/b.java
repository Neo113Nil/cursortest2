package v1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f41080c = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f41081d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41082a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f41083b;

    public /* synthetic */ b(ContentResolver contentResolver, int i) {
        this.f41082a = i;
        this.f41083b = contentResolver;
    }

    @Override // v1.c
    public final Cursor a(Uri uri) {
        switch (this.f41082a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f41083b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f41080c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f41083b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f41081d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
