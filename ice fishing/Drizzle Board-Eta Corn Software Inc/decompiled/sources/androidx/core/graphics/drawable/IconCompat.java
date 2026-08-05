package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.fd;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k3x7lurq = PorterDuff.Mode.SRC_IN;
    public byte[] MdtA4re8;
    public Object NCTxEWno;
    public int P7K7Inc8;
    public PorterDuff.Mode Qr9iLBAD;
    public int VgvYg0wo;
    public ColorStateList b2ZJblxo;
    public String eVhOlqcC;
    public String jb9XjC4I;
    public int qoPGr6Ce;
    public Parcelable wxUZMvaN;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i;
        if (this.qoPGr6Ce == -1) {
            return String.valueOf(this.NCTxEWno);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.qoPGr6Ce) {
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
        switch (this.qoPGr6Ce) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.NCTxEWno).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.NCTxEWno).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.eVhOlqcC);
                sb.append(" id=");
                int i2 = this.qoPGr6Ce;
                if (i2 == -1) {
                    Object obj = this.NCTxEWno;
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = fd.NCTxEWno(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.b2ZJblxo != null) {
                            }
                            if (this.Qr9iLBAD != k3x7lurq) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.b2ZJblxo != null) {
                            }
                            if (this.Qr9iLBAD != k3x7lurq) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.b2ZJblxo != null) {
                            }
                            if (this.Qr9iLBAD != k3x7lurq) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.VgvYg0wo;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.VgvYg0wo);
                if (this.P7K7Inc8 != 0) {
                    sb.append(" off=");
                    sb.append(this.P7K7Inc8);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.NCTxEWno);
                break;
        }
        if (this.b2ZJblxo != null) {
            sb.append(" tint=");
            sb.append(this.b2ZJblxo);
        }
        if (this.Qr9iLBAD != k3x7lurq) {
            sb.append(" mode=");
            sb.append(this.Qr9iLBAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
