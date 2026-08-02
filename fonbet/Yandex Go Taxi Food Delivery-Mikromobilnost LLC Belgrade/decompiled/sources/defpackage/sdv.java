package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

/* loaded from: classes11.dex */
public interface sdv {
    void a();

    Point b(Context context, Uri uri);

    Bitmap c(int i, Rect rect);

    boolean isReady();
}
