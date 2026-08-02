package ru.yandex.taxi.locationsdk.core.source_location_provider.internal;

import defpackage.o0w;
import defpackage.p0w;
import defpackage.udq0;
import defpackage.w511;
import defpackage.zls;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class SourceLocationProviderImpl$requestLocationUpdates$1 extends AdaptedFunctionReference implements zls {
    public static final SourceLocationProviderImpl$requestLocationUpdates$1 a = new SourceLocationProviderImpl$requestLocationUpdates$1(3, 5, udq0.class, "selectRequestByPriority", "selectRequestByPriority(Ljava/util/Map;Lru/yandex/taxi/locationsdk/core/priority/InputSourcePriority;)Ljava/lang/Object;");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        p0w p0wVar = (p0w) obj2;
        InputSourcePriority$Active inputSourcePriority$Active = InputSourcePriority$Active.Low;
        o0w o0wVar = o0w.a;
        if (p0wVar == inputSourcePriority$Active) {
            Object obj4 = map.get(inputSourcePriority$Active);
            if (obj4 != null) {
                return obj4;
            }
            Object obj5 = map.get(InputSourcePriority$Active.Normal);
            return obj5 == null ? map.get(o0wVar) : obj5;
        }
        InputSourcePriority$Active inputSourcePriority$Active2 = InputSourcePriority$Active.Normal;
        if (p0wVar != inputSourcePriority$Active2) {
            if (p0wVar.equals(o0wVar)) {
                return map.get(o0wVar);
            }
            w511.b();
            return null;
        }
        Object obj6 = map.get(inputSourcePriority$Active2);
        if (obj6 != null) {
            return obj6;
        }
        Object obj7 = map.get(inputSourcePriority$Active);
        return obj7 == null ? map.get(o0wVar) : obj7;
    }
}
