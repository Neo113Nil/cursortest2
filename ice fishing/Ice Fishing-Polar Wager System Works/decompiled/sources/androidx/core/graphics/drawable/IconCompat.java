package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode ez2rX8ReCYw = android.graphics.PorterDuff.Mode.SRC_IN;
    public android.content.res.ColorStateList AARZUJiTa;
    public android.graphics.PorterDuff.Mode EXtogiMhuM;
    public android.os.Parcelable F7NU4MC0GW;
    public int IHQe1A4L2xu;
    public java.lang.String SH1y5HwkJhh;
    public int adDC3e2L;
    public java.lang.Object oh6vYeIP;
    public byte[] r1MBDhnF;
    public java.lang.String riuEU0zW4;
    public int xiZrDbcSW0;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        java.lang.String str;
        int i;
        if (this.IHQe1A4L2xu == -1) {
            return java.lang.String.valueOf(this.oh6vYeIP);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        switch (this.IHQe1A4L2xu) {
            case 1:
                str = "BITMAP";
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.IHQe1A4L2xu) {
            case 1:
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.oh6vYeIP).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.oh6vYeIP).getHeight());
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.SH1y5HwkJhh);
                sb.append(" id=");
                int i2 = this.IHQe1A4L2xu;
                if (i2 == -1) {
                    java.lang.Object obj = this.oh6vYeIP;
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        i = defpackage.cq.r1MBDhnF(obj);
                    } else {
                        try {
                            i = ((java.lang.Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (java.lang.IllegalAccessException e) {
                            android.util.Log.e("IconCompat", "Unable to get icon resource", e);
                            i = 0;
                            sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                            if (this.AARZUJiTa != null) {
                            }
                            if (this.EXtogiMhuM != ez2rX8ReCYw) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (java.lang.NoSuchMethodException e2) {
                            android.util.Log.e("IconCompat", "Unable to get icon resource", e2);
                            i = 0;
                            sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                            if (this.AARZUJiTa != null) {
                            }
                            if (this.EXtogiMhuM != ez2rX8ReCYw) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (java.lang.reflect.InvocationTargetException e3) {
                            android.util.Log.e("IconCompat", "Unable to get icon resource", e3);
                            i = 0;
                            sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                            if (this.AARZUJiTa != null) {
                            }
                            if (this.EXtogiMhuM != ez2rX8ReCYw) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("called getResId() on " + this);
                    }
                    i = this.adDC3e2L;
                }
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.adDC3e2L);
                if (this.xiZrDbcSW0 != 0) {
                    sb.append(" off=");
                    sb.append(this.xiZrDbcSW0);
                    break;
                }
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.oh6vYeIP);
                break;
        }
        if (this.AARZUJiTa != null) {
            sb.append(" tint=");
            sb.append(this.AARZUJiTa);
        }
        if (this.EXtogiMhuM != ez2rX8ReCYw) {
            sb.append(" mode=");
            sb.append(this.EXtogiMhuM);
        }
        sb.append(")");
        return sb.toString();
    }
}
