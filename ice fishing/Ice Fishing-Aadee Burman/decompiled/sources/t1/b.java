package t1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f40785c = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f40786d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40787a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f40788b;

    public /* synthetic */ b(ContentResolver contentResolver, int i) {
        this.f40787a = i;
        this.f40788b = contentResolver;
    }

    @Override // t1.d
    public final Cursor a(Uri uri) {
        switch (this.f40787a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f40788b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f40785c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f40788b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f40786d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
