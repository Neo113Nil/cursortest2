package android.content.Context;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInputMethodManagerBlazeHyperion9170 extends FrostHunterTextInputEditTextCosmosInferno2158 {
    public final Socket FrostHunterLightSensorForceFusion4241;

    public FrostHunterInputMethodManagerBlazeHyperion9170(Socket socket) {
        this.FrostHunterLightSensorForceFusion4241 = socket;
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextCosmosInferno2158
    public final void FrostHunterFragmentBetaMegaVortex6025() {
        Socket socket = this.FrostHunterLightSensorForceFusion4241;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!FrostHunterContextBetaOlympianForce4049.FrostHunterAlphaAnimationNeoCosmos5761(e)) {
                throw e;
            }
            FrostHunterContextBetaOlympianForce4049.FrostHunterAlphaAnimationNeoCosmos5761.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            FrostHunterContextBetaOlympianForce4049.FrostHunterAlphaAnimationNeoCosmos5761.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextCosmosInferno2158
    public final IOException FrostHunterKeyframeGammaGamma1197(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
