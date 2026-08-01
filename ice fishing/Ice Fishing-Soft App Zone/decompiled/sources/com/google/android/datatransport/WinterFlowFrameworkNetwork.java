package com.google.android.datatransport;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkNetwork extends WinterFlowUnitTestRouter implements WinterFlowDataSourceHelper {
    public final WinterFlowFrameworkNetwork WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public final boolean WinterFlowSyntax;
    public final Handler WinterFlowUnitTestResponse;

    public WinterFlowFrameworkNetwork(Handler handler, String str, boolean z) {
        this.WinterFlowUnitTestResponse = handler;
        this.WinterFlowRouterRouter = str;
        this.WinterFlowSyntax = z;
        this.WinterFlowResponseEngine = z ? this : new WinterFlowFrameworkNetwork(handler, str, true);
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final boolean WinterFlowCacheManagerListener(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return (this.WinterFlowSyntax && WinterFlowManagerRequest.WinterFlowThreadListener(Looper.myLooper(), this.WinterFlowUnitTestResponse.getLooper())) ? false : true;
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowConfigurationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        if (this.WinterFlowUnitTestResponse.post(runnable)) {
            return;
        }
        WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice, runnable);
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public final void WinterFlowRouterRouter(long j, WinterFlowEventCloud winterFlowEventCloud) {
        WinterFlowValidatorSystem winterFlowValidatorSystem = new WinterFlowValidatorSystem(22, winterFlowEventCloud, this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.WinterFlowUnitTestResponse.postDelayed(winterFlowValidatorSystem, j)) {
            winterFlowEventCloud.WinterFlowResolverController(new WinterFlowRouterCompiler(13, this, winterFlowValidatorSystem));
        } else {
            WinterFlowSoftwareProtocol(winterFlowEventCloud.WinterFlowSyntax, winterFlowValidatorSystem);
        }
    }

    public final void WinterFlowSoftwareProtocol(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        WinterFlowInvokerComponent.WinterFlowThreadListener(winterFlowEncryptionMicroservice, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
        WinterFlowInheritanceFramework.WinterFlowUnitTestResponse.WinterFlowConfigurationSubsystem(winterFlowEncryptionMicroservice, runnable);
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public final WinterFlowVersionControlView WinterFlowTransactionManagerStrategy(long j, final Runnable runnable, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.WinterFlowUnitTestResponse.postDelayed(runnable, j)) {
            return new WinterFlowVersionControlView() { // from class: com.google.android.datatransport.WinterFlowSessionManagerProtocol
                @Override // com.google.android.datatransport.WinterFlowVersionControlView
                public final void WinterFlowRouterStructure() {
                    WinterFlowFrameworkNetwork.this.WinterFlowUnitTestResponse.removeCallbacks(runnable);
                }
            };
        }
        WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice, runnable);
        return WinterFlowClassConsumer.WinterFlowVariableVersionControl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowFrameworkNetwork)) {
            return false;
        }
        WinterFlowFrameworkNetwork winterFlowFrameworkNetwork = (WinterFlowFrameworkNetwork) obj;
        return winterFlowFrameworkNetwork.WinterFlowUnitTestResponse == this.WinterFlowUnitTestResponse && winterFlowFrameworkNetwork.WinterFlowSyntax == this.WinterFlowSyntax;
    }

    public final int hashCode() {
        return (this.WinterFlowSyntax ? 1231 : 1237) ^ System.identityHashCode(this.WinterFlowUnitTestResponse);
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final String toString() {
        WinterFlowFrameworkNetwork winterFlowFrameworkNetwork;
        String str;
        WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
        WinterFlowFrameworkNetwork winterFlowFrameworkNetwork2 = WinterFlowEventEmitterRepository.WinterFlowRouterStructure;
        if (this == winterFlowFrameworkNetwork2) {
            str = "Dispatchers.Main";
        } else {
            try {
                winterFlowFrameworkNetwork = winterFlowFrameworkNetwork2.WinterFlowResponseEngine;
            } catch (UnsupportedOperationException unused) {
                winterFlowFrameworkNetwork = null;
            }
            str = this == winterFlowFrameworkNetwork ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.WinterFlowRouterRouter;
        if (str2 == null) {
            str2 = this.WinterFlowUnitTestResponse.toString();
        }
        if (!this.WinterFlowSyntax) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public WinterFlowFrameworkNetwork(Handler handler) {
        this(handler, null, false);
    }
}
