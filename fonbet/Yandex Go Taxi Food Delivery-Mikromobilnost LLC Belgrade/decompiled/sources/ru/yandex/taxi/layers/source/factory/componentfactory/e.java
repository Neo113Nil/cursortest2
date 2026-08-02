package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.an00;
import defpackage.dxu0;
import defpackage.f0k;
import defpackage.f4c0;
import defpackage.fkp;
import defpackage.fn6;
import defpackage.ibb1;
import defpackage.if61;
import defpackage.jl40;
import defpackage.jmp;
import defpackage.lhc;
import defpackage.lz2;
import defpackage.mbb1;
import defpackage.mzz;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.pvn;
import defpackage.pwy0;
import defpackage.rl6;
import defpackage.rol0;
import defpackage.scc;
import defpackage.sl6;
import defpackage.sxx;
import defpackage.tje;
import defpackage.tn6;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vm00;
import defpackage.xw31;
import defpackage.ym00;
import defpackage.zm00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.domain.model.Bubble$BubbleKind;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes9.dex */
public final class e implements zm00 {
    public static final Bitmap m = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.widget.c c;
    public final sxx d;
    public final ru.yandex.taxi.map_common.map.utils.a e;
    public final pwy0 f;
    public final pdc g;
    public final Canvas h = new Canvas();
    public final Object i = new Object();
    public final mzz j = new mzz(5);
    public final mzz k = new mzz(20);
    public final boolean l = true;

    public e(tt2 tt2Var, pdc pdcVar, sxx sxxVar, pwy0 pwy0Var, Context context, ru.yandex.taxi.map_common.map.utils.a aVar, ru.yandex.taxi.widget.c cVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = cVar;
        this.d = sxxVar;
        this.e = aVar;
        this.f = pwy0Var;
        this.g = pdcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, rl6 rl6Var, fkp fkpVar, Point point, Set set, vm00 vm00Var, Float f, ContinuationImpl continuationImpl) {
        AdvertBubbleComponentFactory$createBubble$1 advertBubbleComponentFactory$createBubble$1;
        int i;
        String str;
        rl6 rl6Var2;
        int i2;
        boolean z;
        if61 if61Var;
        String str2;
        Set set2;
        vm00 vm00Var2;
        Float f2;
        Point point2;
        int i3;
        eVar.getClass();
        if (continuationImpl instanceof AdvertBubbleComponentFactory$createBubble$1) {
            advertBubbleComponentFactory$createBubble$1 = (AdvertBubbleComponentFactory$createBubble$1) continuationImpl;
            int i4 = advertBubbleComponentFactory$createBubble$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                advertBubbleComponentFactory$createBubble$1.label = i4 - Integer.MIN_VALUE;
                Object obj = advertBubbleComponentFactory$createBubble$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertBubbleComponentFactory$createBubble$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String e = rl6Var.getE();
                    if (e == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    str = ((Object) e) + "-" + eVar.f.getThemeType().getWireName();
                    Integer h = rl6Var.getH();
                    int intValue = h != null ? h.intValue() : -1;
                    boolean l = jl40.l(rl6Var.getD(), Boolean.TRUE);
                    Integer g = rl6Var.getG();
                    int intValue2 = g != null ? g.intValue() : -1;
                    Float[] j = rl6Var.getJ();
                    if (j == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    if61 l2 = ru.yandex.taxi.layers.source.factory.a.l(j);
                    String a = fkpVar.getA();
                    if (a == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    ru.yandex.taxi.map_common.map.utils.a aVar = eVar.e;
                    advertBubbleComponentFactory$createBubble$1.L$0 = rl6Var;
                    advertBubbleComponentFactory$createBubble$1.L$1 = null;
                    advertBubbleComponentFactory$createBubble$1.L$2 = point;
                    advertBubbleComponentFactory$createBubble$1.L$3 = set;
                    advertBubbleComponentFactory$createBubble$1.L$4 = vm00Var;
                    advertBubbleComponentFactory$createBubble$1.L$5 = f;
                    advertBubbleComponentFactory$createBubble$1.L$6 = str;
                    advertBubbleComponentFactory$createBubble$1.L$7 = l2;
                    advertBubbleComponentFactory$createBubble$1.L$8 = a;
                    advertBubbleComponentFactory$createBubble$1.I$0 = intValue;
                    advertBubbleComponentFactory$createBubble$1.Z$0 = l;
                    advertBubbleComponentFactory$createBubble$1.I$1 = intValue2;
                    advertBubbleComponentFactory$createBubble$1.label = 1;
                    Object b = aVar.b(point, advertBubbleComponentFactory$createBubble$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rl6Var2 = rl6Var;
                    i2 = intValue2;
                    z = l;
                    if61Var = l2;
                    str2 = a;
                    set2 = set;
                    vm00Var2 = vm00Var;
                    f2 = f;
                    point2 = point;
                    i3 = intValue;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = advertBubbleComponentFactory$createBubble$1.I$1;
                    boolean z2 = advertBubbleComponentFactory$createBubble$1.Z$0;
                    int i6 = advertBubbleComponentFactory$createBubble$1.I$0;
                    String str3 = (String) advertBubbleComponentFactory$createBubble$1.L$8;
                    if61 if61Var2 = (if61) advertBubbleComponentFactory$createBubble$1.L$7;
                    str = (String) advertBubbleComponentFactory$createBubble$1.L$6;
                    f2 = (Float) advertBubbleComponentFactory$createBubble$1.L$5;
                    vm00 vm00Var3 = (vm00) advertBubbleComponentFactory$createBubble$1.L$4;
                    Set set3 = (Set) advertBubbleComponentFactory$createBubble$1.L$3;
                    point2 = (Point) advertBubbleComponentFactory$createBubble$1.L$2;
                    rl6Var2 = (rl6) advertBubbleComponentFactory$createBubble$1.L$0;
                    kotlin.b.b(obj);
                    i2 = i5;
                    z = z2;
                    i3 = i6;
                    str2 = str3;
                    if61Var = if61Var2;
                    vm00Var2 = vm00Var3;
                    set2 = set3;
                }
                String str4 = str;
                XYPoint xYPoint = (XYPoint) obj;
                f4c0 f4c0Var = new f4c0(point2, null, 6);
                if (f2 != null) {
                    f4c0Var.k(f2.floatValue());
                }
                f4c0Var.i(false);
                BubbleType e2 = mbb1.e(rl6Var2);
                Bubble$BubbleKind bubble$BubbleKind = Bubble$BubbleKind.ADVERT;
                dxu0 k = rl6Var2.getK();
                return new sl6(str4, i3, z, i2, if61Var, str2, xYPoint, set2, vm00Var2, k == null ? k.getG() : 0.0f, f4c0Var, e2, bubble$BubbleKind);
            }
        }
        advertBubbleComponentFactory$createBubble$1 = new AdvertBubbleComponentFactory$createBubble$1(eVar, continuationImpl);
        Object obj2 = advertBubbleComponentFactory$createBubble$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertBubbleComponentFactory$createBubble$1.label;
        if (i != 0) {
        }
        String str42 = str;
        XYPoint xYPoint2 = (XYPoint) obj2;
        f4c0 f4c0Var2 = new f4c0(point2, null, 6);
        if (f2 != null) {
        }
        f4c0Var2.i(false);
        BubbleType e22 = mbb1.e(rl6Var2);
        Bubble$BubbleKind bubble$BubbleKind2 = Bubble$BubbleKind.ADVERT;
        dxu0 k2 = rl6Var2.getK();
        return new sl6(str42, i3, z, i2, if61Var, str2, xYPoint2, set2, vm00Var2, k2 == null ? k2.getG() : 0.0f, f4c0Var2, e22, bubble$BubbleKind2);
    }

    @Override // defpackage.zm00
    public final tpr a(an00 an00Var) {
        ym00 c = an00Var.c();
        if (c != null) {
            fkp d = an00Var.d();
            vm00 b = an00Var.b();
            jmp b2 = d.getB();
            if ((b2 != null ? b2.getK() : null) == MapObjectType.ADVERT && (d.getB().getD() != null || d.getB().getE() != null)) {
                List d2 = d.getB().getD();
                if (d2 == null) {
                    d2 = scc.h(d.getB().getE());
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : d2) {
                    rl6 rl6Var = (rl6) obj;
                    String e = rl6Var.getE();
                    if (e != null && e.length() != 0 && rl6Var.getD() != null && rl6Var.getJ() != null) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    f0k j = d.getB().getJ();
                    if (j == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    rol0 rol0Var = new rol0(new AdvertBubbleComponentFactory$createBubbleConfig$1(arrayList, this, null));
                    this.b.getClass();
                    return new d(new b(new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(rol0Var, uyj.a), new AdvertBubbleComponentFactory$createBubbleConfig$2()), this, c), this, d, j, b);
                }
            }
        }
        return pvn.a;
    }

    @Override // defpackage.zm00
    public final boolean c() {
        return this.l;
    }

    public final ImageProvider e(String str, ym00 ym00Var, List list, int i, String str2, BubbleType bubbleType, tn6 tn6Var) {
        Integer num;
        Object obj;
        ImageProvider e;
        Bitmap bitmap;
        String str3 = str2 + bubbleType + str;
        mzz mzzVar = this.j;
        Drawable drawable = (Drawable) mzzVar.c(str3);
        Canvas canvas = this.h;
        Context context = this.a;
        fn6 a = ibb1.a(canvas, context);
        a.l(drawable);
        Iterator it = ym00Var.a().iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((lz2) obj).b() == AppearanceType.NORMAL) {
                break;
            }
        }
        lz2 lz2Var = (lz2) obj;
        if (lz2Var != null && (e = lz2Var.e()) != null && (bitmap = e.get$image()) != null) {
            num = Integer.valueOf(bitmap.getWidth());
        }
        int w = num == null ? (int) tje.w(16, context) : (num.intValue() / 5) * 2;
        b.a aVar = new b.a();
        aVar.c(tje.w(14, context));
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar.a());
        materialShapeDrawable.setFillColor(i == 0 ? ColorStateList.valueOf(i) : ColorStateList.valueOf(lhc.f(i, Math.abs(204) & 255)));
        materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(i));
        materialShapeDrawable.setStrokeWidth(tje.x(context, 1.5f));
        boolean n = xw31.n(context);
        int w2 = (int) tje.w(tn6Var != null ? tn6Var.getC() : 12, context);
        int w3 = (int) tje.w(tn6Var != null ? tn6Var.getB() : 8, context);
        int w4 = (int) tje.w(tn6Var != null ? tn6Var.getD() : 8, context);
        if (tn6Var != null) {
            w = (int) tje.w(tn6Var.getA(), context);
        }
        int i2 = !n ? w : w2;
        if (n) {
            w2 = w;
        }
        materialShapeDrawable.setPadding(i2, w3, w2, w4);
        a.j(materialShapeDrawable);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a.a((View) it2.next());
        }
        fn6 d = a.d();
        Drawable e2 = d.e();
        if (e2 != null) {
        }
        ImageProvider fromBitmap = ImageProvider.fromBitmap(d.b(), true, str);
        this.k.d(str, fromBitmap);
        return fromBitmap;
    }
}
