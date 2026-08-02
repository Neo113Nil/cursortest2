package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class kl0 implements o2o {
    public final /* synthetic */ int a;
    public final Object b;

    public kl0() {
        this.a = 2;
        this.b = new e3s(15);
    }

    @Override // defpackage.o2o
    public final boolean a(Object obj, pwj pwjVar) {
        switch (this.a) {
            case 0:
                ImageHeaderParser$ImageType u = lxe.u(((ll0) this.b).a, (ByteBuffer) obj);
                if (u == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && u == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            case 1:
                ll0 ll0Var = (ll0) this.b;
                ImageHeaderParser$ImageType t = lxe.t(ll0Var.a, (InputStream) obj, ll0Var.b);
                if (t == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && t == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                xq0.d(obj);
                break;
        }
        return true;
    }

    @Override // defpackage.o2o
    public final k2o b(Object obj, int i, int i2, pwj pwjVar) {
        switch (this.a) {
            case 0:
                return ll0.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, pwjVar);
            case 1:
                return ll0.a(ImageDecoder.createSource(tm3.b((InputStream) obj)), i, i2, pwjVar);
            default:
                return c(xq0.d(obj), i, i2, pwjVar);
        }
    }

    public s33 c(ImageDecoder.Source source, int i, int i2, pwj pwjVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new cp7(i, i2, pwjVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new s33((e3s) this.b, decodeBitmap);
    }

    public /* synthetic */ kl0(ll0 ll0Var, int i) {
        this.a = i;
        this.b = ll0Var;
    }
}
