package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context.FrostHunterColorStateListInflaterCosmosStrikeRogue2972;
import android.content.Context.FrostHunterGradientDrawableForceQuantum3460;
import android.content.Context.FrostHunterLayerMegaVortex2210;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionManagerOmegaNeoMaster3754 implements ServiceConnection {
    public final InstallReferrerStateListener FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ FrostHunterAdapterDelegateNebulaRogue3354 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterTransitionManagerOmegaNeoMaster3754(FrostHunterAdapterDelegateNebulaRogue3354 frostHunterAdapterDelegateNebulaRogue3354, InstallReferrerStateListener installReferrerStateListener) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAdapterDelegateNebulaRogue3354;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        FrostHunterLayerMegaVortex2210 frostHunterColorStateListInflaterCosmosStrikeRogue2972;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = FrostHunterGradientDrawableForceQuantum3460.FrostHunterBundlePulseFusionHero2475;
        if (iBinder == null) {
            frostHunterColorStateListInflaterCosmosStrikeRogue2972 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            frostHunterColorStateListInflaterCosmosStrikeRogue2972 = queryLocalInterface instanceof FrostHunterLayerMegaVortex2210 ? (FrostHunterLayerMegaVortex2210) queryLocalInterface : new FrostHunterColorStateListInflaterCosmosStrikeRogue2972(iBinder);
        }
        FrostHunterAdapterDelegateNebulaRogue3354 frostHunterAdapterDelegateNebulaRogue3354 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterAdapterDelegateNebulaRogue3354.FrostHunterBundlePulseFusionHero2475 = frostHunterColorStateListInflaterCosmosStrikeRogue2972;
        frostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761 = 2;
        this.FrostHunterAlphaAnimationNeoCosmos5761.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        FrostHunterAdapterDelegateNebulaRogue3354 frostHunterAdapterDelegateNebulaRogue3354 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterAdapterDelegateNebulaRogue3354.FrostHunterBundlePulseFusionHero2475 = null;
        frostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
        this.FrostHunterAlphaAnimationNeoCosmos5761.onInstallReferrerServiceDisconnected();
    }
}
