package com.google.android.gms.internal.wearable;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzr {
    public static File zza(ParcelFileDescriptor parcelFileDescriptor, File file) throws IOException {
        FileOutputStream fileOutputStream;
        IOException e;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            file.mkdirs();
            File createTempFile = File.createTempFile("asset", ".tmp", file);
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    try {
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = autoCloseInputStream.read(bArr);
                            if (read < 0) {
                                zzb(autoCloseInputStream);
                                zzb(fileOutputStream);
                                return createTempFile;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    FileOutputStream fileOutputStream3 = fileOutputStream;
                    th = th;
                    fileOutputStream2 = fileOutputStream3;
                    zzb(autoCloseInputStream);
                    zzb(fileOutputStream2);
                    createTempFile.delete();
                    throw th;
                }
            } catch (IOException e3) {
                fileOutputStream = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                zzb(autoCloseInputStream);
                zzb(fileOutputStream2);
                createTempFile.delete();
                throw th;
            }
        } finally {
            zzb(autoCloseInputStream);
        }
    }

    private static void zzb(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
