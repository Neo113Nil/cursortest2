package l4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.internal.ads.C3624n5;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class m implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final URL f38935n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Future f38936u;

    /* renamed from: v, reason: collision with root package name */
    public l3.m f38937v;

    public m(URL url) {
        this.f38935n = url;
    }

    public final Bitmap b() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f38935n;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] m9 = com.bumptech.glide.e.m(new C3624n5(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + m9.length + " bytes from " + url);
            }
            if (m9.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m9, 0, m9.length);
            if (decodeByteArray == null) {
                throw new IOException("Failed to decode image: " + url);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return decodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38936u.cancel(true);
    }
}
