package androidx.core.graphics.drawable;

import F.k;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import q.b;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1299k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1301b;

    /* renamed from: j, reason: collision with root package name */
    public String f1309j;

    /* renamed from: a, reason: collision with root package name */
    public int f1300a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1302c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1303d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1304e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1305f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1306g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1307h = f1299k;

    /* renamed from: i, reason: collision with root package name */
    public String f1308i = null;

    public final String toString() {
        String str;
        int i2;
        if (this.f1300a == -1) {
            return String.valueOf(this.f1301b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1300a) {
            case 1:
                str = "BITMAP";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1300a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1301b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1301b).getHeight());
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f1309j);
                sb.append(" id=");
                int i3 = this.f1300a;
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = this.f1301b;
                    if (i4 >= 28) {
                        i2 = b.a(obj);
                    } else {
                        i2 = 0;
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f1304e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f1304e);
                if (this.f1305f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1305f);
                    break;
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f1301b);
                break;
        }
        if (this.f1306g != null) {
            sb.append(" tint=");
            sb.append(this.f1306g);
        }
        if (this.f1307h != f1299k) {
            sb.append(" mode=");
            sb.append(this.f1307h);
        }
        sb.append(")");
        return sb.toString();
    }
}
