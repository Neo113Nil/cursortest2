package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import javax.net.ssl.SSLException;
import ru.yandex.video.m3.player.drm.DrmLoadException;

/* loaded from: classes6.dex */
public final class yeg implements xeg {
    public boolean a;
    public final List b = u75.h("InvalidResponseCodeException", "SocketTimeoutException", "SocketConnectionResetException", "SSLException");

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r0 < 600) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(IOException iOException) {
        if (iOException instanceof i6e) {
            int i = ((i6e) iOException).d;
            if (400 <= i && i < 500 && i != 451 && i != 401 && i != 403 && i != 416) {
                return true;
            }
            if (500 <= i) {
            }
        }
        return c(iOException, SocketTimeoutException.class) || c(iOException, SocketException.class) || c(iOException, SSLException.class);
    }

    public static boolean c(IOException iOException, Class cls) {
        int i = 0;
        for (IOException iOException2 = iOException; i < 11 && iOException2 != null; iOException2 = iOException2.getCause()) {
            if (cls.isInstance(iOException2)) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // defpackage.xeg
    public final long C(j4x j4xVar) {
        if (b((IOException) j4xVar.c)) {
            return Math.min((j4xVar.b - 1) * 1000, 5000L);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.xeg
    public final mdr L(weg wegVar, j4x j4xVar) {
        if (!a((IOException) j4xVar.c)) {
            return null;
        }
        if (wegVar.a(1)) {
            return new mdr(1, 300000L);
        }
        if (wegVar.a(2)) {
            return new mdr(2, 60000L);
        }
        return null;
    }

    public final boolean b(IOException iOException) {
        if (iOException instanceof i6e) {
            int i = ((i6e) iOException).d;
            return (i == 451 || i == 401 || i == 403 || i == 416) ? false : true;
        }
        if (!(iOException instanceof FileNotFoundException ? true : iOException instanceof lgg ? true : iOException instanceof gp3)) {
            if (!(iOException instanceof r7k)) {
                if (iOException instanceof DrmLoadException.ErrorDiagnostic) {
                    boolean isFatal = ((DrmLoadException.ErrorDiagnostic) iOException).getIsFatal();
                    if (!isFatal) {
                        if (isFatal) {
                            b6e.s();
                            return false;
                        }
                    }
                }
                return true;
            }
            if (this.a && c(iOException, sjr.class)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xeg
    public final int r(int i) {
        return 3;
    }
}
