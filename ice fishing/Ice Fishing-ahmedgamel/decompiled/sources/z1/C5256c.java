package z1;

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
import s1.h;
import t1.AbstractC5032a;
import y1.C5222q;
import y1.InterfaceC5223r;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5256c implements com.bumptech.glide.load.data.d {

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f42252D = {"_data"};

    /* renamed from: A, reason: collision with root package name */
    public final Class f42253A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f42254B;

    /* renamed from: C, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.d f42255C;

    /* renamed from: n, reason: collision with root package name */
    public final Context f42256n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5223r f42257u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5223r f42258v;

    /* renamed from: w, reason: collision with root package name */
    public final Uri f42259w;

    /* renamed from: x, reason: collision with root package name */
    public final int f42260x;

    /* renamed from: y, reason: collision with root package name */
    public final int f42261y;

    /* renamed from: z, reason: collision with root package name */
    public final h f42262z;

    public C5256c(Context context, InterfaceC5223r interfaceC5223r, InterfaceC5223r interfaceC5223r2, Uri uri, int i, int i6, h hVar, Class cls) {
        this.f42256n = context.getApplicationContext();
        this.f42257u = interfaceC5223r;
        this.f42258v = interfaceC5223r2;
        this.f42259w = uri;
        this.f42260x = i;
        this.f42261y = i6;
        this.f42262z = hVar;
        this.f42253A = cls;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f42253A;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        com.bumptech.glide.load.data.d dVar = this.f42255C;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final com.bumptech.glide.load.data.d c() {
        boolean isExternalStorageLegacy;
        C5222q b9;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f42256n;
        h hVar = this.f42262z;
        int i = this.f42261y;
        int i6 = this.f42260x;
        if (!isExternalStorageLegacy) {
            int i9 = Build.VERSION.SDK_INT;
            InterfaceC5223r interfaceC5223r = this.f42258v;
            Uri uri = this.f42259w;
            if (i9 < 30) {
                if (AbstractC5032a.a(uri)) {
                    for (String str : uri.getPathSegments()) {
                        if (str == null || !str.startsWith("picker")) {
                        }
                    }
                }
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(uri);
                }
                b9 = interfaceC5223r.b(uri, i6, i, hVar);
            }
            b9 = interfaceC5223r.b(uri, i6, i, hVar);
            break;
        }
        Uri uri2 = this.f42259w;
        try {
            Cursor query = context.getContentResolver().query(uri2, f42252D, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (TextUtils.isEmpty(string)) {
                            throw new FileNotFoundException("File path was empty in media store for: " + uri2);
                        }
                        File file = new File(string);
                        query.close();
                        b9 = this.f42257u.b(file, i6, i, hVar);
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
            return b9.f41822c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f42254B = true;
        com.bumptech.glide.load.data.d dVar = this.f42255C;
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
                cVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f42259w));
            } else {
                this.f42255C = c9;
                if (this.f42254B) {
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
