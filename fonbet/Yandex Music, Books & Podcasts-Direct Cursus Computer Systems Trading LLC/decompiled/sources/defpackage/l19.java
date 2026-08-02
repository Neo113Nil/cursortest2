package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class l19 extends AsyncTask {
    public final WeakReference a;
    public final qq3 b;

    public l19(WeakReference weakReference, qq3 qq3Var) {
        this.a = weakReference;
        this.b = qq3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        String path;
        ImageDecoder.Source createSource;
        qq3 qq3Var = this.b;
        try {
            qq3Var.getClass();
            throw new IllegalStateException("no bytes stored in cached bitmap");
        } catch (IOException unused) {
            int i = i9f.a;
            Uri uri = qq3Var.b;
            path = uri == null ? uri.getPath() : null;
            if (path != null) {
                try {
                    createSource = ImageDecoder.createSource(new File(path));
                } catch (IOException unused2) {
                    int i2 = i9f.a;
                    createSource = null;
                    if (createSource != null) {
                        return null;
                    }
                    try {
                        return ImageDecoder.decodeDrawable(createSource);
                    } catch (IOException unused3) {
                        int i3 = i9f.a;
                        return null;
                    }
                }
                if (createSource != null) {
                }
            }
            createSource = null;
            if (createSource != null) {
            }
        } catch (IllegalStateException unused4) {
            int i4 = i9f.a;
            Uri uri2 = qq3Var.b;
            if (uri2 == null) {
            }
            if (path != null) {
            }
            createSource = null;
            if (createSource != null) {
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        super.onPostExecute(drawable);
        WeakReference weakReference = this.a;
        if (drawable == null || !xq0.u(drawable)) {
            v19 v19Var = (v19) weakReference.get();
            if (v19Var != null) {
                v19Var.setImage(this.b.a);
            }
        } else {
            v19 v19Var2 = (v19) weakReference.get();
            if (v19Var2 != null) {
                v19Var2.setImage(drawable);
            }
        }
        v19 v19Var3 = (v19) weakReference.get();
        if (v19Var3 != null) {
            v19Var3.n();
        }
    }
}
