package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class qjx extends jhx {
    public float w;
    public float e = 0.1f;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public RectF i = new RectF();
    public RectF j = new RectF();
    public HashMap k = new HashMap();
    public String l = null;
    public int m = -1;
    public String n = null;
    public String o = null;
    public int p = -1;
    public int q = -1;
    public View r = null;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public float v = Float.NaN;
    public boolean x = false;

    public qjx() {
        this.d = new HashMap();
    }

    public static void j(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // defpackage.jhx
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.jhx
    /* renamed from: b */
    public final jhx clone() {
        qjx qjxVar = new qjx();
        super.c(this);
        qjxVar.l = this.l;
        qjxVar.m = this.m;
        qjxVar.n = this.n;
        qjxVar.o = this.o;
        qjxVar.p = this.p;
        qjxVar.q = this.q;
        qjxVar.r = this.r;
        qjxVar.e = this.e;
        qjxVar.s = this.s;
        qjxVar.t = this.t;
        qjxVar.u = this.u;
        qjxVar.v = this.v;
        qjxVar.w = this.w;
        qjxVar.x = this.x;
        qjxVar.i = this.i;
        qjxVar.j = this.j;
        qjxVar.k = this.k;
        return qjxVar;
    }

    @Override // defpackage.jhx
    public final void d(HashSet hashSet) {
    }

    @Override // defpackage.jhx
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.KeyTrigger);
        SparseIntArray sparseIntArray = pjx.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = pjx.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.n = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.o = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.l = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.p = obtainStyledAttributes.getResourceId(index, this.p);
                    break;
                case 7:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.q = obtainStyledAttributes.getResourceId(index, this.q);
                    break;
                case 10:
                    this.x = obtainStyledAttributes.getBoolean(index, this.x);
                    break;
                case 11:
                    this.m = obtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case 12:
                    this.h = obtainStyledAttributes.getResourceId(index, this.h);
                    break;
                case 13:
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case 14:
                    this.g = obtainStyledAttributes.getResourceId(index, this.g);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        if (this.q != -1) {
            if (this.r == null) {
                this.r = ((ViewGroup) view.getParent()).findViewById(this.q);
            }
            j(this.i, this.r, this.x);
            j(this.j, view, this.x);
            boolean intersect = this.i.intersect(this.j);
            boolean z9 = this.s;
            if (intersect) {
                if (z9) {
                    this.s = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.u) {
                    this.u = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.t = true;
            } else {
                if (z9) {
                    z = false;
                } else {
                    this.s = true;
                    z = true;
                }
                if (this.t) {
                    this.t = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.u = true;
                boolean z10 = z5;
                z6 = false;
                z8 = z10;
            }
            z7 = z6;
        } else {
            boolean z11 = this.s;
            float f2 = this.v;
            if (z11) {
                if ((this.w - f2) * (f - f2) < 0.0f) {
                    this.s = false;
                    z = true;
                    z2 = this.t;
                    float f3 = this.v;
                    if (!z2) {
                        float f4 = f - f3;
                        if ((this.w - f3) * f4 < 0.0f && f4 < 0.0f) {
                            this.t = false;
                            z3 = true;
                            z4 = this.u;
                            float f5 = this.v;
                            if (z4) {
                                float f6 = f - f5;
                                if ((this.w - f5) * f6 < 0.0f && f6 > 0.0f) {
                                    this.u = false;
                                    z8 = z3;
                                }
                            } else if (Math.abs(f - f5) > this.e) {
                                this.u = true;
                            }
                            z7 = false;
                            z8 = z3;
                        }
                    } else if (Math.abs(f - f3) > this.e) {
                        this.t = true;
                    }
                    z3 = false;
                    z4 = this.u;
                    float f52 = this.v;
                    if (z4) {
                    }
                    z7 = false;
                    z8 = z3;
                }
            } else if (Math.abs(f - f2) > this.e) {
                this.s = true;
            }
            z = false;
            z2 = this.t;
            float f32 = this.v;
            if (!z2) {
            }
            z3 = false;
            z4 = this.u;
            float f522 = this.v;
            if (z4) {
            }
            z7 = false;
            z8 = z3;
        }
        this.w = f;
        if (z8 || z || z7) {
            ((MotionLayout) view.getParent()).fireTrigger(this.p, z7, f);
        }
        View findViewById = this.m == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.m);
        if (z8) {
            String str = this.n;
            if (str != null) {
                i(findViewById, str);
            }
            if (this.f != -1) {
                ((MotionLayout) view.getParent()).viewTransition(this.f, findViewById);
            }
        }
        if (z7) {
            String str2 = this.o;
            if (str2 != null) {
                i(findViewById, str2);
            }
            if (this.g != -1) {
                ((MotionLayout) view.getParent()).viewTransition(this.g, findViewById);
            }
        }
        if (z) {
            String str3 = this.l;
            if (str3 != null) {
                i(findViewById, str3);
            }
            if (this.h != -1) {
                ((MotionLayout) view.getParent()).viewTransition(this.h, findViewById);
            }
        }
    }

    public final void i(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(Extension.DOT_CHAR)) {
            if (this.k.containsKey(str)) {
                method = (Method) this.k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + rug.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + " " + rug.d(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                c7e c7eVar = (c7e) this.d.get(str2);
                if (c7eVar != null) {
                    Class<?> cls = view.getClass();
                    String str3 = c7eVar.b;
                    String o = !c7eVar.a ? g8e.o("set", str3) : str3;
                    try {
                        int ordinal = c7eVar.c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (ordinal) {
                            case 0:
                            case 7:
                                cls.getMethod(o, cls2).invoke(view, Integer.valueOf(c7eVar.d));
                                break;
                            case 1:
                                cls.getMethod(o, cls3).invoke(view, Float.valueOf(c7eVar.e));
                                break;
                            case 2:
                                cls.getMethod(o, cls2).invoke(view, Integer.valueOf(c7eVar.h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(o, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(c7eVar.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(o, CharSequence.class).invoke(view, c7eVar.f);
                                break;
                            case 5:
                                cls.getMethod(o, Boolean.TYPE).invoke(view, Boolean.valueOf(c7eVar.g));
                                break;
                            case 6:
                                cls.getMethod(o, cls3).invoke(view, Float.valueOf(c7eVar.e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder x = unr0.x(" Custom Attribute \"", str3, "\" not found on ");
                        x.append(cls.getName());
                        Log.e("TransitionLayout", x.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + o, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder x2 = unr0.x(" Custom Attribute \"", str3, "\" not found on ");
                        x2.append(cls.getName());
                        Log.e("TransitionLayout", x2.toString(), e3);
                    }
                }
            }
        }
    }
}
