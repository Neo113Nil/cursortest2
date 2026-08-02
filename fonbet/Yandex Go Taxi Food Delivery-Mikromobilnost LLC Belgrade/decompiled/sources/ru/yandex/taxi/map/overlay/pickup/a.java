package ru.yandex.taxi.map.overlay.pickup;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.go.preorder.mode.SourceAnalyticsMode;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.b64;
import defpackage.f4c0;
import defpackage.gh00;
import defpackage.lqx;
import defpackage.pzt0;
import defpackage.qqb0;
import defpackage.rjt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uj0;
import defpackage.w53;
import defpackage.wpb0;
import defpackage.xm00;
import java.util.List;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes6.dex */
public final class a {
    public final xm00 a;
    public final ru.yandex.taxi.map_common.map.utils.a b;
    public wpb0 c;
    public final List d;
    public ImageProvider e;
    public final lqx f;
    public final tse g;
    public final ru.yandex.taxi.layers.presentation.pickup.b h;
    public final f4c0 i;
    public final f4c0 j;
    public XYPoint k = new XYPoint(0.0d, 0.0d);
    public f4c0 l;
    public boolean m;
    public boolean n;
    public pzt0 o;

    public a(xm00 xm00Var, ru.yandex.taxi.map_common.map.utils.a aVar, wpb0 wpb0Var, List list, ImageProvider imageProvider, lqx lqxVar, tse tseVar, ru.yandex.taxi.layers.presentation.pickup.b bVar) {
        this.a = xm00Var;
        this.b = aVar;
        this.c = wpb0Var;
        this.d = list;
        this.e = imageProvider;
        this.f = lqxVar;
        this.g = tseVar;
        this.h = bVar;
        Point F = ru.yandex.taxi.map.utils.a.F(this.c.b);
        tje.N(tseVar, null, null, new PickupPointMapObject$1(this, F, null), 3);
        f4c0 f4c0Var = new f4c0(F, null, 6);
        this.j = f4c0Var;
        wpb0 wpb0Var2 = this.c;
        f4c0Var.i(wpb0Var2.l || wpb0Var2.m);
        f4c0Var.y((ImageProvider) kotlin.collections.a.P(list));
        f4c0Var.k(1.0f);
        xm00Var.getClass();
        f4c0Var.b(xm00Var);
        f4c0 f4c0Var2 = new f4c0(F, null, 6);
        this.i = f4c0Var2;
        f4c0Var2.k(0.0f);
        f4c0Var2.b(xm00Var);
    }

    public final void a(Bitmap bitmap, PointF pointF, qqb0 qqb0Var) {
        f4c0 f4c0Var = this.l;
        wpb0 wpb0Var = this.c;
        int i = 3;
        if (f4c0Var != null) {
            d(f4c0Var, wpb0Var, bitmap, pointF);
            f4c0Var.g(new uj0(i, qqb0Var, this.c));
            return;
        }
        f4c0 f4c0Var2 = new f4c0(ru.yandex.taxi.map.utils.a.F(wpb0Var.b), null, 6);
        f4c0Var2.k((wpb0Var.l || wpb0Var.m) ? 13.0f : 11.0f);
        d(f4c0Var2, wpb0Var, bitmap, pointF);
        xm00 xm00Var = this.a;
        xm00Var.getClass();
        f4c0Var2.b(xm00Var);
        f4c0Var2.g(new uj0(i, qqb0Var, wpb0Var));
        this.l = f4c0Var2;
    }

    public final void b() {
        f4c0 f4c0Var = this.l;
        if (f4c0Var != null) {
            this.a.o(f4c0Var);
            this.l = null;
            this.f.c.remove(this.c.a);
        }
    }

    public final void c() {
        pzt0 pzt0Var = this.o;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ru.yandex.taxi.layers.presentation.pickup.b bVar = this.h;
        bVar.e.i(false);
        pzt0 pzt0Var2 = bVar.j;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        bVar.j = null;
        f4c0 f4c0Var = this.j;
        xm00 xm00Var = this.a;
        xm00Var.o(f4c0Var);
        xm00Var.o(this.i);
        f4c0 f4c0Var2 = this.l;
        if (f4c0Var2 != null) {
            xm00Var.o(f4c0Var2);
            this.f.c.remove(this.c.a);
        }
    }

    public final void d(f4c0 f4c0Var, wpb0 wpb0Var, Bitmap bitmap, PointF pointF) {
        f4c0Var.y(ImageProvider.fromBitmap(bitmap));
        f4c0Var.D(new IconStyle().setAnchor(pointF));
        String str = wpb0Var.a;
        Point point = (Point) f4c0Var.h;
        lqx lqxVar = this.f;
        w53 w53Var = lqxVar.c;
        gh00 gh00Var = (gh00) lqxVar.b;
        ScreenPoint e = gh00Var.e.e(point);
        if (e == null) {
            return;
        }
        boolean contains = gh00Var.g().contains((int) e.getX(), (int) e.getY());
        Boolean bool = (Boolean) w53Var.get(str);
        if (bool == null || !bool.equals(Boolean.valueOf(contains))) {
            w53Var.put(str, Boolean.valueOf(contains));
            rjt0 rjt0Var = lqxVar.a;
            i d = ((j) rjt0Var.a).d(b64.j(rjt0Var.o.getModeName(), ".HintShown"));
            d.a.put("pickupPointId", str);
            d.g("visibility", contains);
            if (rjt0Var.o == SourceAnalyticsMode.MAIN) {
                d.j((r2 & 1) == 0);
            }
            d.m();
        }
    }

    public final void e(f4c0 f4c0Var, boolean z) {
        if (this.c.l || f4c0Var.b == z) {
            return;
        }
        f4c0Var.j(z, new Animation(Animation.Type.LINEAR, 0.3f), null);
    }

    public final void f() {
        ImageProvider imageProvider;
        if (this.n) {
            imageProvider = this.e;
        } else {
            boolean z = this.m;
            List list = this.d;
            imageProvider = z ? (ImageProvider) b64.c(1, list) : (ImageProvider) list.get(0);
        }
        this.j.y(imageProvider);
    }
}
