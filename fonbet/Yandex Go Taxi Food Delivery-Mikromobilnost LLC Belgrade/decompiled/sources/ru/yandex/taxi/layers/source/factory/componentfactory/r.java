package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.View;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.image.ImageProvider;
import defpackage.an00;
import defpackage.azg0;
import defpackage.bxu0;
import defpackage.dxu0;
import defpackage.f0k;
import defpackage.fkp;
import defpackage.fn6;
import defpackage.hgr0;
import defpackage.hn6;
import defpackage.hxu0;
import defpackage.ibb1;
import defpackage.jmp;
import defpackage.mrg0;
import defpackage.mz2;
import defpackage.pvn;
import defpackage.pwy0;
import defpackage.qn6;
import defpackage.rl6;
import defpackage.rol0;
import defpackage.scc;
import defpackage.sxx;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vm00;
import defpackage.xw31;
import defpackage.ym00;
import defpackage.ym6;
import defpackage.ytb1;
import defpackage.yuf0;
import defpackage.zlp;
import defpackage.zm00;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.domain.model.BubbleType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes9.dex */
public final class r implements zm00 {
    public static final Bitmap n = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.map_common.map.utils.a c;
    public final ru.yandex.taxi.widget.c d;
    public final sxx e;
    public final yuf0 f;
    public final pwy0 g;
    public final int l;
    public final Object h = new Object();
    public final LruCache i = new LruCache(5);
    public final LruCache j = new LruCache(5);
    public final LruCache k = new LruCache(20);
    public final boolean m = true;

    public r(Context context, tt2 tt2Var, ru.yandex.taxi.map_common.map.utils.a aVar, ru.yandex.taxi.widget.c cVar, sxx sxxVar, yuf0 yuf0Var, pwy0 pwy0Var) {
        this.a = context;
        this.b = tt2Var;
        this.c = aVar;
        this.d = cVar;
        this.e = sxxVar;
        this.f = yuf0Var;
        this.g = pwy0Var;
        this.l = xw31.b(mrg0.go_design_s_space, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if ((r1 != null ? r1.getE() : null) == null) goto L69;
     */
    @Override // defpackage.zm00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tpr a(an00 an00Var) {
        hxu0 e;
        Float[] e2;
        hxu0 b;
        Float[] e3;
        Integer a;
        ym00 c = an00Var.c();
        if (c != null) {
            fkp d = an00Var.d();
            vm00 b2 = an00Var.b();
            jmp b3 = d.getB();
            if ((b3 != null ? b3.getK() : null) != MapObjectType.ADVERT) {
                jmp b4 = d.getB();
                if ((b4 != null ? b4.getD() : null) == null) {
                    jmp b5 = d.getB();
                }
                List d2 = d.getB().getD();
                if (d2 == null) {
                    d2 = scc.h(d.getB().getE());
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : d2) {
                    rl6 rl6Var = (rl6) obj;
                    String e4 = rl6Var.getE();
                    if (e4 != null && e4.length() != 0 && rl6Var.getD() != null && rl6Var.getJ() != null) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bxu0 b6 = d.getB().getB();
                    int intValue = (b6 == null || (a = b6.getA()) == null) ? 0 : a.intValue();
                    zlp c2 = d.getC();
                    zzs a2 = c2 != null ? c2.getA() : null;
                    String a3 = d.getA();
                    f0k j = d.getB().getJ();
                    bxu0 b7 = d.getB().getB();
                    PointF a4 = (b7 == null || (b = b7.getB()) == null || (e3 = b.getE()) == null) ? mz2.a() : new PointF(ytb1.b(e3), ytb1.c(e3));
                    bxu0 b8 = d.getB().getB();
                    PointF a5 = (b8 == null || (e = b8.getE()) == null || (e2 = e.getE()) == null) ? mz2.a() : new PointF(ytb1.b(e2), ytb1.c(e2));
                    Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                    PointF pointF = a5;
                    Point point = new Point(a2.a, a2.b);
                    rol0 rol0Var = new rol0(new BubbleComponentFactory$prepareBubbles$1(arrayList, this, null));
                    this.b.getClass();
                    return new q(new o(new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(rol0Var, uyj.a), new BubbleComponentFactory$prepareBubbles$2()), this), this, intValue, j, a4, pointF, c, a3, point, b2);
                }
            }
        }
        return pvn.a;
    }

    @Override // defpackage.zm00
    public final boolean c() {
        return this.m;
    }

    public final PointF d(int i, PointF pointF, Bitmap bitmap, Bitmap bitmap2, dxu0 dxu0Var) {
        ym6 f;
        if (bitmap2 == null) {
            return new PointF(0.5f, pointF.y);
        }
        int u = (dxu0Var == null || (f = dxu0Var.getF()) == null) ? 0 : tje.u(f.getA(), this.a);
        float height = bitmap2.getHeight() / 2.0f;
        float height2 = bitmap.getHeight() / 100.0f;
        return new PointF(0.5f, (float) ((((pointF.y + ((this.l / height2) / 100.0f)) + ((height / height2) / 100.0f)) + ((u / height2) / 100.0f)) - Math.abs(Math.sin(Math.toRadians(i)) * 0.30000001192092896d)));
    }

    public final ImageProvider e(dxu0 dxu0Var, String str, List list, qn6 qn6Var, String str2, String str3, BubbleType bubbleType) {
        fn6 r;
        Drawable f;
        Object obj;
        String str4 = str2 + bubbleType + str + str3;
        LruCache lruCache = this.j;
        Drawable drawable = (Drawable) lruCache.get(str4);
        BubbleType bubbleType2 = BubbleType.PLAIN_TEXT;
        LruCache lruCache2 = this.i;
        yuf0 yuf0Var = this.f;
        if (bubbleType == bubbleType2) {
            yuf0Var.getClass();
            if (dxu0Var != null && !dxu0Var.getC()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((View) obj) instanceof RobotoTextView) {
                        break;
                    }
                }
                View view = (View) obj;
                if (view != null) {
                    ((RobotoTextView) view).setCompoundDrawablesWithIntrinsicBounds(0, 0, azg0.ic_chevron_with_left_padding, 0);
                }
            }
            fn6 a = ibb1.a((Canvas) yuf0Var.f, (Context) yuf0Var.a);
            a.j(yuf0Var.Q(azg0.ic_bubble_narrow, dxu0Var != null ? dxu0Var.getA() : null));
            a.n(new hn6(yuf0Var, 4));
            a.p((ru.yandex.taxi.design.utils.a) yuf0Var.d, hgr0.e);
            a.l(drawable);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a.a((View) it.next());
            }
            r = a.d();
        } else {
            r = yuf0Var.r(dxu0Var, list, qn6Var, drawable, bubbleType, new BubbleComponentFactory$createImageProvider$bubbleObject$1(lruCache2));
        }
        Bitmap b = r.b();
        Drawable e = r.e();
        if (e != null) {
            lruCache.put(str4, e);
        }
        if (qn6Var != null && (f = r.f()) != null) {
            lruCache2.put(qn6Var.b(), f);
        }
        ImageProvider fromBitmap = ImageProvider.fromBitmap(b, true, str);
        this.k.put(str, fromBitmap);
        return fromBitmap;
    }
}
