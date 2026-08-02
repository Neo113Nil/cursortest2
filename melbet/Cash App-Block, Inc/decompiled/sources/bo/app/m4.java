package bo.app;

import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes3.dex */
public final class m4 extends LruCache {
    public m4(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        ((String) obj).getClass();
        bitmap.getClass();
        return bitmap.getByteCount();
    }
}
