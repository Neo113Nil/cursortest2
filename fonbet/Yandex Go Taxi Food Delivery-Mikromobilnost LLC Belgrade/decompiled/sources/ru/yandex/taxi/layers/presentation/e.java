package ru.yandex.taxi.layers.presentation;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.dn00;
import defpackage.hbp0;
import defpackage.lm00;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.vpr;
import defpackage.ym00;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ Set A;
    public final /* synthetic */ Map B;
    public final /* synthetic */ f a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CameraPosition c;
    public final /* synthetic */ ym00 w;
    public final /* synthetic */ List x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Set z;

    public e(f fVar, String str, CameraPosition cameraPosition, ym00 ym00Var, List list, boolean z, Set set, Set set2, Map map) {
        this.a = fVar;
        this.b = str;
        this.c = cameraPosition;
        this.w = ym00Var;
        this.x = list;
        this.y = z;
        this.z = set;
        this.A = set2;
        this.B = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ym00 ym00Var, Continuation continuation) {
        MapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1 mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1;
        int i;
        ym00 b;
        pzt0 pzt0Var;
        if (continuation instanceof MapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1) {
            mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1 = (MapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1) continuation;
            int i2 = mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                MapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1 mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$12 = mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1;
                Object obj = mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$12.label;
                f fVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lm00 lm00Var = (lm00) fVar.N.get(this.b);
                    if (lm00Var != null && (b = dn00.b(lm00Var, MapObjectComponentType.BODY)) != null && b.g().b) {
                        int size = this.z.size();
                        mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$12.L$0 = null;
                        mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$12.label = 1;
                        if (f.Hg(this.a, this.b, this.c, ym00Var, this.w, this.x, this.y, size, mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                pzt0Var = fVar.U;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                fVar.U = hbp0.e(fVar.K, null, null, new MapObjectsOverlay$showAdvertClusterization$1$job$1$1$1(this.c, this.B, this.A, null, fVar), 3);
                return zy11.a;
            }
        }
        mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1 = new MapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1(this, continuation);
        MapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1 mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$122 = mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$1;
        Object obj2 = mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsOverlay$showAdvertClusterization$1$job$1$1$emit$122.label;
        f fVar2 = this.a;
        if (i != 0) {
        }
        pzt0Var = fVar2.U;
        if (pzt0Var != null) {
        }
        fVar2.U = hbp0.e(fVar2.K, null, null, new MapObjectsOverlay$showAdvertClusterization$1$job$1$1$1(this.c, this.B, this.A, null, fVar2), 3);
        return zy11.a;
    }
}
