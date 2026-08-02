package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class a33 implements r2o {
    public static final cvj b = cvj.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final cvj c = new cvj("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, cvj.e);
    public final z98 a;

    public a33(z98 z98Var) {
        this.a = z98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @Override // defpackage.m6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(Object obj, File file, pwj pwjVar) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((k2o) obj).get();
        cvj cvjVar = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) pwjVar.c(cvjVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = esg.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) pwjVar.c(b)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                z98 z98Var = this.a;
                if (z98Var != null) {
                    try {
                        outputStream = new fj3(fileOutputStream, z98Var);
                    } catch (IOException e) {
                        e = e;
                        outputStream = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    outputStream = fileOutputStream;
                }
                bitmap.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                }
                z = true;
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + xut.c(bitmap) + " in " + esg.a(elapsedRealtimeNanos) + ", options format: " + pwjVar.c(cvjVar) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.r2o
    public final int w(pwj pwjVar) {
        return 2;
    }
}
