package ru.yandex.taxi.masstransit.mapper;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.runtime.image.ImageProvider;
import defpackage.aqb1;
import defpackage.b3v0;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.bt11;
import defpackage.c0c0;
import defpackage.e0h0;
import defpackage.ffx;
import defpackage.fh4;
import defpackage.fj40;
import defpackage.gdc;
import defpackage.h1c0;
import defpackage.hj40;
import defpackage.i1c0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jm30;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lj40;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.qm30;
import defpackage.r440;
import defpackage.s6b1;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sm30;
import defpackage.tje;
import defpackage.tm30;
import defpackage.tog0;
import defpackage.w1u;
import defpackage.xng0;
import defpackage.xob1;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class c {
    public final Context a;
    public final d b;
    public final ru.yandex.taxi.design.utils.b c;
    public PinV2Component d;

    public c(Context context, d dVar, ru.yandex.taxi.design.utils.b bVar) {
        this.a = context;
        this.b = dVar;
        this.c = bVar;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, MtTransportType mtTransportType) {
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

    public final tm30 b(Point point, boolean z, kdc kdcVar, sm30 sm30Var) {
        Context context = this.a;
        return z ? new tm30(point, new bl00(ImageProvider.fromBitmap(ffx.d0(tje.y(e0h0.ic_selected_stop_point, context), 0, 0, 7)), new IconStyle().setAnchor(new PointF(0.5f, 0.5f))), qm30.a) : new tm30(point, new bl00(ImageProvider.fromBitmap(bt11.b(kdcVar, context)), new IconStyle().setAnchor(new PointF(0.5f, 0.5f))), sm30Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(jm30 jm30Var, hj40 hj40Var, float f, sm30 sm30Var, ContinuationImpl continuationImpl) {
        MtOverlayLabelsMapper$groundIcons$1 mtOverlayLabelsMapper$groundIcons$1;
        int i;
        CharSequence h;
        List list;
        if (continuationImpl instanceof MtOverlayLabelsMapper$groundIcons$1) {
            mtOverlayLabelsMapper$groundIcons$1 = (MtOverlayLabelsMapper$groundIcons$1) continuationImpl;
            int i2 = mtOverlayLabelsMapper$groundIcons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayLabelsMapper$groundIcons$1.label = i2 - Integer.MIN_VALUE;
                MtOverlayLabelsMapper$groundIcons$1 mtOverlayLabelsMapper$groundIcons$12 = mtOverlayLabelsMapper$groundIcons$1;
                Object obj = mtOverlayLabelsMapper$groundIcons$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayLabelsMapper$groundIcons$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = jm30Var.i;
                    kdc kdcVar = jm30Var.e;
                    List d = d(list2, hj40Var, kdcVar, sm30Var);
                    w1u f2 = jm30Var.f();
                    boolean z = jm30Var.b;
                    Context context = this.a;
                    if (z) {
                        h = fh4.j(context, jm30Var.c + " · " + context.getString(kyh0.mt_routes_bus_express), new gdc(tog0.mt_aeroexpress_color), new bdc(xng0.everFront), tje.w(120, context));
                    } else {
                        h = fh4.h(context, f2.a, kdcVar, new bdc(xng0.everFront));
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    a(spannableStringBuilder, f2.d.b);
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append(h);
                    spannableStringBuilder.append(" ");
                    CharSequence c = bt11.c(jm30Var.a.size() - 1, context);
                    if (c != null) {
                        spannableStringBuilder.append(c);
                    }
                    MtTransportType mtTransportType = f2.d.b;
                    mtOverlayLabelsMapper$groundIcons$12.L$0 = null;
                    mtOverlayLabelsMapper$groundIcons$12.L$1 = null;
                    mtOverlayLabelsMapper$groundIcons$12.L$2 = null;
                    mtOverlayLabelsMapper$groundIcons$12.L$3 = null;
                    mtOverlayLabelsMapper$groundIcons$12.L$4 = d;
                    mtOverlayLabelsMapper$groundIcons$12.L$5 = null;
                    mtOverlayLabelsMapper$groundIcons$12.L$6 = null;
                    mtOverlayLabelsMapper$groundIcons$12.L$7 = null;
                    mtOverlayLabelsMapper$groundIcons$12.F$0 = f;
                    mtOverlayLabelsMapper$groundIcons$12.label = 1;
                    obj = f(jm30Var, hj40Var, spannableStringBuilder, mtTransportType, f, sm30Var, mtOverlayLabelsMapper$groundIcons$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = d;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) mtOverlayLabelsMapper$groundIcons$12.L$4;
                    kotlin.b.b(obj);
                }
                return kotlin.collections.a.m0(list, scc.h((tm30) obj));
            }
        }
        mtOverlayLabelsMapper$groundIcons$1 = new MtOverlayLabelsMapper$groundIcons$1(this, continuationImpl);
        MtOverlayLabelsMapper$groundIcons$1 mtOverlayLabelsMapper$groundIcons$122 = mtOverlayLabelsMapper$groundIcons$1;
        Object obj2 = mtOverlayLabelsMapper$groundIcons$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayLabelsMapper$groundIcons$122.label;
        if (i != 0) {
        }
        return kotlin.collections.a.m0(list, scc.h((tm30) obj2));
    }

    public final List d(List list, hj40 hj40Var, kdc kdcVar, sm30 sm30Var) {
        tm30 tm30Var;
        hj40 hj40Var2 = (hj40) kotlin.collections.a.R(list);
        tm30 tm30Var2 = null;
        if (hj40Var2 != null) {
            tm30Var = b(hj40Var2.d, jl40.l(hj40Var != null ? hj40Var.c : null, hj40Var2.c), kdcVar, sm30Var);
        } else {
            tm30Var = null;
        }
        hj40 hj40Var3 = (hj40) kotlin.collections.a.b0(list);
        if (hj40Var3 != null) {
            tm30Var2 = b(hj40Var3.d, jl40.l(hj40Var != null ? hj40Var.c : null, hj40Var3.c), kdcVar, sm30Var);
        }
        return j73.A(new tm30[]{tm30Var, tm30Var2});
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Point point, MtTransportType mtTransportType, float f, ContinuationImpl continuationImpl) {
        MtOverlayLabelsMapper$selectedStopIcon$1 mtOverlayLabelsMapper$selectedStopIcon$1;
        int i;
        Point point2;
        Object obj;
        float f2;
        i1c0 i1c0Var;
        SourceOnMapControl.a aVar;
        if (continuationImpl instanceof MtOverlayLabelsMapper$selectedStopIcon$1) {
            mtOverlayLabelsMapper$selectedStopIcon$1 = (MtOverlayLabelsMapper$selectedStopIcon$1) continuationImpl;
            int i2 = mtOverlayLabelsMapper$selectedStopIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayLabelsMapper$selectedStopIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtOverlayLabelsMapper$selectedStopIcon$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayLabelsMapper$selectedStopIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int e = xob1.e(mtTransportType);
                    Context context = this.a;
                    Drawable y = tje.y(e, context);
                    i1c0 i1c0Var2 = new i1c0(context.getColor(mqg0.white), context.getColor(tog0.mt_selected_stop_color));
                    SourceOnMapControl.a aVar2 = new SourceOnMapControl.a(new c0c0(y), null, null, false, false, null, null, 2046);
                    point2 = point;
                    mtOverlayLabelsMapper$selectedStopIcon$1.L$0 = point2;
                    mtOverlayLabelsMapper$selectedStopIcon$1.L$1 = null;
                    mtOverlayLabelsMapper$selectedStopIcon$1.L$2 = null;
                    mtOverlayLabelsMapper$selectedStopIcon$1.L$3 = i1c0Var2;
                    mtOverlayLabelsMapper$selectedStopIcon$1.L$4 = aVar2;
                    mtOverlayLabelsMapper$selectedStopIcon$1.F$0 = f;
                    mtOverlayLabelsMapper$selectedStopIcon$1.label = 1;
                    Object g = g(mtOverlayLabelsMapper$selectedStopIcon$1);
                    if (g == obj3) {
                        return obj3;
                    }
                    obj = g;
                    f2 = f;
                    i1c0Var = i1c0Var2;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = mtOverlayLabelsMapper$selectedStopIcon$1.F$0;
                    aVar = (SourceOnMapControl.a) mtOverlayLabelsMapper$selectedStopIcon$1.L$4;
                    i1c0Var = (i1c0) mtOverlayLabelsMapper$selectedStopIcon$1.L$3;
                    Point point3 = (Point) mtOverlayLabelsMapper$selectedStopIcon$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    point2 = point3;
                }
                bl00 a = com.yandex.go.pin.api.v2.d.a((PinV2Component) obj, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
                return new tm30(point2, new bl00(a.a, a.b.setZIndex(new Float(f2))), qm30.a);
            }
        }
        mtOverlayLabelsMapper$selectedStopIcon$1 = new MtOverlayLabelsMapper$selectedStopIcon$1(this, continuationImpl);
        Object obj22 = mtOverlayLabelsMapper$selectedStopIcon$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayLabelsMapper$selectedStopIcon$1.label;
        if (i != 0) {
        }
        bl00 a2 = com.yandex.go.pin.api.v2.d.a((PinV2Component) obj, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
        return new tm30(point2, new bl00(a2.a, a2.b.setZIndex(new Float(f2))), qm30.a);
    }

    public final Object f(fj40 fj40Var, hj40 hj40Var, SpannableStringBuilder spannableStringBuilder, MtTransportType mtTransportType, float f, sm30 sm30Var, ContinuationImpl continuationImpl) {
        hj40 hj40Var2 = (hj40) kotlin.collections.a.R(fj40Var.e());
        if (hj40Var2 == null) {
            return null;
        }
        if (jl40.l(hj40Var != null ? hj40Var.c : null, hj40Var2.c)) {
            Object e = e(hj40Var.d, mtTransportType, f, continuationImpl);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : (tm30) e;
        }
        Object c = this.b.c(hj40Var2.d, spannableStringBuilder, new IconStyle().setAnchor(new PointF(0.5f, 0.7f)).setZIndex(Float.valueOf(fj40Var.b())), sm30Var, continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : (tm30) c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        MtOverlayLabelsMapper$stopPin$1 mtOverlayLabelsMapper$stopPin$1;
        int i;
        Context context;
        if (continuationImpl instanceof MtOverlayLabelsMapper$stopPin$1) {
            mtOverlayLabelsMapper$stopPin$1 = (MtOverlayLabelsMapper$stopPin$1) continuationImpl;
            int i2 = mtOverlayLabelsMapper$stopPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayLabelsMapper$stopPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtOverlayLabelsMapper$stopPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayLabelsMapper$stopPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PinV2Component pinV2Component = this.d;
                    if (pinV2Component != null) {
                        return pinV2Component;
                    }
                    mtOverlayLabelsMapper$stopPin$1.L$0 = null;
                    Context context2 = this.a;
                    mtOverlayLabelsMapper$stopPin$1.L$1 = context2;
                    mtOverlayLabelsMapper$stopPin$1.label = 1;
                    Object c = this.c.c(mtOverlayLabelsMapper$stopPin$1);
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
                    context = (Context) mtOverlayLabelsMapper$stopPin$1.L$1;
                    kotlin.b.b(obj);
                }
                PinV2Component pinV2Component2 = new PinV2Component(context, (h1c0) obj);
                this.d = pinV2Component2;
                return pinV2Component2;
            }
        }
        mtOverlayLabelsMapper$stopPin$1 = new MtOverlayLabelsMapper$stopPin$1(this, continuationImpl);
        Object obj2 = mtOverlayLabelsMapper$stopPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayLabelsMapper$stopPin$1.label;
        if (i != 0) {
        }
        PinV2Component pinV2Component22 = new PinV2Component(context, (h1c0) obj2);
        this.d = pinV2Component22;
        return pinV2Component22;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(r440 r440Var, hj40 hj40Var, float f, sm30 sm30Var, ContinuationImpl continuationImpl) {
        MtOverlayLabelsMapper$suburbanIcons$1 mtOverlayLabelsMapper$suburbanIcons$1;
        int i;
        List list;
        CharSequence h;
        if (continuationImpl instanceof MtOverlayLabelsMapper$suburbanIcons$1) {
            mtOverlayLabelsMapper$suburbanIcons$1 = (MtOverlayLabelsMapper$suburbanIcons$1) continuationImpl;
            int i2 = mtOverlayLabelsMapper$suburbanIcons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayLabelsMapper$suburbanIcons$1.label = i2 - Integer.MIN_VALUE;
                MtOverlayLabelsMapper$suburbanIcons$1 mtOverlayLabelsMapper$suburbanIcons$12 = mtOverlayLabelsMapper$suburbanIcons$1;
                Object obj = mtOverlayLabelsMapper$suburbanIcons$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayLabelsMapper$suburbanIcons$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = r440Var.h;
                    kdc kdcVar = r440Var.d;
                    List d = d(list2, hj40Var, kdcVar, sm30Var);
                    b3v0 f2 = r440Var.f();
                    MtTransportType mtTransportType = f2.b;
                    bdc bdcVar = new bdc(xng0.everFront);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    a(spannableStringBuilder, mtTransportType);
                    spannableStringBuilder.append(" ");
                    Context context = this.a;
                    CharSequence b = s6b1.b(r440Var, context);
                    if (b == null) {
                        MtTransportType mtTransportType2 = f2.b;
                        if (mtTransportType2 == MtTransportType.AEROEXPRESS) {
                            h = fh4.j(context, context.getString(kyh0.mt_routes_aeroexpress), kdcVar, bdcVar, tje.w(120, context));
                        } else if (!aqb1.c(mtTransportType2)) {
                            h = fh4.h(context, f2.a, kdcVar, bdcVar);
                        } else if (f2.e) {
                            h = fh4.j(context, context.getString(kyh0.mt_routes_aeroexpress), kdcVar, bdcVar, tje.w(120, context));
                        } else {
                            TransportContour transportContour = f2.g;
                            if (transportContour != null) {
                                String name = transportContour.getName();
                                if (name == null) {
                                    name = "";
                                }
                                h = fh4.i(context, name, kdcVar, bdcVar);
                            } else {
                                h = fh4.j(context, context.getString(kyh0.mt_routes_suburban), kdcVar, bdcVar, tje.w(120, context));
                            }
                        }
                        spannableStringBuilder.append(h);
                    } else {
                        spannableStringBuilder.append(b);
                    }
                    MtTransportType mtTransportType3 = f2.b;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$0 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$1 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$2 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$3 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$4 = d;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$5 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$6 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$7 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.L$8 = null;
                    mtOverlayLabelsMapper$suburbanIcons$12.F$0 = f;
                    mtOverlayLabelsMapper$suburbanIcons$12.label = 1;
                    obj = f(r440Var, hj40Var, spannableStringBuilder, mtTransportType3, f, sm30Var, mtOverlayLabelsMapper$suburbanIcons$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = d;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) mtOverlayLabelsMapper$suburbanIcons$12.L$4;
                    kotlin.b.b(obj);
                }
                return kotlin.collections.a.m0(list, scc.h((tm30) obj));
            }
        }
        mtOverlayLabelsMapper$suburbanIcons$1 = new MtOverlayLabelsMapper$suburbanIcons$1(this, continuationImpl);
        MtOverlayLabelsMapper$suburbanIcons$1 mtOverlayLabelsMapper$suburbanIcons$122 = mtOverlayLabelsMapper$suburbanIcons$1;
        Object obj2 = mtOverlayLabelsMapper$suburbanIcons$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayLabelsMapper$suburbanIcons$122.label;
        if (i != 0) {
        }
        return kotlin.collections.a.m0(list, scc.h((tm30) obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(lj40 lj40Var, hj40 hj40Var, float f, sm30 sm30Var, ContinuationImpl continuationImpl) {
        MtOverlayLabelsMapper$undergroundSection$1 mtOverlayLabelsMapper$undergroundSection$1;
        int i;
        Drawable mutate;
        List list;
        if (continuationImpl instanceof MtOverlayLabelsMapper$undergroundSection$1) {
            mtOverlayLabelsMapper$undergroundSection$1 = (MtOverlayLabelsMapper$undergroundSection$1) continuationImpl;
            int i2 = mtOverlayLabelsMapper$undergroundSection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayLabelsMapper$undergroundSection$1.label = i2 - Integer.MIN_VALUE;
                MtOverlayLabelsMapper$undergroundSection$1 mtOverlayLabelsMapper$undergroundSection$12 = mtOverlayLabelsMapper$undergroundSection$1;
                Object obj = mtOverlayLabelsMapper$undergroundSection$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayLabelsMapper$undergroundSection$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = lj40Var.l;
                    kdc kdcVar = lj40Var.h;
                    List d = d(list2, hj40Var, kdcVar, sm30Var);
                    Integer c = xob1.c(lj40Var.b);
                    Context context = this.a;
                    if (c != null) {
                        mutate = tje.y(c.intValue(), context);
                    } else {
                        mutate = tje.y(xob1.b(lj40Var.g), context).mutate();
                        mutate.setTint(s8o.m(new bdc(xng0.textMinor), context));
                    }
                    Object customImageSpan = new CustomImageSpan(mutate, 2, false, false, null, 28, null);
                    CharSequence h = fh4.h(context, lj40Var.c, kdcVar, new bdc(xng0.everFront));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(" ", customImageSpan, 33);
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append(h);
                    MtTransportType mtTransportType = lj40Var.g;
                    mtOverlayLabelsMapper$undergroundSection$12.L$0 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$1 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$2 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$3 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$4 = d;
                    mtOverlayLabelsMapper$undergroundSection$12.L$5 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$6 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$7 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$8 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.L$9 = null;
                    mtOverlayLabelsMapper$undergroundSection$12.F$0 = f;
                    mtOverlayLabelsMapper$undergroundSection$12.label = 1;
                    obj = f(lj40Var, hj40Var, spannableStringBuilder, mtTransportType, f, sm30Var, mtOverlayLabelsMapper$undergroundSection$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = d;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) mtOverlayLabelsMapper$undergroundSection$12.L$4;
                    kotlin.b.b(obj);
                }
                return kotlin.collections.a.m0(list, scc.h((tm30) obj));
            }
        }
        mtOverlayLabelsMapper$undergroundSection$1 = new MtOverlayLabelsMapper$undergroundSection$1(this, continuationImpl);
        MtOverlayLabelsMapper$undergroundSection$1 mtOverlayLabelsMapper$undergroundSection$122 = mtOverlayLabelsMapper$undergroundSection$1;
        Object obj2 = mtOverlayLabelsMapper$undergroundSection$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayLabelsMapper$undergroundSection$122.label;
        if (i != 0) {
        }
        return kotlin.collections.a.m0(list, scc.h((tm30) obj2));
    }
}
