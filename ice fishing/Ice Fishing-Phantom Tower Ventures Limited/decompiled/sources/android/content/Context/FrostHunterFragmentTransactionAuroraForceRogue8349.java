package android.content.Context;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFragmentTransactionAuroraForceRogue8349 implements FrostHunterProfilerPhantomLegendPhoenix6109 {
    public final /* synthetic */ FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterAlertDialogAuroraDelta3200;
    public final OutputStream FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterInputMethodManagerBlazeHyperion9170 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterFragmentTransactionAuroraForceRogue8349(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
        Socket socket = (Socket) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterCameraXPixelTurboCosmos9814 = socket.getOutputStream();
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterInputMethodManagerBlazeHyperion9170(socket);
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809, 0L, j);
        while (j > 0) {
            FrostHunterInputMethodManagerBlazeHyperion9170 frostHunterInputMethodManagerBlazeHyperion9170 = this.FrostHunterFlowMaxDragonHero5809;
            frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterLevelListDrawableFusionDragonHero2232();
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            int min = (int) Math.min(j, frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterFlowMaxDragonHero5809();
            try {
                try {
                    this.FrostHunterCameraXPixelTurboCosmos9814.write(frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633, min);
                    if (frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                        throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(null);
                    }
                    int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + min;
                    frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
                    long j2 = min;
                    j -= j2;
                    frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 -= j2;
                    if (i == frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
                        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
                        FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
                    }
                } catch (IOException e) {
                    if (!frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                        throw e;
                    }
                    throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(e);
                }
            } catch (Throwable th) {
                frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200();
                throw th;
            }
        }
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterInputMethodManagerBlazeHyperion9170 frostHunterInputMethodManagerBlazeHyperion9170 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterFlowMaxDragonHero5809();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200;
            Socket socket = (Socket) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFlowMaxDragonHero5809;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                    throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(null);
                }
            }
        } catch (IOException e) {
            if (!frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                throw e;
            }
            throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(e);
        } finally {
            frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200();
        }
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109, java.io.Flushable
    public final void flush() {
        FrostHunterInputMethodManagerBlazeHyperion9170 frostHunterInputMethodManagerBlazeHyperion9170 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterFlowMaxDragonHero5809();
        try {
            this.FrostHunterCameraXPixelTurboCosmos9814.flush();
            if (frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(null);
            }
        } catch (IOException e) {
            if (!frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                throw e;
            }
            throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(e);
        } finally {
            frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterFlowMaxDragonHero5809) + ')';
    }
}
