package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import yads.h72;

/* loaded from: classes7.dex */
public final class v881 {
    public final abe a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public v881(Context context) {
        this.a = new abe(context, 22);
    }

    public final Bitmap a(cu81 cu81Var) {
        String str = cu81Var.c;
        LinkedHashMap linkedHashMap = this.b;
        Bitmap bitmap = (Bitmap) linkedHashMap.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        lm71 lm71Var = mf71.d.a(this.a.a).c;
        String str2 = cu81Var.c;
        lm71Var.getClass();
        h72 h72Var = (h72) lm71Var.b;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        Bitmap bitmap2 = (Bitmap) h72Var.get(ae81.a(str2));
        if (bitmap2 != null && bitmap2.getWidth() == 1 && bitmap2.getHeight() == 1) {
            bitmap2 = Bitmap.createScaledBitmap(bitmap2, cu81Var.a, cu81Var.b, false);
            h72Var.put(ae81.a(str2), bitmap2);
        }
        if (bitmap2 == null) {
            return null;
        }
        linkedHashMap.put(str, bitmap2);
        return bitmap2;
    }
}
