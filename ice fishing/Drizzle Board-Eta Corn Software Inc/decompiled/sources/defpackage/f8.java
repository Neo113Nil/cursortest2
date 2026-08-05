package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f8 {
    public int MdtA4re8;
    public int NCTxEWno;
    public boolean P7K7Inc8;
    public String VgvYg0wo;
    public int b2ZJblxo;
    public boolean qoPGr6Ce = false;
    public float wxUZMvaN;

    public f8(f8 f8Var, Object obj) {
        f8Var.getClass();
        this.NCTxEWno = f8Var.NCTxEWno;
        NCTxEWno(obj);
    }

    public static void qoPGr6Ce(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r00.wxUZMvaN);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (str != null && obj != null) {
            f8 f8Var = new f8();
            f8Var.NCTxEWno = i;
            f8Var.qoPGr6Ce = z;
            f8Var.NCTxEWno(obj);
            hashMap.put(str, f8Var);
        }
        obtainStyledAttributes.recycle();
    }

    public final void NCTxEWno(Object obj) {
        switch (q70.k3x7lurq(this.NCTxEWno)) {
            case 0:
            case 7:
                this.MdtA4re8 = ((Integer) obj).intValue();
                break;
            case 1:
                this.wxUZMvaN = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.b2ZJblxo = ((Integer) obj).intValue();
                break;
            case 4:
                this.VgvYg0wo = (String) obj;
                break;
            case 5:
                this.P7K7Inc8 = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.wxUZMvaN = ((Float) obj).floatValue();
                break;
        }
    }
}
