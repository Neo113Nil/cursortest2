package androidx.core.graphics.drawable;

import H.c;
import H.e;
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

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4688k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f4689a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4690b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4691c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f4692d;

    /* renamed from: e, reason: collision with root package name */
    public int f4693e;

    /* renamed from: f, reason: collision with root package name */
    public int f4694f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4695g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4696h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f4697j;

    public IconCompat() {
        this.f4689a = -1;
        this.f4691c = null;
        this.f4692d = null;
        this.f4693e = 0;
        this.f4694f = 0;
        this.f4695g = null;
        this.f4696h = f4688k;
        this.i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f3 = min;
        float f9 = 0.5f * f3;
        float f10 = 0.9166667f * f9;
        if (z3) {
            float f11 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4693e = i;
        iconCompat.f4690b = "";
        iconCompat.f4697j = "";
        return iconCompat;
    }

    public final int c() {
        int i = this.f4689a;
        if (i != -1) {
            if (i == 2) {
                return this.f4693e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i6 = Build.VERSION.SDK_INT;
        Object obj = this.f4690b;
        if (i6 >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        }
    }

    public final int d() {
        int i = this.f4689a;
        if (i != -1) {
            return i;
        }
        int i6 = Build.VERSION.SDK_INT;
        Object obj = this.f4690b;
        if (i6 >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e9) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e9);
            return -1;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        }
    }

    public final Uri e() {
        int i = this.f4689a;
        if (i == -1) {
            return c.a(this.f4690b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f4690b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f4689a == -1) {
            return String.valueOf(this.f4690b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4689a) {
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
        switch (this.f4689a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4690b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4690b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4697j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4693e);
                if (this.f4694f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4694f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4690b);
                break;
        }
        if (this.f4695g != null) {
            sb.append(" tint=");
            sb.append(this.f4695g);
        }
        if (this.f4696h != f4688k) {
            sb.append(" mode=");
            sb.append(this.f4696h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f4691c = null;
        this.f4692d = null;
        this.f4693e = 0;
        this.f4694f = 0;
        this.f4695g = null;
        this.f4696h = f4688k;
        this.i = null;
        this.f4689a = i;
    }
}
