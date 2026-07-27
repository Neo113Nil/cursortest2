package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.versionedparcelable.DragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932;
import androidx.versionedparcelable.GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246;
import androidx.versionedparcelable.PhotonFrameWorkerStateXbSNv3Zsnfpoq1ghqh77205496198678;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 extends InstallReferrerClient {
    public PhotonFrameWorkerStateXbSNv3Zsnfpoq1ghqh77205496198678 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final Context AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
    public ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119(Context context) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 3;
        if (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.unbindService(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = null;
        }
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() {
        if (!isReady()) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getPackageName());
        try {
            return new ReferrerDetails(((DragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932) this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != 2 || this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == null || this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = new ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015(this, installReferrerStateListener);
                    this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015;
                    try {
                        if (context.bindService(intent2, obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015, 1)) {
                            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(1);
                        return;
                    } catch (SecurityException unused) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
                        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
