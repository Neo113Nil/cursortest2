package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f41977a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f41978b;

    /* renamed from: c, reason: collision with root package name */
    public int f41979c;

    /* renamed from: d, reason: collision with root package name */
    public float f41980d;

    /* renamed from: e, reason: collision with root package name */
    public String f41981e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41982f;

    /* renamed from: g, reason: collision with root package name */
    public int f41983g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f41978b = bVar.f41978b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f42186d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z6 = false;
        Object obj = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i6 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z6 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i9 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i9 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i9 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i6 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i6;
                            }
                        }
                        i = 7;
                    }
                }
                i = i9;
            }
        }
        if (str != null && obj != null) {
            b bVar = new b();
            bVar.f41978b = i;
            bVar.f41977a = z6;
            bVar.b(obj);
            hashMap.put(str, bVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC5050e.d(this.f41978b)) {
            case 0:
            case 7:
                this.f41979c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f41980d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f41983g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f41981e = (String) obj;
                break;
            case 5:
                this.f41982f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f41980d = ((Float) obj).floatValue();
                break;
        }
    }
}
