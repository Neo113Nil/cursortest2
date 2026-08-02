package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLException;
import ru.yandex.video.m3.player.drm.DrmLoadException;

/* loaded from: classes4.dex */
public final class zeg implements xeg {
    public static boolean a(IOException iOException, Class cls) {
        int i = 0;
        for (IOException iOException2 = iOException; i < 11 && iOException2 != null; iOException2 = iOException2.getCause()) {
            if (cls.isInstance(iOException2)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r0 != 416) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[RETURN] */
    @Override // defpackage.xeg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C(j4x j4xVar) {
        IOException iOException = (IOException) j4xVar.c;
        boolean z = false;
        if (iOException instanceof i6e) {
            int i = ((i6e) iOException).d;
            if (i != 451) {
                if (i != 401) {
                    if (i != 403) {
                    }
                }
            }
            if (z) {
                return -9223372036854775807L;
            }
            return Math.min((j4xVar.b - 1) * 1000, 5000L);
        }
        if (!(iOException instanceof FileNotFoundException) && !(iOException instanceof lgg) && !(iOException instanceof gp3)) {
            if (iOException instanceof r7k) {
                z = a(iOException, sjr.class);
            } else {
                if (iOException instanceof DrmLoadException.ErrorDiagnostic) {
                    boolean isFatal = ((DrmLoadException.ErrorDiagnostic) iOException).getIsFatal();
                    if (!isFatal) {
                        if (isFatal) {
                            b6e.s();
                            return 0L;
                        }
                    }
                }
                z = true;
            }
        }
        if (z) {
        }
    }

    @Override // defpackage.xeg
    public final mdr L(weg wegVar, j4x j4xVar) {
        int i;
        IOException iOException = (IOException) j4xVar.c;
        if ((!(iOException instanceof i6e) || ((400 > (i = ((i6e) iOException).d) || i >= 500 || i == 451 || i == 401 || i == 403 || i == 416) && (500 > i || i >= 600))) && !a(iOException, SocketTimeoutException.class) && !a(iOException, SocketException.class) && !a(iOException, SSLException.class)) {
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

    @Override // defpackage.xeg
    public final int r(int i) {
        return 3;
    }
}
