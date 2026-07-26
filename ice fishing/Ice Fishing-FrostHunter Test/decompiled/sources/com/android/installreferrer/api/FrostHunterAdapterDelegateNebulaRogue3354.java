package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Context.FrostHunterColorStateListInflaterCosmosStrikeRogue2972;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterLayerMegaVortex2210;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterDelegateNebulaRogue3354 extends InstallReferrerClient {
    public int FrostHunterAlphaAnimationNeoCosmos5761 = 0;
    public FrostHunterLayerMegaVortex2210 FrostHunterBundlePulseFusionHero2475;
    public final Context FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterAdapterDelegateNebulaRogue3354(Context context) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 3;
        if (this.FrostHunterServiceEliteCelestialThunder1757 != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633.unbindService(this.FrostHunterServiceEliteCelestialThunder1757);
            this.FrostHunterServiceEliteCelestialThunder1757 = null;
        }
        this.FrostHunterBundlePulseFusionHero2475 = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() {
        if (!isReady()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.FrostHunterConstraintSetCloneMasterUltraRogue2633.getPackageName());
        try {
            return new ReferrerDetails(((FrostHunterColorStateListInflaterCosmosStrikeRogue2972) this.FrostHunterBundlePulseFusionHero2475).FrostHunterAlphaAnimationNeoCosmos5761(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return (this.FrostHunterAlphaAnimationNeoCosmos5761 != 2 || this.FrostHunterBundlePulseFusionHero2475 == null || this.FrostHunterServiceEliteCelestialThunder1757 == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
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
        Context context = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
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
                    FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = new FrostHunterTransitionManagerOmegaNeoMaster3754(this, installReferrerStateListener);
                    this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterTransitionManagerOmegaNeoMaster3754;
                    try {
                        if (context.bindService(intent2, frostHunterTransitionManagerOmegaNeoMaster3754, 1)) {
                            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(1);
                        return;
                    } catch (SecurityException unused) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
                        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
