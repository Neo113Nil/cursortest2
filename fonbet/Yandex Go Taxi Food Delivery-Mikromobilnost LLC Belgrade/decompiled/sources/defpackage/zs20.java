package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/* loaded from: classes15.dex */
public final class zs20 {
    public final Context a;
    public final at20 b;

    public zs20(Context context, at20 at20Var) {
        this.a = context;
        this.b = at20Var;
    }

    public final String a(String str) {
        Context context = this.a;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "application/zip");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        contentValues.put("is_pending", (Integer) 1);
        Uri insert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return null;
        }
        File file = new File(context.getCacheDir(), str);
        try {
            if (!this.b.b(file.getAbsolutePath())) {
                return null;
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    rzo.l(fileInputStream, openOutputStream);
                    fileInputStream.close();
                    openOutputStream.close();
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(insert, contentValues, null, null);
                    return str;
                } finally {
                }
            } finally {
            }
        } finally {
            file.delete();
        }
    }
}
