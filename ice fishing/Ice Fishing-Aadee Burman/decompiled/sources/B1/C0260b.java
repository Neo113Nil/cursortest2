package B1;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.C2941aq;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: B1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260b implements s1.k {

    /* renamed from: u, reason: collision with root package name */
    public static final s1.g f119u = s1.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: v, reason: collision with root package name */
    public static final s1.g f120v = new s1.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, s1.g.f40449e);

    /* renamed from: n, reason: collision with root package name */
    public final C2941aq f121n;

    public C0260b(C2941aq c2941aq) {
        this.f121n = c2941aq;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // s1.InterfaceC4967b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Object obj, File file, s1.h hVar) {
        boolean z3;
        Bitmap bitmap = (Bitmap) ((u1.x) obj).get();
        s1.g gVar = f120v;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(gVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = N1.j.f1921b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) hVar.c(f119u)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C2941aq c2941aq = this.f121n;
                if (c2941aq != null) {
                    try {
                        outputStream = new com.bumptech.glide.load.data.b(fileOutputStream, c2941aq);
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
                        z3 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z3;
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
                z3 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + N1.p.c(bitmap) + " in " + N1.j.a(elapsedRealtimeNanos) + ", options format: " + hVar.c(gVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z3;
    }

    @Override // s1.k
    public final int p(s1.h hVar) {
        return 2;
    }
}
