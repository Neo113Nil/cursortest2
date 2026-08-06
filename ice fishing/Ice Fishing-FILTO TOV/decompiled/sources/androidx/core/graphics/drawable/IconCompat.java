package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.nm;
import defpackage.nr0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode rQPn8YBR = PorterDuff.Mode.SRC_IN;
    public ColorStateList AvO7iQsrTN;
    public int EljAMC1QTz;
    public int GWasM1elztuh;
    public String JFJ3QoxA;
    public int OOA6hdeuvCS;
    public byte[] X1lG3V04pd;
    public Object Yi7zF1RB1;
    public PorterDuff.Mode encWxUiV2;
    public String mOu10nynGul;
    public Parcelable xqGvceK5x;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i;
        if (this.GWasM1elztuh == -1) {
            return String.valueOf(this.Yi7zF1RB1);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.GWasM1elztuh) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.GWasM1elztuh) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.Yi7zF1RB1).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.Yi7zF1RB1).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.JFJ3QoxA);
                sb.append(" id=");
                int i2 = this.GWasM1elztuh;
                if (i2 == -1) {
                    Object obj = this.Yi7zF1RB1;
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = nm.X1lG3V04pd(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.AvO7iQsrTN != null) {
                            }
                            if (this.encWxUiV2 != rQPn8YBR) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.AvO7iQsrTN != null) {
                            }
                            if (this.encWxUiV2 != rQPn8YBR) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.AvO7iQsrTN != null) {
                            }
                            if (this.encWxUiV2 != rQPn8YBR) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.OOA6hdeuvCS;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.OOA6hdeuvCS);
                if (this.EljAMC1QTz != 0) {
                    sb.append(" off=");
                    sb.append(this.EljAMC1QTz);
                    break;
                }
                break;
            case 4:
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.Yi7zF1RB1);
                break;
        }
        if (this.AvO7iQsrTN != null) {
            sb.append(" tint=");
            sb.append(this.AvO7iQsrTN);
        }
        if (this.encWxUiV2 != rQPn8YBR) {
            sb.append(" mode=");
            sb.append(this.encWxUiV2);
        }
        sb.append(")");
        return sb.toString();
    }
}
