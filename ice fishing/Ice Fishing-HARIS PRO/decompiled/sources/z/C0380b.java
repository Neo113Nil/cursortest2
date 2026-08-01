package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import u.AbstractC0357e;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4771a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f4772b;

    /* renamed from: c, reason: collision with root package name */
    public int f4773c;

    /* renamed from: d, reason: collision with root package name */
    public float f4774d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4775f;

    /* renamed from: g, reason: collision with root package name */
    public int f4776g;

    public C0380b(C0380b c0380b, Object obj) {
        c0380b.getClass();
        this.f4772b = c0380b.f4772b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0396r.f4968d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z2 = false;
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
                z2 = true;
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
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, RecyclerView.f2111C0), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, RecyclerView.f2111C0));
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
            C0380b c0380b = new C0380b();
            c0380b.f4772b = i;
            c0380b.f4771a = z2;
            c0380b.b(obj);
            hashMap.put(str, c0380b);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC0357e.a(this.f4772b)) {
            case 0:
            case 7:
                this.f4773c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4774d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f4776g = ((Integer) obj).intValue();
                break;
            case 4:
                this.e = (String) obj;
                break;
            case 5:
                this.f4775f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4774d = ((Float) obj).floatValue();
                break;
        }
    }
}
