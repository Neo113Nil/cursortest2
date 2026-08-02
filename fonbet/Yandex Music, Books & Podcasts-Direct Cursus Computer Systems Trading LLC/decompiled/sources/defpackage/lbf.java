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
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class lbf extends caf {
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

    public lbf() {
        this.d = new HashMap();
    }

    public static void i(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // defpackage.caf
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.caf
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final caf clone() {
        lbf lbfVar = new lbf();
        super.c(this);
        lbfVar.l = this.l;
        lbfVar.m = this.m;
        lbfVar.n = this.n;
        lbfVar.o = this.o;
        lbfVar.p = this.p;
        lbfVar.q = this.q;
        lbfVar.r = this.r;
        lbfVar.e = this.e;
        lbfVar.s = this.s;
        lbfVar.t = this.t;
        lbfVar.u = this.u;
        lbfVar.v = this.v;
        lbfVar.w = this.w;
        lbfVar.x = this.x;
        lbfVar.i = this.i;
        lbfVar.j = this.j;
        lbfVar.k = this.k;
        return lbfVar;
    }

    @Override // defpackage.caf
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cen.k);
        SparseIntArray sparseIntArray = kbf.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = kbf.a;
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
                    if (rei.k1) {
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

    /* JADX WARN: Removed duplicated region for block: B:72:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, float f) {
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
            i(this.i, this.r, this.x);
            i(this.j, view, this.x);
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
            rei reiVar = (rei) view.getParent();
            pei peiVar = reiVar.J;
            CopyOnWriteArrayList copyOnWriteArrayList = reiVar.J0;
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((pei) it.next()).getClass();
                }
            }
        }
        View findViewById = this.m == -1 ? view : ((rei) view.getParent()).findViewById(this.m);
        if (z8) {
            String str = this.n;
            if (str != null) {
                h(findViewById, str);
            }
            if (this.f != -1) {
                ((rei) view.getParent()).K(this.f, findViewById);
            }
        }
        if (z7) {
            String str2 = this.o;
            if (str2 != null) {
                h(findViewById, str2);
            }
            if (this.g != -1) {
                ((rei) view.getParent()).K(this.g, findViewById);
            }
        }
        if (z) {
            String str3 = this.l;
            if (str3 != null) {
                h(findViewById, str3);
            }
            if (this.h != -1) {
                ((rei) view.getParent()).K(this.h, findViewById);
            }
        }
    }

    public final void h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
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
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + StringUtil.SPACE + irf.P(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + StringUtil.SPACE + irf.P(view));
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
                p86 p86Var = (p86) this.d.get(str2);
                if (p86Var != null) {
                    Class<?> cls = view.getClass();
                    String str3 = p86Var.b;
                    String g = !p86Var.a ? f1d.g("set", str3) : str3;
                    try {
                        int D = ouj.D(p86Var.c);
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (D) {
                            case 0:
                            case 7:
                                cls.getMethod(g, cls2).invoke(view, Integer.valueOf(p86Var.d));
                                break;
                            case 1:
                                cls.getMethod(g, cls3).invoke(view, Float.valueOf(p86Var.e));
                                break;
                            case 2:
                                cls.getMethod(g, cls2).invoke(view, Integer.valueOf(p86Var.h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(g, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(p86Var.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(g, CharSequence.class).invoke(view, p86Var.f);
                                break;
                            case 5:
                                cls.getMethod(g, Boolean.TYPE).invoke(view, Boolean.valueOf(p86Var.g));
                                break;
                            case 6:
                                cls.getMethod(g, cls3).invoke(view, Float.valueOf(p86Var.e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder u = ouj.u(" Custom Attribute \"", str3, "\" not found on ");
                        u.append(cls.getName());
                        Log.e("TransitionLayout", u.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + g, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder u2 = ouj.u(" Custom Attribute \"", str3, "\" not found on ");
                        u2.append(cls.getName());
                        Log.e("TransitionLayout", u2.toString(), e3);
                    }
                }
            }
        }
    }

    @Override // defpackage.caf
    public final void d(HashSet hashSet) {
    }
}
