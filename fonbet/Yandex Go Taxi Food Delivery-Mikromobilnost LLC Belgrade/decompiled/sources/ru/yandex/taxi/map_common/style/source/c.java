package ru.yandex.taxi.map_common.style.source;

import defpackage.gw00;
import defpackage.js00;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Map b;

    public c(vpr vprVar, Map map) {
        this.a = vprVar;
        this.b = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1 mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        Map f;
        if (continuation instanceof MapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1) {
            mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1 = (MapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) this.b.get((ThemeType) obj);
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        f = kotlin.collections.b.f();
                    } else {
                        List list3 = list;
                        int d = gw00.d(tcc.n(list3, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        f = new LinkedHashMap(d);
                        for (Object obj3 : list3) {
                            f.put(((js00) obj3).a, obj3);
                        }
                    }
                    mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1 = new MapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapStylesRepositoryImpl$mapStyleAdmissionFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
