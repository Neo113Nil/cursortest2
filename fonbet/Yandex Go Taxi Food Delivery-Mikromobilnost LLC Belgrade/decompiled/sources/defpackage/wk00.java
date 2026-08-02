package defpackage;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.RuntimeBase;
import java.util.Map;
import ru.yandextaxi.flutter_yandex_mapkit.methods.auth.a;

/* loaded from: classes7.dex */
public final class wk00 extends k45 {
    public static boolean y;
    public final ssr b;
    public Map c;
    public final a w;
    public final iv00 x;

    public wk00(ssr ssrVar, ini0 ini0Var) {
        super(ssrVar, "MapKitFactory");
        this.b = ssrVar;
        this.w = new a(ssrVar, ini0Var);
        this.x = new iv00();
    }

    @Override // defpackage.k45
    public final void a() {
        super.a();
        this.w.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1268912042:
                    if (str.equals("setMapKitLocale")) {
                        if (!y) {
                            String str2 = obj instanceof String ? (String) obj : null;
                            if (str2 == null) {
                                return;
                            } else {
                                MapKitFactory.setLocale(str2);
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1161073251:
                    if (str.equals("setPreinitializationOptions")) {
                        Map map = obj instanceof Map ? (Map) obj : null;
                        if (map == null) {
                            return;
                        }
                        this.c = map;
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -611599947:
                    if (str.equals("changeApiKey")) {
                        MapKitFactory.getInstance().changeApiKey((String) obj);
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -133834167:
                    if (str.equals("setMetricaIds")) {
                        Map map2 = (Map) obj;
                        MapKitFactory.getInstance().setMetricaIds((String) map2.get("uuid"), (String) map2.get("deviceId"));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -75330515:
                    if (str.equals("getMiid")) {
                        MapKitFactory.getInstance().getMiidManager().submit(new vk00((ba20) da20Var));
                        return;
                    }
                    break;
                case 69564682:
                    if (str.equals("initMapKit")) {
                        if (!y) {
                            Map map3 = this.c;
                            ssr ssrVar = this.b;
                            if (map3 != null) {
                                Runtime.init(ssrVar.a, (Map<String, String>) map3);
                            } else {
                                Runtime.init(ssrVar.a);
                            }
                            RuntimeBase.setFailedAssertionListener(new ak00(1));
                            String str3 = obj instanceof String ? (String) obj : null;
                            if (str3 == null) {
                                return;
                            }
                            MapKitFactory.setApiKey(str3);
                            MapKitFactory.initialize(ssrVar.a);
                            this.x.getClass();
                            y = true;
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1796346731:
                    if (str.equals("setAccount")) {
                        String str4 = (String) obj;
                        if (str4 != null) {
                            a aVar = this.w;
                            aVar.w = str4;
                            MapKitFactory.getInstance().setAccount(aVar);
                        } else {
                            MapKitFactory.getInstance().setAccount(null);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
