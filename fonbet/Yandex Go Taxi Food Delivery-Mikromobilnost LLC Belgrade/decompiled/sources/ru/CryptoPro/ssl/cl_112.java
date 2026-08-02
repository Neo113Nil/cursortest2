package ru.CryptoPro.ssl;

import java.io.IOException;
import java.util.Random;
import javax.net.ssl.SSLException;
import ru.CryptoPro.JCP.tools.LicenseException;

/* loaded from: classes4.dex */
public final class cl_112 {
    public static long a;
    public static boolean b;
    public static long c;

    public static synchronized void a(SSLContextImpl sSLContextImpl) throws SSLException {
        synchronized (cl_112.class) {
            if (sSLContextImpl == null) {
                throw new SSLException("No SSL context given.");
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c < 3600000) {
                return;
            }
            try {
                new ServerLicense().check(sSLContextImpl);
                c = currentTimeMillis;
            } catch (IOException e) {
                SSLLogger.fatal("Java TLS license check failed: " + e.getMessage(), (Throwable) e);
                throw new SSLException("Java TLS license check failed: " + e.getMessage(), e);
            } catch (LicenseException e2) {
                SSLLogger.fatal("Java TLS license check failed: " + e2.getMessage(), (Throwable) e2);
                throw new SSLException("Java TLS license check failed: " + e2.getMessage(), e2);
            }
        }
    }

    public static synchronized boolean b(SSLContextImpl sSLContextImpl) throws IOException {
        synchronized (cl_112.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - a < 3600000) {
                return b;
            }
            boolean a2 = a(sSLContextImpl, true);
            a = currentTimeMillis;
            b = a2;
            return a2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r2.verifyAmount(r6) == 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0005, B:6:0x0014, B:10:0x0021, B:19:0x0028, B:12:0x0042, B:22:0x002d), top: B:3:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized boolean a(SSLContextImpl sSLContextImpl, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        synchronized (cl_112.class) {
            try {
                int sessionsAmount = sSLContextImpl.c.getSessionsAmount();
                Random random = new Random();
                z2 = true;
                if (!z && random.nextInt(sessionsAmount + 1) != 0) {
                    z3 = false;
                    ServerLicense serverLicense = new ServerLicense();
                    if (!z3) {
                        try {
                            serverLicense.check(sSLContextImpl);
                        } catch (LicenseException e) {
                            SSLLogger.fatal("Java TLS license check failed: " + e.getMessage(), (Throwable) e);
                            z2 = false;
                            return z2;
                        }
                    }
                }
                z3 = true;
                ServerLicense serverLicense2 = new ServerLicense();
                if (!z3) {
                }
            } finally {
            }
        }
        return z2;
    }
}
