package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.LinkedHashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

/* loaded from: classes12.dex */
public abstract class vxn0 {
    public static final void a(kf00 kf00Var, String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, String str2, String str3, dms dmsVar, dms dmsVar2) {
        if (event != LayersAnalyticEventEmmiter.Event.AVAILABLE && mapObjectComponentType == MapObjectComponentType.BODY) {
            int i = uxn0.a[event.ordinal()];
            if (i == 1) {
                dmsVar.invoke(kf00Var, str3, str2, str, "layers");
            } else {
                if (i != 2) {
                    return;
                }
                dmsVar2.invoke(kf00Var, str3, str2, str, "layers");
            }
        }
    }

    public static final void b(lx4 lx4Var, String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, String str2, String str3) {
        if (event != LayersAnalyticEventEmmiter.Event.AVAILABLE && mapObjectComponentType == MapObjectComponentType.BODY && event == LayersAnalyticEventEmmiter.Event.SHOWN) {
            i d = ((j) lx4Var).d("Map.ScooterAreaLabel.Shown");
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("parking_id", str);
            linkedHashMap.put("mode", str3);
            linkedHashMap.put(MetaDataField.SCREEN_FIELD, str2);
            linkedHashMap.put("provider", "layers");
            d.m();
        }
    }
}
