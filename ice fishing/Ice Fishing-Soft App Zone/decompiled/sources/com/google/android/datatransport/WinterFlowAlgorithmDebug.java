package com.google.android.datatransport;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowAlgorithmDebug implements WinterFlowRendererProvider, WinterFlowStackNode, WinterFlowServiceInterface, WinterFlowResolverConsumer, WinterFlowRequestRouter, WinterFlowWidgetCache, WinterFlowSerializerFramework, WinterFlowSoftwareStrategy {
    public static WinterFlowAlgorithmDebug WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowAlgorithmDebug(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    public static Typeface WinterFlowArrayNetwork(String str, WinterFlowObjectHook winterFlowObjectHook, int i) {
        Typeface create;
        if (i == 0 && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowObjectHook, WinterFlowObjectHook.WinterFlowSyntax) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), winterFlowObjectHook.WinterFlowVariableVersionControl, i == 1);
        return create;
    }

    @Override // com.google.android.datatransport.WinterFlowServiceInterface
    public WinterFlowValidatorPipeline WinterFlowCacheManagerAgent(String str) {
        return WinterFlowProviderOrchestration.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowRequestRouter
    public Typeface WinterFlowHookDataSource(WinterFlowObjectHook winterFlowObjectHook, int i) {
        return WinterFlowArrayNetwork(null, winterFlowObjectHook, i);
    }

    @Override // com.google.android.datatransport.WinterFlowStackNode
    public long WinterFlowRouterStructure(long j, long j2) {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = WinterFlowBatchThread.WinterFlowRouterStructure;
                return floatToRawIntBits;
            default:
                float WinterFlowTransactionAgent = WinterFlowServerManager.WinterFlowTransactionAgent(j, j2);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(WinterFlowTransactionAgent) << 32) | (Float.floatToRawIntBits(WinterFlowTransactionAgent) & 4294967295L);
                int i2 = WinterFlowBatchThread.WinterFlowRouterStructure;
                return floatToRawIntBits2;
        }
    }

    public boolean WinterFlowTransactionManagerStrategy(CharSequence charSequence) {
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowRequestRouter
    public Typeface WinterFlowUnitTestResponse(WinterFlowCacheManagerEngine winterFlowCacheManagerEngine, WinterFlowObjectHook winterFlowObjectHook, int i) {
        winterFlowCacheManagerEngine.getClass();
        return WinterFlowArrayNetwork("sans-serif", winterFlowObjectHook, i);
    }

    public Signature[] WinterFlowVariableVersionControl(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        WinterFlowModuleFunction winterFlowModuleFunction = new WinterFlowModuleFunction(1);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null flags");
            return null;
        }
        hashMap.put(WinterFlowMicroserviceSubsystem.WinterFlowVariableVersionControl, new WinterFlowRepositoryServer(30000L, 86400000L, set));
        if (set == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null flags");
            return null;
        }
        hashMap.put(WinterFlowMicroserviceSubsystem.WinterFlowUnitTestResponse, new WinterFlowRepositoryServer(1000L, 86400000L, set));
        if (set == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null flags");
            return null;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(WinterFlowCacheFunction.WinterFlowTransactionManagerStrategy)));
        if (unmodifiableSet == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null flags");
            return null;
        }
        hashMap.put(WinterFlowMicroserviceSubsystem.WinterFlowTransactionManagerStrategy, new WinterFlowRepositoryServer(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= WinterFlowMicroserviceSubsystem.values().length) {
            new HashMap();
            return new WinterFlowLoaderSerializer(winterFlowModuleFunction, hashMap);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Not all priorities have been configured");
        return null;
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "CompositionErrorContext";
            case 21:
                int hashCode = hashCode();
                WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowProviderCacheManager.class).WinterFlowCacheManagerAgent() + ">";
            case 23:
                return "SharingStarted.Lazily";
            case 24:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetCache
    public void WinterFlowSyntax(int i, Object obj) {
    }
}
