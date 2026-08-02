package ru.yandex.taxi.map_common.map.utils;

import com.yandex.mapkit.geometry.geo.Projections;
import defpackage.alf0;
import defpackage.el00;
import defpackage.h3y;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b implements alf0 {
    public final h3y a;

    public b(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ProjectionFactoryImpl$getWgs84Mercator$1 projectionFactoryImpl$getWgs84Mercator$1;
        int i;
        if (continuationImpl instanceof ProjectionFactoryImpl$getWgs84Mercator$1) {
            projectionFactoryImpl$getWgs84Mercator$1 = (ProjectionFactoryImpl$getWgs84Mercator$1) continuationImpl;
            int i2 = projectionFactoryImpl$getWgs84Mercator$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                projectionFactoryImpl$getWgs84Mercator$1.label = i2 - Integer.MIN_VALUE;
                Object obj = projectionFactoryImpl$getWgs84Mercator$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = projectionFactoryImpl$getWgs84Mercator$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    el00 el00Var = (el00) this.a.get();
                    projectionFactoryImpl$getWgs84Mercator$1.label = 1;
                    if (el00Var.a(projectionFactoryImpl$getWgs84Mercator$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Projections.getWgs84Mercator();
            }
        }
        projectionFactoryImpl$getWgs84Mercator$1 = new ProjectionFactoryImpl$getWgs84Mercator$1(this, continuationImpl);
        Object obj2 = projectionFactoryImpl$getWgs84Mercator$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = projectionFactoryImpl$getWgs84Mercator$1.label;
        if (i != 0) {
        }
        return Projections.getWgs84Mercator();
    }
}
