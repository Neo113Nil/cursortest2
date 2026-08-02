package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;

/* loaded from: classes15.dex */
public final class w6m implements fev {
    public final Uri a;
    public final btk b;

    public w6m(Uri uri, btk btkVar) {
        this.a = uri;
        this.b = btkVar;
    }

    @Override // defpackage.fev
    public final void onError(hev hevVar, n9o n9oVar) {
        this.b.c();
    }

    @Override // defpackage.fev
    public final void onSuccess(hev hevVar, u3v0 u3v0Var) {
        BitmapSource bitmapSource;
        Bitmap bitmap = ((BitmapDrawable) u3v0Var.a).getBitmap();
        int i = v6m.a[u3v0Var.c.ordinal()];
        if (i == 1) {
            bitmapSource = BitmapSource.MEMORY;
        } else if (i == 2) {
            bitmapSource = BitmapSource.MEMORY;
        } else if (i == 3) {
            bitmapSource = BitmapSource.DISK;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            bitmapSource = BitmapSource.NETWORK;
        }
        this.b.g(new bd7(bitmap, null, this.a, bitmapSource));
    }
}
