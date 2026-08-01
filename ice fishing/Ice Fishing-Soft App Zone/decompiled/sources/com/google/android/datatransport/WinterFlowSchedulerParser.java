package com.google.android.datatransport;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerParser implements WinterFlowServerEntity {
    public Object WinterFlowArrayNetwork;
    public Object WinterFlowCacheManagerAgent;
    public Object WinterFlowHookDataSource;
    public Object WinterFlowRouterStructure;
    public Object WinterFlowTransactionManagerStrategy;
    public Object WinterFlowVariableVersionControl;

    public WinterFlowSchedulerParser(Set set, String str, String str2) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.WinterFlowCacheManagerAgent = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.WinterFlowRouterStructure = str;
        this.WinterFlowVariableVersionControl = str2;
        this.WinterFlowTransactionManagerStrategy = WinterFlowProtocolUserManager.WinterFlowHookDataSource;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.WinterFlowArrayNetwork = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowServerEntity
    public Object WinterFlowCacheManagerAgent(WinterFlowExceptionListener winterFlowExceptionListener, WinterFlowEventEvent winterFlowEventEvent, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        Object WinterFlowOrchestrationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem(new WinterFlowMapperJava(this, winterFlowExceptionListener, winterFlowEventEvent, null, 7), winterFlowOrchestrationCompiler);
        return WinterFlowOrchestrationSubsystem == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowOrchestrationSubsystem : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowServerEntity
    public boolean WinterFlowHookDataSource() {
        return ((Boolean) ((WinterFlowResolverSubsystem) this.WinterFlowArrayNetwork).getValue()).booleanValue();
    }

    public void WinterFlowRouterRouter(String str, Bundle bundle, boolean z) {
        String str2;
        String str3;
        boolean WinterFlowVariableVersionControl;
        int i;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        bundle.putString("gmp_app_id", winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowHookDataSource);
        bundle.putString("gmsv", Integer.toString(((WinterFlowAdapterUnitTest) this.WinterFlowHookDataSource).WinterFlowArrayNetwork()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((WinterFlowAdapterUnitTest) this.WinterFlowHookDataSource).WinterFlowHookDataSource());
        WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = (WinterFlowAdapterUnitTest) this.WinterFlowHookDataSource;
        synchronized (winterFlowAdapterUnitTest) {
            try {
                if (((String) winterFlowAdapterUnitTest.WinterFlowVariableVersionControl) == null) {
                    winterFlowAdapterUnitTest.WinterFlowTransactionManagerStrategy();
                }
                str2 = (String) winterFlowAdapterUnitTest.WinterFlowVariableVersionControl;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("app_ver_name", str2);
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent2.WinterFlowRouterStructure();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(winterFlowSyntaxEvent2.WinterFlowHookDataSource.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z) {
            com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent3 = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowRouterStructure;
            winterFlowSyntaxEvent3.WinterFlowRouterStructure();
            bundle.putString("Goog-Api-Key", winterFlowSyntaxEvent3.WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
        }
        try {
            String str4 = ((WinterFlowDeploymentComponent) WinterFlowHookProcessor.WinterFlowArrayNetwork(((WinterFlowBackendComponent) ((WinterFlowDatabaseSchemaBandwidth) this.WinterFlowTransactionManagerStrategy)).WinterFlowArrayNetwork())).WinterFlowRouterStructure;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) WinterFlowHookProcessor.WinterFlowArrayNetwork(((WinterFlowBackendComponent) ((WinterFlowDatabaseSchemaBandwidth) this.WinterFlowTransactionManagerStrategy)).WinterFlowCacheManagerAgent()));
        bundle.putString("cliv", "fcm-25.1.1");
        WinterFlowJSONUnitTest winterFlowJSONUnitTest = (WinterFlowJSONUnitTest) ((WinterFlowHookInheritance) this.WinterFlowVariableVersionControl).get();
        WinterFlowListenerSystem winterFlowListenerSystem = (WinterFlowListenerSystem) ((WinterFlowHookInheritance) this.WinterFlowArrayNetwork).get();
        if (winterFlowJSONUnitTest == null || winterFlowListenerSystem == null) {
            return;
        }
        WinterFlowDeserializationPlatform winterFlowDeserializationPlatform = (WinterFlowDeserializationPlatform) winterFlowJSONUnitTest;
        synchronized (winterFlowDeserializationPlatform) {
            long currentTimeMillis = System.currentTimeMillis();
            WinterFlowFrontendMechanism winterFlowFrontendMechanism = (WinterFlowFrontendMechanism) winterFlowDeserializationPlatform.WinterFlowRouterStructure.get();
            synchronized (winterFlowFrontendMechanism) {
                WinterFlowVariableVersionControl = winterFlowFrontendMechanism.WinterFlowVariableVersionControl(WinterFlowFrontendMechanism.WinterFlowHookDataSource, currentTimeMillis);
            }
            if (WinterFlowVariableVersionControl) {
                synchronized (winterFlowFrontendMechanism) {
                    winterFlowFrontendMechanism.WinterFlowRouterStructure.WinterFlowRouterStructure(new WinterFlowRouterCompiler(14, winterFlowFrontendMechanism, winterFlowFrontendMechanism.WinterFlowHookDataSource(System.currentTimeMillis())));
                }
                i = 3;
            } else {
                i = 1;
            }
        }
        if (i != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(WinterFlowResolverBackend.WinterFlowRouterAdapter(i)));
            bundle.putString("Firebase-Client", winterFlowListenerSystem.WinterFlowRouterStructure());
        }
    }

    public void WinterFlowTransactionManagerStrategy(String str, String str2) {
        HashMap hashMap = (HashMap) this.WinterFlowTransactionManagerStrategy;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Property \"autoMetadata\" has not been set");
        }
    }

    public WinterFlowObjectFrontend WinterFlowUnitTestResponse() {
        String str = ((String) this.WinterFlowRouterStructure) == null ? " transportName" : "";
        if (((WinterFlowBatchSubsystem) this.WinterFlowCacheManagerAgent) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.WinterFlowArrayNetwork) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.WinterFlowVariableVersionControl) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.WinterFlowTransactionManagerStrategy) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new WinterFlowObjectFrontend((String) this.WinterFlowRouterStructure, (Integer) this.WinterFlowHookDataSource, (WinterFlowBatchSubsystem) this.WinterFlowCacheManagerAgent, ((Long) this.WinterFlowArrayNetwork).longValue(), ((Long) this.WinterFlowVariableVersionControl).longValue(), (HashMap) this.WinterFlowTransactionManagerStrategy);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Missing required properties:".concat(str));
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowServerEntity
    public float WinterFlowVariableVersionControl(float f) {
        return ((Number) ((WinterFlowObjectSession) this.WinterFlowRouterStructure).WinterFlowUnitTestResponse(Float.valueOf(f))).floatValue();
    }

    public WinterFlowSchedulerParser(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowRouterStructure = winterFlowObjectSession;
        this.WinterFlowHookDataSource = new WinterFlowRendererAgent(this);
        this.WinterFlowCacheManagerAgent = new WinterFlowLibraryDatabaseSchema();
        Boolean bool = Boolean.FALSE;
        this.WinterFlowArrayNetwork = WinterFlowDecoratorUI.WinterFlowSerializerStructure(bool);
        this.WinterFlowVariableVersionControl = WinterFlowDecoratorUI.WinterFlowSerializerStructure(bool);
        this.WinterFlowTransactionManagerStrategy = WinterFlowDecoratorUI.WinterFlowSerializerStructure(bool);
    }
}
