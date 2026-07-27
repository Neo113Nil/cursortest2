package androidx.versionedparcelable;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class GoldenVectorAdapterFunctionDMEGZzC4yedeLBnzO070394512343743 implements NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 {
    public final /* synthetic */ Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final /* synthetic */ Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ GoldenVectorAdapterFunctionDMEGZzC4yedeLBnzO070394512343743(int i, Object obj, Object obj2) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = obj;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = obj2;
    }

    @Override // androidx.versionedparcelable.NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        Object obj = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        Object obj2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                DragonRoutePolymorphismProxyWaGCgTt0XK7CHrj3ve84660993921279 dragonRoutePolymorphismProxyWaGCgTt0XK7CHrj3ve84660993921279 = (DragonRoutePolymorphismProxyWaGCgTt0XK7CHrj3ve84660993921279) obj;
                return dragonRoutePolymorphismProxyWaGCgTt0XK7CHrj3ve84660993921279.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(new ZenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843(dragonRoutePolymorphismProxyWaGCgTt0XK7CHrj3ve84660993921279, (PhotonFrameJITProcessorQvdRyuYdEbfnRRoLaH11812332350960) obj2));
            case 1:
                return new BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732((Context) obj2, (String) obj);
            default:
                com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = (com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) obj2;
                String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                TitanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108 titanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108 = new TitanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108();
                Context createDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                titanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = z;
                return titanCloudRegistryMutexUG5u11WAVWAYudHOPj21470694470108;
        }
    }
}
