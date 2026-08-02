package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.dxu0;
import defpackage.if61;
import defpackage.lz2;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.rl6;
import defpackage.tje;
import defpackage.um00;
import defpackage.vd1;
import defpackage.vpr;
import defpackage.xw31;
import defpackage.y2b1;
import defpackage.ym00;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;
    public final /* synthetic */ ym00 c;
    public final /* synthetic */ boolean w;

    public j(vpr vprVar, l lVar, ym00 ym00Var, boolean z) {
        this.a = vprVar;
        this.b = lVar;
        this.c = ym00Var;
        this.w = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0154, code lost:
    
        if (r0.emit(r1, r11) != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0156, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013c, code lost:
    
        if (r1 == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1;
        int i;
        PointF pointF;
        vpr vprVar;
        if (continuation instanceof AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1) {
            advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 = (AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1) continuation;
            int i2 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1;
                Object obj2 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vd1 vd1Var = (vd1) obj;
                    rl6 rl6Var = vd1Var.c;
                    ym00 ym00Var = this.c;
                    String e = ym00Var.e();
                    XYPoint f = ym00Var.f();
                    ImageProvider imageProvider = vd1Var.a;
                    int i3 = vd1Var.b;
                    lz2 lz2Var = (lz2) kotlin.collections.a.Q(ym00Var.a());
                    float f2 = lz2Var != null ? 3.0f + lz2Var.b : 3.0f;
                    dxu0 dxu0Var = vd1Var.c.k;
                    l lVar = this.b;
                    Context context = lVar.a;
                    if (this.w) {
                        pointF = new PointF(0.5f, 5.5f);
                    } else {
                        List list = dxu0Var != null ? dxu0Var.d : null;
                        if (list == null || list.size() != 2) {
                            pointF = new PointF(xw31.n(context) ? 1.05f : 0.5f, -0.8f);
                        } else {
                            pointF = new PointF(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
                        }
                    }
                    float f3 = pointF.x;
                    float f4 = pointF.y;
                    if (i3 < 1) {
                        i3 = 1;
                    }
                    Set singleton = Collections.singleton(new lz2(imageProvider, f2, (y2b1) null, 0.0f, (pt3) null, (AppearanceType) null, new PointF(f3, (((f4 - 1.0f) * tje.x(context, 14.0f)) / i3) + 1.0f), (ImageProvider) null, (PointF) null, 892));
                    um00 um00Var = new um00(300L);
                    Float f5 = new Float(ym00Var.g().c);
                    if61 c = ym00Var.c();
                    obj3 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$0 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$1 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$2 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$3 = null;
                    vprVar = this.a;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$4 = vprVar;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$5 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$6 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.label = 1;
                    obj2 = l.a(lVar, rl6Var, e, f, singleton, um00Var, f5, c, advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$4;
                    kotlin.b.b(obj2);
                }
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$0 = obj3;
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$1 = obj3;
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$2 = obj3;
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$3 = obj3;
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$4 = obj3;
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$5 = obj3;
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$6 = obj3;
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.label = 2;
            }
        }
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 = new AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1(this, continuation);
        AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1;
        Object obj22 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.label;
        Object obj32 = null;
        if (i != 0) {
        }
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$0 = obj32;
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$1 = obj32;
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$2 = obj32;
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$3 = obj32;
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$4 = obj32;
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$5 = obj32;
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$6 = obj32;
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.label = 2;
    }
}
