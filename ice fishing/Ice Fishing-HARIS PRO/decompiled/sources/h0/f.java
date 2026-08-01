package h0;

import C1.p;
import L1.AbstractC0015p;
import L1.C0011l;
import Z.AbstractComponentCallbacksC0070s;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.fragment.NavHostFragment;
import com.lumenpath.harispro.hrnavigator.R;
import f0.z;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import k0.K;
import k0.X;
import l0.InterfaceC0234e;
import m.L0;
import o0.AbstractC0316a;
import p0.v;
import p0.x;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f3248a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3249b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3250c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3251d = true;
    public static Field e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3252f;

    public static void C(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f3250c) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f3250c = false;
            }
        }
    }

    public static final void D(Object obj) {
        if (obj instanceof t1.e) {
            throw ((t1.e) obj).f4380a;
        }
    }

    public static void a(Throwable th, Throwable th2) {
        D1.i.e(th, "<this>");
        D1.i.e(th2, "exception");
        if (th != th2) {
            Integer num = z1.a.f4973a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = y1.a.f4769a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void b(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    public static int g(X x2, V.g gVar, View view, View view2, K k2, boolean z2) {
        if (k2.v() == 0 || x2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(K.H(view) - K.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int h(X x2, V.g gVar, View view, View view2, K k2, boolean z2, boolean z3) {
        if (k2.v() == 0 || x2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (x2.b() - Math.max(K.H(view), K.H(view2))) - 1) : Math.max(0, Math.min(K.H(view), K.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(K.H(view) - K.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int i(X x2, V.g gVar, View view, View view2, K k2, boolean z2) {
        if (k2.v() == 0 || x2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return x2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(K.H(view) - K.H(view2)) + 1)) * x2.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v1.d j(p pVar, v1.d dVar, v1.d dVar2) {
        D1.i.e(pVar, "<this>");
        if (pVar instanceof x1.a) {
            return ((x1.a) pVar).i(dVar, dVar2);
        }
        v1.i h2 = dVar2.h();
        return h2 == v1.j.f4497a ? new w1.b(pVar, dVar2, dVar) : new w1.c(dVar2, h2, pVar, dVar);
    }

    public static View k(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final z l(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        Dialog dialog;
        Window window;
        D1.i.e(abstractComponentCallbacksC0070s, "<this>");
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = abstractComponentCallbacksC0070s; abstractComponentCallbacksC0070s2 != null; abstractComponentCallbacksC0070s2 = abstractComponentCallbacksC0070s2.f1617v) {
            if (abstractComponentCallbacksC0070s2 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC0070s2).M();
            }
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = abstractComponentCallbacksC0070s2.j().f1455x;
            if (abstractComponentCallbacksC0070s3 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC0070s3).M();
            }
        }
        View view = abstractComponentCallbacksC0070s.f1584F;
        if (view != null) {
            return R.j.r(view);
        }
        View view2 = null;
        DialogFragment dialogFragment = abstractComponentCallbacksC0070s instanceof DialogFragment ? (DialogFragment) abstractComponentCallbacksC0070s : null;
        if (dialogFragment != null && (dialog = dialogFragment.f1974h0) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return R.j.r(view2);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0070s + " does not have a NavController set");
    }

    public static v1.g m(v1.g gVar, v1.h hVar) {
        D1.i.e(hVar, "key");
        if (D1.i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Drawable n(Context context, int i) {
        return L0.b().c(context, i);
    }

    public static v1.d p(v1.d dVar) {
        D1.i.e(dVar, "<this>");
        x1.c cVar = dVar instanceof x1.c ? (x1.c) dVar : null;
        if (cVar == null) {
            return dVar;
        }
        v1.d dVar2 = cVar.f4761c;
        if (dVar2 != null) {
            return dVar2;
        }
        v1.f fVar = (v1.f) cVar.h().e(v1.e.f4496a);
        v1.d gVar = fVar != null ? new Q1.g((AbstractC0015p) fVar, cVar) : cVar;
        cVar.f4761c = gVar;
        return gVar;
    }

    public static boolean q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0316a.a();
        }
        try {
            if (f3249b == null) {
                f3248a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3249b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3249b.invoke(null, Long.valueOf(f3248a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t1.b r(t1.c cVar, C1.a aVar) {
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return new t1.h(aVar);
        }
        t1.i iVar = t1.i.f4387b;
        if (ordinal == 1) {
            t1.g gVar = new t1.g();
            gVar.f4382a = (D1.j) aVar;
            gVar.f4383b = iVar;
            return gVar;
        }
        if (ordinal != 2) {
            throw new C0011l();
        }
        t1.j jVar = new t1.j();
        jVar.f4390a = (D1.j) aVar;
        jVar.f4391b = iVar;
        return jVar;
    }

    public static List s(Object obj) {
        List singletonList = Collections.singletonList(obj);
        D1.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static v1.i t(v1.g gVar, v1.h hVar) {
        D1.i.e(hVar, "key");
        return D1.i.a(gVar.getKey(), hVar) ? v1.j.f4497a : gVar;
    }

    public static void u(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static v1.i v(v1.g gVar, v1.i iVar) {
        D1.i.e(iVar, "context");
        return w(gVar, iVar);
    }

    public static v1.i w(v1.i iVar, v1.i iVar2) {
        D1.i.e(iVar2, "context");
        return iVar2 == v1.j.f4497a ? iVar : (v1.i) iVar2.d(iVar, v1.b.f4492d);
    }

    public static final void z(View view, InterfaceC0234e interfaceC0234e) {
        D1.i.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC0234e);
    }

    public void A(View view, float f2) {
        if (f3251d) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f3251d = false;
            }
        }
        view.setAlpha(f2);
    }

    public void B(View view, int i) {
        if (!f3252f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f3252f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                e.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean c(t.g gVar, t.c cVar);

    public abstract boolean d(t.g gVar, Object obj, Object obj2);

    public abstract boolean e(t.g gVar, t.f fVar, t.f fVar2);

    public float o(View view) {
        if (f3251d) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                f3251d = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void x(t.f fVar, t.f fVar2);

    public abstract void y(t.f fVar, Thread thread);
}
