package com.adjust.sdk.network;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class UtilNetworking {

    /* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
    public interface IConnectionOptions {
        void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i);
    }

    /* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
    public interface IHttpsURLConnectionProvider {
        HttpsURLConnection generateHttpsURLConnection(URL url);
    }

    public static IConnectionOptions createDefaultConnectionOptions() {
        return new FrostHunterAdapterDelegateNebulaRogue3354();
    }

    public static IHttpsURLConnectionProvider createDefaultHttpsURLConnectionProvider() {
        return new FrostHunterObserverMaxHeroTitanium2434();
    }

    public static int extractJsonInt(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof Integer) {
            return ((Integer) opt).intValue();
        }
        return -1;
    }

    public static Long extractJsonLong(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof Long) {
            return (Long) opt;
        }
        if (opt instanceof Number) {
            return Long.valueOf(((Number) opt).longValue());
        }
        if (!(opt instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) opt));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String extractJsonString(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }
}
