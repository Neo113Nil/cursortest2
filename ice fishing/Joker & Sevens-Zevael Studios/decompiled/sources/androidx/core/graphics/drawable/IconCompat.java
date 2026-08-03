package androidx.core.graphics.drawable;

import a2.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b3.a;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f617k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f618a;

    /* renamed from: b, reason: collision with root package name */
    public Object f619b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f620c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f621d;

    /* renamed from: e, reason: collision with root package name */
    public int f622e;

    /* renamed from: f, reason: collision with root package name */
    public int f623f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f624g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f625h;

    /* renamed from: i, reason: collision with root package name */
    public String f626i;

    /* renamed from: j, reason: collision with root package name */
    public String f627j;

    public IconCompat() {
        this.f618a = -1;
        this.f620c = null;
        this.f621d = null;
        this.f622e = 0;
        this.f623f = 0;
        this.f624g = null;
        this.f625h = f617k;
        this.f626i = null;
    }

    public static IconCompat a(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f622e = i10;
        iconCompat.f619b = "";
        iconCompat.f627j = "";
        return iconCompat;
    }

    public final int b() {
        int i10 = this.f618a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f622e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f619b;
        if (i11 >= 28) {
            return a.e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final int c() {
        int i10 = this.f618a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f619b;
        if (i11 >= 28) {
            return a.l(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public final Uri d() {
        int i10 = this.f618a;
        if (i10 != -1) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f619b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f619b;
        if (i11 >= 28) {
            return a.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final Icon e(Context context) {
        Icon createWithBitmap;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f618a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i11) {
            case -1:
                return (Icon) this.f619b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f619b);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (i11 == -1) {
                    Object obj = this.f619b;
                    if (i10 >= 28) {
                        str = b3.a.f(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.f627j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f619b).split(":", -1)[0] : this.f627j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f622e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f619b, this.f622e, this.f623f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f619b);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f619b);
                break;
            case 6:
                if (i10 >= 30) {
                    createWithBitmap = c.a(d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + d());
                    }
                    Uri d10 = d();
                    String scheme = d10.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(d10);
                        } catch (Exception e13) {
                            Log.w("IconCompat", "Unable to load image from URI: " + d10, e13);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.f619b));
                        } catch (FileNotFoundException e14) {
                            Log.w("IconCompat", "Unable to load image from path: " + d10, e14);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + d());
                    }
                    createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(openInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = this.f624g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f625h;
        if (mode != f617k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f618a == -1) {
            return String.valueOf(this.f619b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f618a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                str = "BITMAP";
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
        switch (this.f618a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f619b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f619b).getHeight());
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f627j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f622e);
                if (this.f623f != 0) {
                    sb.append(" off=");
                    sb.append(this.f623f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f619b);
                break;
        }
        if (this.f624g != null) {
            sb.append(" tint=");
            sb.append(this.f624g);
        }
        if (this.f625h != f617k) {
            sb.append(" mode=");
            sb.append(this.f625h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f620c = null;
        this.f621d = null;
        this.f622e = 0;
        this.f623f = 0;
        this.f624g = null;
        this.f625h = f617k;
        this.f626i = null;
        this.f618a = i10;
    }
}
