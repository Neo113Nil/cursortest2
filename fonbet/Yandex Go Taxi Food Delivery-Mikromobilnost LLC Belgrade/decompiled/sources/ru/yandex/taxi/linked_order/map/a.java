package ru.yandex.taxi.linked_order.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import defpackage.bl00;
import defpackage.doy;
import defpackage.f4c0;
import defpackage.foy;
import defpackage.g20;
import defpackage.h8l0;
import defpackage.hoy;
import defpackage.jl40;
import defpackage.kiq0;
import defpackage.ny61;
import defpackage.ool0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.vwn;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.xm00;
import defpackage.yoy;
import defpackage.yq00;
import defpackage.zy11;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements foy {
    public final tls a;
    public final IconStyle b;
    public final f4c0 c;
    public final f4c0 w;
    public final f4c0 x;
    public final w4e0 y;
    public final /* synthetic */ b z;

    public a(b bVar, xm00 xm00Var, tls tlsVar) {
        w4e0 s;
        this.z = bVar;
        this.a = tlsVar;
        IconStyle iconStyle = new IconStyle();
        iconStyle.setRotationType(RotationType.ROTATE);
        this.b = iconStyle;
        hoy hoyVar = bVar.c;
        this.c = h(this, xm00Var, 6.0f, new LinkedOrderMapOverlay$MvpImpl$carObject$1(0, hoyVar, hoy.class, "onCarObjectTap", "onCarObjectTap()V", 0), iconStyle, 8);
        this.w = h(this, xm00Var, 7.0f, new LinkedOrderMapOverlay$MvpImpl$sourceObject$1(0, hoyVar, hoy.class, "onSourceObjectTap", "onSourceObjectTap()V", 0), null, 24);
        this.x = h(this, xm00Var, 7.0f, new LinkedOrderMapOverlay$MvpImpl$destinationObject$1(0, hoyVar, hoy.class, "onDestinationObjectTap", "onDestinationObjectTap()V", 0), null, 24);
        Polyline i = ru.yandex.taxi.map_common.map.k.i(scc.g(new Point(), new Point()));
        if (i == null) {
            s = null;
        } else {
            s = xm00Var.s(i);
            s.k(5.0f);
        }
        this.y = s;
    }

    public static f4c0 h(a aVar, xm00 xm00Var, float f, sls slsVar, IconStyle iconStyle, int i) {
        if ((i & 16) != 0) {
            iconStyle = null;
        }
        f4c0 r = xm00Var.r(new Point(0.0d, 0.0d));
        r.i(false);
        r.k(f);
        if (iconStyle != null) {
            r.D(iconStyle);
        }
        r.g(new doy(0, slsVar));
        return r;
    }

    @Override // defpackage.foy
    public final void Ld(boolean z) {
        this.a.invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.foy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Zb(yq00 yq00Var, Continuation continuation) {
        LinkedOrderMapOverlay$MvpImpl$updatePointsStyle$1 linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        bl00 bl00Var;
        if (continuation instanceof LinkedOrderMapOverlay$MvpImpl$updatePointsStyle$1) {
            linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1 = (LinkedOrderMapOverlay$MvpImpl$updatePointsStyle$1) continuation;
            int i2 = linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.L$0 = yq00Var;
                    linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.label = 1;
                    obj = yq00Var.b(linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bl00Var = (bl00) linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.L$1;
                        kotlin.b.b(obj);
                        bl00 bl00Var2 = (bl00) obj;
                        this.w.z(bl00Var.a, bl00Var.b);
                        this.x.z(bl00Var2.a, bl00Var2.b);
                        return zy11.a;
                    }
                    yq00Var = (yq00) linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.L$0;
                    kotlin.b.b(obj);
                }
                bl00 bl00Var3 = (bl00) obj;
                linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.L$0 = null;
                linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.L$1 = bl00Var3;
                linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.label = 2;
                a = yq00Var.a(linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1);
                if (a != coroutineSingletons) {
                    obj = a;
                    bl00Var = bl00Var3;
                    bl00 bl00Var22 = (bl00) obj;
                    this.w.z(bl00Var.a, bl00Var.b);
                    this.x.z(bl00Var22.a, bl00Var22.b);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1 = new LinkedOrderMapOverlay$MvpImpl$updatePointsStyle$1(this, continuation);
        Object obj2 = linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.label;
        if (i != 0) {
        }
        bl00 bl00Var32 = (bl00) obj2;
        linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.L$0 = null;
        linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.L$1 = bl00Var32;
        linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1.label = 2;
        a = yq00Var.a(linkedOrderMapOverlay$MvpImpl$updatePointsStyle$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // defpackage.foy
    public final void a4(yoy yoyVar) {
        boolean l = jl40.l(yoyVar, vwn.a);
        w4e0 w4e0Var = this.y;
        if (l) {
            if (w4e0Var != null) {
                w4e0Var.i(false);
                return;
            }
            return;
        }
        if (!(yoyVar instanceof g20)) {
            w511.b();
            return;
        }
        h8l0 h8l0Var = ((g20) yoyVar).a;
        PolylinePosition polylinePosition = h8l0Var.b;
        ool0 ool0Var = h8l0Var.a;
        if (polylinePosition == null) {
            if (w4e0Var != null) {
                w4e0Var.i(false);
            }
        } else {
            if (w4e0Var == null) {
                return;
            }
            w4e0Var.i(true);
            w4e0Var.o(ool0Var.getGeometry());
            ((kiq0) this.z.x.e.getValue()).a(w4e0Var);
            w4e0Var.w(ool0Var);
            w4e0Var.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), polylinePosition)));
        }
    }

    @Override // defpackage.foy
    public final void df(Point point, Point point2) {
        boolean z = point != null;
        f4c0 f4c0Var = this.w;
        f4c0Var.i(z);
        if (point != null) {
            f4c0Var.o(point);
        }
        boolean z2 = point2 != null;
        f4c0 f4c0Var2 = this.x;
        f4c0Var2.i(z2);
        if (point2 != null) {
            f4c0Var2.o(point2);
        }
    }

    @Override // defpackage.foy
    public final void hb(bl00 bl00Var) {
        Boolean visible = bl00Var.b.getVisible();
        IconStyle iconStyle = this.b;
        iconStyle.setVisible(visible);
        this.c.z(bl00Var.a, iconStyle);
    }

    @Override // defpackage.foy
    public final void o0(float f) {
        Float valueOf = Float.valueOf(f);
        IconStyle iconStyle = this.b;
        iconStyle.setScale(valueOf);
        this.c.D(iconStyle);
    }

    @Override // defpackage.foy
    public final void y3(Point point, float f) {
        boolean z = point != null;
        f4c0 f4c0Var = this.c;
        f4c0Var.i(z);
        if (point != null) {
            f4c0Var.o(point);
        }
        f4c0Var.v(f);
    }
}
