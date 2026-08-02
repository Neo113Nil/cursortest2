package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;

/* loaded from: classes10.dex */
public final class x06 implements rtj0 {
    public final c16 a = new c16();

    @Override // defpackage.rtj0
    public final /* bridge */ /* synthetic */ boolean b(Object obj, mg70 mg70Var) {
        return true;
    }

    @Override // defpackage.rtj0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h16 a(ImageDecoder.Source source, int i, int i2, mg70 mg70Var) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new DefaultOnHeaderDecodedListener(i, i2, mg70Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new h16(this.a, decodeBitmap);
    }
}
