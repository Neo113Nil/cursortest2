package com.google.android.datatransport;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.autofill.AutofillManager;
import android.webkit.WebView;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.GooglePlayInstallReferrerDetails;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.OnGooglePlayInstallReferrerReadListener;
import com.adjust.sdk.ReferrerDetails;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONDecorator implements InstallReferrerReadListener, WinterFlowCompilerMapper, WinterFlowSoftwareStrategy, WinterFlowViewInterface, WinterFlowAPIScheduler {
    public static final WinterFlowWorkerManager WinterFlowResponseEngine;
    public static final WinterFlowQueryScript WinterFlowRouterRouter = new WinterFlowQueryScript(0, false, false, 0, 0);
    public static final WinterFlowJSONDecorator WinterFlowSyntax;
    public static WinterFlowJSONDecorator WinterFlowUnitTestResponse;
    public Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    static {
        int i = 1;
        WinterFlowSyntax = new WinterFlowJSONDecorator(i, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        WinterFlowResponseEngine = new WinterFlowWorkerManager(i);
    }

    public WinterFlowJSONDecorator(int i) {
        WinterFlowVersionControlScheduler winterFlowVersionControlScheduler;
        this.WinterFlowVariableVersionControl = i;
        switch (i) {
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                this.WinterFlowTransactionManagerStrategy = new AtomicInteger(0);
                break;
            case 10:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowNodeDebug(WinterFlowServerManager.WinterFlowResponseEngine);
                break;
            case 15:
                this.WinterFlowTransactionManagerStrategy = WinterFlowHandlerWebsocket.WinterFlowArrayNetwork(1);
                break;
            case 18:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowDatabaseRenderer();
                break;
            case 28:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowThreadJava();
                break;
            default:
                WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
                try {
                    winterFlowVersionControlScheduler = (WinterFlowVersionControlScheduler) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    winterFlowVersionControlScheduler = WinterFlowResponseEngine;
                }
                WinterFlowVersionControlScheduler[] winterFlowVersionControlSchedulerArr = {WinterFlowWorkerManager.WinterFlowHookDataSource, winterFlowVersionControlScheduler};
                WinterFlowSerializerSingleton winterFlowSerializerSingleton = new WinterFlowSerializerSingleton();
                winterFlowSerializerSingleton.WinterFlowRouterStructure = winterFlowVersionControlSchedulerArr;
                Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
                this.WinterFlowTransactionManagerStrategy = winterFlowSerializerSingleton;
                break;
        }
    }

    public static void WinterFlowRouterAdapter(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public static synchronized WinterFlowJSONDecorator WinterFlowRouterRouter() {
        WinterFlowJSONDecorator winterFlowJSONDecorator;
        synchronized (WinterFlowJSONDecorator.class) {
            winterFlowJSONDecorator = WinterFlowUnitTestResponse;
            if (winterFlowJSONDecorator == null) {
                winterFlowJSONDecorator = new WinterFlowJSONDecorator(0, false);
                WinterFlowUnitTestResponse = winterFlowJSONDecorator;
            }
        }
        return winterFlowJSONDecorator;
    }

    public static boolean WinterFlowThreadListener(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public Object WinterFlowArrayNetwork(WinterFlowStackUI winterFlowStackUI, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Object WinterFlowRouterRouter2 = ((WinterFlowCacheManagerNode) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterRouter(winterFlowStackUI, winterFlowTransactionManagerLayer);
        return WinterFlowRouterRouter2 == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowRouterRouter2 : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public Bundle WinterFlowBandwidthObject() {
        Bundle bundle = (Bundle) this.WinterFlowTransactionManagerStrategy;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void WinterFlowBatchUI(WinterFlowStackUI winterFlowStackUI) {
        ((WinterFlowCacheManagerNode) this.WinterFlowTransactionManagerStrategy).WinterFlowConcurrencyThread(winterFlowStackUI);
    }

    public long WinterFlowCacheManagerAgent(long j) {
        WinterFlowThreadJava winterFlowThreadJava = (WinterFlowThreadJava) this.WinterFlowTransactionManagerStrategy;
        if (WinterFlowXMLNetwork.WinterFlowHookDataSource(j) <= 0.0f || WinterFlowXMLNetwork.WinterFlowCacheManagerAgent(j) <= 0.0f) {
            WinterFlowViewUtility.WinterFlowHookDataSource("maximumVelocity should be a positive value. You specified=" + ((Object) WinterFlowXMLNetwork.WinterFlowTransactionManagerStrategy(j)));
        }
        return WinterFlowFrameworkMechanism.WinterFlowCacheManagerAgent(((WinterFlowConcurrencyProxy) winterFlowThreadJava.WinterFlowHookDataSource).WinterFlowHookDataSource(WinterFlowXMLNetwork.WinterFlowHookDataSource(j)), ((WinterFlowConcurrencyProxy) winterFlowThreadJava.WinterFlowCacheManagerAgent).WinterFlowHookDataSource(WinterFlowXMLNetwork.WinterFlowCacheManagerAgent(j)));
    }

    public boolean WinterFlowConcurrencyThread(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (!winterFlowSchedulerStructure.WinterFlowCacheManagerListener()) {
            WinterFlowViewUtility.WinterFlowHookDataSource("DepthSortedSet.remove called on an unattached node");
        }
        return ((WinterFlowNodeDebug) this.WinterFlowTransactionManagerStrategy).remove(winterFlowSchedulerStructure);
    }

    @Override // com.google.android.datatransport.WinterFlowViewInterface
    public WinterFlowDeserializationHandler WinterFlowHookDataSource(String str) {
        str.getClass();
        WinterFlowSyntaxDebug winterFlowSyntaxDebug = (WinterFlowSyntaxDebug) this.WinterFlowTransactionManagerStrategy;
        String databaseName = winterFlowSyntaxDebug.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowResponseEngine("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str)) {
            int lastIndexOf = databaseName.lastIndexOf(47, databaseName.length() - 1);
            if (lastIndexOf != -1) {
                databaseName = databaseName.substring(lastIndexOf + 1, databaseName.length());
            }
            int lastIndexOf2 = str.lastIndexOf(47, str.length() - 1);
            if (!databaseName.equals(lastIndexOf2 == -1 ? str : str.substring(lastIndexOf2 + 1, str.length()))) {
                WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("This driver is configured to open a database named '", winterFlowSyntaxDebug.getDatabaseName(), "' but '", str, "' was requested.");
                return null;
            }
        }
        return new WinterFlowSerializerDatabase(winterFlowSyntaxDebug.WinterFlowEventEmitterController());
    }

    public WinterFlowCacheModule WinterFlowOrchestrationSubsystem(WinterFlowAlgorithmArray winterFlowAlgorithmArray, WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager) {
        long j;
        boolean z;
        long WinterFlowCacheManagerListener;
        WinterFlowDatabaseRenderer winterFlowDatabaseRenderer = (WinterFlowDatabaseRenderer) this.WinterFlowTransactionManagerStrategy;
        ArrayList arrayList = (ArrayList) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy;
        WinterFlowDatabaseRenderer winterFlowDatabaseRenderer2 = new WinterFlowDatabaseRenderer(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WinterFlowClassSubsystem winterFlowClassSubsystem = (WinterFlowClassSubsystem) arrayList.get(i);
            long j2 = winterFlowClassSubsystem.WinterFlowRouterStructure;
            WinterFlowControllerMechanism winterFlowControllerMechanism = (WinterFlowControllerMechanism) winterFlowDatabaseRenderer.WinterFlowHookDataSource(j2);
            if (winterFlowControllerMechanism == null) {
                j = winterFlowClassSubsystem.WinterFlowHookDataSource;
                WinterFlowCacheManagerListener = winterFlowClassSubsystem.WinterFlowArrayNetwork;
                z = false;
            } else {
                long j3 = winterFlowControllerMechanism.WinterFlowRouterStructure;
                j = j3;
                z = winterFlowControllerMechanism.WinterFlowCacheManagerAgent;
                WinterFlowCacheManagerListener = winterFlowSyntaxTransactionManager.WinterFlowCacheManagerListener(winterFlowControllerMechanism.WinterFlowHookDataSource);
            }
            long j4 = winterFlowClassSubsystem.WinterFlowRouterStructure;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            winterFlowDatabaseRenderer2.WinterFlowArrayNetwork(j4, new WinterFlowObjectSystem(j4, winterFlowClassSubsystem.WinterFlowHookDataSource, winterFlowClassSubsystem.WinterFlowArrayNetwork, winterFlowClassSubsystem.WinterFlowVariableVersionControl, winterFlowClassSubsystem.WinterFlowTransactionManagerStrategy, j, WinterFlowCacheManagerListener, z, winterFlowClassSubsystem.WinterFlowUnitTestResponse, winterFlowClassSubsystem.WinterFlowSyntax, winterFlowClassSubsystem.WinterFlowResponseEngine, winterFlowClassSubsystem.WinterFlowTransactionAgent, winterFlowClassSubsystem.WinterFlowServerProtocol, winterFlowClassSubsystem.WinterFlowThreadListener));
            boolean z2 = winterFlowClassSubsystem.WinterFlowVariableVersionControl;
            if (z2) {
                winterFlowDatabaseRenderer.WinterFlowArrayNetwork(j2, new WinterFlowControllerMechanism(winterFlowClassSubsystem.WinterFlowHookDataSource, winterFlowClassSubsystem.WinterFlowCacheManagerAgent, z2));
            } else {
                winterFlowDatabaseRenderer.WinterFlowVariableVersionControl(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new WinterFlowCacheModule(winterFlowDatabaseRenderer2, winterFlowAlgorithmArray);
    }

    public JSONArray WinterFlowResponseEngine(String str) {
        String WinterFlowServerProtocol = WinterFlowServerProtocol(str);
        if (TextUtils.isEmpty(WinterFlowServerProtocol)) {
            return null;
        }
        try {
            return new JSONArray(WinterFlowServerProtocol);
        } catch (JSONException unused) {
            WinterFlowRouterAdapter(str);
            return null;
        }
    }

    public void WinterFlowRouterStructure(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (!winterFlowSchedulerStructure.WinterFlowCacheManagerListener()) {
            WinterFlowViewUtility.WinterFlowHookDataSource("DepthSortedSet.add called on an unattached node");
        }
        ((WinterFlowNodeDebug) this.WinterFlowTransactionManagerStrategy).add(winterFlowSchedulerStructure);
    }

    public void WinterFlowSerializerStructure(int i, Object obj, WinterFlowServerSyntax winterFlowServerSyntax) {
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) this.WinterFlowTransactionManagerStrategy;
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 3);
        winterFlowServerSyntax.WinterFlowHookDataSource((WinterFlowHookBackend) obj, winterFlowSessionManagerSingleton.WinterFlowRouterStructure);
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 4);
    }

    public String WinterFlowServerProtocol(String str) {
        Bundle bundle = (Bundle) this.WinterFlowTransactionManagerStrategy;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void WinterFlowServiceUtility(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.WinterFlowTransactionManagerStrategy).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public Object WinterFlowSingletonPlatform(WinterFlowFrameworkAgent winterFlowFrameworkAgent, WinterFlowRouterEngine winterFlowRouterEngine) {
        WinterFlowMapperBackend winterFlowMapperBackend;
        WinterFlowInvokerPlatform winterFlowInvokerPlatform;
        int i;
        if (((WinterFlowPackageConsumer) this.WinterFlowTransactionManagerStrategy) == null) {
            WinterFlowResponseCloud.WinterFlowHookDataSource("Called runAndWatch on a manager that has been disposed of");
        }
        WinterFlowPackageConsumer winterFlowPackageConsumer = (WinterFlowPackageConsumer) this.WinterFlowTransactionManagerStrategy;
        if ((winterFlowPackageConsumer instanceof WinterFlowMapperBackend) && (winterFlowInvokerPlatform = (winterFlowMapperBackend = (WinterFlowMapperBackend) winterFlowPackageConsumer).WinterFlowTransactionManagerStrategy) != null && !winterFlowInvokerPlatform.equals(winterFlowFrameworkAgent)) {
            WinterFlowHookHelper winterFlowHookHelper = new WinterFlowHookHelper();
            WinterFlowInvokerPlatform winterFlowInvokerPlatform2 = winterFlowMapperBackend.WinterFlowTransactionManagerStrategy;
            if (winterFlowInvokerPlatform2 == null) {
                WinterFlowResponseCloud.WinterFlowHookDataSource("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = winterFlowMapperBackend.WinterFlowArrayNetwork;
            ArrayList arrayList = winterFlowHookHelper.WinterFlowCacheManagerAgent;
            if (winterFlowCacheManagerTransactionManager == null) {
                Object obj = winterFlowMapperBackend.WinterFlowHookDataSource;
                obj.getClass();
                arrayList.add(new WinterFlowServerStack(obj, winterFlowInvokerPlatform2));
            } else {
                Object[] objArr = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
                long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new WinterFlowServerStack(objArr[(i2 << 3) + i5], winterFlowInvokerPlatform2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            winterFlowHookHelper.WinterFlowVariableVersionControl();
            winterFlowMapperBackend.WinterFlowTransactionManagerStrategy();
            this.WinterFlowTransactionManagerStrategy = winterFlowHookHelper;
        }
        WinterFlowPackageConsumer winterFlowPackageConsumer2 = (WinterFlowPackageConsumer) this.WinterFlowTransactionManagerStrategy;
        winterFlowPackageConsumer2.getClass();
        WinterFlowJSONModule WinterFlowRouterAdapter = WinterFlowVersionProtocol.WinterFlowRouterRouter().WinterFlowRouterAdapter(winterFlowPackageConsumer2.WinterFlowVariableBandwidth(winterFlowFrameworkAgent));
        winterFlowPackageConsumer2.WinterFlowArrayNetwork(winterFlowFrameworkAgent);
        try {
            WinterFlowJSONModule WinterFlowResponseEngine2 = WinterFlowRouterAdapter.WinterFlowResponseEngine();
            try {
                Object WinterFlowRouterStructure = winterFlowRouterEngine.WinterFlowRouterStructure();
                WinterFlowRouterAdapter.WinterFlowCacheManagerAgent();
                winterFlowPackageConsumer2.WinterFlowVariableVersionControl();
                return WinterFlowRouterStructure;
            } finally {
                WinterFlowJSONModule.WinterFlowConcurrencyThread(WinterFlowResponseEngine2);
            }
        } catch (Throwable th) {
            WinterFlowRouterAdapter.WinterFlowCacheManagerAgent();
            throw th;
        }
    }

    public Integer WinterFlowSyntax(String str) {
        String WinterFlowServerProtocol = WinterFlowServerProtocol(str);
        if (TextUtils.isEmpty(WinterFlowServerProtocol)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(WinterFlowServerProtocol));
        } catch (NumberFormatException unused) {
            WinterFlowRouterAdapter(str);
            return null;
        }
    }

    public String WinterFlowTransactionAgent(Resources resources, String str, String str2) {
        String[] strArr;
        String WinterFlowServerProtocol = WinterFlowServerProtocol(str2);
        if (!TextUtils.isEmpty(WinterFlowServerProtocol)) {
            return WinterFlowServerProtocol;
        }
        String WinterFlowServerProtocol2 = WinterFlowServerProtocol(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(WinterFlowServerProtocol2)) {
            return null;
        }
        int identifier = resources.getIdentifier(WinterFlowServerProtocol2, "string", str);
        if (identifier == 0) {
            WinterFlowRouterAdapter(str2.concat("_loc_key"));
            return null;
        }
        JSONArray WinterFlowResponseEngine2 = WinterFlowResponseEngine(str2.concat("_loc_args"));
        if (WinterFlowResponseEngine2 == null) {
            strArr = null;
        } else {
            int length = WinterFlowResponseEngine2.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = WinterFlowResponseEngine2.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            WinterFlowRouterAdapter(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowViewInterface
    public boolean WinterFlowTransactionManagerStrategy() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerMapper
    public Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowRepositoryOrchestration winterFlowRepositoryOrchestration = (WinterFlowRepositoryOrchestration) obj;
        WebView webView = winterFlowRepositoryOrchestration.WinterFlowRouterStructure;
        WebView webView2 = new WebView(webView.getContext());
        ((WinterFlowObjectSession) this.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(webView2);
        webView2.getSettings().setUserAgentString(webView.getSettings().getUserAgentString());
        Message message = winterFlowRepositoryOrchestration.WinterFlowHookDataSource;
        try {
            Object obj2 = message.obj;
            obj2.getClass();
            ((WebView.WebViewTransport) obj2).setWebView(webView2);
            message.sendToTarget();
            ViewParent parent = webView.getParent();
            parent.getClass();
            ((ViewGroup) parent).addView(webView2);
        } catch (Throwable unused) {
        }
        return Boolean.TRUE;
    }

    public void WinterFlowVariableBandwidth(Exception exc) {
        WinterFlowGatewayStructure winterFlowGatewayStructure = (WinterFlowGatewayStructure) this.WinterFlowTransactionManagerStrategy;
        if (WinterFlowThreadHelper.WinterFlowResponseEngine.WinterFlowBatchUI(winterFlowGatewayStructure, null, new WinterFlowNodeAgent(exc))) {
            WinterFlowThreadHelper.WinterFlowCacheManagerAgent(winterFlowGatewayStructure);
        }
    }

    public boolean WinterFlowVariableVersionControl(String str) {
        String WinterFlowServerProtocol = WinterFlowServerProtocol(str);
        return "1".equals(WinterFlowServerProtocol) || Boolean.parseBoolean(WinterFlowServerProtocol);
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        switch (this.WinterFlowVariableVersionControl) {
            case 14:
                return this.WinterFlowTransactionManagerStrategy;
            default:
                return new WinterFlowVersionControlTransaction(Integer.valueOf(WinterFlowVersionControlTransaction.WinterFlowRouterRouter).intValue(), (Context) ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionManagerStrategy).get(), "com.google.android.datatransport.events");
        }
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onFail(String str) {
        ILogger iLogger;
        switch (this.WinterFlowVariableVersionControl) {
            case 3:
                iLogger = ((ActivityHandler) this.WinterFlowTransactionManagerStrategy).logger;
                iLogger.debug(str, new Object[0]);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.WinterFlowTransactionManagerStrategy).onFail(str);
                break;
        }
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
        switch (this.WinterFlowVariableVersionControl) {
            case 3:
                ((ActivityHandler) this.WinterFlowTransactionManagerStrategy).sendInstallReferrer(referrerDetails, str);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.WinterFlowTransactionManagerStrategy).onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
                break;
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                return "Bradford";
            case 10:
                return ((WinterFlowNodeDebug) this.WinterFlowTransactionManagerStrategy).toString();
            case 25:
                return "<" + ((String) this.WinterFlowTransactionManagerStrategy) + '>';
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAPIScheduler
    public WinterFlowSingletonProcess get(int i) {
        switch (this.WinterFlowVariableVersionControl) {
            case 26:
                return ((WinterFlowClassMechanism[]) this.WinterFlowTransactionManagerStrategy)[i];
            default:
                return (WinterFlowSingletonProcess) this.WinterFlowTransactionManagerStrategy;
        }
    }

    public /* synthetic */ WinterFlowJSONDecorator(int i, boolean z) {
        this.WinterFlowVariableVersionControl = i;
    }

    public WinterFlowJSONDecorator(WinterFlowEncryptionSystem winterFlowEncryptionSystem) {
        this.WinterFlowVariableVersionControl = 8;
        winterFlowEncryptionSystem.getClass();
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionSystem;
    }

    public WinterFlowJSONDecorator(WinterFlowDecoratorVersion winterFlowDecoratorVersion) {
        this.WinterFlowVariableVersionControl = 29;
        this.WinterFlowTransactionManagerStrategy = new WeakReference(winterFlowDecoratorVersion);
    }

    public WinterFlowJSONDecorator(WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        this.WinterFlowVariableVersionControl = 23;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowParserUI(WinterFlowAlgorithmInterface.WinterFlowRouterStructure, winterFlowConcurrencyParser);
    }

    public WinterFlowJSONDecorator(WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton) {
        this.WinterFlowVariableVersionControl = 7;
        Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
        this.WinterFlowTransactionManagerStrategy = winterFlowSessionManagerSingleton;
        winterFlowSessionManagerSingleton.WinterFlowRouterStructure = this;
    }

    public WinterFlowJSONDecorator(WinterFlowSyntaxDebug winterFlowSyntaxDebug) {
        this.WinterFlowVariableVersionControl = 24;
        winterFlowSyntaxDebug.getClass();
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxDebug;
    }

    public WinterFlowJSONDecorator(Bundle bundle) {
        this.WinterFlowVariableVersionControl = 16;
        this.WinterFlowTransactionManagerStrategy = new Bundle(bundle);
    }

    public /* synthetic */ WinterFlowJSONDecorator(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    public WinterFlowJSONDecorator(WinterFlowConfigurationResponse winterFlowConfigurationResponse, float f) {
        this.WinterFlowVariableVersionControl = 26;
        int WinterFlowHookDataSource = winterFlowConfigurationResponse.WinterFlowHookDataSource();
        WinterFlowClassMechanism[] winterFlowClassMechanismArr = new WinterFlowClassMechanism[WinterFlowHookDataSource];
        for (int i = 0; i < WinterFlowHookDataSource; i++) {
            winterFlowClassMechanismArr[i] = new WinterFlowClassMechanism(f, winterFlowConfigurationResponse.WinterFlowRouterStructure(i));
        }
        this.WinterFlowTransactionManagerStrategy = winterFlowClassMechanismArr;
    }
}
