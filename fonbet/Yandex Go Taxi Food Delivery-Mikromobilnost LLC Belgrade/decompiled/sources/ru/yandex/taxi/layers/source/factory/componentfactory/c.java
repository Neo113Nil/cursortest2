package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import defpackage.dxu0;
import defpackage.f0k;
import defpackage.fkp;
import defpackage.lz2;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.rl6;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.xw31;
import defpackage.y2b1;
import defpackage.zlp;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ fkp c;
    public final /* synthetic */ f0k w;
    public final /* synthetic */ vm00 x;

    public c(vpr vprVar, e eVar, fkp fkpVar, f0k f0kVar, vm00 vm00Var) {
        this.a = vprVar;
        this.b = eVar;
        this.c = fkpVar;
        this.w = f0kVar;
        this.x = vm00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0129, code lost:
    
        if (r0.emit(r1, r10) != r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1;
        int i;
        zzs zzsVar;
        PointF pointF;
        vpr vprVar;
        if (continuation instanceof AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1) {
            advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 = (AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1) continuation;
            int i2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1;
                Object obj2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    ImageProvider imageProvider = (ImageProvider) pair.getFirst();
                    rl6 rl6Var = (rl6) pair.getSecond();
                    fkp fkpVar = this.c;
                    zlp zlpVar = fkpVar.c;
                    if (zlpVar == null || (zzsVar = zlpVar.a) == null) {
                        zzsVar = zzs.f;
                    }
                    Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
                    dxu0 dxu0Var = rl6Var.k;
                    Bitmap bitmap = e.m;
                    f0k f0kVar = this.w;
                    Float f = f0kVar.a;
                    if (f == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    float floatValue = f.floatValue() - 1.0f;
                    List list = dxu0Var != null ? dxu0Var.d : null;
                    e eVar = this.b;
                    if (list == null || list.size() != 2) {
                        pointF = new PointF(!xw31.n(eVar.a) ? -0.05f : 1.05f, 0.5f);
                    } else {
                        pointF = new PointF(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
                    }
                    Set singleton = Collections.singleton(new lz2(imageProvider, floatValue, (y2b1) null, 0.0f, (pt3) null, (AppearanceType) null, pointF, (ImageProvider) null, (PointF) null, 892));
                    Float f2 = f0kVar.a;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$0 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$1 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$2 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$3 = null;
                    vpr vprVar2 = this.a;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$4 = vprVar2;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$5 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$6 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$7 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.label = 1;
                    obj2 = e.d(eVar, rl6Var, fkpVar, F, singleton, this.x, f2, advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$4;
                kotlin.b.b(obj2);
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$0 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$1 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$2 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$3 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$4 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$5 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$6 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.L$7 = null;
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$12.label = 2;
            }
        }
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 = new AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1(this, continuation);
        AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1 advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$1;
        Object obj22 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.label;
        if (i != 0) {
        }
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$0 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$1 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$2 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$3 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$4 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$5 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$6 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.L$7 = null;
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$2$122.label = 2;
    }
}
