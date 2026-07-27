package android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTextInputLayoutHyperEpic7981 implements FrostHunterFontFamilySolarSpeedCelestial8941 {
    public final /* synthetic */ FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterAlertDialogAuroraDelta3200;
    public final InputStream FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterInputMethodManagerBlazeHyperion9170 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterTextInputLayoutHyperEpic7981(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
        Socket socket = (Socket) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterCameraXPixelTurboCosmos9814 = socket.getInputStream();
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterInputMethodManagerBlazeHyperion9170(socket);
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount < 0: ", j));
            return 0L;
        }
        FrostHunterInputMethodManagerBlazeHyperion9170 frostHunterInputMethodManagerBlazeHyperion9170 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterLevelListDrawableFusionDragonHero2232();
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterViewPhantomNeo1634(1);
        int min = (int) Math.min(j, 8192 - FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475);
        try {
            frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterFlowMaxDragonHero5809();
            try {
                int read = this.FrostHunterCameraXPixelTurboCosmos9814.read(FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475, min);
                if (frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                    throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(null);
                }
                if (read != -1) {
                    FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 += read;
                    long j2 = read;
                    frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 += j2;
                    return j2;
                }
                if (FrostHunterViewPhantomNeo1634.FrostHunterConstraintSetCloneMasterUltraRogue2633 != FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475) {
                    return -1L;
                }
                frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterViewPhantomNeo1634);
                return -1L;
            } catch (IOException e) {
                if (frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200()) {
                    throw frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterKeyframeGammaGamma1197(e);
                }
                throw e;
            } finally {
                frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterAlertDialogAuroraDelta3200();
            }
        } catch (AssertionError e2) {
            if (FrostHunterContextBetaOlympianForce4049.FrostHunterAlphaAnimationNeoCosmos5761(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterInputMethodManagerBlazeHyperion9170 frostHunterInputMethodManagerBlazeHyperion9170 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterInputMethodManagerBlazeHyperion9170.FrostHunterFlowMaxDragonHero5809();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200;
            Socket socket = (Socket) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFlowMaxDragonHero5809;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.FrostHunterCameraXPixelTurboCosmos9814.close();
                    }
                }
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

    public final String toString() {
        return "source(" + ((Socket) this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterFlowMaxDragonHero5809) + ')';
    }
}
