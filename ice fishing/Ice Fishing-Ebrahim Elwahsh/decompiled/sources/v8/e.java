package v8;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class e extends u8.c {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f41384n;

    public e(Socket socket) {
        this.f41384n = socket;
    }

    @Override // u8.c
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // u8.c
    public final void k() {
        Socket socket = this.f41384n;
        try {
            socket.close();
        } catch (AssertionError e6) {
            if (!f.a(e6)) {
                throw e6;
            }
            f.f41385a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        } catch (Exception e9) {
            f.f41385a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
        }
    }
}
