package ru.cprocsp.ACSP.tools.common;

import android.content.Context;
import android.util.Log;
import defpackage.oyr;
import defpackage.qv10;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class RawResource implements LogConstants {
    private final Context applicationContext;
    private final String dstBasePath;
    private final String dstResourceDirectory;

    public RawResource(Context context, String str, String str2) {
        this.applicationContext = context;
        this.dstBasePath = oyr.t(qv10.t(Infrastructure.getApplicationPath(context)), File.separator, str);
        this.dstResourceDirectory = str2;
    }

    private boolean prepare() {
        File file = new File(this.dstBasePath);
        if (!file.exists()) {
            file.getAbsolutePath();
        }
        File file2 = new File(file.getAbsolutePath() + File.separator + this.dstResourceDirectory);
        if (file2.exists()) {
            return true;
        }
        if (file2.mkdirs()) {
            file2.getAbsolutePath();
            return true;
        }
        file2.getAbsolutePath();
        return false;
    }

    public static boolean writeStreamToFile(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            if (inputStream == null) {
                throw new Exception("Input stream is null.");
            }
            file.getAbsolutePath();
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
                fileOutputStream.close();
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
                return true;
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
                try {
                    inputStream.close();
                    return false;
                } catch (Exception unused4) {
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused5) {
                    }
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (Exception unused6) {
                    throw th;
                }
            }
        } catch (Exception e3) {
            Log.e(LogConstants.APP_LOGGER_TAG, e3.getMessage(), e3);
            return false;
        }
    }

    public boolean copy(int i, String str, boolean z) {
        if (!prepare()) {
            return false;
        }
        File file = new File(this.dstBasePath + File.separator + this.dstResourceDirectory);
        if (!Infrastructure.exists(file, str) || z) {
            file.getAbsolutePath();
            return writeStreamToFile(this.applicationContext.getResources().openRawResource(i), file.getAbsolutePath(), str);
        }
        file.getAbsolutePath();
        return true;
    }

    public static boolean writeStreamToFile(InputStream inputStream, String str, String str2) {
        return writeStreamToFile(inputStream, new File(str, str2));
    }

    public static boolean writeStreamToFile(File file, String str, String str2) {
        try {
            return writeStreamToFile(new FileInputStream(file), str, str2);
        } catch (Exception e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return false;
        }
    }
}
