package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.b6e;
import defpackage.fx1;
import defpackage.jo0;
import defpackage.kac;
import defpackage.qdq;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = k;
    public String i = null;
    public String j;

    public IconCompat(int i) {
        this.a = i;
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Context context, int i) {
        context.getClass();
        return c(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat c(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            xq0.x("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = i;
        if (resources != null) {
            try {
                iconCompat.b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                xq0.x("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final int d() {
        int i = this.a;
        if (i != -1) {
            if (i == 2) {
                return this.e;
            }
            b6e.u(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.b;
        if (Build.VERSION.SDK_INT >= 28) {
            return jo0.q(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public final int e() {
        int i = this.a;
        if (i != -1) {
            return i;
        }
        Object obj = this.b;
        if (Build.VERSION.SDK_INT >= 28) {
            return jo0.y(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        }
    }

    public final Uri f() {
        int i = this.a;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.b);
            }
            b6e.u(this, "called getUri() on ");
            return null;
        }
        Object obj = this.b;
        if (Build.VERSION.SDK_INT >= 28) {
            return jo0.z(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public final InputStream g(Context context) {
        Uri f = f();
        String scheme = f.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(f);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + f, e);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.b));
        } catch (FileNotFoundException e2) {
            Log.w("IconCompat", "Unable to load image from path: " + f, e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Icon h(Context context) {
        Icon createWithBitmap;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i = this.a;
        switch (i) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                xq0.x("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                if (i == -1) {
                    Object obj = this.b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = jo0.r(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                            str = null;
                            createWithBitmap = Icon.createWithResource(str, this.e);
                            colorStateList = this.g;
                            if (colorStateList != null) {
                            }
                            mode = this.h;
                            if (mode != k) {
                            }
                            return createWithBitmap;
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                            str = null;
                            createWithBitmap = Icon.createWithResource(str, this.e);
                            colorStateList = this.g;
                            if (colorStateList != null) {
                            }
                            mode = this.h;
                            if (mode != k) {
                            }
                            return createWithBitmap;
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                            str = null;
                            createWithBitmap = Icon.createWithResource(str, this.e);
                            colorStateList = this.g;
                            if (colorStateList != null) {
                            }
                            mode = this.h;
                            if (mode != k) {
                            }
                            return createWithBitmap;
                        }
                    }
                } else {
                    if (i != 2) {
                        b6e.u(this, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = this.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : this.j;
                }
                createWithBitmap = Icon.createWithResource(str, this.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.b, this.e, this.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = this.b;
                if (i2 < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) obj2, false));
                    break;
                } else {
                    createWithBitmap = fx1.d((Bitmap) obj2);
                    break;
                }
            case 6:
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    createWithBitmap = qdq.i(f());
                    break;
                } else {
                    if (context == null) {
                        kac.l(f(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    InputStream g = g(context);
                    if (g == null) {
                        b6e.w(f(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (i3 < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(g), false));
                        break;
                    } else {
                        createWithBitmap = fx1.d(BitmapFactory.decodeStream(g));
                        break;
                    }
                }
        }
        colorStateList = this.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        mode = this.h;
        if (mode != k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
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
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
