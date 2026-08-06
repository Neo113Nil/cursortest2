package W1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class v extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f1910m;

    public v(Socket socket) {
        this.f1910m = socket;
    }

    @Override // W1.e
    public final void j() {
        Socket socket = this.f1910m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!R1.d.u(e2)) {
                throw e2;
            }
            n.f1890a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e3) {
            n.f1890a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
