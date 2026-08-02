package ru.yandex.taxi.masstransit.mapper;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.runtime.image.ImageProvider;
import defpackage.aqb1;
import defpackage.b3v0;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.bt11;
import defpackage.by30;
import defpackage.cwa1;
import defpackage.cy30;
import defpackage.dj40;
import defpackage.ds30;
import defpackage.fc30;
import defpackage.fh4;
import defpackage.fj40;
import defpackage.gdc;
import defpackage.h73;
import defpackage.hj40;
import defpackage.hz30;
import defpackage.j73;
import defpackage.jm30;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lj40;
import defpackage.ny61;
import defpackage.obm;
import defpackage.oyr;
import defpackage.pi30;
import defpackage.qm30;
import defpackage.r440;
import defpackage.s6b1;
import defpackage.s8o;
import defpackage.su30;
import defpackage.tje;
import defpackage.tm30;
import defpackage.tog0;
import defpackage.w1u;
import defpackage.xng0;
import defpackage.xob1;
import defpackage.yw01;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes6.dex */
public final class e {
    public final Context a;
    public final d b;

    public e(Context context, d dVar) {
        this.a = context;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, jm30 jm30Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        MtRoutesOverlayUiStateMapper$toIcons$1 mtRoutesOverlayUiStateMapper$toIcons$1;
        int i;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence h;
        List list;
        tm30 tm30Var;
        tm30 tm30Var2;
        List list2;
        jm30 jm30Var2 = jm30Var;
        boolean z3 = z;
        boolean z4 = z2;
        Context context = eVar.a;
        if (continuationImpl instanceof MtRoutesOverlayUiStateMapper$toIcons$1) {
            mtRoutesOverlayUiStateMapper$toIcons$1 = (MtRoutesOverlayUiStateMapper$toIcons$1) continuationImpl;
            int i2 = mtRoutesOverlayUiStateMapper$toIcons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRoutesOverlayUiStateMapper$toIcons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRoutesOverlayUiStateMapper$toIcons$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRoutesOverlayUiStateMapper$toIcons$1.label;
                tm30 tm30Var3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List j = eVar.j(jm30Var);
                    if (z3 && z4) {
                        return j;
                    }
                    w1u f = jm30Var2.f();
                    spannableStringBuilder = new SpannableStringBuilder();
                    dj40 dj40Var = f.d;
                    String str = f.a;
                    eVar.d(spannableStringBuilder, dj40Var.b);
                    spannableStringBuilder.append(" ");
                    if (jm30Var2.b) {
                        StringBuilder v = oyr.v(str, " · ");
                        v.append(context.getResources().getText(kyh0.mt_routes_bus_express));
                        h = fh4.j(context, v.toString(), new gdc(tog0.mt_aeroexpress_color), new bdc(xng0.everFront), tje.w(120, context));
                    } else {
                        h = fh4.h(context, str, jm30Var2.e, new bdc(xng0.everFront));
                    }
                    spannableStringBuilder.append(h);
                    if (!z3) {
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$0 = jm30Var2;
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$1 = j;
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$2 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$3 = spannableStringBuilder;
                        mtRoutesOverlayUiStateMapper$toIcons$1.Z$0 = z3;
                        mtRoutesOverlayUiStateMapper$toIcons$1.Z$1 = z4;
                        mtRoutesOverlayUiStateMapper$toIcons$1.label = 1;
                        Object i3 = eVar.i(jm30Var2, spannableStringBuilder, mtRoutesOverlayUiStateMapper$toIcons$1);
                        if (i3 != obj2) {
                            list = j;
                            obj = i3;
                        }
                        return obj2;
                    }
                    list = j;
                    tm30Var = null;
                    if (!z4) {
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$0 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$1 = list;
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$2 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$3 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$1.L$4 = tm30Var;
                        mtRoutesOverlayUiStateMapper$toIcons$1.Z$0 = z3;
                        mtRoutesOverlayUiStateMapper$toIcons$1.Z$1 = z4;
                        mtRoutesOverlayUiStateMapper$toIcons$1.label = 2;
                        Object f2 = eVar.f(jm30Var2, spannableStringBuilder, mtRoutesOverlayUiStateMapper$toIcons$1);
                        if (f2 != obj2) {
                            tm30 tm30Var4 = tm30Var;
                            obj = f2;
                            tm30Var2 = tm30Var4;
                            list2 = list;
                            tm30Var3 = (tm30) obj;
                            tm30Var = tm30Var2;
                            list = list2;
                        }
                        return obj2;
                    }
                    return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tm30Var2 = (tm30) mtRoutesOverlayUiStateMapper$toIcons$1.L$4;
                    list2 = (List) mtRoutesOverlayUiStateMapper$toIcons$1.L$1;
                    kotlin.b.b(obj);
                    tm30Var3 = (tm30) obj;
                    tm30Var = tm30Var2;
                    list = list2;
                    return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
                }
                boolean z5 = mtRoutesOverlayUiStateMapper$toIcons$1.Z$1;
                z3 = mtRoutesOverlayUiStateMapper$toIcons$1.Z$0;
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) mtRoutesOverlayUiStateMapper$toIcons$1.L$3;
                list = (List) mtRoutesOverlayUiStateMapper$toIcons$1.L$1;
                jm30 jm30Var3 = (jm30) mtRoutesOverlayUiStateMapper$toIcons$1.L$0;
                kotlin.b.b(obj);
                spannableStringBuilder = spannableStringBuilder2;
                z4 = z5;
                jm30Var2 = jm30Var3;
                tm30Var = (tm30) obj;
                if (!z4) {
                }
                return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
            }
        }
        mtRoutesOverlayUiStateMapper$toIcons$1 = new MtRoutesOverlayUiStateMapper$toIcons$1(eVar, continuationImpl);
        Object obj3 = mtRoutesOverlayUiStateMapper$toIcons$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRoutesOverlayUiStateMapper$toIcons$1.label;
        tm30 tm30Var32 = null;
        if (i != 0) {
        }
        tm30Var = (tm30) obj3;
        if (!z4) {
        }
        return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var32}));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, r440 r440Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        MtRoutesOverlayUiStateMapper$toIcons$2 mtRoutesOverlayUiStateMapper$toIcons$2;
        int i;
        SpannableStringBuilder spannableStringBuilder;
        List list;
        tm30 tm30Var;
        CharSequence h;
        tm30 tm30Var2;
        List list2;
        r440 r440Var2 = r440Var;
        boolean z3 = z;
        boolean z4 = z2;
        Context context = eVar.a;
        if (continuationImpl instanceof MtRoutesOverlayUiStateMapper$toIcons$2) {
            mtRoutesOverlayUiStateMapper$toIcons$2 = (MtRoutesOverlayUiStateMapper$toIcons$2) continuationImpl;
            int i2 = mtRoutesOverlayUiStateMapper$toIcons$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRoutesOverlayUiStateMapper$toIcons$2.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRoutesOverlayUiStateMapper$toIcons$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRoutesOverlayUiStateMapper$toIcons$2.label;
                tm30 tm30Var3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List j = eVar.j(r440Var);
                    if (z3 && z4) {
                        return j;
                    }
                    b3v0 f = r440Var2.f();
                    kdc kdcVar = r440Var2.d;
                    bdc bdcVar = new bdc(xng0.everFront);
                    spannableStringBuilder = new SpannableStringBuilder();
                    eVar.d(spannableStringBuilder, f.b);
                    spannableStringBuilder.append(" ");
                    CharSequence b = s6b1.b(r440Var2, context);
                    if (b == null) {
                        MtTransportType mtTransportType = f.b;
                        if (mtTransportType == MtTransportType.AEROEXPRESS) {
                            h = fh4.j(context, context.getString(kyh0.mt_routes_aeroexpress), kdcVar, bdcVar, tje.w(120, context));
                        } else if (!aqb1.c(mtTransportType)) {
                            h = fh4.h(context, f.a, kdcVar, bdcVar);
                        } else if (f.e) {
                            h = fh4.j(context, context.getString(kyh0.mt_routes_aeroexpress), kdcVar, bdcVar, tje.w(120, context));
                        } else {
                            TransportContour transportContour = f.g;
                            h = transportContour != null ? fh4.i(context, transportContour.getName(), kdcVar, bdcVar) : fh4.j(context, context.getString(kyh0.mt_routes_suburban), kdcVar, bdcVar, tje.w(120, context));
                        }
                        spannableStringBuilder.append(h);
                    } else {
                        spannableStringBuilder.append(b);
                    }
                    if (!z3) {
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$0 = r440Var2;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$1 = j;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$2 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$3 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$4 = spannableStringBuilder;
                        mtRoutesOverlayUiStateMapper$toIcons$2.Z$0 = z3;
                        mtRoutesOverlayUiStateMapper$toIcons$2.Z$1 = z4;
                        mtRoutesOverlayUiStateMapper$toIcons$2.label = 1;
                        Object i3 = eVar.i(r440Var2, spannableStringBuilder, mtRoutesOverlayUiStateMapper$toIcons$2);
                        if (i3 != obj2) {
                            list = j;
                            obj = i3;
                        }
                        return obj2;
                    }
                    list = j;
                    tm30Var = null;
                    if (!z4) {
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$0 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$1 = list;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$2 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$3 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$4 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$2.L$5 = tm30Var;
                        mtRoutesOverlayUiStateMapper$toIcons$2.Z$0 = z3;
                        mtRoutesOverlayUiStateMapper$toIcons$2.Z$1 = z4;
                        mtRoutesOverlayUiStateMapper$toIcons$2.label = 2;
                        Object f2 = eVar.f(r440Var2, spannableStringBuilder, mtRoutesOverlayUiStateMapper$toIcons$2);
                        if (f2 != obj2) {
                            tm30 tm30Var4 = tm30Var;
                            obj = f2;
                            tm30Var2 = tm30Var4;
                            list2 = list;
                            tm30Var3 = (tm30) obj;
                            tm30Var = tm30Var2;
                            list = list2;
                        }
                        return obj2;
                    }
                    return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tm30Var2 = (tm30) mtRoutesOverlayUiStateMapper$toIcons$2.L$5;
                    list2 = (List) mtRoutesOverlayUiStateMapper$toIcons$2.L$1;
                    kotlin.b.b(obj);
                    tm30Var3 = (tm30) obj;
                    tm30Var = tm30Var2;
                    list = list2;
                    return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
                }
                boolean z5 = mtRoutesOverlayUiStateMapper$toIcons$2.Z$1;
                z3 = mtRoutesOverlayUiStateMapper$toIcons$2.Z$0;
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) mtRoutesOverlayUiStateMapper$toIcons$2.L$4;
                list = (List) mtRoutesOverlayUiStateMapper$toIcons$2.L$1;
                r440 r440Var3 = (r440) mtRoutesOverlayUiStateMapper$toIcons$2.L$0;
                kotlin.b.b(obj);
                spannableStringBuilder = spannableStringBuilder2;
                z4 = z5;
                r440Var2 = r440Var3;
                tm30Var = (tm30) obj;
                if (!z4) {
                }
                return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
            }
        }
        mtRoutesOverlayUiStateMapper$toIcons$2 = new MtRoutesOverlayUiStateMapper$toIcons$2(eVar, continuationImpl);
        Object obj3 = mtRoutesOverlayUiStateMapper$toIcons$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRoutesOverlayUiStateMapper$toIcons$2.label;
        tm30 tm30Var32 = null;
        if (i != 0) {
        }
        tm30Var = (tm30) obj3;
        if (!z4) {
        }
        return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var32}));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, lj40 lj40Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        MtRoutesOverlayUiStateMapper$toIcons$3 mtRoutesOverlayUiStateMapper$toIcons$3;
        int i;
        Drawable mutate;
        SpannableStringBuilder spannableStringBuilder;
        List list;
        tm30 tm30Var;
        tm30 tm30Var2;
        List list2;
        lj40 lj40Var2 = lj40Var;
        boolean z3 = z;
        boolean z4 = z2;
        Context context = eVar.a;
        if (continuationImpl instanceof MtRoutesOverlayUiStateMapper$toIcons$3) {
            mtRoutesOverlayUiStateMapper$toIcons$3 = (MtRoutesOverlayUiStateMapper$toIcons$3) continuationImpl;
            int i2 = mtRoutesOverlayUiStateMapper$toIcons$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRoutesOverlayUiStateMapper$toIcons$3.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRoutesOverlayUiStateMapper$toIcons$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRoutesOverlayUiStateMapper$toIcons$3.label;
                tm30 tm30Var3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List j = eVar.j(lj40Var);
                    if (z3 && z4) {
                        return j;
                    }
                    Integer c = xob1.c(lj40Var2.b);
                    if (c != null) {
                        mutate = tje.y(c.intValue(), context);
                    } else {
                        mutate = tje.y(xob1.b(lj40Var2.g), context).mutate();
                        mutate.setTint(s8o.m(new bdc(xng0.textMinor), context));
                    }
                    Drawable drawable = mutate;
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(" ", new CustomImageSpan(drawable, 2, false, false, null, 28, null), 33);
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append(fh4.h(context, lj40Var2.c, lj40Var2.h, new bdc(xng0.everFront)));
                    if (!z3) {
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$0 = lj40Var2;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$1 = j;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$2 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$3 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$4 = spannableStringBuilder;
                        mtRoutesOverlayUiStateMapper$toIcons$3.Z$0 = z3;
                        mtRoutesOverlayUiStateMapper$toIcons$3.Z$1 = z4;
                        mtRoutesOverlayUiStateMapper$toIcons$3.label = 1;
                        Object i3 = eVar.i(lj40Var2, spannableStringBuilder, mtRoutesOverlayUiStateMapper$toIcons$3);
                        if (i3 != obj2) {
                            list = j;
                            obj = i3;
                        }
                        return obj2;
                    }
                    list = j;
                    tm30Var = null;
                    if (!z4) {
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$0 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$1 = list;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$2 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$3 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$4 = null;
                        mtRoutesOverlayUiStateMapper$toIcons$3.L$5 = tm30Var;
                        mtRoutesOverlayUiStateMapper$toIcons$3.Z$0 = z3;
                        mtRoutesOverlayUiStateMapper$toIcons$3.Z$1 = z4;
                        mtRoutesOverlayUiStateMapper$toIcons$3.label = 2;
                        Object f = eVar.f(lj40Var2, spannableStringBuilder, mtRoutesOverlayUiStateMapper$toIcons$3);
                        if (f != obj2) {
                            tm30 tm30Var4 = tm30Var;
                            obj = f;
                            tm30Var2 = tm30Var4;
                            list2 = list;
                            tm30Var3 = (tm30) obj;
                            tm30Var = tm30Var2;
                            list = list2;
                        }
                        return obj2;
                    }
                    return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tm30Var2 = (tm30) mtRoutesOverlayUiStateMapper$toIcons$3.L$5;
                    list2 = (List) mtRoutesOverlayUiStateMapper$toIcons$3.L$1;
                    kotlin.b.b(obj);
                    tm30Var3 = (tm30) obj;
                    tm30Var = tm30Var2;
                    list = list2;
                    return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
                }
                boolean z5 = mtRoutesOverlayUiStateMapper$toIcons$3.Z$1;
                z3 = mtRoutesOverlayUiStateMapper$toIcons$3.Z$0;
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) mtRoutesOverlayUiStateMapper$toIcons$3.L$4;
                list = (List) mtRoutesOverlayUiStateMapper$toIcons$3.L$1;
                lj40 lj40Var3 = (lj40) mtRoutesOverlayUiStateMapper$toIcons$3.L$0;
                kotlin.b.b(obj);
                z4 = z5;
                lj40Var2 = lj40Var3;
                spannableStringBuilder = spannableStringBuilder2;
                tm30Var = (tm30) obj;
                if (!z4) {
                }
                return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var3}));
            }
        }
        mtRoutesOverlayUiStateMapper$toIcons$3 = new MtRoutesOverlayUiStateMapper$toIcons$3(eVar, continuationImpl);
        Object obj3 = mtRoutesOverlayUiStateMapper$toIcons$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRoutesOverlayUiStateMapper$toIcons$3.label;
        tm30 tm30Var32 = null;
        if (i != 0) {
        }
        tm30Var = (tm30) obj3;
        if (!z4) {
        }
        return kotlin.collections.a.m0(list, j73.A(new tm30[]{tm30Var, tm30Var32}));
    }

    public final void d(SpannableStringBuilder spannableStringBuilder, MtTransportType mtTransportType) {
        int b = xob1.b(mtTransportType);
        Context context = this.a;
        Drawable mutate = tje.y(b, context).mutate();
        if (mtTransportType == MtTransportType.AEROEXPRESS) {
            mutate.setTint(s8o.m(xob1.a(mtTransportType), context));
        } else {
            mutate.setTint(s8o.m(new bdc(xng0.textMinor), context));
        }
        spannableStringBuilder.append(" ", new CustomImageSpan(mutate, 2, false, false, null, 28, null), 33);
    }

    public final tm30 e(Point point, kdc kdcVar) {
        return new tm30(point, new bl00(ImageProvider.fromBitmap(bt11.b(kdcVar, this.a)), new IconStyle().setAnchor(new PointF(0.5f, 0.5f))), qm30.a);
    }

    public final Object f(fj40 fj40Var, SpannableStringBuilder spannableStringBuilder, ContinuationImpl continuationImpl) {
        Point point;
        hj40 hj40Var = (hj40) kotlin.collections.a.b0(fj40Var.e());
        if (hj40Var == null || (point = hj40Var.d) == null) {
            return null;
        }
        return this.b.c(point, spannableStringBuilder, new IconStyle().setAnchor(new PointF(0.5f, 0.7f)).setZIndex(Float.valueOf(fj40Var.b())), qm30.a, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(DrivingRoute drivingRoute, ContinuationImpl continuationImpl) {
        MtRoutesOverlayUiStateMapper$mapDrivingRoute$1 mtRoutesOverlayUiStateMapper$mapDrivingRoute$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        DrivingRoute drivingRoute2;
        List<Point> list;
        Object a;
        ds30 ds30Var;
        DrivingRoute drivingRoute3;
        if (continuationImpl instanceof MtRoutesOverlayUiStateMapper$mapDrivingRoute$1) {
            mtRoutesOverlayUiStateMapper$mapDrivingRoute$1 = (MtRoutesOverlayUiStateMapper$mapDrivingRoute$1) continuationImpl;
            int i2 = mtRoutesOverlayUiStateMapper$mapDrivingRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRoutesOverlayUiStateMapper$mapDrivingRoute$1.label = i2 - Integer.MIN_VALUE;
                MtRoutesOverlayUiStateMapper$mapDrivingRoute$1 mtRoutesOverlayUiStateMapper$mapDrivingRoute$12 = mtRoutesOverlayUiStateMapper$mapDrivingRoute$1;
                Object obj = mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.label;
                ds30 ds30Var2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = 7;
                    if (drivingRoute == null) {
                        return new by30(ds30Var2, i3);
                    }
                    List<Point> points = drivingRoute.getGeometry().getPoints();
                    List<Point> list2 = points.size() > 1 ? points : null;
                    if (list2 == null) {
                        return new by30(ds30Var2, i3);
                    }
                    Point point = (Point) kotlin.collections.a.P(list2);
                    mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$0 = null;
                    mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$1 = drivingRoute;
                    mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$2 = list2;
                    mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.label = 1;
                    obj = this.b.f(point, 20.0f, null, null, mtRoutesOverlayUiStateMapper$mapDrivingRoute$12);
                    if (obj != coroutineSingletons) {
                        drivingRoute2 = drivingRoute;
                        list = list2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ds30Var = (ds30) mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$3;
                    drivingRoute3 = (DrivingRoute) mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$1;
                    kotlin.b.b(obj);
                    return new by30(ds30Var, (ds30) obj, drivingRoute3);
                }
                list = (List) mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$2;
                drivingRoute2 = (DrivingRoute) mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$1;
                kotlin.b.b(obj);
                ds30 ds30Var3 = (ds30) obj;
                Point point2 = (Point) kotlin.collections.a.Z(list);
                mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$0 = null;
                mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$1 = drivingRoute2;
                mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$2 = null;
                mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.L$3 = ds30Var3;
                mtRoutesOverlayUiStateMapper$mapDrivingRoute$12.label = 2;
                a = this.b.a(point2, 20.0f, mtRoutesOverlayUiStateMapper$mapDrivingRoute$12);
                if (a != coroutineSingletons) {
                    obj = a;
                    ds30Var = ds30Var3;
                    drivingRoute3 = drivingRoute2;
                    return new by30(ds30Var, (ds30) obj, drivingRoute3);
                }
                return coroutineSingletons;
            }
        }
        mtRoutesOverlayUiStateMapper$mapDrivingRoute$1 = new MtRoutesOverlayUiStateMapper$mapDrivingRoute$1(this, continuationImpl);
        MtRoutesOverlayUiStateMapper$mapDrivingRoute$1 mtRoutesOverlayUiStateMapper$mapDrivingRoute$122 = mtRoutesOverlayUiStateMapper$mapDrivingRoute$1;
        Object obj2 = mtRoutesOverlayUiStateMapper$mapDrivingRoute$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRoutesOverlayUiStateMapper$mapDrivingRoute$122.label;
        ds30 ds30Var22 = null;
        if (i != 0) {
        }
        ds30 ds30Var32 = (ds30) obj2;
        Point point22 = (Point) kotlin.collections.a.Z(list);
        mtRoutesOverlayUiStateMapper$mapDrivingRoute$122.L$0 = null;
        mtRoutesOverlayUiStateMapper$mapDrivingRoute$122.L$1 = drivingRoute2;
        mtRoutesOverlayUiStateMapper$mapDrivingRoute$122.L$2 = null;
        mtRoutesOverlayUiStateMapper$mapDrivingRoute$122.L$3 = ds30Var32;
        mtRoutesOverlayUiStateMapper$mapDrivingRoute$122.label = 2;
        a = this.b.a(point22, 20.0f, mtRoutesOverlayUiStateMapper$mapDrivingRoute$122);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        if (r14 == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(su30 su30Var, fc30 fc30Var, ContinuationImpl continuationImpl) {
        MtRoutesOverlayUiStateMapper$mapMtUiState$1 mtRoutesOverlayUiStateMapper$mapMtUiState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        float f;
        Object a;
        su30 su30Var2;
        ds30 ds30Var;
        float f2;
        ds30 ds30Var2;
        if (continuationImpl instanceof MtRoutesOverlayUiStateMapper$mapMtUiState$1) {
            mtRoutesOverlayUiStateMapper$mapMtUiState$1 = (MtRoutesOverlayUiStateMapper$mapMtUiState$1) continuationImpl;
            int i2 = mtRoutesOverlayUiStateMapper$mapMtUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRoutesOverlayUiStateMapper$mapMtUiState$1.label = i2 - Integer.MIN_VALUE;
                MtRoutesOverlayUiStateMapper$mapMtUiState$1 mtRoutesOverlayUiStateMapper$mapMtUiState$12 = mtRoutesOverlayUiStateMapper$mapMtUiState$1;
                Object obj = mtRoutesOverlayUiStateMapper$mapMtUiState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRoutesOverlayUiStateMapper$mapMtUiState$12.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (su30Var == null) {
                        return new cy30(0);
                    }
                    Iterator it = su30Var.a.iterator();
                    if (!it.hasNext()) {
                        ny61.p();
                        return null;
                    }
                    int b = ((hz30) it.next()).b();
                    while (it.hasNext()) {
                        int b2 = ((hz30) it.next()).b();
                        if (b < b2) {
                            b = b2;
                        }
                    }
                    f = b;
                    Point d = cwa1.d(su30Var.g.a.d);
                    obm obmVar = fc30Var.a;
                    Drawable drawable = obmVar != null ? obmVar.b : null;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$0 = su30Var;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$1 = null;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$2 = null;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.F$0 = f;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.label = 1;
                    obj = this.b.f(d, f, drawable, null, mtRoutesOverlayUiStateMapper$mapMtUiState$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ds30Var2 = (ds30) mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$5;
                            ds30Var = (ds30) mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$3;
                            kotlin.b.b(obj);
                            return new cy30(ds30Var, ds30Var2, (List) obj);
                        }
                        float f3 = mtRoutesOverlayUiStateMapper$mapMtUiState$12.F$0;
                        ds30 ds30Var3 = (ds30) mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$3;
                        su30Var2 = (su30) mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$0;
                        kotlin.b.b(obj);
                        f2 = f3;
                        ds30Var = ds30Var3;
                        ds30 ds30Var4 = (ds30) obj;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$0 = null;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$1 = null;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$2 = null;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$3 = ds30Var;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$4 = null;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$5 = ds30Var4;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.F$0 = f2;
                        mtRoutesOverlayUiStateMapper$mapMtUiState$12.label = 3;
                        List s = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new h73(i3, su30Var2.a), new pi30(18)), new pi30(19)));
                        obj = this.b.d(su30Var2.a, su30Var2.b, f2, new MtRoutesOverlayUiStateMapper$toOverlaySections$2((Integer) kotlin.collections.a.R(s), (Integer) kotlin.collections.a.b0(s), this, null), new MtRoutesOverlayUiStateMapper$toOverlaySections$3(this, null), mtRoutesOverlayUiStateMapper$mapMtUiState$12);
                        if (obj != coroutineSingletons) {
                            ds30Var2 = ds30Var4;
                            return new cy30(ds30Var, ds30Var2, (List) obj);
                        }
                        return coroutineSingletons;
                    }
                    float f4 = mtRoutesOverlayUiStateMapper$mapMtUiState$12.F$0;
                    su30 su30Var3 = (su30) mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$0;
                    kotlin.b.b(obj);
                    f = f4;
                    su30Var = su30Var3;
                }
                ds30 ds30Var5 = (ds30) obj;
                Point d2 = cwa1.d(su30Var.g.b.d);
                mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$0 = su30Var;
                mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$1 = null;
                mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$2 = null;
                mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$3 = ds30Var5;
                mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$4 = null;
                mtRoutesOverlayUiStateMapper$mapMtUiState$12.F$0 = f;
                mtRoutesOverlayUiStateMapper$mapMtUiState$12.label = 2;
                a = this.b.a(d2, f, mtRoutesOverlayUiStateMapper$mapMtUiState$12);
                if (a != coroutineSingletons) {
                    su30Var2 = su30Var;
                    ds30Var = ds30Var5;
                    f2 = f;
                    obj = a;
                    ds30 ds30Var42 = (ds30) obj;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$0 = null;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$1 = null;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$2 = null;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$3 = ds30Var;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$4 = null;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.L$5 = ds30Var42;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.F$0 = f2;
                    mtRoutesOverlayUiStateMapper$mapMtUiState$12.label = 3;
                    List s2 = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new h73(i3, su30Var2.a), new pi30(18)), new pi30(19)));
                    obj = this.b.d(su30Var2.a, su30Var2.b, f2, new MtRoutesOverlayUiStateMapper$toOverlaySections$2((Integer) kotlin.collections.a.R(s2), (Integer) kotlin.collections.a.b0(s2), this, null), new MtRoutesOverlayUiStateMapper$toOverlaySections$3(this, null), mtRoutesOverlayUiStateMapper$mapMtUiState$12);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mtRoutesOverlayUiStateMapper$mapMtUiState$1 = new MtRoutesOverlayUiStateMapper$mapMtUiState$1(this, continuationImpl);
        MtRoutesOverlayUiStateMapper$mapMtUiState$1 mtRoutesOverlayUiStateMapper$mapMtUiState$122 = mtRoutesOverlayUiStateMapper$mapMtUiState$1;
        Object obj2 = mtRoutesOverlayUiStateMapper$mapMtUiState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRoutesOverlayUiStateMapper$mapMtUiState$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        ds30 ds30Var52 = (ds30) obj2;
        Point d22 = cwa1.d(su30Var.g.b.d);
        mtRoutesOverlayUiStateMapper$mapMtUiState$122.L$0 = su30Var;
        mtRoutesOverlayUiStateMapper$mapMtUiState$122.L$1 = null;
        mtRoutesOverlayUiStateMapper$mapMtUiState$122.L$2 = null;
        mtRoutesOverlayUiStateMapper$mapMtUiState$122.L$3 = ds30Var52;
        mtRoutesOverlayUiStateMapper$mapMtUiState$122.L$4 = null;
        mtRoutesOverlayUiStateMapper$mapMtUiState$122.F$0 = f;
        mtRoutesOverlayUiStateMapper$mapMtUiState$122.label = 2;
        a = this.b.a(d22, f, mtRoutesOverlayUiStateMapper$mapMtUiState$122);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final Object i(fj40 fj40Var, SpannableStringBuilder spannableStringBuilder, ContinuationImpl continuationImpl) {
        Point point;
        hj40 hj40Var = (hj40) kotlin.collections.a.R(fj40Var.e());
        if (hj40Var == null || (point = hj40Var.d) == null) {
            return null;
        }
        return this.b.c(point, spannableStringBuilder, new IconStyle().setAnchor(new PointF(0.5f, 0.7f)).setZIndex(Float.valueOf(fj40Var.b())), qm30.a, continuationImpl);
    }

    public final List j(fj40 fj40Var) {
        Point point;
        Point point2;
        hj40 hj40Var = (hj40) kotlin.collections.a.R(fj40Var.e());
        tm30 tm30Var = null;
        tm30 e = (hj40Var == null || (point2 = hj40Var.d) == null) ? null : e(point2, fj40Var.a());
        hj40 hj40Var2 = (hj40) kotlin.collections.a.b0(fj40Var.e());
        if (hj40Var2 != null && (point = hj40Var2.d) != null) {
            tm30Var = e(point, fj40Var.a());
        }
        return j73.A(new tm30[]{e, tm30Var});
    }
}
