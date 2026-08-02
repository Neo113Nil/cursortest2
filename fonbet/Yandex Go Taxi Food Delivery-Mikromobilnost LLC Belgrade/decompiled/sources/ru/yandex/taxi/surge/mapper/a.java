package ru.yandex.taxi.surge.mapper;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import defpackage.a4j;
import defpackage.ayt;
import defpackage.b4j;
import defpackage.bdc;
import defpackage.bss0;
import defpackage.btw0;
import defpackage.bvf0;
import defpackage.c0b;
import defpackage.css0;
import defpackage.d0b;
import defpackage.d9s;
import defpackage.dbl0;
import defpackage.duw0;
import defpackage.dzg0;
import defpackage.e0b;
import defpackage.f0b;
import defpackage.fef;
import defpackage.fqw0;
import defpackage.g0b;
import defpackage.g8e;
import defpackage.gow0;
import defpackage.hmc;
import defpackage.iow0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jow0;
import defpackage.jst;
import defpackage.juw0;
import defpackage.kdc;
import defpackage.ktw0;
import defpackage.lky0;
import defpackage.low0;
import defpackage.m810;
import defpackage.mam;
import defpackage.mth;
import defpackage.nky0;
import defpackage.nrq0;
import defpackage.ntq;
import defpackage.nuq;
import defpackage.ny61;
import defpackage.o2j;
import defpackage.oky0;
import defpackage.oxt;
import defpackage.pdc;
import defpackage.q3q0;
import defpackage.q5z;
import defpackage.qbl0;
import defpackage.qge;
import defpackage.quw0;
import defpackage.qye0;
import defpackage.rxt;
import defpackage.rye0;
import defpackage.scc;
import defpackage.smq0;
import defpackage.sxt;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ufu;
import defpackage.v3j;
import defpackage.vng;
import defpackage.w511;
import defpackage.xby;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.xrs0;
import defpackage.y3j;
import defpackage.yal0;
import defpackage.ycc;
import defpackage.yrs0;
import defpackage.z3j;
import defpackage.zrs0;
import defpackage.zxt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.surge.models.dto.DetailedPriceContent;
import ru.yandex.taxi.surge.models.dto.SelectorStyle;
import ru.yandex.taxi.surge.models.dto.a1;
import ru.yandex.taxi.surge.models.dto.b1;
import ru.yandex.taxi.surge.models.dto.c0;
import ru.yandex.taxi.surge.models.dto.c1;
import ru.yandex.taxi.surge.models.dto.d1;
import ru.yandex.taxi.surge.models.dto.e1;
import ru.yandex.taxi.surge.models.dto.f0;
import ru.yandex.taxi.surge.models.dto.f1;
import ru.yandex.taxi.surge.models.dto.g0;
import ru.yandex.taxi.surge.models.dto.g1;
import ru.yandex.taxi.surge.models.dto.h0;
import ru.yandex.taxi.surge.models.dto.h1;
import ru.yandex.taxi.surge.models.dto.i1;
import ru.yandex.taxi.surge.models.dto.j1;
import ru.yandex.taxi.surge.models.dto.l0;
import ru.yandex.taxi.surge.models.dto.s0;
import ru.yandex.taxi.surge.models.dto.v;
import ru.yandex.taxi.surge.models.dto.w;
import ru.yandex.taxi.surge.models.dto.x;
import ru.yandex.taxi.surge.models.dto.x0;
import ru.yandex.taxi.surge.models.dto.y;
import ru.yandex.taxi.surge.models.dto.y0;
import ru.yandex.taxi.surge.models.dto.z0;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final e b;
    public final pdc c;
    public final b d;
    public final qbl0 e;
    public final v3j f;
    public final xdf g;
    public final quw0 h;
    public final int j;
    public final fqw0 i = new fqw0();
    public final ColorDrawable k = new ColorDrawable();

    public a(Context context, e eVar, pdc pdcVar, b bVar, qbl0 qbl0Var, v3j v3jVar, xdf xdfVar, quw0 quw0Var) {
        this.a = context;
        this.b = eVar;
        this.c = pdcVar;
        this.d = bVar;
        this.e = qbl0Var;
        this.f = v3jVar;
        this.g = xdfVar;
        this.h = quw0Var;
        this.j = tje.u(40, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, btw0 btw0Var, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$headerIcon$1 surgeInfoStateMapper$headerIcon$1;
        int i;
        ShapeDrawable shapeDrawable;
        BitmapDrawable bitmapDrawable;
        int i2 = aVar.j;
        if (continuationImpl instanceof SurgeInfoStateMapper$headerIcon$1) {
            surgeInfoStateMapper$headerIcon$1 = (SurgeInfoStateMapper$headerIcon$1) continuationImpl;
            int i3 = surgeInfoStateMapper$headerIcon$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$headerIcon$1.label = i3 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$headerIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$headerIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Integer S = q5z.S(btw0Var.b.e);
                    if (S != null) {
                        int intValue = S.intValue();
                        String str = btw0Var.b.d;
                        if (str.length() <= 0) {
                            str = null;
                        }
                        if (str != null) {
                            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                            shapeDrawable2.getPaint().setColor(intValue);
                            e eVar = aVar.b;
                            surgeInfoStateMapper$headerIcon$1.L$0 = null;
                            surgeInfoStateMapper$headerIcon$1.L$1 = null;
                            surgeInfoStateMapper$headerIcon$1.L$2 = shapeDrawable2;
                            surgeInfoStateMapper$headerIcon$1.I$0 = intValue;
                            surgeInfoStateMapper$headerIcon$1.label = 1;
                            obj = e.f(eVar, str, null, surgeInfoStateMapper$headerIcon$1, 6);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            shapeDrawable = shapeDrawable2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                shapeDrawable = (ShapeDrawable) surgeInfoStateMapper$headerIcon$1.L$2;
                kotlin.b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    mam.b(bitmapDrawable, i2, false);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, bitmapDrawable});
                    layerDrawable.setLayerSize(0, i2, i2);
                    layerDrawable.setLayerSize(1, bitmapDrawable.getBounds().width(), bitmapDrawable.getBounds().height());
                    layerDrawable.setLayerGravity(1, 17);
                    return layerDrawable;
                }
                return null;
            }
        }
        surgeInfoStateMapper$headerIcon$1 = new SurgeInfoStateMapper$headerIcon$1(aVar, continuationImpl);
        Object obj2 = surgeInfoStateMapper$headerIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$headerIcon$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, sxt sxtVar, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapGradientLineItem$1 surgeInfoStateMapper$mapGradientLineItem$1;
        int i;
        pdc pdcVar = aVar.c;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapGradientLineItem$1) {
            surgeInfoStateMapper$mapGradientLineItem$1 = (SurgeInfoStateMapper$mapGradientLineItem$1) continuationImpl;
            int i2 = surgeInfoStateMapper$mapGradientLineItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapGradientLineItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapGradientLineItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapGradientLineItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (sxtVar instanceof rxt) {
                        rxt rxtVar = (rxt) sxtVar;
                        ufu ufuVar = (ufu) pdcVar;
                        return new ayt(rxtVar.a.toString(), m810.a(rxtVar.b), rxtVar.c, ufuVar.h(new bdc(xng0.textMain), rxtVar.d));
                    }
                    if (!(sxtVar instanceof oxt)) {
                        w511.b();
                        return null;
                    }
                    e eVar = aVar.b;
                    String str = ((oxt) sxtVar).a;
                    surgeInfoStateMapper$mapGradientLineItem$1.L$0 = sxtVar;
                    surgeInfoStateMapper$mapGradientLineItem$1.label = 1;
                    obj = e.f(eVar, str, null, surgeInfoStateMapper$mapGradientLineItem$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sxtVar = (sxt) surgeInfoStateMapper$mapGradientLineItem$1.L$0;
                    kotlin.b.b(obj);
                }
                oxt oxtVar = (oxt) sxtVar;
                ufu ufuVar2 = (ufu) pdcVar;
                return new zxt((BitmapDrawable) obj, m810.a(oxtVar.b), ufuVar2.f(new bdc(xng0.iconMinor), oxtVar.d));
            }
        }
        surgeInfoStateMapper$mapGradientLineItem$1 = new SurgeInfoStateMapper$mapGradientLineItem$1(aVar, continuationImpl);
        Object obj2 = surgeInfoStateMapper$mapGradientLineItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapGradientLineItem$1.label;
        if (i != 0) {
        }
        oxt oxtVar2 = (oxt) sxtVar;
        ufu ufuVar22 = (ufu) pdcVar;
        return new zxt((BitmapDrawable) obj2, m810.a(oxtVar2.b), ufuVar22.f(new bdc(xng0.iconMinor), oxtVar2.d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec A[LOOP:0: B:41:0x00e6->B:43:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00fc -> B:20:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:21:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0128 -> B:11:0x012d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable c(a aVar, List list, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapSection$1 surgeInfoStateMapper$mapSection$1;
        int i;
        List list2;
        SurgeInfoStateMapper$mapSection$1 surgeInfoStateMapper$mapSection$12;
        int size;
        ArrayList arrayList;
        int i2;
        int i3;
        List list3;
        ArrayList arrayList2;
        int i4;
        int i5;
        List list4;
        Iterator it;
        aVar.getClass();
        if (continuationImpl instanceof SurgeInfoStateMapper$mapSection$1) {
            surgeInfoStateMapper$mapSection$1 = (SurgeInfoStateMapper$mapSection$1) continuationImpl;
            int i6 = surgeInfoStateMapper$mapSection$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapSection$1.label = i6 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapSection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapSection$1.label;
                int i7 = -1;
                int i8 = 1;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    list2 = list;
                    surgeInfoStateMapper$mapSection$12 = surgeInfoStateMapper$mapSection$1;
                    size = list.size() - 1;
                    arrayList = t;
                    i2 = 1;
                    if (i7 >= size) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = surgeInfoStateMapper$mapSection$1.I$1;
                        i4 = surgeInfoStateMapper$mapSection$1.I$0;
                        arrayList2 = (ArrayList) surgeInfoStateMapper$mapSection$1.L$1;
                        list3 = (List) surgeInfoStateMapper$mapSection$1.L$0;
                        kotlin.b.b(obj);
                        i3 = -1;
                        qge qgeVar = (qge) obj;
                        if (qgeVar != null) {
                            i4 = ((qgeVar instanceof nrq0) || (qgeVar instanceof q3q0)) ? 1 : 0;
                            arrayList2.add(0, qgeVar);
                        }
                        surgeInfoStateMapper$mapSection$12 = surgeInfoStateMapper$mapSection$1;
                        i2 = i4;
                        arrayList = arrayList2;
                        list2 = list3;
                        size = i5 - 1;
                        i7 = i3;
                        i8 = 1;
                        if (i7 >= size) {
                            return arrayList;
                        }
                        ?? r5 = (size >= scc.f(list2) || !(list2.get(size + 1) instanceof f1)) ? 0 : i8;
                        ?? r4 = (size <= 0 || !(list2.get(size + (-1)) instanceof c1)) ? 0 : i8;
                        j1 j1Var = (j1) list2.get(size);
                        if (j1Var instanceof d1) {
                            d1 d1Var = (d1) j1Var;
                            boolean z = i2 != 0 ? i8 : 0;
                            surgeInfoStateMapper$mapSection$12.L$0 = list2;
                            surgeInfoStateMapper$mapSection$12.L$1 = arrayList;
                            surgeInfoStateMapper$mapSection$12.L$2 = null;
                            surgeInfoStateMapper$mapSection$12.I$0 = i2;
                            surgeInfoStateMapper$mapSection$12.I$1 = size;
                            surgeInfoStateMapper$mapSection$12.I$2 = r5;
                            surgeInfoStateMapper$mapSection$12.I$3 = r4;
                            surgeInfoStateMapper$mapSection$12.label = i8;
                            int i9 = i2;
                            ArrayList arrayList3 = arrayList;
                            i3 = i7;
                            obj = bvf0.n(new SurgeInfoStateMapper$mapGroupTextBlock$2(aVar, d1Var, z, r4, r5, null), surgeInfoStateMapper$mapSection$12);
                            if (obj != coroutineSingletons) {
                                arrayList2 = arrayList3;
                                i4 = i9;
                                list3 = list2;
                                surgeInfoStateMapper$mapSection$1 = surgeInfoStateMapper$mapSection$12;
                                i5 = size;
                                list4 = (List) obj;
                                it = kotlin.collections.a.q0(list4).iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(0, (lky0) it.next());
                                }
                                if (!list4.isEmpty()) {
                                    surgeInfoStateMapper$mapSection$12 = surgeInfoStateMapper$mapSection$1;
                                    arrayList = arrayList2;
                                    list2 = list3;
                                    i2 = 0;
                                    size = i5 - 1;
                                    i7 = i3;
                                    i8 = 1;
                                    if (i7 >= size) {
                                    }
                                }
                                surgeInfoStateMapper$mapSection$12 = surgeInfoStateMapper$mapSection$1;
                                i2 = i4;
                                arrayList = arrayList2;
                                list2 = list3;
                                size = i5 - 1;
                                i7 = i3;
                                i8 = 1;
                                if (i7 >= size) {
                                }
                            }
                        } else {
                            int i10 = i2;
                            i3 = i7;
                            ArrayList arrayList4 = arrayList;
                            boolean z2 = i10 != 0;
                            surgeInfoStateMapper$mapSection$12.L$0 = list2;
                            surgeInfoStateMapper$mapSection$12.L$1 = arrayList4;
                            surgeInfoStateMapper$mapSection$12.L$2 = null;
                            surgeInfoStateMapper$mapSection$12.I$0 = i10;
                            surgeInfoStateMapper$mapSection$12.I$1 = size;
                            surgeInfoStateMapper$mapSection$12.I$2 = r5;
                            surgeInfoStateMapper$mapSection$12.I$3 = r4;
                            surgeInfoStateMapper$mapSection$12.label = 2;
                            obj = aVar.i(j1Var, z2, r5, surgeInfoStateMapper$mapSection$12);
                            if (obj != coroutineSingletons) {
                                arrayList2 = arrayList4;
                                i4 = i10;
                                list3 = list2;
                                surgeInfoStateMapper$mapSection$1 = surgeInfoStateMapper$mapSection$12;
                                i5 = size;
                                qge qgeVar2 = (qge) obj;
                                if (qgeVar2 != null) {
                                }
                                surgeInfoStateMapper$mapSection$12 = surgeInfoStateMapper$mapSection$1;
                                i2 = i4;
                                arrayList = arrayList2;
                                list2 = list3;
                                size = i5 - 1;
                                i7 = i3;
                                i8 = 1;
                                if (i7 >= size) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    i5 = surgeInfoStateMapper$mapSection$1.I$1;
                    i4 = surgeInfoStateMapper$mapSection$1.I$0;
                    arrayList2 = (ArrayList) surgeInfoStateMapper$mapSection$1.L$1;
                    list3 = (List) surgeInfoStateMapper$mapSection$1.L$0;
                    kotlin.b.b(obj);
                    i3 = -1;
                    list4 = (List) obj;
                    it = kotlin.collections.a.q0(list4).iterator();
                    while (it.hasNext()) {
                    }
                    if (!list4.isEmpty()) {
                    }
                    surgeInfoStateMapper$mapSection$12 = surgeInfoStateMapper$mapSection$1;
                    i2 = i4;
                    arrayList = arrayList2;
                    list2 = list3;
                    size = i5 - 1;
                    i7 = i3;
                    i8 = 1;
                    if (i7 >= size) {
                    }
                }
            }
        }
        surgeInfoStateMapper$mapSection$1 = new SurgeInfoStateMapper$mapSection$1(aVar, continuationImpl);
        Object obj2 = surgeInfoStateMapper$mapSection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapSection$1.label;
        int i72 = -1;
        int i82 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(y0 y0Var, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapChartItem$1 surgeInfoStateMapper$mapChartItem$1;
        int i;
        c0b c0bVar;
        List list;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapChartItem$1) {
            surgeInfoStateMapper$mapChartItem$1 = (SurgeInfoStateMapper$mapChartItem$1) continuationImpl;
            int i2 = surgeInfoStateMapper$mapChartItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapChartItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapChartItem$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapChartItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0 l0Var = y0Var.a;
                    c0b c0bVar2 = new c0b(l0Var.a.a);
                    List<l0.b> list2 = l0Var.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    for (l0.b bVar : list2) {
                        String str = bVar.a;
                        arrayList.add(new d0b(bVar.b, ((ufu) this.c).d(new bdc(xng0.controlMinor), str), bVar.c));
                    }
                    l0.c cVar = l0Var.c;
                    surgeInfoStateMapper$mapChartItem$1.L$0 = null;
                    surgeInfoStateMapper$mapChartItem$1.L$1 = null;
                    surgeInfoStateMapper$mapChartItem$1.L$2 = arrayList;
                    surgeInfoStateMapper$mapChartItem$1.L$3 = c0bVar2;
                    surgeInfoStateMapper$mapChartItem$1.label = 1;
                    Object f = f(cVar, surgeInfoStateMapper$mapChartItem$1);
                    if (f == obj2) {
                        return obj2;
                    }
                    obj = f;
                    c0bVar = c0bVar2;
                    list = arrayList;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0bVar = (c0b) surgeInfoStateMapper$mapChartItem$1.L$3;
                    list = (List) surgeInfoStateMapper$mapChartItem$1.L$2;
                    kotlin.b.b(obj);
                }
                return new g0b(c0bVar, list, (f0b) obj);
            }
        }
        surgeInfoStateMapper$mapChartItem$1 = new SurgeInfoStateMapper$mapChartItem$1(this, continuationImpl);
        Object obj3 = surgeInfoStateMapper$mapChartItem$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapChartItem$1.label;
        if (i != 0) {
        }
        return new g0b(c0bVar, list, (f0b) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(l0.d dVar, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapChartValueBubble$1 surgeInfoStateMapper$mapChartValueBubble$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kdc kdcVar;
        Object a;
        CharSequence charSequence;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapChartValueBubble$1) {
            surgeInfoStateMapper$mapChartValueBubble$1 = (SurgeInfoStateMapper$mapChartValueBubble$1) continuationImpl;
            int i2 = surgeInfoStateMapper$mapChartValueBubble$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapChartValueBubble$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapChartValueBubble$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapChartValueBubble$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (dVar == null) {
                        return null;
                    }
                    String str = dVar.a;
                    kdc a2 = ((ufu) this.c).a(new bdc(xng0.everFront), str);
                    FormattedText formattedText = dVar.b;
                    surgeInfoStateMapper$mapChartValueBubble$1.L$0 = null;
                    surgeInfoStateMapper$mapChartValueBubble$1.L$1 = null;
                    surgeInfoStateMapper$mapChartValueBubble$1.L$2 = a2;
                    surgeInfoStateMapper$mapChartValueBubble$1.label = 1;
                    Object t = this.b.t(formattedText, surgeInfoStateMapper$mapChartValueBubble$1);
                    if (t != coroutineSingletons) {
                        obj = t;
                        kdcVar = a2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) surgeInfoStateMapper$mapChartValueBubble$1.L$3;
                    kdcVar = (kdc) surgeInfoStateMapper$mapChartValueBubble$1.L$2;
                    kotlin.b.b(obj);
                    return new e0b(kdcVar, (Drawable) obj, charSequence);
                }
                kdcVar = (kdc) surgeInfoStateMapper$mapChartValueBubble$1.L$2;
                kotlin.b.b(obj);
                CharSequence charSequence2 = (CharSequence) obj;
                int u = tje.u(12, this.a);
                surgeInfoStateMapper$mapChartValueBubble$1.L$0 = null;
                surgeInfoStateMapper$mapChartValueBubble$1.L$1 = null;
                surgeInfoStateMapper$mapChartValueBubble$1.L$2 = kdcVar;
                surgeInfoStateMapper$mapChartValueBubble$1.L$3 = charSequence2;
                surgeInfoStateMapper$mapChartValueBubble$1.label = 2;
                a = this.d.a(u, true, surgeInfoStateMapper$mapChartValueBubble$1);
                if (a != coroutineSingletons) {
                    obj = a;
                    charSequence = charSequence2;
                    return new e0b(kdcVar, (Drawable) obj, charSequence);
                }
                return coroutineSingletons;
            }
        }
        surgeInfoStateMapper$mapChartValueBubble$1 = new SurgeInfoStateMapper$mapChartValueBubble$1(this, continuationImpl);
        Object obj2 = surgeInfoStateMapper$mapChartValueBubble$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapChartValueBubble$1.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        int u2 = tje.u(12, this.a);
        surgeInfoStateMapper$mapChartValueBubble$1.L$0 = null;
        surgeInfoStateMapper$mapChartValueBubble$1.L$1 = null;
        surgeInfoStateMapper$mapChartValueBubble$1.L$2 = kdcVar;
        surgeInfoStateMapper$mapChartValueBubble$1.L$3 = charSequence22;
        surgeInfoStateMapper$mapChartValueBubble$1.label = 2;
        a = this.d.a(u2, true, surgeInfoStateMapper$mapChartValueBubble$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l0.c cVar, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapCurrentValue$1 surgeInfoStateMapper$mapCurrentValue$1;
        int i;
        float f;
        kdc kdcVar;
        int i2;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapCurrentValue$1) {
            surgeInfoStateMapper$mapCurrentValue$1 = (SurgeInfoStateMapper$mapCurrentValue$1) continuationImpl;
            int i3 = surgeInfoStateMapper$mapCurrentValue$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapCurrentValue$1.label = i3 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapCurrentValue$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapCurrentValue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (cVar == null) {
                        return null;
                    }
                    float f2 = cVar.a;
                    String str = cVar.b;
                    kdc d = ((ufu) this.c).d(new bdc(xng0.controlMinor), str);
                    int i4 = cVar.c;
                    l0.d dVar = cVar.d;
                    surgeInfoStateMapper$mapCurrentValue$1.L$0 = null;
                    surgeInfoStateMapper$mapCurrentValue$1.L$1 = null;
                    surgeInfoStateMapper$mapCurrentValue$1.L$2 = d;
                    surgeInfoStateMapper$mapCurrentValue$1.I$0 = i4;
                    surgeInfoStateMapper$mapCurrentValue$1.F$0 = f2;
                    surgeInfoStateMapper$mapCurrentValue$1.label = 1;
                    Object e = e(dVar, surgeInfoStateMapper$mapCurrentValue$1);
                    if (e == obj2) {
                        return obj2;
                    }
                    obj = e;
                    f = f2;
                    kdcVar = d;
                    i2 = i4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = surgeInfoStateMapper$mapCurrentValue$1.F$0;
                    i2 = surgeInfoStateMapper$mapCurrentValue$1.I$0;
                    kdcVar = (kdc) surgeInfoStateMapper$mapCurrentValue$1.L$2;
                    kotlin.b.b(obj);
                }
                return new f0b(f, kdcVar, i2, (e0b) obj);
            }
        }
        surgeInfoStateMapper$mapCurrentValue$1 = new SurgeInfoStateMapper$mapCurrentValue$1(this, continuationImpl);
        Object obj3 = surgeInfoStateMapper$mapCurrentValue$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapCurrentValue$1.label;
        if (i != 0) {
        }
        return new f0b(f, kdcVar, i2, (e0b) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:10:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(b1 b1Var, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapDetailedPriceBlock$1 surgeInfoStateMapper$mapDetailedPriceBlock$1;
        int i;
        Collection arrayList;
        b1 b1Var2;
        Iterator it;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapDetailedPriceBlock$1) {
            surgeInfoStateMapper$mapDetailedPriceBlock$1 = (SurgeInfoStateMapper$mapDetailedPriceBlock$1) continuationImpl;
            int i2 = surgeInfoStateMapper$mapDetailedPriceBlock$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapDetailedPriceBlock$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapDetailedPriceBlock$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapDetailedPriceBlock$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = b1Var.a.a;
                    arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    b1Var2 = b1Var;
                    it = it2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) surgeInfoStateMapper$mapDetailedPriceBlock$1.L$4;
                    arrayList = (Collection) surgeInfoStateMapper$mapDetailedPriceBlock$1.L$3;
                    b1 b1Var3 = (b1) surgeInfoStateMapper$mapDetailedPriceBlock$1.L$0;
                    kotlin.b.b(obj);
                    ycc.r((Iterable) obj, arrayList);
                    b1Var2 = b1Var3;
                    if (it.hasNext()) {
                        DetailedPriceContent.DetailedPriceItem detailedPriceItem = (DetailedPriceContent.DetailedPriceItem) it.next();
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.L$0 = b1Var2;
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.L$1 = null;
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.L$2 = null;
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.L$3 = arrayList;
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.L$4 = it;
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.L$5 = null;
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.L$6 = null;
                        surgeInfoStateMapper$mapDetailedPriceBlock$1.label = 1;
                        Object h = h(detailedPriceItem, surgeInfoStateMapper$mapDetailedPriceBlock$1);
                        if (h == obj2) {
                            return obj2;
                        }
                        b1Var3 = b1Var2;
                        obj = h;
                        ycc.r((Iterable) obj, arrayList);
                        b1Var2 = b1Var3;
                        if (it.hasNext()) {
                            List M = kotlin.collections.a.M((List) arrayList);
                            kdc b = ((ufu) this.c).b(b1Var2.a.b);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : M) {
                                if (obj3 instanceof z3j) {
                                    arrayList2.add(obj3);
                                }
                            }
                            boolean isEmpty = arrayList2.isEmpty();
                            boolean z = arrayList2.size() != b1Var2.a.a.size();
                            if (!isEmpty && !z) {
                                return new o2j(new b4j(M, b));
                            }
                            this.i.getClass();
                            xby.l(jst.e, "SurgeCardDetailedPrice", null, null, "Content error", 6);
                            return null;
                        }
                    }
                }
            }
        }
        surgeInfoStateMapper$mapDetailedPriceBlock$1 = new SurgeInfoStateMapper$mapDetailedPriceBlock$1(this, continuationImpl);
        Object obj4 = surgeInfoStateMapper$mapDetailedPriceBlock$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapDetailedPriceBlock$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(DetailedPriceContent.DetailedPriceItem detailedPriceItem, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapDetailedPriceItem$1 surgeInfoStateMapper$mapDetailedPriceItem$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object A;
        v3j v3jVar;
        List list;
        DetailedPriceContent.DetailedPriceItem detailedPriceItem2;
        yal0 yal0Var;
        css0 css0Var;
        Pair pair;
        z3j z3jVar;
        int i2;
        DetailedPriceContent.DetailedPriceItem detailedPriceItem3 = detailedPriceItem;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapDetailedPriceItem$1) {
            surgeInfoStateMapper$mapDetailedPriceItem$1 = (SurgeInfoStateMapper$mapDetailedPriceItem$1) continuationImpl;
            int i3 = surgeInfoStateMapper$mapDetailedPriceItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapDetailedPriceItem$1.label = i3 - Integer.MIN_VALUE;
                obj = surgeInfoStateMapper$mapDetailedPriceItem$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapDetailedPriceItem$1.label;
                y3j y3jVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = detailedPriceItem3.a.d;
                    mth a = this.e.a();
                    surgeInfoStateMapper$mapDetailedPriceItem$1.L$0 = detailedPriceItem3;
                    v3j v3jVar2 = this.f;
                    surgeInfoStateMapper$mapDetailedPriceItem$1.L$1 = v3jVar2;
                    surgeInfoStateMapper$mapDetailedPriceItem$1.L$2 = list2;
                    surgeInfoStateMapper$mapDetailedPriceItem$1.label = 1;
                    A = kotlinx.coroutines.flow.e.A(a, surgeInfoStateMapper$mapDetailedPriceItem$1);
                    if (A != coroutineSingletons) {
                        v3jVar = v3jVar2;
                        list = list2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    detailedPriceItem2 = (DetailedPriceContent.DetailedPriceItem) surgeInfoStateMapper$mapDetailedPriceItem$1.L$0;
                    kotlin.b.b(obj);
                    css0Var = (css0) obj;
                    if (!(css0Var instanceof xrs0)) {
                        xrs0 xrs0Var = (xrs0) css0Var;
                        pair = new Pair(xrs0Var.a, xrs0Var.b);
                    } else if (css0Var instanceof zrs0) {
                        pair = new Pair(((zrs0) css0Var).a, null);
                    } else {
                        if (!jl40.l(css0Var, yrs0.a)) {
                            w511.b();
                            return null;
                        }
                        pair = null;
                    }
                    if (pair == null) {
                        String valueOf = String.valueOf(((bss0) pair.c()).a);
                        bss0 bss0Var = (bss0) pair.f();
                        List A2 = j73.A(new String[]{valueOf, String.valueOf(bss0Var != null ? bss0Var.a : null), detailedPriceItem2.e.a});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : A2) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        String X = kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62);
                        bss0 bss0Var2 = (bss0) pair.c();
                        bss0 bss0Var3 = (bss0) pair.f();
                        int i4 = (int) detailedPriceItem2.b;
                        int i5 = (int) detailedPriceItem2.c;
                        String str = detailedPriceItem2.e.a;
                        z3jVar = new z3j(bss0Var2, bss0Var3, i4, i5, str.length() == 0 ? null : str, detailedPriceItem2.f, X);
                    } else {
                        z3jVar = null;
                    }
                    i2 = ktw0.d[detailedPriceItem2.d.ordinal()];
                    if (i2 != 1) {
                        y3jVar = new y3j(DividerType.NORMAL);
                    } else if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    return j73.A(new a4j[]{z3jVar, y3jVar});
                }
                list = (List) surgeInfoStateMapper$mapDetailedPriceItem$1.L$2;
                v3j v3jVar3 = (v3j) surgeInfoStateMapper$mapDetailedPriceItem$1.L$1;
                DetailedPriceContent.DetailedPriceItem detailedPriceItem4 = (DetailedPriceContent.DetailedPriceItem) surgeInfoStateMapper$mapDetailedPriceItem$1.L$0;
                kotlin.b.b(obj);
                v3jVar = v3jVar3;
                detailedPriceItem3 = detailedPriceItem4;
                A = obj;
                dbl0 dbl0Var = (dbl0) A;
                fef g = (dbl0Var != null || (yal0Var = dbl0Var.a) == null) ? null : yal0Var.g();
                surgeInfoStateMapper$mapDetailedPriceItem$1.L$0 = detailedPriceItem3;
                surgeInfoStateMapper$mapDetailedPriceItem$1.L$1 = null;
                surgeInfoStateMapper$mapDetailedPriceItem$1.L$2 = null;
                surgeInfoStateMapper$mapDetailedPriceItem$1.label = 2;
                obj = ((com.yandex.go.detailed_price.mapper.a) v3jVar).a(list, g, surgeInfoStateMapper$mapDetailedPriceItem$1);
                if (obj != coroutineSingletons) {
                    detailedPriceItem2 = detailedPriceItem3;
                    css0Var = (css0) obj;
                    if (!(css0Var instanceof xrs0)) {
                    }
                    if (pair == null) {
                    }
                    i2 = ktw0.d[detailedPriceItem2.d.ordinal()];
                    if (i2 != 1) {
                    }
                    return j73.A(new a4j[]{z3jVar, y3jVar});
                }
                return coroutineSingletons;
            }
        }
        surgeInfoStateMapper$mapDetailedPriceItem$1 = new SurgeInfoStateMapper$mapDetailedPriceItem$1(this, continuationImpl);
        obj = surgeInfoStateMapper$mapDetailedPriceItem$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapDetailedPriceItem$1.label;
        y3j y3jVar2 = null;
        if (i != 0) {
        }
        dbl0 dbl0Var2 = (dbl0) A;
        if (dbl0Var2 != null) {
        }
        surgeInfoStateMapper$mapDetailedPriceItem$1.L$0 = detailedPriceItem3;
        surgeInfoStateMapper$mapDetailedPriceItem$1.L$1 = null;
        surgeInfoStateMapper$mapDetailedPriceItem$1.L$2 = null;
        surgeInfoStateMapper$mapDetailedPriceItem$1.label = 2;
        obj = ((com.yandex.go.detailed_price.mapper.a) v3jVar).a(list, g, surgeInfoStateMapper$mapDetailedPriceItem$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0148, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018c, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(j1 j1Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapInfoItem$1 surgeInfoStateMapper$mapInfoItem$1;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapInfoItem$1) {
            surgeInfoStateMapper$mapInfoItem$1 = (SurgeInfoStateMapper$mapInfoItem$1) continuationImpl;
            int i = surgeInfoStateMapper$mapInfoItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapInfoItem$1.label = i - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapInfoItem$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (surgeInfoStateMapper$mapInfoItem$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        if (j1Var instanceof x0) {
                            surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                            surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                            surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                            surgeInfoStateMapper$mapInfoItem$1.label = 1;
                            obj = bvf0.n(new SurgeInfoStateMapper$mapBalanceItem$2(this, (x0) j1Var, z, null), surgeInfoStateMapper$mapInfoItem$1);
                            break;
                        } else if (j1Var instanceof y0) {
                            surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                            surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                            surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                            surgeInfoStateMapper$mapInfoItem$1.label = 2;
                            obj = d((y0) j1Var, surgeInfoStateMapper$mapInfoItem$1);
                            break;
                        } else if (j1Var instanceof g1) {
                            FormattedText formattedText = ((g1) j1Var).a;
                            surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                            surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                            surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                            surgeInfoStateMapper$mapInfoItem$1.label = 3;
                            obj = this.b.t(formattedText, surgeInfoStateMapper$mapInfoItem$1);
                            break;
                        } else if (j1Var instanceof h1) {
                            surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                            surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                            surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                            surgeInfoStateMapper$mapInfoItem$1.label = 4;
                            obj = bvf0.n(new SurgeInfoStateMapper$mapTextBlockItem$2((h1) j1Var, z, this, null), surgeInfoStateMapper$mapInfoItem$1);
                            break;
                        } else if (j1Var instanceof z0) {
                            surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                            surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                            surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                            surgeInfoStateMapper$mapInfoItem$1.label = 5;
                            obj = bvf0.n(new SurgeInfoStateMapper$mapChartError$2(null, this, (z0) j1Var), surgeInfoStateMapper$mapInfoItem$1);
                            break;
                        } else if (j1Var instanceof a1) {
                            surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                            surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                            surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                            surgeInfoStateMapper$mapInfoItem$1.label = 6;
                            obj = bvf0.n(new SurgeInfoStateMapper$mapContentError$2(null, this, (a1) j1Var), surgeInfoStateMapper$mapInfoItem$1);
                            break;
                        } else if (j1Var instanceof e1) {
                            surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                            surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                            surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                            surgeInfoStateMapper$mapInfoItem$1.label = 7;
                            obj = bvf0.n(new SurgeInfoStateMapper$mapHorizontalShortcuts$2(null, this, (e1) j1Var), surgeInfoStateMapper$mapInfoItem$1);
                            break;
                        } else {
                            if (j1Var instanceof f1) {
                                return q3q0.a;
                            }
                            if (j1Var instanceof b1) {
                                surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                                surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                                surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                                surgeInfoStateMapper$mapInfoItem$1.label = 8;
                                Object g = g((b1) j1Var, surgeInfoStateMapper$mapInfoItem$1);
                                if (g != obj2) {
                                    return g;
                                }
                            } else {
                                if (!(j1Var instanceof c1)) {
                                    if ((j1Var instanceof s0) || jl40.l(j1Var, i1.INSTANCE) || (j1Var instanceof d1)) {
                                        return null;
                                    }
                                    w511.b();
                                    return null;
                                }
                                c1 c1Var = (c1) j1Var;
                                surgeInfoStateMapper$mapInfoItem$1.L$0 = null;
                                surgeInfoStateMapper$mapInfoItem$1.Z$0 = z;
                                surgeInfoStateMapper$mapInfoItem$1.Z$1 = z2;
                                surgeInfoStateMapper$mapInfoItem$1.label = 9;
                                obj = bvf0.n(new SurgeInfoStateMapper$mapGradientComponent$2$1(this, c1Var.a, z2, c1Var, null), surgeInfoStateMapper$mapInfoItem$1);
                                break;
                            }
                        }
                        return obj2;
                    case 1:
                        kotlin.b.b(obj);
                        return (qge) obj;
                    case 2:
                        kotlin.b.b(obj);
                        return (qge) obj;
                    case 3:
                        kotlin.b.b(obj);
                        return new nrq0((CharSequence) obj);
                    case 4:
                        kotlin.b.b(obj);
                        return (qge) obj;
                    case 5:
                        kotlin.b.b(obj);
                        return (qge) obj;
                    case 6:
                        kotlin.b.b(obj);
                        return (qge) obj;
                    case 7:
                        kotlin.b.b(obj);
                        return (qge) obj;
                    case 8:
                        kotlin.b.b(obj);
                        return obj;
                    case 9:
                        kotlin.b.b(obj);
                        return (qge) obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        surgeInfoStateMapper$mapInfoItem$1 = new SurgeInfoStateMapper$mapInfoItem$1(this, continuationImpl);
        Object obj3 = surgeInfoStateMapper$mapInfoItem$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (surgeInfoStateMapper$mapInfoItem$1.label) {
        }
    }

    public final Object j(btw0 btw0Var, Continuation continuation) {
        return bvf0.n(new SurgeInfoStateMapper$mapItems$2(btw0Var, null, this), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(duw0 duw0Var, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapSelectorTrail$1 surgeInfoStateMapper$mapSelectorTrail$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        smq0 smq0Var;
        bdc bdcVar;
        bdc bdcVar2;
        String str;
        bdc bdcVar3;
        CharSequence charSequence;
        Object t;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str2;
        bdc bdcVar4;
        smq0 smq0Var2;
        bdc bdcVar5;
        duw0 duw0Var2;
        duw0 duw0Var3 = duw0Var;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapSelectorTrail$1) {
            surgeInfoStateMapper$mapSelectorTrail$1 = (SurgeInfoStateMapper$mapSelectorTrail$1) continuationImpl;
            int i2 = surgeInfoStateMapper$mapSelectorTrail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapSelectorTrail$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = surgeInfoStateMapper$mapSelectorTrail$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapSelectorTrail$1.label;
                e eVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = duw0Var3.g;
                    SelectorStyle selectorStyle = duw0Var3.f;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((smq0) obj).a, duw0Var3.b)) {
                            break;
                        }
                    }
                    smq0Var = (smq0) obj;
                    if (smq0Var == null) {
                        return null;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(smq0Var.b);
                    Drawable t2 = vng.t(dzg0.chevron_round_down, this.a);
                    if (t2 != null) {
                        spannableStringBuilder.append((CharSequence) "  ");
                        spannableStringBuilder.append(" ", new CustomImageSpan(t2, 2, false, false, null, 28, null), 18);
                    }
                    int[] iArr = ktw0.b;
                    int i3 = iArr[selectorStyle.ordinal()];
                    if (i3 == 1) {
                        bdcVar = new bdc(xng0.controlMain);
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            w511.b();
                            return null;
                        }
                        bdcVar = new bdc(xng0.controlMinor);
                    }
                    int i4 = iArr[selectorStyle.ordinal()];
                    if (i4 == 1) {
                        bdcVar2 = new bdc(xng0.textOnControl);
                    } else {
                        if (i4 != 2 && i4 != 3) {
                            w511.b();
                            return null;
                        }
                        bdcVar2 = new bdc(xng0.textOnControlMinor);
                    }
                    str = duw0Var3.a;
                    FormattedText formattedText = duw0Var3.c;
                    surgeInfoStateMapper$mapSelectorTrail$1.L$0 = duw0Var3;
                    surgeInfoStateMapper$mapSelectorTrail$1.L$1 = smq0Var;
                    surgeInfoStateMapper$mapSelectorTrail$1.L$2 = null;
                    surgeInfoStateMapper$mapSelectorTrail$1.L$3 = bdcVar;
                    surgeInfoStateMapper$mapSelectorTrail$1.L$4 = bdcVar2;
                    surgeInfoStateMapper$mapSelectorTrail$1.L$5 = str;
                    surgeInfoStateMapper$mapSelectorTrail$1.L$6 = spannableStringBuilder;
                    surgeInfoStateMapper$mapSelectorTrail$1.label = 1;
                    Object t3 = eVar.t(formattedText, surgeInfoStateMapper$mapSelectorTrail$1);
                    if (t3 != coroutineSingletons) {
                        bdcVar3 = bdcVar2;
                        charSequence = spannableStringBuilder;
                        obj2 = t3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence4 = (CharSequence) surgeInfoStateMapper$mapSelectorTrail$1.L$7;
                    CharSequence charSequence5 = (CharSequence) surgeInfoStateMapper$mapSelectorTrail$1.L$6;
                    String str3 = (String) surgeInfoStateMapper$mapSelectorTrail$1.L$5;
                    bdc bdcVar6 = (bdc) surgeInfoStateMapper$mapSelectorTrail$1.L$4;
                    bdc bdcVar7 = (bdc) surgeInfoStateMapper$mapSelectorTrail$1.L$3;
                    smq0 smq0Var3 = (smq0) surgeInfoStateMapper$mapSelectorTrail$1.L$1;
                    duw0Var2 = (duw0) surgeInfoStateMapper$mapSelectorTrail$1.L$0;
                    kotlin.b.b(obj2);
                    charSequence3 = charSequence4;
                    charSequence2 = charSequence5;
                    str2 = str3;
                    bdcVar4 = bdcVar6;
                    bdcVar5 = bdcVar7;
                    smq0Var2 = smq0Var3;
                    return new nky0(str2, charSequence2, charSequence3, (CharSequence) obj2, duw0Var2.e, duw0Var2.g, smq0Var2, bdcVar5, bdcVar4, duw0Var2.h);
                }
                charSequence = (CharSequence) surgeInfoStateMapper$mapSelectorTrail$1.L$6;
                String str4 = (String) surgeInfoStateMapper$mapSelectorTrail$1.L$5;
                bdc bdcVar8 = (bdc) surgeInfoStateMapper$mapSelectorTrail$1.L$4;
                bdc bdcVar9 = (bdc) surgeInfoStateMapper$mapSelectorTrail$1.L$3;
                smq0Var = (smq0) surgeInfoStateMapper$mapSelectorTrail$1.L$1;
                duw0 duw0Var4 = (duw0) surgeInfoStateMapper$mapSelectorTrail$1.L$0;
                kotlin.b.b(obj2);
                str = str4;
                duw0Var3 = duw0Var4;
                bdcVar = bdcVar9;
                bdcVar3 = bdcVar8;
                CharSequence charSequence6 = (CharSequence) obj2;
                FormattedText formattedText2 = duw0Var3.d;
                surgeInfoStateMapper$mapSelectorTrail$1.L$0 = duw0Var3;
                surgeInfoStateMapper$mapSelectorTrail$1.L$1 = smq0Var;
                surgeInfoStateMapper$mapSelectorTrail$1.L$2 = null;
                surgeInfoStateMapper$mapSelectorTrail$1.L$3 = bdcVar;
                surgeInfoStateMapper$mapSelectorTrail$1.L$4 = bdcVar3;
                surgeInfoStateMapper$mapSelectorTrail$1.L$5 = str;
                surgeInfoStateMapper$mapSelectorTrail$1.L$6 = charSequence;
                surgeInfoStateMapper$mapSelectorTrail$1.L$7 = charSequence6;
                surgeInfoStateMapper$mapSelectorTrail$1.label = 2;
                t = eVar.t(formattedText2, surgeInfoStateMapper$mapSelectorTrail$1);
                if (t != coroutineSingletons) {
                    charSequence2 = charSequence;
                    charSequence3 = charSequence6;
                    obj2 = t;
                    str2 = str;
                    bdcVar4 = bdcVar3;
                    smq0Var2 = smq0Var;
                    bdcVar5 = bdcVar;
                    duw0Var2 = duw0Var3;
                    return new nky0(str2, charSequence2, charSequence3, (CharSequence) obj2, duw0Var2.e, duw0Var2.g, smq0Var2, bdcVar5, bdcVar4, duw0Var2.h);
                }
                return coroutineSingletons;
            }
        }
        surgeInfoStateMapper$mapSelectorTrail$1 = new SurgeInfoStateMapper$mapSelectorTrail$1(this, continuationImpl);
        Object obj22 = surgeInfoStateMapper$mapSelectorTrail$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapSelectorTrail$1.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj22;
        FormattedText formattedText22 = duw0Var3.d;
        surgeInfoStateMapper$mapSelectorTrail$1.L$0 = duw0Var3;
        surgeInfoStateMapper$mapSelectorTrail$1.L$1 = smq0Var;
        surgeInfoStateMapper$mapSelectorTrail$1.L$2 = null;
        surgeInfoStateMapper$mapSelectorTrail$1.L$3 = bdcVar;
        surgeInfoStateMapper$mapSelectorTrail$1.L$4 = bdcVar3;
        surgeInfoStateMapper$mapSelectorTrail$1.L$5 = str;
        surgeInfoStateMapper$mapSelectorTrail$1.L$6 = charSequence;
        surgeInfoStateMapper$mapSelectorTrail$1.L$7 = charSequence62;
        surgeInfoStateMapper$mapSelectorTrail$1.label = 2;
        t = eVar2.t(formattedText22, surgeInfoStateMapper$mapSelectorTrail$1);
        if (t != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(juw0 juw0Var, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapTextTrail$1 surgeInfoStateMapper$mapTextTrail$1;
        int i;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapTextTrail$1) {
            surgeInfoStateMapper$mapTextTrail$1 = (SurgeInfoStateMapper$mapTextTrail$1) continuationImpl;
            int i2 = surgeInfoStateMapper$mapTextTrail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapTextTrail$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapTextTrail$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapTextTrail$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = juw0Var.a;
                    surgeInfoStateMapper$mapTextTrail$1.L$0 = juw0Var;
                    surgeInfoStateMapper$mapTextTrail$1.label = 1;
                    obj = m(formattedText, surgeInfoStateMapper$mapTextTrail$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    juw0Var = (juw0) surgeInfoStateMapper$mapTextTrail$1.L$0;
                    kotlin.b.b(obj);
                }
                return new oky0((CharSequence) obj, juw0Var.b);
            }
        }
        surgeInfoStateMapper$mapTextTrail$1 = new SurgeInfoStateMapper$mapTextTrail$1(this, continuationImpl);
        Object obj3 = surgeInfoStateMapper$mapTextTrail$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapTextTrail$1.label;
        if (i != 0) {
        }
        return new oky0((CharSequence) obj3, juw0Var.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(FormattedText formattedText, ContinuationImpl continuationImpl) {
        SurgeInfoStateMapper$mapTextWithCurrencyRules$1 surgeInfoStateMapper$mapTextWithCurrencyRules$1;
        int i;
        e eVar;
        xdf xdfVar;
        yal0 yal0Var;
        if (continuationImpl instanceof SurgeInfoStateMapper$mapTextWithCurrencyRules$1) {
            surgeInfoStateMapper$mapTextWithCurrencyRules$1 = (SurgeInfoStateMapper$mapTextWithCurrencyRules$1) continuationImpl;
            int i2 = surgeInfoStateMapper$mapTextWithCurrencyRules$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateMapper$mapTextWithCurrencyRules$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateMapper$mapTextWithCurrencyRules$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateMapper$mapTextWithCurrencyRules$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth a = this.e.a();
                    surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$0 = null;
                    eVar = this.b;
                    surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$1 = eVar;
                    surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$2 = formattedText;
                    xdfVar = this.g;
                    surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$3 = xdfVar;
                    surgeInfoStateMapper$mapTextWithCurrencyRules$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(a, surgeInfoStateMapper$mapTextWithCurrencyRules$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    xdfVar = (xdf) surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$3;
                    formattedText = (FormattedText) surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$2;
                    eVar = (e) surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$1;
                    kotlin.b.b(obj);
                }
                dbl0 dbl0Var = (dbl0) obj;
                FormattedText c = d9s.c(formattedText, xdfVar, (dbl0Var != null || (yal0Var = dbl0Var.a) == null) ? null : yal0Var.g(), false);
                surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$0 = null;
                surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$1 = null;
                surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$2 = null;
                surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$3 = null;
                surgeInfoStateMapper$mapTextWithCurrencyRules$1.label = 2;
                Object t = eVar.t(c, surgeInfoStateMapper$mapTextWithCurrencyRules$1);
                return t != coroutineSingletons ? coroutineSingletons : t;
            }
        }
        surgeInfoStateMapper$mapTextWithCurrencyRules$1 = new SurgeInfoStateMapper$mapTextWithCurrencyRules$1(this, continuationImpl);
        Object obj2 = surgeInfoStateMapper$mapTextWithCurrencyRules$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateMapper$mapTextWithCurrencyRules$1.label;
        if (i != 0) {
        }
        dbl0 dbl0Var2 = (dbl0) obj2;
        FormattedText c2 = d9s.c(formattedText, xdfVar, (dbl0Var2 != null || (yal0Var = dbl0Var2.a) == null) ? null : yal0Var.g(), false);
        surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$0 = null;
        surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$1 = null;
        surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$2 = null;
        surgeInfoStateMapper$mapTextWithCurrencyRules$1.L$3 = null;
        surgeInfoStateMapper$mapTextWithCurrencyRules$1.label = 2;
        Object t2 = eVar.t(c2, surgeInfoStateMapper$mapTextWithCurrencyRules$1);
        if (t2 != coroutineSingletons2) {
        }
    }

    public final low0 n(h0 h0Var) {
        if (h0Var instanceof v) {
            return new gow0(((v) h0Var).a);
        }
        if (!(h0Var instanceof y)) {
            if (h0Var instanceof x) {
                return new jow0(((x) h0Var).a);
            }
            if (!jl40.l(h0Var, f0.INSTANCE) && !jl40.l(h0Var, g0.INSTANCE)) {
                w511.b();
            }
            return null;
        }
        y yVar = (y) h0Var;
        c0 c0Var = yVar.a;
        this.h.getClass();
        String str = c0Var.a;
        List<c0.b> list = c0Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (c0.b bVar : list) {
            arrayList.add(new ntq(bVar.a, bVar.b, bVar.c));
        }
        qye0 a = quw0.a(c0Var.d);
        c0.a aVar = c0Var.c;
        rye0 rye0Var = new rye0(str, arrayList, a, aVar != null ? new hmc(aVar.a, "") : null);
        w wVar = yVar.b;
        return new iow0(rye0Var, new nuq(wVar.a, wVar.b, wVar.c, quw0.a(wVar.d)));
    }
}
