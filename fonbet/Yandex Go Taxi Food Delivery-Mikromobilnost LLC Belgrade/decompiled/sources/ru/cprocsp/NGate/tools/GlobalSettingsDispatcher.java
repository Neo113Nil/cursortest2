package ru.cprocsp.NGate.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.unr0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.VMInspector.Depends;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.cprocsp.ACSP.tools.common.RawResource;
import ru.cprocsp.NGate.tools.log.Logger;

/* loaded from: classes4.dex */
public class GlobalSettingsDispatcher implements Constants {
    private static GlobalSettingsDispatcher INSTANCE = null;
    private static final int LOG_DATE_TIMEOUT = 15;
    private static final int LOG_LIMIT = 1024;
    private final String appPath;
    private final String tag;
    private final List<String> logBuffer = new ArrayList(100);
    private int recordNumber = 0;
    private long lastRecordTime = 0;
    private int day = 0;

    private GlobalSettingsDispatcher(Context context, String str) {
        this.appPath = context.getApplicationInfo().dataDir;
        this.tag = str;
    }

    public static synchronized void appendLog(String str, boolean z) {
        synchronized (GlobalSettingsDispatcher.class) {
            if (isInitiated()) {
                INSTANCE.internalAppendLog(str, true);
            }
        }
    }

    private synchronized void clear() {
        this.logBuffer.clear();
        this.recordNumber = 0;
        this.lastRecordTime = 0L;
    }

    public static synchronized void clearLog() {
        synchronized (GlobalSettingsDispatcher.class) {
            if (isInitiated()) {
                INSTANCE.clear();
            }
        }
    }

    public static void copyFromResources(Context context, int i, String str) {
        String str2 = context.getApplicationInfo().dataDir;
        if (new File(str2, str).exists()) {
            return;
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            try {
                RawResource.writeStreamToFile(openRawResource, str2, str);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } finally {
            }
        } catch (Exception e) {
            Log.e("NGate", e.getMessage(), e);
        }
    }

    public static synchronized boolean exportLog(Uri uri, ContentResolver contentResolver) {
        synchronized (GlobalSettingsDispatcher.class) {
            if (isInitiated()) {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "w");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
                        try {
                            Iterator<String> it = INSTANCE.logBuffer.iterator();
                            while (it.hasNext()) {
                                byte[] bytes = it.next().getBytes();
                                fileOutputStream.write(bytes, 0, bytes.length);
                            }
                            fileOutputStream.close();
                            openFileDescriptor.close();
                            return true;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.e("NGate", e.getMessage(), e);
                }
            }
            return false;
        }
    }

    public static String generateLogFileName(String str) {
        return unr0.o(str, "_Log_", String.format(new SimpleDateFormat("yyyyMMdd-HHmmss").format(Long.valueOf(System.currentTimeMillis())), new Object[0]), Depends.TEXT_EXT);
    }

    public static synchronized String getAppPath() {
        synchronized (GlobalSettingsDispatcher.class) {
            if (isInitiated()) {
                return INSTANCE.appPath;
            }
            Logger.e("Settings have not been loaded.");
            return null;
        }
    }

    public static synchronized String getLog() {
        synchronized (GlobalSettingsDispatcher.class) {
            try {
                if (!isInitiated()) {
                    return null;
                }
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<String> it = INSTANCE.logBuffer.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(it.next());
                }
                return stringBuffer.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized String getTag() {
        synchronized (GlobalSettingsDispatcher.class) {
            if (isInitiated()) {
                return INSTANCE.tag;
            }
            Logger.e("Settings have not been loaded.");
            return "NGate";
        }
    }

    public static synchronized void init(Context context, String str) {
        synchronized (GlobalSettingsDispatcher.class) {
            if (INSTANCE == null) {
                INSTANCE = new GlobalSettingsDispatcher(context, str);
                Logger.init(str);
            }
        }
    }

    private synchronized void internalAppendLog(String str, boolean z) {
        String str2;
        try {
            if (this.logBuffer.size() >= 1024) {
                this.logBuffer.remove(0);
            }
            Date date = new Date();
            long time = date.getTime();
            if (time - this.lastRecordTime <= 15000 && !z) {
                str2 = str + "\n";
                this.recordNumber++;
                this.logBuffer.add(str2);
            }
            int date2 = date.getDate();
            String str3 = "";
            int i = this.day;
            if (i == 0 || date2 != i) {
                this.day = date2;
                str3 = ACSPConstants.DATE_FORMAT_CERT_ITEM.format(date) + "\n";
            }
            String str4 = str3 + ACSPConstants.TIME_FORMAT.format(date);
            this.lastRecordTime = time;
            str2 = str4 + " " + str + "\n";
            this.recordNumber++;
            this.logBuffer.add(str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized boolean isInitiated() {
        boolean z;
        synchronized (GlobalSettingsDispatcher.class) {
            z = INSTANCE != null;
        }
        return z;
    }
}
