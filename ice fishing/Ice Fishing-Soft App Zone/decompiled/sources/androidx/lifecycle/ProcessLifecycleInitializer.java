package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.google.android.datatransport.WinterFlowCacheManagerController;
import com.google.android.datatransport.WinterFlowConcurrencyEventEmitter;
import com.google.android.datatransport.WinterFlowControllerNode;
import com.google.android.datatransport.WinterFlowDataSourceEngine;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowMicroserviceProcess;
import com.google.android.datatransport.WinterFlowObjectPackage;
import com.google.android.datatransport.WinterFlowSyntaxLoader;
import com.google.android.datatransport.WinterFlowXMLEngine;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements WinterFlowCacheManagerController {
    @Override // com.google.android.datatransport.WinterFlowCacheManagerController
    public final Object WinterFlowHookDataSource(Context context) {
        context.getClass();
        WinterFlowObjectPackage WinterFlowServerProtocol = WinterFlowObjectPackage.WinterFlowServerProtocol(context);
        WinterFlowServerProtocol.getClass();
        if (!((HashSet) WinterFlowServerProtocol.WinterFlowUnitTestResponse).contains(ProcessLifecycleInitializer.class)) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!WinterFlowSyntaxLoader.WinterFlowRouterStructure.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new WinterFlowXMLEngine());
        }
        WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter = WinterFlowConcurrencyEventEmitter.WinterFlowThreadListener;
        winterFlowConcurrencyEventEmitter.getClass();
        winterFlowConcurrencyEventEmitter.WinterFlowSyntax = new Handler();
        winterFlowConcurrencyEventEmitter.WinterFlowResponseEngine.WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new WinterFlowControllerNode(winterFlowConcurrencyEventEmitter));
        return winterFlowConcurrencyEventEmitter;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerController
    public final List WinterFlowRouterStructure() {
        return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
    }
}
