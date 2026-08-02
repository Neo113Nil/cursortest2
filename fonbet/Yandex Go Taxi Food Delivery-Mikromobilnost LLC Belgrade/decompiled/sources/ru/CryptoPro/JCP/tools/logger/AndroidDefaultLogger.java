package ru.CryptoPro.JCP.tools.logger;

import android.util.Log;

/* loaded from: classes4.dex */
public class AndroidDefaultLogger extends AndroidExternalLogger {
    @Override // ru.CryptoPro.JCP.tools.logger.AndroidExternalLogger, ru.CryptoPro.JCP.tools.logger.AndroidLoggingInterface
    public String getName() {
        return "default";
    }

    @Override // ru.CryptoPro.JCP.tools.logger.AndroidExternalLogger, ru.CryptoPro.JCP.tools.logger.AndroidLoggingInterface
    public void onError(String str, String str2, Throwable th) {
        if (th != null) {
            Log.e(str, str2, th);
        } else {
            Log.e(str, str2);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.AndroidExternalLogger, ru.CryptoPro.JCP.tools.logger.AndroidLoggingInterface
    public void onInfo(String str, String str2, Throwable th) {
        if (th != null) {
            Log.i(str, str2, th);
        } else {
            Log.i(str, str2);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.AndroidExternalLogger, ru.CryptoPro.JCP.tools.logger.AndroidLoggingInterface
    public void onVerbose(String str, String str2) {
    }

    @Override // ru.CryptoPro.JCP.tools.logger.AndroidExternalLogger, ru.CryptoPro.JCP.tools.logger.AndroidLoggingInterface
    public void onWarning(String str, String str2, Throwable th) {
    }
}
