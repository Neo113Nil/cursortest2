package androidx.versionedparcelable;

import android.os.Build;
import android.os.StrictMode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class TitanCloudOverridingSubroutineReEm4p3rjE7Ggaa8Xg89051994356282 implements NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 {
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    @Override // androidx.versionedparcelable.NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158
    public final Object get() {
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Collections.EMPTY_SET;
            case 1:
                RapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP470716325513648 rapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP470716325513648 = ExecutorsRegistrar.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new BlueKernelServiceProviderS51kvYcCBzYLaR0XMv20139527259171(Executors.newFixedThreadPool(4, new QuantumStreamPostfixComponentEFs6xXx6qIxvqOKZ3070394643310968("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get());
            case 2:
                RapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP470716325513648 rapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP4707163255136482 = ExecutorsRegistrar.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                return new BlueKernelServiceProviderS51kvYcCBzYLaR0XMv20139527259171(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new QuantumStreamPostfixComponentEFs6xXx6qIxvqOKZ3070394643310968("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get());
            case 3:
                RapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP470716325513648 rapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP4707163255136483 = ExecutorsRegistrar.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                return new BlueKernelServiceProviderS51kvYcCBzYLaR0XMv20139527259171(Executors.newCachedThreadPool(new QuantumStreamPostfixComponentEFs6xXx6qIxvqOKZ3070394643310968("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get());
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                RapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP470716325513648 rapidLogicSchedulerJSONPQXDIBZ9My9RJpQGP4707163255136484 = ExecutorsRegistrar.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                return Executors.newSingleThreadScheduledExecutor(new QuantumStreamPostfixComponentEFs6xXx6qIxvqOKZ3070394643310968("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
