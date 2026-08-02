package defpackage;

import com.yandex.urbanads.UrbanAdsCreativeParams$Format;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class ze21 {
    public static bf21 a(ze21 ze21Var, UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format, String str, MapBuilder mapBuilder) {
        ze21Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(mapBuilder.getSize()));
        for (Map.Entry entry : mapBuilder.entrySet()) {
            linkedHashMap.put(entry.getKey(), xw91.m(entry.getValue()));
        }
        return new bf21(urbanAdsCreativeParams$Format, str, linkedHashMap);
    }

    public final KSerializer serializer() {
        return ye21.a;
    }
}
