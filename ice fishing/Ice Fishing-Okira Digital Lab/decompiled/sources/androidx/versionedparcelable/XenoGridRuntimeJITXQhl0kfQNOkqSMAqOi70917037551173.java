package androidx.versionedparcelable;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridRuntimeJITXQhl0kfQNOkqSMAqOi70917037551173 {
    public Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public Object RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public XenoGridRuntimeJITXQhl0kfQNOkqSMAqOi70917037551173() {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new Object();
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new ArrayList();
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new ArrayList();
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = true;
    }

    public Boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = ((FirebaseMessaging) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        Context context = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public synchronized boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        boolean z;
        boolean z2;
        try {
            synchronized (this) {
                try {
                    if (!this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                        Boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
                            ((TitanCloudReflectionControllerSxILNqp2GYSCrbqTdU41473678033422) ((VertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246(25));
                        }
                        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = true;
                    }
                } finally {
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = ((FirebaseMessaging) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            TitanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108 titanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108 = (TitanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108) obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get();
            synchronized (titanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108) {
                z = titanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            }
            z2 = z;
        }
        return z2;
    }

    public XenoGridRuntimeJITXQhl0kfQNOkqSMAqOi70917037551173(QuantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173 quantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173, VertexLinkShimNamespaceGUixplydYln7HxxVgI30834108778924 vertexLinkShimNamespaceGUixplydYln7HxxVgI30834108778924, YellowLoopOverloadingTokenPusXHFugLlgRS8Op2Q20000579559455 yellowLoopOverloadingTokenPusXHFugLlgRS8Op2Q20000579559455) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = quantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = vertexLinkShimNamespaceGUixplydYln7HxxVgI30834108778924;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = yellowLoopOverloadingTokenPusXHFugLlgRS8Op2Q20000579559455;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = true;
    }

    public XenoGridRuntimeJITXQhl0kfQNOkqSMAqOi70917037551173(FirebaseMessaging firebaseMessaging, VertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600 vertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = firebaseMessaging;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = vertexLinkOverloadingBinaryXjen8Yhc66dtnYnKLr98634312586600;
    }
}
