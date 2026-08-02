package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes13.dex */
public final class ui1 {
    public final Drawable a;
    public final Bitmap b;
    public final BitmapShader c;
    public final Canvas d;

    public ui1(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        mutate.setBounds(new Rect(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight()));
        this.a = mutate;
        Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
        this.d = new Canvas(createBitmap);
    }
}
