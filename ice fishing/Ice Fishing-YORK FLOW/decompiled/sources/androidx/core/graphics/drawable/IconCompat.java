package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode Ns0WNyEWdPsk = android.graphics.PorterDuff.Mode.SRC_IN;
    public java.lang.String GE9mJIPrb8gP;
    public android.os.Parcelable JhCgjQRTAOCT;
    public android.graphics.PorterDuff.Mode P05cfTpS5W5L;
    public android.content.res.ColorStateList QiMR8OkAhezm;
    public int WDYagTQQm9ns;
    public int ZpBGe2uQfcn8;
    public java.lang.String e6mdH7fiFuta;
    public byte[] fWTAfUmVKrZq;
    public java.lang.Object giKS3J6vZuNy;
    public int oh71FJcDz6S2;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        java.lang.String str;
        int i;
        if (this.ZpBGe2uQfcn8 == -1) {
            return java.lang.String.valueOf(this.giKS3J6vZuNy);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        switch (this.ZpBGe2uQfcn8) {
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
        switch (this.ZpBGe2uQfcn8) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.giKS3J6vZuNy).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.giKS3J6vZuNy).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.GE9mJIPrb8gP);
                sb.append(" id=");
                int i2 = this.ZpBGe2uQfcn8;
                if (i2 == -1) {
                    java.lang.Object obj = this.giKS3J6vZuNy;
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        i = defpackage.uq.fWTAfUmVKrZq(obj);
                    } else {
                        try {
                            i = ((java.lang.Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (java.lang.IllegalAccessException e) {
                            android.util.Log.e("IconCompat", "Unable to get icon resource", e);
                            i = 0;
                            sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                            if (this.QiMR8OkAhezm != null) {
                            }
                            if (this.P05cfTpS5W5L != Ns0WNyEWdPsk) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (java.lang.NoSuchMethodException e2) {
                            android.util.Log.e("IconCompat", "Unable to get icon resource", e2);
                            i = 0;
                            sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                            if (this.QiMR8OkAhezm != null) {
                            }
                            if (this.P05cfTpS5W5L != Ns0WNyEWdPsk) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (java.lang.reflect.InvocationTargetException e3) {
                            android.util.Log.e("IconCompat", "Unable to get icon resource", e3);
                            i = 0;
                            sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                            if (this.QiMR8OkAhezm != null) {
                            }
                            if (this.P05cfTpS5W5L != Ns0WNyEWdPsk) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("called getResId() on " + this);
                    }
                    i = this.WDYagTQQm9ns;
                }
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(i)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.WDYagTQQm9ns);
                if (this.oh71FJcDz6S2 != 0) {
                    sb.append(" off=");
                    sb.append(this.oh71FJcDz6S2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.giKS3J6vZuNy);
                break;
        }
        if (this.QiMR8OkAhezm != null) {
            sb.append(" tint=");
            sb.append(this.QiMR8OkAhezm);
        }
        if (this.P05cfTpS5W5L != Ns0WNyEWdPsk) {
            sb.append(" mode=");
            sb.append(this.P05cfTpS5W5L);
        }
        sb.append(")");
        return sb.toString();
    }
}
