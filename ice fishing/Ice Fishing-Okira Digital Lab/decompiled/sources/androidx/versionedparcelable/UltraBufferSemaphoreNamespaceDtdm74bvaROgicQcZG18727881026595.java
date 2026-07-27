package androidx.versionedparcelable;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class UltraBufferSemaphoreNamespaceDtdm74bvaROgicQcZG18727881026595 {
    public static final Map AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public static final CopyOnWriteArraySet ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.class.getName(), "okhttp.Http2");
        linkedHashMap.put(QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = GoldenVectorPostfixControllerGh1LVFL4KzdipQ42Ly80803429498090.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854(linkedHashMap);
    }

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(VertexLinkAbstractionNamespaceIs8AiWYGFpim6bfKBQ31900292057324.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        }
    }

    public static void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get(str);
        if (str3 == null) {
            str3 = QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509.CrimsonRouteSyntaxAsyncObOdDHEEcC0VRkK8sC88172832557720(str, 23);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286 = QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509.CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286(str2, '\n', i2, 4);
                if (CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286 == -1) {
                    CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286 = length;
                }
                while (true) {
                    min = Math.min(CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286, i2 + 4000);
                    str2.substring(i2, min);
                    if (min >= CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }
}
