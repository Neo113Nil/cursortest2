package ru.cprocsp.NGate.tools.log;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import ru.cprocsp.NGate.tools.GlobalSettingsDispatcher;

/* loaded from: classes4.dex */
public class Logger {
    private static Logger INSTANCE;
    private final String TAG;

    private Logger(String str) {
        this.TAG = str;
    }

    public static synchronized void d(String str) {
        synchronized (Logger.class) {
            if (str != null) {
                try {
                    if (GlobalSettingsDispatcher.isInitiated()) {
                        GlobalSettingsDispatcher.getTag();
                        GlobalSettingsDispatcher.appendLog(str, false);
                    } else if (isInitiated()) {
                        String str2 = INSTANCE.TAG;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static synchronized void e(String str, Throwable th) {
        synchronized (Logger.class) {
            if (str != null) {
                try {
                    if (th != null) {
                        if (GlobalSettingsDispatcher.isInitiated()) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            th.printStackTrace(new PrintStream(byteArrayOutputStream));
                            Log.e(GlobalSettingsDispatcher.getTag(), str, th);
                            GlobalSettingsDispatcher.appendLog(str, true);
                            GlobalSettingsDispatcher.appendLog(byteArrayOutputStream.toString(), true);
                        } else {
                            Log.e(isInitiated() ? INSTANCE.TAG : "NGate", str, th);
                        }
                    } else if (GlobalSettingsDispatcher.isInitiated()) {
                        Log.e(GlobalSettingsDispatcher.getTag(), str);
                        GlobalSettingsDispatcher.appendLog(str, true);
                    } else {
                        Log.e(isInitiated() ? INSTANCE.TAG : "NGate", str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static synchronized void init(String str) {
        synchronized (Logger.class) {
            if (INSTANCE == null) {
                INSTANCE = new Logger(str);
            }
        }
    }

    public static synchronized boolean isInitiated() {
        boolean z;
        synchronized (Logger.class) {
            z = INSTANCE != null;
        }
        return z;
    }

    public static synchronized void p(String str) {
        synchronized (Logger.class) {
            if (str != null) {
                if (isInitiated()) {
                    String str2 = INSTANCE.TAG;
                }
            }
        }
    }

    public static synchronized void e(String str) {
        synchronized (Logger.class) {
            e(str, null);
        }
    }
}
