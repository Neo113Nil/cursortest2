package android.content.Context;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterFragmentTransactionMasterOlympianTitanium5654 {
    public static final CopyOnWriteArraySet FrostHunterAlphaAnimationNeoCosmos5761 = new CopyOnWriteArraySet();
    public static final Map FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = FrostHunterPreviewThunderShadowBeta2697.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(FrostHunterPreviewThunderShadowBeta2697.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(FrostHunterKeyframeGammaGamma2319.class.getName(), "okhttp.Http2");
        linkedHashMap.put(FrostHunterCoroutineScopeBetaMasterRogue7248.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterBroadcastHeroSpectra7879.FrostHunterNestedScrollViewPixelPhantom8605(linkedHashMap);
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) FrostHunterConstraintSetCloneMasterUltraRogue2633.get(str);
        if (str3 == null) {
            str3 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterPagingDataTurboTitanium7332(str, 23);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterDialogFragmentTurboPhoenixDragon7627(str2, '\n', i2, 4);
                if (FrostHunterDialogFragmentTurboPhoenixDragon7627 == -1) {
                    FrostHunterDialogFragmentTurboPhoenixDragon7627 = length;
                }
                while (true) {
                    min = Math.min(FrostHunterDialogFragmentTurboPhoenixDragon7627, i2 + 4000);
                    str2.substring(i2, min);
                    if (min >= FrostHunterDialogFragmentTurboPhoenixDragon7627) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (FrostHunterAlphaAnimationNeoCosmos5761.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(FrostHunterMaterialButtonHeroPixel8656.FrostHunterAlphaAnimationNeoCosmos5761);
        }
    }
}
