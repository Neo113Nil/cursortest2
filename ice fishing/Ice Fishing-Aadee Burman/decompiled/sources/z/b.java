package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f42003a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f42004b;

    /* renamed from: c, reason: collision with root package name */
    public int f42005c;

    /* renamed from: d, reason: collision with root package name */
    public float f42006d;

    /* renamed from: e, reason: collision with root package name */
    public String f42007e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42008f;

    /* renamed from: g, reason: collision with root package name */
    public int f42009g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f42004b = bVar.f42004b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f42212d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z3 = false;
        Object obj = null;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            int i9 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z3 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i10 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i10 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i10 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i9 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i9;
                            }
                        }
                        i = 7;
                    }
                }
                i = i10;
            }
        }
        if (str != null && obj != null) {
            b bVar = new b();
            bVar.f42004b = i;
            bVar.f42003a = z3;
            bVar.b(obj);
            hashMap.put(str, bVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC5049e.d(this.f42004b)) {
            case 0:
            case 7:
                this.f42005c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f42006d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f42009g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f42007e = (String) obj;
                break;
            case 5:
                this.f42008f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f42006d = ((Float) obj).floatValue();
                break;
        }
    }
}
