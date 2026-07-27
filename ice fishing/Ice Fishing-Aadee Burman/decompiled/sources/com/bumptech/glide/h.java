package com.bumptech.glide;

import B1.x;
import D0.z;
import R3.r;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.fragment.app.C0461d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import l4.C4664a;
import t0.AbstractC4990E;
import t0.C5000O;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23388a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f23389b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23390c;

    public static int a(C5000O c5000o, androidx.emoji2.text.g gVar, View view, View view2, AbstractC4990E abstractC4990E, boolean z3) {
        if (abstractC4990E.v() == 0 || c5000o.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(AbstractC4990E.H(view) - AbstractC4990E.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int b(C5000O c5000o, androidx.emoji2.text.g gVar, View view, View view2, AbstractC4990E abstractC4990E, boolean z3, boolean z6) {
        if (abstractC4990E.v() == 0 || c5000o.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z6 ? Math.max(0, (c5000o.b() - Math.max(AbstractC4990E.H(view), AbstractC4990E.H(view2))) - 1) : Math.max(0, Math.min(AbstractC4990E.H(view), AbstractC4990E.H(view2)));
        if (z3) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC4990E.H(view) - AbstractC4990E.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int c(C5000O c5000o, androidx.emoji2.text.g gVar, View view, View view2, AbstractC4990E abstractC4990E, boolean z3) {
        if (abstractC4990E.v() == 0 || c5000o.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return c5000o.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC4990E.H(view) - AbstractC4990E.H(view2)) + 1)) * c5000o.b());
    }

    public static final void d(int i, int i6) {
        if (i <= i6) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i6 + ").");
    }

    public static R3.b e(String str, String str2) {
        C4664a c4664a = new C4664a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(C4664a.class));
        return new R3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new H3.l(1, c4664a), hashSet3);
    }

    public static R3.b f(String str, x xVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(C4664a.class));
        for (Class cls : new Class[0]) {
            X2.e.z(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        R3.j a9 = R3.j.a(Context.class);
        if (hashSet.contains(a9.f2737a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a9);
        return new R3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0461d(6, str, xVar), hashSet3);
    }

    public static float g(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float i(EdgeEffect edgeEffect, float f3, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U.e.c(edgeEffect, f3, f9);
        }
        U.d.a(edgeEffect, f3, f9);
        return f3;
    }

    public static void j(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e9) {
                n(cls, e9);
                throw null;
            } catch (InstantiationException e10) {
                n(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                n(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                n(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    public static int k(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static void n(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static int o(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p(long j6) {
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (((-16384) & j6) == 0) {
            return 2;
        }
        if (((-2097152) & j6) == 0) {
            return 3;
        }
        if (((-268435456) & j6) == 0) {
            return 4;
        }
        if (((-34359738368L) & j6) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j6) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j6) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j6) == 0) {
            return 8;
        }
        return (j6 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public float h(View view) {
        if (f23388a) {
            try {
                return z.a(view);
            } catch (NoSuchMethodError unused) {
                f23388a = false;
            }
        }
        return view.getAlpha();
    }

    public void l(View view, float f3) {
        if (f23388a) {
            try {
                z.b(view, f3);
                return;
            } catch (NoSuchMethodError unused) {
                f23388a = false;
            }
        }
        view.setAlpha(f3);
    }

    public void m(View view, int i) {
        if (!f23390c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f23389b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f23390c = true;
        }
        Field field = f23389b;
        if (field != null) {
            try {
                f23389b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
