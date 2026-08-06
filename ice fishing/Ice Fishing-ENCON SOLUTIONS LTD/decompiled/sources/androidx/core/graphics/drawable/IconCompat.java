package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import s.b;
import s.d;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2259k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f2261b;

    /* renamed from: j, reason: collision with root package name */
    public String f2269j;

    /* renamed from: a, reason: collision with root package name */
    public int f2260a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2262c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2263d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f2264e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f2265f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2266g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2267h = f2259k;

    /* renamed from: i, reason: collision with root package name */
    public String f2268i = null;

    public static Bitmap a(Bitmap bitmap, boolean z2) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z2) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2262c = null;
        iconCompat.f2263d = null;
        iconCompat.f2265f = 0;
        iconCompat.f2266g = null;
        iconCompat.f2267h = f2259k;
        iconCompat.f2268i = null;
        iconCompat.f2260a = 2;
        iconCompat.f2264e = i2;
        iconCompat.f2261b = "";
        iconCompat.f2269j = "";
        return iconCompat;
    }

    public final int c() {
        int i2 = this.f2260a;
        if (i2 != -1) {
            if (i2 == 2) {
                return this.f2264e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i3 = Build.VERSION.SDK_INT;
        Object obj = this.f2261b;
        if (i3 >= 28) {
            return d.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public final Uri d() {
        int i2 = this.f2260a;
        if (i2 == -1) {
            return b.a(this.f2261b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f2261b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f2260a == -1) {
            return String.valueOf(this.f2261b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2260a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2260a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2261b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2261b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2269j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2264e);
                if (this.f2265f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2265f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2261b);
                break;
        }
        if (this.f2266g != null) {
            sb.append(" tint=");
            sb.append(this.f2266g);
        }
        if (this.f2267h != f2259k) {
            sb.append(" mode=");
            sb.append(this.f2267h);
        }
        sb.append(")");
        return sb.toString();
    }
}
