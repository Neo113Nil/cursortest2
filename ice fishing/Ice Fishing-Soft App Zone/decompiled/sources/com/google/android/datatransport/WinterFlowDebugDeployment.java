package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugDeployment implements WinterFlowServiceProviderGateway {
    public final URL WinterFlowArrayNetwork;
    public final Context WinterFlowCacheManagerAgent;
    public final ConnectivityManager WinterFlowHookDataSource;
    public final WinterFlowConfigurationModule WinterFlowRouterStructure;
    public final WinterFlowFunctionProcessor WinterFlowTransactionManagerStrategy;
    public final WinterFlowFunctionProcessor WinterFlowVariableVersionControl;

    public WinterFlowDebugDeployment(Context context, WinterFlowFunctionProcessor winterFlowFunctionProcessor, WinterFlowFunctionProcessor winterFlowFunctionProcessor2) {
        WinterFlowIDEConfiguration winterFlowIDEConfiguration = new WinterFlowIDEConfiguration();
        WinterFlowLibraryWorker winterFlowLibraryWorker = WinterFlowLibraryWorker.WinterFlowRouterStructure;
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowRequestStrategy.class, winterFlowLibraryWorker);
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowStrategy.class, winterFlowLibraryWorker);
        WinterFlowLoaderWebsocket winterFlowLoaderWebsocket = WinterFlowLoaderWebsocket.WinterFlowRouterStructure;
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowSingletonMechanism.class, winterFlowLoaderWebsocket);
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowProcessorJava.class, winterFlowLoaderWebsocket);
        WinterFlowStrategyProtocol winterFlowStrategyProtocol = WinterFlowStrategyProtocol.WinterFlowRouterStructure;
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowTransactionManagerSerializer.class, winterFlowStrategyProtocol);
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowMiddleware.class, winterFlowStrategyProtocol);
        WinterFlowMiddlewareStructure winterFlowMiddlewareStructure = WinterFlowMiddlewareStructure.WinterFlowRouterStructure;
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowRendererLayer.class, winterFlowMiddlewareStructure);
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowBatchDataSource.class, winterFlowMiddlewareStructure);
        WinterFlowManagerEngine winterFlowManagerEngine = WinterFlowManagerEngine.WinterFlowRouterStructure;
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowDataSourceWorker.class, winterFlowManagerEngine);
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowVersionDeserialization.class, winterFlowManagerEngine);
        WinterFlowCompilerAgent winterFlowCompilerAgent = WinterFlowCompilerAgent.WinterFlowRouterStructure;
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowJavaHook.class, winterFlowCompilerAgent);
        winterFlowIDEConfiguration.WinterFlowRouterStructure(WinterFlowControllerAdapter.class, winterFlowCompilerAgent);
        winterFlowIDEConfiguration.WinterFlowArrayNetwork = true;
        this.WinterFlowRouterStructure = new WinterFlowConfigurationModule(19, winterFlowIDEConfiguration);
        this.WinterFlowCacheManagerAgent = context;
        this.WinterFlowHookDataSource = (ConnectivityManager) context.getSystemService("connectivity");
        this.WinterFlowArrayNetwork = WinterFlowHookDataSource(WinterFlowCacheTransaction.WinterFlowCacheManagerAgent);
        this.WinterFlowVariableVersionControl = winterFlowFunctionProcessor2;
        this.WinterFlowTransactionManagerStrategy = winterFlowFunctionProcessor;
    }

    public static URL WinterFlowHookDataSource(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (((com.google.android.datatransport.WinterFlowBatchStructure) com.google.android.datatransport.WinterFlowBatchStructure.WinterFlowVariableVersionControl.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowObjectFrontend WinterFlowRouterStructure(WinterFlowObjectFrontend winterFlowObjectFrontend) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.WinterFlowHookDataSource.getActiveNetworkInfo();
        WinterFlowSchedulerParser WinterFlowCacheManagerAgent = winterFlowObjectFrontend.WinterFlowCacheManagerAgent();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
        if (hashMap2 == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("model", Build.MODEL);
        WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("hardware", Build.HARDWARE);
        WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("device", Build.DEVICE);
        WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("product", Build.PRODUCT);
        WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("os-uild", Build.ID);
        WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("manufacturer", Build.MANUFACTURER);
        WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
        if (hashMap3 == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = WinterFlowListenerHelper.WinterFlowVariableVersionControl;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
        if (hashMap4 == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = WinterFlowBatchStructure.WinterFlowVariableVersionControl;
                subtype = 100;
            }
            hashMap = (HashMap) WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
            if (hashMap != null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("country", Locale.getDefault().getCountry());
            WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("locale", Locale.getDefault().getLanguage());
            Context context = this.WinterFlowCacheManagerAgent;
            WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                WinterFlowServerManager.WinterFlowMapperProtocol("CctTransportBackend");
            }
            WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy("application_build", Integer.toString(i2));
            return WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse();
        }
        SparseArray sparseArray3 = WinterFlowBatchStructure.WinterFlowVariableVersionControl;
        subtype = 0;
        hashMap = (HashMap) WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
        if (hashMap != null) {
        }
    }
}
