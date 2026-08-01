package z8;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class e extends y8.c {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f42284n;

    public e(Socket socket) {
        this.f42284n = socket;
    }

    @Override // y8.c
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // y8.c
    public final void k() {
        Socket socket = this.f42284n;
        try {
            socket.close();
        } catch (AssertionError e9) {
            if (!f.a(e9)) {
                throw e9;
            }
            f.f42285a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
        } catch (Exception e10) {
            f.f42285a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }
}
