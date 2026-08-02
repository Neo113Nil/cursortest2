package ru.yandex.taxi.masstransit.stoproute.mapper;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.avj0;
import defpackage.bl00;
import defpackage.br30;
import defpackage.cdc;
import defpackage.cua1;
import defpackage.diu0;
import defpackage.dr30;
import defpackage.dwh0;
import defpackage.ffx;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.iiu0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qje;
import defpackage.s6b1;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tje;
import defpackage.tog0;
import defpackage.ufu;
import defpackage.x3l0;
import defpackage.xng0;
import defpackage.z511;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.model.VariantStyle;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final zuj0 b;
    public final pdc c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();
    public Pair e;

    public a(pdc pdcVar, zuj0 zuj0Var, Context context) {
        this.a = context;
        this.b = zuj0Var;
        this.c = pdcVar;
    }

    public final void a(ArrayList arrayList, String str, int i, int i2, int i3, boolean z) {
        int i4 = (i2 - i) + 1;
        if (i4 > 1) {
            arrayList.add(i, new diu0(str, z ? LineState.SECONDARY : LineState.MAIN, ((avj0) this.b).f(dwh0.mass_transit_route_stops, i4), new iiu0(i4), i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kdc kdcVar, ContinuationImpl continuationImpl) {
        MtStopRouteUiStateMapper$createIntermediatePointImageProvider$1 mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ImageProvider imageProvider;
        try {
            if (continuationImpl instanceof MtStopRouteUiStateMapper$createIntermediatePointImageProvider$1) {
                mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1 = (MtStopRouteUiStateMapper$createIntermediatePointImageProvider$1) continuationImpl;
                int i2 = mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.label;
                    if (i != 0) {
                        b.b(obj);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(1);
                        Context context = this.a;
                        gradientDrawable.setSize(tje.u(14, context), tje.u(14, context));
                        gradientDrawable.setColor(qje.t(xng0.textInvert, ((avj0) this.b).a));
                        gradientDrawable.setStroke(tje.u(3, context), s8o.m(kdcVar, context));
                        ImageProvider fromBitmap = ImageProvider.fromBitmap(ffx.d0(gradientDrawable, 0, 0, 7));
                        mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.L$0 = kdcVar;
                        mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.L$1 = null;
                        mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.L$2 = fromBitmap;
                        aVar = this.d;
                        mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.L$3 = aVar;
                        mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.label = 1;
                        if (aVar.a(mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        imageProvider = fromBitmap;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r8 = (g050) mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.L$3;
                        imageProvider = (ImageProvider) mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.L$2;
                        kdc kdcVar2 = (kdc) mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.L$0;
                        b.b(obj);
                        aVar = r8;
                        kdcVar = kdcVar2;
                    }
                    this.e = new Pair(kdcVar, imageProvider);
                    return imageProvider;
                }
            }
            this.e = new Pair(kdcVar, imageProvider);
            return imageProvider;
        } finally {
            aVar.d(null);
        }
        mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1 = new MtStopRouteUiStateMapper$createIntermediatePointImageProvider$1(this, continuationImpl);
        Object obj2 = mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteUiStateMapper$createIntermediatePointImageProvider$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(x3l0 x3l0Var, Map map) {
        Integer num;
        VariantStyle variantStyle = (VariantStyle) map.get(x3l0Var.a.getType());
        String str = variantStyle != null ? variantStyle.a : null;
        Context context = this.a;
        if (str != null) {
            if (str.length() == 0) {
                num = Integer.valueOf(context.getColor(cua1.c(x3l0Var.a)));
            } else {
                kdc g = ((ufu) this.c).g(str);
                if (g != null) {
                    num = Integer.valueOf(s8o.m(g, context));
                }
            }
            if (num == null) {
                return num.intValue();
            }
            Integer num2 = x3l0Var.d;
            Integer valueOf = num2 != null ? Integer.valueOf(s8o.m(s6b1.f(num2.intValue()), context)) : null;
            if (valueOf != null) {
                return valueOf.intValue();
            }
            return ((avj0) this.b).a(tog0.mt_fallback_color);
        }
        num = null;
        if (num == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Point point, cdc cdcVar, ContinuationImpl continuationImpl) {
        MtStopRouteUiStateMapper$mapIntermediatePoint$1 mtStopRouteUiStateMapper$mapIntermediatePoint$1;
        int i;
        IconStyle iconStyle;
        if (continuationImpl instanceof MtStopRouteUiStateMapper$mapIntermediatePoint$1) {
            mtStopRouteUiStateMapper$mapIntermediatePoint$1 = (MtStopRouteUiStateMapper$mapIntermediatePoint$1) continuationImpl;
            int i2 = mtStopRouteUiStateMapper$mapIntermediatePoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopRouteUiStateMapper$mapIntermediatePoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopRouteUiStateMapper$mapIntermediatePoint$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteUiStateMapper$mapIntermediatePoint$1.label;
                if (i != 0) {
                    b.b(obj);
                    IconStyle iconStyle2 = new IconStyle();
                    mtStopRouteUiStateMapper$mapIntermediatePoint$1.L$0 = point;
                    mtStopRouteUiStateMapper$mapIntermediatePoint$1.L$1 = null;
                    mtStopRouteUiStateMapper$mapIntermediatePoint$1.L$2 = iconStyle2;
                    mtStopRouteUiStateMapper$mapIntermediatePoint$1.label = 1;
                    Pair pair = this.e;
                    Object b = (pair == null || !jl40.l(pair.c(), cdcVar)) ? b(cdcVar, mtStopRouteUiStateMapper$mapIntermediatePoint$1) : (ImageProvider) pair.f();
                    if (b == obj2) {
                        return obj2;
                    }
                    obj = b;
                    iconStyle = iconStyle2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iconStyle = (IconStyle) mtStopRouteUiStateMapper$mapIntermediatePoint$1.L$2;
                    point = (Point) mtStopRouteUiStateMapper$mapIntermediatePoint$1.L$0;
                    b.b(obj);
                }
                return new br30(new bl00((ImageProvider) obj, iconStyle), point);
            }
        }
        mtStopRouteUiStateMapper$mapIntermediatePoint$1 = new MtStopRouteUiStateMapper$mapIntermediatePoint$1(this, continuationImpl);
        Object obj3 = mtStopRouteUiStateMapper$mapIntermediatePoint$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteUiStateMapper$mapIntermediatePoint$1.label;
        if (i != 0) {
        }
        return new br30(new bl00((ImageProvider) obj3, iconStyle), point);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f4 -> B:15:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0113 -> B:11:0x0116). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(x3l0 x3l0Var, Map map, ContinuationImpl continuationImpl) {
        MtStopRouteUiStateMapper$mapOverlaySections$1 mtStopRouteUiStateMapper$mapOverlaySections$1;
        int i;
        Iterator it;
        int i2;
        List list;
        cdc cdcVar;
        Polyline polyline;
        int i3;
        Point point;
        int i4;
        br30 br30Var;
        Point point2;
        if (continuationImpl instanceof MtStopRouteUiStateMapper$mapOverlaySections$1) {
            mtStopRouteUiStateMapper$mapOverlaySections$1 = (MtStopRouteUiStateMapper$mapOverlaySections$1) continuationImpl;
            int i5 = mtStopRouteUiStateMapper$mapOverlaySections$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mtStopRouteUiStateMapper$mapOverlaySections$1.label = i5 - Integer.MIN_VALUE;
                Object obj = mtStopRouteUiStateMapper$mapOverlaySections$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteUiStateMapper$mapOverlaySections$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    cdc cdcVar2 = new cdc(c(x3l0Var, map));
                    it = x3l0Var.e.iterator();
                    i2 = 0;
                    list = t;
                    cdcVar = cdcVar2;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    i2 = mtStopRouteUiStateMapper$mapOverlaySections$1.I$1;
                    i4 = mtStopRouteUiStateMapper$mapOverlaySections$1.I$0;
                    polyline = (Polyline) mtStopRouteUiStateMapper$mapOverlaySections$1.L$7;
                    it = (Iterator) mtStopRouteUiStateMapper$mapOverlaySections$1.L$5;
                    cdcVar = (cdc) mtStopRouteUiStateMapper$mapOverlaySections$1.L$3;
                    list = (List) mtStopRouteUiStateMapper$mapOverlaySections$1.L$2;
                    b.b(obj);
                    br30Var = (br30) obj;
                    if (br30Var == null) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mtStopRouteUiStateMapper$mapOverlaySections$1.I$0;
                    Iterator it2 = (Iterator) mtStopRouteUiStateMapper$mapOverlaySections$1.L$5;
                    cdc cdcVar3 = (cdc) mtStopRouteUiStateMapper$mapOverlaySections$1.L$3;
                    List list2 = (List) mtStopRouteUiStateMapper$mapOverlaySections$1.L$2;
                    b.b(obj);
                    br30 br30Var2 = (br30) obj;
                    if (br30Var2 != null) {
                        list2.add(br30Var2);
                    }
                    cdcVar = cdcVar3;
                    list = list2;
                    it = it2;
                    if (!it.hasNext()) {
                        Object next = it.next();
                        int i6 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        polyline = (Polyline) next;
                        if (i2 == 0 && (point2 = (Point) kotlin.collections.a.R(polyline.getPoints())) != null) {
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$0 = null;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$1 = null;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$2 = list;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$3 = cdcVar;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$4 = null;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$5 = it;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$6 = null;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.L$7 = polyline;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.I$0 = i6;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.I$1 = i2;
                            mtStopRouteUiStateMapper$mapOverlaySections$1.label = 1;
                            Object d = d(point2, cdcVar, mtStopRouteUiStateMapper$mapOverlaySections$1);
                            if (d != obj2) {
                                obj = d;
                                i4 = i6;
                                br30Var = (br30) obj;
                                if (br30Var == null) {
                                    list.add(br30Var);
                                    int i7 = i4;
                                    i3 = i2;
                                    i2 = i7;
                                    z511 z511Var = new z511(polyline, cdcVar, null);
                                    EmptyList emptyList = EmptyList.a;
                                    list.add(new dr30(z511Var, emptyList, emptyList));
                                    point = (Point) kotlin.collections.a.b0(polyline.getPoints());
                                    if (point != null) {
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$0 = null;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$1 = null;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$2 = list;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$3 = cdcVar;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$4 = null;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$5 = it;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$6 = null;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.L$7 = null;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.I$0 = i2;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.I$1 = i3;
                                        mtStopRouteUiStateMapper$mapOverlaySections$1.label = 2;
                                        obj = d(point, cdcVar, mtStopRouteUiStateMapper$mapOverlaySections$1);
                                        if (obj != obj2) {
                                            it2 = it;
                                            cdcVar3 = cdcVar;
                                            list2 = list;
                                            br30 br30Var22 = (br30) obj;
                                            if (br30Var22 != null) {
                                            }
                                            cdcVar = cdcVar3;
                                            list = list2;
                                            it = it2;
                                        }
                                    }
                                    if (!it.hasNext()) {
                                        return list;
                                    }
                                } else {
                                    i6 = i4;
                                }
                            }
                            return obj2;
                        }
                        i3 = i2;
                        i2 = i6;
                        z511 z511Var2 = new z511(polyline, cdcVar, null);
                        EmptyList emptyList2 = EmptyList.a;
                        list.add(new dr30(z511Var2, emptyList2, emptyList2));
                        point = (Point) kotlin.collections.a.b0(polyline.getPoints());
                        if (point != null) {
                        }
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        mtStopRouteUiStateMapper$mapOverlaySections$1 = new MtStopRouteUiStateMapper$mapOverlaySections$1(this, continuationImpl);
        Object obj3 = mtStopRouteUiStateMapper$mapOverlaySections$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteUiStateMapper$mapOverlaySections$1.label;
        if (i != 0) {
        }
    }
}
