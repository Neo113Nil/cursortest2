package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class rqf {
    public static final Object a = uah.e(new Pair(vqf.d, Integer.valueOf(R.layout.glance_text)), new Pair(vqf.e, Integer.valueOf(R.layout.glance_list)), new Pair(vqf.f, Integer.valueOf(R.layout.glance_check_box)), new Pair(vqf.g, Integer.valueOf(R.layout.glance_check_box_backport)), new Pair(vqf.h, Integer.valueOf(R.layout.glance_button)), new Pair(vqf.r, Integer.valueOf(R.layout.glance_swtch)), new Pair(vqf.s, Integer.valueOf(R.layout.glance_swtch_backport)), new Pair(vqf.i, Integer.valueOf(R.layout.glance_frame)), new Pair(vqf.t, Integer.valueOf(R.layout.glance_image_crop)), new Pair(vqf.w, Integer.valueOf(R.layout.glance_image_crop_decorative)), new Pair(vqf.u, Integer.valueOf(R.layout.glance_image_fit)), new Pair(vqf.x, Integer.valueOf(R.layout.glance_image_fit_decorative)), new Pair(vqf.v, Integer.valueOf(R.layout.glance_image_fill_bounds)), new Pair(vqf.y, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new Pair(vqf.j, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new Pair(vqf.k, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new Pair(vqf.l, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new Pair(vqf.m, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new Pair(vqf.n, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new Pair(vqf.o, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new Pair(vqf.p, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new Pair(vqf.q, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new Pair(vqf.z, Integer.valueOf(R.layout.glance_radio_button)), new Pair(vqf.A, Integer.valueOf(R.layout.glance_radio_button_backport)));
    public static final int b;
    public static final int c;

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.Map] */
    static {
        int size = b3d.f.size();
        b = size;
        c = Build.VERSION.SDK_INT >= 31 ? b3d.h : b3d.h / size;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    public static final xvn a(e9t e9tVar, ukd ukdVar, int i) {
        Map b2;
        Context context = e9tVar.a;
        Integer valueOf = Integer.valueOf(R.id.rootStubId);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            int i3 = b3d.h;
            if (i >= i3) {
                xq0.o(f1d.e(i3, i, "Index of the root view cannot be more than ", ", currently "));
                return null;
            }
            cnq cnqVar = new cnq(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), b3d.g + i);
            yov yovVar = (yov) ukdVar.a(null, xce.w);
            if (yovVar != null) {
                vq1.r(remoteViews, yovVar, R.id.rootView);
            }
            bxd bxdVar = (bxd) ukdVar.a(null, xce.x);
            if (bxdVar != null) {
                vq1.q(remoteViews, bxdVar, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            if (i2 >= 33) {
                b2 = e5b.a;
                b2.getClass();
            } else {
                b2 = tah.b(new Pair(0, tah.b(new Pair(cnqVar, valueOf))));
            }
            return new xvn(remoteViews, new xne(b2, R.id.rootView, 0, 2));
        }
        int i4 = b * i;
        int i5 = b3d.h;
        if (i4 >= i5) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i5 / 4) + ", currently " + i).toString());
        }
        yov yovVar2 = (yov) ukdVar.a(null, xce.u);
        u38 u38Var = s38.a;
        u38 u38Var2 = yovVar2 != null ? yovVar2.a : u38Var;
        bxd bxdVar2 = (bxd) ukdVar.a(null, xce.v);
        if (bxdVar2 != null) {
            u38Var = bxdVar2.a;
        }
        p38 p38Var = p38.a;
        int i6 = u38Var2.equals(p38Var) ? 4 : 1;
        int i7 = u38Var.equals(p38Var) ? 4 : 1;
        cnq cnqVar2 = new cnq(i6 == 2 ? 1 : i6, i7 != 2 ? i7 : 1);
        Integer num = (Integer) b3d.f.get(cnqVar2);
        if (num != null) {
            return new xvn(new RemoteViews(context.getPackageName(), i4 + b3d.g + num.intValue()), new xne(tah.b(new Pair(0, tah.b(new Pair(cnqVar2, valueOf)))), 0, 0, 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + f1d.y(i6) + ", " + f1d.y(i7) + ']');
    }

    public static final xne b(RemoteViews remoteViews, e9t e9tVar, vqf vqfVar, int i, ukd ukdVar, d40 d40Var, e40 e40Var) {
        int intValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + vqfVar + " container from " + i + " to 10 elements", new IllegalArgumentException(vqfVar + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer f = f(vqfVar, ukdVar);
        if (f != null) {
            intValue = f.intValue();
        } else {
            gb6 gb6Var = (gb6) b3d.a.get(new ib6(vqfVar, i2, d40Var, e40Var));
            Integer valueOf = gb6Var != null ? Integer.valueOf(gb6Var.a) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + vqfVar + " with " + i + " children");
            }
            intValue = valueOf.intValue();
        }
        Map map = (Map) b3d.b.get(vqfVar);
        if (map == null) {
            kac.j(vqfVar, "Cannot find generated children for ");
            return null;
        }
        xne d = d(remoteViews, e9tVar, intValue, ukdVar);
        int i3 = d.a;
        xne xneVar = new xne(map, i3, d.b);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return xneVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final xne c(RemoteViews remoteViews, e9t e9tVar, vqf vqfVar, ukd ukdVar) {
        Integer f = f(vqfVar, ukdVar);
        if (f != null || (f = (Integer) a.get(vqfVar)) != null) {
            return d(remoteViews, e9tVar, f.intValue(), ukdVar);
        }
        kac.j(vqfVar, "Cannot use `insertView` with a container like ");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    public static final xne d(RemoteViews remoteViews, e9t e9tVar, int i, ukd ukdVar) {
        Integer valueOf;
        int i2 = e9tVar.e;
        yov yovVar = (yov) ukdVar.a(null, xce.y);
        u38 u38Var = s38.a;
        u38 u38Var2 = yovVar != null ? yovVar.a : u38Var;
        bxd bxdVar = (bxd) ukdVar.a(null, xce.z);
        if (bxdVar != null) {
            u38Var = bxdVar.a;
        }
        if (ukdVar.b()) {
            valueOf = null;
        } else {
            if (e9tVar.i.getAndSet(true)) {
                xq0.q("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            valueOf = Integer.valueOf(android.R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            int intValue = valueOf != null ? valueOf.intValue() : e9tVar.g.incrementAndGet();
            RemoteViews a2 = qqf.a.a(e9tVar.a.getPackageName(), i, intValue);
            int i4 = e9tVar.h.a;
            if (i3 >= 31) {
                awn.a.a(remoteViews, i4, a2, i2);
            } else {
                remoteViews.addView(i4, a2);
            }
            return new xne(null, intValue, 0, 6);
        }
        if (i3 >= 31) {
            o38 o38Var = o38.a;
            return new xne(null, ngg.x(remoteViews, e9tVar, e(remoteViews, e9tVar, i2, u38Var2.equals(o38Var) ? 3 : 1, u38Var.equals(o38Var) ? 3 : 1), i, valueOf), 0, 6);
        }
        int g = g(u38Var2);
        int g2 = g(u38Var);
        int e = e(remoteViews, e9tVar, i2, g, g2);
        if (g != 2 && g2 != 2) {
            return new xne(null, ngg.x(remoteViews, e9tVar, e, i, valueOf), 0, 6);
        }
        apf apfVar = (apf) b3d.e.get(new cnq(g, g2));
        if (apfVar != null) {
            return new xne(null, ngg.x(remoteViews, e9tVar, R.id.glanceViewStub, i, valueOf), ngg.x(remoteViews, e9tVar, e, apfVar.a, null), 4);
        }
        jj4.k("Could not find complex layout for width=", f1d.y(g), ", height=", f1d.y(g2));
        return null;
    }

    public static final int e(RemoteViews remoteViews, e9t e9tVar, int i, int i2, int i3) {
        cnq cnqVar = new cnq(i2 == 2 ? 1 : i2, i3 != 2 ? i3 : 1);
        Map map = (Map) e9tVar.h.c.get(Integer.valueOf(i));
        if (map == null) {
            xq0.q(k5r.i(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(cnqVar);
        if (num == null) {
            StringBuilder q = k5r.q(i, "No child for position ", " and size ");
            q.append(f1d.y(i2));
            q.append(" x ");
            wvs.k(q, f1d.y(i3));
            return 0;
        }
        int intValue = num.intValue();
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((Number) obj).intValue() != intValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ngg.x(remoteViews, e9tVar, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return intValue;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    public static final Integer f(vqf vqfVar, ukd ukdVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            o40 o40Var = (o40) ukdVar.a(null, xce.A);
            yov yovVar = (yov) ukdVar.a(null, xce.B);
            o38 o38Var = o38.a;
            boolean equals = yovVar != null ? yovVar.a.equals(o38Var) : false;
            bxd bxdVar = (bxd) ukdVar.a(null, xce.C);
            boolean equals2 = bxdVar != null ? bxdVar.a.equals(o38Var) : false;
            if (o40Var != null) {
                f40 f40Var = o40Var.a;
                apf apfVar = (apf) b3d.c.get(new rg3(vqfVar, f40Var.a, f40Var.b));
                if (apfVar != null) {
                    return Integer.valueOf(apfVar.a);
                }
                wvs.i("Cannot find ", vqfVar, " with alignment ", f40Var);
                return null;
            }
            if (equals || equals2) {
                apf apfVar2 = (apf) b3d.d.get(new eho(vqfVar, equals, equals2));
                if (apfVar2 != null) {
                    return Integer.valueOf(apfVar2.a);
                }
                wvs.g(vqfVar, " with defaultWeight set", "Cannot find ");
                return null;
            }
        }
        return null;
    }

    public static final int g(u38 u38Var) {
        if (u38Var instanceof s38) {
            return 1;
        }
        if (u38Var instanceof o38) {
            return 3;
        }
        if (u38Var instanceof p38) {
            return 4;
        }
        if (u38Var instanceof n38) {
            return 2;
        }
        b6e.s();
        return 0;
    }
}
