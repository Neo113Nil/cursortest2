package android.content.Context;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFilterShadowCelestial9261 extends FrostHunterChipGammaStrike4531 {
    public long FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ FrostHunterTimerAuroraNeoAurora3531 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterFilterShadowCelestial9261(FrostHunterTimerAuroraNeoAurora3531 frostHunterTimerAuroraNeoAurora3531, FrostHunterAdMobSpeedMasterSpark5250 frostHunterAdMobSpeedMasterSpark5250, long j) {
        super(frostHunterTimerAuroraNeoAurora3531, frostHunterAdMobSpeedMasterSpark5250);
        frostHunterAdMobSpeedMasterSpark5250.getClass();
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterTimerAuroraNeoAurora3531;
        this.FrostHunterFragmentBetaMegaVortex6025 = j;
        if (j == 0) {
            FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterColorStateListInflaterHeroEclipseOlympian7298.FrostHunterFlowMaxDragonHero5809);
        }
    }

    @Override // android.content.Context.FrostHunterChipGammaStrike4531, android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        if (j < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount < 0: ", j));
            return 0L;
        }
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("closed");
            return 0L;
        }
        long j2 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (j2 == 0) {
            return -1L;
        }
        long FrostHunterResourcesTitanHyperVision5823 = super.FrostHunterResourcesTitanHyperVision5823(Math.min(j2, j), frostHunterMergeSpeedHyperionBlaze4246);
        if (FrostHunterResourcesTitanHyperVision5823 == -1) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTimerAuroraNeoAurora3531.FrostHunterLevelListDrawableFusionDragonHero2232);
            throw protocolException;
        }
        long j3 = this.FrostHunterFragmentBetaMegaVortex6025 - FrostHunterResourcesTitanHyperVision5823;
        this.FrostHunterFragmentBetaMegaVortex6025 = j3;
        if (j3 == 0) {
            FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterColorStateListInflaterHeroEclipseOlympian7298.FrostHunterFlowMaxDragonHero5809);
        }
        return FrostHunterResourcesTitanHyperVision5823;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            return;
        }
        if (this.FrostHunterFragmentBetaMegaVortex6025 != 0) {
            TimeZone timeZone = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterLifecycleBlazeGammaElite2889(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814();
                FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTimerAuroraNeoAurora3531.FrostHunterLevelListDrawableFusionDragonHero2232);
            }
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = true;
    }
}
