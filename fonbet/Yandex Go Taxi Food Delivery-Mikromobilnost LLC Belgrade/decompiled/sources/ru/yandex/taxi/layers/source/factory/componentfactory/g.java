package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.dxu0;
import defpackage.f4c0;
import defpackage.fn6;
import defpackage.ibb1;
import defpackage.if61;
import defpackage.jl40;
import defpackage.lhc;
import defpackage.mbb1;
import defpackage.mzz;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.rl6;
import defpackage.sl6;
import defpackage.tje;
import defpackage.tn6;
import defpackage.ud1;
import defpackage.um00;
import defpackage.vm00;
import defpackage.xw31;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.domain.model.Bubble$BubbleKind;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes9.dex */
public final class g {
    public final Context a;
    public final pdc b;
    public final ru.yandex.taxi.map_common.map.utils.a c;
    public final pwy0 d;
    public final Canvas e = new Canvas();
    public final Object f = new Object();
    public final mzz g = new mzz(5);
    public final mzz h = new mzz(20);

    public g(Context context, pdc pdcVar, ru.yandex.taxi.map_common.map.utils.a aVar, pwy0 pwy0Var) {
        this.a = context;
        this.b = pdcVar;
        this.c = aVar;
        this.d = pwy0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v4, types: [vm00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rl6 rl6Var, String str, XYPoint xYPoint, Set set, um00 um00Var, Float f, if61 if61Var, ContinuationImpl continuationImpl) {
        AdvertOverlapBubbleBackgroundComponentFactory$createBubble$1 advertOverlapBubbleBackgroundComponentFactory$createBubble$1;
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
        if (continuationImpl instanceof AdvertOverlapBubbleBackgroundComponentFactory$createBubble$1) {
            advertOverlapBubbleBackgroundComponentFactory$createBubble$1 = (AdvertOverlapBubbleBackgroundComponentFactory$createBubble$1) continuationImpl;
            int i4 = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                advertOverlapBubbleBackgroundComponentFactory$createBubble$1.label = i4 - Integer.MIN_VALUE;
                Object obj = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e = rl6Var.getE();
                    if (e == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    Integer h = rl6Var.getH();
                    int intValue = h != null ? h.intValue() : -1;
                    boolean l = jl40.l(rl6Var.getD(), Boolean.TRUE);
                    Integer g = rl6Var.getG();
                    int intValue2 = g != null ? g.intValue() : -1;
                    XYPoint xYPoint3 = new XYPoint(xYPoint.getX(), xYPoint.getY());
                    rl6Var2 = rl6Var;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$0 = rl6Var2;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$1 = str;
                    xYPoint2 = xYPoint;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$2 = xYPoint2;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$3 = set;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$4 = um00Var;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$5 = f;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$6 = if61Var;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$7 = e;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.I$0 = intValue;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.Z$0 = l;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.I$1 = intValue2;
                    advertOverlapBubbleBackgroundComponentFactory$createBubble$1.label = 1;
                    Object g2 = this.c.g(xYPoint3, advertOverlapBubbleBackgroundComponentFactory$createBubble$1);
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
                    z = l;
                    obj = g2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.I$1;
                    boolean z2 = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.Z$0;
                    int i6 = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.I$0;
                    e = (String) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$7;
                    if61 if61Var3 = (if61) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$6;
                    f2 = (Float) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$5;
                    ?? r10 = (vm00) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$4;
                    Set set3 = (Set) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$3;
                    xYPoint2 = (XYPoint) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$2;
                    String str3 = (String) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$1;
                    rl6 rl6Var3 = (rl6) advertOverlapBubbleBackgroundComponentFactory$createBubble$1.L$0;
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
        advertOverlapBubbleBackgroundComponentFactory$createBubble$1 = new AdvertOverlapBubbleBackgroundComponentFactory$createBubble$1(this, continuationImpl);
        Object obj2 = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertOverlapBubbleBackgroundComponentFactory$createBubble$1.label;
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

    public final ud1 b(String str, List list, int i, String str2, BubbleType bubbleType, tn6 tn6Var, int i2) {
        String str3 = str2 + bubbleType + str;
        mzz mzzVar = this.g;
        Drawable drawable = (Drawable) mzzVar.c(str3);
        Canvas canvas = this.e;
        Context context = this.a;
        fn6 a = ibb1.a(canvas, context);
        a.l(drawable);
        b.a aVar = new b.a();
        aVar.c(tje.w(14, context));
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar.a());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(lhc.f(i, 255 & Math.abs(255))));
        materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(i));
        materialShapeDrawable.setStrokeWidth(tje.x(context, 1.5f));
        boolean n = xw31.n(context);
        int i3 = i2 * 6;
        int w = ((int) tje.w(tn6Var != null ? tn6Var.getC() : 15, context)) + i3;
        int w2 = (int) tje.w(tn6Var != null ? tn6Var.getB() : 7, context);
        int w3 = (int) tje.w(tn6Var != null ? tn6Var.getD() : 7, context);
        int i4 = i3 + 15;
        int i5 = !n ? i4 : w;
        if (n) {
            w = i4;
        }
        materialShapeDrawable.setPadding(i5, w2, w, w3);
        a.j(materialShapeDrawable);
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
        this.h.d(str, fromBitmap);
        return new ud1(fromBitmap, b.getWidth(), b.getHeight());
    }
}
