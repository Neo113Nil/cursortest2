package B1;

import A1.w;
import A1.x;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.j;
import java.io.File;
import java.io.FileNotFoundException;
import u1.h;
import v1.AbstractC5096a;

/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.d {

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f258D = {"_data"};

    /* renamed from: A, reason: collision with root package name */
    public final Class f259A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f260B;

    /* renamed from: C, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.d f261C;

    /* renamed from: n, reason: collision with root package name */
    public final Context f262n;

    /* renamed from: u, reason: collision with root package name */
    public final x f263u;

    /* renamed from: v, reason: collision with root package name */
    public final x f264v;

    /* renamed from: w, reason: collision with root package name */
    public final Uri f265w;

    /* renamed from: x, reason: collision with root package name */
    public final int f266x;

    /* renamed from: y, reason: collision with root package name */
    public final int f267y;

    /* renamed from: z, reason: collision with root package name */
    public final h f268z;

    public d(Context context, x xVar, x xVar2, Uri uri, int i, int i4, h hVar, Class cls) {
        this.f262n = context.getApplicationContext();
        this.f263u = xVar;
        this.f264v = xVar2;
        this.f265w = uri;
        this.f266x = i;
        this.f267y = i4;
        this.f268z = hVar;
        this.f259A = cls;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f259A;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        com.bumptech.glide.load.data.d dVar = this.f261C;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final com.bumptech.glide.load.data.d c() {
        boolean isExternalStorageLegacy;
        w b9;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f262n;
        h hVar = this.f268z;
        int i = this.f267y;
        int i4 = this.f266x;
        if (!isExternalStorageLegacy) {
            int i6 = Build.VERSION.SDK_INT;
            x xVar = this.f264v;
            Uri uri = this.f265w;
            if (i6 < 30) {
                if (AbstractC5096a.a(uri)) {
                    for (String str : uri.getPathSegments()) {
                        if (str == null || !str.startsWith("picker")) {
                        }
                    }
                }
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(uri);
                }
                b9 = xVar.b(uri, i4, i, hVar);
            }
            b9 = xVar.b(uri, i4, i, hVar);
            break;
        }
        Uri uri2 = this.f265w;
        try {
            Cursor query = context.getContentResolver().query(uri2, f258D, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (TextUtils.isEmpty(string)) {
                            throw new FileNotFoundException("File path was empty in media store for: " + uri2);
                        }
                        File file = new File(string);
                        query.close();
                        b9 = this.f263u.b(file, i4, i, hVar);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            throw new FileNotFoundException("Failed to media store entry for: " + uri2);
        } catch (Throwable th2) {
            th = th2;
        }
        if (b9 != null) {
            return b9.f92c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f260B = true;
        com.bumptech.glide.load.data.d dVar = this.f261C;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(j jVar, com.bumptech.glide.load.data.c cVar) {
        try {
            com.bumptech.glide.load.data.d c9 = c();
            if (c9 == null) {
                cVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f265w));
            } else {
                this.f261C = c9;
                if (this.f260B) {
                    cancel();
                } else {
                    c9.e(jVar, cVar);
                }
            }
        } catch (FileNotFoundException e9) {
            cVar.c(e9);
        }
    }
}
