package y1;

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
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f8505a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean f(e2.n nVar) {
        e2.j k3 = nVar.k();
        return !k3.f1985g.c(e2.s.f2033i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View g(View view, View view2, int i10) {
        int nextFocusForwardId;
        View l10;
        if (i10 != 1) {
            if (i10 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                a0.w wVar = new a0.w(nextFocusForwardId, 2);
                View view3 = null;
                while (true) {
                    l10 = l(view, wVar, view3);
                    if (l10 != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return l10;
            }
        } else if (view.getId() != -1) {
            b0.l0 l0Var = new b0.l0(24, view2, view);
            View view5 = null;
            while (true) {
                View l11 = l(view, l0Var, view5);
                if (l11 != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static final boolean h(e2.n nVar, Resources resources) {
        Object g8 = nVar.f1996d.f1985g.g(e2.s.f2025a);
        if (g8 == null) {
            g8 = null;
        }
        List list = (List) g8;
        return !e2.q.e(nVar) && (nVar.f1996d.f1987i || (nVar.o() && ((list != null ? (String) bc.m.U(list) : null) != null || o(nVar) != null || n(nVar, resources) != null || m(nVar))));
    }

    public static final void i(e2.n nVar, i3.d dVar) {
        e2.j jVar = nVar.f1996d;
        s.g0 g0Var = jVar.f1985g;
        Object g8 = jVar.f1985g.g(e2.s.f2046v);
        if (g8 == null) {
            g8 = null;
        }
        e2.g gVar = (e2.g) g8;
        if (f(nVar)) {
            if (gVar != null && gVar.f1956a == 8) {
                return;
            }
            Object g10 = g0Var.g(e2.i.f1981w);
            if (g10 == null) {
                g10 = null;
            }
            e2.a aVar = (e2.a) g10;
            if (aVar != null) {
                dVar.a(new i3.c(null, R.id.accessibilityActionPageUp, aVar.f1944a, null));
            }
            Object g11 = g0Var.g(e2.i.f1983y);
            if (g11 == null) {
                g11 = null;
            }
            e2.a aVar2 = (e2.a) g11;
            if (aVar2 != null) {
                dVar.a(new i3.c(null, R.id.accessibilityActionPageDown, aVar2.f1944a, null));
            }
            Object g12 = g0Var.g(e2.i.f1982x);
            if (g12 == null) {
                g12 = null;
            }
            e2.a aVar3 = (e2.a) g12;
            if (aVar3 != null) {
                dVar.a(new i3.c(null, R.id.accessibilityActionPageLeft, aVar3.f1944a, null));
            }
            Object g13 = g0Var.g(e2.i.f1984z);
            if (g13 == null) {
                g13 = null;
            }
            e2.a aVar4 = (e2.a) g13;
            if (aVar4 != null) {
                dVar.a(new i3.c(null, R.id.accessibilityActionPageRight, aVar4.f1944a, null));
            }
        }
    }

    public static final boolean j(Object obj) {
        if (obj instanceof w0.n) {
            w0.n nVar = (w0.n) obj;
            if (nVar.d() == m0.z0.f4841i || nVar.d() == m0.z0.f4844l || nVar.d() == m0.z0.f4842j) {
                Object value = nVar.getValue();
                if (value == null) {
                    return true;
                }
                return j(value);
            }
        } else {
            if ((obj instanceof ac.c) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f8505a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float k(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final View l(View view, oc.c cVar, View view2) {
        View l10;
        if (((Boolean) cVar.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != view2 && (l10 = l(childAt, cVar, view2)) != null) {
                return l10;
            }
        }
        return null;
    }

    public static final boolean m(e2.n nVar) {
        Object g8 = nVar.f1996d.f1985g.g(e2.s.F);
        if (g8 == null) {
            g8 = null;
        }
        g2.a aVar = (g2.a) g8;
        s.g0 g0Var = nVar.f1996d.f1985g;
        Object g10 = g0Var.g(e2.s.f2046v);
        if (g10 == null) {
            g10 = null;
        }
        e2.g gVar = (e2.g) g10;
        boolean z10 = aVar != null;
        Object g11 = g0Var.g(e2.s.E);
        if (((Boolean) (g11 != null ? g11 : null)) == null || (gVar != null && gVar.f1956a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String n(e2.n nVar, Resources resources) {
        e2.j jVar = nVar.f1996d;
        e2.j jVar2 = nVar.f1996d;
        Object g8 = jVar.f1985g.g(e2.s.f2026b);
        String str = null;
        if (g8 == null) {
            g8 = null;
        }
        s.g0 g0Var = jVar2.f1985g;
        Object g10 = g0Var.g(e2.s.F);
        if (g10 == null) {
            g10 = null;
        }
        g2.a aVar = (g2.a) g10;
        Object g11 = g0Var.g(e2.s.f2046v);
        if (g11 == null) {
            g11 = null;
        }
        e2.g gVar = (e2.g) g11;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new ac.d();
                    }
                    if (g8 == null) {
                        g8 = resources.getString(org.fortheloss.st.R.string.indeterminate);
                    }
                } else if (gVar != null && gVar.f1956a == 2 && g8 == null) {
                    g8 = resources.getString(org.fortheloss.st.R.string.state_off);
                }
            } else if (gVar != null && gVar.f1956a == 2 && g8 == null) {
                g8 = resources.getString(org.fortheloss.st.R.string.state_on);
            }
        }
        Object g12 = g0Var.g(e2.s.E);
        if (g12 == null) {
            g12 = null;
        }
        Boolean bool = (Boolean) g12;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f1956a != 4) && g8 == null) {
                g8 = booleanValue ? resources.getString(org.fortheloss.st.R.string.selected) : resources.getString(org.fortheloss.st.R.string.not_selected);
            }
        }
        Object g13 = g0Var.g(e2.s.f2027c);
        if (g13 == null) {
            g13 = null;
        }
        e2.f fVar = (e2.f) g13;
        if (fVar != null) {
            if (fVar != e2.f.f1954b) {
                if (g8 == null) {
                    uc.a aVar2 = fVar.f1955a;
                    float f10 = aVar2.f6734b;
                    float f11 = aVar2.f6733a;
                    float f12 = f10 - f11 == 0.0f ? 0.0f : (0.0f - f11) / (f10 - f11);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    g8 = resources.getString(org.fortheloss.st.R.string.template_percent, Integer.valueOf(f12 == 0.0f ? 0 : f12 == 1.0f ? 100 : uc.e.h(Math.round(f12 * 100), 1, 99)));
                }
            } else if (g8 == null) {
                g8 = resources.getString(org.fortheloss.st.R.string.in_progress);
            }
        }
        e2.v vVar = e2.s.C;
        if (g0Var.c(vVar)) {
            s.g0 g0Var2 = new e2.n(nVar.f1993a, true, nVar.f1995c, jVar2).k().f1985g;
            Object g14 = g0Var2.g(e2.s.f2025a);
            if (g14 == null) {
                g14 = null;
            }
            Collection collection = (Collection) g14;
            if (collection == null || collection.isEmpty()) {
                Object g15 = g0Var2.g(e2.s.f2049y);
                if (g15 == null) {
                    g15 = null;
                }
                Collection collection2 = (Collection) g15;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g16 = g0Var2.g(vVar);
                    if (g16 == null) {
                        g16 = null;
                    }
                    CharSequence charSequence = (CharSequence) g16;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(org.fortheloss.st.R.string.state_empty);
                    }
                }
            }
            g8 = str;
        }
        return (String) g8;
    }

    public static final h2.e o(e2.n nVar) {
        e2.j jVar = nVar.f1996d;
        e2.v vVar = e2.s.f2025a;
        h2.e eVar = (h2.e) e2.q.d(jVar, e2.s.C);
        List list = (List) e2.q.d(nVar.f1996d, e2.s.f2049y);
        return eVar == null ? list != null ? (h2.e) bc.m.U(list) : null : eVar;
    }

    public static boolean p() {
        try {
            if (r.L0 == null) {
                r.L0 = Class.forName("android.os.SystemProperties");
            }
            if (r.M0 == null) {
                Class cls = r.L0;
                r.M0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = r.M0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return pc.j.a(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final h2.e0 q(e2.j jVar) {
        oc.c cVar;
        ArrayList arrayList = new ArrayList();
        Object g8 = jVar.f1985g.g(e2.i.f1959a);
        if (g8 == null) {
            g8 = null;
        }
        e2.a aVar = (e2.a) g8;
        if (aVar == null || (cVar = (oc.c) aVar.f1945b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (h2.e0) arrayList.get(0);
    }

    public static final boolean r(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
            fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
            fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
            fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
            float f40 = -f14;
            fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
            fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
            float f41 = -f22;
            fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
            fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
            fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
            fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
            fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
            fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
            fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
            fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
            fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
            fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        }
        return !(f38 == 0.0f);
    }

    public static final boolean s(float f10, float f11, f1.i iVar) {
        float f12 = f10 - 0.005f;
        float f13 = f11 - 0.005f;
        float f14 = f10 + 0.005f;
        float f15 = f11 + 0.005f;
        f1.i a6 = f1.k.a();
        if (Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15)) {
            f1.k.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a6.f2262b == null) {
            a6.f2262b = new RectF();
        }
        RectF rectF = a6.f2262b;
        pc.j.b(rectF);
        rectF.set(f12, f13, f14, f15);
        Path path = a6.f2261a;
        RectF rectF2 = a6.f2262b;
        pc.j.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        f1.i a8 = f1.k.a();
        a8.c(iVar, a6, 1);
        boolean isEmpty = a8.f2261a.isEmpty();
        a8.d();
        a6.d();
        return !isEmpty;
    }

    public static final boolean t(float f10, float f11, float f12, float f13, long j3) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return ((f15 * f15) / (intBitsToFloat2 * intBitsToFloat2)) + ((f14 * f14) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final void u(float[] fArr, float[] fArr2) {
        float k3 = k(fArr2, 0, fArr, 0);
        float k10 = k(fArr2, 0, fArr, 1);
        float k11 = k(fArr2, 0, fArr, 2);
        float k12 = k(fArr2, 0, fArr, 3);
        float k13 = k(fArr2, 1, fArr, 0);
        float k14 = k(fArr2, 1, fArr, 1);
        float k15 = k(fArr2, 1, fArr, 2);
        float k16 = k(fArr2, 1, fArr, 3);
        float k17 = k(fArr2, 2, fArr, 0);
        float k18 = k(fArr2, 2, fArr, 1);
        float k19 = k(fArr2, 2, fArr, 2);
        float k20 = k(fArr2, 2, fArr, 3);
        float k21 = k(fArr2, 3, fArr, 0);
        float k22 = k(fArr2, 3, fArr, 1);
        float k23 = k(fArr2, 3, fArr, 2);
        float k24 = k(fArr2, 3, fArr, 3);
        fArr[0] = k3;
        fArr[1] = k10;
        fArr[2] = k11;
        fArr[3] = k12;
        fArr[4] = k13;
        fArr[5] = k14;
        fArr[6] = k15;
        fArr[7] = k16;
        fArr[8] = k17;
        fArr[9] = k18;
        fArr[10] = k19;
        fArr[11] = k20;
        fArr[12] = k21;
        fArr[13] = k22;
        fArr[14] = k23;
        fArr[15] = k24;
    }

    public static final void v(n0 n0Var, int i10) {
        Object obj;
        Iterator<T> it = n0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((x1.g0) ((Map.Entry) obj).getKey()).f8042h == i10) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String w(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String x(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
