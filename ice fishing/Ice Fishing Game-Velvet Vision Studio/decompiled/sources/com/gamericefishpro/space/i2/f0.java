package com.gamericefishpro.space.i2;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements y1 {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(com.gamericefishpro.space.o2.o oVar) {
        return !oVar.k().d.c(com.gamericefishpro.space.o2.s.i);
    }

    public static final boolean c(com.gamericefishpro.space.o2.o oVar, Resources resources) {
        Object objG = oVar.d.d.g(com.gamericefishpro.space.o2.s.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !com.gamericefishpro.space.o2.r.e(oVar) && (oVar.d.i || (oVar.o() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || i(oVar) != null || h(oVar, resources) != null || g(oVar))));
    }

    public static final void d(com.gamericefishpro.space.e4.h hVar, com.gamericefishpro.space.o2.o oVar) {
        com.gamericefishpro.space.o2.l lVar = oVar.d;
        com.gamericefishpro.space.t.h0 h0Var = lVar.d;
        Object objG = lVar.d.g(com.gamericefishpro.space.o2.s.x);
        if (objG == null) {
            objG = null;
        }
        com.gamericefishpro.space.o2.h hVar2 = (com.gamericefishpro.space.o2.h) objG;
        if (b(oVar)) {
            if (hVar2 != null && hVar2.a == 8) {
                return;
            }
            Object objG2 = h0Var.g(com.gamericefishpro.space.o2.k.x);
            if (objG2 == null) {
                objG2 = null;
            }
            com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) objG2;
            if (aVar != null) {
                hVar.b(new com.gamericefishpro.space.e4.d(R.id.accessibilityActionPageUp, aVar.a));
            }
            Object objG3 = h0Var.g(com.gamericefishpro.space.o2.k.z);
            if (objG3 == null) {
                objG3 = null;
            }
            com.gamericefishpro.space.o2.a aVar2 = (com.gamericefishpro.space.o2.a) objG3;
            if (aVar2 != null) {
                hVar.b(new com.gamericefishpro.space.e4.d(R.id.accessibilityActionPageDown, aVar2.a));
            }
            Object objG4 = h0Var.g(com.gamericefishpro.space.o2.k.y);
            if (objG4 == null) {
                objG4 = null;
            }
            com.gamericefishpro.space.o2.a aVar3 = (com.gamericefishpro.space.o2.a) objG4;
            if (aVar3 != null) {
                hVar.b(new com.gamericefishpro.space.e4.d(R.id.accessibilityActionPageLeft, aVar3.a));
            }
            Object objG5 = h0Var.g(com.gamericefishpro.space.o2.k.A);
            com.gamericefishpro.space.o2.a aVar4 = (com.gamericefishpro.space.o2.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                hVar.b(new com.gamericefishpro.space.e4.d(R.id.accessibilityActionPageRight, aVar4.a));
            }
        }
    }

    public static final boolean e(Object obj) {
        if (obj instanceof com.gamericefishpro.space.f1.q) {
            com.gamericefishpro.space.f1.q qVar = (com.gamericefishpro.space.f1.q) obj;
            if (qVar.a() == com.gamericefishpro.space.t0.f.v || qVar.a() == com.gamericefishpro.space.t0.f.z || qVar.a() == com.gamericefishpro.space.t0.f.w) {
                Object value = qVar.getValue();
                if (value == null) {
                    return true;
                }
                return e(value);
            }
        } else {
            if ((obj instanceof com.gamericefishpro.space.oh.d) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float f(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final boolean g(com.gamericefishpro.space.o2.o oVar) {
        Object objG = oVar.d.d.g(com.gamericefishpro.space.o2.s.H);
        if (objG == null) {
            objG = null;
        }
        com.gamericefishpro.space.q2.a aVar = (com.gamericefishpro.space.q2.a) objG;
        com.gamericefishpro.space.t.h0 h0Var = oVar.d.d;
        Object objG2 = h0Var.g(com.gamericefishpro.space.o2.s.x);
        if (objG2 == null) {
            objG2 = null;
        }
        com.gamericefishpro.space.o2.h hVar = (com.gamericefishpro.space.o2.h) objG2;
        boolean z = aVar != null;
        Object objG3 = h0Var.g(com.gamericefishpro.space.o2.s.G);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (hVar != null && hVar.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String h(com.gamericefishpro.space.o2.o oVar, Resources resources) {
        com.gamericefishpro.space.o2.l lVar = oVar.d;
        com.gamericefishpro.space.o2.l lVar2 = oVar.d;
        Object objG = lVar.d.g(com.gamericefishpro.space.o2.s.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        com.gamericefishpro.space.t.h0 h0Var = lVar2.d;
        Object objG2 = h0Var.g(com.gamericefishpro.space.o2.s.H);
        if (objG2 == null) {
            objG2 = null;
        }
        com.gamericefishpro.space.q2.a aVar = (com.gamericefishpro.space.q2.a) objG2;
        Object objG3 = h0Var.g(com.gamericefishpro.space.o2.s.x);
        if (objG3 == null) {
            objG3 = null;
        }
        com.gamericefishpro.space.o2.h hVar = (com.gamericefishpro.space.o2.h) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    if (objG == null) {
                        objG = resources.getString(com.gamericefishpro.space.R.string.indeterminate);
                    }
                } else if (hVar != null && hVar.a == 2 && objG == null) {
                    objG = resources.getString(com.gamericefishpro.space.R.string.state_off);
                }
            } else if (hVar != null && hVar.a == 2 && objG == null) {
                objG = resources.getString(com.gamericefishpro.space.R.string.state_on);
            }
        }
        Object objG4 = h0Var.g(com.gamericefishpro.space.o2.s.G);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((hVar == null || hVar.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.gamericefishpro.space.R.string.selected) : resources.getString(com.gamericefishpro.space.R.string.not_selected);
            }
        }
        Object objG5 = h0Var.g(com.gamericefishpro.space.o2.s.c);
        if (objG5 == null) {
            objG5 = null;
        }
        com.gamericefishpro.space.o2.g gVar = (com.gamericefishpro.space.o2.g) objG5;
        if (gVar != null) {
            if (gVar != com.gamericefishpro.space.o2.g.b) {
                if (objG == null) {
                    objG = resources.getString(com.gamericefishpro.space.R.string.template_percent, 0);
                }
            } else if (objG == null) {
                objG = resources.getString(com.gamericefishpro.space.R.string.in_progress);
            }
        }
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.E;
        if (h0Var.c(vVar)) {
            com.gamericefishpro.space.t.h0 h0Var2 = new com.gamericefishpro.space.o2.o(oVar.a, true, oVar.c, lVar2).k().d;
            Object objG6 = h0Var2.g(com.gamericefishpro.space.o2.s.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = h0Var2.g(com.gamericefishpro.space.o2.s.A);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = h0Var2.g(vVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.gamericefishpro.space.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final com.gamericefishpro.space.r2.e i(com.gamericefishpro.space.o2.o oVar) {
        com.gamericefishpro.space.o2.l lVar = oVar.d;
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.a;
        com.gamericefishpro.space.r2.e eVar = (com.gamericefishpro.space.r2.e) com.gamericefishpro.space.o2.r.d(lVar, com.gamericefishpro.space.o2.s.E);
        List list = (List) com.gamericefishpro.space.o2.r.d(oVar.d, com.gamericefishpro.space.o2.s.A);
        return eVar == null ? list != null ? (com.gamericefishpro.space.r2.e) CollectionsKt.firstOrNull(list) : null : eVar;
    }

    public static boolean j() {
        try {
            if (t.c1 == null) {
                t.c1 = Class.forName("android.os.SystemProperties");
            }
            if (t.d1 == null) {
                Class cls = t.c1;
                t.d1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = t.d1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final com.gamericefishpro.space.r2.f0 k(com.gamericefishpro.space.o2.l lVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object objG = lVar.d.g(com.gamericefishpro.space.o2.k.a);
        if (objG == null) {
            objG = null;
        }
        com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) objG;
        if (aVar == null || (function1 = (Function1) aVar.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (com.gamericefishpro.space.r2.f0) arrayList.get(0);
    }

    public static final boolean l(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final boolean m(float f, float f2, com.gamericefishpro.space.o1.h hVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        com.gamericefishpro.space.o1.h hVarA = com.gamericefishpro.space.o1.j.a();
        com.gamericefishpro.space.o1.e0[] e0VarArr = com.gamericefishpro.space.o1.e0.d;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            com.gamericefishpro.space.o1.j.b("Invalid rectangle, make sure no value is NaN");
        }
        if (hVarA.b == null) {
            hVarA.b = new RectF();
        }
        RectF rectF = hVarA.b;
        Intrinsics.b(rectF);
        rectF.set(f3, f4, f5, f6);
        Path path = hVarA.a;
        RectF rectF2 = hVarA.b;
        Intrinsics.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        com.gamericefishpro.space.o1.h hVarA2 = com.gamericefishpro.space.o1.j.a();
        hVarA2.e(hVar, hVarA, 1);
        boolean zIsEmpty = hVarA2.a.isEmpty();
        hVarA2.f();
        hVarA.f();
        return !zIsEmpty;
    }

    public static final boolean n(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void o(float[] fArr, float[] fArr2) {
        float f = f(fArr2, 0, fArr, 0);
        float f2 = f(fArr2, 0, fArr, 1);
        float f3 = f(fArr2, 0, fArr, 2);
        float f4 = f(fArr2, 0, fArr, 3);
        float f5 = f(fArr2, 1, fArr, 0);
        float f6 = f(fArr2, 1, fArr, 1);
        float f7 = f(fArr2, 1, fArr, 2);
        float f8 = f(fArr2, 1, fArr, 3);
        float f9 = f(fArr2, 2, fArr, 0);
        float f10 = f(fArr2, 2, fArr, 1);
        float f11 = f(fArr2, 2, fArr, 2);
        float f12 = f(fArr2, 2, fArr, 3);
        float f13 = f(fArr2, 3, fArr, 0);
        float f14 = f(fArr2, 3, fArr, 1);
        float f15 = f(fArr2, 3, fArr, 2);
        float f16 = f(fArr2, 3, fArr, 3);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        fArr[9] = f10;
        fArr[10] = f11;
        fArr[11] = f12;
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static final com.gamericefishpro.space.f3.j p(q0 q0Var, int i) {
        Object next;
        Iterator<T> it = q0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.gamericefishpro.space.h2.f0) ((Map.Entry) next).getKey()).e != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (com.gamericefishpro.space.f3.j) entry.getValue();
        }
        return null;
    }

    public static final String q(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        sb.append(str);
        return sb.toString();
    }

    public static final String r(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
