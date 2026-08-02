package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.i;
import yads.y92;

/* loaded from: classes7.dex */
public final class ua81 extends Request {
    public static final Object z = new Object();
    public final Object a;
    public cf71 b;
    public final Bitmap.Config c;
    public final int w;
    public final int x;
    public final ImageView.ScaleType y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua81(String str, cf71 cf71Var, int i, int i2, rr41 rr41Var) {
        super(0, str, rr41Var);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        this.a = new Object();
        setRetryPolicy(new nv71(2.0f, 1000, 2));
        this.b = cf71Var;
        this.c = config;
        this.w = i;
        this.x = i2;
        this.y = scaleType;
    }

    public static int b(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i != 0 || i2 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) (i3 * (i2 / i4));
                }
                if (i2 == 0) {
                    return i;
                }
                double d = i4 / i3;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d2 = i2;
                    return ((double) i) * d < d2 ? (int) (d2 / d) : i;
                }
                double d3 = i2;
                return ((double) i) * d > d3 ? (int) (d3 / d) : i;
            }
            if (i != 0) {
                return i;
            }
        }
        return i3;
    }

    public final km81 c(gb81 gb81Var) {
        Bitmap bitmap;
        byte[] bArr = gb81Var.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = this.x;
        int i2 = this.w;
        if (i2 == 0 && i == 0) {
            options.inPreferredConfig = this.c;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            ImageView.ScaleType scaleType = this.y;
            int b = b(i2, i, i3, i4, scaleType);
            int b2 = b(i, i2, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            float f = 1.0f;
            while (true) {
                float f2 = 2.0f * f;
                if (f2 > Math.min(i3 / b, i4 / b2)) {
                    break;
                }
                f = f2;
            }
            options.inSampleSize = (int) f;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= b && decodeByteArray.getHeight() <= b2)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, b, b2, true);
                decodeByteArray.recycle();
            }
        }
        return bitmap == null ? new km81(new y92(gb81Var)) : new km81(bitmap, hba1.d(gb81Var));
    }

    @Override // com.monetization.ads.network.core.Request
    public final void cancel() {
        super.cancel();
        synchronized (this.a) {
            this.b = null;
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final void deliverResponse(Object obj) {
        cf71 cf71Var;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.a) {
            cf71Var = this.b;
        }
        if (cf71Var != null) {
            cf71Var.a(bitmap);
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final i getPriority() {
        return i.LOW;
    }

    @Override // com.monetization.ads.network.core.Request
    public final km81 parseNetworkResponse(gb81 gb81Var) {
        km81 c;
        synchronized (z) {
            try {
                try {
                    c = c(gb81Var);
                } catch (OutOfMemoryError e) {
                    int length = gb81Var.b.length;
                    this.getUrl();
                    boolean z2 = ew71.a;
                    return new km81(new y92(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }
}
