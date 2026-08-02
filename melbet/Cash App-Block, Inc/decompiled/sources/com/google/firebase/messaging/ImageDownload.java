package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.ByteStreams;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class ImageDownload implements Closeable {
    public volatile Future future;
    public zzw task;
    public final URL url;

    public ImageDownload(URL url) {
        this.url = url;
    }

    public final Bitmap blockingDownload() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.url;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            a$$ExternalSyntheticBUOutline0.m$4("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] byteArray = ByteStreams.toByteArray(new ByteStreams.LimitedInputStream(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + byteArray.length + " bytes from " + url);
            }
            if (byteArray.length > 1048576) {
                a$$ExternalSyntheticBUOutline0.m$4("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            if (decodeByteArray == null) {
                a$$ExternalSyntheticBUOutline0.m$3(url, "Failed to decode image: ");
                return null;
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
        this.future.cancel(true);
    }
}
