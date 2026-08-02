package D1;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.C2964aq;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: D1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297b implements u1.k {

    /* renamed from: u, reason: collision with root package name */
    public static final u1.g f533u = u1.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: v, reason: collision with root package name */
    public static final u1.g f534v = new u1.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, u1.g.f41006e);

    /* renamed from: n, reason: collision with root package name */
    public final C2964aq f535n;

    public C0297b(C2964aq c2964aq) {
        this.f535n = c2964aq;
    }

    @Override // u1.k
    public final int b(u1.h hVar) {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // u1.InterfaceC5063b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj, File file, u1.h hVar) {
        boolean z6;
        Bitmap bitmap = (Bitmap) ((w1.w) obj).get();
        u1.g gVar = f534v;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(gVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = P1.j.f2365b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) hVar.c(f533u)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C2964aq c2964aq = this.f535n;
                if (c2964aq != null) {
                    try {
                        outputStream = new com.bumptech.glide.load.data.b(fileOutputStream, c2964aq);
                    } catch (IOException e9) {
                        e = e9;
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
                        z6 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z6;
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
                z6 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + P1.p.c(bitmap) + " in " + P1.j.a(elapsedRealtimeNanos) + ", options format: " + hVar.c(gVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z6;
    }
}
