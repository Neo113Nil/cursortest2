package ru.yandex.taxi.masstransit.overlay.icons;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import defpackage.cua1;
import defpackage.d631;
import defpackage.e631;
import defpackage.g631;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.t531;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uyj;
import defpackage.v531;
import defpackage.w511;
import defpackage.w531;
import defpackage.x4v;
import defpackage.xw31;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.model.VariantStyle;
import ru.yandex.taxi.masstransit.overlay.icons.VehicleIconView;

/* loaded from: classes6.dex */
public final class b {
    public final Context a;
    public final hbp0 b;
    public final tt2 c;
    public final e631 d;
    public final pdc e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final IconStyle g = new IconStyle();
    public final VehicleIconView h;
    public final MarkIconView i;
    public final DotIconView j;

    public b(Context context, hbp0 hbp0Var, tt2 tt2Var, e631 e631Var, pdc pdcVar) {
        this.a = context;
        this.b = hbp0Var;
        this.c = tt2Var;
        this.d = e631Var;
        this.e = pdcVar;
        VehicleIconView.Companion.getClass();
        this.h = new VehicleIconView(context, null);
        MarkIconView.Companion.getClass();
        this.i = new MarkIconView(context, null);
        DotIconView.Companion.getClass();
        this.j = new DotIconView(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (r24 >= 320.0f) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0137, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        if (r24 >= 200.0f) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0127, code lost:
    
        if (r24 >= 140.0f) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0134, code lost:
    
        if (r24 >= 20.0f) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, RouteType routeType, VariantStyle variantStyle, PlacemarkMapObject placemarkMapObject, String str, VariantStyle.a aVar, float f, boolean z, ContinuationImpl continuationImpl) {
        IconRenderer$renderVehicleIcon$1 iconRenderer$renderVehicleIcon$1;
        int i;
        c cVar;
        v531 v531Var;
        PlacemarkMapObject placemarkMapObject2;
        c cVar2;
        bVar.getClass();
        if (continuationImpl instanceof IconRenderer$renderVehicleIcon$1) {
            iconRenderer$renderVehicleIcon$1 = (IconRenderer$renderVehicleIcon$1) continuationImpl;
            int i2 = iconRenderer$renderVehicleIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iconRenderer$renderVehicleIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = iconRenderer$renderVehicleIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iconRenderer$renderVehicleIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        Bitmap b = bVar.b(routeType, aVar);
                        e631.a.getClass();
                        if (jl40.l(b, d631.b)) {
                            return Boolean.FALSE;
                        }
                        VehicleIconView.LabelDirection labelDirection = ((0.0f > f || f > 30.0f) && (330.0f > f || f > 360.0f)) ? (30.0f > f || f > 150.0f) ? (150.0f > f || f > 210.0f) ? (210.0f > f || f > 330.0f) ? VehicleIconView.LabelDirection.UP : VehicleIconView.LabelDirection.RIGHT : VehicleIconView.LabelDirection.DOWN : VehicleIconView.LabelDirection.LEFT : VehicleIconView.LabelDirection.UP;
                        kdc i3 = ((ufu) bVar.e).i(variantStyle.a);
                        Object userData = placemarkMapObject.getUserData();
                        v531 v531Var2 = userData instanceof v531 ? (v531) userData : null;
                        VehicleIconView.LabelDirection labelDirection2 = (v531Var2 == null || (cVar2 = v531Var2.a) == null) ? null : cVar2.c;
                        int i4 = labelDirection2 == null ? -1 : a.b[labelDirection2.ordinal()];
                        if (i4 != -1) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 != 4) {
                                            w511.b();
                                            return null;
                                        }
                                        if (f <= 40.0f) {
                                        }
                                    } else if (f <= 340.0f) {
                                    }
                                } else if (f <= 220.0f) {
                                }
                            } else if (f <= 160.0f) {
                            }
                            Context context = bVar.a;
                            v531Var = v531Var2;
                            cVar = new c(str, i3 == null ? s8o.m(i3, context) : context.getColor(cua1.c(routeType)), r13, b, aVar.h, z, ru.yandex.taxi.design.utils.c.h(aVar.g, bVar.h));
                            if (!jl40.l(v531Var == null ? v531Var.a : null, cVar)) {
                                return Boolean.TRUE;
                            }
                            bVar.c.getClass();
                            sjh sjhVar = uyj.a;
                            IconRenderer$renderVehicleIcon$imageProvider$1 iconRenderer$renderVehicleIcon$imageProvider$1 = new IconRenderer$renderVehicleIcon$imageProvider$1(bVar, cVar, null);
                            iconRenderer$renderVehicleIcon$1.L$0 = null;
                            iconRenderer$renderVehicleIcon$1.L$1 = null;
                            placemarkMapObject2 = placemarkMapObject;
                            iconRenderer$renderVehicleIcon$1.L$2 = placemarkMapObject2;
                            iconRenderer$renderVehicleIcon$1.L$3 = null;
                            iconRenderer$renderVehicleIcon$1.L$4 = null;
                            iconRenderer$renderVehicleIcon$1.L$5 = null;
                            iconRenderer$renderVehicleIcon$1.L$6 = null;
                            iconRenderer$renderVehicleIcon$1.L$7 = null;
                            iconRenderer$renderVehicleIcon$1.L$8 = null;
                            iconRenderer$renderVehicleIcon$1.L$9 = null;
                            iconRenderer$renderVehicleIcon$1.L$10 = cVar;
                            iconRenderer$renderVehicleIcon$1.F$0 = f;
                            iconRenderer$renderVehicleIcon$1.Z$0 = z;
                            iconRenderer$renderVehicleIcon$1.label = 1;
                            obj = tje.k0(sjhVar, iconRenderer$renderVehicleIcon$imageProvider$1, iconRenderer$renderVehicleIcon$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        VehicleIconView.LabelDirection labelDirection3 = labelDirection;
                        Context context2 = bVar.a;
                        v531Var = v531Var2;
                        cVar = new c(str, i3 == null ? s8o.m(i3, context2) : context2.getColor(cua1.c(routeType)), labelDirection3, b, aVar.h, z, ru.yandex.taxi.design.utils.c.h(aVar.g, bVar.h));
                        if (!jl40.l(v531Var == null ? v531Var.a : null, cVar)) {
                        }
                    } catch (Exception e) {
                        jst.e.c(String.format("Error while get sized mark icon", Arrays.copyOf(new Object[]{e}, 1)));
                        return Boolean.FALSE;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c cVar3 = (c) iconRenderer$renderVehicleIcon$1.L$10;
                    PlacemarkMapObject placemarkMapObject3 = (PlacemarkMapObject) iconRenderer$renderVehicleIcon$1.L$2;
                    kotlin.b.b(obj);
                    cVar = cVar3;
                    placemarkMapObject2 = placemarkMapObject3;
                }
                ImageProvider imageProvider = (ImageProvider) obj;
                if (placemarkMapObject2.isValid()) {
                    return Boolean.TRUE;
                }
                placemarkMapObject2.setUserData(new v531(cVar));
                placemarkMapObject2.setIcon(imageProvider, new IconStyle().setRotationType(RotationType.ROTATE), new x4v(placemarkMapObject2, 2));
                return Boolean.TRUE;
            }
        }
        iconRenderer$renderVehicleIcon$1 = new IconRenderer$renderVehicleIcon$1(bVar, continuationImpl);
        Object obj2 = iconRenderer$renderVehicleIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iconRenderer$renderVehicleIcon$1.label;
        if (i != 0) {
        }
        ImageProvider imageProvider2 = (ImageProvider) obj2;
        if (placemarkMapObject2.isValid()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(RouteType routeType, VariantStyle.a aVar) {
        Object obj;
        t531 t531Var;
        ImageProvider imageProvider;
        int i;
        Object obj2;
        String str = aVar.c;
        int i2 = aVar.e;
        ru.yandex.taxi.masstransit.overlay.d dVar = (ru.yandex.taxi.masstransit.overlay.d) this.d;
        ConcurrentHashMap concurrentHashMap = dVar.e;
        if (str.length() != 0) {
            Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((g631) obj).c, str)) {
                    break;
                }
            }
            g631 g631Var = (g631) obj;
            if (g631Var != null) {
                t531Var = (t531) concurrentHashMap.get(g631Var);
                if (t531Var == null) {
                    VariantStyle.VariantType variantType = aVar.b;
                    ConcurrentHashMap concurrentHashMap2 = dVar.e;
                    Iterator it2 = concurrentHashMap2.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        g631 g631Var2 = (g631) obj2;
                        if (g631Var2.a == routeType && g631Var2.b == variantType) {
                            break;
                        }
                    }
                    t531 t531Var2 = (t531) concurrentHashMap2.get((g631) obj2);
                    t531Var = t531Var2 == null ? new t531(ImageProvider.fromBitmap(dVar.a(routeType, variantType))) : t531Var2;
                }
                imageProvider = t531Var.a;
                i = aVar.d;
                if (i > 0 || i2 <= 0) {
                    return imageProvider.get$image();
                }
                VehicleIconView vehicleIconView = this.h;
                int h = ru.yandex.taxi.design.utils.c.h(i, vehicleIconView);
                int u = tje.u(i2, vehicleIconView.getContext());
                ConcurrentHashMap concurrentHashMap3 = t531Var.b;
                Bitmap bitmap = (Bitmap) concurrentHashMap3.get(new Pair(Integer.valueOf(h), Integer.valueOf(u)));
                if (bitmap != null) {
                    return bitmap;
                }
                Bitmap bitmap2 = imageProvider.get$image();
                if (bitmap2 == null) {
                    return null;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, h, u, true);
                concurrentHashMap3.put(new Pair(Integer.valueOf(h), Integer.valueOf(u)), createScaledBitmap);
                return createScaledBitmap;
            }
        }
        t531Var = null;
        if (t531Var == null) {
        }
        imageProvider = t531Var.a;
        i = aVar.d;
        if (i > 0) {
        }
        return imageProvider.get$image();
    }

    public final void c(RouteType routeType, VariantStyle variantStyle, PlacemarkMapObject placemarkMapObject, String str, VariantStyle.a aVar, VariantStyle.a aVar2, float f, boolean z) {
        int i = a.a[aVar.b.ordinal()];
        if (i == 1) {
            hbp0.e(this.b, null, null, new IconRenderer$render$1(this, routeType, variantStyle, placemarkMapObject, str, aVar, f, z, aVar2, null), 3);
            return;
        }
        if (i == 2) {
            d(routeType, variantStyle, placemarkMapObject, str, aVar, f, z);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                jst.e.c("Unknown variant type");
                return;
            } else {
                w511.b();
                return;
            }
        }
        kdc i2 = ((ufu) this.e).i(variantStyle.a);
        int i3 = aVar.d;
        if (i3 == 0) {
            i3 = 8;
        }
        DotIconView dotIconView = this.j;
        dotIconView.forceLayout();
        dotIconView.setColor(i2 != null ? s8o.m(i2, dotIconView.getContext()) : dotIconView.getContext().getColor(cua1.c(routeType)));
        dotIconView.setSize(tje.w(i3, dotIconView.getContext()));
        xw31.r(dotIconView);
        placemarkMapObject.setUserData(w531.a);
        placemarkMapObject.setIcon(ImageProvider.fromBitmap(xw31.t(dotIconView)), new x4v(placemarkMapObject, 1));
    }

    public final void d(RouteType routeType, VariantStyle variantStyle, PlacemarkMapObject placemarkMapObject, String str, VariantStyle.a aVar, float f, boolean z) {
        try {
            Bitmap b = b(routeType, aVar);
            kdc g = ((ufu) this.e).g(variantStyle.a);
            Integer valueOf = g != null ? Integer.valueOf(s8o.m(g, this.a)) : null;
            MarkIconView markIconView = this.i;
            markIconView.forceLayout();
            markIconView.setVehicleAzimuth(f);
            markIconView.setVehicleName(str);
            markIconView.setVehicleImage(b);
            markIconView.setColor(valueOf != null ? valueOf.intValue() : markIconView.getContext().getColor(cua1.c(routeType)));
            markIconView.setShowLabel(aVar.h);
            markIconView.setBlobSize(Integer.valueOf(tje.u(aVar.f, markIconView.getContext())));
            markIconView.setSelected(z);
            xw31.r(markIconView);
            PointF anchorPoint = markIconView.getAnchorPoint();
            IconStyle iconStyle = this.g;
            iconStyle.setAnchor(anchorPoint);
            placemarkMapObject.setUserData(w531.a);
            placemarkMapObject.setIcon(ImageProvider.fromBitmap(xw31.t(markIconView)), iconStyle, new x4v(placemarkMapObject, 0));
        } catch (Exception e) {
            jst.e.c(String.format("Error while get sized mark icon", Arrays.copyOf(new Object[]{e}, 1)));
            placemarkMapObject.setVisible(false);
        }
    }
}
