package ru.CryptoPro.JCP.tools.logger;

import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class JCPLoggerInternal implements InternalLoggerInterface {
    public static final DefaultLoggerInterface a = LoggingFactory.createLogger(JCPLogger.LOGGER_NAME, "JCP");

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void fatal(String str) {
        a.fatal(str);
    }

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void fine(String str) {
        a.fine(str);
    }

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void ignoredException(Throwable th) {
        a.ignoredException(th);
    }

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void warning(String str) {
        a.warning(str);
    }

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void fatal(String str, Throwable th) {
        a.fatal(str, th);
    }

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void warning(String str, Throwable th) {
        a.warning(str, th);
    }

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void fatal(Throwable th) {
        a.fatal(th);
    }

    @Override // ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface
    public void warning(Throwable th) {
        a.warning(th);
    }
}
