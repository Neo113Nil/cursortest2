package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import androidx.versionedparcelable.BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995;
import androidx.versionedparcelable.BlazePulseEncryptionClosureWnuKNFh8qhDkC7fWD223489038281753;
import androidx.versionedparcelable.BlueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643;
import androidx.versionedparcelable.BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732;
import androidx.versionedparcelable.CrimsonRouteHandlerTranspilerHz43SDq5jTiu125oGt61139502104090;
import androidx.versionedparcelable.EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141;
import androidx.versionedparcelable.GoldenVectorInheritanceSessionZ4sy5I6sZPUSdXfMhf28388647251601;
import androidx.versionedparcelable.KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868;
import androidx.versionedparcelable.KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289;
import androidx.versionedparcelable.NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158;
import androidx.versionedparcelable.NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385;
import androidx.versionedparcelable.ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290;
import androidx.versionedparcelable.ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
import androidx.versionedparcelable.ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026;
import androidx.versionedparcelable.QuantumStreamIteratorParserUPKfpTbvBJqjzGkWUK34377764018722;
import androidx.versionedparcelable.RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
import androidx.versionedparcelable.SolarMeshControllerAggregationJwWC0KBPdJesg6yaS060462376018753;
import androidx.versionedparcelable.TitanCloudOverridingSubroutineReEm4p3rjE7Ggaa8Xg89051994356282;
import androidx.versionedparcelable.VertexLinkConnectorProxyK2OJzectpZ6p1WwMdq74549816806104;
import androidx.versionedparcelable.VertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600;
import androidx.versionedparcelable.VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516;
import androidx.versionedparcelable.XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692;
import androidx.versionedparcelable.XenoGridRuntimeJITXQhl0kfQNOkqSMAqOi70917037551173;
import androidx.versionedparcelable.XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898;
import androidx.versionedparcelable.YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412;
import androidx.versionedparcelable.YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214;
import androidx.versionedparcelable.ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public static NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = new TitanCloudOverridingSubroutineReEm4p3rjE7Ggaa8Xg89051994356282(5);
    public static ScheduledThreadPoolExecutor ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
    public final EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final Context AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final XenoGridRuntimeJITXQhl0kfQNOkqSMAqOi70917037551173 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final ThreadPoolExecutor TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public boolean UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public final ScheduledThreadPoolExecutor YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public FirebaseMessaging(com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015, NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158, NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t573938419451582, BlazePulseEncryptionClosureWnuKNFh8qhDkC7fWD223489038281753 blazePulseEncryptionClosureWnuKNFh8qhDkC7fWD223489038281753, NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t573938419451583, VertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600 vertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600) {
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        Context context = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        final ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026 obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026 = new ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026();
        final int i = 0;
        obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = 0;
        obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = context;
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 = new KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868(obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        final EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 = new EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141();
        emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015;
        emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026;
        emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868;
        emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158;
        emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t573938419451582;
        emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = blazePulseEncryptionClosureWnuKNFh8qhDkC7fWD223489038281753;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("Firebase-Messaging-File-Io"));
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = false;
        ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t573938419451583;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new XenoGridRuntimeJITXQhl0kfQNOkqSMAqOi70917037551173(this, vertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600);
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        final Context context2 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = context2;
        GoldenVectorInheritanceSessionZ4sy5I6sZPUSdXfMhf28388647251601 goldenVectorInheritanceSessionZ4sy5I6sZPUSdXfMhf28388647251601 = new GoldenVectorInheritanceSessionZ4sy5I6sZPUSdXfMhf28388647251601();
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(newSingleThreadExecutor);
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = scheduledThreadPoolExecutor;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = threadPoolExecutor;
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(goldenVectorInheritanceSessionZ4sy5I6sZPUSdXfMhf28388647251601);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: androidx.versionedparcelable.ArcticByteAnnotationWildcardEeYaOBVyV88MDIYN4v56744222534562
            public final /* synthetic */ FirebaseMessaging LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;

            {
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() && firebaseMessaging.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(firebaseMessaging.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
                                    firebaseMessaging.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(context3);
                        EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR214716951701412 = firebaseMessaging.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        final boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = firebaseMessaging.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(context3);
                            if (!LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764.contains("proxy_retention") || LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764.getBoolean("proxy_retention", false) != YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                                KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg753588572758682 = (KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868) emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR214716951701412.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                                if (kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg753588572758682.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                                    NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg753588572758682.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                                    synchronized (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                                        i3 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                        ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i3 + 1;
                                    }
                                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(new ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290(i3, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822 = new ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182();
                                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(iOException);
                                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822;
                                }
                                obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345(), new LunarNodeOperatorCallbackH3HTFEqfx0ynmgzizj26903761059888() { // from class: androidx.versionedparcelable.XenoGridHeuristicEventLoopP7NfKCIc6qW3IBpBHm33862326155077
                                    @Override // androidx.versionedparcelable.LunarNodeOperatorCallbackH3HTFEqfx0ynmgzizj26903761059888
                                    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Object obj) {
                                        SharedPreferences.Editor edit = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(context3).edit();
                                        edit.putBoolean("proxy_retention", YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170()) {
                            firebaseMessaging.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("Firebase-Messaging-Topics-Io"));
        RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(scheduledThreadPoolExecutor2, new Callable() { // from class: androidx.versionedparcelable.ZenithPathArrayVirtualizationYC7FhA3AFYVRCZ4Z9X36322242004458
            @Override // java.util.concurrent.Callable
            public final Object call() {
                EmeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457 emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026 obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW8682576335940262 = obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026;
                EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR214716951701412 = emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141;
                synchronized (EmeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457.class) {
                    try {
                        WeakReference weakReference = EmeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        EmeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457 emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V477804633534572 = weakReference != null ? (EmeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457) weakReference.get() : null;
                        if (emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V477804633534572 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457 = new EmeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457();
                            synchronized (emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457) {
                                emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ZenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            EmeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new WeakReference(emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457);
                        } else {
                            emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457 = emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V477804633534572;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new CrimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698(firebaseMessaging, obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW8682576335940262, emeraldStackAnnotationInterpreterMhp0Og0MGdlbXsHh4V47780463353457, emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR214716951701412, context3, scheduledThreadPoolExecutor3);
            }
        }).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(scheduledThreadPoolExecutor, new QuantumStreamIteratorParserUPKfpTbvBJqjzGkWUK34377764018722(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: androidx.versionedparcelable.ArcticByteAnnotationWildcardEeYaOBVyV88MDIYN4v56744222534562
            public final /* synthetic */ FirebaseMessaging LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;

            {
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() && firebaseMessaging.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(firebaseMessaging.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
                                    firebaseMessaging.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(context3);
                        EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR214716951701412 = firebaseMessaging.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        final boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = firebaseMessaging.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(context3);
                            if (!LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764.contains("proxy_retention") || LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764.getBoolean("proxy_retention", false) != YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                                KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg753588572758682 = (KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868) emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR214716951701412.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                                if (kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg753588572758682.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                                    NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg753588572758682.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                                    synchronized (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                                        i3 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                        ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i3 + 1;
                                    }
                                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(new ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290(i3, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822 = new ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182();
                                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(iOException);
                                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822;
                                }
                                obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345(), new LunarNodeOperatorCallbackH3HTFEqfx0ynmgzizj26903761059888() { // from class: androidx.versionedparcelable.XenoGridHeuristicEventLoopP7NfKCIc6qW3IBpBHm33862326155077
                                    @Override // androidx.versionedparcelable.LunarNodeOperatorCallbackH3HTFEqfx0ynmgzizj26903761059888
                                    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Object obj) {
                                        SharedPreferences.Editor edit = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(context3).edit();
                                        edit.putBoolean("proxy_retention", YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170()) {
                            firebaseMessaging.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static synchronized BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Context context) {
        BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 blueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732;
        synchronized (FirebaseMessaging.class) {
            try {
                if (NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 == null) {
                    NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = new BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732(context, 2);
                }
                blueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 = NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
            } catch (Throwable th) {
                throw th;
            }
        }
        return blueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732;
    }

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 == null) {
                    ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = new ScheduledThreadPoolExecutor(1, new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("TAG"));
                }
                ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging getInstance(com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            firebaseMessaging = (FirebaseMessaging) obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(FirebaseMessaging.class);
            YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final boolean BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394) {
        if (zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 != null) {
            return System.currentTimeMillis() > zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + 604800000 || !this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365().equals((String) zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
        }
        return true;
    }

    public final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
        int i;
        KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 = (KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868) this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        int i2 = 1;
        if (kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571() >= 241100000) {
            NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            Bundle bundle = Bundle.EMPTY;
            synchronized (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                i = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i + 1;
            }
            obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(new ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290(i, 5, bundle, 1)).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(BlueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822 = new ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182();
            obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(iOException);
            obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822;
        }
        obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, new QuantumStreamIteratorParserUPKfpTbvBJqjzGkWUK34377764018722(this, i2));
    }

    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
        ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
        if (!BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867)) {
            return (String) RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        }
        String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        synchronized (yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412) {
            obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = (ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182) ((BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995) yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).get(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            if (obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 == null) {
                EmeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495((com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) emeraldStackEngineExecutorBmHfwrIM8i9dHkJADR21471695170141.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800), "*", new Bundle())).UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, new CrimsonRouteHandlerTranspilerHz43SDq5jTiu125oGt61139502104090(this, ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, 1)).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867((Executor) yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, new SolarMeshControllerAggregationJwWC0KBPdJesg6yaS060462376018753(yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412, ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495));
                ((BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995) yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).put(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182);
            }
        }
        try {
            return (String) RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() {
        ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 = "[DEFAULT]".equals(obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) ? "" : obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
        String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664953 = ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        synchronized (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getString(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 + "|T|" + ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664953 + "|*", null));
        }
        return AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    }

    public final synchronized void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(long j) {
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = true;
    }

    public final boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170() {
        String notificationDelegate;
        Context context = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    if (obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(VertexLinkConnectorProxyK2OJzectpZ6p1WwMdq74549816806104.class) != null) {
                        return true;
                    }
                    if (XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598() && ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 != null) {
                        return true;
                    }
                }
                return false;
            }
            context.getPackageName();
        }
        return false;
    }
}
