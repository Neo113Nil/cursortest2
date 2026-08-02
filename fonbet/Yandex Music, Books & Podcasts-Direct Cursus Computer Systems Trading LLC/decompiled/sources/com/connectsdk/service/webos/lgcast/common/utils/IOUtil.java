package com.connectsdk.service.webos.lgcast.common.utils;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.kac;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class IOUtil {
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static long copy(String str, String str2) throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (str == null || str2 == null) {
                throw new IOException("Invalid file");
            }
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
            } catch (IOException e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
            try {
                long copy = copy(fileInputStream2, fileOutputStream);
                close(fileInputStream2);
                close(fileOutputStream);
                return copy;
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    close(fileInputStream);
                    close(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                close(fileInputStream);
                close(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            if (inputStream == null) {
                throw new IOException();
            }
            if (bArr != null) {
                return inputStream.read(bArr, i, i2);
            }
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static byte[] readData(InputStream inputStream, long j) throws IOException {
        if (inputStream == null || j < 0) {
            kac.f("Invalid arguments");
            return null;
        }
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 0;
        while (j2 < j) {
            long read = inputStream.read(bArr, 0, (int) Math.min(j - j2, 4096));
            if (read <= 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, (int) read);
            j2 += read;
        }
        return byteArrayOutputStream.size() > 0 ? byteArrayOutputStream.toByteArray() : new byte[0];
    }

    public static String readLine2(InputStream inputStream) throws Exception {
        if (inputStream == null) {
            throw new Exception("Invalid arguments");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1];
        while (inputStream.read(bArr) > 0) {
            byte b = bArr[0];
            if (b != 13) {
                if (b == 10) {
                    break;
                }
                byteArrayOutputStream.write(b);
            }
        }
        if (byteArrayOutputStream.size() > 0) {
            return byteArrayOutputStream.toString();
        }
        return null;
    }

    public static String readRawResourceText(Context context, int i) {
        InputStream inputStream;
        byte[] bArr;
        InputStream inputStream2 = null;
        try {
            bArr = new byte[128];
            inputStream = context != null ? context.getResources().openRawResource(i) : null;
        } catch (Exception unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (inputStream == null) {
                throw new Exception("Invalid resource");
            }
            int read = inputStream.read(bArr, 0, 128);
            String str = read > 0 ? new String(bArr, 0, read) : null;
            String trim = str != null ? str.trim() : null;
            try {
                inputStream.close();
            } catch (Exception unused2) {
            }
            return trim;
        } catch (Exception unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            inputStream2 = inputStream;
            th = th2;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    public static String readString(InputStream inputStream, long j) throws IOException {
        if (inputStream == null || j < 0) {
            kac.f("Invalid arguments");
            return null;
        }
        byte[] readData = readData(inputStream, j);
        if (readData != null) {
            return new String(readData);
        }
        return null;
    }

    public static void writeData(OutputStream outputStream, byte[] bArr) throws IOException {
        if (outputStream == null) {
            kac.f("Invalid stream");
        } else if (bArr != null && bArr.length > 0) {
            outputStream.write(bArr, 0, bArr.length);
            outputStream.flush();
        }
    }

    public static void writeString(OutputStream outputStream, String str) throws IOException {
        writeData(outputStream, str != null ? str.getBytes() : null);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copy(inputStream, outputStream, 2147483647L);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        if (inputStream != null && outputStream != null) {
            byte[] bArr = new byte[RemoteCameraConfig.Notification.ID];
            long j2 = 0;
            do {
                int read = inputStream.read(bArr, 0, (int) Math.min(RemoteCameraConfig.Notification.ID, j));
                if (read <= 0) {
                    return j2;
                }
                outputStream.write(bArr, 0, read);
                long j3 = read;
                j -= j3;
                j2 += j3;
            } while (j > 0);
            return j2;
        }
        kac.f("Invalid stream");
        return 0L;
    }
}
