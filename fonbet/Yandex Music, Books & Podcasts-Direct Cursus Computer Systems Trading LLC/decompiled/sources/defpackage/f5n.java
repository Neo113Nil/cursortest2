package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class f5n implements ca7 {
    public static final String[] k = {"_data"};
    public final Context a;
    public final kci b;
    public final kci c;
    public final Uri d;
    public final int e;
    public final int f;
    public final pwj g;
    public final Class h;
    public volatile boolean i;
    public volatile ca7 j;

    public f5n(Context context, kci kciVar, kci kciVar2, Uri uri, int i, int i2, pwj pwjVar, Class cls) {
        this.a = context.getApplicationContext();
        this.b = kciVar;
        this.c = kciVar2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = pwjVar;
        this.h = cls;
    }

    @Override // defpackage.ca7
    public final Class a() {
        return this.h;
    }

    @Override // defpackage.ca7
    public final void b() {
        ca7 ca7Var = this.j;
        if (ca7Var != null) {
            ca7Var.b();
        }
    }

    public final ca7 c() {
        jci a;
        boolean isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        pwj pwjVar = this.g;
        int i = this.f;
        int i2 = this.e;
        Context context = this.a;
        if (isExternalStorageLegacy) {
            Uri uri = this.d;
            try {
                Cursor query = context.getContentResolver().query(uri, k, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            query.close();
                            a = this.b.a(file, i2, i, pwjVar);
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
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            int checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            Uri uri2 = this.d;
            if (checkSelfPermission == 0) {
                uri2 = MediaStore.setRequireOriginal(uri2);
            }
            a = this.c.a(uri2, i2, i, pwjVar);
        }
        if (a != null) {
            return a.c;
        }
        return null;
    }

    @Override // defpackage.ca7
    public final void cancel() {
        this.i = true;
        ca7 ca7Var = this.j;
        if (ca7Var != null) {
            ca7Var.cancel();
        }
    }

    @Override // defpackage.ca7
    public final void d(nsm nsmVar, ba7 ba7Var) {
        try {
            ca7 c = c();
            if (c == null) {
                ba7Var.c(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = c;
                if (this.i) {
                    cancel();
                } else {
                    c.d(nsmVar, ba7Var);
                }
            }
        } catch (FileNotFoundException e) {
            ba7Var.c(e);
        }
    }

    @Override // defpackage.ca7
    public final int e() {
        return 1;
    }
}
