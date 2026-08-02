package defpackage;

import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.map.CircleMapObject;
import java.util.Map;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class wub extends k45 implements j070 {
    public final ini0 b;

    public wub(ssr ssrVar, ini0 ini0Var) {
        super(ssrVar, "circle_map_objects");
        this.b = ini0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ini0 ini0Var = this.b;
            switch (hashCode) {
                case -1876181313:
                    if (str.equals("animatedSetGeometryPoint")) {
                        return;
                    }
                    break;
                case -1219999516:
                    if (str.equals("setGeometryCircle")) {
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            String str2 = (String) entry.getKey();
                            Map map = (Map) entry.getValue();
                            ((CircleMapObject) ini0Var.c(str2, ReferenceType.MAP_OBJECT)).setGeometry(new Circle(lyi.g((Map) map.get("center")), (float) ((Double) map.get("radius")).doubleValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -805849991:
                    if (str.equals("setStrokeColorCircle")) {
                        for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                            ((CircleMapObject) ini0Var.c((String) entry2.getKey(), ReferenceType.MAP_OBJECT)).setStrokeColor(dob1.b((String) entry2.getValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -320790578:
                    if (str.equals("setFillColorCircle")) {
                        for (Map.Entry entry3 : ((Map) obj).entrySet()) {
                            ((CircleMapObject) ini0Var.c((String) entry3.getKey(), ReferenceType.MAP_OBJECT)).setFillColor(dob1.b((String) entry3.getValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 207690908:
                    if (str.equals("setStrokeWidthCircle")) {
                        for (Map.Entry entry4 : ((Map) obj).entrySet()) {
                            ((CircleMapObject) ini0Var.c((String) entry4.getKey(), ReferenceType.MAP_OBJECT)).setStrokeWidth((float) ((Number) entry4.getValue()).doubleValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 764778076:
                    if (str.equals("unsubscribeCursorLocation")) {
                        return;
                    }
                    break;
                case 1634233732:
                    if (str.equals("setRadiusCircle")) {
                        for (Map.Entry entry5 : ((Map) obj).entrySet()) {
                            String str3 = (String) entry5.getKey();
                            float floatValue = ((Number) entry5.getValue()).floatValue();
                            CircleMapObject circleMapObject = (CircleMapObject) ini0Var.c(str3, ReferenceType.MAP_OBJECT);
                            circleMapObject.setGeometry(new Circle(circleMapObject.getGeometry().getCenter(), floatValue));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 2060910869:
                    if (str.equals("subscribeCursorLocation")) {
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
