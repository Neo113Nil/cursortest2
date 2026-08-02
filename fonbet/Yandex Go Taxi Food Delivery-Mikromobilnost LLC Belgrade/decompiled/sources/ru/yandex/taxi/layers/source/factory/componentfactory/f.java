package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.PointF;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ec4;
import defpackage.f4c0;
import defpackage.if61;
import defpackage.lcv;
import defpackage.lz2;
import defpackage.ny61;
import defpackage.vm00;
import defpackage.ym00;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f {
    public final ru.yandex.taxi.map_common.map.utils.a a;

    public f(ru.yandex.taxi.map_common.map.utils.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, XYPoint xYPoint, if61 if61Var, ym00 ym00Var, float f, PointF pointF, float f2, float f3, ContinuationImpl continuationImpl) {
        AdvertClusterPreviewImageOverlayComponentFactory$create$1 advertClusterPreviewImageOverlayComponentFactory$create$1;
        int i;
        Object obj;
        float f4;
        if61 if61Var2;
        XYPoint xYPoint2;
        Set set;
        String str3;
        vm00 vm00Var;
        String str4;
        if (continuationImpl instanceof AdvertClusterPreviewImageOverlayComponentFactory$create$1) {
            advertClusterPreviewImageOverlayComponentFactory$create$1 = (AdvertClusterPreviewImageOverlayComponentFactory$create$1) continuationImpl;
            int i2 = advertClusterPreviewImageOverlayComponentFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertClusterPreviewImageOverlayComponentFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = advertClusterPreviewImageOverlayComponentFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertClusterPreviewImageOverlayComponentFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = ym00Var.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((lz2) obj).b() == AppearanceType.NORMAL) {
                            break;
                        }
                    }
                    lz2 lz2Var = (lz2) obj;
                    if (lz2Var == null && (lz2Var = (lz2) kotlin.collections.a.Q(ym00Var.a())) == null) {
                        return null;
                    }
                    f4 = f;
                    Set singleton = Collections.singleton(new lz2(lz2Var.e(), f4, f3 == 0.0f ? lz2Var.d() : new ec4(f3), lz2Var.f() * f2, lz2Var.c(), lz2Var.b(), pointF, (ImageProvider) null, (PointF) null, 800));
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$0 = str;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$1 = str2;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$2 = xYPoint;
                    if61Var2 = if61Var;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$3 = if61Var2;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$4 = null;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$5 = null;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$6 = null;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$7 = null;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$8 = null;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.L$9 = singleton;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.F$0 = f4;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.F$1 = f2;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.F$2 = f3;
                    advertClusterPreviewImageOverlayComponentFactory$create$1.label = 1;
                    Object g = this.a.g(xYPoint, advertClusterPreviewImageOverlayComponentFactory$create$1);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xYPoint2 = xYPoint;
                    set = singleton;
                    str3 = str;
                    vm00Var = null;
                    str4 = str2;
                    obj2 = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = advertClusterPreviewImageOverlayComponentFactory$create$1.F$0;
                    set = (Set) advertClusterPreviewImageOverlayComponentFactory$create$1.L$9;
                    vm00Var = (vm00) advertClusterPreviewImageOverlayComponentFactory$create$1.L$6;
                    if61 if61Var3 = (if61) advertClusterPreviewImageOverlayComponentFactory$create$1.L$3;
                    xYPoint2 = (XYPoint) advertClusterPreviewImageOverlayComponentFactory$create$1.L$2;
                    str4 = (String) advertClusterPreviewImageOverlayComponentFactory$create$1.L$1;
                    str3 = (String) advertClusterPreviewImageOverlayComponentFactory$create$1.L$0;
                    kotlin.b.b(obj2);
                    f4 = f5;
                    if61Var2 = if61Var3;
                }
                f4c0 f4c0Var = new f4c0((Point) obj2, null, 2);
                f4c0Var.k(f4);
                f4c0Var.i(true);
                return new lcv(str3, if61Var2, str4, set, xYPoint2, vm00Var, f4c0Var);
            }
        }
        advertClusterPreviewImageOverlayComponentFactory$create$1 = new AdvertClusterPreviewImageOverlayComponentFactory$create$1(this, continuationImpl);
        Object obj22 = advertClusterPreviewImageOverlayComponentFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertClusterPreviewImageOverlayComponentFactory$create$1.label;
        if (i != 0) {
        }
        f4c0 f4c0Var2 = new f4c0((Point) obj22, null, 2);
        f4c0Var2.k(f4);
        f4c0Var2.i(true);
        return new lcv(str3, if61Var2, str4, set, xYPoint2, vm00Var, f4c0Var2);
    }
}
