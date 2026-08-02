package defpackage;

import com.yandex.go.network_metrics.NetworkEventParam;
import com.yandex.go.network_metrics.api.NetworkSettingsProvider$NetworkType;
import com.yandex.mob.okhttp.metrics.MobNetworkSettingsProvider$MobNetworkType;
import com.ybsdk.common.DeviceIdProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.UnaryOperator;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final /* synthetic */ class saj implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ saj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        MobNetworkSettingsProvider$MobNetworkType mobNetworkSettingsProvider$MobNetworkType;
        NetworkSettingsProvider$NetworkType networkSettingsProvider$NetworkType;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Long l = (Long) obj2;
                taj tajVar = (taj) obj;
                Regex regex = DeviceIdProvider.k;
                return jl40.l(tajVar.a, l) ? tajVar : new taj(null, null, l);
            case 1:
                flv flvVar = (flv) obj2;
                OkHttpClient okHttpClient = (OkHttpClient) obj;
                if (okHttpClient != null) {
                    return okHttpClient;
                }
                vp20 vp20Var = (vp20) flvVar.b;
                vp20Var.getClass();
                OkHttpClient.a aVar = new OkHttpClient.a();
                aVar.e(vp20Var.d);
                aVar.c(vp20Var.c);
                aVar.a(new ko20());
                tig0 a = vp20Var.a.a();
                sr20 sr20Var = (sr20) a.a;
                X509TrustManager x509TrustManager = (X509TrustManager) a.b;
                if (x509TrustManager != null) {
                    aVar.h(sr20Var, x509TrustManager);
                }
                bgo bgoVar = vp20Var.b;
                if (bgoVar != null) {
                    aVar.d(bgoVar);
                }
                d5e d5eVar = flvVar.a;
                if (d5eVar != null) {
                    aVar.b = d5eVar;
                }
                return new OkHttpClient(aVar);
            case 2:
                Map map = (Map) obj2;
                Map map2 = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() + map2.size());
                linkedHashMap.putAll(map2);
                linkedHashMap.putAll(map);
                return linkedHashMap;
            case 3:
                Map map3 = (Map) obj;
                hp20 hp20Var = (hp20) ((cb2) ((yuf0) obj2).b).b.getValue();
                if (map3 != null) {
                    Object obj3 = map3.get("networkType");
                    Object obj4 = map3.get("isVpn");
                    if (jl40.l(obj3, (hp20Var == null || (mobNetworkSettingsProvider$MobNetworkType = hp20Var.b) == null) ? null : mobNetworkSettingsProvider$MobNetworkType.getValue())) {
                        if (jl40.l(obj4, hp20Var != null ? Boolean.valueOf(hp20Var.a) : null)) {
                            return map3;
                        }
                    }
                }
                return hp20Var != null ? b.i(new Pair("networkType", hp20Var.b.getValue()), new Pair("isVpn", Boolean.valueOf(hp20Var.a))) : b.f();
            case 4:
                return (dnz0) ((tls) obj2).invoke((dnz0) obj);
            case 5:
                w2j0 w2j0Var = (w2j0) obj2;
                Map map4 = (Map) obj;
                l060 l060Var = (l060) w2j0Var.b.c.get();
                yp20 a2 = w2j0Var.c.a();
                String str = a2.b;
                String str2 = a2.a;
                if (map4 != null) {
                    Object obj5 = map4.get(NetworkEventParam.NETWORK_TYPE.getKey());
                    Object obj6 = map4.get(NetworkEventParam.IS_VPN.getKey());
                    Object obj7 = map4.get(NetworkEventParam.MOB_CONFIG_ID.getKey());
                    Object obj8 = map4.get(NetworkEventParam.MOB_PROXY_ID.getKey());
                    if (jl40.l(obj5, (l060Var == null || (networkSettingsProvider$NetworkType = l060Var.b) == null) ? null : networkSettingsProvider$NetworkType.getValue())) {
                        if (jl40.l(obj6, l060Var != null ? Boolean.valueOf(l060Var.a) : null) && jl40.l(obj8, str2) && jl40.l(obj7, str)) {
                            return map4;
                        }
                    }
                }
                return b.n(l060Var != null ? b.i(new Pair(NetworkEventParam.NETWORK_TYPE.getKey(), l060Var.b.getValue()), new Pair(NetworkEventParam.IS_VPN.getKey(), Boolean.valueOf(l060Var.a))) : b.f(), b.i(new Pair(NetworkEventParam.MOB_CONFIG_ID.getKey(), str), new Pair(NetworkEventParam.MOB_PROXY_ID.getKey(), str2)));
            default:
                return obj2;
        }
    }
}
