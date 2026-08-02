package ru.yandex.taxi.layers.source.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.go.layers.api.model.params.AutoScale;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bvf0;
import defpackage.byx;
import defpackage.c79;
import defpackage.cwa1;
import defpackage.d3e0;
import defpackage.edc;
import defpackage.evu0;
import defpackage.f0k;
import defpackage.g050;
import defpackage.g3e0;
import defpackage.g4e0;
import defpackage.gtq0;
import defpackage.hxu0;
import defpackage.if61;
import defpackage.iib;
import defpackage.j3e0;
import defpackage.k0a1;
import defpackage.lhc;
import defpackage.lz2;
import defpackage.m3e0;
import defpackage.nm40;
import defpackage.ny61;
import defpackage.ol40;
import defpackage.p3r;
import defpackage.s8o;
import defpackage.shs0;
import defpackage.u2t;
import defpackage.u3e0;
import defpackage.v3e0;
import defpackage.w1b1;
import defpackage.xxv;
import defpackage.y2b1;
import defpackage.zyx;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.layers.analytics.LayersService;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes9.dex */
public final class d {
    public final Context a;
    public final ol40 b;
    public final ru.yandex.taxi.widget.utils.e c;
    public final ru.yandex.taxi.widget.c d;
    public final zyx e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final kotlinx.coroutines.sync.a g = gtq0.a();
    public final LruCache h = new LruCache(5);
    public final LruCache i = new LruCache(5);

    public d(Context context, ol40 ol40Var, ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.widget.c cVar, zyx zyxVar) {
        this.a = context;
        this.b = ol40Var;
        this.c = eVar;
        this.d = cVar;
        this.e = zyxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, g3e0 g3e0Var, ContinuationImpl continuationImpl) {
        PolygonsFactory$createMultiplePolygon$1 polygonsFactory$createMultiplePolygon$1;
        Object obj;
        int i;
        Float[] a;
        List list;
        List a2;
        String str;
        Float f;
        String str2;
        m3e0 c;
        m3e0 c2;
        Object f2;
        List list2;
        String str3;
        float f3;
        if61 if61Var;
        String str4;
        List list3;
        g3e0 g3e0Var2 = g3e0Var;
        dVar.getClass();
        if (continuationImpl instanceof PolygonsFactory$createMultiplePolygon$1) {
            polygonsFactory$createMultiplePolygon$1 = (PolygonsFactory$createMultiplePolygon$1) continuationImpl;
            int i2 = polygonsFactory$createMultiplePolygon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polygonsFactory$createMultiplePolygon$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = polygonsFactory$createMultiplePolygon$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonsFactory$createMultiplePolygon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String a3 = g3e0Var2.getA();
                    j3e0 c3 = g3e0Var2.getC();
                    a = (c3 == null || (c2 = c3.getC()) == null) ? null : c2.getA();
                    j3e0 c4 = g3e0Var2.getC();
                    Float b = (c4 == null || (c = c4.getC()) == null) ? null : c.getB();
                    j3e0 c5 = g3e0Var2.getC();
                    String b2 = c5 != null ? c5.getB() : null;
                    u2t b3 = g3e0Var2.getB();
                    j3e0 c6 = g3e0Var2.getC();
                    if (c6 == null || (list = c6.getD()) == null) {
                        list = EmptyList.a;
                    }
                    if (a3 == null || a == null || b == null || b2 == null || b3 == null || (a2 = b3.getA()) == null) {
                        return null;
                    }
                    PolygonsFactory$createMultiplePolygon$singlePolygons$1 polygonsFactory$createMultiplePolygon$singlePolygons$1 = new PolygonsFactory$createMultiplePolygon$singlePolygons$1(g3e0Var2, a2, null, dVar);
                    polygonsFactory$createMultiplePolygon$1.L$0 = g3e0Var2;
                    polygonsFactory$createMultiplePolygon$1.L$1 = a3;
                    polygonsFactory$createMultiplePolygon$1.L$2 = a;
                    polygonsFactory$createMultiplePolygon$1.L$3 = b;
                    polygonsFactory$createMultiplePolygon$1.L$4 = b2;
                    polygonsFactory$createMultiplePolygon$1.L$5 = null;
                    polygonsFactory$createMultiplePolygon$1.L$6 = list;
                    polygonsFactory$createMultiplePolygon$1.L$7 = null;
                    polygonsFactory$createMultiplePolygon$1.label = 1;
                    Object n = bvf0.n(polygonsFactory$createMultiplePolygon$singlePolygons$1, polygonsFactory$createMultiplePolygon$1);
                    if (n != obj) {
                        String str5 = b2;
                        str = a3;
                        obj2 = n;
                        f = b;
                        str2 = str5;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f4 = polygonsFactory$createMultiplePolygon$1.F$0;
                    if61 if61Var2 = (if61) polygonsFactory$createMultiplePolygon$1.L$11;
                    String str6 = (String) polygonsFactory$createMultiplePolygon$1.L$10;
                    String str7 = (String) polygonsFactory$createMultiplePolygon$1.L$9;
                    List list4 = (List) polygonsFactory$createMultiplePolygon$1.L$8;
                    List list5 = (List) polygonsFactory$createMultiplePolygon$1.L$6;
                    kotlin.b.b(obj2);
                    f3 = f4;
                    if61Var = if61Var2;
                    str3 = str6;
                    str4 = str7;
                    list2 = list4;
                    list3 = list5;
                    return new nm40(str4, str3, if61Var, f3, (d3e0) obj2, list2, list3);
                }
                List list6 = (List) polygonsFactory$createMultiplePolygon$1.L$6;
                str2 = (String) polygonsFactory$createMultiplePolygon$1.L$4;
                f = (Float) polygonsFactory$createMultiplePolygon$1.L$3;
                a = (Float[]) polygonsFactory$createMultiplePolygon$1.L$2;
                str = (String) polygonsFactory$createMultiplePolygon$1.L$1;
                g3e0 g3e0Var3 = (g3e0) polygonsFactory$createMultiplePolygon$1.L$0;
                kotlin.b.b(obj2);
                list = list6;
                g3e0Var2 = g3e0Var3;
                List list7 = (List) obj2;
                if61 l = a.l(a);
                float floatValue = f.floatValue();
                c79 e = g3e0Var2.getC().getE();
                polygonsFactory$createMultiplePolygon$1.L$0 = null;
                polygonsFactory$createMultiplePolygon$1.L$1 = null;
                polygonsFactory$createMultiplePolygon$1.L$2 = null;
                polygonsFactory$createMultiplePolygon$1.L$3 = null;
                polygonsFactory$createMultiplePolygon$1.L$4 = null;
                polygonsFactory$createMultiplePolygon$1.L$5 = null;
                polygonsFactory$createMultiplePolygon$1.L$6 = list;
                polygonsFactory$createMultiplePolygon$1.L$7 = null;
                polygonsFactory$createMultiplePolygon$1.L$8 = list7;
                polygonsFactory$createMultiplePolygon$1.L$9 = str;
                polygonsFactory$createMultiplePolygon$1.L$10 = str2;
                polygonsFactory$createMultiplePolygon$1.L$11 = l;
                polygonsFactory$createMultiplePolygon$1.F$0 = floatValue;
                polygonsFactory$createMultiplePolygon$1.label = 2;
                f2 = dVar.f(e, polygonsFactory$createMultiplePolygon$1);
                if (f2 != obj) {
                    list2 = list7;
                    str3 = str2;
                    f3 = floatValue;
                    if61Var = l;
                    str4 = str;
                    list3 = list;
                    obj2 = f2;
                    return new nm40(str4, str3, if61Var, f3, (d3e0) obj2, list2, list3);
                }
                return obj;
            }
        }
        polygonsFactory$createMultiplePolygon$1 = new PolygonsFactory$createMultiplePolygon$1(dVar, continuationImpl);
        Object obj22 = polygonsFactory$createMultiplePolygon$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonsFactory$createMultiplePolygon$1.label;
        if (i != 0) {
        }
        List list72 = (List) obj22;
        if61 l2 = a.l(a);
        float floatValue2 = f.floatValue();
        c79 e2 = g3e0Var2.getC().getE();
        polygonsFactory$createMultiplePolygon$1.L$0 = null;
        polygonsFactory$createMultiplePolygon$1.L$1 = null;
        polygonsFactory$createMultiplePolygon$1.L$2 = null;
        polygonsFactory$createMultiplePolygon$1.L$3 = null;
        polygonsFactory$createMultiplePolygon$1.L$4 = null;
        polygonsFactory$createMultiplePolygon$1.L$5 = null;
        polygonsFactory$createMultiplePolygon$1.L$6 = list;
        polygonsFactory$createMultiplePolygon$1.L$7 = null;
        polygonsFactory$createMultiplePolygon$1.L$8 = list72;
        polygonsFactory$createMultiplePolygon$1.L$9 = str;
        polygonsFactory$createMultiplePolygon$1.L$10 = str2;
        polygonsFactory$createMultiplePolygon$1.L$11 = l2;
        polygonsFactory$createMultiplePolygon$1.F$0 = floatValue2;
        polygonsFactory$createMultiplePolygon$1.label = 2;
        f2 = dVar.f(e2, polygonsFactory$createMultiplePolygon$1);
        if (f2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, List list, u3e0 u3e0Var, ContinuationImpl continuationImpl) {
        PolygonsFactory$createSinglePolygon$1 polygonsFactory$createSinglePolygon$1;
        Object obj;
        Object obj2;
        int i;
        List<zzs> e;
        float floatValue;
        xxv d;
        LinearRing linearRing;
        int i2;
        int i3;
        Integer num;
        List list2;
        ArrayList arrayList;
        Float b;
        int i4;
        float f;
        v3e0 v3e0Var;
        Integer num2;
        LinearRing linearRing2;
        List list3;
        dVar.getClass();
        if (continuationImpl instanceof PolygonsFactory$createSinglePolygon$1) {
            polygonsFactory$createSinglePolygon$1 = (PolygonsFactory$createSinglePolygon$1) continuationImpl;
            int i5 = polygonsFactory$createSinglePolygon$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                polygonsFactory$createSinglePolygon$1.label = i5 - Integer.MIN_VALUE;
                PolygonsFactory$createSinglePolygon$1 polygonsFactory$createSinglePolygon$12 = polygonsFactory$createSinglePolygon$1;
                obj = polygonsFactory$createSinglePolygon$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonsFactory$createSinglePolygon$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list != null && u3e0Var != null && (e = k0a1.e(list)) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (zzs zzsVar : e) {
                            Point d2 = zzsVar != null ? cwa1.d(zzsVar) : null;
                            if (d2 != null) {
                                arrayList2.add(d2);
                            }
                        }
                        if ((!arrayList2.isEmpty() ? arrayList2 : null) != null) {
                            List<List> d3 = k0a1.d(list);
                            ArrayList arrayList3 = new ArrayList();
                            for (List<zzs> list4 : d3) {
                                if (list4 != null) {
                                    arrayList = new ArrayList();
                                    for (zzs zzsVar2 : list4) {
                                        Point d4 = zzsVar2 != null ? cwa1.d(zzsVar2) : null;
                                        if (d4 != null) {
                                            arrayList.add(d4);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    arrayList3.add(arrayList);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                LinearRing h = k.h((List) it.next());
                                if (h != null) {
                                    arrayList4.add(h);
                                }
                            }
                            LinearRing h2 = k.h(arrayList2);
                            if (h2 != null) {
                                Float d5 = u3e0Var.getD();
                                floatValue = d5 != null ? d5.floatValue() : 0.0f;
                                p3r e2 = u3e0Var.getE();
                                if (e2 != null) {
                                    d = e2.getD();
                                    FormattedText a = d != null ? d.getA() : null;
                                    Integer c = d != null ? d.getC() : null;
                                    Integer g = dVar.g(e2.getC(), e2.getA(), e2.getB());
                                    if (g != null) {
                                        int intValue = g.intValue();
                                        Integer g2 = dVar.g(u3e0Var.getC(), u3e0Var.getA(), u3e0Var.getB());
                                        int intValue2 = g2 != null ? g2.intValue() : 0;
                                        if (d != null && a != null) {
                                            List list5 = a.a;
                                            ArrayList arrayList5 = new ArrayList();
                                            for (Object obj3 : list5) {
                                                if (obj3 instanceof FormattedText.h) {
                                                    arrayList5.add(obj3);
                                                }
                                            }
                                            if (!arrayList5.isEmpty()) {
                                                Iterator it2 = arrayList5.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    if (((FormattedText.h) it2.next()).a.length() > 0) {
                                                        if (c != null) {
                                                            ru.yandex.taxi.widget.c cVar = dVar.d;
                                                            polygonsFactory$createSinglePolygon$12.L$0 = null;
                                                            polygonsFactory$createSinglePolygon$12.L$1 = null;
                                                            polygonsFactory$createSinglePolygon$12.L$2 = null;
                                                            polygonsFactory$createSinglePolygon$12.L$3 = null;
                                                            polygonsFactory$createSinglePolygon$12.L$4 = arrayList4;
                                                            polygonsFactory$createSinglePolygon$12.L$5 = h2;
                                                            polygonsFactory$createSinglePolygon$12.L$6 = null;
                                                            polygonsFactory$createSinglePolygon$12.L$7 = d;
                                                            polygonsFactory$createSinglePolygon$12.L$8 = null;
                                                            polygonsFactory$createSinglePolygon$12.L$9 = c;
                                                            polygonsFactory$createSinglePolygon$12.F$0 = floatValue;
                                                            polygonsFactory$createSinglePolygon$12.I$0 = intValue;
                                                            polygonsFactory$createSinglePolygon$12.I$1 = intValue2;
                                                            polygonsFactory$createSinglePolygon$12.label = 1;
                                                            Object i6 = ru.yandex.taxi.widget.c.i(cVar, a, null, polygonsFactory$createSinglePolygon$12, 30);
                                                            if (i6 != obj2) {
                                                                linearRing = h2;
                                                                i2 = intValue2;
                                                                i3 = intValue;
                                                                num = c;
                                                                list2 = arrayList4;
                                                                obj = i6;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return new shs0(h2, arrayList4, new v3e0(intValue2, intValue, floatValue), null);
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v3e0Var = (v3e0) polygonsFactory$createSinglePolygon$12.L$13;
                    list3 = (List) polygonsFactory$createSinglePolygon$12.L$12;
                    linearRing2 = (LinearRing) polygonsFactory$createSinglePolygon$12.L$11;
                    num2 = (Integer) polygonsFactory$createSinglePolygon$12.L$9;
                    kotlin.b.b(obj);
                    return new shs0(linearRing2, list3, v3e0Var, new iib((ImageProvider) obj, num2.intValue() / dVar.a.getResources().getDisplayMetrics().density));
                }
                i2 = polygonsFactory$createSinglePolygon$12.I$1;
                int i7 = polygonsFactory$createSinglePolygon$12.I$0;
                floatValue = polygonsFactory$createSinglePolygon$12.F$0;
                num = (Integer) polygonsFactory$createSinglePolygon$12.L$9;
                d = (xxv) polygonsFactory$createSinglePolygon$12.L$7;
                linearRing = (LinearRing) polygonsFactory$createSinglePolygon$12.L$5;
                list2 = (List) polygonsFactory$createSinglePolygon$12.L$4;
                kotlin.b.b(obj);
                i3 = i7;
                CharSequence charSequence = (CharSequence) obj;
                v3e0 v3e0Var2 = new v3e0(i2, i3, floatValue);
                int intValue3 = num.intValue();
                b = d.getB();
                if (b == null) {
                    float floatValue2 = b.floatValue();
                    i4 = intValue3;
                    f = floatValue2;
                } else {
                    i4 = intValue3;
                    f = 0.0f;
                }
                polygonsFactory$createSinglePolygon$12.L$0 = null;
                polygonsFactory$createSinglePolygon$12.L$1 = null;
                polygonsFactory$createSinglePolygon$12.L$2 = null;
                polygonsFactory$createSinglePolygon$12.L$3 = null;
                polygonsFactory$createSinglePolygon$12.L$4 = null;
                polygonsFactory$createSinglePolygon$12.L$5 = null;
                polygonsFactory$createSinglePolygon$12.L$6 = null;
                polygonsFactory$createSinglePolygon$12.L$7 = null;
                polygonsFactory$createSinglePolygon$12.L$8 = null;
                polygonsFactory$createSinglePolygon$12.L$9 = num;
                polygonsFactory$createSinglePolygon$12.L$10 = null;
                polygonsFactory$createSinglePolygon$12.L$11 = linearRing;
                polygonsFactory$createSinglePolygon$12.L$12 = list2;
                polygonsFactory$createSinglePolygon$12.L$13 = v3e0Var2;
                polygonsFactory$createSinglePolygon$12.F$0 = floatValue;
                polygonsFactory$createSinglePolygon$12.I$0 = i3;
                polygonsFactory$createSinglePolygon$12.I$1 = i2;
                polygonsFactory$createSinglePolygon$12.label = 2;
                obj = dVar.d(charSequence, i4, i3, f, polygonsFactory$createSinglePolygon$12);
                if (obj != obj2) {
                    v3e0Var = v3e0Var2;
                    num2 = num;
                    linearRing2 = linearRing;
                    list3 = list2;
                    return new shs0(linearRing2, list3, v3e0Var, new iib((ImageProvider) obj, num2.intValue() / dVar.a.getResources().getDisplayMetrics().density));
                }
                return obj2;
            }
        }
        polygonsFactory$createSinglePolygon$1 = new PolygonsFactory$createSinglePolygon$1(dVar, continuationImpl);
        PolygonsFactory$createSinglePolygon$1 polygonsFactory$createSinglePolygon$122 = polygonsFactory$createSinglePolygon$1;
        obj = polygonsFactory$createSinglePolygon$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonsFactory$createSinglePolygon$122.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj;
        v3e0 v3e0Var22 = new v3e0(i2, i3, floatValue);
        int intValue32 = num.intValue();
        b = d.getB();
        if (b == null) {
        }
        polygonsFactory$createSinglePolygon$122.L$0 = null;
        polygonsFactory$createSinglePolygon$122.L$1 = null;
        polygonsFactory$createSinglePolygon$122.L$2 = null;
        polygonsFactory$createSinglePolygon$122.L$3 = null;
        polygonsFactory$createSinglePolygon$122.L$4 = null;
        polygonsFactory$createSinglePolygon$122.L$5 = null;
        polygonsFactory$createSinglePolygon$122.L$6 = null;
        polygonsFactory$createSinglePolygon$122.L$7 = null;
        polygonsFactory$createSinglePolygon$122.L$8 = null;
        polygonsFactory$createSinglePolygon$122.L$9 = num;
        polygonsFactory$createSinglePolygon$122.L$10 = null;
        polygonsFactory$createSinglePolygon$122.L$11 = linearRing;
        polygonsFactory$createSinglePolygon$122.L$12 = list2;
        polygonsFactory$createSinglePolygon$122.L$13 = v3e0Var22;
        polygonsFactory$createSinglePolygon$122.F$0 = floatValue;
        polygonsFactory$createSinglePolygon$122.I$0 = i3;
        polygonsFactory$createSinglePolygon$122.I$1 = i2;
        polygonsFactory$createSinglePolygon$122.label = 2;
        obj = dVar.d(charSequence2, i4, i3, f, polygonsFactory$createSinglePolygon$122);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g4e0 g4e0Var, ContinuationImpl continuationImpl) {
        PolygonsFactory$createPolygons$1 polygonsFactory$createPolygons$1;
        int i;
        long currentTimeMillis;
        byx byxVar;
        if (continuationImpl instanceof PolygonsFactory$createPolygons$1) {
            polygonsFactory$createPolygons$1 = (PolygonsFactory$createPolygons$1) continuationImpl;
            int i2 = polygonsFactory$createPolygons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polygonsFactory$createPolygons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = polygonsFactory$createPolygons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonsFactory$createPolygons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = g4e0Var.f;
                    if (list == null) {
                        return null;
                    }
                    byx byxVar2 = g4e0Var.i;
                    if (byxVar2 == null) {
                        byxVar2 = null;
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    PolygonsFactory$createPolygons$2$1 polygonsFactory$createPolygons$2$1 = new PolygonsFactory$createPolygons$2$1(list, this, null);
                    polygonsFactory$createPolygons$1.L$0 = null;
                    polygonsFactory$createPolygons$1.L$1 = null;
                    polygonsFactory$createPolygons$1.L$2 = this;
                    polygonsFactory$createPolygons$1.L$3 = byxVar2;
                    polygonsFactory$createPolygons$1.J$0 = currentTimeMillis;
                    polygonsFactory$createPolygons$1.label = 1;
                    obj = bvf0.n(polygonsFactory$createPolygons$2$1, polygonsFactory$createPolygons$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    byxVar = byxVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = polygonsFactory$createPolygons$1.J$0;
                    byx byxVar3 = (byx) polygonsFactory$createPolygons$1.L$3;
                    d dVar = (d) polygonsFactory$createPolygons$1.L$2;
                    kotlin.b.b(obj);
                    currentTimeMillis = j;
                    byxVar = byxVar3;
                    this = dVar;
                }
                List list2 = (List) obj;
                this.e.d(byxVar, LayersService.POLYGONS, list2.size(), System.currentTimeMillis() - currentTimeMillis);
                return list2;
            }
        }
        polygonsFactory$createPolygons$1 = new PolygonsFactory$createPolygons$1(this, continuationImpl);
        Object obj2 = polygonsFactory$createPolygons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonsFactory$createPolygons$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        this.e.d(byxVar, LayersService.POLYGONS, list22.size(), System.currentTimeMillis() - currentTimeMillis);
        return list22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[Catch: all -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f5, blocks: (B:11:0x0063, B:16:0x0084), top: B:10:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(CharSequence charSequence, int i, int i2, float f, ContinuationImpl continuationImpl) {
        PolygonsFactory$createTexture$1 polygonsFactory$createTexture$1;
        int i3;
        g050 g050Var;
        int i4;
        int i5;
        float f2;
        CharSequence charSequence2;
        ImageProvider imageProvider;
        LruCache lruCache = this.h;
        try {
            if (continuationImpl instanceof PolygonsFactory$createTexture$1) {
                polygonsFactory$createTexture$1 = (PolygonsFactory$createTexture$1) continuationImpl;
                int i6 = polygonsFactory$createTexture$1.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    polygonsFactory$createTexture$1.label = i6 - Integer.MIN_VALUE;
                    Object obj = polygonsFactory$createTexture$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = polygonsFactory$createTexture$1.label;
                    if (i3 != 0) {
                        kotlin.b.b(obj);
                        polygonsFactory$createTexture$1.L$0 = charSequence;
                        g050Var = this.f;
                        polygonsFactory$createTexture$1.L$1 = g050Var;
                        i4 = i;
                        polygonsFactory$createTexture$1.I$0 = i4;
                        i5 = i2;
                        polygonsFactory$createTexture$1.I$1 = i5;
                        f2 = f;
                        polygonsFactory$createTexture$1.F$0 = f2;
                        polygonsFactory$createTexture$1.label = 1;
                        if (g050Var.a(polygonsFactory$createTexture$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        charSequence2 = charSequence;
                    } else {
                        if (i3 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        float f3 = polygonsFactory$createTexture$1.F$0;
                        int i7 = polygonsFactory$createTexture$1.I$1;
                        int i8 = polygonsFactory$createTexture$1.I$0;
                        g050Var = (g050) polygonsFactory$createTexture$1.L$1;
                        CharSequence charSequence3 = (CharSequence) polygonsFactory$createTexture$1.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = charSequence3;
                        f2 = f3;
                        i5 = i7;
                        i4 = i8;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(charSequence2);
                    sb.append(i4);
                    sb.append(i5);
                    sb.append(f2);
                    String sb2 = sb.toString();
                    imageProvider = (ImageProvider) lruCache.get(sb2);
                    if (imageProvider == null) {
                        return imageProvider;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(i5);
                    RobotoTextView robotoTextView = new RobotoTextView(this.a, null, 0, 6, null);
                    robotoTextView.setText(charSequence2);
                    robotoTextView.setGravity(17);
                    robotoTextView.setTextColor(-1);
                    robotoTextView.measure(View.MeasureSpec.makeMeasureSpec(createBitmap.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(createBitmap.getHeight(), 1073741824));
                    robotoTextView.layout(0, 0, robotoTextView.getMeasuredWidth(), robotoTextView.getMeasuredHeight());
                    canvas.rotate(-f2, createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                    robotoTextView.draw(canvas);
                    ImageProvider fromBitmap = ImageProvider.fromBitmap(createBitmap);
                    lruCache.put(sb2, fromBitmap);
                    return fromBitmap;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequence2);
            sb3.append(i4);
            sb3.append(i5);
            sb3.append(f2);
            String sb22 = sb3.toString();
            imageProvider = (ImageProvider) lruCache.get(sb22);
            if (imageProvider == null) {
            }
        } finally {
            g050Var.d(null);
        }
        polygonsFactory$createTexture$1 = new PolygonsFactory$createTexture$1(this, continuationImpl);
        Object obj2 = polygonsFactory$createTexture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = polygonsFactory$createTexture$1.label;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0083, code lost:
    
        if (r4.a(r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00be, B:15:0x00c2, B:20:0x00ce), top: B:11:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce A[Catch: all -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00be, B:15:0x00c2, B:20:0x00ce), top: B:11:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:43:0x0086, B:45:0x009a), top: B:42:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(c79 c79Var, ContinuationImpl continuationImpl) {
        PolygonsFactory$prepareAppearance$1 polygonsFactory$prepareAppearance$1;
        int i;
        hxu0 b;
        c79 c79Var2;
        g050 g050Var;
        g050 g050Var2;
        ImageProvider imageProvider;
        c79 c79Var3;
        String str;
        Float a;
        Bitmap bitmap;
        try {
            if (continuationImpl instanceof PolygonsFactory$prepareAppearance$1) {
                polygonsFactory$prepareAppearance$1 = (PolygonsFactory$prepareAppearance$1) continuationImpl;
                int i2 = polygonsFactory$prepareAppearance$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    polygonsFactory$prepareAppearance$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = polygonsFactory$prepareAppearance$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = polygonsFactory$prepareAppearance$1.label;
                    LruCache lruCache = this.i;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (c79Var.getB() == null || (b = c79Var.getB().getB()) == null || b.getA() == null) {
                            return null;
                        }
                        c79Var2 = c79Var;
                        polygonsFactory$prepareAppearance$1.L$0 = c79Var2;
                        g050Var = this.g;
                        polygonsFactory$prepareAppearance$1.L$1 = g050Var;
                        polygonsFactory$prepareAppearance$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = (String) polygonsFactory$prepareAppearance$1.L$2;
                            g050Var2 = (g050) polygonsFactory$prepareAppearance$1.L$1;
                            c79Var3 = (c79) polygonsFactory$prepareAppearance$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                                bitmap = bitmapDrawable == null ? bitmapDrawable.getBitmap() : null;
                                if (bitmap != null) {
                                    g050Var2.d(null);
                                    return null;
                                }
                                imageProvider = ImageProvider.fromBitmap(bitmap, true, str);
                                lruCache.put(str, imageProvider);
                                c79Var2 = c79Var3;
                                g050Var = g050Var2;
                                g050Var.d(null);
                                f0k c = c79Var2.getC();
                                float floatValue = (c != null || (a = c.getA()) == null) ? 1.0f : a.floatValue();
                                AutoScale d = c79Var2.getB().getD();
                                return new lz2(imageProvider, floatValue, (y2b1) null, 0.0f, d != null ? w1b1.b(d) : null, (AppearanceType) null, (PointF) null, (ImageProvider) null, (PointF) null, 1004);
                            } catch (Throwable th) {
                                th = th;
                                g050Var2.d(null);
                                throw th;
                            }
                        }
                        g050Var = (g050) polygonsFactory$prepareAppearance$1.L$1;
                        c79 c79Var4 = (c79) polygonsFactory$prepareAppearance$1.L$0;
                        kotlin.b.b(obj);
                        c79Var2 = c79Var4;
                    }
                    String a2 = c79Var2.getB().getB().getA();
                    imageProvider = (ImageProvider) lruCache.get(a2);
                    if (imageProvider == null) {
                        ru.yandex.taxi.widget.utils.e eVar = this.c;
                        String a3 = c79Var2.getB().getB().getA();
                        polygonsFactory$prepareAppearance$1.L$0 = c79Var2;
                        polygonsFactory$prepareAppearance$1.L$1 = g050Var;
                        polygonsFactory$prepareAppearance$1.L$2 = a2;
                        polygonsFactory$prepareAppearance$1.L$3 = null;
                        polygonsFactory$prepareAppearance$1.label = 2;
                        Object f = ru.yandex.taxi.widget.utils.e.f(eVar, a3, null, polygonsFactory$prepareAppearance$1, 6);
                        if (f != coroutineSingletons) {
                            c79Var3 = c79Var2;
                            g050Var2 = g050Var;
                            obj = f;
                            str = a2;
                            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                            if (bitmapDrawable2 == null) {
                            }
                            if (bitmap != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    g050Var.d(null);
                    f0k c2 = c79Var2.getC();
                    float floatValue2 = (c2 != null || (a = c2.getA()) == null) ? 1.0f : a.floatValue();
                    AutoScale d2 = c79Var2.getB().getD();
                    return new lz2(imageProvider, floatValue2, (y2b1) null, 0.0f, d2 != null ? w1b1.b(d2) : null, (AppearanceType) null, (PointF) null, (ImageProvider) null, (PointF) null, 1004);
                }
            }
            String a22 = c79Var2.getB().getB().getA();
            imageProvider = (ImageProvider) lruCache.get(a22);
            if (imageProvider == null) {
            }
            g050Var.d(null);
            f0k c22 = c79Var2.getC();
            float floatValue22 = (c22 != null || (a = c22.getA()) == null) ? 1.0f : a.floatValue();
            AutoScale d22 = c79Var2.getB().getD();
            return new lz2(imageProvider, floatValue22, (y2b1) null, 0.0f, d22 != null ? w1b1.b(d22) : null, (AppearanceType) null, (PointF) null, (ImageProvider) null, (PointF) null, 1004);
        } catch (Throwable th2) {
            th = th2;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
        polygonsFactory$prepareAppearance$1 = new PolygonsFactory$prepareAppearance$1(this, continuationImpl);
        Object obj2 = polygonsFactory$prepareAppearance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonsFactory$prepareAppearance$1.label;
        LruCache lruCache2 = this.i;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(c79 c79Var, ContinuationImpl continuationImpl) {
        PolygonsFactory$preparePolygonCentroid$1 polygonsFactory$preparePolygonCentroid$1;
        int i;
        f0k c;
        lz2 lz2Var;
        if (continuationImpl instanceof PolygonsFactory$preparePolygonCentroid$1) {
            polygonsFactory$preparePolygonCentroid$1 = (PolygonsFactory$preparePolygonCentroid$1) continuationImpl;
            int i2 = polygonsFactory$preparePolygonCentroid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polygonsFactory$preparePolygonCentroid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = polygonsFactory$preparePolygonCentroid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonsFactory$preparePolygonCentroid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (c79Var != null && c79Var.getA() != null && (c = c79Var.getC()) != null && c.getC() != null) {
                        polygonsFactory$preparePolygonCentroid$1.L$0 = c79Var;
                        polygonsFactory$preparePolygonCentroid$1.label = 1;
                        obj = e(c79Var, polygonsFactory$preparePolygonCentroid$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c79Var = (c79) polygonsFactory$preparePolygonCentroid$1.L$0;
                kotlin.b.b(obj);
                lz2Var = (lz2) obj;
                if (lz2Var != null) {
                    return new d3e0(cwa1.d(c79Var.getA()), a.l(c79Var.getC().getC()), lz2Var);
                }
                return null;
            }
        }
        polygonsFactory$preparePolygonCentroid$1 = new PolygonsFactory$preparePolygonCentroid$1(this, continuationImpl);
        Object obj3 = polygonsFactory$preparePolygonCentroid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonsFactory$preparePolygonCentroid$1.label;
        if (i != 0) {
        }
        lz2Var = (lz2) obj3;
        if (lz2Var != null) {
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:17|(5:19|20|(0)|8|9)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        defpackage.xby.d.k(r3, "Parsing color error, color = ".concat(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer g(Integer num, String str, String str2) {
        int parseColor;
        if (str2 != null) {
            this.b.getClass();
            edc a = ol40.a(str2);
            if (a != null) {
                parseColor = s8o.m(a, this.a);
                return Integer.valueOf(lhc.f(parseColor, Math.abs((int) (((num != null ? num.intValue() : 0) / 100.0f) * 255.0f)) & 255));
            }
        }
        if (str == null) {
            return null;
        }
        int i = -65536;
        if (!evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    parseColor = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
                return Integer.valueOf(lhc.f(parseColor, Math.abs((int) (((num != null ? num.intValue() : 0) / 100.0f) * 255.0f)) & 255));
            }
            i = Color.parseColor(upperCase);
        }
        parseColor = i;
        return Integer.valueOf(lhc.f(parseColor, Math.abs((int) (((num != null ? num.intValue() : 0) / 100.0f) * 255.0f)) & 255));
    }
}
