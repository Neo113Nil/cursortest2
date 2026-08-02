package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class p86 {
    public boolean a = false;
    public String b;
    public int c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public p86(p86 p86Var, Object obj) {
        this.b = p86Var.b;
        this.c = p86Var.c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), cen.f);
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
            p86 p86Var = new p86();
            p86Var.b = str;
            p86Var.c = i;
            p86Var.a = z;
            p86Var.f(obj);
            hashMap.put(str, p86Var);
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            p86 p86Var = (p86) hashMap.get(str);
            String g = !p86Var.a ? f1d.g("set", str) : str;
            try {
                int D = ouj.D(p86Var.c);
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (D) {
                    case 0:
                        cls.getMethod(g, cls3).invoke(view, Integer.valueOf(p86Var.d));
                        break;
                    case 1:
                        cls.getMethod(g, cls2).invoke(view, Float.valueOf(p86Var.e));
                        break;
                    case 2:
                        cls.getMethod(g, cls3).invoke(view, Integer.valueOf(p86Var.h));
                        break;
                    case 3:
                        Method method = cls.getMethod(g, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(p86Var.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(g, CharSequence.class).invoke(view, p86Var.f);
                        break;
                    case 5:
                        cls.getMethod(g, Boolean.TYPE).invoke(view, Boolean.valueOf(p86Var.g));
                        break;
                    case 6:
                        cls.getMethod(g, cls2).invoke(view, Float.valueOf(p86Var.e));
                        break;
                    case 7:
                        cls.getMethod(g, cls3).invoke(view, Integer.valueOf(p86Var.d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder u = ouj.u(" Custom Attribute \"", str, "\" not found on ");
                u.append(cls.getName());
                Log.e("TransitionLayout", u.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + g, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder u2 = ouj.u(" Custom Attribute \"", str, "\" not found on ");
                u2.append(cls.getName());
                Log.e("TransitionLayout", u2.toString(), e3);
            }
        }
    }

    public final float a() {
        switch (ouj.D(this.c)) {
            case 2:
            case 3:
                wvs.p("Color does not have a single color to interpolate");
                break;
            case 4:
                wvs.p("Cannot interpolate String");
                break;
            case 5:
                if (this.g) {
                }
                break;
        }
        return 0.0f;
    }

    public final void b(float[] fArr) {
        switch (ouj.D(this.c)) {
            case 0:
                fArr[0] = this.d;
                break;
            case 1:
                fArr[0] = this.e;
                break;
            case 2:
            case 3:
                int i = this.h;
                int i2 = (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i3 = (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i4 = (i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i5 = i & KotlinVersion.MAX_COMPONENT_VALUE;
                float pow = (float) Math.pow(i3 / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(i4 / 255.0f, 2.2d);
                float pow3 = (float) Math.pow(i5 / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i2 / 255.0f;
                break;
            case 4:
                wvs.p("Color does not have a single color to interpolate");
                break;
            case 5:
                fArr[0] = this.g ? 1.0f : 0.0f;
                break;
            case 6:
                fArr[0] = this.e;
                break;
        }
    }

    public final int c() {
        int D = ouj.D(this.c);
        return (D == 2 || D == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (ouj.D(this.c)) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
