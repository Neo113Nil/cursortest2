package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.dxu0;
import defpackage.f4c0;
import defpackage.fn6;
import defpackage.g8e;
import defpackage.ibb1;
import defpackage.if61;
import defpackage.jl40;
import defpackage.mbb1;
import defpackage.mzz;
import defpackage.nm6;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.rl6;
import defpackage.rol0;
import defpackage.sl6;
import defpackage.sxx;
import defpackage.tt2;
import defpackage.um00;
import defpackage.uyj;
import defpackage.vm00;
import defpackage.wd1;
import defpackage.ym00;
import defpackage.ym6;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.domain.model.Bubble$BubbleKind;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes9.dex */
public final class l {
    public static final Bitmap l = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.widget.c c;
    public final sxx d;
    public final pdc e;
    public final ru.yandex.taxi.map_common.map.utils.a f;
    public final pwy0 g;
    public final Canvas h = new Canvas();
    public final Object i = new Object();
    public final mzz j = new mzz(5);
    public final mzz k = new mzz(20);

    public l(tt2 tt2Var, pdc pdcVar, sxx sxxVar, pwy0 pwy0Var, Context context, ru.yandex.taxi.map_common.map.utils.a aVar, ru.yandex.taxi.widget.c cVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = cVar;
        this.d = sxxVar;
        this.e = pdcVar;
        this.f = aVar;
        this.g = pwy0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v4, types: [vm00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, rl6 rl6Var, String str, XYPoint xYPoint, Set set, um00 um00Var, Float f, if61 if61Var, ContinuationImpl continuationImpl) {
        AdvertOverlapBubbleComponentFactory$createBubble$1 advertOverlapBubbleComponentFactory$createBubble$1;
        int i;
        String e;
        rl6 rl6Var2;
        XYPoint xYPoint2;
        int i2;
        if61 if61Var2;
        String str2;
        Set set2;
        um00 um00Var2;
        Float f2;
        int i3;
        boolean z;
        lVar.getClass();
        if (continuationImpl instanceof AdvertOverlapBubbleComponentFactory$createBubble$1) {
            advertOverlapBubbleComponentFactory$createBubble$1 = (AdvertOverlapBubbleComponentFactory$createBubble$1) continuationImpl;
            int i4 = advertOverlapBubbleComponentFactory$createBubble$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                advertOverlapBubbleComponentFactory$createBubble$1.label = i4 - Integer.MIN_VALUE;
                Object obj = advertOverlapBubbleComponentFactory$createBubble$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertOverlapBubbleComponentFactory$createBubble$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e = rl6Var.getE();
                    if (e == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    Integer h = rl6Var.getH();
                    int intValue = h != null ? h.intValue() : -1;
                    boolean l2 = jl40.l(rl6Var.getD(), Boolean.TRUE);
                    Integer g = rl6Var.getG();
                    int intValue2 = g != null ? g.intValue() : -1;
                    ru.yandex.taxi.map_common.map.utils.a aVar = lVar.f;
                    XYPoint xYPoint3 = new XYPoint(xYPoint.getX(), xYPoint.getY());
                    rl6Var2 = rl6Var;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$0 = rl6Var2;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$1 = str;
                    xYPoint2 = xYPoint;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$2 = xYPoint2;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$3 = set;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$4 = um00Var;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$5 = f;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$6 = if61Var;
                    advertOverlapBubbleComponentFactory$createBubble$1.L$7 = e;
                    advertOverlapBubbleComponentFactory$createBubble$1.I$0 = intValue;
                    advertOverlapBubbleComponentFactory$createBubble$1.Z$0 = l2;
                    advertOverlapBubbleComponentFactory$createBubble$1.I$1 = intValue2;
                    advertOverlapBubbleComponentFactory$createBubble$1.label = 1;
                    Object g2 = aVar.g(xYPoint3, advertOverlapBubbleComponentFactory$createBubble$1);
                    if (g2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = intValue2;
                    if61Var2 = if61Var;
                    str2 = str;
                    set2 = set;
                    um00Var2 = um00Var;
                    f2 = f;
                    i3 = intValue;
                    z = l2;
                    obj = g2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = advertOverlapBubbleComponentFactory$createBubble$1.I$1;
                    boolean z2 = advertOverlapBubbleComponentFactory$createBubble$1.Z$0;
                    int i6 = advertOverlapBubbleComponentFactory$createBubble$1.I$0;
                    e = (String) advertOverlapBubbleComponentFactory$createBubble$1.L$7;
                    if61 if61Var3 = (if61) advertOverlapBubbleComponentFactory$createBubble$1.L$6;
                    f2 = (Float) advertOverlapBubbleComponentFactory$createBubble$1.L$5;
                    ?? r10 = (vm00) advertOverlapBubbleComponentFactory$createBubble$1.L$4;
                    Set set3 = (Set) advertOverlapBubbleComponentFactory$createBubble$1.L$3;
                    xYPoint2 = (XYPoint) advertOverlapBubbleComponentFactory$createBubble$1.L$2;
                    String str3 = (String) advertOverlapBubbleComponentFactory$createBubble$1.L$1;
                    rl6 rl6Var3 = (rl6) advertOverlapBubbleComponentFactory$createBubble$1.L$0;
                    kotlin.b.b(obj);
                    i2 = i5;
                    z = z2;
                    i3 = i6;
                    if61Var2 = if61Var3;
                    um00Var2 = r10;
                    set2 = set3;
                    str2 = str3;
                    rl6Var2 = rl6Var3;
                }
                XYPoint xYPoint4 = xYPoint2;
                String str4 = e;
                f4c0 f4c0Var = new f4c0((Point) obj, null, 2);
                if (f2 != null) {
                    f4c0Var.k(f2.floatValue());
                }
                f4c0Var.i(true);
                BubbleType e2 = mbb1.e(rl6Var2);
                Bubble$BubbleKind bubble$BubbleKind = Bubble$BubbleKind.ADVERT;
                dxu0 k = rl6Var2.getK();
                return new sl6(str4, true, i3, z, i2, if61Var2, str2, xYPoint4, set2, um00Var2, k == null ? k.getG() : 0.0f, f4c0Var, e2, bubble$BubbleKind);
            }
        }
        advertOverlapBubbleComponentFactory$createBubble$1 = new AdvertOverlapBubbleComponentFactory$createBubble$1(lVar, continuationImpl);
        Object obj2 = advertOverlapBubbleComponentFactory$createBubble$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertOverlapBubbleComponentFactory$createBubble$1.label;
        if (i != 0) {
        }
        XYPoint xYPoint42 = xYPoint2;
        String str42 = e;
        f4c0 f4c0Var2 = new f4c0((Point) obj2, null, 2);
        if (f2 != null) {
        }
        f4c0Var2.i(true);
        BubbleType e22 = mbb1.e(rl6Var2);
        Bubble$BubbleKind bubble$BubbleKind2 = Bubble$BubbleKind.ADVERT;
        dxu0 k2 = rl6Var2.getK();
        return new sl6(str42, true, i3, z, i2, if61Var2, str2, xYPoint42, set2, um00Var2, k2 == null ? k2.getG() : 0.0f, f4c0Var2, e22, bubble$BubbleKind2);
    }

    public final wd1 b(String str, List list, String str2, BubbleType bubbleType) {
        String str3 = str2 + bubbleType + str;
        mzz mzzVar = this.j;
        Drawable drawable = (Drawable) mzzVar.c(str3);
        fn6 a = ibb1.a(this.h, this.a);
        a.l(drawable);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a.a((View) it.next());
        }
        fn6 d = a.d();
        Drawable e = d.e();
        if (e != null) {
        }
        Bitmap b = d.b();
        ImageProvider fromBitmap = ImageProvider.fromBitmap(b, true, str);
        this.k.d(str, fromBitmap);
        return new wd1(fromBitmap, b.getWidth(), b.getHeight());
    }

    public final k c(ym00 ym00Var, int i, boolean z) {
        pwy0 pwy0Var = this.g;
        rol0 rol0Var = new rol0(new AdvertOverlapBubbleComponentFactory$createBubbleConfig$1(Collections.singletonList(new rl6(Collections.singletonList(new nm6(oyr.i(i, "+"), 2)), g8e.p(ym00Var.e(), "-", pwy0Var.getThemeType().name()), new dxu0("l:#FFFFFF;d:#21201F", pwy0Var.getThemeType().c() ? "#FFFFFF" : "#21201F", new ym6(0), 988), 31470)), this, null));
        this.b.getClass();
        return new k(new i(new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(rol0Var, uyj.a), new AdvertOverlapBubbleComponentFactory$createBubbleConfig$2()), this, i), this, ym00Var, z);
    }
}
