package com.anythink.core.common.v;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class w {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (d(r6) <= 31457280) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File a(Context context) {
        File file;
        File externalFilesDir;
        File file2 = null;
        try {
            externalFilesDir = context.getExternalFilesDir(null);
        } catch (Throwable unused) {
        }
        if (externalFilesDir != null) {
            file = b(externalFilesDir);
            if (file != null) {
                return file;
            }
            if (file == null && b(context)) {
                file = b(new File(Environment.getExternalStorageDirectory().getPath() + File.separator + context.getPackageName()));
            }
            file2 = file;
            return file2 != null ? new File(context.getFilesDir().getAbsoluteFile().getAbsolutePath()) : file2;
        }
        file = null;
        if (file == null) {
            file = b(new File(Environment.getExternalStorageDirectory().getPath() + File.separator + context.getPackageName()));
        }
        file2 = file;
        if (file2 != null) {
        }
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    private static boolean c(Context context) {
        return d(context) > 31457280;
    }

    private static long d(File file) {
        File[] listFiles = file.listFiles();
        long j6 = 0;
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                j6 += listFiles[i].isDirectory() ? d(listFiles[i]) : c(listFiles[i]);
            }
        }
        return j6;
    }

    private static long c(File file) {
        long j6 = 0;
        FileInputStream fileInputStream = null;
        try {
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        j6 = fileInputStream2.available();
                        fileInputStream = fileInputStream2;
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return j6;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } else {
                    file.createNewFile();
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return j6;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long d(Context context) {
        if ("mounted".equals(Environment.getExternalStorageState()) && b(context)) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Error unused) {
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return 0L;
    }

    private static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    private static boolean a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        try {
            if (file.isDirectory()) {
                return d(file);
            }
            return c(file);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static String b(String str) {
        return o.a(str);
    }

    public static boolean a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e9) {
            e = e9;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e10) {
                e10.printStackTrace();
                return true;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException e12) {
                e12.printStackTrace();
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        StringBuffer stringBuffer;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                try {
                    stringBuffer = new StringBuffer();
                } catch (IOException e9) {
                    e = e9;
                    stringBuffer = null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            stringBuffer = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                }
            } catch (IOException e11) {
                e = e11;
                e.printStackTrace();
            }
            try {
                break;
            } catch (IOException unused2) {
            }
        }
        bufferedReader.close();
        if (stringBuffer != null) {
            return stringBuffer.toString();
        }
        return null;
    }
}
