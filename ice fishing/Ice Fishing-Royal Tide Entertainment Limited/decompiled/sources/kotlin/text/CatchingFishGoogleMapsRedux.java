package kotlin.text;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsRedux extends CatchingFishToastLifecycle {
    public final Socket CatchingFishOkHttp;

    public CatchingFishGoogleMapsRedux(Socket socket) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(socket, "socket");
        this.CatchingFishOkHttp = socket;
    }

    @Override // kotlin.text.CatchingFishToastLifecycle
    public final void CatchingFishCloudMessaging() {
        Socket socket = this.CatchingFishOkHttp;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!CatchingFishViewMVIMVVM.CatchingFishOkHttp(e)) {
                throw e;
            }
            CatchingFishGlideAdMob.CatchingFishParcelableFAB.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            CatchingFishGlideAdMob.CatchingFishParcelableFAB.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException CatchingFishEspressoTesting(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
