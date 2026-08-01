package com.google.android.datatransport;

import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerStrategy {
    public final WinterFlowAlgorithmArray WinterFlowArrayNetwork;
    public final WinterFlowJSONDecorator WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final WinterFlowSessionManagerProcess WinterFlowRouterRouter;
    public final Context WinterFlowRouterStructure;
    public final WinterFlowTransactionManagerStack WinterFlowSyntax;
    public final WinterFlowRepositoryBandwidth WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final WinterFlowEventEmitterLayer WinterFlowVariableVersionControl;
    public static final WinterFlowAlgorithmArray WinterFlowResponseEngine = new WinterFlowAlgorithmArray("ClientNotification.API", new WinterFlowMiddlewareInterface(2), new WinterFlowCacheUtility(25));
    public static final WinterFlowAlgorithmArray WinterFlowTransactionAgent = new WinterFlowAlgorithmArray("ClientTelemetry.API", new WinterFlowMiddlewareInterface(3), new WinterFlowCacheUtility(25));
    public static final WinterFlowAlgorithmArray WinterFlowServerProtocol = new WinterFlowAlgorithmArray("CloudMessaging.API", new WinterFlowMiddlewareInterface(4), new WinterFlowCacheUtility(25));

    public WinterFlowConsumerStrategy(Context context, WinterFlowAlgorithmArray winterFlowAlgorithmArray, WinterFlowEventEmitterLayer winterFlowEventEmitterLayer, WinterFlowMiddlewareSubsystem winterFlowMiddlewareSubsystem) {
        AttributionSource attributionSource;
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(context, "Null context is not permitted.");
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(winterFlowAlgorithmArray, "Api must not be null.");
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(winterFlowMiddlewareSubsystem, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(applicationContext, "The provided context did not have an application context.");
        this.WinterFlowRouterStructure = applicationContext;
        int i = Build.VERSION.SDK_INT;
        WinterFlowJSONDecorator winterFlowJSONDecorator = null;
        String WinterFlowHookDataSource = (i < 30 || i < 30) ? null : WinterFlowDebugPlatform.WinterFlowHookDataSource(context);
        this.WinterFlowHookDataSource = WinterFlowHookDataSource;
        if (i >= 31) {
            attributionSource = context.getAttributionSource();
            winterFlowJSONDecorator = new WinterFlowJSONDecorator(6, attributionSource);
        }
        this.WinterFlowCacheManagerAgent = winterFlowJSONDecorator;
        this.WinterFlowArrayNetwork = winterFlowAlgorithmArray;
        this.WinterFlowVariableVersionControl = winterFlowEventEmitterLayer;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowRepositoryBandwidth(winterFlowAlgorithmArray, winterFlowEventEmitterLayer, WinterFlowHookDataSource);
        WinterFlowTransactionManagerStack WinterFlowCacheManagerAgent = WinterFlowTransactionManagerStack.WinterFlowCacheManagerAgent(applicationContext);
        this.WinterFlowSyntax = WinterFlowCacheManagerAgent;
        this.WinterFlowUnitTestResponse = WinterFlowCacheManagerAgent.WinterFlowRouterRouter.getAndIncrement();
        this.WinterFlowRouterRouter = winterFlowMiddlewareSubsystem.WinterFlowRouterStructure;
        WinterFlowWidgetInterface winterFlowWidgetInterface = WinterFlowCacheManagerAgent.WinterFlowThreadListener;
        winterFlowWidgetInterface.sendMessage(winterFlowWidgetInterface.obtainMessage(7, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowExceptionParser WinterFlowHookDataSource(int i, WinterFlowStrategyVersionControl winterFlowStrategyVersionControl) {
        WinterFlowRefactoringMechanism winterFlowRefactoringMechanism;
        boolean z;
        WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
        WinterFlowExceptionParser winterFlowExceptionParser = winterFlowArrayEngine.WinterFlowRouterStructure;
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = this.WinterFlowRouterRouter;
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowSyntax;
        WinterFlowWidgetInterface winterFlowWidgetInterface = winterFlowTransactionManagerStack.WinterFlowThreadListener;
        int i2 = winterFlowStrategyVersionControl.WinterFlowHookDataSource;
        if (i2 != 0) {
            WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = this.WinterFlowTransactionManagerStrategy;
            if (winterFlowTransactionManagerStack.WinterFlowArrayNetwork()) {
                WinterFlowQueryScript winterFlowQueryScript = (WinterFlowQueryScript) WinterFlowJSONDecorator.WinterFlowRouterRouter().WinterFlowTransactionManagerStrategy;
                if (winterFlowQueryScript == null) {
                    z = true;
                } else if (winterFlowQueryScript.WinterFlowTransactionManagerStrategy) {
                    z = winterFlowQueryScript.WinterFlowUnitTestResponse;
                    WinterFlowCacheTransactionManager winterFlowCacheTransactionManager = (WinterFlowCacheTransactionManager) winterFlowTransactionManagerStack.WinterFlowResponseEngine.get(winterFlowRepositoryBandwidth);
                    if (winterFlowCacheTransactionManager != null) {
                        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = winterFlowCacheTransactionManager.WinterFlowArrayNetwork;
                        if (winterFlowSyntaxEvent instanceof com.google.android.gms.common.internal.WinterFlowSyntaxEvent) {
                            if (winterFlowSyntaxEvent.WinterFlowSerializerStructure != null && !winterFlowSyntaxEvent.WinterFlowThreadListener()) {
                                WinterFlowVariableEngine WinterFlowHookDataSource = WinterFlowRefactoringMechanism.WinterFlowHookDataSource(winterFlowCacheTransactionManager, winterFlowSyntaxEvent, i2);
                                if (WinterFlowHookDataSource != null) {
                                    winterFlowCacheTransactionManager.WinterFlowServiceUtility++;
                                    z = WinterFlowHookDataSource.WinterFlowUnitTestResponse;
                                }
                            }
                        }
                    }
                }
                winterFlowRefactoringMechanism = new WinterFlowRefactoringMechanism(winterFlowTransactionManagerStack, i2, winterFlowRepositoryBandwidth, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
                if (winterFlowRefactoringMechanism != null) {
                    Objects.requireNonNull(winterFlowWidgetInterface);
                    winterFlowExceptionParser.WinterFlowRouterStructure(new WinterFlowSchedulerXML(winterFlowWidgetInterface, 1), winterFlowRefactoringMechanism);
                }
            }
            winterFlowRefactoringMechanism = null;
            if (winterFlowRefactoringMechanism != null) {
            }
        }
        winterFlowWidgetInterface.sendMessage(winterFlowWidgetInterface.obtainMessage(4, new WinterFlowCompilerDataSource(new WinterFlowProviderHandler(i, winterFlowStrategyVersionControl, winterFlowArrayEngine, winterFlowSessionManagerProcess), winterFlowTransactionManagerStack.WinterFlowSyntax.get(), this)));
        return winterFlowExceptionParser;
    }

    public final WinterFlowObjectPackage WinterFlowRouterStructure() {
        WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(6, false);
        Set set = Collections.EMPTY_SET;
        WinterFlowRepositoryDatabase winterFlowRepositoryDatabase = (WinterFlowRepositoryDatabase) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy;
        if (winterFlowRepositoryDatabase == null) {
            winterFlowRepositoryDatabase = new WinterFlowRepositoryDatabase(0);
            winterFlowObjectPackage.WinterFlowTransactionManagerStrategy = winterFlowRepositoryDatabase;
        }
        winterFlowRepositoryDatabase.addAll(set);
        Context context = this.WinterFlowRouterStructure;
        winterFlowObjectPackage.WinterFlowRouterRouter = context.getClass().getName();
        winterFlowObjectPackage.WinterFlowUnitTestResponse = context.getPackageName();
        return winterFlowObjectPackage;
    }
}
