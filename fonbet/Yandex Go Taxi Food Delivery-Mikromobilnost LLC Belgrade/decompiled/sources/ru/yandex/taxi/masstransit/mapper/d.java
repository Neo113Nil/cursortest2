package ru.yandex.taxi.masstransit.mapper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a0c0;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.br30;
import defpackage.bs30;
import defpackage.bvu0;
import defpackage.c0c0;
import defpackage.cr30;
import defpackage.dr30;
import defpackage.ds30;
import defpackage.er30;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fay0;
import defpackage.fj40;
import defpackage.gz30;
import defpackage.h1c0;
import defpackage.hgr0;
import defpackage.hz30;
import defpackage.i1c0;
import defpackage.jm30;
import defpackage.l540;
import defpackage.lj40;
import defpackage.nk31;
import defpackage.ny61;
import defpackage.q2h0;
import defpackage.qje;
import defpackage.r440;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sm30;
import defpackage.tje;
import defpackage.tm30;
import defpackage.u1l;
import defpackage.w511;
import defpackage.w610;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yi40;
import defpackage.z511;
import defpackage.zi40;
import defpackage.zls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.masstransit.ui.label.MtDestinationView;
import ru.yandex.taxi.masstransit.ui.label.MtIntermediatePointView;
import ru.yandex.taxi.masstransit.ui.label.MtLabelView;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class d {
    public static final Regex k = new Regex("^(\\d+)");
    public final Context a;
    public final ru.yandex.taxi.design.utils.b b;
    public PinV2Component c;
    public MtDestinationView f;
    public MtLabelView i;
    public MtIntermediatePointView j;
    public final bdc d = new bdc(xng0.textOnControl);
    public final bdc e = new bdc(xng0.controlMain);
    public final bdc g = new bdc(xng0.textOnControlMinor);
    public final bdc h = new bdc(xng0.controlMinor);

    public d(Context context, ru.yandex.taxi.design.utils.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public static z511 h(Polyline polyline, fj40 fj40Var) {
        Polyline subpolyline;
        Subpolyline c = fj40Var.c();
        if (c != null && (subpolyline = SubpolylineHelper.subpolyline(polyline, c)) != null) {
            if (subpolyline.getPoints().size() <= 1) {
                subpolyline = null;
            }
            if (subpolyline != null) {
                return new z511(subpolyline, fj40Var.a(), null);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Point point, float f, ContinuationImpl continuationImpl) {
        MtOverlayUiStateMapper$destinationMtPoint$1 mtOverlayUiStateMapper$destinationMtPoint$1;
        int i;
        MtDestinationView mtDestinationView;
        if (continuationImpl instanceof MtOverlayUiStateMapper$destinationMtPoint$1) {
            mtOverlayUiStateMapper$destinationMtPoint$1 = (MtOverlayUiStateMapper$destinationMtPoint$1) continuationImpl;
            int i2 = mtOverlayUiStateMapper$destinationMtPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayUiStateMapper$destinationMtPoint$1.label = i2 - Integer.MIN_VALUE;
                MtOverlayUiStateMapper$destinationMtPoint$1 mtOverlayUiStateMapper$destinationMtPoint$12 = mtOverlayUiStateMapper$destinationMtPoint$1;
                Object obj = mtOverlayUiStateMapper$destinationMtPoint$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayUiStateMapper$destinationMtPoint$12.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int u = tje.u(8, context);
                    hgr0 hgr0Var = new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom));
                    mtOverlayUiStateMapper$destinationMtPoint$12.L$0 = point;
                    mtOverlayUiStateMapper$destinationMtPoint$12.F$0 = f;
                    mtOverlayUiStateMapper$destinationMtPoint$12.label = 1;
                    obj = ru.yandex.taxi.design.utils.b.e(this.b, u, hgr0Var, false, mtOverlayUiStateMapper$destinationMtPoint$12, 12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = mtOverlayUiStateMapper$destinationMtPoint$12.F$0;
                    point = (Point) mtOverlayUiStateMapper$destinationMtPoint$12.L$0;
                    kotlin.b.b(obj);
                }
                Drawable drawable = (Drawable) obj;
                mtDestinationView = this.f;
                if (mtDestinationView == null) {
                    mtDestinationView = new MtDestinationView(context);
                    this.f = mtDestinationView;
                }
                mtDestinationView.render(tje.y(f1h0.ic_destination_pin_two_flag_16, mtDestinationView.getContext()), this.g, this.h, drawable);
                xw31.r(mtDestinationView);
                return new ds30(new bl00(ImageProvider.fromBitmap(xw31.t(mtDestinationView)), new IconStyle().setZIndex(new Float(f))), point);
            }
        }
        mtOverlayUiStateMapper$destinationMtPoint$1 = new MtOverlayUiStateMapper$destinationMtPoint$1(this, continuationImpl);
        MtOverlayUiStateMapper$destinationMtPoint$1 mtOverlayUiStateMapper$destinationMtPoint$122 = mtOverlayUiStateMapper$destinationMtPoint$1;
        Object obj2 = mtOverlayUiStateMapper$destinationMtPoint$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayUiStateMapper$destinationMtPoint$122.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        Drawable drawable2 = (Drawable) obj2;
        mtDestinationView = this.f;
        if (mtDestinationView == null) {
        }
        mtDestinationView.render(tje.y(f1h0.ic_destination_pin_two_flag_16, mtDestinationView.getContext()), this.g, this.h, drawable2);
        xw31.r(mtDestinationView);
        return new ds30(new bl00(ImageProvider.fromBitmap(xw31.t(mtDestinationView)), new IconStyle().setZIndex(new Float(f))), point);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Point point, float f, ContinuationImpl continuationImpl) {
        MtOverlayUiStateMapper$intermediatePoint$1 mtOverlayUiStateMapper$intermediatePoint$1;
        int i;
        MtIntermediatePointView mtIntermediatePointView;
        if (continuationImpl instanceof MtOverlayUiStateMapper$intermediatePoint$1) {
            mtOverlayUiStateMapper$intermediatePoint$1 = (MtOverlayUiStateMapper$intermediatePoint$1) continuationImpl;
            int i2 = mtOverlayUiStateMapper$intermediatePoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayUiStateMapper$intermediatePoint$1.label = i2 - Integer.MIN_VALUE;
                MtOverlayUiStateMapper$intermediatePoint$1 mtOverlayUiStateMapper$intermediatePoint$12 = mtOverlayUiStateMapper$intermediatePoint$1;
                Object obj = mtOverlayUiStateMapper$intermediatePoint$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayUiStateMapper$intermediatePoint$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MtIntermediatePointView mtIntermediatePointView2 = this.j;
                    Context context = this.a;
                    if (mtIntermediatePointView2 == null) {
                        mtIntermediatePointView2 = new MtIntermediatePointView(context);
                        this.j = mtIntermediatePointView2;
                    }
                    int u = tje.u(8, context);
                    hgr0 hgr0Var = new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom));
                    mtOverlayUiStateMapper$intermediatePoint$12.L$0 = str;
                    mtOverlayUiStateMapper$intermediatePoint$12.L$1 = point;
                    mtOverlayUiStateMapper$intermediatePoint$12.L$2 = mtIntermediatePointView2;
                    mtOverlayUiStateMapper$intermediatePoint$12.F$0 = f;
                    mtOverlayUiStateMapper$intermediatePoint$12.label = 1;
                    Object e = ru.yandex.taxi.design.utils.b.e(this.b, u, hgr0Var, false, mtOverlayUiStateMapper$intermediatePoint$12, 12);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    MtIntermediatePointView mtIntermediatePointView3 = mtIntermediatePointView2;
                    obj = e;
                    mtIntermediatePointView = mtIntermediatePointView3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = mtOverlayUiStateMapper$intermediatePoint$12.F$0;
                    mtIntermediatePointView = (MtIntermediatePointView) mtOverlayUiStateMapper$intermediatePoint$12.L$2;
                    point = (Point) mtOverlayUiStateMapper$intermediatePoint$12.L$1;
                    str = (String) mtOverlayUiStateMapper$intermediatePoint$12.L$0;
                    kotlin.b.b(obj);
                }
                mtIntermediatePointView.render(str, (Drawable) obj);
                xw31.r(mtIntermediatePointView);
                Bitmap t = xw31.t(mtIntermediatePointView);
                return new br30(new bl00(ImageProvider.fromBitmap(t), new IconStyle().setZIndex(new Float(f))), point);
            }
        }
        mtOverlayUiStateMapper$intermediatePoint$1 = new MtOverlayUiStateMapper$intermediatePoint$1(this, continuationImpl);
        MtOverlayUiStateMapper$intermediatePoint$1 mtOverlayUiStateMapper$intermediatePoint$122 = mtOverlayUiStateMapper$intermediatePoint$1;
        Object obj2 = mtOverlayUiStateMapper$intermediatePoint$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayUiStateMapper$intermediatePoint$122.label;
        if (i != 0) {
        }
        mtIntermediatePointView.render(str, (Drawable) obj2);
        xw31.r(mtIntermediatePointView);
        Bitmap t2 = xw31.t(mtIntermediatePointView);
        return new br30(new bl00(ImageProvider.fromBitmap(t2), new IconStyle().setZIndex(new Float(f))), point);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Point point, CharSequence charSequence, IconStyle iconStyle, sm30 sm30Var, ContinuationImpl continuationImpl) {
        MtOverlayUiStateMapper$label$1 mtOverlayUiStateMapper$label$1;
        int i;
        if (continuationImpl instanceof MtOverlayUiStateMapper$label$1) {
            mtOverlayUiStateMapper$label$1 = (MtOverlayUiStateMapper$label$1) continuationImpl;
            int i2 = mtOverlayUiStateMapper$label$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayUiStateMapper$label$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtOverlayUiStateMapper$label$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayUiStateMapper$label$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtOverlayUiStateMapper$label$1.L$0 = null;
                    mtOverlayUiStateMapper$label$1.L$1 = null;
                    mtOverlayUiStateMapper$label$1.L$2 = null;
                    mtOverlayUiStateMapper$label$1.L$3 = sm30Var;
                    mtOverlayUiStateMapper$label$1.L$4 = point;
                    mtOverlayUiStateMapper$label$1.label = 1;
                    obj = g(charSequence, iconStyle, mtOverlayUiStateMapper$label$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    point = (Point) mtOverlayUiStateMapper$label$1.L$4;
                    sm30Var = (sm30) mtOverlayUiStateMapper$label$1.L$3;
                    kotlin.b.b(obj);
                }
                return new tm30(point, (bl00) obj, sm30Var);
            }
        }
        mtOverlayUiStateMapper$label$1 = new MtOverlayUiStateMapper$label$1(this, continuationImpl);
        Object obj3 = mtOverlayUiStateMapper$label$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayUiStateMapper$label$1.label;
        if (i != 0) {
        }
        return new tm30(point, (bl00) obj3, sm30Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x05b1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x02aa -> B:13:0x05b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x02bf -> B:13:0x05b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x02d4 -> B:13:0x05b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x059c -> B:12:0x05a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, Polyline polyline, float f, zls zlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        MtOverlayUiStateMapper$overlaySections$1 mtOverlayUiStateMapper$overlaySections$1;
        Iterator it;
        MtOverlayUiStateMapper$overlaySections$1 mtOverlayUiStateMapper$overlaySections$12;
        Collection collection;
        int i;
        Polyline polyline2;
        float f2;
        zls zlsVar2;
        wls wlsVar2;
        hz30 hz30Var;
        Collection collection2;
        zls zlsVar3;
        Polyline polyline3;
        int i2;
        int i3;
        float f3;
        z511 z511Var;
        wls wlsVar3;
        Object obj;
        List list2;
        z511 z511Var2;
        zls zlsVar4;
        Polyline polyline4;
        hz30 hz30Var2;
        Collection collection3;
        zls zlsVar5;
        Polyline polyline5;
        int i4;
        z511 z511Var3;
        List list3;
        z511 z511Var4;
        hz30 hz30Var3;
        Collection collection4;
        zls zlsVar6;
        Polyline polyline6;
        int i5;
        z511 z511Var5;
        List list4;
        z511 z511Var6;
        int i6;
        er30 er30Var;
        hz30 hz30Var4;
        Collection collection5;
        zls zlsVar7;
        int i7;
        int i8;
        float f4;
        z511 z511Var7;
        Iterator it2;
        wls wlsVar4;
        Polyline polyline7;
        Object invoke;
        List list5;
        Collection collection6;
        zls zlsVar8;
        dr30 dr30Var;
        Object invoke2;
        Object invoke3;
        Object invoke4;
        if (continuationImpl instanceof MtOverlayUiStateMapper$overlaySections$1) {
            mtOverlayUiStateMapper$overlaySections$1 = (MtOverlayUiStateMapper$overlaySections$1) continuationImpl;
            int i9 = mtOverlayUiStateMapper$overlaySections$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                mtOverlayUiStateMapper$overlaySections$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = mtOverlayUiStateMapper$overlaySections$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (mtOverlayUiStateMapper$overlaySections$1.label) {
                    case 0:
                        kotlin.b.b(obj2);
                        ArrayList arrayList = new ArrayList();
                        it = list.iterator();
                        mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                        collection = arrayList;
                        i = 0;
                        polyline2 = polyline;
                        f2 = f;
                        zlsVar2 = zlsVar;
                        wlsVar2 = wlsVar;
                        if (!it.hasNext()) {
                            Object next = it.next();
                            i6 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            hz30Var4 = (hz30) next;
                            if (hz30Var4 instanceof gz30) {
                                er30Var = null;
                            } else if (hz30Var4 instanceof bs30) {
                                er30Var = new cr30(SubpolylineHelper.subpolyline(polyline2, ((bs30) hz30Var4).c), WalkingRouteUiState.Type.GROUND);
                            } else if (hz30Var4 instanceof yi40) {
                                er30Var = new cr30(SubpolylineHelper.subpolyline(polyline2, ((yi40) hz30Var4).b), WalkingRouteUiState.Type.GROUND);
                            } else if (hz30Var4 instanceof zi40) {
                                er30Var = new cr30(SubpolylineHelper.subpolyline(polyline2, ((zi40) hz30Var4).i), WalkingRouteUiState.Type.UNDERGROUND);
                            } else if (hz30Var4 instanceof jm30) {
                                z511Var = h(polyline2, (fj40) hz30Var4);
                                if (z511Var != null) {
                                    Integer num = new Integer(i);
                                    obj = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$0 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$1 = polyline2;
                                    mtOverlayUiStateMapper$overlaySections$12.L$2 = zlsVar2;
                                    mtOverlayUiStateMapper$overlaySections$12.L$3 = wlsVar2;
                                    mtOverlayUiStateMapper$overlaySections$12.L$4 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$5 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$6 = collection;
                                    mtOverlayUiStateMapper$overlaySections$12.L$7 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$8 = it;
                                    mtOverlayUiStateMapper$overlaySections$12.L$9 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$10 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$11 = hz30Var4;
                                    mtOverlayUiStateMapper$overlaySections$12.L$12 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$13 = z511Var;
                                    mtOverlayUiStateMapper$overlaySections$12.L$14 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.F$0 = f2;
                                    mtOverlayUiStateMapper$overlaySections$12.I$0 = i6;
                                    mtOverlayUiStateMapper$overlaySections$12.I$1 = i;
                                    mtOverlayUiStateMapper$overlaySections$12.I$2 = i;
                                    mtOverlayUiStateMapper$overlaySections$12.label = 1;
                                    Object invoke5 = zlsVar2.invoke(num, hz30Var4, mtOverlayUiStateMapper$overlaySections$12);
                                    if (invoke5 != obj3) {
                                        polyline3 = polyline2;
                                        obj2 = invoke5;
                                        zlsVar3 = zlsVar2;
                                        i2 = i6;
                                        collection2 = collection;
                                        hz30Var = hz30Var4;
                                        wlsVar3 = wlsVar2;
                                        f3 = f2;
                                        mtOverlayUiStateMapper$overlaySections$1 = mtOverlayUiStateMapper$overlaySections$12;
                                        i3 = i;
                                        List list6 = (List) obj2;
                                        mtOverlayUiStateMapper$overlaySections$1.L$0 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline3;
                                        mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar3;
                                        mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar3;
                                        mtOverlayUiStateMapper$overlaySections$1.L$4 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$5 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$6 = collection2;
                                        mtOverlayUiStateMapper$overlaySections$1.L$7 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$8 = it;
                                        mtOverlayUiStateMapper$overlaySections$1.L$9 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$10 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$11 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$12 = obj;
                                        mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var;
                                        mtOverlayUiStateMapper$overlaySections$1.L$14 = list6;
                                        mtOverlayUiStateMapper$overlaySections$1.F$0 = f3;
                                        mtOverlayUiStateMapper$overlaySections$1.I$0 = i2;
                                        mtOverlayUiStateMapper$overlaySections$1.I$1 = i3;
                                        mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                                        mtOverlayUiStateMapper$overlaySections$1.label = 2;
                                        invoke4 = wlsVar3.invoke(hz30Var, mtOverlayUiStateMapper$overlaySections$1);
                                        if (invoke4 != obj3) {
                                            list2 = list6;
                                            obj2 = invoke4;
                                            collection = collection2;
                                            z511Var2 = z511Var;
                                            zlsVar4 = zlsVar3;
                                            polyline4 = polyline3;
                                            dr30Var = new dr30(z511Var2, list2, (List) obj2);
                                            zls zlsVar9 = zlsVar4;
                                            i6 = i2;
                                            zlsVar2 = zlsVar9;
                                            mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                                            f2 = f3;
                                            wlsVar2 = wlsVar3;
                                            polyline2 = polyline4;
                                            er30Var = dr30Var;
                                        }
                                    }
                                    return obj3;
                                }
                                er30Var = null;
                            } else {
                                if (!(hz30Var4 instanceof r440)) {
                                    if (hz30Var4 instanceof lj40) {
                                        z511Var5 = h(polyline2, (fj40) hz30Var4);
                                        if (z511Var5 != null) {
                                            Integer num2 = new Integer(i);
                                            mtOverlayUiStateMapper$overlaySections$12.L$0 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$1 = polyline2;
                                            mtOverlayUiStateMapper$overlaySections$12.L$2 = zlsVar2;
                                            mtOverlayUiStateMapper$overlaySections$12.L$3 = wlsVar2;
                                            mtOverlayUiStateMapper$overlaySections$12.L$4 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$5 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$6 = collection;
                                            mtOverlayUiStateMapper$overlaySections$12.L$7 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$8 = it;
                                            mtOverlayUiStateMapper$overlaySections$12.L$9 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$10 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$11 = hz30Var4;
                                            mtOverlayUiStateMapper$overlaySections$12.L$12 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$13 = z511Var5;
                                            mtOverlayUiStateMapper$overlaySections$12.L$14 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.F$0 = f2;
                                            mtOverlayUiStateMapper$overlaySections$12.I$0 = i6;
                                            mtOverlayUiStateMapper$overlaySections$12.I$1 = i;
                                            mtOverlayUiStateMapper$overlaySections$12.I$2 = i;
                                            mtOverlayUiStateMapper$overlaySections$12.label = 5;
                                            Object invoke6 = zlsVar2.invoke(num2, hz30Var4, mtOverlayUiStateMapper$overlaySections$12);
                                            if (invoke6 != obj3) {
                                                polyline6 = polyline2;
                                                obj2 = invoke6;
                                                zlsVar6 = zlsVar2;
                                                i2 = i6;
                                                collection4 = collection;
                                                hz30Var3 = hz30Var4;
                                                wlsVar3 = wlsVar2;
                                                f3 = f2;
                                                mtOverlayUiStateMapper$overlaySections$1 = mtOverlayUiStateMapper$overlaySections$12;
                                                i5 = i;
                                                List list7 = (List) obj2;
                                                mtOverlayUiStateMapper$overlaySections$1.L$0 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline6;
                                                mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar6;
                                                mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar3;
                                                mtOverlayUiStateMapper$overlaySections$1.L$4 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$5 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$6 = collection4;
                                                mtOverlayUiStateMapper$overlaySections$1.L$7 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$8 = it;
                                                mtOverlayUiStateMapper$overlaySections$1.L$9 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$10 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$11 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$12 = null;
                                                mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var5;
                                                mtOverlayUiStateMapper$overlaySections$1.L$14 = list7;
                                                mtOverlayUiStateMapper$overlaySections$1.F$0 = f3;
                                                mtOverlayUiStateMapper$overlaySections$1.I$0 = i2;
                                                mtOverlayUiStateMapper$overlaySections$1.I$1 = i5;
                                                mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                                                mtOverlayUiStateMapper$overlaySections$1.label = 6;
                                                invoke2 = wlsVar3.invoke(hz30Var3, mtOverlayUiStateMapper$overlaySections$1);
                                                if (invoke2 != obj3) {
                                                    list4 = list7;
                                                    obj2 = invoke2;
                                                    collection = collection4;
                                                    z511Var6 = z511Var5;
                                                    zlsVar4 = zlsVar6;
                                                    polyline4 = polyline6;
                                                    dr30Var = new dr30(z511Var6, list4, (List) obj2);
                                                    zls zlsVar92 = zlsVar4;
                                                    i6 = i2;
                                                    zlsVar2 = zlsVar92;
                                                    mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                                                    f2 = f3;
                                                    wlsVar2 = wlsVar3;
                                                    polyline2 = polyline4;
                                                    er30Var = dr30Var;
                                                }
                                            }
                                        }
                                        er30Var = null;
                                    } else {
                                        if (hz30Var4 instanceof nk31) {
                                            nk31 nk31Var = (nk31) hz30Var4;
                                            String valueOf = String.valueOf(nk31Var.c);
                                            Point point = nk31Var.d;
                                            mtOverlayUiStateMapper$overlaySections$12.L$0 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$1 = polyline2;
                                            mtOverlayUiStateMapper$overlaySections$12.L$2 = zlsVar2;
                                            mtOverlayUiStateMapper$overlaySections$12.L$3 = wlsVar2;
                                            mtOverlayUiStateMapper$overlaySections$12.L$4 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$5 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$6 = collection;
                                            mtOverlayUiStateMapper$overlaySections$12.L$7 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$8 = it;
                                            mtOverlayUiStateMapper$overlaySections$12.L$9 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$10 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$11 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$12 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$13 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.L$14 = null;
                                            mtOverlayUiStateMapper$overlaySections$12.F$0 = f2;
                                            mtOverlayUiStateMapper$overlaySections$12.I$0 = i6;
                                            mtOverlayUiStateMapper$overlaySections$12.I$1 = i;
                                            mtOverlayUiStateMapper$overlaySections$12.I$2 = i;
                                            mtOverlayUiStateMapper$overlaySections$12.label = 7;
                                            Object b = b(valueOf, point, f2, mtOverlayUiStateMapper$overlaySections$12);
                                            if (b != obj3) {
                                                mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$12;
                                                f2 = f2;
                                                wlsVar2 = wlsVar2;
                                                it = it;
                                                i6 = i6;
                                                zlsVar2 = zlsVar2;
                                                collection = collection;
                                                er30Var = (er30) b;
                                                polyline2 = polyline2;
                                            }
                                        } else {
                                            if (!(hz30Var4 instanceof l540)) {
                                                w511.b();
                                                return null;
                                            }
                                            l540 l540Var = (l540) hz30Var4;
                                            Polyline subpolyline = SubpolylineHelper.subpolyline(polyline2, l540Var.c);
                                            if (subpolyline.getPoints().size() <= 1) {
                                                subpolyline = null;
                                            }
                                            z511 z511Var8 = subpolyline == null ? null : new z511(subpolyline, l540Var.j, l540Var.a);
                                            if (z511Var8 != null) {
                                                Integer num3 = new Integer(i);
                                                mtOverlayUiStateMapper$overlaySections$12.L$0 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.L$1 = polyline2;
                                                mtOverlayUiStateMapper$overlaySections$12.L$2 = zlsVar2;
                                                mtOverlayUiStateMapper$overlaySections$12.L$3 = wlsVar2;
                                                mtOverlayUiStateMapper$overlaySections$12.L$4 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.L$5 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.L$6 = collection;
                                                mtOverlayUiStateMapper$overlaySections$12.L$7 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.L$8 = it;
                                                mtOverlayUiStateMapper$overlaySections$12.L$9 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.L$10 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.L$11 = hz30Var4;
                                                mtOverlayUiStateMapper$overlaySections$12.L$12 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.L$13 = z511Var8;
                                                mtOverlayUiStateMapper$overlaySections$12.L$14 = null;
                                                mtOverlayUiStateMapper$overlaySections$12.F$0 = f2;
                                                mtOverlayUiStateMapper$overlaySections$12.I$0 = i6;
                                                mtOverlayUiStateMapper$overlaySections$12.I$1 = i;
                                                mtOverlayUiStateMapper$overlaySections$12.I$2 = i;
                                                mtOverlayUiStateMapper$overlaySections$12.label = 8;
                                                Object invoke7 = zlsVar2.invoke(num3, hz30Var4, mtOverlayUiStateMapper$overlaySections$12);
                                                if (invoke7 != obj3) {
                                                    z511 z511Var9 = z511Var8;
                                                    polyline7 = polyline2;
                                                    obj2 = invoke7;
                                                    collection5 = collection;
                                                    it2 = it;
                                                    z511Var7 = z511Var9;
                                                    MtOverlayUiStateMapper$overlaySections$1 mtOverlayUiStateMapper$overlaySections$13 = mtOverlayUiStateMapper$overlaySections$12;
                                                    f4 = f2;
                                                    mtOverlayUiStateMapper$overlaySections$1 = mtOverlayUiStateMapper$overlaySections$13;
                                                    zlsVar7 = zlsVar2;
                                                    i7 = i6;
                                                    wlsVar4 = wlsVar2;
                                                    i8 = i;
                                                    List list8 = (List) obj2;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$0 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline7;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar7;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar4;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$4 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$5 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$6 = collection5;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$7 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$8 = it2;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$9 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$10 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$11 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$12 = null;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var7;
                                                    mtOverlayUiStateMapper$overlaySections$1.L$14 = list8;
                                                    mtOverlayUiStateMapper$overlaySections$1.F$0 = f4;
                                                    mtOverlayUiStateMapper$overlaySections$1.I$0 = i7;
                                                    mtOverlayUiStateMapper$overlaySections$1.I$1 = i8;
                                                    mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                                                    mtOverlayUiStateMapper$overlaySections$1.label = 9;
                                                    invoke = wlsVar4.invoke(hz30Var4, mtOverlayUiStateMapper$overlaySections$1);
                                                    if (invoke != obj3) {
                                                        list5 = list8;
                                                        obj2 = invoke;
                                                        collection6 = collection5;
                                                        zlsVar8 = zlsVar7;
                                                        dr30 dr30Var2 = new dr30(z511Var7, list5, (List) obj2);
                                                        float f5 = f4;
                                                        mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                                                        f2 = f5;
                                                        er30Var = dr30Var2;
                                                        it = it2;
                                                        collection = collection6;
                                                        wlsVar2 = wlsVar4;
                                                        polyline2 = polyline7;
                                                        i6 = i7;
                                                        zlsVar2 = zlsVar8;
                                                    }
                                                }
                                            }
                                            er30Var = null;
                                        }
                                        if (!it.hasNext()) {
                                            return (List) collection;
                                        }
                                    }
                                    return obj3;
                                }
                                z511Var3 = h(polyline2, (fj40) hz30Var4);
                                if (z511Var3 != null) {
                                    Integer num4 = new Integer(i);
                                    mtOverlayUiStateMapper$overlaySections$12.L$0 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$1 = polyline2;
                                    mtOverlayUiStateMapper$overlaySections$12.L$2 = zlsVar2;
                                    mtOverlayUiStateMapper$overlaySections$12.L$3 = wlsVar2;
                                    mtOverlayUiStateMapper$overlaySections$12.L$4 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$5 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$6 = collection;
                                    mtOverlayUiStateMapper$overlaySections$12.L$7 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$8 = it;
                                    mtOverlayUiStateMapper$overlaySections$12.L$9 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$10 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$11 = hz30Var4;
                                    mtOverlayUiStateMapper$overlaySections$12.L$12 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.L$13 = z511Var3;
                                    mtOverlayUiStateMapper$overlaySections$12.L$14 = null;
                                    mtOverlayUiStateMapper$overlaySections$12.F$0 = f2;
                                    mtOverlayUiStateMapper$overlaySections$12.I$0 = i6;
                                    mtOverlayUiStateMapper$overlaySections$12.I$1 = i;
                                    mtOverlayUiStateMapper$overlaySections$12.I$2 = i;
                                    mtOverlayUiStateMapper$overlaySections$12.label = 3;
                                    Object invoke8 = zlsVar2.invoke(num4, hz30Var4, mtOverlayUiStateMapper$overlaySections$12);
                                    if (invoke8 != obj3) {
                                        polyline5 = polyline2;
                                        obj2 = invoke8;
                                        zlsVar5 = zlsVar2;
                                        i2 = i6;
                                        collection3 = collection;
                                        hz30Var2 = hz30Var4;
                                        wlsVar3 = wlsVar2;
                                        f3 = f2;
                                        mtOverlayUiStateMapper$overlaySections$1 = mtOverlayUiStateMapper$overlaySections$12;
                                        i4 = i;
                                        List list9 = (List) obj2;
                                        mtOverlayUiStateMapper$overlaySections$1.L$0 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline5;
                                        mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar5;
                                        mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar3;
                                        mtOverlayUiStateMapper$overlaySections$1.L$4 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$5 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$6 = collection3;
                                        mtOverlayUiStateMapper$overlaySections$1.L$7 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$8 = it;
                                        mtOverlayUiStateMapper$overlaySections$1.L$9 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$10 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$11 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$12 = null;
                                        mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var3;
                                        mtOverlayUiStateMapper$overlaySections$1.L$14 = list9;
                                        mtOverlayUiStateMapper$overlaySections$1.F$0 = f3;
                                        mtOverlayUiStateMapper$overlaySections$1.I$0 = i2;
                                        mtOverlayUiStateMapper$overlaySections$1.I$1 = i4;
                                        mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                                        mtOverlayUiStateMapper$overlaySections$1.label = 4;
                                        invoke3 = wlsVar3.invoke(hz30Var2, mtOverlayUiStateMapper$overlaySections$1);
                                        if (invoke3 != obj3) {
                                            list3 = list9;
                                            obj2 = invoke3;
                                            collection = collection3;
                                            z511Var4 = z511Var3;
                                            zlsVar4 = zlsVar5;
                                            polyline4 = polyline5;
                                            dr30Var = new dr30(z511Var4, list3, (List) obj2);
                                            zls zlsVar922 = zlsVar4;
                                            i6 = i2;
                                            zlsVar2 = zlsVar922;
                                            mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                                            f2 = f3;
                                            wlsVar2 = wlsVar3;
                                            polyline2 = polyline4;
                                            er30Var = dr30Var;
                                        }
                                    }
                                    return obj3;
                                }
                                er30Var = null;
                            }
                            if (er30Var != null) {
                                collection.add(er30Var);
                            }
                            i = i6;
                            if (!it.hasNext()) {
                            }
                        }
                        break;
                    case 1:
                        int i10 = mtOverlayUiStateMapper$overlaySections$1.I$2;
                        int i11 = mtOverlayUiStateMapper$overlaySections$1.I$1;
                        int i12 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        float f6 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        z511 z511Var10 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        hz30Var = (hz30) mtOverlayUiStateMapper$overlaySections$1.L$11;
                        Iterator it3 = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection2 = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wls wlsVar5 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar3 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        polyline3 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        i = i10;
                        i2 = i12;
                        i3 = i11;
                        f3 = f6;
                        z511Var = z511Var10;
                        it = it3;
                        wlsVar3 = wlsVar5;
                        obj = null;
                        List list62 = (List) obj2;
                        mtOverlayUiStateMapper$overlaySections$1.L$0 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline3;
                        mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar3;
                        mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar3;
                        mtOverlayUiStateMapper$overlaySections$1.L$4 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$5 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$6 = collection2;
                        mtOverlayUiStateMapper$overlaySections$1.L$7 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$8 = it;
                        mtOverlayUiStateMapper$overlaySections$1.L$9 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$10 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$11 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$12 = obj;
                        mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var;
                        mtOverlayUiStateMapper$overlaySections$1.L$14 = list62;
                        mtOverlayUiStateMapper$overlaySections$1.F$0 = f3;
                        mtOverlayUiStateMapper$overlaySections$1.I$0 = i2;
                        mtOverlayUiStateMapper$overlaySections$1.I$1 = i3;
                        mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                        mtOverlayUiStateMapper$overlaySections$1.label = 2;
                        invoke4 = wlsVar3.invoke(hz30Var, mtOverlayUiStateMapper$overlaySections$1);
                        if (invoke4 != obj3) {
                        }
                        return obj3;
                    case 2:
                        i2 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        f3 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        list2 = (List) mtOverlayUiStateMapper$overlaySections$1.L$14;
                        z511Var2 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        it = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wlsVar3 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar4 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        polyline4 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        dr30Var = new dr30(z511Var2, list2, (List) obj2);
                        zls zlsVar9222 = zlsVar4;
                        i6 = i2;
                        zlsVar2 = zlsVar9222;
                        mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                        f2 = f3;
                        wlsVar2 = wlsVar3;
                        polyline2 = polyline4;
                        er30Var = dr30Var;
                        if (er30Var != null) {
                        }
                        i = i6;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 3:
                        int i13 = mtOverlayUiStateMapper$overlaySections$1.I$2;
                        int i14 = mtOverlayUiStateMapper$overlaySections$1.I$1;
                        int i15 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        float f7 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        z511 z511Var11 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        hz30Var2 = (hz30) mtOverlayUiStateMapper$overlaySections$1.L$11;
                        Iterator it4 = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection3 = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wls wlsVar6 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar5 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        polyline5 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        i = i13;
                        i2 = i15;
                        i4 = i14;
                        f3 = f7;
                        z511Var3 = z511Var11;
                        it = it4;
                        wlsVar3 = wlsVar6;
                        List list92 = (List) obj2;
                        mtOverlayUiStateMapper$overlaySections$1.L$0 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline5;
                        mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar5;
                        mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar3;
                        mtOverlayUiStateMapper$overlaySections$1.L$4 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$5 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$6 = collection3;
                        mtOverlayUiStateMapper$overlaySections$1.L$7 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$8 = it;
                        mtOverlayUiStateMapper$overlaySections$1.L$9 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$10 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$11 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$12 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var3;
                        mtOverlayUiStateMapper$overlaySections$1.L$14 = list92;
                        mtOverlayUiStateMapper$overlaySections$1.F$0 = f3;
                        mtOverlayUiStateMapper$overlaySections$1.I$0 = i2;
                        mtOverlayUiStateMapper$overlaySections$1.I$1 = i4;
                        mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                        mtOverlayUiStateMapper$overlaySections$1.label = 4;
                        invoke3 = wlsVar3.invoke(hz30Var2, mtOverlayUiStateMapper$overlaySections$1);
                        if (invoke3 != obj3) {
                        }
                        return obj3;
                    case 4:
                        i2 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        f3 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        list3 = (List) mtOverlayUiStateMapper$overlaySections$1.L$14;
                        z511Var4 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        it = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wlsVar3 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar4 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        polyline4 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        dr30Var = new dr30(z511Var4, list3, (List) obj2);
                        zls zlsVar92222 = zlsVar4;
                        i6 = i2;
                        zlsVar2 = zlsVar92222;
                        mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                        f2 = f3;
                        wlsVar2 = wlsVar3;
                        polyline2 = polyline4;
                        er30Var = dr30Var;
                        if (er30Var != null) {
                        }
                        i = i6;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 5:
                        int i16 = mtOverlayUiStateMapper$overlaySections$1.I$2;
                        int i17 = mtOverlayUiStateMapper$overlaySections$1.I$1;
                        int i18 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        float f8 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        z511 z511Var12 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        hz30Var3 = (hz30) mtOverlayUiStateMapper$overlaySections$1.L$11;
                        Iterator it5 = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection4 = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wls wlsVar7 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar6 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        polyline6 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        i = i16;
                        i2 = i18;
                        i5 = i17;
                        f3 = f8;
                        z511Var5 = z511Var12;
                        it = it5;
                        wlsVar3 = wlsVar7;
                        List list72 = (List) obj2;
                        mtOverlayUiStateMapper$overlaySections$1.L$0 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline6;
                        mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar6;
                        mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar3;
                        mtOverlayUiStateMapper$overlaySections$1.L$4 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$5 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$6 = collection4;
                        mtOverlayUiStateMapper$overlaySections$1.L$7 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$8 = it;
                        mtOverlayUiStateMapper$overlaySections$1.L$9 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$10 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$11 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$12 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var5;
                        mtOverlayUiStateMapper$overlaySections$1.L$14 = list72;
                        mtOverlayUiStateMapper$overlaySections$1.F$0 = f3;
                        mtOverlayUiStateMapper$overlaySections$1.I$0 = i2;
                        mtOverlayUiStateMapper$overlaySections$1.I$1 = i5;
                        mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                        mtOverlayUiStateMapper$overlaySections$1.label = 6;
                        invoke2 = wlsVar3.invoke(hz30Var3, mtOverlayUiStateMapper$overlaySections$1);
                        if (invoke2 != obj3) {
                        }
                        return obj3;
                    case 6:
                        i2 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        f3 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        list4 = (List) mtOverlayUiStateMapper$overlaySections$1.L$14;
                        z511Var6 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        it = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wlsVar3 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar4 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        polyline4 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        dr30Var = new dr30(z511Var6, list4, (List) obj2);
                        zls zlsVar922222 = zlsVar4;
                        i6 = i2;
                        zlsVar2 = zlsVar922222;
                        mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                        f2 = f3;
                        wlsVar2 = wlsVar3;
                        polyline2 = polyline4;
                        er30Var = dr30Var;
                        if (er30Var != null) {
                        }
                        i = i6;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 7:
                        int i19 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        float f9 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        Iterator it6 = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        Collection collection7 = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wls wlsVar8 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zls zlsVar10 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        Polyline polyline8 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                        f2 = f9;
                        wlsVar2 = wlsVar8;
                        it = it6;
                        i6 = i19;
                        zlsVar2 = zlsVar10;
                        collection = collection7;
                        er30Var = (er30) obj2;
                        polyline2 = polyline8;
                        if (er30Var != null) {
                        }
                        i = i6;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 8:
                        int i20 = mtOverlayUiStateMapper$overlaySections$1.I$2;
                        int i21 = mtOverlayUiStateMapper$overlaySections$1.I$1;
                        int i22 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        float f10 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        z511 z511Var13 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        hz30Var4 = (hz30) mtOverlayUiStateMapper$overlaySections$1.L$11;
                        Iterator it7 = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection5 = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wls wlsVar9 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar7 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        Polyline polyline9 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        i = i20;
                        i7 = i22;
                        i8 = i21;
                        f4 = f10;
                        z511Var7 = z511Var13;
                        it2 = it7;
                        wlsVar4 = wlsVar9;
                        polyline7 = polyline9;
                        List list82 = (List) obj2;
                        mtOverlayUiStateMapper$overlaySections$1.L$0 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$1 = polyline7;
                        mtOverlayUiStateMapper$overlaySections$1.L$2 = zlsVar7;
                        mtOverlayUiStateMapper$overlaySections$1.L$3 = wlsVar4;
                        mtOverlayUiStateMapper$overlaySections$1.L$4 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$5 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$6 = collection5;
                        mtOverlayUiStateMapper$overlaySections$1.L$7 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$8 = it2;
                        mtOverlayUiStateMapper$overlaySections$1.L$9 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$10 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$11 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$12 = null;
                        mtOverlayUiStateMapper$overlaySections$1.L$13 = z511Var7;
                        mtOverlayUiStateMapper$overlaySections$1.L$14 = list82;
                        mtOverlayUiStateMapper$overlaySections$1.F$0 = f4;
                        mtOverlayUiStateMapper$overlaySections$1.I$0 = i7;
                        mtOverlayUiStateMapper$overlaySections$1.I$1 = i8;
                        mtOverlayUiStateMapper$overlaySections$1.I$2 = i;
                        mtOverlayUiStateMapper$overlaySections$1.label = 9;
                        invoke = wlsVar4.invoke(hz30Var4, mtOverlayUiStateMapper$overlaySections$1);
                        if (invoke != obj3) {
                        }
                        return obj3;
                    case 9:
                        i7 = mtOverlayUiStateMapper$overlaySections$1.I$0;
                        f4 = mtOverlayUiStateMapper$overlaySections$1.F$0;
                        list5 = (List) mtOverlayUiStateMapper$overlaySections$1.L$14;
                        z511Var7 = (z511) mtOverlayUiStateMapper$overlaySections$1.L$13;
                        it2 = (Iterator) mtOverlayUiStateMapper$overlaySections$1.L$8;
                        collection6 = (Collection) mtOverlayUiStateMapper$overlaySections$1.L$6;
                        wlsVar4 = (wls) mtOverlayUiStateMapper$overlaySections$1.L$3;
                        zlsVar8 = (zls) mtOverlayUiStateMapper$overlaySections$1.L$2;
                        polyline7 = (Polyline) mtOverlayUiStateMapper$overlaySections$1.L$1;
                        kotlin.b.b(obj2);
                        dr30 dr30Var22 = new dr30(z511Var7, list5, (List) obj2);
                        float f52 = f4;
                        mtOverlayUiStateMapper$overlaySections$12 = mtOverlayUiStateMapper$overlaySections$1;
                        f2 = f52;
                        er30Var = dr30Var22;
                        it = it2;
                        collection = collection6;
                        wlsVar2 = wlsVar4;
                        polyline2 = polyline7;
                        i6 = i7;
                        zlsVar2 = zlsVar8;
                        if (er30Var != null) {
                        }
                        i = i6;
                        if (!it.hasNext()) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mtOverlayUiStateMapper$overlaySections$1 = new MtOverlayUiStateMapper$overlaySections$1(this, continuationImpl);
        Object obj22 = mtOverlayUiStateMapper$overlaySections$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (mtOverlayUiStateMapper$overlaySections$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        MtOverlayUiStateMapper$pinComponent$1 mtOverlayUiStateMapper$pinComponent$1;
        int i;
        Context context;
        if (continuationImpl instanceof MtOverlayUiStateMapper$pinComponent$1) {
            mtOverlayUiStateMapper$pinComponent$1 = (MtOverlayUiStateMapper$pinComponent$1) continuationImpl;
            int i2 = mtOverlayUiStateMapper$pinComponent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayUiStateMapper$pinComponent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtOverlayUiStateMapper$pinComponent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayUiStateMapper$pinComponent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PinV2Component pinV2Component = this.c;
                    if (pinV2Component != null) {
                        return pinV2Component;
                    }
                    mtOverlayUiStateMapper$pinComponent$1.L$0 = null;
                    Context context2 = this.a;
                    mtOverlayUiStateMapper$pinComponent$1.L$1 = context2;
                    mtOverlayUiStateMapper$pinComponent$1.label = 1;
                    Object c = this.b.c(mtOverlayUiStateMapper$pinComponent$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context = context2;
                    obj = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) mtOverlayUiStateMapper$pinComponent$1.L$1;
                    kotlin.b.b(obj);
                }
                PinV2Component pinV2Component2 = new PinV2Component(context, (h1c0) obj);
                this.c = pinV2Component2;
                return pinV2Component2;
            }
        }
        mtOverlayUiStateMapper$pinComponent$1 = new MtOverlayUiStateMapper$pinComponent$1(this, continuationImpl);
        Object obj2 = mtOverlayUiStateMapper$pinComponent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayUiStateMapper$pinComponent$1.label;
        if (i != 0) {
        }
        PinV2Component pinV2Component22 = new PinV2Component(context, (h1c0) obj2);
        this.c = pinV2Component22;
        return pinV2Component22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r17v0, types: [ru.yandex.taxi.masstransit.mapper.d] */
    /* JADX WARN: Type inference failed for: r1v6, types: [a0c0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [a0c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Point point, float f, Drawable drawable, fay0 fay0Var, ContinuationImpl continuationImpl) {
        MtOverlayUiStateMapper$sourceMtPoint$1 mtOverlayUiStateMapper$sourceMtPoint$1;
        int i;
        c0c0 c0c0Var;
        SourceOnMapControl.a aVar;
        Point point2;
        i1c0 i1c0Var;
        float f2;
        ?? r1;
        String str;
        if (continuationImpl instanceof MtOverlayUiStateMapper$sourceMtPoint$1) {
            mtOverlayUiStateMapper$sourceMtPoint$1 = (MtOverlayUiStateMapper$sourceMtPoint$1) continuationImpl;
            int i2 = mtOverlayUiStateMapper$sourceMtPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayUiStateMapper$sourceMtPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtOverlayUiStateMapper$sourceMtPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayUiStateMapper$sourceMtPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bdc bdcVar = this.d;
                    Context context = this.a;
                    i1c0 i1c0Var2 = new i1c0(s8o.m(bdcVar, context), s8o.m(this.e, context));
                    if (fay0Var == null || (r1 = fay0Var.f) == 0) {
                        c0c0Var = new c0c0(drawable == null ? tje.y(q2h0.ic_transport_source, context) : drawable);
                    } else {
                        Integer num = r1.b;
                        String str2 = r1.a;
                        if (num == null && (num = bvu0.l(10, evu0.k0(str2).toString())) == null) {
                            w610 b = k.b(evu0.k0(str2).toString());
                            num = (b == null || (str = (String) ((u1l) b.a()).get(1)) == null) ? null : bvu0.l(10, str);
                        }
                        if (num != null) {
                            r1 = new a0c0(String.valueOf(num.intValue()), num);
                        }
                        c0c0Var = r1;
                    }
                    aVar = new SourceOnMapControl.a(c0c0Var, null, null, false, false, null, null, 2046);
                    point2 = point;
                    mtOverlayUiStateMapper$sourceMtPoint$1.L$0 = point2;
                    mtOverlayUiStateMapper$sourceMtPoint$1.L$1 = null;
                    mtOverlayUiStateMapper$sourceMtPoint$1.L$2 = null;
                    mtOverlayUiStateMapper$sourceMtPoint$1.L$3 = i1c0Var2;
                    mtOverlayUiStateMapper$sourceMtPoint$1.L$4 = null;
                    mtOverlayUiStateMapper$sourceMtPoint$1.L$5 = aVar;
                    mtOverlayUiStateMapper$sourceMtPoint$1.F$0 = f;
                    mtOverlayUiStateMapper$sourceMtPoint$1.label = 1;
                    Object e = e(mtOverlayUiStateMapper$sourceMtPoint$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i1c0Var = i1c0Var2;
                    obj = e;
                    f2 = f;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = mtOverlayUiStateMapper$sourceMtPoint$1.F$0;
                    SourceOnMapControl.a aVar2 = (SourceOnMapControl.a) mtOverlayUiStateMapper$sourceMtPoint$1.L$5;
                    i1c0Var = (i1c0) mtOverlayUiStateMapper$sourceMtPoint$1.L$3;
                    Point point3 = (Point) mtOverlayUiStateMapper$sourceMtPoint$1.L$0;
                    kotlin.b.b(obj);
                    aVar = aVar2;
                    point2 = point3;
                }
                bl00 a = com.yandex.go.pin.api.v2.d.a((PinV2Component) obj, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
                return new ds30(new bl00(a.a, a.b.setZIndex(new Float(f2))), point2);
            }
        }
        mtOverlayUiStateMapper$sourceMtPoint$1 = new MtOverlayUiStateMapper$sourceMtPoint$1(this, continuationImpl);
        Object obj2 = mtOverlayUiStateMapper$sourceMtPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayUiStateMapper$sourceMtPoint$1.label;
        if (i != 0) {
        }
        bl00 a2 = com.yandex.go.pin.api.v2.d.a((PinV2Component) obj2, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
        return new ds30(new bl00(a2.a, a2.b.setZIndex(new Float(f2))), point2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(CharSequence charSequence, IconStyle iconStyle, ContinuationImpl continuationImpl) {
        MtOverlayUiStateMapper$toLabelImage$1 mtOverlayUiStateMapper$toLabelImage$1;
        int i;
        MtLabelView mtLabelView;
        if (continuationImpl instanceof MtOverlayUiStateMapper$toLabelImage$1) {
            mtOverlayUiStateMapper$toLabelImage$1 = (MtOverlayUiStateMapper$toLabelImage$1) continuationImpl;
            int i2 = mtOverlayUiStateMapper$toLabelImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayUiStateMapper$toLabelImage$1.label = i2 - Integer.MIN_VALUE;
                MtOverlayUiStateMapper$toLabelImage$1 mtOverlayUiStateMapper$toLabelImage$12 = mtOverlayUiStateMapper$toLabelImage$1;
                Object obj = mtOverlayUiStateMapper$toLabelImage$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayUiStateMapper$toLabelImage$12.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int u = tje.u(8, context);
                    hgr0 hgr0Var = new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom));
                    mtOverlayUiStateMapper$toLabelImage$12.L$0 = charSequence;
                    mtOverlayUiStateMapper$toLabelImage$12.L$1 = iconStyle;
                    mtOverlayUiStateMapper$toLabelImage$12.label = 1;
                    obj = ru.yandex.taxi.design.utils.b.e(this.b, u, hgr0Var, false, mtOverlayUiStateMapper$toLabelImage$12, 12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iconStyle = (IconStyle) mtOverlayUiStateMapper$toLabelImage$12.L$1;
                    charSequence = (CharSequence) mtOverlayUiStateMapper$toLabelImage$12.L$0;
                    kotlin.b.b(obj);
                }
                Drawable drawable = (Drawable) obj;
                mtLabelView = this.i;
                if (mtLabelView == null) {
                    mtLabelView = new MtLabelView(context);
                    this.i = mtLabelView;
                }
                mtLabelView.render(charSequence, drawable);
                xw31.r(mtLabelView);
                return new bl00(ImageProvider.fromBitmap(xw31.t(mtLabelView)), iconStyle);
            }
        }
        mtOverlayUiStateMapper$toLabelImage$1 = new MtOverlayUiStateMapper$toLabelImage$1(this, continuationImpl);
        MtOverlayUiStateMapper$toLabelImage$1 mtOverlayUiStateMapper$toLabelImage$122 = mtOverlayUiStateMapper$toLabelImage$1;
        Object obj2 = mtOverlayUiStateMapper$toLabelImage$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayUiStateMapper$toLabelImage$122.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        Drawable drawable2 = (Drawable) obj2;
        mtLabelView = this.i;
        if (mtLabelView == null) {
        }
        mtLabelView.render(charSequence, drawable2);
        xw31.r(mtLabelView);
        return new bl00(ImageProvider.fromBitmap(xw31.t(mtLabelView)), iconStyle);
    }
}
