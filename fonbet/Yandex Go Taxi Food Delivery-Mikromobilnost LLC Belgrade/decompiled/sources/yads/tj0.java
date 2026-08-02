package yads;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import defpackage.ti81;

/* loaded from: classes7.dex */
public final class tj0 extends LruCache {
    public tj0(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Drawable drawable = ((ti81) obj2).a;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap().getByteCount() / 1024;
        }
        return 100;
    }
}
