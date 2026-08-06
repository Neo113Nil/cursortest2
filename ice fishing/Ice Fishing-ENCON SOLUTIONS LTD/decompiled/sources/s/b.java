package s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class b {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i2 = iconCompat.f2260a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i2) {
            case -1:
                return (Icon) iconCompat.f2261b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2261b);
                break;
            case 2:
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f2261b;
                    if (i3 >= 28) {
                        str = d.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str2 = iconCompat.f2269j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f2261b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : iconCompat.f2269j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f2264e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f2261b, iconCompat.f2264e, iconCompat.f2265f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f2261b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f2261b, false));
                    break;
                } else {
                    createWithBitmap = c.b((Bitmap) iconCompat.f2261b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = e.a(iconCompat.d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                    }
                    Uri d2 = iconCompat.d();
                    String scheme = d2.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(d2);
                        } catch (Exception e5) {
                            Log.w("IconCompat", "Unable to load image from URI: " + d2, e5);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f2261b));
                        } catch (FileNotFoundException e6) {
                            Log.w("IconCompat", "Unable to load image from path: " + d2, e6);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = c.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.f2266g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f2267h;
        if (mode != IconCompat.f2259k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
