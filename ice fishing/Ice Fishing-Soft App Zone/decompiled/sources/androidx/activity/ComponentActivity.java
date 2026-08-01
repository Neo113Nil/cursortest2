package androidx.activity;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.WinterFlowAPISystem;
import com.google.android.datatransport.WinterFlowAdapterBackend;
import com.google.android.datatransport.WinterFlowAlgorithmArray;
import com.google.android.datatransport.WinterFlowAlgorithmWorker;
import com.google.android.datatransport.WinterFlowArrayDeserialization;
import com.google.android.datatransport.WinterFlowBackendWorker;
import com.google.android.datatransport.WinterFlowCacheManagerVersionControl;
import com.google.android.datatransport.WinterFlowCloudStack;
import com.google.android.datatransport.WinterFlowConfigurationHandler;
import com.google.android.datatransport.WinterFlowConfigurationModule;
import com.google.android.datatransport.WinterFlowControllerModule;
import com.google.android.datatransport.WinterFlowDataSourceLayer;
import com.google.android.datatransport.WinterFlowDatabaseProtocol;
import com.google.android.datatransport.WinterFlowDatabaseUtility;
import com.google.android.datatransport.WinterFlowDecoratorMechanism;
import com.google.android.datatransport.WinterFlowDecoratorThreadPool;
import com.google.android.datatransport.WinterFlowEventEmitterHelper;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowExceptionBandwidth;
import com.google.android.datatransport.WinterFlowExceptionProxy;
import com.google.android.datatransport.WinterFlowFrontendManager;
import com.google.android.datatransport.WinterFlowHookProcessor;
import com.google.android.datatransport.WinterFlowJSONEntity;
import com.google.android.datatransport.WinterFlowLoaderTool;
import com.google.android.datatransport.WinterFlowManagerRequest;
import com.google.android.datatransport.WinterFlowModuleDataSource;
import com.google.android.datatransport.WinterFlowNodeGateway;
import com.google.android.datatransport.WinterFlowNodeProtocol;
import com.google.android.datatransport.WinterFlowObjectUI;
import com.google.android.datatransport.WinterFlowProviderCacheManager;
import com.google.android.datatransport.WinterFlowQuerySyntax;
import com.google.android.datatransport.WinterFlowQueueDatabaseSchema;
import com.google.android.datatransport.WinterFlowQueueEntity;
import com.google.android.datatransport.WinterFlowQueueSingleton;
import com.google.android.datatransport.WinterFlowRefactoringSessionManager;
import com.google.android.datatransport.WinterFlowRendererNode;
import com.google.android.datatransport.WinterFlowResolverProcess;
import com.google.android.datatransport.WinterFlowResponseTransactionManager;
import com.google.android.datatransport.WinterFlowScriptManager;
import com.google.android.datatransport.WinterFlowServiceProviderThreadPool;
import com.google.android.datatransport.WinterFlowSingletonPlatform;
import com.google.android.datatransport.WinterFlowStackProvider;
import com.google.android.datatransport.WinterFlowTestingRepository;
import com.google.android.datatransport.WinterFlowThreadPoolProcess;
import com.google.android.datatransport.WinterFlowUserManagerUserManager;
import com.google.android.datatransport.WinterFlowVariableComponent;
import com.google.android.datatransport.WinterFlowViewRenderer;
import com.google.android.datatransport.WinterFlowWidgetEngine;
import com.google.android.datatransport.WinterFlowWorkerEncryption;
import com.icewinter.flow.winter.icecatch.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements WinterFlowProviderCacheManager, WinterFlowModuleDataSource, WinterFlowExceptionProxy, WinterFlowArrayDeserialization, WinterFlowSingletonPlatform, WinterFlowAlgorithmWorker {
    public static final /* synthetic */ int WinterFlowBackendCacheManager = 0;
    public final CopyOnWriteArrayList WinterFlowBandwidthObject;
    public final CopyOnWriteArrayList WinterFlowBatchUI;
    public final CopyOnWriteArrayList WinterFlowConcurrencyThread;
    public final WinterFlowRendererNode WinterFlowConsumerUserManager;
    public final WinterFlowRendererNode WinterFlowMapperProtocol;
    public final CopyOnWriteArrayList WinterFlowOrchestrationSubsystem;
    public final WinterFlowRendererNode WinterFlowResolverController;
    public final WinterFlowQueueSingleton WinterFlowResponseEngine;
    public boolean WinterFlowRouterAdapter;
    public final WinterFlowCacheManagerVersionControl WinterFlowRouterRouter;
    public boolean WinterFlowSerializerStructure;
    public final AtomicInteger WinterFlowServerProtocol;
    public final CopyOnWriteArrayList WinterFlowServiceUtility;
    public final CopyOnWriteArrayList WinterFlowSingletonPlatform;
    public WinterFlowScriptManager WinterFlowSyntax;
    public final WinterFlowResolverProcess WinterFlowThreadListener;
    public final WinterFlowRendererNode WinterFlowTransactionAgent;
    public final WinterFlowLoaderTool WinterFlowTransactionManagerStrategy;
    public final WinterFlowConfigurationModule WinterFlowUnitTestResponse;
    public final CopyOnWriteArrayList WinterFlowVariableBandwidth;

    public ComponentActivity() {
        WinterFlowLoaderTool winterFlowLoaderTool = new WinterFlowLoaderTool();
        this.WinterFlowTransactionManagerStrategy = winterFlowLoaderTool;
        final int i = 1;
        this.WinterFlowUnitTestResponse = new WinterFlowConfigurationModule(new WinterFlowDecoratorMechanism(this, 1));
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = new WinterFlowCacheManagerVersionControl(new WinterFlowNodeGateway(this, new WinterFlowAPISystem(18, this)));
        this.WinterFlowRouterRouter = winterFlowCacheManagerVersionControl;
        this.WinterFlowResponseEngine = new WinterFlowQueueSingleton(this);
        this.WinterFlowTransactionAgent = new WinterFlowRendererNode(new WinterFlowDataSourceLayer(this, i));
        this.WinterFlowServerProtocol = new AtomicInteger();
        this.WinterFlowThreadListener = new WinterFlowResolverProcess(this);
        this.WinterFlowServiceUtility = new CopyOnWriteArrayList();
        this.WinterFlowBandwidthObject = new CopyOnWriteArrayList();
        this.WinterFlowOrchestrationSubsystem = new CopyOnWriteArrayList();
        this.WinterFlowConcurrencyThread = new CopyOnWriteArrayList();
        this.WinterFlowSingletonPlatform = new CopyOnWriteArrayList();
        this.WinterFlowVariableBandwidth = new CopyOnWriteArrayList();
        this.WinterFlowBatchUI = new CopyOnWriteArrayList();
        this.WinterFlowMapperProtocol = new WinterFlowRendererNode(new WinterFlowDataSourceLayer(this, 2));
        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseUtility == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        winterFlowDatabaseUtility.WinterFlowRouterStructure(new WinterFlowNodeProtocol(this) { // from class: com.google.android.datatransport.WinterFlowServiceEntity
            public final /* synthetic */ ComponentActivity WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowNodeProtocol
            public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
                Window window;
                View peekDecorView;
                int i3 = i2;
                ComponentActivity componentActivity = this.WinterFlowTransactionManagerStrategy;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        int i4 = ComponentActivity.WinterFlowBackendCacheManager;
                        if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        int i5 = ComponentActivity.WinterFlowBackendCacheManager;
                        if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_DESTROY) {
                            componentActivity.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource = null;
                            if (!componentActivity.isChangingConfigurations()) {
                                componentActivity.WinterFlowTransactionManagerStrategy().WinterFlowRouterStructure();
                            }
                            WinterFlowQueueSingleton winterFlowQueueSingleton = componentActivity.WinterFlowResponseEngine;
                            ComponentActivity componentActivity2 = winterFlowQueueSingleton.WinterFlowRouterRouter;
                            componentActivity2.getWindow().getDecorView().removeCallbacks(winterFlowQueueSingleton);
                            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(winterFlowQueueSingleton);
                            break;
                        }
                        break;
                }
            }
        });
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(new WinterFlowNodeProtocol(this) { // from class: com.google.android.datatransport.WinterFlowServiceEntity
            public final /* synthetic */ ComponentActivity WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowNodeProtocol
            public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
                Window window;
                View peekDecorView;
                int i3 = i;
                ComponentActivity componentActivity = this.WinterFlowTransactionManagerStrategy;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        int i4 = ComponentActivity.WinterFlowBackendCacheManager;
                        if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        int i5 = ComponentActivity.WinterFlowBackendCacheManager;
                        if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_DESTROY) {
                            componentActivity.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource = null;
                            if (!componentActivity.isChangingConfigurations()) {
                                componentActivity.WinterFlowTransactionManagerStrategy().WinterFlowRouterStructure();
                            }
                            WinterFlowQueueSingleton winterFlowQueueSingleton = componentActivity.WinterFlowResponseEngine;
                            ComponentActivity componentActivity2 = winterFlowQueueSingleton.WinterFlowRouterRouter;
                            componentActivity2.getWindow().getDecorView().removeCallbacks(winterFlowQueueSingleton);
                            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(winterFlowQueueSingleton);
                            break;
                        }
                        break;
                }
            }
        });
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(new WinterFlowVariableComponent(i, this));
        winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy();
        WinterFlowCloudStack.WinterFlowConcurrencyThread(this);
        ((WinterFlowAlgorithmArray) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse).WinterFlowArrayHelper("android:support:activity-result", new WinterFlowTestingRepository(i2, this));
        WinterFlowJSONEntity winterFlowJSONEntity = new WinterFlowJSONEntity(this);
        ComponentActivity componentActivity = winterFlowLoaderTool.WinterFlowHookDataSource;
        if (componentActivity != null) {
            winterFlowJSONEntity.WinterFlowRouterStructure(componentActivity);
        }
        winterFlowLoaderTool.WinterFlowRouterStructure.add(winterFlowJSONEntity);
        this.WinterFlowResolverController = new WinterFlowRendererNode(new WinterFlowDataSourceLayer(this, 3));
        this.WinterFlowConsumerUserManager = new WinterFlowRendererNode(new WinterFlowDataSourceLayer(this, 4));
    }

    public static final void WinterFlowSyntax(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowModuleDataSource
    public final WinterFlowUserManagerUserManager WinterFlowArrayNetwork() {
        return (WinterFlowUserManagerUserManager) this.WinterFlowResolverController.getValue();
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonPlatform
    public final WinterFlowStackProvider WinterFlowCacheManagerAgent() {
        return WinterFlowRouterStructure().WinterFlowRouterStructure().WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionProxy
    public final WinterFlowAlgorithmArray WinterFlowHookDataSource() {
        return (WinterFlowAlgorithmArray) this.WinterFlowRouterRouter.WinterFlowUnitTestResponse;
    }

    public final WinterFlowControllerModule WinterFlowResponseEngine(final WinterFlowExceptionBandwidth winterFlowExceptionBandwidth, final WinterFlowQuerySyntax winterFlowQuerySyntax) {
        final WinterFlowResolverProcess winterFlowResolverProcess = this.WinterFlowThreadListener;
        winterFlowResolverProcess.getClass();
        final String str = "activity_rq#" + this.WinterFlowServerProtocol.getAndIncrement();
        LinkedHashMap linkedHashMap = winterFlowResolverProcess.WinterFlowCacheManagerAgent;
        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseUtility.WinterFlowSyntax.compareTo(WinterFlowDatabaseProtocol.WinterFlowRouterRouter) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = winterFlowDatabaseUtility.WinterFlowSyntax;
            sb.append(" is attempting to register while current state is ");
            sb.append(winterFlowDatabaseProtocol);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        winterFlowResolverProcess.WinterFlowCacheManagerAgent(str);
        WinterFlowQueueEntity winterFlowQueueEntity = (WinterFlowQueueEntity) linkedHashMap.get(str);
        if (winterFlowQueueEntity == null) {
            winterFlowQueueEntity = new WinterFlowQueueEntity(winterFlowDatabaseUtility);
        }
        WinterFlowNodeProtocol winterFlowNodeProtocol = new WinterFlowNodeProtocol() { // from class: com.google.android.datatransport.WinterFlowObjectStructure
            @Override // com.google.android.datatransport.WinterFlowNodeProtocol
            public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
                WinterFlowMicroserviceProcess winterFlowMicroserviceProcess2 = WinterFlowMicroserviceProcess.ON_START;
                WinterFlowResolverProcess winterFlowResolverProcess2 = WinterFlowResolverProcess.this;
                String str2 = str;
                if (winterFlowMicroserviceProcess2 != winterFlowMicroserviceProcess) {
                    if (WinterFlowMicroserviceProcess.ON_STOP == winterFlowMicroserviceProcess) {
                        winterFlowResolverProcess2.WinterFlowVariableVersionControl.remove(str2);
                        return;
                    } else {
                        if (WinterFlowMicroserviceProcess.ON_DESTROY == winterFlowMicroserviceProcess) {
                            winterFlowResolverProcess2.WinterFlowArrayNetwork(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = winterFlowResolverProcess2.WinterFlowVariableVersionControl;
                Bundle bundle = winterFlowResolverProcess2.WinterFlowUnitTestResponse;
                LinkedHashMap linkedHashMap3 = winterFlowResolverProcess2.WinterFlowTransactionManagerStrategy;
                WinterFlowExceptionBandwidth winterFlowExceptionBandwidth2 = winterFlowExceptionBandwidth;
                WinterFlowQuerySyntax winterFlowQuerySyntax2 = winterFlowQuerySyntax;
                linkedHashMap2.put(str2, new WinterFlowRefactoringAPI(winterFlowExceptionBandwidth2, winterFlowQuerySyntax2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    winterFlowExceptionBandwidth2.WinterFlowTransactionManagerStrategy(obj);
                }
                WinterFlowScriptVersion winterFlowScriptVersion = (WinterFlowScriptVersion) WinterFlowServerManager.WinterFlowBatchUI(bundle, str2);
                if (winterFlowScriptVersion != null) {
                    bundle.remove(str2);
                    winterFlowExceptionBandwidth2.WinterFlowTransactionManagerStrategy(winterFlowQuerySyntax2.WinterFlowEventEmitterController(winterFlowScriptVersion.WinterFlowTransactionManagerStrategy, winterFlowScriptVersion.WinterFlowVariableVersionControl));
                }
            }
        };
        winterFlowQueueEntity.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowNodeProtocol);
        winterFlowQueueEntity.WinterFlowHookDataSource.add(winterFlowNodeProtocol);
        linkedHashMap.put(str, winterFlowQueueEntity);
        return new WinterFlowControllerModule(winterFlowResolverProcess, str, winterFlowQuerySyntax, 0);
    }

    public final void WinterFlowRouterRouter() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // com.google.android.datatransport.WinterFlowArrayDeserialization
    public final WinterFlowViewRenderer WinterFlowRouterStructure() {
        return (WinterFlowViewRenderer) this.WinterFlowConsumerUserManager.getValue();
    }

    @Override // com.google.android.datatransport.WinterFlowProviderCacheManager
    public final WinterFlowScriptManager WinterFlowTransactionManagerStrategy() {
        if (getApplication() == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        WinterFlowScriptManager winterFlowScriptManager = this.WinterFlowSyntax;
        if (winterFlowScriptManager == null) {
            WinterFlowQueueDatabaseSchema winterFlowQueueDatabaseSchema = (WinterFlowQueueDatabaseSchema) getLastNonConfigurationInstance();
            if (winterFlowQueueDatabaseSchema != null) {
                this.WinterFlowSyntax = winterFlowQueueDatabaseSchema.WinterFlowRouterStructure;
            }
            winterFlowScriptManager = this.WinterFlowSyntax;
            if (winterFlowScriptManager == null) {
                winterFlowScriptManager = new WinterFlowScriptManager();
                this.WinterFlowSyntax = winterFlowScriptManager;
            }
        }
        winterFlowScriptManager.getClass();
        return winterFlowScriptManager;
    }

    @Override // androidx.core.app.ComponentActivity, com.google.android.datatransport.WinterFlowDecoratorVersion
    public final WinterFlowDatabaseUtility WinterFlowUnitTestResponse() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleDataSource
    public final WinterFlowEventEmitterHelper WinterFlowVariableVersionControl() {
        WinterFlowServiceProviderThreadPool winterFlowServiceProviderThreadPool = new WinterFlowServiceProviderThreadPool(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = winterFlowServiceProviderThreadPool.WinterFlowRouterStructure;
        if (application != null) {
            linkedHashMap.put(WinterFlowResponseTransactionManager.WinterFlowArrayNetwork, getApplication());
        }
        linkedHashMap.put(WinterFlowCloudStack.WinterFlowArrayNetwork, this);
        linkedHashMap.put(WinterFlowCloudStack.WinterFlowVariableVersionControl, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(WinterFlowCloudStack.WinterFlowTransactionManagerStrategy, extras);
        }
        return winterFlowServiceProviderThreadPool;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        WinterFlowRouterRouter();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.WinterFlowResponseEngine.WinterFlowRouterStructure(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.WinterFlowThreadListener.WinterFlowRouterStructure(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((WinterFlowFrontendManager) this.WinterFlowMapperProtocol.getValue()).WinterFlowRouterStructure();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.WinterFlowServiceUtility.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((WinterFlowDecoratorThreadPool) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.WinterFlowRouterRouter.WinterFlowUnitTestResponse(bundle);
        WinterFlowLoaderTool winterFlowLoaderTool = this.WinterFlowTransactionManagerStrategy;
        winterFlowLoaderTool.getClass();
        winterFlowLoaderTool.WinterFlowHookDataSource = this;
        Iterator it = winterFlowLoaderTool.WinterFlowRouterStructure.iterator();
        while (it.hasNext()) {
            ((WinterFlowJSONEntity) it.next()).WinterFlowRouterStructure(this);
        }
        super.onCreate(bundle);
        int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
        WinterFlowConfigurationHandler.WinterFlowHookDataSource(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((WinterFlowWidgetEngine) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((WinterFlowWidgetEngine) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.WinterFlowRouterAdapter = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.WinterFlowRouterAdapter = false;
            Iterator it = this.WinterFlowConcurrencyThread.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((WinterFlowDecoratorThreadPool) it.next()).accept(new WinterFlowBackendWorker(z));
            }
        } catch (Throwable th) {
            this.WinterFlowRouterAdapter = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.WinterFlowOrchestrationSubsystem.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((WinterFlowDecoratorThreadPool) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy).iterator();
        if (it.hasNext()) {
            ((WinterFlowWidgetEngine) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.WinterFlowSerializerStructure = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.WinterFlowSerializerStructure = false;
            Iterator it = this.WinterFlowSingletonPlatform.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((WinterFlowDecoratorThreadPool) it.next()).accept(new WinterFlowAdapterBackend(z));
            }
        } catch (Throwable th) {
            this.WinterFlowSerializerStructure = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 16;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(i2);
        } else {
            winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(i2);
        }
        Iterator it = this.WinterFlowVariableBandwidth.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((WinterFlowDecoratorThreadPool) it.next()).accept(winterFlowThreadPoolProcess);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((WinterFlowWidgetEngine) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.WinterFlowThreadListener.WinterFlowRouterStructure(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        WinterFlowQueueDatabaseSchema winterFlowQueueDatabaseSchema;
        WinterFlowScriptManager winterFlowScriptManager = this.WinterFlowSyntax;
        if (winterFlowScriptManager == null && (winterFlowQueueDatabaseSchema = (WinterFlowQueueDatabaseSchema) getLastNonConfigurationInstance()) != null) {
            winterFlowScriptManager = winterFlowQueueDatabaseSchema.WinterFlowRouterStructure;
        }
        if (winterFlowScriptManager == null) {
            return null;
        }
        WinterFlowQueueDatabaseSchema winterFlowQueueDatabaseSchema2 = new WinterFlowQueueDatabaseSchema();
        winterFlowQueueDatabaseSchema2.WinterFlowRouterStructure = winterFlowScriptManager;
        return winterFlowQueueDatabaseSchema2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseUtility != null) {
            winterFlowDatabaseUtility.WinterFlowUnitTestResponse(WinterFlowDatabaseProtocol.WinterFlowUnitTestResponse);
        }
        super.onSaveInstanceState(bundle);
        this.WinterFlowRouterRouter.WinterFlowRouterRouter(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.WinterFlowBandwidthObject.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((WinterFlowDecoratorThreadPool) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.WinterFlowBatchUI.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (WinterFlowHookProcessor.WinterFlowThreadListener()) {
                WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            WinterFlowWorkerEncryption winterFlowWorkerEncryption = (WinterFlowWorkerEncryption) this.WinterFlowTransactionAgent.getValue();
            synchronized (winterFlowWorkerEncryption.WinterFlowRouterStructure) {
                try {
                    winterFlowWorkerEncryption.WinterFlowHookDataSource = true;
                    ArrayList arrayList = winterFlowWorkerEncryption.WinterFlowCacheManagerAgent;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((WinterFlowObjectUI) obj).WinterFlowRouterStructure();
                    }
                    winterFlowWorkerEncryption.WinterFlowCacheManagerAgent.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        WinterFlowRouterRouter();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.WinterFlowResponseEngine.WinterFlowRouterStructure(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        WinterFlowRouterRouter();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.WinterFlowResponseEngine.WinterFlowRouterStructure(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        WinterFlowRouterRouter();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.WinterFlowResponseEngine.WinterFlowRouterStructure(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.WinterFlowRouterAdapter) {
            return;
        }
        Iterator it = this.WinterFlowConcurrencyThread.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((WinterFlowDecoratorThreadPool) it.next()).accept(new WinterFlowBackendWorker(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.WinterFlowSerializerStructure) {
            return;
        }
        Iterator it = this.WinterFlowSingletonPlatform.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((WinterFlowDecoratorThreadPool) it.next()).accept(new WinterFlowAdapterBackend(z));
        }
    }
}
