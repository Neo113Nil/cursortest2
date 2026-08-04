package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b.a;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f34k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f36b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f44j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f37c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f38d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f41g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f42h = f34k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f43i = null;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    public final String toString() {
        String str;
        int height;
        int iIntValue;
        if (this.f35a == -1) {
            return String.valueOf(this.f36b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f35a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
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
        switch (this.f35a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f36b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f36b).getHeight();
                sb.append(height);
                if (this.f41g != null) {
                    sb.append(" tint=");
                    sb.append(this.f41g);
                }
                if (this.f42h != f34k) {
                    sb.append(" mode=");
                    sb.append(this.f42h);
                }
                sb.append(")");
                return sb.toString();
            case 2:
                sb.append(" pkg=");
                sb.append(this.f44j);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i2 = this.f35a;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f36b;
                    if (i3 >= 28) {
                        iIntValue = a.a(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        }
                    }
                    break;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f39e;
                }
                objArr[0] = Integer.valueOf(iIntValue);
                sb.append(String.format("0x%08x", objArr));
                if (this.f41g != null) {
                    sb.append(" tint=");
                    sb.append(this.f41g);
                }
                if (this.f42h != f34k) {
                    sb.append(" mode=");
                    sb.append(this.f42h);
                }
                sb.append(")");
                return sb.toString();
            case 3:
                sb.append(" len=");
                sb.append(this.f39e);
                if (this.f40f != 0) {
                    sb.append(" off=");
                    height = this.f40f;
                    sb.append(height);
                }
                if (this.f41g != null) {
                    sb.append(" tint=");
                    sb.append(this.f41g);
                }
                if (this.f42h != f34k) {
                    sb.append(" mode=");
                    sb.append(this.f42h);
                }
                sb.append(")");
                return sb.toString();
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.f36b);
                if (this.f41g != null) {
                    sb.append(" tint=");
                    sb.append(this.f41g);
                }
                if (this.f42h != f34k) {
                    sb.append(" mode=");
                    sb.append(this.f42h);
                }
                sb.append(")");
                return sb.toString();
            default:
                if (this.f41g != null) {
                    sb.append(" tint=");
                    sb.append(this.f41g);
                }
                if (this.f42h != f34k) {
                    sb.append(" mode=");
                    sb.append(this.f42h);
                }
                sb.append(")");
                return sb.toString();
        }
    }
}
